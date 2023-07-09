package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends SmartBearBasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement usernameInput;



    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement loginInput;


    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(className = "v-btn__content")
    public WebElement loginButton;


    @FindBy (xpath = "//span[.=' Continue ']")
    public WebElement homeButton;


    /**
     * logins to docuport
     *
     * @param username
     * @param password
     * @author akb
     */

    public void loginDocuport(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, 15);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(loginButton, 15);
        BrowserUtils.clickWithJS(loginButton);
        BrowserUtils.clickWithJS(homeButton);
    }


}



