package testingCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoLogin {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void loginUser() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		System.out.println("\"Page Title after clicking Login:" +driver.getTitle());
		
		driver.findElement(By.id("Email")).sendKeys("harini@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		Thread.sleep(3000);
		
		
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	

}
