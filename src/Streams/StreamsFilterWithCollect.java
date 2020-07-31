package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect {

	public static void main(String[] args) {

		// 1st Example
		List<String> productList = Arrays.asList("iPad", "Macbook", "iPhone", "AirPods", "iMac");

		productList.forEach(l -> System.out.println(l));

		List<String> resList = productList.stream().filter(e -> e.startsWith("i")).collect(Collectors.toList());

		resList.forEach(System.out::println);

		// 2nd Example
		List<customer> customerList = Arrays.asList(new customer("Gowtham", 28), new customer("Bharath", 31),
				new customer("Shiva", 28), new customer("Harish", 26));

		List<customer> resCustomers = customerList.stream().filter(obj -> obj.getAge() > 28)
				.collect(Collectors.toList());
		resCustomers.forEach(o -> System.out.println(o.getName() + " " + o.getAge()));

		// Find ANy and or else
		customer resCustomers2 = customerList.stream().filter(obj -> obj.getName().equals("Gowtham")).findAny()
				.orElse(null);

		// 3rd Example - Filter with multiple conditions
		
		customer cus2 =customerList.stream().filter((x) -> "Gowtham".equals(x.getName()) && 28 == x.getAge()).findAny().orElse(null);
		System.out.println(cus2.getName()+" : "+cus2.getAge());
	}

}

class customer {

	private String name;
	int age;

	public customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}