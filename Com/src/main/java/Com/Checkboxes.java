//package Com;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class Checkboxes implements WebDriver_Methods {
//	
//	WebDriver driver = new ChromeDriver();
//	
//	@Test(priority = 1)
//	public void testDefaultCheckboxes() {
//		driver.findElement(By.linkText("Checkboxes")).click();
//		
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
//		
//		Assert.assertFalse(checkboxes.get(0).isSelected());
//		Assert.assertTrue(checkboxes.get(1).isSelected());
//		
////		  try {
////				Thread.sleep(2000);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//	}
//	
//	@Test(priority = 2)
//	public void testChangedCheckboxes() {
//		
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='checkboxes']/input"));
//		
//		checkboxes.get(0).click();
//		checkboxes.get(1).click();
//		
//		  try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		Assert.assertFalse(checkboxes.get(1).isSelected());
//		Assert.assertTrue(checkboxes.get(0).isSelected());
//
//	}
//	
//	
//	@BeforeClass
//	  public void beforeTest() {
//		  startUp(driver);
//	  }
//
//	  @AfterClass
//	  public void afterTest() {
//		  tearDown(driver);
//	  }
//}
