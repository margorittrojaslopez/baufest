package com.bdd.step;

import com.bdd.view.DemoView;
import com.bdd.view.ResultsView;
import org.junit.Assert;

public class DemoStep {
    private DemoView homeView(){
        return new DemoView();
    }

    private ResultsView resultsView(){
        return new ResultsView();
    }
    
    //webdriver - baufest
    public void leDoyClickALoguin() {
        homeView().leDoyClickALoguin();
    }

    public void leDoyClickASignUp() {
        homeView().leDoyClickASignUp();
    }

    public void ingresoElCorreoElectronico(String correo) {
        homeView().ingresoElCorreoElectronico(correo);

    }

    public void ingresoLaContrasena(String pass) {
        homeView().ingresoLaContrasena(pass);
    }

    public void confirmoLaContrasena(String pass) {
        homeView().confirmoLaContrasena(pass);
    }

    public void clickEnSignUp() {
        homeView().clickEnSignUp();
    }


    public void validoQueSeConfirmaSingUp() {
        Assert.assertTrue("No mostro mensaje ",
                homeView().validoQueSeConfirmaSingUp());
    }

    public void clickEnLogin() {
        homeView().clickEnLogin();
    }

    public void validoQueSeConfirmaLogin() {
        Assert.assertTrue("No mostro mensaje ",
                homeView().validoQueSeConfirmaLogin());
    }

    public void leDoyClickAForm() {
        homeView().leDoyClickAForm();
    }

    public void ingresoInputField(String input) {
        homeView().ingresoInputField(input);
    }

    public void clicEnDropdown() {
        homeView().clicEnDropdown();
    }

    public void clickEnAppiumAwesome() {
        homeView().clickEnAppiumAwesome();
    }

    public void clickEnActive() {
        homeView().clickEnActive();
    }

    public void validoQueSeConfirmaElActive() {
        Assert.assertTrue("No mostro mensaje ",
                homeView().validoQueSeConfirmaElActive());
    }

    public void leDoyClickAWebview() {
        homeView().leDoyClickAWebview();
    }

    public void clickEnElBuscador() {
        homeView().clickEnElBuscador();
    }

    public void ingresoLaPalabraABuscar(String docs) {
        homeView().ingresoLaPalabraABuscar(docs);
    }

    public void clicEnBrowser() {
        homeView().clicEnBrowser();
    }

    public void validoQueSeConfirmaLaBusqueda() {
        Assert.assertTrue("No mostro mensaje ",
                homeView().validoQueSeConfirmaLaBusqueda());
    }
}
