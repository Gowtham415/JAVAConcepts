package MultiThreadingPractice;

import java.lang.Thread.State;

public class Demo1 {

	public static void main(String[] args) {		
		for(int i=0;i<10;i++) {
			Thread t1 = new Thread(new Thread1());
			Thread t2 = new Thread(new Thread2());
			
			t1.start();
			t2.start();
		}
	}

}

class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 1 is running");	
	}	
}

class Thread2 extends Thread{
	
	public void run() {
		System.out.println("Thread 2 is running");
	}
	
}
