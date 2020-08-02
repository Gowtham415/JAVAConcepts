package ParalllelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamsDemo {
	public static void main(String[] args) {
		//1. parallel() method on stream
		//Sequential
		Stream.of("Gowtham","Bharath","Shiva","Manoj","Tharun").forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		//Parallel
		Stream.of("Gowtham","Bharath","Shiva","Manoj","Tharun").parallel().forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		//2. Use parallelStream() method on a collection stream
		Arrays.asList("Charan","Manoj","Mahesh","Kumar","Avinash").parallelStream().forEach(System.out::println);
		
		// 1 to 10
		//Sequential
		IntStream.rangeClosed(1,10).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------");
		//Parallel
		IntStream.rangeClosed(1,10).parallel().forEach(System.out::println);	
		
		
		// Alphabets
		System.out.println("--------Sequential Steam------------");
		getAlphabets().forEach(System.out::print);
		System.out.println("--------Parallel Steam------------");
		getAlphabets().parallelStream().forEach(System.out::print);
		
		
		// Check stream is running in parallel mode: isParallel() method
		IntStream stream = IntStream.rangeClosed(1,10);
		System.out.println(stream.isParallel());
		IntStream stream2 = IntStream.rangeClosed(1,10).parallel();
		System.out.println(stream2.isParallel());
	}
	
	public static List<String> getAlphabets() {
		List<String> alphabets = new ArrayList<>();
		int n=97;
		while(n<=122) {
			char c = (char)n;
			alphabets.add(String.valueOf(c));
			n++;
		}
		return alphabets;
	}
}
