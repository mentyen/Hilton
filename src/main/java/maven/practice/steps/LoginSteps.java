package maven.practice.steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import maven.practice.pages.HomePage;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {
	public HomePage home;

	@Given("Im on a main page")
	public void im_on_a_main_page() {

	}

	@Given("I enter {string} in to a search  and choose Los Angelos from a drop down")
	public void i_enter_in_to_a_search_and_choose_Los_Angelos_from_a_drop_down(String string)
			throws InterruptedException {
		home = new HomePage();
		CommonMethods.waitForElementBeClickable(home.search, 20);
		CommonMethods.jsClick(home.search);
		// Thread.sleep(3000);
		CommonMethods.sendText(home.search, string);
		// Thread.sleep(3000);
		jsClick(home.LAoptionFromList);
		// Thread.sleep(3000);
	}

	@Then("I choose {int} adults in a Room section")
	public void i_choose_adults_in_a_Room_section(Integer int1) throws InterruptedException {
		jsClick(home.roomControllBtn);
		
		for(int i=2;i<=int1;i++) {
			jsClick(home.addAdultBtn);
		}
	
		jsClick(home.closeAdultWindow);
	}

	@Then("I click on a Find Hotel")
	public void i_click_on_a_Find_Hotel() throws InterruptedException {
		jsClick(home.specialRates);
		jsClick(home.usePointsBox);
		jsClick(home.closeSpecialRates);
		jsClick(home.findHotel);

	}

	@Given("I click on a calendar and choose arriving and return dates")
	public void i_click_on_a_calendar_and_choose_arriving_and_return_dates() throws InterruptedException {
		jsClick(home.datePickerButtn);

		List<WebElement> fromdates = new ArrayList<>(home.fromdates);
		List<WebElement> tilldates = new ArrayList<>(home.todates);

		for (WebElement run : fromdates) {
			String status = run.getAttribute("tabindex");
			String day = "0";

			if (status.equals("0")) {
				day = run.getText();
				jsClick(run);
			}

		}

		for (WebElement run : tilldates) {

			String daynum = run.getText();

			if (daynum.equals("7")) {
				jsClick(run);
			}

		}

		jsClick(home.closeDatePicker);

	}

	@Then("I Verify that number of avalible is {string}")
	public void verify_that_number_of_avalible_is(String string) {
		String result=home.matchingResult.getText();
		System.out.println(result);
		boolean flag=false;
		if(result.contains(string)) {
			flag=true;
		}
		
		Assert.assertTrue(flag);
	}

}
