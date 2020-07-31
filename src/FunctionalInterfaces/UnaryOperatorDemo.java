package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<String> func = x-> x.substring(0,3);
		String result = func.apply("gowtham");
		System.out.println(result);
		
		
		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Python");
		langList.add("c#");
		langList.add("Perl");
		
		langList.replaceAll(ele -> ele+" Gowtham");
	}
}
