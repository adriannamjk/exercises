import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DemoqaMenuTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void datePicker() {
        driver.get("http://demoqa.com/menu/");

        List<WebElement> listOfElements = driver.findElements(By.className("ui-corner-left"));







    }

    @After
    public void tearDown() {
        driver.close();
    }
}






















/*
List<WebElement> listOfDocuments = driver.findElements(By.xpath("//img[@class = 'document']"));

        WebElement firstDocument = listOfDocuments.get(0);
        WebElement trash = driver.findElement(By.xpath("//div[@class = 'trash']"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(firstDocument, trash).perform();

        // After removing elements list needs to be refreshed.
        List<WebElement> refreshedListOfDocuments = driver.findElements(By.xpath("//img[@class = 'document']"));

        customWait.waitForDocumentDisappear(refreshedListOfDocuments);

        assertEquals("Document has not been deleted.", 3, refreshedListOfDocuments.size());

        assertEquals("Page has wrong number of links containing Click keyword.", 3, allLinksContainClickKeyword.size());
 */