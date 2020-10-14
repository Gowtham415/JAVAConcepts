
public class PassByValue {

	private String name;

	public static void main(String[] args) {

		PassByValue o1 = new PassByValue("Gowtham");
		PassByValue o2 = new PassByValue("Jeff");
		System.out.println("Before Swapping:");
		System.out.println(o1.getName());
		System.out.println(o2.getName());
		swap(o1, o2);
		System.out.println("After Swapping:");
		System.out.println(o1.getName());
		System.out.println(o2.getName());

		// Values of o1 and o2 does not change because in the swap method they are
		// actually storing the values in the dummy variables. So clearly the original objects won't get impacted.
	}

	public String getName() {
		return name;
	}

	public PassByValue(String name) {
		this.name = name;
	}

	public static void swap(PassByValue obj1, PassByValue obj2) {
		PassByValue temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}

}
