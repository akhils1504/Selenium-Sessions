package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarBy_JS {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(200000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        
        
        WebElement el=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
        String date="1-1-2000";
        SelectByJS(driver, el, date);
        
	}
   static void SelectByJS(WebDriver driver,WebElement el,String date)
   {
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   js.executeScript("argumnet[0].setAttribute('value','"+date+"');", el);
   }
}
