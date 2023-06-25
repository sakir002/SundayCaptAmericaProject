package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
	
 
		
		//Search Text Box
		@FindBy(xpath="//input[@placeholder='Search for anything']")
		public WebElement txtbxSearch;
		
		//Search Button
		@FindBy(xpath="//input[@value='Search']")
		public WebElement btnSearch;
		
		//My eBay
		@FindBy(xpath="//a[@title='My eBay']")
		public WebElement linkMyeBay;
				
		//Click on Summary
		@FindBy(xpath="//a[text()= ' Summary'] ")
		public WebElement clickSummary;
				
}
