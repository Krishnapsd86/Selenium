package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Alert alert = driver.switchTo().alert();
		// alert.accept();
		// alert.dismiss();

		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Hello Dear");
		driver.switchTo().alert().accept();
		String msgs = driver.findElement(By.id("result")).getText();
		System.out.println(msgs);

	}

}
