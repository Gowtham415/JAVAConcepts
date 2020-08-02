package StreamsWIthWebDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWithSTreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait driverWithWait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("td.select-checkbox"));
		checkBoxList.forEach(e->e.click());
		driver.close();
	}

}
