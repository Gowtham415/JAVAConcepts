package LambdaExpressions;

public class LambdaDemo {

	public static void main(String[] args) {
		// Here we are not creating Object of Interface but overriding unimplemented
		// method and assigning to a variable of Interface type.
		//*** Will not work for Functional Interfaces
		NonFuncInterface object = new NonFuncInterface(){
			@Override
			public void movieBoxOffice(String name, double firstWeek, double finalBO) {
				System.out.println("Movie name:" + name + " | First Week:" + firstWeek + " | Full Run" + finalBO);
			}
		};
		object.movieBoxOffice("Ala vaikuntapuramlo", 75.8, 115.6);
	// This will only work for Functional Interfaces(with one Abstract method)	
		FuncInterface obj1 = (name,budget,boxOffice)->{
			System.out.println("Movie name:" + name + " | Budget:" + budget + "Cr | " +"Boxoffice: "+boxOffice+" Cr");
		};
		obj1.movieDetails("Ala vaikuntapuramlo", 70.0, 115.6);
	}
}
