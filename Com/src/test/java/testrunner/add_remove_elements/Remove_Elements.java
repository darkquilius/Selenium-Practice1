package testrunner.add_remove_elements;

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

public class Remove_Elements implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();
	List<WebElement> elementList = new ArrayList<WebElement>();

	@Given("I want to delete some added elements")
	public void I_want_to_delete_some_added_elements() {
		driver.findElement(By.linkText("Add/Remove Elements")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
	}

	@When("I click the delete button on each element")
	public void I_click_the_delete_button_on_each_element() {
		elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));

		elementList.forEach(e -> {
			e.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException c) {
				c.printStackTrace();
			}
		});
	}

	@Then("the elements are removed")
	public void the_elements_are_removed() {
		elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
		Assert.assertEquals(elementList.size(), 0);
	}
	
	@Before("@Remove_Elements")
	public void beforeTest() {
		startUp(driver);
		System.out.println("doin startup for delete");
	}

	@After("@Remove_Elements")
	public void afterTest() {
		tearDown(driver);
		System.out.println("doin teardown for delete");
	}

}