package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pac.Catalog;
import pac.Menu;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogTest {
    private WebDriver driver;

    @BeforeEach
    void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ozon.ru/");
        Menu mn = new Menu(driver);
        mn.catalog();

    }

    @AfterEach
    void after() {
        if (driver != null)
            driver.quit();
    }

    @Test
    @DisplayName("Переход на электронику и проверка заголовка")
    void electronics(){
    Catalog ct = new Catalog(driver);
        ct.electronics();
        assertEquals(ct.getHeadingElec(), "Электроника" );
    }

    @Test
    @DisplayName("Переход на вещи и проверка заголовка")
    void clothing() {
        Catalog ct = new Catalog(driver);
        ct.clothing();
        assertEquals(ct.getHeadingClothing(), "Одежда");
    }
    @Test
    @DisplayName("Переход на обувь и проверка заголовка")
    void shoes() {
        Catalog ct = new Catalog(driver);
        ct.shoes();
        assertEquals(ct.getHeadinfShoes(),"Обувь");
    }
    @Test
    @DisplayName("Переход на спорт и проверка загловка")
    void sport() {
        Catalog ct = new Catalog(driver);
        ct.sport();
        assertEquals(ct.getHeadingSport(), "Спорт и отдых");
    }
}