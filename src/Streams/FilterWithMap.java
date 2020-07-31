package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterWithMap {

	public static void main(String[] args) {
		
		List<firends> customerList = Arrays.asList(new firends("Gowtham", 28), new firends("Bharath", 31),
				new firends("Shiva", 28), new firends("Harish", 26));
		
		String res = customerList.stream().filter( cus -> cus.getAge()>27).map(firends::getName).findAny().orElse(null);
		
		System.out.println(res);

	}
	
}

class firends {

	private String name;
	int age;

	public firends(String name, int age) {
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

