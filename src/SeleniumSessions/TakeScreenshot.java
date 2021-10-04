package SeleniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {


	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
        
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		

		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//screenshots/1.png"));
		
		driver.quit();
		
		
	}

}
