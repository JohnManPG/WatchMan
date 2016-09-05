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
	private ByteBuffer sendbuffer = ByteBuffer.allocate(blockSize);//ByteBufferû�й��캯����ֱ��ʹ�þ�̬�ķ���allocate()����һ��ָ����С�Ļ���ʵ��
    private ByteBuffer receivebuffer = ByteBuffer.allocate(blockSize);
    private Selector selector;
    
    public NIOServer(int port) throws IOException{
    	ServerSocketChannel  serverSocketChannel = ServerSocketChannel.open();
    	serverSocketChannel.configureBlocking(false);//������ģʽ
       	ServerSocket serverSocket=serverSocketChannel.socket();
       	serverSocket.bind(new InetSocketAddress(port));
        selector=Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("Server start->"+port);
    
    }
    //����
    public void listen() throws IOException{
    	while(true){
    		selector.select();
    		Set<SelectionKey> selectionKeys=selector.selectedKeys();  //����һ��set���ϣ�������ŵ���selectorKeys
    		Iterator<SelectionKey> it=selectionKeys.iterator();
    	    while(it.hasNext()){
    	    SelectionKey selectionKey=it.next();
    	    it.remove();
    	    //�߼�
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
    		server = (ServerSocketChannel) selectionKey.channel();//��÷�������ͨ��
    	    client=server.accept();
    	    client.configureBlocking(false);
    	    client.register(selector, selectionKey.OP_READ);
    	    }else if(selectionKey.isReadable()){
    	    	client=(SocketChannel) selectionKey.channel();
    	        count = client.read(receivebuffer);
    	        if(count>0){
    	        	receiveText = new String(receivebuffer.array(),0,count);
    	        	//���յ��ͻ��˵�����
    	        	System.out.println("����˽��յ��ͻ��˵���Ϣ��"+receiveText);
    	        	client.register(selector, selectionKey.OP_WRITE);
    	        	
    	        }
    	    }else if(selectionKey.isWritable()){
    	       sendbuffer.clear();
    	       client=(SocketChannel) selectionKey.channel();
    	       sendText="msg send to client"+flag++;//���͵�����
    	       sendbuffer.put(sendText.getBytes());
    	       sendbuffer.flip();
    	       
    	       client.write(sendbuffer);
    	       System.out.println("����˷������ݸ��ͻ��ˣ�"+sendText);
    	    }
    }//�����¼�  д���¼�  �������¼�
	                 
    public static void main(String[] args) throws IOException {
		int port = 7080;
		NIOServer server=new NIOServer(port);
		server.listen();

	}

}
