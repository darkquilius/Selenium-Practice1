package testrunner.checkboxes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import testrunner.methods_folder.WebDriver_Methods;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Default_CheckBoxes implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();
	
	List<WebElement> checkboxes = new ArrayList<WebElement>();
	
	@Given("I want to work with checkboxes")
	public void I_want_to_work_with_checkboxes() {
		startUp(driver);
		driver.findElement(By.linkText("Checkboxes")).click();
	}

	@When("I check the default settings")
	public void I_check_the_default_settings() {
		checkboxes = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
	}

	@Then("the first box is not enabled")
	public void the_first_box_is_not_enabled() {
		Assert.assertFalse(checkboxes.get(0).isSelected());
	}
	
	@And("the second box is enabled")
	public void the_second_box_is_enabled() {
		Assert.assertTrue(checkboxes.get(1).isSelected());
	}

	@After
	public void afterTest() {
		tearDown(driver);
	}

}
