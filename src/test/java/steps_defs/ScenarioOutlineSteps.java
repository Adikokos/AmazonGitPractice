package steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
    @Given("user is on Facebook")
    public void user_is_on_facebook() {

    }
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        System.out.println("User enter" + email + "on email field");

    }
    @When("user enter {string}")
    public void user_enter(String password) {
        System.out.println("Password is " + password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("User clicked login button");

    }
    @Then("user should see {string}")
    public void user_should_see(String string) {
        System.out.println("Message");

    }

}
