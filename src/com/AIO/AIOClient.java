package com.AIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AIOClient {
	private AsynchronousSocketChannel client = null;
	public AIOClient(String host,int port) throws IOException, InterruptedException, ExecutionException{
		client= AsynchronousSocketChannel.open();
	    Future<?> future=client.connect(new InetSocketAddress(host,port));
	    System.out.println(future.get());
	}
     
	public void write(byte b){
		ByteBuffer bytebuffer = ByteBuffer.allocate(32);
		bytebuffer.put(b);
		bytebuffer.flip();
		client.write(bytebuffer);
	}
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		AIOClient client = new AIOClient("localhost",7080);
          client.write((byte)29);
	}

}
