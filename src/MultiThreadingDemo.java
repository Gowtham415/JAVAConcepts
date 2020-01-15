
public class MultiThreadingDemo extends Thread{

	public static void main(String[] args) {
		System.out.println("Main Method");

	}

	@Override
	public void run() {
		System.out.println("Thread1 ");
	}
}
