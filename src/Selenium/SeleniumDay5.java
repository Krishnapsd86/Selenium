package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Database     ------ API    ----------- UI(html , css , javascript)
		 html hypertext markup language 
		 css
		 javascript
		 element - html elements
		 html will attribute and value 
		 on user actions 
		 element are created , updated , retrieve and deleted
		 based on user action 
		 html element's attribute are created , updated , retrive , deleted
		 */
		//Arrange
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds untill element is found
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//action
		WebElement firstName= driver.findElement(By.name("first_name"));
		WebElement lastName=driver.findElement(By.name("last_name"));
		WebElement email=driver.findElement(By.name("email"));
		WebElement comment=driver.findElement(By.name("message"));
		WebElement submitButton=driver.findElement(By.cssSelector("input[type='submit']"));
		
		//assertion
		//sendKeys-->Allow to type content into the editable fields(input/textarea)
		firstName.sendKeys("Krishna");
		lastName.sendKeys("Thapaliya");
		email.sendKeys("krishnathapaliya");
		comment.sendKeys("I am learning Selenium with Java");
		submitButton.submit();
		//or
		//submitButton.click();
		String error = driver.findElement(By.cssSelector("body")).getText();
		if (error.contains("Invalid email address")) {
			System.out.println("Testcase Pass matches "+error);
		}else {
			System.out.println("TestCase Fail check for : "+error);
		}
		driver.close();
		

	}

}
