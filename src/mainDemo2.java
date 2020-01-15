interface InterfaceDemo {
	
	String name="Gowtham";	
	public void transform();
	public default void nwMethod() {
		System.out.println("Interface Method");
	}
}
class Test1 implements InterfaceDemo{
	@Override
	public void transform() {
		System.out.println(name);
		nwMethod();
	}
}

public class mainDemo2 {
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.transform();
	}
}
