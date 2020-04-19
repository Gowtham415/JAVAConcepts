package MultiThreadingPractice;

public class MultiThreadDemo2 implements Runnable{
	
	String name;
	
	public MultiThreadDemo2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println(name+" : "+i);
		}
		
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new MultiThreadDemo2("Thread1"));
		Thread t2 = new Thread(new MultiThreadDemo2("Thread2"));
		t1.start();
		t2.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main: "+i);
		}
	}
}
