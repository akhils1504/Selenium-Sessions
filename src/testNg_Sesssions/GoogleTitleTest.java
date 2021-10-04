package testNg_Sesssions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
	System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}
	
	@Test()
	public void title(){
		String tit=driver.getTitle();
		assertEquals(tit, "Google","Thettti poyi");
	
	}
	
	@Test(dependsOnMethods="title")
	public void logoTest(){
		boolean baa=driver.findElement(By.linkText("Gmail")).isDisplayed();	
		assertEquals(baa, true);

	}
	
	@AfterMethod
	public void tear(){
	driver.quit();
	}

}
