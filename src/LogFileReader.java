import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LogFileReader {

	public static void main(String[] args) {

		/*
		 * DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		 * LocalDateTime time = LocalDateTime.now(); LocalDateTime nextDate=
		 * time.plusDays(4); String strDay = time.getDayOfWeek().toString();
		 * if(strDay.equals("SATURDAY")) {
		 * System.out.println(nextDate.plusDays(2).format(dateTime)); }else
		 * if(strDay.equals("SUNDAY")) {
		 * System.out.println(time.plusDays(1).format(dateTime)); }else {
		 * System.out.println("Date is neither Saturday or Sunday"); }
		 * 
		 * Calendar c = Calendar.getInstance(); c.add(Calendar.DAY_OF_WEEK, 5);
		 * System.out.println((new SimpleDateFormat("yyyy/MM/dd")).format(c.getTime()));
		 */
			
			String dateStr="2019-08-29 13:55:37";
			String jobdate="08-15-2019 13:59:05";
			try {
				Date date =new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
//		 2019-08-29 13:59:05
//		D:\\WorkSpace\\Selenium\\JAVAHelper\\log.txt
		String payload;
		try (BufferedReader reader1 = new BufferedReader(
				new FileReader("D:\\TexturaLink\\Adaptors\\TexturaStaging\\link.log"))) {
			String lines;
			while ((lines=reader1.readLine())!= null) {
				if (lines.contains("2019-08-29 13:55")) {
					if (lines.contains("payload:")) {
						String[] str = lines.split(":", 6);
						System.out.println(str[5]);	
						payload= str[5];
					}
				}			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
