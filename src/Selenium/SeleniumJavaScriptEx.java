package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJavaScriptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.webdriveruniversity.com");
		System.out.println(driver.getTitle());
		//title
		JavascriptExecutor js =(JavascriptExecutor) driver;
		String jsScript ="return document.title";
		String title =(String)js.executeScript(jsScript);
		System.out.println("With JS executor: "+title);
		//webelement
		String jsScript2 ="return document.querySelector('#contact-us')";
		WebElement Contact = (WebElement) js.executeScript(jsScript2);
		System.out.println(Contact.getText());
		
		driver.quit();
		
		

	}

}
