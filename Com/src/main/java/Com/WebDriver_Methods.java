//package Com;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//
//public interface WebDriver_Methods {
//	
//	default void startUp(WebDriver driver) {
//		driver.get("https://the-internet.herokuapp.com/");
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
//	}
//	
//	default void tearDown(WebDriver driver) {
////		reports.endTest(test);
////		reports.flush();
//		driver.quit();
//	}
//
//}
