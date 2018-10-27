package Listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listners.TestNGListner.class)
public class amazonBrowser {

	WebDriver driver=null;
	
	
	
	
	@BeforeTest
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\browsers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void GoogleSearch() {
		driver.get("https://www.amazon.in");
	}	}

