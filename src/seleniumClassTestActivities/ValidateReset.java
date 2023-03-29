package seleniumClassTestActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateReset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement firstName =driver.findElement(By.cssSelector("input[name='first_name']"));
		firstName.sendKeys("Krishna");
		
		driver.findElement(By.cssSelector("input[type='reset']")).click();
		boolean emptyFields = firstName.getText().isEmpty();
		if(emptyFields) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		
		driver.close();

	}

}
