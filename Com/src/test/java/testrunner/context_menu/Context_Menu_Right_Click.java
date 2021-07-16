package testrunner.context_menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import testrunner.methods_folder.WebDriver_Methods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Context_Menu_Right_Click implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();

	WebElement hotspot;

	@Given("I want to access the context menu")
	public void I_want_to_access_the_context_menu() {
		driver.findElement(By.linkText("Context Menu")).click();
		hotspot = driver.findElement(By.id("hot-spot"));
	}

	@When("I right click the context menu")
	public void I_right_click_the_context_menu() {
		Actions action = new Actions(driver);

		action.contextClick(hotspot).build().perform();
	}

	@Then("the context menu is accessed")
	public void the_context_menu_is_accessed() {

		String actual = driver.switchTo().alert().getText();

		System.out.println(actual);

		String expected = "You selected a context menu";

		Assert.assertEquals(actual, expected);
	}
	
	@Before("@Context_Menu_Right_Click")
	public void beforeTest() {
		startUp(driver);
	}

	@After("@Context_Menu_Right_Click")
	public void afterTest() {
		tearDown(driver);
	}
}
