package RsPracticeProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RSAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait Ex = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();

		Ex.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']"))).click();
		driver.findElement(By.cssSelector("select[class='form-control'] option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		Ex.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
		List<WebElement> Add = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		for (int i = 0; i < Add.size(); i++) {
			Add.get(i).click();
		}
		driver.findElement(By.cssSelector("a[class=\"nav-link btn btn-primary\"]")).click();

		driver.close();

//		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
//
//		driver.findElement(By.id("password")).sendKeys("learning");
//
//		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
//
//		// Thread.sleep(3000);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
//
//		driver.findElement(By.id("okayBtn")).click();
//
//		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
//
//		Select dropdown = new Select(options);
//
//		dropdown.selectByValue("consult");
//
//		driver.findElement(By.id("signInBtn")).click();
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
//
//		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
//
//		for (int i = 0; i < products.size(); i++)
//
//		{
//
//			products.get(i).click();
//
//		}
//
//		driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
