package SeleniumSessions;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readPropertyFile {
	static WebDriver driver;//static is used to allocate memory allocation is one per class

	public static void main(String[] args) throws Exception {//ithinte defintion tye static aane so we need to declare gloabla varaibale as static

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C://Users//akhil.kumar//workspace//Study//src//SeleniumSessions//config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		String brwname = prop.getProperty("browser");
		System.out.println(brwname);
		if (brwname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			driver = new ChromeDriver();
			// driver.get(prop.getProperty("url"));
		} else if (brwname.equals("FF")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			driver = new FirefoxDriver();
		} else if (brwname.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("Signin"))).click();
		driver.findElement(By.xpath(prop.getProperty("FirstName"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("LastName"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("email"));
//		Test.c= 50;
//		Test value1= new Test(10,20),value2=new Test(20, 30);
//		value1.c=1;value2.c=2;
//		System.out.println(value1.c);
//		
//		System.out.println(value2.c);
		
	}

}

//class Test {
//	private int a, b;
//	static int c;
//
//	public Test(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}
//
//	public int sum() {
//		return (a + b);
//
//	}
//
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public int getB() {
//		return b;
//	}
//
//	public void setB(int b) {
//		this.b = b;
//	}
//
//}
