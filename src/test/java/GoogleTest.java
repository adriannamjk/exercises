import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertTrue;

public class GoogleTest{

    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adelcia\\IdeaProjects\\test\\src\\test\\resource\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void openPage() {
        driver.get("https://www.google.pl");
        WebElement buttonSearch = driver.findElement(By.xpath("//input[@value='Szukaj w Google']"));

        assertTrue("Button is not displayed.", buttonSearch.isDisplayed());
    }


    @After
    public void tearDown () {
        driver.close();
    }
}

