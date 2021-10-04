package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsconcepts {

		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.get("https://www.ebay.com/");
	        
	        //to fetch all the href list
	        
	        List <WebElement> list= driver.findElements(By.tagName("a"));
	        //size of array list
	        System.out.println(list.size());
	        ///print all hyperlinks
	        for(int i=0;i<list.size();i++)
	        	System.out.println(list.get(i).getText());
	        
	        //to fetch all the buttons availabe
	        List <WebElement> btn= driver.findElements(By.tagName("button"));
	        System.out.println(btn.size());

	        //to fetch all the input textboxes availabe
	        
	        List <WebElement> txt= driver.findElements(By.tagName("input"));
	        System.out.println(txt.size());
	        driver.quit();

	}

}
