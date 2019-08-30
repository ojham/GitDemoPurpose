package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public String url;
	
	
	@BeforeTest
	public void inilitizeFramework(){
		
		url="http://www.webdriveruniversity.com/";
		
	}

	
	@Parameters({"browser"})
	@BeforeClass
	public void launchBrowser( @Optional("firefox") String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("ChromeDriver is instantiated");
		}
		else{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
	
	
	driver.get("http://www.webdriveruniversity.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	
}
