package programforedge;

/* Project-5- ProjectName: com-utimateqa
 BaseUrl = https://courses.ultimateqa.com/
 1. Set up Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current URL.
 5. Print the page source.
 6. Click on the ‘Sign In’ link
 7. Print the current URL
 8. Enter the email in the email field.
 9. Enter the password in the password field.
 10. Click on the Login Button.
 11. Navigate to baseUrl.
 12. Navigate forward to the Homepage.
 13. Navigate back to baseUrl.
 14. Refresh the page.
 15. Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Program_5_ComUltimateqa {

    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {

        // 1. Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

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

        // 6. Click on the ‘Sign In’ link.
        driver.findElement(By.linkText("Sign In")).click();

        // 7. Print the current URL after clicking Sign In.
        System.out.println("Current URL after Sign In click: " + driver.getCurrentUrl());

        // 8. Enter the email in the email field.
        driver.findElement(By.id("user[email]")).sendKeys("test@prime.com");

        // 9. Enter the password in the password field.
        driver.findElement(By.id("user[password]")).sendKeys("123");

        // 10. Click on the Login Button.
        //driver.findElement(By.cssSelector("button.button-primary.g-recaptcha")).click();
        driver.findElement(By.className("g-recaptcha")).click();

        // 11. Navigate back to the base URL.
        driver.navigate().to(baseUrl);

        // 12. Navigate forward to the Homepage.
        driver.navigate().forward();

        // 13. Navigate back to base URL.
        driver.navigate().back();

        // 14. Refresh the page.
        driver.navigate().refresh();

        // 15. Close the browser.
        driver.quit();

    }
}
