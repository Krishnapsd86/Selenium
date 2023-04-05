package seleniumClassTestActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		
		//Validate the title
		if(driver.getTitle().contains("ParaBank")) {
			System.out.println("TestCase Pass");
			
		}else {
			System.out.println("TestCase Fail");
		}
		
		//validate the current Url
		String Url = driver.getCurrentUrl();
		System.out.println("Current Url is:"+Url);
		
		//use all the locators for any elements on the pages
		driver.findElement(By.name("username")).sendKeys("Krishna");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		driver.findElement(By.className("input")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		boolean topPanel =driver.findElement(By.id("topPanel")).isDisplayed();
		if (topPanel) {
			System.out.println("TestCase Pass ");
		}
		else {
			System.out.println("TestCase Fail ");
		}
		boolean CustomerL =driver.findElement(By.tagName("h2")).isDisplayed();
		if (CustomerL) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
    	
		
		
		driver.findElement(By.linkText("Forgot login info?")).click();
		driver.findElement(By.partialLinkText("info?")).click();
		
		

		driver.close();
	}

}
