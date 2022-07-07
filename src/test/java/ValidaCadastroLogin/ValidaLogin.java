package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class ValidaLogin {

    WebDriver navegadores;
    Driver driverWeb;

    @Before
    public void acessaPagina(){
        driverWeb = new Driver("chrome");
        navegadores = driverWeb.getDriver();
        navegadores.get("https://beta.coodesh.com/");
    }

    @Test
    public void validaBotao()throws InterruptedException {
    //Aceita cookies inicio
        Thread.sleep(1000);
        String xpathCookies = "//*[@id=\"onetrust-accept-btn-handler\"]";
        WebElement clickable0 = navegadores.findElement(By.xpath(xpathCookies));
        new Actions(navegadores)
                .click(clickable0)
                .perform();
        Thread.sleep(1000);

    //Valida descrição do botão
        String xpathTitulo = "//*[@id=\"header-nav-bar\"]/ul/li[3]/a/button";
        WebElement txtTitulo = navegadores.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Login", titulo);


    //Clica no botao
        WebElement clickable = navegadores.findElement(By.xpath(xpathTitulo));
        new Actions(navegadores)
                .click(clickable)
                .perform();
        Thread.sleep(1000);

    //Realiza Login
        String username = "alfonso.fernando@hotmail.com";
        String senha = "Fern@ndo@328";
        String xpathcampouser = "//*[@id=\"email\"]";
        String xpathcampokey = "//*[@id=\"password\"]";
        navegadores.findElement(By.xpath(xpathcampouser)).sendKeys(username);
        navegadores.findElement(By.xpath(xpathcampokey)).sendKeys(senha);
        String xpathTitulo2 = "//*[@id=\"content\"]/div/div/div/div/form/div[3]/div/div[2]/button";
        WebElement clickable2 = navegadores.findElement(By.xpath(xpathTitulo2));
        new Actions(navegadores)
                .click(clickable2)
                .perform();
        Thread.sleep(1500);

    //Valida o acesso
        String xpathSucesso = "//*[@id=\"__next\"]/div[1]/div/div[2]/div/div/div/div[2]";
        WebElement txtSucesso = navegadores.findElement(By.xpath(xpathSucesso));
        String sucesso = txtSucesso.getText();

        if (sucesso.equals("Seja bem-vindo!")) {
            //navegadores.quit();
            }
        else {
    //Valida/Clica botao cadastro
            Thread.sleep(5000);
        String xpathTitulo3 = "//*[@id=\"content\"]/div/div/div/div/form/div[3]/div/div[3]/div/a";
        WebElement txtTitulo2 = navegadores.findElement(By.xpath(xpathTitulo3));
        String titulo2 = txtTitulo2.getText();
        assertEquals("Cadastre-se", titulo2);
        WebElement clickable3 = navegadores.findElement(By.xpath(xpathTitulo3));
        new Actions(navegadores)
                .click(clickable3)
                .perform();
            Thread.sleep(1000);

     // Realiza Cadastro
        String newnome = "Joleandra Pereira";
        String newsenha = "Fern@ndo@3287";
        String newemail = "creattiveclubhair@hotmail.com";
        String xpathnovonome = "//*[@id=\"displayName\"]";
        String xpathnovasenha = "//*[@id=\"password\"]";
        String xpathnovoemail = "//*[@id=\"email\"]";
        String xpathtermo = "//*[@id=\"privacy.gpdr\"]";
        String xpathinscr = "//*[@id=\"content\"]/div/div/div/div[2]/form/div[5]/div/button";
        navegadores.findElement(By.xpath(xpathnovonome)).sendKeys(newnome);
        navegadores.findElement(By.xpath(xpathnovasenha)).sendKeys(newsenha);
        navegadores.findElement(By.xpath(xpathnovoemail)).sendKeys(newemail);
        WebElement clickable5 = navegadores.findElement(By.xpath(xpathtermo));
        new Actions(navegadores)
                .click(clickable5)
                .perform();
            Thread.sleep(1000);
        WebElement clickable6 = navegadores.findElement(By.xpath(xpathinscr));
        new Actions(navegadores)
                .click(clickable6)
                .perform();
            Thread.sleep(1000);


    }
/*
    @After
    public void finalizaTeste(){
        //navegadores.quit();
*/
    }


}


