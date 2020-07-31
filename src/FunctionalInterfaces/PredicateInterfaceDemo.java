package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceDemo {
	public static void main(String[] args) {
		
		Predicate<String>	func = x -> x.contains("t");
		
		boolean res = func.test("Gowtham");
		System.out.println(res);
		
		Predicate<Integer>	func2 = x -> x>100;
		
		List<Integer> list = Arrays.asList(2,3,4,66,34,667,885,534,22,15,7);
		
		List<Integer> resList = list.stream().filter(func2).collect(Collectors.toList());
		System.out.println(resList);
		
		//Predicate With Negate
		
		List<String> namesList = Arrays.asList("Gowtham","Gowtha","Gow","Bharath","Bhara","Bhar");
		Predicate<String> namesExp = x-> x.startsWith("Gow");
		List<String> resNames = namesList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		System.out.println(resNames);
	}
}
