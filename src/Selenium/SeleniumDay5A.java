package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
//		driver.get("http://www.webdriveruniversity.com/");
//		driver.findElement(By.cssSelector("a[id*='dropdown']")).click();
//		if(driver.findElement(By.cssSelector("a[id*='dropdown']")).isDisplayed()) {
//			System.out.println("pass");
//		}else {
//			System.out.println("Fail");
//		}
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean Disable = driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
		boolean Enable = driver.findElement(By.cssSelector("input[value='lettuce']")).isEnabled();
		System.out.println(Disable);
		System.out.println(Enable);
		
		driver.findElement(By.cssSelector("input[value='blue']")).click();
		boolean isSel = driver.findElement(By.cssSelector("input[value='blue']")).isSelected();
		boolean notSel = driver.findElement(By.cssSelector("input[value='orange']")).isSelected();
		System.out.println(isSel);
		System.out.println(notSel);
		
		

	}

}
