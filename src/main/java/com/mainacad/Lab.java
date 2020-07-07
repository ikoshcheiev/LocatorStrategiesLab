package com.mainacad;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;


public class Lab {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_83.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/selenium-certification/?q=Header");




        //TODO: Вывести в консоль текст Инфо сообщения
        System.out.println(driver.findElement(By.xpath("//div[2]/div/h2[1]")).getText());




        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")

        //TODO: Кликнуть линк Partial Link Test

        //TODO: Заполнить поле First name:
        driver.findElement(By.name("your-name")).click();
        driver.findElement(By.name("your-name")).sendKeys("Ivan");

        //TODO: Заполнить поле Last name:
        driver.findElement(By.name("your-email")).sendKeys("Test");

        //TODO: Выбрать пол
        driver.findElement(By.name("your-country")).click();
        driver.findElement(By.name("your-country")).sendKeys("ukraine");

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

    }
}
