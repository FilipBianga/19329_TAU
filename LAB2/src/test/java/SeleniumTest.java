import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumTest {
    private WebDriver driver;

    public void setUpChrome(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://zalando.pl/");
        System.out.println("Wyświetlamy nazwe strony");
        System.out.println(driver.getTitle());
        WebElement input = driver.findElement(By.className("z-navicat-header_searchInput"));
        System.out.println("Klikamy w wyszukiwanie");
        input.click();
        System.out.println("Wyszukujemy Nike");
        input.sendKeys("Nike");
        System.out.println("Klikamy Enter i dostajemy wynik wyszukiwania");
        input.sendKeys(Keys.ENTER);
        System.out.println("Zamykamy przeglądarke");
        driver.quit();
    }

    public void setUpFirefox(){
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://mediamarkt.pl/");
        System.out.println("Wyświetlamy nazwe strony");
        System.out.println(driver.getTitle());
        WebElement input = driver.findElement(By.className("input-inner"));
        System.out.println("Klikamy w wyszukiwanie");
        input.click();
        System.out.println("Wyszukujemy iPhona");
        input.sendKeys("iPhone");
        System.out.println("Klikamy Enter i dostajemy wynik wyszukiwania");
        input.sendKeys(Keys.ENTER);
        System.out.println("Zamykamy przeglądarke");
        driver.quit();
    }

    public static void main(String args[]){
        SeleniumTest test = new SeleniumTest();
        test.setUpFirefox();
        test.setUpChrome();
    }
}
