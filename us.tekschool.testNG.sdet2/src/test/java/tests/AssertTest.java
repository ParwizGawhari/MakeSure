package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	   
	WebDriver driver = null;
	
	@Test
	public void gmailLogin() {
		System.setProperty("webdriver. chromedrvier.driver", "C:\\ chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.navigate().to("https://accounts.google.com/");
		 
		 WebElement gMail = driver.findElement(By.xpath("//input[@type='email']"));
		 Assert.assertTrue(gMail.isDisplayed());
		 gMail.sendKeys("studentexcersi5@gmail.com");
		 
		 WebElement next1 = driver.findElement(By.className("VfPpkd-RLmnJb"));
		 next1.click();
		
		 
		 WebElement addPass = driver.findElement(By.xpath("//input[@type='password']"));
		
		 addPass.sendKeys("07102020sE");
		 
		 WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		 next.click();
		 
		 driver.close();
		
	}

}
