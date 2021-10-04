package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class javascriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//span[@id='gh-ug-flex']/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("First");
		driver.findElement(By.id("lastname")).sendKeys("Lastnameeee");
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("emaaaaillll");
		driver.findElement(By.id("Email")).sendKeys("Pass@123.");
		//see the pendingvedio...Not completed 
	//	https://www.youtube.com/watch?v=Dpx1Q62QpFU&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=14&ab_channel=NaveenAutomationLabs
		
		javascriptExecutor js= (javascriptExecutor)driver;
		js.executeScript("document.getElementById('enter element id').click();");

		//https://www.lambdatest.com/blog/how-to-use-javascriptexecutor-in-selenium-webdriver/
		
	}

}
