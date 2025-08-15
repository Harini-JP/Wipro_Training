package testingCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationTask {
    WebDriver driver;
    String baseUrl;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Start of the suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Preparing the test environment");
    }

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        System.out.println("Launching the browser: " + browserName);

        // Store URL for later use
        baseUrl = url;

        switch (browserName) {
            case "Chrome":
                ChromeOptions options = new ChromeOptions();
                options.setCapability("pageLoadStrategy", "eager");
                driver = new ChromeDriver(options);
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        driver.get(baseUrl);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Navigating to home page");
        if (!driver.getCurrentUrl().equals(baseUrl)) {
            driver.get(baseUrl);
        }
    }

    @Test(priority = 1, groups = {"smoke"})
    public void verifyPage() {
        System.out.println("Verifying page title...");
        Assert.assertTrue(driver.getTitle().contains("Automation Exercise"), "Page title mismatch");
    }

    @Test(priority = 2, groups = {"regression"})
    public void loginTest() {
        System.out.println("Performing login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();

        System.out.println("Page Title after clicking Login: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("harini@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title is mismatched");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Returning to home page");
        driver.get(baseUrl);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Closing the browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test method executed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite method executed");
    }
}
