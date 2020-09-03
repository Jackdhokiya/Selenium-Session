package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;

	public static void main(String ar[]) {

		String browser = "chrome";

//		if (browser.equalsIgnoreCase("chrome")) {
//     System.setProperty("webdriver.chrome.driver", "C:\\Users\\janak\\Downloads\\chromedriver\\chromedriver.exe");
//			driver = new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("firefox")) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\janak\\Downloads\\geckodriver\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//
//		else if (browser.equalsIgnoreCase("safari")) {
//			driver = new SafariDriver();
//		}
//
//		else {
//			System.out.println("please pass the correct browser name.....");
//		}
		
		switch (browser) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\janak\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\janak\\Downloads\\geckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			//driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the correct browser name.....");
			break;
		}
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}