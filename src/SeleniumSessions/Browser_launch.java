package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Google"))
		System.out.println("Ellammmmm pass Ayii");
	driver.quit();

	}

}
