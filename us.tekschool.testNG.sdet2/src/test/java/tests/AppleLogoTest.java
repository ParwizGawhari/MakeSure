package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class AppleLogoTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("WebDriver.chrome.driver", "C:\\ chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
        String pURL = "https://www.apple.com/"; 
		driver.get(pURL);

}
    @Test(priority=1)
    public void pageTitle() {
    	String pageTitle = driver.getTitle();
    	System.out.println(pageTitle);
    }
    
    @Test (priority=2)  // @Test (priority=2,groups="logo") beside sequence it make seperate group of every method
    public void pageLogo() {
    	boolean b = driver.findElement(By.xpath("//a[@id='ac-gn-firstfocus']")).isDisplayed();
    }
    
    @Test(priority=4)  // by putting as priority we can set the sequence of execution 
    public void test1() {
    	System.out.println("Test one");
    }
    
    @Test (priority=3)
    public void test2() {
    	System.out.println("Test two");
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.close();
    }
    
    
}