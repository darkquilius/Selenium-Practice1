//package Com;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//
//public class Add_Remove_Elements implements WebDriver_Methods {
//	
//	WebDriver driver = new ChromeDriver();
//	public Logger logger = LogManager.getLogger(Add_Remove_Elements.class);
////	public ExtentReports reports;
////	public ExtentTest test;
//  @Test
//  public void addingElements() {
//	  driver.findElement(By.linkText("Add/Remove Elements")).click();
//	  
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//	
//	List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
//	
//	System.out.println(elementList.size());
//	Assert.assertTrue(elementList.size() > 0);
//	
//	  try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//  }
//  
//  @Test
//  public void deletingElements() {
//	  List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
//	  
//	  elementList.forEach(e -> {
//		  e.click();
//		  try {
//				Thread.sleep(2000);
//			} catch (InterruptedException c) {
//				// TODO Auto-generated catch block
//				c.printStackTrace();
//			}
////		  elementList.remove(e);
//	  });
//	  
//	  elementList = driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
//	  
//	  System.out.println(elementList.size());
//	Assert.assertEquals(elementList.size(), 0);
//	
//	  try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  
//  }
////  
////  @BeforeClass
////  public void beforeTest() {
////	  startUp(driver);
////  }
////
////  @AfterClass
////  public void afterTest() {
////	  tearDown(driver);
////  }
//
//}
