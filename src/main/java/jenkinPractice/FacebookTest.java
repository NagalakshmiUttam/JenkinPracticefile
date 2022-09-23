package jenkinPractice;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class FacebookTest {
		@Test
		public void loginFacebook() {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	}
