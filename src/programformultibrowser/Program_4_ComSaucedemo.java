package programformultibrowser;

/*Project-4- ProjectName: com-saucedemo
 BaseUrl = https://www.saucedemo.com/
 1. Set up Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current URL.
 5. Print the page source.
 6. Enter the email in the email field.
 7. Enter the password in the password field.
 8. Click on the Login Button.
 9. Print the current URL.
 10. Navigate to baseUrl
 11. Refresh the page.
 12. Close the browser.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Program_4_ComSaucedemo {

    static String browser = "Chrome";
    static WebDriver driver;

    static String baseUrl = "https://www.saucedemo.com";

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

        // 6. Enter the email in the email field.
        driver.findElement(By.id("user-name")).sendKeys("prime");

        // 7. Enter the password in the password field.
        driver.findElement(By.id("password")).sendKeys("123");

        // 8. Click on the Login Button.
        driver.findElement(By.id("login-button")).click();

        // 9. Print the current URL after login.
        System.out.println("Current URL after login: " + driver.getCurrentUrl());

        // 10. Navigate back to baseUrl.
        driver.navigate().to(baseUrl);

        // 11. Refresh the page.
        driver.navigate().refresh();

        // 12. Close the browser.
        //driver.quit();
    }

}

