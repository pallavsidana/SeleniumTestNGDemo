package Listners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(Listners.TestNGListner.class)
public class TestNGListnersDemo2 {

	
	
	
	
	@Test
	public void test4() {
		System.out.println("i am in fourth test");
	}
	@Test
	public void test5() {
		System.out.println("i am in fifth test");
		Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		System.out.println("i am in sixth test");
		throw new SkipException("test is skipped");
	}
}
