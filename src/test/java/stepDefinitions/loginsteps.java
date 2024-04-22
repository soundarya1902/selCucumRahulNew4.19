package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class loginsteps {
    private  static WebDriver driver=null;
    @Given("user is on landingpage")
    public void user_is_on_landingpage() {
        driver = WebDriverManager.chromedriver().create();
    }
    @When("user login with valid credentails")
    public void user_login_with_valid_credentails() {

    }
    @Then("User should be able to login succesfully")
    public void user_should_be_able_to_login_succesfully() {

    }

}
