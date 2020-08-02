import java.util.concurrent.ForkJoinPool;

public class CoresFInder {
// To get the number of cores in your processor
	public static void main(String[] args) {
		ForkJoinPool cores = ForkJoinPool.commonPool();
		System.out.println(cores.getParallelism());
	}

}
