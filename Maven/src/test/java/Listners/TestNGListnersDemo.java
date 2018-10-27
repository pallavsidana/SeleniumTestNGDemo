package Listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(Listners.BrserOpenListner.class)
public class TestNGListnersDemo {

	
	WebDriver driver=null;
	
	
	
	@Test
	public void test1() {
		System.out.println("i am in first test");
		 driver= new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\jars\\chrome70\\chromedriver.exe\\");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.in");
		}
}
