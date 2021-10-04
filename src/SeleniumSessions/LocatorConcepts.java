package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
    String title=driver.getTitle();
    System.out.println(title);
    //Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
    
    //using linktext 
    driver.findElement(By.linkText("register")).click();
    //if id is there---(#id)
    //if class is there---(.classname)
    driver.findElement(By.cssSelector("#firstname")).sendKeys("Hellooo");
    
    
//    driver.quit();
  
    
	}
}