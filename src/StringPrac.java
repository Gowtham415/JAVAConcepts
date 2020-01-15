
public class StringPrac {

	public static void main(String[] args) {
		String sb= "12hhedmdn1hjkkd2hh45";	
		String[] str= sb.split("[a-zA-Z]");
		int sum =0;
		for(String s : str) {
			if(!s.equals("")) {
				sum+=Integer.parseInt(s);
			}
		}
		System.out.println(sum);
	}
}
