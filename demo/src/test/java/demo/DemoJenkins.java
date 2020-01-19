package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoJenkins {
	
	public class Facebooklogin {
		WebDriver driver;
		@Test
		public void login() throws Exception {
			System.setProperty("webdriver.chrome.driver", "I:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
			driver.findElement(By.id("email")).sendKeys("rajkamalmmt@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("muleesb");
			driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			
}
	}
}
