package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.MacysIframeLocators;
import upskill.utilities.SetupDrivers;

public class MacysIframeActions {

	MacysIframeLocators MacysIframeLocatorsObj;
	
	public MacysIframeActions(){
		MacysIframeLocatorsObj = new MacysIframeLocators();
		PageFactory.initElements(SetupDrivers.driver, MacysIframeLocatorsObj);
	}
	
	public void macysHome() throws Exception{
		Thread.sleep(3000);
		SetupDrivers.driver.get("https://www.macys.com/");
	}
	
	public void clickIframeShopNow(){
		List<WebElement> iframeObj = SetupDrivers.driver.findElements(By.xpath("//iframe[contains(@id, '22026345640')]"));
		
		for (int i = 0; i<iframeObj.size(); i++)
				SetupDrivers.driver.switchTo().frame(i);
		
		try {
			MacysIframeLocatorsObj.adImage33.click();
		}catch(Exception e){
			System.out.println("Element not found in this Frame");
		}
	}
	
	
	public void verifyDKNYPage() throws Exception{
		Thread.sleep(3000);
		MacysIframeLocatorsObj.verifyCHANELParfum.isDisplayed();
		Thread.sleep(3000);
	}
}