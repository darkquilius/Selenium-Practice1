package testrunner.basic_auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.methods_folder.WebDriver_Methods;

public class Basic_Auth_Fail implements WebDriver_Methods{
	WebDriver driver = new ChromeDriver();
	
	@Given("I want to fail authorization")
	public void I_want_to_fail_authorization() {
		startUp(driver);
	}
	
	@When("I give incorrect creds through the http req")
	public void i_give_incorrect_creds_through_the_http_req() {
		driver.get("http://derp:derp@the-internet.herokuapp.com/basic_auth");
		
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Then("i am not given authorization")
	public void i_am_not_given_authorization() {
		
		if(driver.findElements(By.xpath("//*[@id='content']/div/p")).size() > 0) {
		  String actual = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
		  
		  String expected = "Congratulations! You must have the proper credentials.";
		  
		  boolean isFalse = actual.equals(expected);
		  
		  Assert.assertFalse(isFalse);
		}
		else Assert.assertTrue(false);
	}

	@After
	public void afterTest() {
		tearDown(driver);
	}
}