package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
				
			driver.get("https://www.spicejet.com/");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	        
			Thread.sleep(4000);
			
			Actions act= new Actions(driver);
	        act.moveToElement(driver.findElement(By.id("highlight-addons"))).perform();
	        Thread.sleep(5000);
	        driver.findElement(By.linkText("Seat + Meal Combo")).click();
	        
	        
            
	        
	        
	}

}
