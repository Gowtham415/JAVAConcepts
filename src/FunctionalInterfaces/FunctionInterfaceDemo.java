package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String,Integer> func = (x) -> x.length();		
		System.out.println(func.apply("Gowtham"));
	}
}
