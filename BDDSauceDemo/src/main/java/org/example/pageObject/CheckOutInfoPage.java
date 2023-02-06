package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfoPage {
    public static WebDriver driver;

    public CheckOutInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyYourCartInfoPage;
    public boolean verifyYourCartInfoPage(){
        return vrfyYourCartInfoPage.isDisplayed();
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement userFirstName;
    public void setUserFirstName(String userFirst){

        userFirstName.sendKeys(userFirst);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement userLastName;

    public void setUserLastName(String userLast){
        userLastName.sendKeys(userLast);
    }
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement userZip;
    public void setUserZip(String userZipCode){
        userZip.sendKeys(userZipCode);
    }

    @FindBy(id = "continue")
    private WebElement btnContinue;
    public void setContinue(){
        btnContinue.click();
    }
    //div[@class='header_secondary_container']
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyCheckOutPage;
    public boolean verifyYourCheckOutPage(){
        return vrfyCheckOutPage.isDisplayed();
    }
    @FindBy(xpath ="//div[@class='cart_list']")
    private WebElement vrfyCartList;

    public boolean setVrfyCartList() {
        return vrfyCartList.isDisplayed();
    }
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement itemChosenPrice;
    public Float setItemChosenPrice(){
        String a = itemChosenPrice.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath ="//div[@class='summary_subtotal_label']")
    private WebElement vrfyItem;
    public Float setItem(){
        String a = vrfyItem.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath ="//div[@class='summary_tax_label']")
    private WebElement vrfyTotalTax;
    public boolean setVrfyTotalTax() {
        return vrfyTotalTax.isDisplayed();
    }
    public Float setVrfyTotalwithTax() {
        String a = vrfyTotalTax.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }

    @FindBy(xpath ="//div[@class='summary_total_label']")
    private WebElement vrfyTotal;
    public Float setTotal(){
        String a = vrfyTotal.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
    public void setBtnFinish(){

        btnFinish.click();
    }

    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyCheckoutComplete;
    public boolean setvrfyCheckoutComplete() {
        return vrfyCheckoutComplete.isDisplayed();
    }




}