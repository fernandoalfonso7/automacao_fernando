package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TesteWeb {

    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globo.com");
        String xpathTitulo = "/html/body/section[2]/div/div/div[1]/div[1]/div/a/h3";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Governo decide elevar vale-gás e criar auxílio para caminhoneiros",titulo);

        driver.quit();



    }

}
