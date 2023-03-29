package OrangeHrmProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//hold time till 5 seconds until element is found
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//action
		driver.manage().window().maximize();
		WebElement userName =  driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement LoginButton = driver.findElement(By.className("oxd-button"));
		
		
		//assertion
		
//		Validate username/password with valid credentials
		
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("h6[class*='oxd']")).getText());
		boolean Dashboard = driver.findElement(By.cssSelector("h6[class*='oxd']")).isDisplayed();
		if(Dashboard) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase Failed");
		}
		
		//Validate username/password with invalid credentials
		
//		userName.sendKeys("Amin");
//		password.sendKeys("amin123");
//		LoginButton.click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
//		boolean errorMsgs = driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed();
//		if(errorMsgs) {
//			System.out.println("Testcase passed");
//			System.out.println("Negative Testcase");
//		}else {
//			System.out.println("Testcase Failed");
//		}
		
		//Validate forget password link
		
//		driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
//		String currenrUrl = driver.getCurrentUrl();
//		System.out.println(currenrUrl);
//		if(currenrUrl.contains("requestPasswordResetCode")) {
//			System.out.println("Testcase Passed");
//		}else {
//			System.out.println("Testcase Failed");
//		}
		
		
		//validate company logo
		
//		Thread.sleep(5000);
//		if(driver.findElement(By.cssSelector("img[alt =\"company-branding\"]")).isDisplayed()) {
//			System.out.println("Testcase pass");
//		}else {
//			System.out.println("Testcase fail");
//		}
//		
		driver.close();

	}

}
