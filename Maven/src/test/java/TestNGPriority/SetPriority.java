package TestNGPriority;

import org.testng.annotations.Test;

public class SetPriority {

	@Test(priority=0)
	public void one() {
		System.out.println("i am in one");
	}
	
	
	@Test(priority=4)
	public void two() {
		System.out.println("i am in 2");
	}
	@Test
	public void three() {
		System.out.println("i am in 3");
	}@Test(priority=4)
	public void four() {
		System.out.println("i am in 4");
	}
}
