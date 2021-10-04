package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindowPopup {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html"); 
		driver.findElement(By.xpath("//*[@class='btn btn-primary followeasy']")).click();
		
		Set <String> handler = driver.getWindowHandles();  //get all set of window handles and setting in a object
		//set dosent store value in the index form
		
		Iterator <String> it = handler.iterator(); //creating a itreator list
		
		String parentwindow= it.next();
		System.out.println("ParentWindow data"+ parentwindow);
		
		String childwindow = it.next();
		System.out.println("ChildWindowdata"+ childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println("Child pop up window"+driver.getTitle());
		
		driver.close(); //Very imp closing only child window
		driver.switchTo().window(parentwindow);
		System.out.println("Parent window title"+ driver.getTitle());

	}

}
