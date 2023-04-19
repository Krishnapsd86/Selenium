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
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText());

//		driver.findElement(By.linkText("Nested Frames")).click();
//		driver.switchTo().frame("frame-top");
//		driver.switchTo().frame("frame-middle");
//		System.out.println(driver.findElement(By.id("content")).getText());

		driver.close();

	}

}
