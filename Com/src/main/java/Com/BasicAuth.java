//package Com;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class BasicAuth implements WebDriver_Methods {
//	WebDriver driver = new ChromeDriver();
//	public Logger logger = LogManager.getLogger(Add_Remove_Elements.class);
//
//	@Test
//	public void passedAuth() {
//		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
//		
//		  try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		  
//		  String actual = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
//		  
//		  String expected = "Congratulations! You must have the proper credentials.";
//		  
//		  Assert.assertEquals(actual, expected);
//		  
//	}
//	
//	@Test
//	public void failedAuth() {
//		driver.get("http://derp:derp@the-internet.herokuapp.com/basic_auth");
//		
//		  try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		  
//		  String actual = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
//		  
//		  String expected = "Congratulations! You must have the proper credentials.";
//		  
//		  Assert.assertEquals(actual, expected);
//		  
//	}
//	
//	@BeforeTest
//	public void beforeTest() {
//		startUp(driver);
//	}
//
//	@AfterTest
//	public void afterTest() {
//		tearDown(driver);
//	}
//}
