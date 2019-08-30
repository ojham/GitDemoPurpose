package webpages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BasePage;

public class HomePage  extends BasePage {
	
	
	@FindBy(css="a[id='iframe'] div.thumbnail div.section-title h1")
	private WebElement iframelink;
	

	

	public HomePage( WebDriver driver){
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickIframelink(){
		waituntilElement(iframelink);
		click(iframelink);
	}

	
	public int verifyMutlipleWindow(){
		
		Set<String> windows = driver.getWindowHandles();
		
		return windows.size();
	}
	
	
	public void closeChildWindows(String mainwindow){
		
		Set<String> windows = driver.getWindowHandles();
		if(windows.size()>1){
			for(String window: windows){
				if(!window.equals(mainwindow)){
					driver.close();
					
				}
			}
		}
	}
	
	
	
}
