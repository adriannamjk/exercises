import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class DemoqaRegistrationTest{

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adelcia\\IdeaProjects\\test\\src\\test\\resource\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void openPageTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement pictrue = driver.findElement(By.className("site-anchor"));
        //String width = pictrue.getCssValue("width");

        assertTrue("The pictrue is not displayed.", pictrue.isDisplayed());
        //assertEquals("275",width);
    }

    @Test
    public void enterValueOfFirstNameTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement firstNameField = driver.findElement(By.id("name_3_firstname"));
        firstNameField.sendKeys("Józef");

        assertTrue("The value was not entered.", firstNameField.isDisplayed());
    }

    @Test
    public void enterValueOfSecondNameTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement secondNameField = driver.findElement(By.id("name_3_firstname"));
        secondNameField.sendKeys("Wybicki");

        assertTrue("The value was not entered.", secondNameField.isDisplayed());
    }

    @Test
    public void setMaritalStatusTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement singleRadioButton = driver.findElement(By.xpath("//label[text() = 'Single']/following-sibling::input[1]"));

        if (!singleRadioButton.isSelected())
            singleRadioButton.click();

        assertTrue("Radio button is not selected", singleRadioButton.isSelected());
    }

    @Test
    public void setHobbyTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement danceCheckBox = driver.findElement(By.xpath("//input[@value = 'dance']"));

        if (!danceCheckBox.isSelected())
            danceCheckBox.click();

        assertTrue("Checkbox is not selected", danceCheckBox.isSelected());
    }

    @Test
    public void selectCountryTest() {
        //driver.get("http://demoqa.com/registration/");
        Select dropDownCountry = new Select(driver.findElement(By.id("dropdown_7")));


        assertFalse("Dropdown supports multiple choice.", dropDownCountry.isMultiple());

        assertEquals("There are no 204 countries on the list.", 204, dropDownCountry.getOptions().size());

        dropDownCountry.selectByVisibleText("Poland");
        assertEquals("Poland is not selected country.", "Poland", dropDownCountry.getFirstSelectedOption().getText());
    }

    @Test
    public void selectMonthTest() {
        //driver.get("http://demoqa.com/registration/");
        Select dropDownMonth = new Select(driver.findElement(By.id("mm_date_8")));
        //Select dropDownDay = new Select(driver.findElement(By.id("dd_date_8")));


        assertFalse("Dropdown supports multiple choice.", dropDownMonth.isMultiple());


        assertEquals("There are no 12 month on the list.", 12, dropDownMonth.getOptions().size());

        dropDownMonth.selectByVisibleText("January");
        assertEquals("January is not selected month.", "January", dropDownMonth.getFirstSelectedOption().getText());
    }

    @Test
    public void selectDayTest() {
        //driver.get("http://demoqa.com/registration/");
        Select dropDownDay = new Select(driver.findElement(By.id("dd_date_8")));


        assertFalse("Dropdown supports multiple choice.", dropDownDay.isMultiple());


        assertEquals("There are no 12 month on the list.", 12, dropDownDay.getOptions().size());

        dropDownDay.selectByVisibleText("January");
        assertEquals("January is not selected month.", "January", dropDownDay.getFirstSelectedOption().getText());
    }

    @Test
    public void enterPhoneNumberTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement phoneNumberField = driver.findElement(By.id("phone_9"));
        phoneNumberField.sendKeys("777888999");

        assertTrue("The value was not entered.", phoneNumberField.isDisplayed());
    }

    @Test
    public void enterUsernameTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("jozek1");

        assertTrue("The value was not entered.", userNameField.isDisplayed());
    }

    @Test
    public void enterEmailTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement usernameField = driver.findElement(By.id("email_1"));
        usernameField.sendKeys("jozek@gmail.com");

        assertTrue("The value was not entered.", usernameField.isDisplayed());
    }

    @Test
    public void enterAboutYourselfTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement aboutYourselfField = driver.findElement(By.name("description"));
        aboutYourselfField.sendKeys("about Józek...");

        assertTrue("The value was not entered.", aboutYourselfField.isDisplayed());
    }

    @Test
    public void enterPasswordTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement passwordField = driver.findElement(By.name("description"));
        passwordField.sendKeys("jozekxxx1");

        assertTrue("The value was not entered.", passwordField.isDisplayed());
    }

    @Test
    public void enterConfirmPasswordTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement passwordField = driver.findElement(By.id("confirm_password_password_2"));
        passwordField.sendKeys("jozekxxx1");

        assertTrue("The value was not entered as dot.", passwordField.isDisplayed());
    }

    @Test
    public void submitTest() {
        //driver.get("http://demoqa.com/registration/");
        WebElement submitButton = driver.findElement(By.name("pie_submit"));
        submitButton.click();

        assertTrue("The button are not working.", submitButton.isEnabled());
    }

    /*@After
    public void tearDown() {
        driver.close();
    }*/

}
