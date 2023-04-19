package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		
		//hover over element
		Actions a = new Actions(driver);
		WebElement ho = driver.findElement(By.cssSelector("div:nth-child(3) button:nth-child(1)"));
		a.moveToElement(ho).build().perform();
		WebElement Link = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[1]"));
		Link.click();
		if(driver.switchTo().alert().getText().contains("Well done you clicked on the link!")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.switchTo().alert().accept();
		
		//right click on element
		WebElement rc =driver.findElement(By.cssSelector("div[class='container']"));
		a.contextClick(rc).build().perform();
		driver.close();

	}

}
