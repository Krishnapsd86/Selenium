package seleniumClassTestActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		List<WebElement> TotalItem =driver.findElements(By.cssSelector(".inventory_item_name"));
		System.out.println(TotalItem.size());
		
//		for (int i = 0; i < TotalItem.size(); i++) {
//			String ListName =TotalItem.get(i).getText();
//			System.out.println(ListName);
//			
//		}
		

	}

}
