package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulAlertHandleLocators {
	
		//Enter Your Name 
			@FindBy(xpath="//input[@id='name']")
			public WebElement txtbxName;
			
			//click on Alert
			@FindBy(xpath="//input[@id='alertbtn']")
			public WebElement btnAlert;
			
			//click on Confirm
			@FindBy(xpath="//input[@id='confirmbtn']")
			public WebElement btnConfirm;
}
