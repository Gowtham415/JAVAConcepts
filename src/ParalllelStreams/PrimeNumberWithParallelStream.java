package ParalllelStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		//System.out.println(isPrime(29));
		long t1,t2;
		t1 = System.currentTimeMillis();
		long count = Stream.iterate(1, n-> n+1).limit(500000).parallel().filter(PrimeNumberWithParallelStream::isPrime).peek(System.out::println).count();
		System.out.println("Total Prime number less than 1 Lakh:"+count);
		t2 =System.currentTimeMillis();
		System.out.println("Total time taken:"+(t2-t1)/1000);
	}
	
	
	public static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}else {
			return !IntStream.rangeClosed(2,number/2).anyMatch(x -> number%x==0);
		}
	}

}
