package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageForAdvisor {

    //@FindBy (xpath = "//span[contains(text(),'Batch1 Group1')]")
    //public WebElement profileButton;

    public HomePageForAdvisor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
