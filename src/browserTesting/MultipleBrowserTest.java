package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultipleBrowserTest {

    static String browser = "Firefox";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {

     if(browser.equalsIgnoreCase("chrome")){
         System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         driver = new ChromeDriver();

     }else if(browser.equalsIgnoreCase("edge")){
         System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
         driver = new EdgeDriver();

     }else if(browser.equalsIgnoreCase("firefox")){
         System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
         driver = new FirefoxDriver();

     }else {
         System.out.println("Wrong browser name");
     }

     driver.get(baseUrl);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
}
