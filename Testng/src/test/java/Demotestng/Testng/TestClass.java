package Demotestng.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	WebDriver driver;
	
	
	@Test
	public void test1() throws InterruptedException{
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("http://www.webdriveruniversity.com/");
		System.out.println("Firefox is instantiated");
		
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.quit();
	}

	
	@Test
	public void  test2(){
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void  test3(){
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
}
