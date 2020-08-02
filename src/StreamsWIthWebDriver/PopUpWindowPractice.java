package StreamsWIthWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpWindowPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait driverWithWait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		
		System.out.println("Title of the Twitter Page Opened is "+getTitleOfWindow(driver,"Twitter"));
		driver.close();
	}
	
	
	public static String getTitleOfWindow(WebDriver driver, String title) {
		 return driver.getWindowHandles().stream()
			.map(handle -> driver.switchTo().window(handle).getTitle())
			.filter(e -> e.contains(title)).findFirst()
			.orElseThrow(() -> {
				throw new RuntimeException("NoSuchWindow");
			});			
	}
}
