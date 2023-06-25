package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulAlertHandleLocators;
import upskill.utilities.SetupDrivers;

public class RahulAlertHandleActions {

	RahulAlertHandleLocators RahulLocatorsObj;
	
	public RahulAlertHandleActions (){
		RahulLocatorsObj = new RahulAlertHandleLocators();
		PageFactory.initElements(SetupDrivers.driver, RahulLocatorsObj);
	}
	
	public void loadRahulShattyHomepage() throws Exception{
		Thread.sleep(3000);
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	public void enterNameAndclickAlartButton() throws Exception{
		RahulLocatorsObj.txtbxName.sendKeys("Upskill");
		Thread.sleep(3000);
		RahulLocatorsObj.btnAlert.click();
		Thread.sleep(3000);
	}
	
	public void acceptTheAlert() throws Exception{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	
	public void clickConfirm() throws Exception {
		RahulLocatorsObj.txtbxName.sendKeys("Imtiaz");
		Thread.sleep(3000);
		RahulLocatorsObj.btnConfirm.click();
		Thread.sleep(3000);
	}
	
	
	public void cancelTheAlert() throws Exception{
		SetupDrivers.driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
