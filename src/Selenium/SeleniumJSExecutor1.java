package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJSExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement e =driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(e);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsScript3 = "myFunction()";
		js.executeScript(jsScript3);
		if(driver.switchTo().alert().getText().contains("Hello! I am an alert box!")){
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
