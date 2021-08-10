package steps;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

public class UsedCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	
	@And("^click on \"([^\"]*)\" link on Used Search Car page$")
	public void click_on_link_on_Used_Search_Car_page(String arg1) throws Throwable {
	    
		carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown on Used Search Car page$")
	public void select_carbrand_as_from_AnyMake_dropdown_on_Used_Search_Car_page(String carBrand) throws Throwable {
	    
		usedCarsSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select car model on Used Search Car page$")
	public void select_car_model_on_Used_Search_Car_page(List<String> list) throws Throwable {

		String menu = list.get(1);
		usedCarsSearchPageActions.selectCarModel(menu);
		
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used Search Car page$")
	public void select_location_as_from_SelectLocation_dropdown_on_Used_Search_Car_page(String location) throws Throwable {
		usedCarsSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown on Used Search Car page$")
	public void select_price_as_from_price_dropdown_on_Used_Search_Car_page(String carPrice) throws Throwable {

		usedCarsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button on Used Search Car page$")
	public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_page() throws Throwable {
	    
		usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars on Used Search Car page$")
	public void i_should_see_list_of_searched_cars_on_Used_Search_Car_page() throws Throwable {
	    
		System.out.println("Used car list populated");
	}
}
