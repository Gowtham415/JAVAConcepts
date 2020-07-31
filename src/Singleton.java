
public class Singleton {

	private static Singleton singleton_variable = null;
	
	private Singleton() {
		System.out.println("Object Created");
	}
	
	public static Singleton createInstance() {
		if(singleton_variable == null) {
			singleton_variable = new Singleton();	
		}
			return singleton_variable;
	}
}
