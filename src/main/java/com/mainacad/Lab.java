package com.mainacad;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab {
    public static final By PAGE_HEADER_NAME = By.cssSelector(".main-header");
    public static final By FORM_HEADER_NAME = By.tagName("h5");
    public static final By FORM_FIRST_NAME = By.id("firstName");
    public static final By FORM_LAST_NAME = By.id("lastName");
    public static final By FORM_EMAIL = By.cssSelector("#userEmail");
    public static final By FORM_GENDER_CHECKBOX = By.cssSelector("#genterWrapper label[for='gender-radio-1']");
    public static final By FORM_USER_PHONE = By.cssSelector("#userNumber-wrapper #userNumber");
    public static final By FORM_CALENDAR_DATE_OF_BIRTH = By.cssSelector("#dateOfBirthInput");
    public static final By FORM_CALENDAR_BLOCK = By.cssSelector(".react-datepicker__tab-loop");
    public static final By FORM_CALENDAR_MONTH_BLOCK = By.cssSelector(".react-datepicker__month-select");
    public static final By FORM_CALENDAR_YEAR_BLOCK = By.cssSelector(".react-datepicker__year-select");
    public static final By FORM_CALENDAR_DAY_BLOCK_OPTION = By.cssSelector(".react-datepicker__week:nth-child(2) .react-datepicker__day:nth-child(2)");
    public static final By FORM_CALENDAR_YEAR_BLOCK_OPTION = By.cssSelector(".react-datepicker__year-select //option[. = '2002']");
    public static final By FORM_CALENDAR_MONTH_BLOCK_OPTION = By.cssSelector(".react-datepicker__month-select //option[. = 'June']");
    public static final By FORM_SUBJECT_REACTDROPDOWN = By.cssSelector("#subjectsWrapper input#subjectsInput");
    public static final By FORM_SUBJECT_ELEMENT_REACTDROPDOWN = By.cssSelector("#react-select-2-option-0");
    public static final By FORM_HOBBY = By.cssSelector("#hobbiesWrapper label[for='hobbies-checkbox-1']");
    public static final By FORM_ADDRESS = By.cssSelector("#currentAddress-wrapper textarea#currentAddress");
    public static final By FORM_STATE_REACTDROPDOWN = By.cssSelector("#stateCity-wrapper #state");
    public static final By FORM_CITY_REACTDROPDOWN = By.cssSelector("#stateCity-wrapper #city");
    public static final By FORM_STATE_ELEMENT_REACTDROPDOWN = By.cssSelector("#react-select-3-option-1");
    public static final By FORM_CITY_ELEMENT_REACTDROPDOWN = By.cssSelector("#react-select-4-option-1");
    public static final By FORM_SUBMIT = By.cssSelector("#submit");
    private static WebDriver driver;


//    @Before
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }

    public static void main(String[] args) {
        //Открываем тестовую страницу
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println(driver.findElement(PAGE_HEADER_NAME).getText());


        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println(driver.findElement(FORM_HEADER_NAME).getText());

        //TODO: Кликнуть линк Partial Link Test

        //TODO: Заполнить поле First name:
        driver.findElement(FORM_FIRST_NAME).click();
        driver.findElement(FORM_FIRST_NAME).sendKeys("Ivan");

        //TODO: Заполнить поле Last name:
        driver.findElement(FORM_LAST_NAME).click();
        driver.findElement(FORM_LAST_NAME).sendKeys("Test");

        driver.findElement(FORM_EMAIL).click();
        driver.findElement(FORM_EMAIL).sendKeys("ivantest@gmail.com");

        //TODO: Выбрать пол
        driver.findElement(FORM_GENDER_CHECKBOX).click();

        //TODO: Выбрать количество лет опыта

        //TODO: Заполнить поле дата
        driver.findElement(FORM_USER_PHONE).click();
        driver.findElement(FORM_USER_PHONE).sendKeys("0000000000");

        //TODO: Выбрать несколько Automation Tool
        driver.findElement(FORM_CALENDAR_DATE_OF_BIRTH).click();
        WebElement reactDatePicker = driver.findElement(FORM_CALENDAR_BLOCK);
        //month
        reactDatePicker.findElement(FORM_CALENDAR_MONTH_BLOCK).click();
        driver.findElement(FORM_CALENDAR_MONTH_BLOCK_OPTION).click();

        //year
        reactDatePicker.findElement(FORM_CALENDAR_YEAR_BLOCK).click();
        driver.findElement(FORM_CALENDAR_YEAR_BLOCK_OPTION).click();

        //day
        reactDatePicker.findElement(FORM_CALENDAR_DAY_BLOCK_OPTION).click();

        //TODO: Выбрать континент из выпадающего списка
        //Enter Subject
        driver.findElement(FORM_SUBJECT_REACTDROPDOWN).sendKeys("e");
        driver.findElement(FORM_SUBJECT_ELEMENT_REACTDROPDOWN).click();



        //TODO: Выбрать несколько вариантов из списка Selenium Commands
        //Choose checkbox
        driver.findElement(FORM_HOBBY).click();

        //Choose file

        //Enter Address
        driver.findElement(FORM_ADDRESS).sendKeys("address");

        //Choose state and city
        driver.findElement(FORM_STATE_REACTDROPDOWN).click();
        driver.findElement(FORM_STATE_ELEMENT_REACTDROPDOWN).click();

        driver.findElement(FORM_CITY_REACTDROPDOWN).click();
        driver.findElement(FORM_CITY_ELEMENT_REACTDROPDOWN).click();


        //TODO: Кликнуть на кнопку Button
        driver.findElement(FORM_SUBMIT).click();

        //TODO: Закрыть браузер
        driver.close();


        driver.quit();

    }
}