package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsepopup {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://html.com/input-type-file/"); 
			driver.findElement(By.id("fileupload")).sendKeys("C://Users//akhil.kumar//Desktop//Holiday List Trivandrum - 2021.pdf");
      //Never click on Browse button 
			///Only only work when <type> File should be as attribute
	}

}
