package com.loop.pages;
import com.loop.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClientPage {




    public ClientPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccountText;

    @FindBy(xpath = "//span[contains(normalize-space(),'Continue')]")       //*[contains(text(),'Continue')]  //*[contains(text(),'Home')]
    public WebElement continueButton;

    @FindBy(xpath = "//*[contains(text(),'true')]")
    public WebElement hiddenButton;


    @FindBy(xpath = "//*[contains(text(),'Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//*[contains(text(),'Invitations')]")
    public WebElement invitationButton;





}