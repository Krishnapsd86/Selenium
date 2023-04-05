package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		WebElement GetTxt = driver.findElement(By.cssSelector("h2"));
//		String txt = GetTxt.getText();
//		if (txt.contains("CONTACT US")) {
//			System.out.println("TestCase Pass Text : "+" "+txt);
//		}else {
//			System.out.println("TestCase Fail");
//		}
//		
//		WebElement firstName = driver.findElement(By.name("first_name"));
//		String Tagnm =firstName.getTagName();
//		if (Tagnm.contains("input")) {
//			System.out.println("TestCase Pass TagName :"+" "+Tagnm);
//		}else {
//			System.out.println("TestCase Fail");
//		}
		
		driver.get("https://www.google.com/");
		WebElement logo=driver.findElement(By.cssSelector("img[alt='Google']"));
		Dimension dm =logo.getSize();
		System.out.println("Height & width of logo in WebElement :"+dm);
		System.out.println(dm.height);
		System.out.println(dm.width);
		
		WebElement logo1=driver.findElement(By.cssSelector("img[alt='Google']"));
		Point p= logo1.getLocation();
		System.out.println("Location(x,y)Point of logo in webElement : "+p);
		System.out.println(p.x);
		System.out.println(p.y);
		
		WebElement logo2=driver.findElement(By.cssSelector("img[alt='Google']"));
		String Att =logo2.getAttribute("src");
		System.out.println(Att);
		
		WebElement logo3=driver.findElement(By.cssSelector("img[alt='Google']"));
		String cssVal=logo3.getCssValue("max-width");
		System.out.println(cssVal);

	}

}
