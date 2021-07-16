package testrunner.methods_folder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface WebDriver_Methods {
	
	default void startUp(WebDriver driver) {
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	default void tearDown(WebDriver driver) {
		driver.quit();
	}

}
