
public class class1 {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.val);
		B b = (B)a;
		b.bMethod2();
		System.out.println(b.bVal);
		}	
}

class A {
	int val = 100;
	public A(){
		System.out.println("A");
	}
}

class B extends A{
	
	int val = 10;
	int bVal =20;
	public B() {
		System.out.println("B");
	}
	
	public void bMethod2() {
		System.out.println("Second Method");
	}
}

