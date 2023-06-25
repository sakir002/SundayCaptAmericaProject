package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDropDownLocators {

	    //Select Size
		@FindBy(xpath="//select[@aria-label='Please select a Size Type']")
		public WebElement ddSize;
		
		//Shirt men size
		@FindBy(xpath="//select[@selectboxid='1001']")
		public WebElement ddMenSize;
		
		//Shirt shade
		@FindBy(xpath="//select[@aria-label='Please select a Shade']")
		public WebElement ddShade;
		
		//Shirt Quantity
		@FindBy(xpath="(//input[@name= 'quantity'])[1]")
		public WebElement txtbxQuantity;
		
		//Add to Cart
		@FindBy(xpath="//span[text()='Add to cart']")
		public WebElement btnAddCart;
		
		//Select Color
		@FindBy(xpath="//select[@id='x-msku__select-box-1000']")
		public WebElement ddColor;
		
		//Select Shoes Size
		@FindBy(xpath="//select[@aria-label='Please select a Size']")
		public WebElement ddShoesSize;
		
		//Select quantity
		@FindBy(xpath="(//input[@name='quantity'])[1]")
		public WebElement txtbxQuantity2;
		
		//Select Buy It Now
		@FindBy(xpath="//span[contains(text(), 'Buy')]")
		public WebElement btnBuyItNow;
}
