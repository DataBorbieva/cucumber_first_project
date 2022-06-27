package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utils.ActionsUtil;
import utils.Driver;
import utils.DropdownHandler;
import utils.Waiter;

public class CarvanaSteps {

    WebDriver driver;
    CarvanaMainPage carvanaMainPage;
    CarvanaCarFinderPage carvanaCarFinderPage;
    CarvanaSearchQaPage carvanaSearchQaPage;
    CarvanaSellTradePage carvanaSellTradePage;
    CarvanaAutoLoanCalculatorPage carvanaAutoLoanCalculatorPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        carvanaMainPage = new CarvanaMainPage();
        carvanaCarFinderPage = new CarvanaCarFinderPage();
        carvanaSearchQaPage = new CarvanaSearchQaPage();
        carvanaSellTradePage = new CarvanaSellTradePage();
        carvanaAutoLoanCalculatorPage = new CarvanaAutoLoanCalculatorPage();

    }





    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String link) {

        switch (link) {

            case"CAR FINDER":
            Waiter.pause(3);
            carvanaMainPage.carFinderLink.click();
            break;
            case"SELL/TRADE":
                Waiter.pause(2);
                carvanaMainPage.sellTradeLink.click();
                break;
            case"AUTO LOAN CALCULATOR":
                carvanaMainPage.autoLoanCalculatorLink.click();
                break;
            default:
                throw new NotFoundException("The link is not defined properly in the feature file!!!");

        }
    }
    @Then("user should be navigated to {string}")
    public void userShouldBeNavigatedTo(String navigatedToUrl) {
        switch (navigatedToUrl) {
            case "https://www.carvana.com/help-me-search/":
            Assert.assertEquals(navigatedToUrl, driver.getCurrentUrl());
            break;
            case "https://www.carvana.com/help-me-search/qa":
                Assert.assertEquals(navigatedToUrl, driver.getCurrentUrl());
                break;
            case "https://www.carvana.com/sell-my-car":
                Assert.assertEquals(navigatedToUrl, driver.getCurrentUrl());
                break;
            default:
                throw new NotFoundException("The url is not defined properly in the feature file!!!");
        }
    }
    @And("user should see {string} text")
    public void userShouldSeeText(String expectedText) {
        switch (expectedText) {
            case "WHAT CAR SHOULD I GET?":
                Assert.assertEquals(expectedText, carvanaCarFinderPage.textH1.getText());
                break;
            case "Car Finder can help! Answer a few quick questions to find the right car for you.":
                Assert.assertEquals(expectedText, carvanaCarFinderPage.textH3.getText());
                break;
            case "WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?":
                Assert.assertEquals(expectedText, carvanaSearchQaPage.searchQaPageHeaderText.getText());
                break;
            case "Select up to 4 in order of importance":
                Assert.assertEquals(expectedText, carvanaSearchQaPage.searchQaPageUnderHeaderSmallerText.getText());
                break;
            case "GET A REAL OFFER IN 2 MINUTES":
                Waiter.pause(2);
                Assert.assertEquals(expectedText, carvanaSellTradePage.mainHeadingText.getText());
                break;
            case "We pick up your car. You get paid on the spot.":
                Assert.assertEquals(expectedText, carvanaSellTradePage.underHeadingSmallerText.getText());
                break;
            case"We couldn’t find that VIN. Please check your entry and try again.":
                Waiter.pause(7);
                Assert.assertEquals(expectedText, carvanaSellTradePage.errorMessageAfterInvalidVin.getText());
                break;
            default:
                throw new NotFoundException("The text is not defined properly in the feature file!!!");
        }
    }
    @And("user should see {string} link")
    public void userShouldSeeLink(String link) {
        Assert.assertTrue(carvanaCarFinderPage.tryCarFinderLink.isDisplayed());
    }

    @When("user clicks on {string} link")
    public void userClicksOnLink(String link) {
        Waiter.pause(3);
        carvanaCarFinderPage.tryCarFinderLink.click();
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String button) {
        switch (button){
            case"VIN":
                Waiter.pause(2);
                carvanaSellTradePage.vinButton.click();
                break;
            case "GET MY OFFER":
                Waiter.pause(1);
                carvanaSellTradePage.getMyOfferButton.click();
                break;
            default:
                throw new NotFoundException("The button is not defined properly in the feature file!!!");
        }
        }


    @And("user enters vin number as {string}")
    public void userEntersVinNumberAs(String vinNumber) {
        Waiter.pause(2);
        carvanaSellTradePage.inputForVin.sendKeys(vinNumber);
    }

    @When("user hovers over on {string} menu item")
    public void userHoversOverOnMenuItem(String key) {
        Assert.assertEquals(key,carvanaMainPage.financingLink.getText());
        Waiter.pause(2);
        ActionsUtil.moveToElement(carvanaMainPage.financingLink);
    }

    @When("user enters {string} as {string}")
    public void userEntersAs(String text1AboutCost, String text2Cost) {
        switch (text1AboutCost){
            case "Cost of Car I want":
                Assert.assertTrue(text1AboutCost,carvanaAutoLoanCalculatorPage.costOfCarInputBox.isDisplayed());
                carvanaAutoLoanCalculatorPage.costOfCarInputBox.sendKeys(text2Cost);
                break;
            case "What is Your Down Payment?":
                carvanaAutoLoanCalculatorPage.downPayment.sendKeys(text2Cost);
                break;
            default:
                throw new NotFoundException("The entered info is not defined properly in the feature file!!!");
        }
    }

    @And("user selects {string} as {string}")
    public void userSelectsAs(String text1AboutScore, String text2Score) {
        switch (text1AboutScore) {
            case "What’s Your credit Score?":
                DropdownHandler.selectOptionByIndex(carvanaAutoLoanCalculatorPage.creditScoreBox, 0);
                break;
            case "Choose Your Loan Terms":
                Waiter.pause(2);
                DropdownHandler.selectOptionByIndex(carvanaAutoLoanCalculatorPage.loanTerm, 1);
                break;
            default:
                throw new NotFoundException("Selected info is not defined properly in the feature file!!!");
        }
    }

    @Then("user should see the monthly payment as {string}")
    public void userShouldSeeTheMonthlyPaymentAs(String payment) {
        Assert.assertTrue(carvanaAutoLoanCalculatorPage.monthlyPayment.isDisplayed());
        Assert.assertEquals(payment,carvanaAutoLoanCalculatorPage.monthlyPayment.getText());
    }
}
