package com.bdd.view;

import com.mobile.MobileBase;
import com.mobile.MobileDriverManager;
import com.mobile.Util;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.commons.validator.Msg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoView extends MobileBase {

//----------------------------------------------------------------
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]")
    private MobileElement leDoyClickALoguin;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement leDoyClickASignUp;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    private MobileElement ingresoElCorreoElectronico;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    private MobileElement ingresoLaContrasena;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-repeat-password\"]")
    private MobileElement confirmoLaContrasena;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement clickEnSignUp;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement mensajeNoPodemosEncontrar;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement clickEnLogin;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement mensajeNoPodemosEncontrardos;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Forms\"]")
    private MobileElement leDoyClickAForm;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"text-input\"]")
    private MobileElement ingresoInputField;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private MobileElement clicEnDropdown;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private MobileElement clickEnAppiumAwesome;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-Active\"]")
    private MobileElement clickEnActive;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement mensajeNoPodemosEncontrartres;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Webview\"]")
    private MobileElement leDoyClickAWebview;
    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")
    private MobileElement clickEnElBuscador;
    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    private MobileElement ingresoLaPalabraABuscar;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"The Browser Object\"]/android.view.View[2]")
    private MobileElement clicEnBrowser;
    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button")
    private MobileElement clicx;
    @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[2]")
    private MobileElement mensajeNoPodemosEncontrarcua;

    //baufest------------------------------------------

    public void leDoyClickALoguin() {
        implicitWait(5);
        System.out.println("da click ");
        leDoyClickALoguin.click();
        System.out.println("confirma el click ");
    }

    public void leDoyClickASignUp() {
        implicitWait(5);
        leDoyClickASignUp.click();
    }

    public void ingresoElCorreoElectronico(String correo) {
        implicitWait(5);
        ingresoElCorreoElectronico.sendKeys(correo);
    }

    public void ingresoLaContrasena(String pass) {
        implicitWait(5);
        ingresoLaContrasena.sendKeys(pass);
    }

    public void confirmoLaContrasena(String pass) {
        implicitWait(5);
        confirmoLaContrasena.sendKeys(pass);
    }

    public void clickEnSignUp() {
        implicitWait(5);
        clickEnSignUp.click();
    }
    public boolean validoQueSeConfirmaSingUp() {
        boolean existeMensaje = false;
        implicitWait(2);
        existeMensaje = mensajeNoPodemosEncontrar.isDisplayed();
        //existeMensaje = isObjectVisible(mensajeNoPodemosEncontrar);

        return existeMensaje;

    }

    public static void implicitWait(int timeOnSeconds) {
        try {
            Thread.sleep((long) (timeOnSeconds * 1000));
        } catch (Exception exec) {
        }
    }

    public void clickEnLogin() {
        implicitWait(5);
        clickEnLogin.click();
    }

    public boolean validoQueSeConfirmaLogin() {
        boolean existeMensaje = false;
        implicitWait(2);
        existeMensaje = mensajeNoPodemosEncontrardos.isDisplayed();
        //existeMensaje = isObjectVisible(mensajeNoPodemosEncontrar);

        return existeMensaje;
    }

    public void leDoyClickAForm() {
        implicitWait(5);
        leDoyClickAForm.click();
    }

    public void ingresoInputField(String input) {
        implicitWait(5);
        ingresoInputField.sendKeys(input);
    }

    public void clicEnDropdown() {
        implicitWait(5);
        clicEnDropdown.click();
    }

    public void clickEnAppiumAwesome() {
        implicitWait(5);
        clickEnAppiumAwesome.click();
    }

    public void clickEnActive() {
        implicitWait(5);
        clickEnActive.click();
    }

    public boolean validoQueSeConfirmaElActive() {
        boolean existeMensaje = false;
        implicitWait(2);
        existeMensaje = mensajeNoPodemosEncontrartres.isDisplayed();
        //existeMensaje = isObjectVisible(mensajeNoPodemosEncontrar);

        return existeMensaje;
    }

    public void leDoyClickAWebview() {
        implicitWait(5);
        leDoyClickAWebview.click();
    }

    public void clickEnElBuscador() {
        waitUntilVisibilityElement(20, clickEnElBuscador);
        clickEnElBuscador.click();
    }

    public void ingresoLaPalabraABuscar(String docs) {
        implicitWait(5);
        ingresoLaPalabraABuscar.sendKeys(docs);
    }

    public void clicEnBrowser() {
        implicitWait(5);
        clicEnBrowser.click();
        clicx.click();
    }

    /*public boolean isObjectVisible(MobileElement element) {
        WebDriver.Timeouts timeouts = MobileDriverManager.getDriver().manage().timeouts().implicitlyWait(10);
        boolean esVisible = false;
            esVisible = element.isDisplayed();


        return esVisible;
    }*/
    public MobileElement waitUntilVisibilityElement(int timeOnSeconds, MobileElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(MobileDriverManager.getDriver(), (long)timeOnSeconds);
        return (MobileElement)webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean validoQueSeConfirmaLaBusqueda() {
        boolean existeMensaje = false;
        implicitWait(2);
        existeMensaje = mensajeNoPodemosEncontrarcua.isDisplayed();
        //existeMensaje = isObjectVisible(mensajeNoPodemosEncontrar);

        return existeMensaje;
    }
}
