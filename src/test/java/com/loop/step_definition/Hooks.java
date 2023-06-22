package com.loop.step_definition;

import com.loop.utilities.Driver;
import io.cucumber.java.Scenario;
//import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.junit.After;
import org.junit.Before;
public class Hooks {

    @Before
    public void setup() {
        Driver.getDriver();

    }

    @After
    public void tearDown(Scenario scenario) {
        //only takes screenshot when scenario is failed
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        Driver.closeDriver();
    }
}