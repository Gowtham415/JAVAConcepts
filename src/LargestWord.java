import java.util.HashMap;
import java.util.Map;

public class LargestWord {

	public static void main(String[] args) {
		String s= "I am the greatest ever Invention of man kind. This not an exaggeration";
		System.out.println(getLargestWord(s));	
	}
	
	static String getLargestWord(String str) {
		String[] strArry = str.split("\\s");
		Map<String,Integer> strList = new HashMap<String,Integer>(strArry.length);
		for(int i=0;i<strArry.length;i++) {
			strList.put(strArry[i], strArry[i].length());
		}
//		 Map.Entry<String, Integer> maxEntry = null;
//		    for (Map.Entry<String, Integer> entry : strList.entrySet()) {
//		        if (maxEntry == null || entry.getValue()
//		            .compareTo(maxEntry.getValue()) > 0) {
//		            maxEntry = entry;
//		        }
//		    }
	//return maxEntry.getKey();
//		int maxvalue = Collections.max(strList.values());
//		int minvalue = Collections.min(strList.values());
		
		int max = 0;
		String largeStr = null;
		for(String map:strList.keySet()) {
			if(map.length()>max) {
				max=map.length();
				largeStr=map;
			}
		}
		  return largeStr;  
	}

}
