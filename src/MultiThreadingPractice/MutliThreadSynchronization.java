package MultiThreadingPractice;

public class MutliThreadSynchronization implements Runnable {
	int val = 0;

	public static void main(String[] args) {
		MutliThreadSynchronization obj1 = new MutliThreadSynchronization();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);// Both the threads are trying to access the same object/resource
		
		System.out.println(t1.isAlive());// To find if a thread is  dead or alive
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		t1.setName("My Thread 1");// Setting a name for Thread by deafult it will be of the form Thread-0, Thread-1. etc
		t2.setName("My Thread 2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		System.out.println(obj1.val);
		
		
	}
/*
 * We are trying to change the same value with two different threads.
 */
	@Override
	public synchronized void run() {
		for(int i=1;i<=10000;i++) {
			val++;
		}
	}
}
