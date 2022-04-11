package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        //Launching a browser
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        //Current browser
        System.out.println("Current URL: " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.findElement(By.id("username")).sendKeys("rinky@gmail.com");
        driver.findElement(By.name("password")).sendKeys("rinky123");

        //close broeser
        driver.close();



    }
}
