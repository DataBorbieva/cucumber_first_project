package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CarvanaSellTradePage {
    public CarvanaSellTradePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='sc-7ed29b82-1 jwFVns']//div[2]")
    public WebElement mainHeadingText;

    @FindBy(css = "div[class='sc-4ef54ea5-16 sc-4ef54ea5-17 sc-75968884-0 gqlmCY dJRkut lnhlkr']")
    public WebElement underHeadingSmallerText;

    @FindBy(css = "button[data-cv-test='VINToggle']")
    public WebElement vinButton;

    @FindBy(css = "input[class='FormInput-oo6j68-5 jLejJf']")
    public WebElement inputForVin;

    @FindBy(css = "button[data-cv-test='heroGetMyOfferButton']")
    public WebElement getMyOfferButton;

    @FindBy(css = "div[class='sc-ckTRkR sc-fXazxj sc-fTFLOO gCHypS geDMnu kjoUgV']")
    public WebElement errorMessageAfterInvalidVin;
}
