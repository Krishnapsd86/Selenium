package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay6BC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		List<WebElement> ListVeg = driver.findElements(By.cssSelector("input[name='vegetable']"));
		for (int i = 0; i < ListVeg.size(); i++) {
			ListVeg.get(i).isEnabled();
		}
		for (WebElement ButtonEnable : ListVeg) {
			String Status = "[Disable]";
			boolean IsEnable = ButtonEnable.isEnabled();

			if (IsEnable) {
				Status = "[Enable]";
			}
			System.out.println("The radio button \"" + ButtonEnable.getAttribute("value") + "\" " + Status);
		}

		// Validate the Disable webelement "Orange"
		driver.findElement(By.id("fruit-selects")).click();
		WebElement Org = driver.findElement(By.cssSelector("option[value='orange']"));
		if (!(Org.isEnabled())) {
			System.out.println("Test case Pass Orange is Enable: " + Org.isEnabled());
		} else {
			System.out.println("Test case Fail Orange is Disable: " + Org.isEnabled());
		}
		driver.close();

	}

}
