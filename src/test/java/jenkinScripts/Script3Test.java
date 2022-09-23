package jenkinScripts;

import org.testng.annotations.Test;

public class Script3Test {
	@Test
	public void Agenda1() {
		System.out.println("General body meeting");
	}
	
	@Test
	public void  Agenda2() {
		System.out.println("Directors meeting");
		System.out.println("public meeting");
	}
	
	@Test
	public void  Agenda3() {
		System.out.println("Shareholders meeting");
	}
}