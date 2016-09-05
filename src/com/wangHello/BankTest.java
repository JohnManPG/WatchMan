package com.wangHello;

public class BankTest implements Runnable {
	private AtomicBank bank;//为这个类定义一个字段，共享这个单一变量
	public BankTest(AtomicBank bank){
		this.bank=bank;
	}
	@Override
	public void run() {
		while(true){
		this.bank.getMoney(1);
		}
		
	}	
	public static void main(String[] args) {
		AtomicBank bank = new AtomicBank(100);
		
		BankTest test1 = new BankTest(bank);
		BankTest test2 = new BankTest(bank);//传进来共享变量
		BankTest test3 = new BankTest(bank);
		BankTest test4 = new BankTest(bank);
		new Thread(test1).start();				
		new Thread(test2).start();				
		new Thread(test3).start();				
		new Thread(test4).start();				
	}
}
