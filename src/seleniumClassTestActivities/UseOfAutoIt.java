package seleniumClassTestActivities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfAutoIt {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*Integrating AutoIT with Selenium

		//Shift focus to the file upload windows
		//set text/path into file name edit box
		//click open to upload file

		Au3info- record window component objects
		Build Script -scite.exe
		Save it- .au3 extenstion
		Convert file into .exe by compiling .au3 file
		Call .exe file with Runtime class in java into your selenium tests*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("browse")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\krish\\OneDrive\\Desktop\\NeedTo\\pdftojpgwithAutoIt.exe");
		//Runtime.getRuntime().exec("C:\\Users\\krish\\OneDrive\\Desktop\\NeedTo\\pdftojpgwithAutoIt.exe",null);
		//driver.findElement(By.cssSelector("#submit_btn")).click();
		
		driver.close();
		

	}

}
