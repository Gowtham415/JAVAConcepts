package FactoryDesignPattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		PageFactory pf = new PageFactory();
		Page p = pf.getInstance("page1");
		p.methodOfPOM();
	}

}
