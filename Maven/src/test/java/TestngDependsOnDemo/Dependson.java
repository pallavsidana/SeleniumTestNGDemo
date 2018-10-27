package TestngDependsOnDemo;

import org.testng.annotations.Test;

public class Dependson {

	@Test(dependsOnMethods= {"test2"},priority=1)
	public void test1() {
		System.out.println(" i am in test1");
	}
	
	
	
	
	@Test(priority=2)
	public void test2() {
		System.out.println(" i am in test2");
	}
}
