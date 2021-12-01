package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class Menu
{

    private static WebDriver driver;
    private String keysToSend = "Корм для кошек";



    public Menu(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[1]/a")
     WebElement topfaashion;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[2]/div/div[1]/button/span/span")
    WebElement catalog;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[2]/a")
    WebElement premium;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[3]/a")
    WebElement travel;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[4]/a")
    WebElement express;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[3]/div/form/div[2]/input[1]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[3]/div/form/button")
    WebElement searchButton;




      public Menu topfashion(){
        topfaashion.click();
        return new Menu(driver);
    }

    public Menu catalog(){
        catalog.click();
        return new Menu(driver);
    }

    public Menu premium(){
        premium.click();
        return new Menu(driver);
    }
    public Menu travel(){
        travel.click();
        return new Menu(driver);
    }

    public Menu express(){
        express.click();
        return new Menu(driver);
    }
    public Menu search(){
        Actions builder = new Actions(driver);
                  Action act = builder.moveToElement(search)
                  .click()
                  .keyDown(search,Keys.SHIFT)
                  .sendKeys(search,keysToSend)
                  .keyUp(search, Keys.SHIFT)
                  .build();
                  act.perform();

          searchButton.click();
          return new Menu(driver);
    }

}
