package com.thread;

import java.util.concurrent.TimeUnit;

public class Ex {
	
	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name+": "+message);
	}

	private static Object lock = new Object();
	
	public static class HomeWork{
		
		private int terms;
		private static int ctr = 0;
		
		public HomeWork(int terms) {
			this.terms = terms;
		}
		
		public void printEvenSequence() throws InterruptedException {
			synchronized (lock) {
				for (int i = 0; i <= terms; i += 2) {
					producer(i);
					//TimeUnit.SECONDS.sleep(5);
				}
			}
		}
		
		public void printOddSequence() throws InterruptedException {
			synchronized (lock) {
				for (int i = 1; i <= terms; i += 2) {
					consumer(i);
					//TimeUnit.SECONDS.sleep(1);
				}
			}
		}	
		
		public static void producer(int i) throws InterruptedException {
			
			while(ctr != 0) {
				lock.wait();
			}
			ctr++;
			printMessage(String.valueOf(i));
			lock.notify();
			
		}
		
		public static void consumer(int i) throws InterruptedException {
			
			while (ctr == 0) {
				lock.wait();
			}
			ctr--;
			printMessage(String.valueOf(i));
			lock.notify();
		}
	}

	public static void main(String[] args) {
		
		HomeWork homeWork = new HomeWork(20);
		
		Runnable even = ()->{
				try {
					homeWork.printEvenSequence();
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
		};
		
		Runnable odd = ()->{
				try {
					homeWork.printOddSequence();
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
		};
		
		Thread tEven = new Thread(even, "Even");
		Thread tOdd = new Thread(odd, "Odd");
		tEven.start();
		tOdd.start();
		
	}

}
	
