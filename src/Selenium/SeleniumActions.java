package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		
		//Doubleclick
		Actions a = new Actions(driver);
		WebElement dc = driver.findElement(By.cssSelector("#double-click"));
		a.doubleClick(dc).build().perform();
		if (dc.getAttribute("class").equals("div-double-click double")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		
		//Drag and Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();
		if (drop.getAttribute("class").equals("ui-widget-header ui-droppable ui-state-highlight")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		
		//click and hold
		WebElement ch = driver.findElement(By.id("click-box"));
		a.clickAndHold(ch).build().perform();
		System.out.println(ch.getText());
		if (ch.getText().contains("Well done! keep holding that click now.....")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.close();

	}

}
