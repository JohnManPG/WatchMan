package com.AIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;

public class AIOServer {
	
	public AIOServer(int port) throws IOException{
		final AsynchronousServerSocketChannel listen =AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(port));
	    listen.accept(null,new CompletionHandler<AsynchronousSocketChannel, Void >() {

			@Override
			public void completed(AsynchronousSocketChannel ch,Void vi) {
			  listen.accept(null,this);//接收下一个连接
			  try {
				handle(ch);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
				
			}

			@Override
			public void failed(Throwable exc,Void vi) {
				System.out.println("异步IO失败");
				
			}
		});
	}
	//真正逻辑
	public void handle(AsynchronousSocketChannel ch) throws Exception{
		 ByteBuffer bytebuffer=ByteBuffer.allocate(32);
		 ch.read(bytebuffer).get();
		 bytebuffer.flip();
		 System.out.println("服务端接收："+bytebuffer.get());
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		int port = 7080;
		AIOServer server =new AIOServer(port);
		System.out.println("监听端口："+port);
		Thread.sleep(1000000);

	}

}
