package com.bdd.web.glue;

import com.bdd.web.step.HomeStep;
import com.bdd.web.step.LoginStep1;
import com.bdd.web.step.LoginStep1;
import com.fw.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginGlue {

    private WebDriver driver;
    private LoginStep1 loginStep1;
    private HomeStep homeStep;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        loginStep1 = new LoginStep1(driver);
        homeStep = new HomeStep(driver);
    }

    @After
    public void tearsDown() throws InterruptedException {
        Util.waitThread(2000);
        driver.quit();
    }

    @Dado("que estoy en la plataforma de automationpracticeDemo")
    public void queEstoyEnLaPlataformaDeautomationpracticeDemo() {
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Entonces("se debería validar que estoy en el home de la plataforma")
    public void seDeberíaValidarQueEstoyEnElHomeDeLaPlataforma() {
        Assertions.assertEquals("My account", homeStep.getValueTitle());
    }

    @Entonces("se debería validar que se muestra el mensaje de error {string}")
    public void seDeberíaValidarQueSeMuestraElMensajeDeError(String messageError) {
        Assertions.assertEquals(messageError, loginStep1.getError());
    }
//------------------------baufest-----------------------------------------------------------------------
    @Dado("que estoy en la plataforma de product store")
    public void queEstoyEnLaPlataformaDeProductStore() {
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Cuando("ingreso a sign up")
    public void ingresoASignUp() {
        loginStep1.ingresoASignUp();
    }

    @Y("ingreso las credenciales del usuario")
    public void ingresoLasCredencialesDelUsuario(DataTable credentialTable) {
        String email = Util.getValueFromDataTable(credentialTable, "user");
        String passwd = Util.getValueFromDataTable(credentialTable, "pass");
        loginStep1.login(email, passwd);
    }


    @Cuando("ingreso a login")
    public void ingresoALogin() {
        loginStep1.ingresoALogin();
    }


    @Entonces("doy clic en sign up")
    public void doyClicEnSignUp() {
        loginStep1.doyClicEnSignUp();
    }

    @Y("doy click en login")
    public void doyClickEnLogin() {
        loginStep1.doyClickEnLogin();
    }

    @Entonces("doy click en logout")
    public void doyClickEnLogout() {
        loginStep1.doyClickEnLogout();
    }

    @Y("ingreso las credenciales del usuario creado")
    public void ingresoLasCredencialesDelUsuarioCreado(DataTable credentialTable) {
        String email = Util.getValueFromDataTable(credentialTable, "user");
        String passwd = Util.getValueFromDataTable(credentialTable, "pass");
        loginStep1.ingresoLasCredencialesDelUsuarioCreado(email, passwd);
    }

    @Cuando("doy click en laptops")
    public void doyClickEnLaptops() {
        loginStep1.doyClickEnLaptops();
    }

    @Y("selecciono una laptop")
    public void seleccionoUnaLaptop() {
        loginStep1.seleccionoUnaLaptop();
    }

    @Entonces("doy click en add to cart")
    public void doyClickEnAddToCart() {
        loginStep1.doyClickEnAddToCart();
    }
}

