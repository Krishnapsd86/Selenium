package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("http://www.webdriveruniversity.com");
		driver.findElement(By.id("contact-us")).click();
		String main = driver.getWindowHandle();
		Set<String> second = driver.getWindowHandles();
		Iterator<String> s = second.iterator();
		while (s.hasNext()) {
			String child_second = s.next();
			if (! main.equals(child_second)) {
				driver.switchTo().window(child_second);
				
				if (driver.getTitle().contains("WebDriver | Contact Us")) {
					System.out.println("TestCase Pass");
				}else {
					System.out.println("TestCase Fail");
				}
//				if (child_second != null) {
//					System.out.println("TestCase Pass");
//				}else {
//					System.out.println("TestCase Fail");
//				}
			}
			
		}
	}

}
