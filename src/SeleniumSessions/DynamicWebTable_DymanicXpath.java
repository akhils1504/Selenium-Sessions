package SeleniumSessions;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable_DymanicXpath {

	public static void main(String[] args)throws Exception {
    System.setProperty("webdriver.chrome.driver","C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    //Meathod 1
    
    driver.get("http://demo.guru99.com/test/web-table-element.php");
    String before_xpath ="/html/body/div/div[3]/div[1]/table/tbody/tr["; 
    String after_xpath= "]/td[1]/a";
    for(int i=1;i<=25;i++)
    {
    	String tabletext=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
    	System.out.println(tabletext);
    	if(tabletext.equals("Kwality"))
    			driver.findElement(By.xpath(before_xpath+i+after_xpath));
    }
    
    //Meathod 2: using preeceding sibiling concept
   //	By.xpath("/a[contains(text(),'Birla')]/parent::td//preceding-sibiling::td//input[@name='percentage']"))).click();
    
    

    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
    //means total element of child elements
    List<WebElement> suggest = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']/span"));
    System.out.println(suggest);
    for (int a=0;a<=suggest.size();a++){
   	System.out.println(suggest.get(a)).getText();
    if(suggest.get(a).getText().equals("Testing")){
    	suggest.get(a).click();
    	break;
    }
    
//  //a[text()='Login']
	//a[contains(text(),'Login')]--recommended
    //button[@type='button' and @class='xyz']
    
	}

	
}}}