package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Browser
		//Chrome ->chromeDriver->Methods 
		//Firefox ->fireFoxDriver->Methods 
		//Edge and so on
		
		//chromedriver.exe--> chrome browser[without exe file we can't invoke browser]
		
		//webdriver.chrome.driver-->need to value of path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    

	}

}
