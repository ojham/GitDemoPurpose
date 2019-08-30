package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise {
	
	public  WebDriver openBrowser(WebDriver driver){
		
		Scanner scan=new Scanner(System.in);
		String browser =scan.next();
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ojham\\Documents\\JarsandDrivers\\chromedriver_win32\\chromedriver.exe");
			
		}
		else if (browser.equalsIgnoreCase("firefox")){
			
		}
		System.setProperty("webdriver.chrome.driver", "");		
		driver=new ChromeDriver();
		//driver.get("");
		
		
		return driver;
	}
	

}
