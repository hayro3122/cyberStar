import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\SeleniumCyberSelcukProject\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/");
		
		//driver.findElement(By.cssSelector("body > div > div > li:nth-child(5) > a"));
		//driver.navigate().back();
		List<WebElement> allElement= driver.findElements(By.cssSelector(".jumbotron-fluid a"));
		
		for (WebElement webElement : allElement) {
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}

}
