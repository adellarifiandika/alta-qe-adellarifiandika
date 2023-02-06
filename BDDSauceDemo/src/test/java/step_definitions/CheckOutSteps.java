package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.CheckOutInfoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutSteps {
    private WebDriver webDriver;
    public CheckOutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on checkout page")
    public void verifyYourCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyYourCartPage());
        Thread.sleep(3000);
        cartPage.removeBasket1();
        Thread.sleep(3000);
        cartPage.setProcessCheckout();
        Thread.sleep(3000);
    }
    @When("User input \"(.*)\" as userFirst and input \"(.*)\" as last and input \"(.*)\" as zip")
    public void inputCredential(String userFirst, String userLast, String userZip) throws InterruptedException{
        CheckOutInfoPage checkoutInfoPage = new CheckOutInfoPage(webDriver);
        Assert.assertTrue(checkoutInfoPage.verifyYourCartInfoPage());
        checkoutInfoPage.setUserFirstName(userFirst);
        Thread.sleep(2000);
        checkoutInfoPage.setUserLastName(userLast);
        Thread.sleep(2000);
        checkoutInfoPage.setUserZip(userZip);
        Thread.sleep(2000);
        checkoutInfoPage.setContinue();
        Thread.sleep(2000);
        Assert.assertTrue(checkoutInfoPage.verifyYourCheckOutPage());
        Thread.sleep(2000);
    }
    @Then("User ensure the item total and tax")
    public void verifyYourCartList() throws InterruptedException {
        CheckOutInfoPage checkoutInfoPage = new CheckOutInfoPage(webDriver);
        Assert.assertTrue(checkoutInfoPage.setVrfyCartList());
        Assert.assertEquals(checkoutInfoPage.setItemChosenPrice(),checkoutInfoPage.setItem(), 0);
        Assert.assertTrue(checkoutInfoPage.setVrfyTotalTax());
        Thread.sleep(2000);
    }
    @And("User ensure the total price after sum with the tax")
    public void verifyTotalPrice() throws InterruptedException{
        CheckOutInfoPage checkoutInfoPage = new CheckOutInfoPage(webDriver);
        Assert.assertEquals(checkoutInfoPage.setItem()+checkoutInfoPage.setVrfyTotalwithTax(), checkoutInfoPage.setTotal(),0);
        Thread.sleep(2000);
    }
    @Then("User Has Completed the Checkout Order")
    public void verifyCheckoutOrderPage() throws InterruptedException{
        CheckOutInfoPage checkoutInfoPage = new CheckOutInfoPage(webDriver);
        checkoutInfoPage.setBtnFinish();
        Assert.assertTrue(checkoutInfoPage.setvrfyCheckoutComplete());
        Thread.sleep(4000);
    }

}