package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searButton;

    @FindBy(xpath = "//h1/span")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[contains(@class,'fn')]")
    public WebElement imageHeader;


    public WikipediaSearchPage() { PageFactory.initElements(Driver.getDriver(), this);}
}
