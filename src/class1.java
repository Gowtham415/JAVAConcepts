
public class class1 {

	public static void main(String[] args) {
		A a = new B();
		}	
	

}

class A{
	public A(){
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}

