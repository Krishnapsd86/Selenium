package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Simple alert
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.findElement(By.id("button1")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		//Confirmation Alert
		
		driver.findElement(By.id("button4")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("confirm-alert-text")).getText());
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("button2")).click();
		Thread.sleep(3000);
		String PopMsg = driver.findElement(By.cssSelector("h4[class='modal-title']")).getText();
		System.out.println(PopMsg);
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		driver.close();
		
		//Prompt Alert
		
		

	}

}
