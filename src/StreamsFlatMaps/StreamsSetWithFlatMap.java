package StreamsFlatMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		 
		Employee emp1 = new Employee();
		emp1.setName("Gowtham");
		emp1.addDevices("iPad 7th Gen");
		emp1.addDevices("Apple Pencil 1st Gen");
		emp1.addDevices("Samsung M30");
		
		Employee emp2 = new Employee();
		emp2.setName("Gary");	
		emp2.addDevices("iPhone XS");	
		emp2.addDevices("Macbook Air");
		emp2.addDevices("Samsung S10");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> listOfDevices= empList.stream().map(x-> x.getDevices()).flatMap(x-> x.stream()).distinct().collect(Collectors.toList());

		listOfDevices.forEach(x->System.out.println(x));
	}

}
