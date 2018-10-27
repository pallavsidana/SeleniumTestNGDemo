package MultiBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {	
	WebDriver  driver = null;
	
	
	
	
	
	@Parameters("browserName")
	@BeforeTest
	public void SetUp(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\jars\\browsers\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.driver", "C:\\jars\\browsers\\geckodriver.exe\\");
			driver=new FirefoxDriver();
		}
	}
		@Test
			public void Test1() {
			driver.get("https://gmail.com");
		}
	}
