package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulAlertHandleActions;

public class RahulAlertHandleSteps {
	
	RahulAlertHandleActions RahulAlartHandleActionsobj = new RahulAlertHandleActions();

	@Given("^Open Rahul Shatty Practice Page$")
	public void open_Rahul_Shatty_Practice_Page() throws Throwable {
	   Thread.sleep(3000);
	}

	@When("^Enter your name on Enter Your Name Textbox and click on Alert Button$")
	public void enter_your_name_on_Enter_Your_Name_Textbox_and_click_on_Alert_Button() throws Throwable {
		RahulAlartHandleActionsobj.enterNameAndclickAlartButton();
	}

	@When("^User should able to accept the alert$")
	public void user_should_able_to_accept_the_alert() throws Throwable {
		RahulAlartHandleActionsobj.acceptTheAlert();
	}
	@When("^Enter your name on Enter Your Name Textbox and click on Confirm Button$")
	public void enter_your_name_on_Enter_Your_Name_Textbox_and_click_on_Confirm_Button() throws Throwable {
		RahulAlartHandleActionsobj.clickConfirm();
	}

	@Then("^User should able to cancel the alert$")
	public void user_should_able_to_cancel_the_alert() throws Throwable {
		RahulAlartHandleActionsobj.cancelTheAlert();
	}
}
