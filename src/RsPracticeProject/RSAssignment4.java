package RsPracticeProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.tagName("h3")).getText());

		driver.quit();
		

//		driver.get("http://the-internet.herokuapp.com/");
//
//		driver.findElement(By.linkText("Multiple Windows")).click();
//
//		driver.findElement(By.cssSelector("a[href*='windows']")).click();
//
//		Set<String> abc = driver.getWindowHandles();
//
//		Iterator<String> it = abc.iterator();
//
//		String parentWindow = it.next();
//
//		driver.switchTo().window(it.next());
//
//		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
//
//		driver.switchTo().window(parentWindow);
//
//		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

}
