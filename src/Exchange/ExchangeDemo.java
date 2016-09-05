package Exchange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangeDemo {
	static Exchanger<List<String>>  exchanger = new Exchanger<List<String>>();
	static class Product extends Thread{
		 private Exchanger<List<String>> exchangr;
		 public Product (Exchanger<List<String>> exchangr){
			 this.exchangr=exchangr;
		 }
		 public void run(){
			 List<String> product = new ArrayList<String>();
			 for(int i =0;i<10;i++){
             product.add("product->"+i);
             
		 }
			 try{
			List<String> reset= exchangr.exchange(product);
			for(int j=0;j<reset.size();j++){
				System.out.println("收到的金钱："+reset.get(j));
			}
			}catch(Exception e){
				e.printStackTrace();
				}
			}
			
		}
	static class Custom extends Thread{
		private Exchanger<List<String>> exchanger;
		public Custom (Exchanger<List<String>> exchanger){
			this.exchanger=exchanger;
		}
		public void run(){
			List<String> custom =new ArrayList<String>();
			for(int i=0;i<5;i++){
				custom.add("custom"+i);
			}
			try {
				exchanger.exchange(custom);
				for(int j=0;j<custom.size();j++){
					System.out.println("获得物品->"+custom.get(j));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	public static void main(String[] args) {
		new Product(exchanger).start();
		new Custom(exchanger).start();
	}
}
