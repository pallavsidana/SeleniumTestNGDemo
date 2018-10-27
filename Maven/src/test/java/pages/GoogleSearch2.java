package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch2 {
	WebDriver driver=null;
	
	
	
	
	@BeforeTest
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\browsers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void GoogleSearch2() {
		driver.get("https://www.google.com");
	}
	@Test
	public void GoogleSearch12() {
		driver.get("https://www.gmail.com");
	}
}
