package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	
	public static void main(String[] args) {
		
		 WebDriver driver=null;			
		 Revise	rev=new Revise();
		 driver=rev.openBrowser(driver);
		 driver.get("http://magazineadproduction.com/cover-wraps");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//select[@class='form-control']")));
		 WebElement dropdown=driver.findElement(By.xpath("//div//select[@class='form-control']"));
		 
		 dropdown.click();
		
	     Select select =new Select(dropdown);
	     List<WebElement> options=select.getOptions();
	    
	     for(WebElement option:options){
	    	 System.out.println(option.getText());
	    	 select.selectByVisibleText(option.getText());
	    	 
	     }

		 driver.quit();

	}

}
