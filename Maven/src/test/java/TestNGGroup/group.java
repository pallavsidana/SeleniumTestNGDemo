package TestNGGroup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class group {

	@Test(groups={"sanity"})
	public void test1() {
		System.out.println("i am test1");
	}
	
	
	
	
	@Test(groups= {"sanity","smoke"})
	public void test2() {
		System.out.println("i am test2");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("i am test3");
	}
	
	@Test
	public void test4() {
		System.out.println("i am test4");
	}
}
