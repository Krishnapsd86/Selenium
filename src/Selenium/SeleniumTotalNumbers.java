package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTotalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
//
//		// getting the total number of iframe inside the page
//		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.get("https://www.webdriveruniversity.com/");

		List<WebElement> aList = driver.findElements(By.tagName("a"));

		System.out.println(aList.size());

		for (int i = 0; i < aList.size(); i++) {
			// System.out.println(aList.get(i).getText());
			System.out.println(aList.get(i).getAttribute("href"));
		}

		driver.close();

	}

}
