package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.MacysIframeActions;

public class MacysIframeStaps {

	MacysIframeActions MacysIframeActionsObj = new MacysIframeActions();
	
	@Given("^Open Macys Homepage$")
	public void open_Macys_Homepage() throws Throwable {
		MacysIframeActionsObj.macysHome();
	}

	@When("^Click on iframe Shop Now$")
	public void click_on_iframe_Shop_Now() throws Throwable {
		MacysIframeActionsObj.clickIframeShopNow();
	}

	@Then("^User should able to see DKNY page$")
	public void user_should_able_to_see_DKNY_page() throws Throwable {
		MacysIframeActionsObj.verifyDKNYPage();
	}
}
