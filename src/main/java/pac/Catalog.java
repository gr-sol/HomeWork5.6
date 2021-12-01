package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static WebDriver driver;

    public Catalog(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[2]/div/div[2]/div/div[1]/div/a[1]/span")
    WebElement electronics;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[2]/div/div[2]/div/div[1]/div/a[2]/span")
    WebElement clothing;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[2]/div/div[2]/div/div[1]/div/a[3]/span")
    WebElement shoes;
    @FindBy(xpath = "//*[@id=\"stickyHeader\"]/div[2]/div/div[2]/div/div[1]/div/a[8]/span")
    WebElement sport;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/div[3]/div[2]/h1")
    WebElement headingelerctronics;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/div[3]/div[1]/div[1]/div/h1")
    WebElement clothingHeatint;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/div[3]/div[1]/div[1]/div/h1")
    WebElement shoesHeating;
    @FindBy(xpath = "//*[@id=\"layoutPage\"]/div[1]/div[3]/div/div[2]/div[1]/h1")
    WebElement sportHiding;


    public Catalog electronics(){
        electronics.click();
        return new Catalog(driver);
    }
    public Catalog clothing(){
        clothing.click();
        return new Catalog(driver);
    }
    public Catalog shoes(){
        shoes.click();
        return new Catalog(driver);
    }
    public Catalog sport(){
        sport.click();
        return new Catalog(driver);
    }
    public String getHeadingElec(){
       System.out.println(headingelerctronics.getText());
        return  headingelerctronics.getText();
    }
    public String getHeadingClothing(){
        System.out.println(clothingHeatint.getText());
        return  clothingHeatint.getText();
    }
    public String getHeadinfShoes(){
        System.out.println(shoesHeating.getText());
        return shoesHeating.getText();
    }
    public String getHeadingSport(){
        System.out.println(sportHiding.getText());
       return sportHiding.getText();
    }

}
