package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.page.PortalPage;
import br.com.chronosAcademy.page.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage ;
    PortalPage portalPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://portal.app.foursys.com");
        principalPage = new PrincipalPage(driver);

    }

    @Test
    public void primeiroTeste() {
        assertEquals("Entrar", principalPage.inicio());

    }

    @Test
    public  void segundoTeste(){
        portalPage = new PortalPage(driver);
        principalPage.clickbotao();

        assertEquals("Portal Foursys", portalPage.getTitulo2());

    }


    @After
    public void finalizaTeste(){
        //driver.quit();

        }
}


