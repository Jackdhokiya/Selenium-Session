package A_SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLink {
	static WebDriver driver;
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> Linklist = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
		
		System.out.println("Total Links are: " + Linklist.size());
		
	for (int i=0; i<Linklist.size(); i++) {
		String text = Linklist.get(i).getText();
		
		
		 if(! text.isEmpty()) {
			 System.out.println(i + "-->"+ text);
		 }
	}
		
		
		driver.quit();
		
	}

}
