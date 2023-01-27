package com.bdd.web.step;

import com.bdd.web.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    private WebDriver driver;

    public LoginStep(WebDriver driver) {
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

}
