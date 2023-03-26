package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Action 
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("krishna");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		// Assertion 
		System.out.println(driver.findElement(By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text")).getText());
		boolean DisplayElements = driver.findElement(By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text")).isDisplayed();
		if (DisplayElements) {
			System.out.println("TestCase Passed");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.close();
		

	}

}
