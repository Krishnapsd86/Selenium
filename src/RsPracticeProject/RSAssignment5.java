package RsPracticeProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSAssignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		System.out.println(driver.findElement(By.cssSelector("frame[src='/frame_middle']")).getText());

	}

}
