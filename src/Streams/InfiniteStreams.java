package Streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {
	public static void main(String[] args) {
		
		
		//1. Using iterate method
		List<Integer> list = IntStream.iterate(0, n-> n+1)
				.mapToObj(x -> Integer.valueOf(x))
				.limit(50)
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		
		//2. Generate Method - It takes Supplier obj
		List<Integer> collectList = Stream.generate(()->(new Random().nextInt(10000)))
							.limit(10)
							.collect(Collectors.toList());
		
		System.out.println(collectList);
		
	}
}
