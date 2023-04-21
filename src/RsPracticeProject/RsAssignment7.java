package RsPracticeProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		
		List<WebElement> row =driver.findElements(By.cssSelector("table[name=\"courses\"] tbody tr"));
		System.out.println("Total rows : " +row.size());
		List<WebElement> col =driver.findElements(By.cssSelector("table[name=\"courses\"] tbody th"));
		System.out.println("Total column : " +col.size());
		for (int i = 2; i < row.size(); i++) {
			if (row.get(i)==row.get(2)) {
				String nam =row.get(i).getText();
				System.out.println(nam);
			}
			
		}
		



//		WebElement table=driver.findElement(By.id("product"));
//		System.out.println(table.findElements(By.tagName("tr")).size());
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//		System.out.println(secondrow.get(2).getText());
//		

	}

}
