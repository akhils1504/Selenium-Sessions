package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/");
        clickonVisible(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")), 30);
	}
	
	
	public static void clickonVisible(WebDriver driver, WebElement el, int timeout)
	{
	    new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until((ExpectedConditions.elementToBeClickable(el)));
	
		//stale is not mandatory 
		el.click();
	}

}
WebDriverWait wait=new WebDriverWait(driver, 20);
WebElement guru99seleniumlink;
guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
guru99seleniumlink.click();