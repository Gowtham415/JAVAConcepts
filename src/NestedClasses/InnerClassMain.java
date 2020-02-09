package NestedClasses;

import java.math.BigDecimal;

public class InnerClassMain {

	public static void main(String[] args) {

		// Static 
		double gross= StaticInnerClassDemo.BoxOfficeCalculator.totalGross(1000, 12);
		System.out.println(BigDecimal.valueOf(gross).toPlainString());
		
		// Non Static 
		
		StaticInnerClassDemo obj1 = new  StaticInnerClassDemo("Ala Vaikuntapuramlo", 70);
		StaticInnerClassDemo.Hires obj2 = obj1.new Hires();
		double totalCollection  = obj2.totalHires(350000)+ obj2.totalGross(700, 15);
		System.out.println("Final Collections: "+BigDecimal.valueOf(totalCollection).toPlainString());
	}
}
