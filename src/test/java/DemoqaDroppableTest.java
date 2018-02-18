import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class DemoqaDroppableTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void movingOfElement() {
        driver.get("http://demoqa.com/droppable/");
        WebElement element = driver.findElement(By.id("draggableview"));
        WebElement rectangle = driver.findElement(By.id("droppableview"));

        Actions moving = new Actions(driver);
        moving.dragAndDrop(element, rectangle).build().perform();

        assertEquals( "Element has not been moved.", rectangle.getText() ,"Dropped!");

    }

    @After
    public void tearDown() {
        driver.close();
    }
}