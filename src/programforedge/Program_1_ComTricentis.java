package programforedge;

/*Project-1- ProjectName: com-tricentis
 BaseUrl = https://demowebshop.tricentis.com/
 1. Set up Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current URL.
 5. Print the page source.
 6. Navigate to Url.
 “https://demowebshop.tricentis.com/login ”
 7. Print the current URL.
 8. Navigate back to the home page.
 9. Navigate to the login page.
 10. Print the current URL.
 11. Refresh the page.
 12. Enter the email in the email field.
 13. Enter the password in the password field.
 14. Click on the Login Button.
 15. Close the browser.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Program_1_ComTricentis {

    static String baseURL = "https://demowebshop.tricentis.com/";
    static String loginURL = "https://demowebshop.tricentis.com/login";

    public static void main(String[] args) {

        // 1. Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

        // 2. Open URL.
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 3. Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Navigate to URL.
        driver.navigate().to(loginURL);

        // 7. Print the current URL.
        System.out.println("Current URL after navigation: " + driver.getCurrentUrl());

        // 8. Navigate back to the home page.
        driver.navigate().back();

        // 9. Navigate to the login page.
        driver.navigate().forward();

        // 10. Print the current URL.
        System.out.println("Current URL after navigating forward: " + driver.getCurrentUrl());

        // 11. Refresh the page.
        driver.navigate().refresh();

        // 12. Enter the email in the email field.
        driver.findElement(By.id("Email")).sendKeys("test@prime.com");

        // 13. Enter the password in the password field.
        driver.findElement(By.id("Password")).sendKeys("prime");

        // 14. Click on the Login Button.
        driver.findElement(By.cssSelector("input.login-button")).click();

        // 15. Close the browser.
         driver.quit();


    }
}
