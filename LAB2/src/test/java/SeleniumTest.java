import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        System.out.println(driver.getTitle());
    }

    public static void main(String args[]){
        SeleniumTest test = new SeleniumTest();
        test.setUp();
    }
}
