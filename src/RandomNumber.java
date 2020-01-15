import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {	
		ArrayList<Integer>  intList= new ArrayList<Integer>();
		for(int i=0;i<500;i++) {
			intList.add(randomInteger(500,1000));
		}
		System.out.println("Maximum Value: "+Collections.max(intList));
		System.out.println("Minimum Value: "+Collections.min(intList));

	}
	
	
	static int randomInteger(int min,int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}
}
