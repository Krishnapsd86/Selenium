package seleniumClassTestActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuapp {

	public static void main(String[] args) {
		
		//https://Username:password@url
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		String successMsgs =driver.findElement(By.cssSelector("p")).getText();
		System.out.println(successMsgs);
		

	}

}
