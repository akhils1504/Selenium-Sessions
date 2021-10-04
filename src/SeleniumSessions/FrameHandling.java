package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//right click and make sure Iframe is displayed to verify its having iframe inside window
		driver.get("http://demo.guru99.com/test/guru99home/"); 
		driver.findElement(By.id("fileupload")).sendKeys("C://Users//akhil.kumar//Desktop//Holiday List Trivandrum - 2021.pdf");


	}

}
m.sendKeys(Keys.ENTER);