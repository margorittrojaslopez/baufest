package com.bdd.glue;

import com.bdd.step.DemoStep;
import com.mobile.ManageScenario;
import com.mobile.MobileDriverManager;
import com.mobile.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class DemoGlue {

    private DemoStep linioStep;
    private Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario){
        this.scenario = scenario;
        ManageScenario.setScenario(this.scenario);
        linioStep = new DemoStep();

    }
    @After
    public void afterScenario(){
        if(this.scenario.isFailed())
            Util.takeScreenshot();

        MobileDriverManager.quitDriver();
    }


// WEBDRIVER

    @Dado("que me encuentro en la aplicación webdriver")
    public void queMeEncuentroEnLaAplicaciónWebdriver() {
        MobileDriverManager.setMobileDriver();

    }

    @Cuando("le doy click a loguin")
    public void leDoyClickALoguin() {
        linioStep.leDoyClickALoguin();

    }

    @Y("le doy click a sign up")
    public void leDoyClickASignUp() {
        linioStep.leDoyClickASignUp();
    }

    @Y("ingreso el correo electronico {string}")
    public void ingresoElCorreoElectronico(String correo) {
        linioStep.ingresoElCorreoElectronico(correo);
    }

    @Y("ingreso la contrasena {string}")
    public void ingresoLaContrasena(String pass) {
        linioStep.ingresoLaContrasena(pass);
    }

    @Y("confirmo la contrasena {string}")
    public void confirmoLaContrasena(String pass) {
        linioStep.confirmoLaContrasena(pass);
    }

    @Y("click en sign up")
    public void clickEnSignUp() {
        linioStep.clickEnSignUp();
    }

    @Entonces("valido que se confirma sign up")
    public void validoQueSeConfirmaSingUp() {
        linioStep.validoQueSeConfirmaSingUp();

    }

    @Y("click en login")
    public void clickEnLogin() {
        linioStep.clickEnLogin();
    }

    @Entonces("valido que se confirma login")
    public void validoQueSeConfirmaLogin() {
        linioStep.validoQueSeConfirmaLogin();

    }

    @Cuando("le doy click a form")
    public void leDoyClickAForm() {
        linioStep.leDoyClickAForm();
    }

    @Y("ingreso input field {string}")
    public void ingresoInputField(String input) {
        linioStep.ingresoInputField(input);
    }

    @Y("clic en dropdown")
    public void clicEnDropdown() {
        linioStep.clicEnDropdown();
    }

    @Y("click en appium awesome")
    public void clickEnAppiumAwesome() {
        linioStep.clickEnAppiumAwesome();
    }

    @Y("click en active")
    public void clickEnActive() {
        linioStep.clickEnActive();
    }

    @Entonces("valido que se confirma el active")
    public void validoQueSeConfirmaElActive() {
        linioStep.validoQueSeConfirmaElActive();
    }

    @Cuando("le doy click a webview")
    public void leDoyClickAWebview() {
        linioStep.leDoyClickAWebview();
    }

    @Y("click en el buscador")
    public void clickEnElBuscador() {
        linioStep.clickEnElBuscador();
    }

    @Y("ingreso la palabra a buscar {string}")
    public void ingresoLaPalabraABuscar(String docs) {
        linioStep.ingresoLaPalabraABuscar(docs);
    }

    @Y("clic en browser")
    public void clicEnBrowser() {
        linioStep.clicEnBrowser();
    }

    @Entonces("valido que se confirma la busqueda")
    public void validoQueSeConfirmaLaBusqueda() {
        linioStep.validoQueSeConfirmaLaBusqueda();
    }
}
