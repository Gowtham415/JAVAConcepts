package MultiThreadingPractice;

public class MultiThreadJoin implements Runnable {
	String name;

	public MultiThreadJoin(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " : " + i);
		}

	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new MultiThreadDemo2("Thread1"));
		Thread t2 = new Thread(new MultiThreadDemo2("Thread2"));
		t1.start();

		/*
		 * Join method make sures that the current thread execution is stopped and
		 * specified Thread is executed first and only after completion of this thread
		 * other threads will be executed.
		 */
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main: " + i);
		}
	}
}
