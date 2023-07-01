package com.loop.step_definition;

import com.loop.pages.WikipediaSearchPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.xml.namespace.QName;

public class WikipediaSearchDefs {
    WikipediaSearchPage wikipediaSearchPage =new WikipediaSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiki.url"));

    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name) {
        wikipediaSearchPage.searchBox.sendKeys(name);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searButton.click();

    }
    @Then("User sees {string} is in the {string}")
    public void user_sees_is_in_the_wiki_title(String name,String title) {
//        Assert.assertEquals(Driver.getDriver().getTitle(), (name + " - Wikipedia"));
//        Assert.assertEquals(wikipediaSearchPage.mainHeader.getText(), name);
//        Assert.assertEquals(wikipediaSearchPage.imageHeader.getText(),name);


        if(title.equalsIgnoreCase("wiki title")) {
            Assert.assertEquals(Driver.getDriver().getTitle(), (name + " - Wikipedia"));
        }else if (title.equalsIgnoreCase("main header")) {
            Assert.assertEquals(wikipediaSearchPage.mainHeader.getText(), name);
        }else if (title.equalsIgnoreCase("image headerr")){
            Assert.assertEquals(wikipediaSearchPage.imageHeader.getText(),name);

        }






    }
}
