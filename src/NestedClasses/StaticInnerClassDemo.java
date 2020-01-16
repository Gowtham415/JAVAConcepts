package NestedClasses;

public class StaticInnerClassDemo {
	String name;
	double budget;

	static final double perScreenGross = 70000;

	public StaticInnerClassDemo(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}

	static class BoxOfficeCalculator {
		static double totalGrossPerDay(int screenCount) {
			return screenCount * perScreenGross;
		}
		
		static double totalGross(int screenCount,int days) {
			return screenCount* perScreenGross* days;
		}
	}
	
	class Hires{
		double totalHires(double hire) {
			return hire;
		}
		double totalGrossPerDay(int screenCount) {
			return screenCount * perScreenGross;
		}
		
		double totalGross(int screenCount,int days) {
			return screenCount* perScreenGross* days;
		}
	}
}
