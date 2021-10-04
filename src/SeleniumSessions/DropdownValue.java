package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValue {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.findElement(By.linkText("register")).click();
				try {
					Thread.sleep(12);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			driver.findElement(By.id("businessaccount-radio")).click();
			//tag will be select
			Select drp= new Select(driver.findElement(By.id("businessCountry")));
			drp.selectByVisibleText("India");			

	}

}
