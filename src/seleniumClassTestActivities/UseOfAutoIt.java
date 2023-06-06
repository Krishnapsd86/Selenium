package seleniumClassTestActivities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		String downloadPath = System.getProperty("user.dir");
		HashMap<String, Object> chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings_popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("browse")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\krish\\OneDrive\\Desktop\\NeedTo\\pdftojpgwithAutoIt.exe");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#submit_btn")));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit_btn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='btn btn-primary btn-sm']")));
		driver.findElement(By.cssSelector("a[class='btn btn-primary btn-sm']")).click();
		
		Thread.sleep(5000);
		File fi= new File(downloadPath+"/27.zip");
		if(fi.exists()) {
			System.out.println("File is Downloaded");
		}
		
		driver.close();
		

	}

}
