package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        driver.get("https://www.ebay.com/");
        //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("oneeeee");
        ////arun        driver.findElement(By.xpath("//input[contains(@id,'gh-tb ui-autocomplete-input')]")).sendKeys("Two");
        /////arun   driver.findElement(By.xpath("/input[contains(@type,'text')]")).sendKeys("thereeeee");
        ////arun   driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("Fourrrr");
        ////arun    driver.findElement(By.xpath("//input[ends-with(@type,'ext')]")).sendKeys("Fiveee");
        //driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        Xpath=//td[text()='UserID']	
        		Xpath=//input[@type='submit' and @name='btnLogin']
	}

}
