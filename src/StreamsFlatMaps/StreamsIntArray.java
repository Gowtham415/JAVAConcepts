package StreamsFlatMaps;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntArray {

	public static void main(String[] args) {
		
		
		int[] data = {1,2,3,4,5,6,7,8,9};
		
		
		/*
		 * You Cannot use falt map for primitive type element so use flatMaptoInt incase of int type data
		 */
		
		//1st Method
		Stream<int[]> streamArray = Stream.of(data);
		IntStream intStream = streamArray.flatMapToInt(x-> Arrays.stream(x));
		intStream.forEach(System.out::println);
		
		// 2nd Method
		
		Arrays.asList(data).stream().flatMapToInt (x->Arrays.stream(x));
	}

}
