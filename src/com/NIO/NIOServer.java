package com.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {
	private int  flag=1;
	private int blockSize = 4096;
	private ByteBuffer sendbuffer = ByteBuffer.allocate(blockSize);//ByteBuffer没有构造函数，直接使用静态的方法allocate()创建一个指定大小的缓冲实例
    private ByteBuffer receivebuffer = ByteBuffer.allocate(blockSize);
    private Selector selector;
    
    public NIOServer(int port) throws IOException{
    	ServerSocketChannel  serverSocketChannel = ServerSocketChannel.open();
    	serverSocketChannel.configureBlocking(false);//非阻塞模式
       	ServerSocket serverSocket=serverSocketChannel.socket();
       	serverSocket.bind(new InetSocketAddress(port));
        selector=Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("Server start->"+port);
    
    }
    //监听
    public void listen() throws IOException{
    	while(true){
    		selector.select();
    		Set<SelectionKey> selectionKeys=selector.selectedKeys();  //返回一个set集合，集合里放的是selectorKeys
    		Iterator<SelectionKey> it=selectionKeys.iterator();
    	    while(it.hasNext()){
    	    SelectionKey selectionKey=it.next();
    	    it.remove();
    	    //逻辑
    	    handleKey(selectionKey);
    	    }
    	}
    }
    
    public void handleKey(SelectionKey selectionKey) throws IOException{
    	ServerSocketChannel server = null;
    	SocketChannel client =null;
    	String receiveText;
    	String sendText;
    	int count=0;
    	if(selectionKey.isAcceptable()){
    		server = (ServerSocketChannel) selectionKey.channel();//获得服务器的通道
    	    client=server.accept();
    	    client.configureBlocking(false);
    	    client.register(selector, selectionKey.OP_READ);
    	    }else if(selectionKey.isReadable()){
    	    	client=(SocketChannel) selectionKey.channel();
    	        count = client.read(receivebuffer);
    	        if(count>0){
    	        	receiveText = new String(receivebuffer.array(),0,count);
    	        	//接收到客户端的数据
    	        	System.out.println("服务端接收到客户端的信息："+receiveText);
    	        	client.register(selector, selectionKey.OP_WRITE);
    	        	
    	        }
    	    }else if(selectionKey.isWritable()){
    	       sendbuffer.clear();
    	       client=(SocketChannel) selectionKey.channel();
    	       sendText="msg send to client"+flag++;//发送的数据
    	       sendbuffer.put(sendText.getBytes());
    	       sendbuffer.flip();
    	       
    	       client.write(sendbuffer);
    	       System.out.println("服务端发送数据给客户端："+sendText);
    	    }
    }//读的事件  写的事件  监听的事件
	                 
    public static void main(String[] args) throws IOException {
		int port = 7080;
		NIOServer server=new NIOServer(port);
		server.listen();

	}

}
