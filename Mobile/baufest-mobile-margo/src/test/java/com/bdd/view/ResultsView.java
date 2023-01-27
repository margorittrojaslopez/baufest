package com.bdd.view;

import com.mobile.MobileBase;
import com.mobile.MobileDriverManager;
import com.mobile.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultsView extends MobileBase {

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.linio.android:id/rvGeneralContent']/android.widget.FrameLayout")
    private List<MobileElement> resultList;

    public int getSizeResult(){
        WebDriverWait webDriverWait =  new WebDriverWait(MobileDriverManager.getDriver(),15);
        webDriverWait.until(ExpectedConditions.visibilityOf(resultList.get(0)));
        Util.takeScreenshot();
        return resultList.size();
    }
}
