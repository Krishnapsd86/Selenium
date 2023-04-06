package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay6AButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement Green = driver.findElement(By.cssSelector("input[value='green'"));
		WebElement Blue = driver.findElement(By.cssSelector("input[value='blue'"));
		Green.click();
		if (Green.isSelected()) {
			System.out.println("TestCase Pass");
			if (!(Blue.isSelected())) {
				System.out.println("TestCase Pass Blue");
			} else {
				System.out.println("TestCase Fail");
			}
		}

		List<WebElement> Rbutton = driver.findElements(By.cssSelector("input[name='color']"));
		for (int i = 0; i < Rbutton.size(); i++) {
			Rbutton.get(i).click();

			Thread.sleep(2000);
			for (WebElement rb : Rbutton) {
				String ButtonStatus = "(Unselected)";
				boolean Isselected = rb.isSelected();

				if (Isselected) {
					ButtonStatus = "(Selected)";
				}
				System.out.println("The radio button " + rb.getAttribute("value") + " " + ButtonStatus);
			}
		}

		driver.close();

	}

}
