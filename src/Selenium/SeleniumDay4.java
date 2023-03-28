package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds until element is found
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//action
		WebElement userName =  driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement LoginButton = driver.findElement(By.className("oxd-button"));
		
		
		//assertion
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		LoginButton.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("h6[class*='oxd']")).getText();
		boolean displayLogo = driver.findElement(By.cssSelector("h6[class*='oxd']")).isDisplayed();
		if(displayLogo) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase Failed");
		}
		
		driver.close();

	}
	

}
