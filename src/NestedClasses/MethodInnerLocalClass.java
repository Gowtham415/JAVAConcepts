package NestedClasses;

public class MethodInnerLocalClass {

	public static void main(String[] args) {
		MethodInnerLocalClass o = new MethodInnerLocalClass();
		o.OuterMethod();
		
		
		// Anonymous Class as an implementer of specified interface.
		Demo d = new Demo() {

			@Override
			public void show1() {
				System.out.println("Anonymous Class Demo");
				
			}
		};
		
		d.show1();
	}

	public void OuterMethod() {
		int age =28;
		//Method Inner local Class
		class InnerClass1{
			public void show() {
				System.out.println(age);
			}
		}	
		InnerClass1 obj1 = new InnerClass1();
		obj1.show();
	}
	
	interface Demo{
		public void show1();
	}
}
