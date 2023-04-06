package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay7A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
//IMP:	    Select class only applies to drop down with select as tagNAme
//      We need to pass select element to constructor
//      byValue , byIndex , byText
		
		// Select the element based on text 
		WebElement m1 = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropOne = new Select(m1);
		dropOne.selectByVisibleText("JAVA");
		
		// Select the element based on index
		WebElement m2 = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		Select dropOne1 = new Select(m2);
		dropOne1.selectByIndex(1);
		
		//Select the element by value
		WebElement m3 = driver.findElement(By.cssSelector("#dropdowm-menu-3"));
		Select dropOne2 = new Select(m3);
		dropOne2.selectByValue("css");
		
		//Print element value on console
		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropOn = new Select(e);
		dropOn.selectByValue("sql");
		Thread.sleep(2000);
		
		List <WebElement>  e1 = dropOn.getOptions();
		for(int i = 0 ; i < e1.size() ;i++) {
			System.out.println(e1.get(i).getText());
		}
		
		WebElement sel = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		Select dropTw = new Select(sel);
		dropTw.selectByValue("eclipse");
		List<WebElement> sel1 = dropTw.getOptions();
		for (int i = 0; i < sel1.size(); i++) {
			System.out.println(sel1.get(i).getText()); 
		}

	}

}
