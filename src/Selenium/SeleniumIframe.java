package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		//with webelement
		WebElement page1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(page1);
		boolean page= driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
		if (page) {
			System.out.println("TestCase pass");
		}else {
			System.out.println("TestCase fail");
		}
		
		//with index
		driver.switchTo().frame(1);
		//with id or Name
		//WebElement byId = driver.findElement(By.id("iframeResult"));
		//WebElement byName = driver.findElement(By.name("iframeResult"));


	}

}
