package jenkinsExecute;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Asserts.assertTrue(driver.getTitle().contains("orange"));
		driver.quit();
	}

}
