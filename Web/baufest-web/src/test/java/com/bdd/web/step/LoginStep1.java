package com.bdd.web.step;
import com.bdd.web.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginStep1 {
    private WebDriver driver;

    public LoginStep1(WebDriver driver) {
        this.driver = driver;
    }

    private LoginPage loginPage() {
        return new LoginPage(this.driver);
    }

    public void login(String user, String pass) {
        loginPage().typeUser(user);
        if (pass == null) pass = "";
        loginPage().typePass(pass);

    }

    public String getError() {
        return loginPage().getError();
    }

    public void ingresoASignUp() {
        loginPage().ingresoASignUp();


    }

    public void ingresoALogin() {
        loginPage().ingresoALogin();
    }

    public void doyClicEnSignUp() {
        loginPage().doyClicEnSignUp();
    }

    public void doyClickEnLogin() {
        loginPage().doyClickEnLogin();
    }

    public void doyClickEnLogout() {
        loginPage().doyClickEnLogout();
    }

    public void ingresoLasCredencialesDelUsuarioCreado(String user, String pass) {
        loginPage().typeUseruno(user);
        if (pass == null) pass = "";
        loginPage().typePassuno(pass);

    }

    public void doyClickEnLaptops() {
        loginPage().doyClickEnLaptops();
    }

    public void seleccionoUnaLaptop() {
        loginPage().seleccionoUnaLaptop();
    }

    public void doyClickEnAddToCart() {
        loginPage().doyClickEnAddToCart();
    }
}
