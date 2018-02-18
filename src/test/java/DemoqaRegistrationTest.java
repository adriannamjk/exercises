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
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void register() {
        driver.get("http://demoqa.com/registration/");
        WebElement pictrue = driver.findElement(By.className("site-anchor"));
        //assertTrue("The pictrue is not displayed.", pictrue.isDisplayed());


        WebElement firstNameField = driver.findElement(By.id("name_3_lastname"));
        firstNameField.sendKeys("Józef");
        //assertTrue("The value was not entered.", firstNameField.isDisplayed());


        WebElement secondNameField = driver.findElement(By.id("name_3_firstname"));
        secondNameField.sendKeys("Wybicki");
        //assertTrue("The value was not entered.", secondNameField.isDisplayed());


        WebElement singleRadioButton = driver.findElement(By.xpath("//label[text() = 'Single']/following-sibling::input[1]"));
        if (!singleRadioButton.isSelected())
            singleRadioButton.click();
        //assertTrue("Radio button is not selected", singleRadioButton.isSelected());


        WebElement danceCheckBox = driver.findElement(By.xpath("//input[@value = 'dance']"));
        if (!danceCheckBox.isSelected())
            danceCheckBox.click();
        //assertTrue("Checkbox is not selected", danceCheckBox.isSelected());


        Select dropDownCountry = new Select(driver.findElement(By.id("dropdown_7")));
        //assertFalse("Dropdown supports multiple choice.", dropDownCountry.isMultiple());
        //assertEquals("There are no 204 countries on the list.", 204, dropDownCountry.getOptions().size());
        dropDownCountry.selectByVisibleText("Poland");
        //assertEquals("Poland is not selected country.", "Poland", dropDownCountry.getFirstSelectedOption().getText());


        Select dropDownMonth = new Select(driver.findElement(By.id("mm_date_8")));
        //assertFalse("Dropdown supports multiple choice.", dropDownMonth.isMultiple());
        //assertEquals("There are no 12 month on the list.", 13, dropDownMonth.getOptions().size());
        dropDownMonth.selectByVisibleText("1");
        //assertEquals("January is not selected month.", "1", dropDownMonth.getFirstSelectedOption().getText());


        Select dropDownDay = new Select(driver.findElement(By.id("dd_date_8")));
        //assertFalse("Dropdown supports multiple choice.", dropDownDay.isMultiple());
        //assertEquals("There are no 31 days on the list.", 32, dropDownDay.getOptions().size());
        dropDownDay.selectByVisibleText("10");
        //assertEquals("10 is not selected day.", "10", dropDownDay.getFirstSelectedOption().getText());

        Select dropDownYear = new Select(driver.findElement(By.id("yy_date_8")));
        //assertFalse("Dropdown supports multiple choice.", dropDownDay.isMultiple());
        dropDownDay.selectByVisibleText("2014");
        //assertEquals("2014 is not selected year.", "2014", dropDownDay.getFirstSelectedOption().getText());


        WebElement phoneNumberField = driver.findElement(By.id("phone_9"));
        phoneNumberField.sendKeys("11777888999");
        //assertTrue("The value was not entered.", phoneNumberField.isDisplayed());

        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("jozek1");
        //assertTrue("The value was not entered.", userNameField.isDisplayed());

        WebElement passwordField = driver.findElement(By.name("description"));
        passwordField.sendKeys("jozekxxx1");
        //assertTrue("The value was not entered.", passwordField.isDisplayed());

        WebElement ConfirmPasswordField = driver.findElement(By.id("confirm_password_password_2"));
        ConfirmPasswordField.sendKeys("jozekxxx1");
        //assertTrue("The value was not entered as dot.", passwordField.isDisplayed());

        WebElement submitButton = driver.findElement(By.name("pie_submit"));
        submitButton.click();
        //assertTrue("The button are not working.", submitButton.isEnabled());

        //assertEquals("The user was not registered", );

    }

        @After
        public void tearDown() {
            driver.close();
        }

    }

    /*@Test
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

    @After
    public void tearDown() {
        driver.close();
    }*/


