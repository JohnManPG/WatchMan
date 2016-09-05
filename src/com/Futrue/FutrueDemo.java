package com.Futrue;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutrueDemo {

	public static void main(String[] args) {
		/*Executor:执行已提交的 Runnable 任务的对象,是ExecutorService等的超级接口，只要一个execute()方法*/
		ExecutorService service = Executors.newCachedThreadPool();//创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们,简单来说就是创建线程池
		
		FutureTask<String> task = new FutureTask<String>(new Callable<String>() {   //task对象通过get()方法来获取结果
       //仅在计算完成时才能获取结果；如果计算尚未完成，则阻塞 get 方法。一旦计算完成，就不能再重新开始或取消计算。
			@Override
			public String call() throws Exception {
				
				return Thread.currentThread().getName();       //call()方法和我们线程的run()方法比较类似
			}   
			
			//线程中的run()方法返回的类型是void的，就是返回，call()方法是要返回具体的值的
			
		});
                  service.execute(task);               //此时的task就是一个线程，启动该线程就执行call()方法
                  try {                               //返回和拿到是不一样的
					String res=task.get();
					System.out.println("res="+res);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
                  service.shutdown();
	}
}
