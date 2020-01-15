package ComparatbleAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1= new Movie("Ala vaikuntapuramlo",165.6,2020);
		Movie m2= new Movie("Sarileru Nekevvaru",170.0,2020);
		Movie m3= new Movie("Rangasthalam",175.6,2018);
		Movie m4= new Movie("Maharshi",169.6,2019);
		Movie m5= new Movie("Fidaa",156.6,2017);
		
		
		ArrayList<Movie> al = new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		System.out.println("*******************BEFORE SORTING*****************");
		printList(al);	
		Collections.sort(al);
		System.out.println("*******************AFTER SORTING BASED ON DEFAULT(NAME)*****************");
		printList(al);	
		System.out.println("*******************AFTER SORTING BASED ON RUNTIME*****************");
		Collections.sort(al,new runTimeComparison());
		printList(al);	
		System.out.println("*******************AFTER SORTING BASED ON YEAR*****************");
		Collections.sort(al, new yesrWiseCompare());
		printList(al);	
	
	}
	
	
	static void printList(List<Movie> movies) {
		for(Movie m:movies) {
			System.out.println(m.getName());
		}
	}

}
