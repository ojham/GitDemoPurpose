package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	
	public WebDriver driver;

	public BasePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void click( WebElement wb){
		wb.click();
		
	}

	public void waituntilElement(WebElement wb){
	WebDriverWait 	wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(wb));
	}
}
