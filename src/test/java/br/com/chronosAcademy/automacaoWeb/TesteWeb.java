package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("edge"); //construtor do Driver.java
        driver = driverWeb.getDriver();
        driver.get("https://portal.app.foursys.com");
    }

    @Test
    public void primeiroTeste() {
        String xpathTitulo = "//*[@id=\"root\"]/div[1]/div[1]/div/button";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Entrar", titulo);

        driver.quit();
    }

    @After
    public void finalizaTeste(){
        driver.quit();

        }


}


