package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultAction;

public class EbaySearchResultSteps {


	EbaySearchResultAction EbaySearchResultActionsObj = new EbaySearchResultAction();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
		Thread.sleep(2000);
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsObj.filterBrand(brand);
		Thread.sleep(2000);
	}
	
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsObj.verifyBrandItems(brand);
		Thread.sleep(2000);
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectShirtItem();
	}
	
	@When("^Select the first shoes$")
	public void select_the_first_shoes() throws Throwable {
		EbaySearchResultActionsObj.selectFirstShoes();
	}
	
	
}