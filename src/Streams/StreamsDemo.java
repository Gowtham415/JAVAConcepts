package Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class StreamsDemo {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		for(int i=1;i<=10;i++) {
//			list.add(i);
//		}
//		
//		Iterator<Integer> j= list.stream().filter(x-> (x%2==0)).iterator();
//		while(j.hasNext()) {
//			System.out.println(j.next());
//		}
//		
//		
		
		Function<String,Integer> func1 = x-> x.length();
		
		System.out.println(func1.apply("Gowtham Epparla"));
			
		
		// Chaining
		Function<Integer,Integer> func2 = x-> x*10;
		
		int result = func1.andThen(func2).apply("Gowtham");
		System.out.println(result);
		
		
		
	}
}
