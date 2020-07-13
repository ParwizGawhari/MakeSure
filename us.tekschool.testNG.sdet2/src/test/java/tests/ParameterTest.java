package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterTest {
	
	@Test
	@Parameters({"url,emailId"})
	public void yhoologinTest(String url, String emailId) {
		
		WebDriver driver ;
		
		System.setProperty("WebDriver.chrome.driver", "C:\\ chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("emailId");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
	}

}
