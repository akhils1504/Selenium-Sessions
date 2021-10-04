package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.findElement(By.name("proceed")).click();
		
		
		//get text from pop up
		Alert pop=driver.switchTo().alert();
		System.out.println(pop.getText());
		Thread.sleep(5000);

		pop.accept();
		
		///Ask arun why handshake exceptio occurs
		
		
	}

}
