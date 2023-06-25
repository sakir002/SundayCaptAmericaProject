package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import upskill.ebay.pageElements.RahulIframeLocators;
import upskill.utilities.SetupDrivers;

public class RahulIframeActions {

	RahulIframeLocators RahulIframeLocatorsObj;
	
	public RahulIframeActions(){
		RahulIframeLocatorsObj= new RahulIframeLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulIframeLocatorsObj);
	}
	public void loadRahulShattyHomepage() throws Exception{
		Thread.sleep(3000);
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	public void clickiFrameHome(){
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<framelist.size(); i++)
			SetupDrivers.driver.switchTo().frame(i);
			
		try{
			RahulIframeLocatorsObj.btnHome.click();
		} catch (Exception e){
			System.out.print("Element not found in this frame");
		}
		
	}
	
	public void varifyRahulHomepage() throws Exception{
		Thread.sleep(3000);
		RahulIframeLocatorsObj.btnHome.isDisplayed();
		
	}
}