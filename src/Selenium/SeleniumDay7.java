package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		


		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		List<WebElement> radioBttn = driver.findElements(By.cssSelector("input[name='color'"));
//		for (int i = 0; i < radioBttn.size(); i++) {
//			radioBttn.get(i).click();
//			
//			if (i<radioBttn.size()-1 && !radioBttn.get(i+1).isSelected()) {
//				System.out.println("Next Buttton is Not Selected");
//			}
//		}
		
		// iterate through every radio button in the group
		
		Iterator<WebElement> iterator = radioBttn.iterator();
		
		
		while (iterator.hasNext()) {
			// click on the radio button
			WebElement radioButton = iterator.next();
			radioButton.click();
			Thread.sleep(2000);

			// check if the next radio button is not already selected
			if (iterator.hasNext() && !iterator.next().isSelected()) {
				System.out.println("Next radio button is not selected.");
			}
            System.out.println("Radio Button is selected");
		}
		
		// radio buttons
		//getAttribute
		WebElement box3 = driver.findElement(By.id("radio-buttons"));
		List <WebElement> rd = box3.findElements(By.cssSelector("input[type='radio']"));
		for(int i = 0 ; i < rd.size() ; i++) {
			System.out.println(rd.get(i).getAttribute("value"));
			rd.get(i).click();
		}
		
		//checkbox
		List <WebElement> cb = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for(int i = 0 ; i < cb.size() ; i++) {
			if(cb.get(i).isSelected()) {
				System.out.println("Already selected");
			}
			else {
				cb.get(i).click();
			}
		}
		
		for(int i = 0 ; i < cb.size() ; i++) {
			System.out.println(cb.get(i).isSelected());
			
		}
		driver.close();

	}

}
