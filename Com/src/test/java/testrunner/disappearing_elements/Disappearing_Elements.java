package testrunner.disappearing_elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.methods_folder.WebDriver_Methods;

public class Disappearing_Elements implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();
	
	List<WebElement> elementList = new ArrayList<WebElement>();
	
	@Given("I want all elements to be there")
	public void I_want_all_elements_to_be_there() {
		driver.findElement(By.linkText("Disappearing Elements")).click();
	}

	@When("I check if the elements are there")
	public void I_check_if_the_elements_are_there() {
		elementList = driver.findElements(By.tagName("a"));
	}

	@Then("all elements are present")
	public void all_elements_are_present() {
		String actual = elementList.get(elementList.size() - 2).getText();
		String expected = "Gallery";
		
		Assert.assertEquals(actual, expected);
	}
	
	@Before("@Disappearing_Elements")
	public void beforeTest() {
		startUp(driver);
	}

	@After("@Disappearing_Elements")
	public void afterTest() {
		tearDown(driver);
	}
}
