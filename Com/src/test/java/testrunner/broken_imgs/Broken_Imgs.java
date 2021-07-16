package testrunner.broken_imgs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testrunner.methods_folder.WebDriver_Methods;

public class Broken_Imgs implements WebDriver_Methods {

	WebDriver driver = new ChromeDriver();

	List<Integer> hashList = new ArrayList<Integer>();
	List<WebElement> imgList = new ArrayList<WebElement>();

	boolean result = true;

	@Given("I want to check for broken images")
	public void I_want_to_check_for_broken_images() {
		driver.findElement(By.linkText("Broken Images")).click();
	}

	@When("I make a list of images")
	public void I_make_a_list_of_images() {
		imgList = driver.findElements(By.xpath("//*[@id=\'content\']/div/img"));
	}

	@And("check them for broken images")
	public void check_them_for_broken_images() {

		for (WebElement img : imgList) {
			int width = Integer.valueOf(img.getAttribute("naturalWidth"));

			if (width == 0){
				hashList.add(img.hashCode());
				result = false;
			}

		}
	}

	@Then("there are no broken images")
	public void there_are_no_broken_images() {

		if (hashList.size() != 0) {
			for (Integer hash : hashList) {
				System.out.println("Broken image hashcode: " + hash);
			}
		}

		Assert.assertTrue(result);
	}
	
	@Before("@Broken_Imgs")
	public void beforeTest() {
		startUp(driver);
	}

	@After("@Broken_Imgs")
	public void afterTest() {
		tearDown(driver);
	}
}
