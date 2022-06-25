package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class RealizarLogin {

    @Test
    public void primeiroTeste() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://portal.app.foursys.com/");
        String xpathTitulo1 = "//*[@id=\"root\"]/div[1]/div[1]/div/button";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo1));
        String titulo = txtTitulo.getText();
        assertEquals("Entrar", titulo);
        WebElement clickable = driver.findElement(By.xpath(xpathTitulo1));
        new Actions(driver)
                .click(clickable)
                .perform();
        String username = "fhortola";
        String senha = "Zuz76449@";
        String xpathcampouser = "//*[@id=\"user\"]";
        String xpathcampokey = "//*[@id=\"password\"]";
        driver.findElement(By.xpath(xpathcampouser)).sendKeys(username);
        driver.findElement(By.xpath(xpathcampokey)).sendKeys(senha);
        String xpathTitulo2 = "//*[@id=\"root\"]/div[1]/div/form/div/div/button";
        WebElement clickable2 = driver.findElement(By.xpath(xpathTitulo2));
        new Actions(driver)
                .click(clickable2)
                .perform();
        driver.quit();
    }

}
