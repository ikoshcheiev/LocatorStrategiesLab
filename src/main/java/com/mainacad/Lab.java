package com.mainacad;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab {
    public static final By PAGE_HEADER_NAME = By.xpath("//div[2]/div/h2[1]");
    public static final By FORM_HEADER_NAME = By.tagName("h5");
    public static final By LEFT_SIDE_ELEMENT_ELEMENTS = By.partialLinkText("Elements");
    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        //Открываем тестовую страницу
        driver.get("https://demoqa.com/automation-practice-form");


        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println(driver.findElement(PAGE_HEADER_NAME).getText());


        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")
        System.out.println(driver.findElement(FORM_HEADER_NAME).getText());

        //TODO: Кликнуть линк Partial Link Test
        driver.findElement(LEFT_SIDE_ELEMENT_ELEMENTS).click();

        //TODO: Заполнить поле First name:
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).sendKeys("Ivan");

        //TODO: Заполнить поле Last name:
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).sendKeys("Test");

        //TODO: Выбрать пол
        driver.findElement(By.cssSelector("#genterWrapper .custom-radio:nth-child(1) input")).click();
        driver.findElement(By.xpath("/html//div[@id='genterWrapper']//label[@for='gender-radio-1']/../input")).click();

        //TODO: Выбрать количество лет опыта
        driver.findElement(By.name("your-city")).click();
        driver.findElement(By.name("your-city")).sendKeys("Vinnytsya");

        //TODO: Заполнить поле дата
        driver.findElement(By.name("your-mobile")).click();
        driver.findElement(By.name("your-mobile")).sendKeys("0000000000");

        //TODO: Выбрать несколько Automation Tool

        //TODO: Выбрать континент из выпадающего списка

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        //TODO: Кликнуть на кнопку Button
        driver.findElement(By.cssSelector("#wpcf7-f24983-p35401-o1 .wpcf7-submit")).click();

        //TODO: Закрыть браузер
        driver.close();

        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("ivantest@gmail.com");
        driver.findElement(By.id("userNumber")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0000000000");
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
            dropdown.findElement(By.xpath("//option[. = 'June']")).click();
        }
        driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();
        driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
            dropdown.findElement(By.xpath("//option[. = '2002']")).click();
        }
        driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();
        driver.findElement(By.cssSelector(".react-datepicker__day--005:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".subjects-auto-complete__value-container")).click();
        driver.findElement(By.id("subjectsInput")).sendKeys("Subject");
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1) > .custom-control-label")).click();
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(2) > .custom-control-label")).click();
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(2) > .custom-control-label")).click();
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1) > .custom-control-label")).click();
        driver.findElement(By.cssSelector(".subjects-auto-complete__value-container")).click();
        driver.findElement(By.id("subjectsInput")).sendKeys("Subject");
        driver.findElement(By.id("currentAddress")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("address");
        {
            WebElement element = driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer > .css-19bqh2r"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".css-1gtu0rj-indicatorContainer")).click();
        driver.findElement(By.id("react-select-3-option-1")).click();
        driver.findElement(By.cssSelector(".css-1pahdxg-control > .css-1hwfws3")).click();
        driver.findElement(By.id("react-select-4-option-1")).click();
        driver.findElement(By.id("submit")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".modal"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".modal"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".modal"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("closeLargeModal")).click();
    }
}