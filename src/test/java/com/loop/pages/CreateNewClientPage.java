package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewClientPage {

    @FindBy(xpath = "//*[@id='input-14']")
    public WebElement userInput;

    @FindBy(xpath = "//*[@id='input-15']")
    public WebElement passwordIn;

    @FindBy(xpath = "//span[@class='v-btn__content']")
    public WebElement loginBut;

    @FindBy(xpath = "//a[@href='/clients']")
    public WebElement linkClients;

    @FindBy(xpath = "/html/body/div/div/main/main/div/section/div[1]/div/div[2]/div/button[2]/span[1]/span")
    public WebElement createNewClientButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/span")
    public WebElement personal;

    @FindBy(xpath = "//input[@id='input-117']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='input-118']")
    public WebElement LastNameInput;

    @FindBy(xpath = "//input[@id='input-119']")
    public WebElement ownerInput;

    @FindBy(xpath = "//div[contains(@class, 'ripple')]")
    public WebElement SelectionRipple;

    @FindBy(xpath = "//input[@id='input-237']")
    public WebElement emailAddressInput;
    @FindBy(xpath = "//label[.='Advisor']/following-sibling::input")
    public WebElement batchGroup;
    @FindBy(xpath = "//div[contains(text(),'Group1')]")
    public WebElement batchGroup1;

    @FindBy(xpath = "//input[@id='input-241']")
    public WebElement phoneInput;

    @FindBy(xpath = "//input[@id='input-242']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@id='input-246']")
    public WebElement confirmPassword;

   @FindBy(xpath = "//span[contains(text(),' Save ')]")
   public WebElement saveButton;

    @FindBy(xpath = "//input[@id='input-241']")
    public WebElement phoneInput1;

    @FindBy(xpath =  "//div[contains(@class,'v-select__selections')][1]")
            public WebElement service;
    @FindBy(xpath = "//input[@id='input-305']")
    public WebElement collaborator;

    @FindBy(xpath = "//input[@id='input-308']")
    public WebElement address1;
    @FindBy(xpath = "//input[@id='input-309']")
    public WebElement address2;

    @FindBy(xpath = "//input[@id='input-310']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='input-311']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='input-314']")
    public WebElement zipCode;
    @FindBy(xpath = "//label[@for='input-111']")
    public WebElement marriageInfo;

    @FindBy(xpath = "//span[contains(text(),' Save ')]")
    public WebElement saveButton1;




















    public CreateNewClientPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
