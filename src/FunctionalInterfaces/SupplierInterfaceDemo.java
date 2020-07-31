package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
	public static void main(String[] args) {
		Supplier<String> func = () ->  "Hello World";	
		System.out.println(func.get());
		
		
		getText(() -> "Gowtham");
		getText(() -> "Bharath");
		getText(() -> "Harish");
		
	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text);
	}
}
