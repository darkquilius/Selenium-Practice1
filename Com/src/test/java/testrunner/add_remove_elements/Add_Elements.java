package testrunner.add_remove_elements;

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

public class Add_Elements implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();
	
	@Given("I want to add some elements")
	public void I_want_to_add_some_elements() {
		driver.findElement(By.linkText("Add/Remove Elements")).click();
	}

	@When("I click the add elements button twice")
	public void I_click_the_add_elements_button_twice() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
	}

	@Then("two elements are added")
	public void two_elements_are_added() {
		List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));

		System.out.println(elementList.size());
		Assert.assertTrue(elementList.size() > 0);
	}
	
	@Before("@Add_Elements")
	public void beforeTest() {
		startUp(driver);
		System.out.println("doin startup for add");
	}

	@After("@Add_Elements")
	public void afterTest() {
		tearDown(driver);
		System.out.println("doin teardown for add");
	}

}
