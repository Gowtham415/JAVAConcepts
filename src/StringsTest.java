import java.util.ArrayList;
import java.util.List;

public class StringsTest {

	public static void main(String[] args) {

//		String importTime= "08-31-2019 16:13:54";
//		String[] strArr= importTime.split("\\s");
//		String interStr= strArr[0];
//		String[] atrArr1= interStr.split("-");
//		String interStr2= atrArr1[2]+"-"+atrArr1[0]+"-"+atrArr1[1]+" "+strArr[1];		
//		String searchString = interStr2.substring(0,16);
//		System.out.println(searchString);

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.forEach(x -> System.out.print(x+" "));

	}

}
