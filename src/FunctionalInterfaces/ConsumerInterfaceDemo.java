package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	public static void main(String[] args) {
		Consumer<String> func = x -> System.out.println(x);
		func.accept("Hello");
		
		
		// on a list
		
		List<Integer> list = Arrays.asList(2,3,4,66,34,667,885,534,22,15,7);
		Consumer<List<Integer>> func2 = x -> System.out.println(x.size());
		
		func2.accept(list);

		list.forEach( ele -> System.out.println(ele));
	}
}
