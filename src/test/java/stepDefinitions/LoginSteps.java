package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps { 
    WebDriver driver;

    @Given("User is an adactin page")
    public void user_is_an_adactin_page() { 
        driver = new ChromeDriver();
        driver.get("http://www.adactin.com/HotelApp/");
    } 

    @When("User enter {string} and {string} and click login button")
    public void user_enter_and_and_click_login_button(String Username, String Password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("Gaur");  // ✅ Using Parameters
        driver.findElement(By.id("password")).sendKeys("Manan");  // ✅ Using Parameters
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
    } 

    @Then("Message displayed Login Successfully")
    public void message_displayed_Login_Successfully() { 
        driver.quit(); 
    } 
}
