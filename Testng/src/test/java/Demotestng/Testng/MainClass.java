package Demotestng.Testng;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	
	WebDriver driver;
	WebDriver driver1;
	SoftAssert Assert;
	WebDriverWait wait;
	
	
	
	@Parameters({"browser"})
	@Test
	public void verifyNumberProducts( String browser){
		
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("ChromeDriver is instantiated");
		
		
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String mainWindow=driver.getWindowHandle();

		wait=new WebDriverWait(driver,30);
		Assert=new SoftAssert();
		
		By iframe=By.cssSelector("a[id='iframe'] div.thumbnail div.section-title h1");
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(iframe));
	
		driver.findElement(iframe).click();
		
		Set<String> windows = driver.getWindowHandles();
		if(windows.size()>1){

			for(String childwindow:windows){			
				if(!childwindow.equals(mainWindow))
				{				
					driver.switchTo().window(childwindow);
					break;
				}
				
			}			
			
		}
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame']"));
		driver.switchTo().frame(frame);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul li a[href='products.html']")));	
		driver.findElement(By.cssSelector("ul li a[href='products.html']")).click();
		
		driver.switchTo().defaultContent();		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='frame']")));	
		
		List<WebElement>items=driver.findElements(By.cssSelector("div.col-md-12 div.row div img"));			
		Assert.assertEquals(items.size(), 8);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("method1 parallel");
		driver.quit();
		
		
		
	}
	

}
