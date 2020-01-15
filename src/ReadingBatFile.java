import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingBatFile {

	public static void main(String[] args) throws IOException {
	
		/* Do not use
		 * Do not use
		 * Do not use */
		
		ProcessBuilder processBuilder = new ProcessBuilder("D:\\TexturaLink\\Adaptors\\TexturaStaging\\run.bat");
		
		try {		
			Process process = processBuilder.start();
			
			BufferedReader reader = new BufferedReader(
	                new InputStreamReader(process.getInputStream()));
			
			StringBuilder logData = new StringBuilder();
			
			String line;
			while((line=reader.readLine())!=null) {
				logData.append(line+"\n");
				System.out.println(line);
			}
			System.out.println(logData);
			int exitVal = process.waitFor();
	        if (exitVal == 0) {
	            System.exit(0);
	        } else {
	            //abnormal...
	        }
		}catch(IOException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
