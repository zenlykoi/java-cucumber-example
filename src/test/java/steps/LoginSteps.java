package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
  @Given("browser is open")
  public void browser_is_open() {
    System.out.println("browser_is_open");
  }
  @Given("user in login page")
  public void user_in_login_page() {
    System.out.println("user_in_login_page");
  }
  @When("enter username and password")
  public void enter_username_and_password() {
    System.out.println("enter_username_and_password");
  }
  @When("click login button")
  public void click_login_button() {
    System.out.println("click_login_button");
  }
  @Then("user is navigated to home page")
  public void user_is_navigated_to_home_page() {
    System.out.println("user_is_navigated_to_home_page");
  }
}
