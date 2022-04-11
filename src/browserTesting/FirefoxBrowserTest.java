package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        System.out.println("Current URL =" + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.findElement(By.id("username")).sendKeys("rinky@gmail.com");
        driver.findElement(By.name("password")).sendKeys("rinky123");

        //Closing browser
        driver.close();

    }
}
