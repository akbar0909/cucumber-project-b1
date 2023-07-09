package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearOrderPage extends SmartBearBasePage{

    public void SmartBearBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " ")
    public WebElement sample;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement product;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    public WebElement pricePerUnit;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_txtDiscount']")
    public WebElement discount;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_txtTotal']")
    public WebElement total;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement calculateButton;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerName;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement street;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zip;


    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> card;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiration;

    @FindBy(css = "a[id*='fmwOrder']")
    public WebElement processButton;

    @FindBy(css = "input[onclick='UpdateFields()']")
    public WebElement resetButton;

    @FindBy(xpath = "//a[contains(text(),'Order')]")
    public WebElement orderHeading;

    @FindBy(xpath = "/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[2]")
    public WebElement name;






   



 





   
  



}
