package com.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOClient {
	private static int  flag=1;
	private static int blockSize = 4096;
	private static ByteBuffer sendbuffer = ByteBuffer.allocate(blockSize);//ByteBuffer没有构造函数，直接使用静态的方法allocate()创建一个指定大小的缓冲实例
    private static ByteBuffer receivebuffer = ByteBuffer.allocate(blockSize);
    private final static InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 7080);
    
    
    
	public static void main(String[] args) throws IOException {
	     SocketChannel socketChannel = SocketChannel.open();
	     socketChannel.configureBlocking(false);
	     Selector selector=Selector.open();//打开选择器
	     socketChannel.register(selector, SelectionKey.OP_CONNECT);
	     socketChannel.connect(serverAddress);
	     Set<SelectionKey> selectionKeys;
	     Iterator<SelectionKey> iterator;
	     SelectionKey selectionKey;
         SocketChannel client;
         String receiveText;
         String sendText;
         int count=0;
         
         while(true){
        	 selectionKeys=selector.selectedKeys();
        	 iterator=selectionKeys.iterator();
        	 while(iterator.hasNext()){
        		 selectionKey=iterator.next();
        		 if(selectionKey.isConnectable()){
        			 System.out.println("client connet");
        			client= (SocketChannel) selectionKey.channel();
        		     if(client.isConnectionPending()){
        		    	 client.finishConnect();
        		    	 System.out.println("客户端完成连接操作");
        		         sendbuffer.clear();
        		         sendbuffer.put("Hello Server".getBytes());
        		         sendbuffer.flip();
        		         client.write(sendbuffer);        		      
        		     }
        		     client.register(selector, SelectionKey.OP_READ);
        		 }if(selectionKey.isReadable()){
        			client= (SocketChannel) selectionKey.channel();
        		    receivebuffer.clear();
        		    count=client.read(receivebuffer);
        		    if(count>0){
        		    	receiveText = new String(receivebuffer.array(),0,count);
        		    	System.out.println("客户端接收到服务端的数据："+receiveText);
        		    	client.register(selector, SelectionKey.OP_WRITE);
        		    	
        		    }
        		 }
        		 if(selectionKey.isWritable()){
        			sendbuffer.clear();
        			client =(SocketChannel) selectionKey.channel();
        		    sendText="Msg send to Server->"+flag++;
        		    sendbuffer.put(sendText.getBytes());
        		    sendbuffer.flip();
        		    client.write(sendbuffer);
        		    System.out.println("客户端发送数据给服务端："+sendText);
        		    client.register(selector, SelectionKey.OP_READ);
        		 }
        	 }
        	 selectionKeys.clear();
         }
	}
}
