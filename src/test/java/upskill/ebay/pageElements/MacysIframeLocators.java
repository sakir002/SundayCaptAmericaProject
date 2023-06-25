package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacysIframeLocators {

		//Click Iframe Shop Now
		@FindBy(xpath="//img[contains(@src, '8900543516529556353')]")
		public WebElement adImage33;
	
	    //verify CHANEL Parfum
		@FindBy(xpath="//img[contains(@alt, 'CHANEL')]")
		public WebElement verifyCHANELParfum;
	
}
