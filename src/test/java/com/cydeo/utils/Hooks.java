package com.cydeo.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Hooks {

    protected AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setDriver(){
        driver = Driver.getDriver();
    }

    @AfterEach
    public void tearDown(){
        Driver.closeDriver();
    }
}
