package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamsDemo {
	public static void main(String[] args) {
		
		//1.
		Stream<String> stream = Stream.of("Gowtham","Shiva","Harish","ANusha","Bharath");
		stream.forEach(x-> System.out.println(x));
		
		//2.
		Arrays.asList("a1","a222","a3","a2","s22")
			.stream().filter(x->x.startsWith("a22")).findFirst().ifPresent(System.out::println);
		
		//3. 
		IntStream.range(1,11).forEach(System.out::println);
		
		//4.
		Stream.of("a11","a12","a33","g56","h88").map(x->x.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		//5.
		Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);
		
		//6. Odd numbers 
		Stream.iterate(0, n-> n+1).filter(x->x%2==1).limit(10).forEach(System.out::println);
		
	}
}
