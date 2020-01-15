
public class Singleton {

	private static Singleton singleton_variable = null;
	
	private Singleton() {
		
	}
	
	public static Singleton createInstance() {
		if(singleton_variable == null) {
			singleton_variable = new Singleton();
			
		}
			return singleton_variable;
	}
}
