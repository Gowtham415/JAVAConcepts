package FactoryDesignPattern;

public class PageFactory {
	public Page getInstance(String str) {
		if (str.equals("page1")) {
			return new Page1();
		} else if (str.equals("page2")) {
			return new Page2();
		} else {
			return new Page3();
		}
	}
}
