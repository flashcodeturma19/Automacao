package Metodos;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Metodos {
    WebDriver driver;
    
    public Metodos(WebDriver driver) {
        this.driver = driver;
    }

    public void preencher(String texto, By element) {
        driver.findElement(element).sendKeys(texto);
    }
    
    public void abrirNavegador(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void click(By elemento) {
        driver.findElement(elemento).click();
    }

    public void validacaoTexto(By elmento, String texto) {
        String textoesperado = driver.findElement(elmento).getText();
        assertEquals(textoesperado, texto);
    }
}
