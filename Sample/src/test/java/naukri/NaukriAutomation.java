package naukri;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class NaukriAutomation {

	
	 public WebDriver driver;
	 public WebDriverWait wait;
	 public Actions action;
	 SoftAssert Assert;
	 
	 String email="manishkr2207@gmail.com";
	 String password="manish@123";
	 
	 
	 @BeforeMethod
	 public void inilization(){
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ojham\\Documents\\JarsandDrivers\\chromedriver_latest\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-extensions");
		chromeOptions.addArguments("ignore-certificate-errors");
		chromeOptions.addArguments("disable-popup-blocking");
		cap.setCapability(chromeOptions.CAPABILITY, chromeOptions);
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().setPosition(new Point(0, -1500));
		wait = new WebDriverWait(driver,30);
		action=new Actions(driver);
		Assert=new SoftAssert();
	
		driver.get("https://www.naukri.com");
		//driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String mainwindow=driver.getWindowHandle();
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.cssSelector("a#login_Layer div")));
		
		Set<String> childwindows = driver.getWindowHandles();	
		if(childwindows.size()>1){
			
			for( String window :childwindows){		
				if(!window.equals(mainwindow)){
					driver.switchTo().window(window);
					driver.close();
				}		
			}
			
			driver.switchTo().window(mainwindow);
		}
				
		driver.findElement(By.cssSelector("a#login_Layer div")).click();
		
		By username=By.cssSelector("input#eLoginNew");
		By pass=By.cssSelector("input#pLogin");
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(username));
		
		driver.findElement(username).sendKeys(email);
		driver.findElement(pass).sendKeys(password);;
		
		driver.findElement(By.cssSelector("button[value='Login']")).click();
		
		
		By Naukri=By.cssSelector("a[href='https://my.naukri.com/HomePage/view'] div.mTxt");	
		wait.until(ExpectedConditions.presenceOfElementLocated(Naukri));
		
		WebElement mynaukri=driver.findElement(Naukri);	
		action.moveToElement(mynaukri).build().perform();
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy
				(By.cssSelector("div[class='subMenu c2'] ul:nth-of-type(1) li:nth-of-type(1) a")));		
		List<WebElement> proileedit = driver.findElements(By.cssSelector("div[class='subMenu c2'] ul:nth-of-type(1) li:nth-of-type(1) a"));
		
		for(WebElement edit:proileedit){
			
			if(edit.getText().equalsIgnoreCase("Edit Profile")){
				edit.click();
				break;			
			}
		}
		
		
	}

	@Test(invocationCount=7)
	public void updateProfile() throws InterruptedException{
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//span[text()='Resume Headline']/..//span[@class='edit icon']")));
			
		driver.findElement(By.xpath("//span[text()='Resume Headline']/..//span[@class='edit icon']")).click();	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.mb5 span.widgetTitle")));
		
		By resumehealinetext=By.cssSelector("textarea#resumeHeadlineTxt");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(resumehealinetext));	
		String resumeheadline =driver.findElement(resumehealinetext).getText();
		
		driver.findElement(resumehealinetext).clear();	
		driver.findElement(resumehealinetext).sendKeys(resumeheadline);
		
		driver.findElement(By.cssSelector("div[class='action s12'] button[type='submit']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.resumeHeadline div[class='card mt15']")));	
		String message=driver.findElement(By.cssSelector("div.resumeHeadline div[class='card mt15']")).getText();
		Thread.sleep(1000);
		
		System.out.println(resumeheadline);
		
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException{
		
		By Naukri=By.cssSelector("a[href='https://my.naukri.com/HomePage/view'] div.mTxt");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(Naukri));
		
		action.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();		
		wait.until(ExpectedConditions.presenceOfElementLocated(Naukri));
		
		WebElement naukri=driver.findElement(Naukri);		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", naukri);
		
		
		action.moveToElement(naukri).build().perform();
		Thread.sleep(2000);
		
		 By listlog=By.cssSelector("ul[class='rghtSec fr menu logged'] li div[class='subMenu c2'] ul:nth-of-type(2) li a");
		 
		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(listlog));
		 
		 List<WebElement>logoptions= driver.findElements(listlog);
		 
		 for(WebElement option:logoptions){
			 option.getText();
			 
			 if(option.getText().equalsIgnoreCase("Logout")){
				 option.click();
				 break;
			 }
			 
		 }		
			
		WebElement x = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Login']")));
		
		Assert.assertTrue(x.isDisplayed(),"Logged out successfully");
		driver.quit();

	}
	
	

}
