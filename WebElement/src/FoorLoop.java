import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoorLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\SeleniumCyberSelcukProject\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://formy-project.herokuapp.com/");
		
		List<WebElement> all= driver.findElements(By.cssSelector(".jumbotron-fluid a"));
		all.get(2).click();
		List<WebElement> check= driver.findElements(By.cssSelector(".col-sm-8 input"));//check yaptirmak icin
		List<WebElement> check1= driver.findElements(By.cssSelector(".col-sm-8"));//check lerin get text almak icin
		
		for (int i = 0; i < check.size(); i++) {
			check.get(i).click();
			System.out.println(check.get(i).getText());
		}
		for (int i = 0; i < check1.size(); i++) {
			check1.get(i).click();
			System.out.println(check1.get(i).getText());
		}
		
//List<WebElement> allElement=driver.findElements(By.cssSelector(".jumbotron-fluid>li>a"));
		
		WebElement box= driver.findElement(By.cssSelector(".jumbotron-fluid"));
		List<WebElement> links=box.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			
			box= driver.findElement(By.cssSelector(".jumbotron-fluid"));
			links=box.findElements(By.tagName("a"));
	//List<WebElement> allElement=driver.findElements(By.cssSelector(".jumbotron-fluid>li>a"));
			
		}
		driver.quit();
	}
	}

