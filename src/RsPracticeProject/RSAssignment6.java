package RsPracticeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RSAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement opt1 = driver.findElement(By.id("checkBoxOption2"));
		opt1.click();
		String opt2 = opt1.getAttribute("value");
		driver.findElement(By.id("dropdown-class-example")).sendKeys(opt2);
		driver.findElement(By.id("name")).sendKeys(opt2);
		driver.findElement(By.id("alertbtn")).click();
		String msg = driver.switchTo().alert().getText();
		if (msg.contains(opt2)) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		}
		driver.switchTo().alert().accept();
		driver.close();

//		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
//		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//		Select s = new Select(dropdown);
//		s.selectByVisibleText(opt);
//		driver.findElement(By.name("enter-name")).sendKeys(opt);
//		driver.findElement(By.id("alertbtn")).click();
//		String text = driver.switchTo().alert().getText();
//		if (text.contains(opt))
//		{
//			System.out.println("Alert message success");
//		}
//
//		else
//
//			System.out.println("Something wrong with execution");
//
	}

}
