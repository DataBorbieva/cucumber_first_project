package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CarvanaCarFinderPage {

    public CarvanaCarFinderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "//h1")
    public WebElement textH1;


    @FindBy(xpath = "//h3")
    public WebElement textH3;


    @FindBy(css = "a[data-qa='router-link']")
    public WebElement tryCarFinderLink;

}
