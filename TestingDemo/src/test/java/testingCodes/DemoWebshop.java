package testingCodes;  // Package name where this class belongs

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Import required classes for Selenium, waits, and TestNG


public class DemoWebshop {
	WebDriver driver;
	@BeforeClass
	public void launchBrowse() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Test(priority=1)
	public void registerNewUser() throws InterruptedException  {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']"))).click();
		
		System.out.println("Page Title after clicking Register:" +driver.getTitle());
		
		driver.findElement(By.id("FirstName")).sendKeys("Harini");
		driver.findElement(By.id("LastName")).sendKeys("Pandian");
		driver.findElement(By.id("Email")).sendKeys("harini@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}
	
	@AfterClass
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
		
	}


	


