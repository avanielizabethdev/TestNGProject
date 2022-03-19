package pckg1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeGroups("sanity")
	public void beforeG() {
		
		System.out.println("Inside before Group");
	}
	
	@BeforeTest
	public void beforeT() {
		
		System.out.println("Inside before Test");
	}
	
	@BeforeMethod
	public void beforeM() {
		
		System.out.println("Inside before mehtod");
	}
	
	@Test(groups= {"sanity"},enabled = false)
	public void test1() {
		
		System.out.println("Inside Test case 1");
	}
	
	@Test(description = "To test all the scenarios")
	public void test2() {
		
		System.out.println("Inside Test case 2");
	}
	
	@AfterMethod
	public void afterM() {
		
		System.out.println("Inside after mehtod");
	}
	
	@AfterTest
	public void afterT() {
		
		System.out.println("Inside after Test");
	}

}
