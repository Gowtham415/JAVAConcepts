import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TCCounts {

	public static void main(String[] args) {		
		int count =0;
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\TestRailTool\\TestCasesList.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\TestRailTool\\TCCounts.txt"))) {
			String lines = reader.readLine();

			boolean condition = true;
			Map<String, String> testCaseList = new HashMap<>();
			while (condition) {
				condition = (lines != null) && (lines != "") && !(lines.trim().equals("END".trim()));
				if (condition == false) {
					break;
				}
				String line[] = lines.split(":");
				String statustoBeUpdated = StatusToBeUpdated(line[1].trim().toLowerCase());
				String testCaseID = line[0].trim().toLowerCase();
//				System.out.println(testCaseID + " : " + statustoBeUpdated);
				testCaseList.put(testCaseID, statustoBeUpdated);
				count++;
				lines = reader.readLine();
			}
			System.out.println(
					"============================================================================================");
			System.out.println("Total number of Test cases : " + count);
			writer.write("================================================"+"\n");
			writer.flush();
			writer.write("Total number of Test cases : " + count);
			writer.flush();
			System.out
					.println("=======================================================================================");
			System.out.println("Test Cases Available:");
			for(Map.Entry<String, String> entry : testCaseList.entrySet()) {
				String tc= entry.getKey();
				String status = entry.getValue();
				System.out.println(tc+" : "+status);
				writer.write(tc+" : "+status+"\n");
				writer.flush();		
			}
			
			writer.write("========================================================"+"\n"+"Automation task to be created for:"+"\n");
			writer.flush();
			for(Map.Entry<String, String> entry : testCaseList.entrySet()) {
				String tc= entry.getKey();
				String status = entry.getValue();
				if(status.equalsIgnoreCase("Manual (To Be Automated)")) {
//					System.out.println(tc+" : "+status);
					writer.write(tc+" : "+status+"\n");
					writer.flush();	
				}		
			}
		} catch (IOException e) {
			System.out.println("Unable to read the file");
			e.printStackTrace();
		}
	}

// To search for the test case Type in the text file

	private static String StatusToBeUpdated(String str) {
		if (str.contains("Automated".toLowerCase())) {
			return "Manual (To Be Automated)";
		} else if (str.contains("only".toLowerCase())) {
			return "Manual Only";
		} else if (str.contains("obsol".toLowerCase())) {
			return "Obsolete";
		}
		return null;
	}
}
