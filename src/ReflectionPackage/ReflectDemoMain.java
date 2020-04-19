package ReflectionPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemoMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		/*
		 * getDeclaredMethods(),getDeclaredFields(), getDeclaredConstructors() ---- Fetched all the items
		 * getMethods(), getFields,getConstructors() ---gets only public items
		 */
		// Fields in the class
		
		System.out.println("################ FIELDS ####################");
		FieldsClass obj1 = new FieldsClass();
		Class<?> classInfo = obj1.getClass();
		Field[] fields = classInfo.getDeclaredFields();
		
		for(Field f:fields) {
			System.out.println("Datatype:"+f.getType());
			System.out.println("Field Name:"+f.getName());
			System.out.println(Modifier.toString(f.getModifiers()));
			System.out.println("Value of field:"+f.get(f));
			System.out.println("*******************************");
		}
		
		// Methods in the Class 
		System.out.println("################ METHODS ####################");
		MethodClass obj = new MethodClass();
		Class<?>  classObj= obj.getClass();
		Method[] methods = classObj.getDeclaredMethods();
		
		for(Method m :methods) {
			System.out.println("Method Name:"+m.getName());
			System.out.println("Modifier:"+Modifier.toString(m.getModifiers()));
			System.out.println("Return Datatype:"+m.getReturnType());
			Class<?>[] exceptionClassObj = m.getExceptionTypes();
			Class<?>[] parameterTypes = m.getParameterTypes();
			System.out.println("Parameters-->");
			for(Class<?> o:parameterTypes) {
				System.out.println(o.getName());
			}
			System.out.println("Exception Types-->");
			for(Class<?> o:exceptionClassObj) {
				System.out.println(o.getName());
			}
			System.out.println("*************************************");
		}
		
		// Constructors in the Class 
			System.out.println("################ CONSTRUCTORS ####################");
			Class<?> classObj2 = ConstructorClass.class;
			
			Constructor<?>[] cons= classObj2.getDeclaredConstructors();
			
			for(Constructor<?> c:cons){
				Class<?>[] parameterTypes2= c.getParameterTypes();
				Class<?>[] exceptionClassObj2= c.getExceptionTypes();
				System.out.println("Parameters-->");
				for(Class<?> o:parameterTypes2) {
					System.out.println(o.getName());
				}
				System.out.println("Exception Types-->");
				for(Class<?> o:exceptionClassObj2) {
					System.out.println(o.getName());
				}
			}
			
			System.out.println("*************************************");
	}

}
