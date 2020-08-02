package StreamsWIthWebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksWithStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait driverWithWait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://freshworks.com");
		List<WebElement> footerList = driver.findElements(By.tagName("a"));
		
		List<String> newFooterList = new ArrayList<>();
		footerList.stream().filter(e-> !e.getText().equals("")).forEach(ele -> newFooterList.add(ele.getText().trim()));
		newFooterList.forEach(System.out::println);
		
		driver.navigate().back();
		driver.close();
	}

}
