package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class EbayHome_Steps {
    @Given("When I am Home Page")
    public void when_i_am_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on home page");
    }

    @When("I click on advanced search page")
    public void i_click_on_advanced_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on advanced search page");
    }

    @Then("I navigate to advanced search page")
    public void i_navigate_to_advanced_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigated to advanced search page");
    }
}
