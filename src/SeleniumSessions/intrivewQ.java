package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class intrivewQ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//akhil.kumar//Desktop//selenium-java-3.141.59//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		List<WebElement> outer = driver.findElements(By.xpath("//div[@class='row featured-boxes']/div"));

		for (int i = 1; i <= outer.size(); i++) {
			List<WebElement> headers = driver
					.findElements(By.xpath("//div[@class='row featured-boxes']/div[" + i + "]/div/h4/b"));
			// System.out.println(i+"--"+headers.size());
			for (int j = 1; j <= headers.size(); j++) {
				List<WebElement> list = driver.findElements(
						By.xpath("//div[@class='row featured-boxes']/div[" + i + "]/div/ul[" + j + "]//a"));
				System.out.println(headers.get(j - 1).getText());
				for (WebElement element : list) {
					System.out.println(element.getText());

				}

			}

		}

		driver.quit();

	}

}
