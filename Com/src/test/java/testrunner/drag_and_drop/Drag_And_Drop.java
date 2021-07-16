package testrunner.drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.methods_folder.WebDriver_Methods;

public class Drag_And_Drop implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();
	
	WebElement firstColumn;
	WebElement secondColumn;
	
	@Given("I want to drag and drop A to B")
	public void I_want_to_drag_and_drop_A_to_B() {
		driver.findElement(By.linkText("Drag and Drop")).click();
		firstColumn = driver.findElement(By.id("column-a"));
		secondColumn = driver.findElement(By.id("column-b"));
	}

	@When("I drag and drop A to B")
	public void I_drag_and_drop_A_to_B() {
		Actions action = new Actions(driver);
		
		action.dragAndDrop(secondColumn, firstColumn).build().perform();
	}

	@Then("A and B switch spots")
	public void A_and_B_switch_spots() {
		String firstColumnText = driver.findElement(By.xpath("//*[@id=\"column-a\"]/header")).getText().toLowerCase();
		
		Assert.assertEquals(firstColumnText, "b");
		
		String secondColumnText =driver.findElement(By.xpath("//*[@id=\"column-b\"]/header")).getText().toLowerCase();
		Assert.assertEquals(secondColumnText, "a");
	}
	
	@Before("@Drag_And_Drop")
	public void beforeTest() {
		startUp(driver);
	}

	@After("@Drag_And_Drop")
	public void afterTest() {
		tearDown(driver);
	}

}
