package RsPracticeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSassignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		driver.findElement(By.id("checkBoxOption1")).click();
//		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());//false
		driver.findElement(By.id("checkBoxOption1")).click();
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	

	}

}
