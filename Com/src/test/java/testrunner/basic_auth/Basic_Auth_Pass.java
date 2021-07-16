package testrunner.basic_auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import testrunner.methods_folder.WebDriver_Methods;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basic_Auth_Pass implements WebDriver_Methods {
	WebDriver driver = new ChromeDriver();
	
	@Given("I want to gain authorization")
	public void I_want_to_gain_authorization() {
		startUp(driver);
	}
	
	@When("I give the correct creds through the http req")
	public void I_give_the_correct_creds_through_the_http_req() {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Then("i am given authorization")
	public void i_am_given_authorization() {
		  String actual = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		  
		  String expected = "Congratulations! You must have the proper credentials.";
		  
		  Assert.assertEquals(actual, expected);
	}

	@After
	public void afterTest() {
		tearDown(driver);
	}
}