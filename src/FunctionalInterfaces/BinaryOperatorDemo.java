package FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	/*
	 * @FunctionalInterface public interface BinaryOperator<T> extends
	 * BiFunction<T,T,T> Represents an operation upon two operands of the same type,
	 * producing a result of the same type as the operands. This is a specialization
	 * of BiFunction for the case where the operands and the result are all of the
	 * same type. This is a functional interface whose functional method is
	 * BiFunction.apply(Object, Object).
	 */
	
	public static void main(String[] args) {
		BinaryOperator<String> func = (x,y)-> x.substring(0,1).toLowerCase()+y.toLowerCase();
		
		String result = func.apply("gowtham", "Epparla");
		System.out.println(result);
		
		// 
		BiFunction<String,String,String> func2 = (x,y)-> x.substring(0,1).toLowerCase()+y.toLowerCase();
		System.out.println(func2.apply("Harish", "Yadav"));
	}
}
