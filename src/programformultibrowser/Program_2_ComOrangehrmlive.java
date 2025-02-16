package programformultibrowser;

/*Project-2- ProjectName : com-orangehrmlive
 BaseUrl = https://opensource-demo.orangehrmlive.com/
 1. Set up Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current URL.
 5. Print the page source.
 6. Click on the ‘Forgot your password?’ link.
 7. Print the current URL.
 8. Navigate back to the login page.
 9. Refresh the page.
 10. Enter the email in the email field.
 11. Enter the password in the password field.
 12. Click on the Login Button.
 13. Close the browser.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Program_2_ComOrangehrmlive {

    static String browser = "Chrome";
    static WebDriver driver;

    static String baseUrl = "https://opensource-demo.orangehrmlive.com";

    public static void main(String[] args) {

        // 1. Set up Chrome browser.
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        // 2. Open URL.
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Click on the 'Forgot your password?' link.

        //driver.findElement(By.linkText("Forgot your password? ")).click();
        //driver.findElement(By.partialLinkText("Forgot"));
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        // 7. Print the current URL.
        System.out.println("Current URL after clicking 'Forgot your password?': " + driver.getCurrentUrl());

        // 8. Navigate back to the login page.
        driver.navigate().back();

        // 9. Refresh the page.
        driver.navigate().refresh();

        // 10. Enter the username in the username field.
        driver.findElement(By.name("username")).sendKeys("prime");

        // 11. Enter the password in the password field.
        driver.findElement(By.name("password")).sendKeys("123");

        // 12. Click on the Login Button.
        //driver.findElement(By.cssSelector("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        // 13. Close the browser.
        driver.quit();

    }
}
