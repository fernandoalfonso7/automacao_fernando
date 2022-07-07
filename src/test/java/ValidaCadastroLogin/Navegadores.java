package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navegadores {
    private WebDriver navegadores;

    public Navegadores(String navegador){

        switch (navegador){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                navegadores = new ChromeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                navegadores = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                navegadores = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                navegadores = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                navegadores = new ChromeDriver();
                break;
        }
        navegadores.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return navegadores;
    }
}
