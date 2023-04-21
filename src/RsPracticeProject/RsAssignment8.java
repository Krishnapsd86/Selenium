package RsPracticeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsAssignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement auto = driver.findElement(By.cssSelector("input[class='inputs ui-autocomplete-input']"));
		auto.sendKeys("Ne");
		Thread.sleep(2000);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		
		
//		  driver.findElement(By.id("autocomplete")).sendKeys("ind");
//		    Thread.sleep(2000);
//		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		

	}

}
