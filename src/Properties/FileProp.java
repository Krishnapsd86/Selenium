package Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileProp {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\Properties\\test.properties");
		
		prop.load(fr);
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			prop.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("baseurl"));
		}else  {
			prop.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get(prop.getProperty("baseurl"));
		}

	}

}
