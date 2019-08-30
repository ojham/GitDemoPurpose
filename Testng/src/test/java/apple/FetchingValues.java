package apple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingValues {

	 public WebDriver driver;
	 public WebDriverWait wait;
	 public Actions action;
	 SoftAssert Assert;
	
	@BeforeClass
	public void launchBrowser( ){
		
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://support.apple.com/en-in/15-inch-macbook-pro-battery-recall");
			WebDriverWait wait=new WebDriverWait(driver,30);
			
		}
}
