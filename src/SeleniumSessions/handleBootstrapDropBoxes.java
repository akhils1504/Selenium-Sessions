package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBootstrapDropBoxes {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
	    
	    driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	    List <WebElement> list_1 = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
	    System.out.println(list_1.size());
	    for(int a=0;a<list_1.size();a++){
	    	System.out.println(list_1.get(a).getText());
	    if(list_1.get(a).equals("Actions")){
	    	list_1.get(a).click();
	        break;
	        
	    }
	    }
	    
	    

	}

}
