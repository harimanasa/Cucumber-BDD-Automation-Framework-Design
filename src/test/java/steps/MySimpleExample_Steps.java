package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class MySimpleExample_Steps {
    @Given("Nothing")
    public void nothing() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nothing");

    }

    @When("When I run the test")
    public void when_i_run_the_test() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I ran the test");
    }

    @Then("I printout {string}")
    public void i_printout(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hurray");
    }
}
