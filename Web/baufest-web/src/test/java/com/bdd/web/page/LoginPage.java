package com.bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM _ String
//POM_ By.
//POM + PageFACTORY_@FindBy
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sign-username")
    private WebElement userInput;
    @FindBy(id = "sign-password")
    private WebElement passInput;
    @FindBy(xpath = "//div[@class='modal-footer']/button[@onclick='register()']")
    private WebElement doyClicEnSignUp;
    @FindBy(id = "signin2")
    private WebElement ingresoASignUp;
    @FindBy(id = "login2")
    private WebElement ingresoALogin;
    @FindBy(xpath = "//div[@class='modal-footer']/button[@onclick='logIn()']")
    private WebElement doyClickEnLogin;
    @FindBy(id = "logout2")
    private WebElement doyClickEnLogout;
    @FindBy(id = "loginusername")
    private WebElement typeUseruno;
    @FindBy(id = "loginpassword")
    private WebElement typePassuno;
    @FindBy(id = "itemc")
    private WebElement doyClickEnLaptops;
    @FindBy(id = "")
    private WebElement seleccionoUnaLaptop;
    @FindBy(id = "")
    private WebElement doyClickEnAddToCart;




    @FindBy(xpath = "//ol[li]")
    private WebElement messageError;




    //ACTIONS
    public void typeUser(String user) {
        userInput.sendKeys(user);
    }

    public void typePass(String pass) {
        passInput.sendKeys(pass);
    }


    public String getError(){
        return messageError.getText();
    }

    public void ingresoASignUp() {
        ingresoASignUp.click();
    }

    public void ingresoALogin() {
        ingresoALogin.click();
    }

    public void doyClicEnSignUp() {
        doyClicEnSignUp.click();
    }

    public void doyClickEnLogin() {
        doyClickEnLogin.click();
    }

    public void doyClickEnLogout() {
        implicitWait(5);
        doyClickEnLogout.click();
    }

    public static void implicitWait(int timeOnSeconds) {
        try {
            Thread.sleep((long) (timeOnSeconds * 1000));
        } catch (Exception exec) {
        }
    }
    public void typeUseruno(String user) {
        typeUseruno.sendKeys(user);
    }

    public void typePassuno(String pass) {
        typePassuno.sendKeys(pass);
    }

    public void doyClickEnLaptops() {
        doyClickEnLaptops.click();
    }

    public void seleccionoUnaLaptop() {
        seleccionoUnaLaptop.click();
    }

    public void doyClickEnAddToCart() {
        doyClickEnAddToCart.click();
    }
}
