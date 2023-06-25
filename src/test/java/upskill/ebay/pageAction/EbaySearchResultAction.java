package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchresultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultAction {

	EbaySearchresultLocators EbaySearchResultLocatorsObj;
		
		public EbaySearchResultAction(){
			EbaySearchResultLocatorsObj = new EbaySearchresultLocators();
			PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
			}
		
		public void verifyShoesItems(){
			
			//Option 1
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
			
			//Option 2
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
			
			//Option 3
			EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		}
		
		public void filterBrand(String brand){
			if(brand.equals("Adidas")){
				EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
			} else if (brand.equals("Nike")){
				EbaySearchResultLocatorsObj.cbxBrandNike.click();
			} else if (brand.equals("Unbranded")){
				EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
			} else {
				System.out.println("Brand not found");
			}
		}
		
		public void verifyBrandItems(String brand){
			if(brand.equals("Adidas")){
				EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
			} else if (brand.equals("Nike")){
				EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
			} else if (brand.equals("Unbranded")){
				EbaySearchResultLocatorsObj.txtPants.isDisplayed();
			} else {
				System.out.println("Brand not found");
			}
		}
		
		public void selectShirtItem() throws Exception{
			Thread.sleep(3000);
			EbaySearchResultLocatorsObj.linkShirtItem.click();
			Thread.sleep(3000);
		}
		
		
		public void selectFirstShoes() throws Exception{
			EbaySearchResultLocatorsObj.linkShoesItem.click();
			Thread.sleep(3000);
		}
		
		
		
	}