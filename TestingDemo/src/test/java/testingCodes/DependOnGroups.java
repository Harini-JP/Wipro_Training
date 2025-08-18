package testingCodes;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class DependOnGroups {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("=== Started working on Before Suite ===");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Preparing test environment");
    }

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Navigating to the Home Page");
        driver.get("https://demo.nopcommerce.com/");
    }

    // ----------------- TEST CASES -------------------

    // Group: smoke
    @Test(priority = 1, groups = {"smoke"})
    public void RegisterPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register?returnUrl=%2F']"))).click();
        driver.findElement(By.xpath("//input[@value='F']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))).sendKeys("Harini");
        driver.findElement(By.id("LastName")).sendKeys("Pandian");
        driver.findElement(By.id("Email")).sendKeys("harini@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Just for demo purpose (your site may not show alert, so careful here)
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert says: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert appeared during RegisterPage test.");
        }

        String ExpectedTitle = "nopCommerce demo store. Register";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");
        Thread.sleep(2000);
    }

    // Group: smoke
    @Test(priority = 2, groups = {"smoke"})
    public void LoginPage() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login?returnUrl=%2F']"))).click();
        wait.until(ExpectedConditions.urlContains("/login?returnUrl=%2F"));

        driver.findElement(By.id("Email")).sendKeys("harini@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");

        String ExpectedTitle = "nopCommerce demo store. Login";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");
        Thread.sleep(2000);
    }

    // Group: regression
    @Test(priority = 3, groups = {"regression"})
    public void searchProducts() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("small-searchterms"))).sendKeys("Apple iCam");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String ExpectedTitle = "nopCommerce demo store. Search";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");
        Thread.sleep(2000);
    }

    // This test depends on both smoke + regression groups
    @Test(dependsOnGroups = {"smoke", "regression"})
    public void finalReport() {
        System.out.println("=== Final Report: All smoke & regression tests executed successfully ===");
    }

    // ----------------- CLEANUP -------------------

    @AfterMethod
    public void afterMethod() {
        System.out.println("Returning to Homepage");
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Closing the Test Environment");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("=== Closing After Suite ===");
    }
}
