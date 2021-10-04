package testNg_Sesssions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod //Prerequistee
	public void setUp()	{
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http:///www.google.com");
	}
	
	@Test(priority=1,groups="Smoke")
	public void title(){
	String gg=driver.getTitle();
	System.out.println(gg);
	}
	
	@Test(priority=2,groups="Regression")
	public void logoTest(){
	boolean baa=driver.findElement(By.id("hplogo")).isDisplayed();	
	System.out.println(baa);	
	}
    @Test(priority=3)
    public void linkVisible(){
    boolean visi=driver.findElement(By.linkText("Gmail")).isDisplayed();	
    System.out.println(visi);
    }
    
	
	
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
