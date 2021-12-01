package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pac.Menu;

import java.util.concurrent.TimeUnit;

public class MenuTest {
    private WebDriver driver;


    @BeforeEach
    void before(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ozon.ru/");


    }
    /*@AfterEach
    void after(){
    if(driver !=null)
        driver.quit();}*/

    @Test
    @DisplayName("Переход на TOP Fashion")
    void menu(){
     Menu mn = new Menu(driver);
        mn.topfashion();
    }
    @Test
    @DisplayName("Переход в каталог")
    void catalog(){
        Menu mn = new Menu(driver);
        mn.catalog();
    }

    @Test
    @DisplayName("Переход в премиум")
    void premium(){
        Menu mn = new Menu(driver);
        mn.premium();
    }
    @Test
    @DisplayName("Переход в OZON Travel")
    void traval(){
        Menu mn = new Menu(driver);
        mn.travel();
    }
    @Test
    @DisplayName("Переход в OZON Express")
    void express(){
        Menu mn = new Menu(driver);
        mn.express();
    }
    @Test
    @DisplayName("Поиск текста заглавным регистром")
    void search(){
        Menu mn = new Menu(driver);
        mn.search();


    }


    }
