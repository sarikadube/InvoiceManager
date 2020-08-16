package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    public WebDriver driver;
    @Given("^The web page url \"([^\"]*)\"$")
    public void the_web_page_url(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);

    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String arg1){

    }

    @When("^I  enter password  \"([^\"]*)\"$")
    public void i_enter_password(String arg1){

    }

    @When("^I clieck login button$")
    public void i_clieck_login_button(){

    }

    @Then("^I should login$")
    public void i_should_login(){

    }
}
