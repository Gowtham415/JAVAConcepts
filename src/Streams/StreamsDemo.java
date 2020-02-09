package Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		Iterator<Integer> j= list.stream().filter(x-> (x%2==0)).iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}
}
