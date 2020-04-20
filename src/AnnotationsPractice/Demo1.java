package AnnotationsPractice;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/*
 * Retention is applied run time and applicable for methods only
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface MyCustomAnnotation{
	String name();
	String usage();
}

public class Demo1 {
	
	
	public static void main(String[] args) {
		Demo1 o = new Demo1();
		o.show();
		
		Method[] m = o.getClass().getDeclaredMethods();
		
		for(Method m1: m) {
			Annotation[] annotations =m1.getDeclaredAnnotations();
			for(Annotation a: annotations) {
				MyCustomAnnotation ann = (MyCustomAnnotation) a;
				System.out.println(ann.name()+" : "+ann.usage());
			}
		}
	}
	
	@MyCustomAnnotation(name = "Anno1", usage = "Demolition")
	public void show() {
		System.out.println("New Annotated Method");
	}
	
	@MyCustomAnnotation(name = "Anno2", usage = "Demolition")
	public void show2() {
		System.out.println("New Annotated Method 2");
	}
}
