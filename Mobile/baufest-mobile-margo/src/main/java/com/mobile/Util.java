package com.mobile;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class Util {
    public static void takeScreenshot(){
        byte[] screenshot = MobileDriverManager.getDriver().getScreenshotAs(OutputType.BYTES);
        ManageScenario.getScenario().attach(screenshot,"image/jpeg","evidencia");
    }
}
