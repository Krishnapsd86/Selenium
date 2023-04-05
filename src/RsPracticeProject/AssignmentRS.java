package RsPracticeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice");
		
//		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys("Krishna");
//		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys("krishnapsd@gmail.com");
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//*[@id=\"exampleCheck1\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
//		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01/01/2000");
//		driver.findElement(By.cssSelector("input[type='submit']")).submit();
//		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
//		driver.close();
		
		
		driver.findElement(By.name("name")).sendKeys("rahul");
		driver.findElement(By.name("email")).sendKeys("hello@abc.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
