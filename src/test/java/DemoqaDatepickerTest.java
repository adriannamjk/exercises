import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class DemoqaDatepickerTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void datePicker() {
        driver.get("http://demoqa.com/datepicker/");
        WebElement line = driver.findElement(By.id("datepicker1"));
        line.click();
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        driver.findElement(By.xpath("//html//tr[1]/td[4]/a[1]")).click();

        assertEquals("Date is not selected date.", line.getAttribute("value"), "March 1, 2018");

    }


    @After
    public void tearDown() {
        driver.close();
    }
}
