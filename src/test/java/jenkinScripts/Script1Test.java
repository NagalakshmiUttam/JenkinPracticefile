package jenkinScripts;

import org.testng.annotations.Test;

public class Script1Test {
	@Test
	public void demo1() {
	System.out.println("Demo on Selenium");
	}
	
	@Test
	public void demo2() {
		System.out.println("demo on Java");
		System.out.println("demo on jenkin");
	}
	
	@Test
	public void demo3() {
		System.out.println("demo on ManualTesting");
	}
	@Test
	 public void demo4() {
		System.out.println(System.getProperty("chrome"));
		System.out.println(System.getProperty("linux"));
		 
	 }
}