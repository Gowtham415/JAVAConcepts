package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExpDemo {
	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Gowtham","Bharath","Shiva","Harish");
		
		// 1. Anonotmous Class
		namesList.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		// 2. Using -> (Lambda expression)
		
		namesList.forEach(x -> System.out.println(x));
		
		// 3. Method References
		
		namesList.forEach(System.out :: println);
	}
}
