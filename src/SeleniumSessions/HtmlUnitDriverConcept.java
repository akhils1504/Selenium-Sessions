package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	//WebDriver driver= new ChromeDriver();
		//Advantage
		//No Browser
		//Very fast exceution,hence perfomance is very fast Fast
		//not suitable for action class,mouse movenemnt ,drag and drop
		WebDriver driver =new HtmlUnitDriver(); 
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	
		
        driver.navigate().to("https://www.flipkart.com/");
        System.out.println(driver.getTitle());        
//        driver.findElement(By.xpath("//*[@class='_1psGvi _3BvnxG']/div/a")).click();
        
	}

}
