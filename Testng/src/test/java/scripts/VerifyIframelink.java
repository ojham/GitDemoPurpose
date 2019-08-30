package scripts;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.BaseTest;
import webpages.HomePage;

@Listeners(common.Listen.class)
public class VerifyIframelink  extends BaseTest{
	
	
	@Test(priority=0)
	public void verifyIframefuntionality()
	{
		String mainWindow=driver.getWindowHandle();
		HomePage hp = new HomePage(super.driver);
		hp.clickIframelink();
	    int size=hp.verifyMutlipleWindow();
	   if(size>1){
		   
		   hp.closeChildWindows(mainWindow);
	   }
	   hp.clickIframelink();
	   
	}
	  @Test	  
	  public void verifyproducts(){
		  
		  String mainWindow=driver.getWindowHandle();

		  WebDriverWait	wait=new WebDriverWait(driver,30);
			SoftAssert Assert = new SoftAssert();
			
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
			
		  
	  }
	   
	   
	}
	


