package programforfirefox;

/* Project-3- ProjectName: com-herokuapp
 BaseUrl = http://the-internet.herokuapp.com/login
 1. Set up Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current URL.
 5. Print the page source.
 6. Enter the email in the email field.
 7. Enter the password in the password field.
 8. Click on the Login Button.
 9. Print the current URL.
 10. Refresh the page.
 11. Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Program_3_ComHerokuapp {

    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {

        // 1. Set up Chrome browser.
        WebDriver driver = new FirefoxDriver();

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
        driver.findElement(By.id("username")).sendKeys("test@prime.com");

        // 7. Enter the password in the password field.
        driver.findElement(By.id("password")).sendKeys("123");

        // 8. Click on the Login Button.
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // 9. Print the current URL after login.
        System.out.println("Current URL after login: " + driver.getCurrentUrl());

        // 10. Refresh the page.
        driver.navigate().refresh();


        driver.quit();

    }

}

