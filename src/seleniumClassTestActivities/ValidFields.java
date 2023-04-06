package seleniumClassTestActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement firstName =driver.findElement(By.cssSelector("input[name='first_name']"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name='last_name']"));
		WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement comment = driver.findElement(By.cssSelector("textarea[name='message']"));
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		
		
		
		//valid
		firstName.sendKeys("Krishna");
		lastName.sendKeys("Thapaliya");
		emailAddress.sendKeys("krishnapsd.thapaliya@gmail.com");
		comment.sendKeys("I am writing Selenium");
		submit.click();
		boolean displayMsg = driver.findElement(By.cssSelector("div[id='contact_reply']")).isDisplayed();
		System.out.println(driver.findElement(By.cssSelector("div[id='contact_reply']")).getText());
		if(displayMsg) {
			System.out.println("TestCase passed");
		}else {
			System.out.println("Testcase failed");
		}
		driver.close();
		
		
		//# Scroll down the page
//				d.findElement(By.tagName("Body")).sendKeys(Keys.END);
//				d.findElement(By.cssSelector("a[id=\"popup-alerts\"]")).sendKeys(Keys.PAGE_DOWN);
//				Thread.sleep(5000);
//				
//				//# Scroll upto the element using JavaScript	
//				WebElement Ele = d.findElement(By.cssSelector("a[id=\"popup-alerts\"]"));
//				d.executeScript("arguments[0].scrollIntoView();", Ele);
//				
//				//# Scroll up the page
//				d.findElement(By.tagName("Body")).sendKeys(Keys.HOME);
//				Thread.sleep(5000);
//
//				d.close();

	}

}
