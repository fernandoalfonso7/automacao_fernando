package br.com.chronosAcademy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    private WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }
    public String inicio() {
        String xpathTitulo = "//*[@id=\"root\"]/div[1]/div[1]/div/button";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }
    public void clickbotao() {
        String xpathButton = "//*[@id=\"root\"]/div[1]/div[1]/div/button";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathButton));
        btnTitulo.click();
    }
}
