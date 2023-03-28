package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Action 
//		driver.manage().window().maximize();
//		driver.findElement(By.id("userName")).sendKeys("Krishna001");
//		driver.findElement(By.id("password")).sendKeys("Test@123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		// Assertion 
		System.out.println(driver.findElement(By.cssSelector("div[id='app'] div div header div div span h6")).getText());
		boolean DisplayElements = driver.findElement(By.cssSelector("div[id='app'] div div header div div span h6")).isDisplayed();
		if (DisplayElements) {
			System.out.println("TestCase Passed");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.close();

	}

}
