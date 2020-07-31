
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void greet();
	
	public static void test() {
		System.out.println("Static Method");
	}
	
	default void test2() {
		System.out.println("Default ");
	}
}
