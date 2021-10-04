package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblityText {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	WebDriver driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//span[@id='gh-ug-flex']/a")).click();
	
	//isDisplayed() applicable for all sort of meathods
	boolean displayed=driver.findElement(By.xpath("//*[@class='form-actions']/div/span/button")).isDisplayed();
	System.out.println("Button is displayed should be true "+ displayed);
	//is enabled is used to check wther its enabled or not
	boolean enabled=driver.findElement(By.xpath("//*[@class='form-actions']/div/span/button")).isEnabled();
	System.out.println("Button is not enabled "+ enabled);	
	
	
	
	driver.findElement(By.id("firstname")).sendKeys("First");
	driver.findElement(By.id("lastname")).sendKeys("Lastnameeee");
	driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("emaaaaillll");
	driver.findElement(By.id("password")).sendKeys("Pass@12.");
	
//	boolean enabled1=driver.findElement(By.xpath("//*[@class='form-actions']/div/span/button")).isEnabled();
//	System.out.println("Button is enabled should be true "+ enabled1);	
	
	//is selected is only applicable for radio,dropbox,checkbox
	boolean selected=driver.findElement(By.xpath("//input[@id='businessaccount-radio']")).isSelected();
	System.out.println("Button is selected should be false "+ selected);	
	
	
	}

}
