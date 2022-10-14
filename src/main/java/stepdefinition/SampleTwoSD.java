package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTwoSD {

    @Given("^I am on login page of billing$")
    public void i_am_on_login_page_of_billing() throws Throwable {
        System.out.println("I am on login page of billing");
    }

    @When("^I enter valid username as and password$")
    public void i_enter_valid_username_as_and_password() throws Throwable {
        System.out.println("I enter valid username as and password");
    }

    @When("^I enter invalid username as and password$")
    public void i_enter_invalid_username_as_and_password() throws Throwable {
        System.out.println("I enter invalid username as and password");
    }

    @When("^I keep username as and password blank$")
    public void i_keep_username_as_and_password_blank() throws Throwable {
        System.out.println("I keep username as and password blank");
    }

    @Then("^I should reach to home page of billing$")
    public void i_should_reach_to_home_page_of_billing() throws Throwable {
        System.out.println("I should reach to home page of billing");
    }

    @Then("^I should get error on billing page$")
    public void i_should_get_error_on_billing_page() throws Throwable {
        System.out.println("I should get error on billing page");
    }

    @And("^I click on login button of billing$")
    public void i_click_on_login_button_of_billing() throws Throwable {
        System.out.println("I click on login button of billing");
    }


}
