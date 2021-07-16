//package Com;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class ContextMenuRightClick implements WebDriver_Methods {
//	
//	WebDriver driver = new ChromeDriver();
//	
//	 @Test
//	  public void addingElements() {
//		  driver.findElement(By.linkText("Context Menu")).click();
//		  
//		  WebElement hotspot = driver.findElement(By.id("hot-spot"));
//		  
//		  Actions action = new Actions(driver);
//		  
//		  action.contextClick(hotspot).build().perform();
//		  
//		  try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		  
//		  String actual = driver.switchTo().alert().getText();
//		  
//		  System.out.println(actual);
//		  
//		  String expected = "You selected a context menu";
//		  
//		  Assert.assertEquals(actual, expected);
//	 }
//	
//	 @BeforeClass
//	  public void beforeTest() {
//		  startUp(driver);
//	  }
//
//	  @AfterClass
//	  public void afterTest() {
//		  tearDown(driver);
//	  }
//
//}
