package pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CarvanaMainPage {

    public CarvanaMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "a[data-cv-test='headerCarFinderLink']")
    public WebElement carFinderLink;


    @FindBy(css = "a[data-cv-test='headerTradesLink']")
    public WebElement sellTradeLink;

    @FindBy(css = "a[class='MenuButton__MenuButtonWrapper-dq0g44-0 imLDTG']") //or (//span[@data-qa='menu-title'])[3]
    public WebElement financingLink;

    @FindBy(css = "a[data-cv-test='headerFinanceLoanCalc']")
    public WebElement autoLoanCalculatorLink;
















}
