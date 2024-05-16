package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Metodos.Metodos;

public class Elementos {
    WebDriver driver;
    Metodos metodos;

    public Elementos(WebDriver driver) {
        this.driver = driver;
        this.metodos = new Metodos(driver);
    }

    private By campoCpf = By.name("cpf");
    private By btnContinuar = By.id("test");
    private By campoNome = By.name("name");
    private By campoCelular = By.name("phone");
    private By campoEmail = By.name("email");
    private By campoEmailconf = By.name("emailConfirmation");
    private By checkbox = By.xpath("//span[normalize-space()='Aceito receber comunicações do Nubank por WhatsApp.']");
    private By checkboxTermo = By.xpath("//*[@id=\"label-accepted\"]/span[2]/span");
    private By btnEnviar = By.xpath("//button[@type='submit']");
    private By textoValidacao = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > h4");

    public void telaHomeCampocpf() throws InterruptedException {
        Thread.sleep(3000);    
        metodos.preencher("57749996028", campoCpf);
        metodos.click(btnContinuar);            
    }
    
    public void preencherFormulario() {
        metodos.preencher("Samuel teste", campoNome);
        metodos.preencher("11958642578", campoCelular);
        metodos.preencher("teste@teste.com.br", campoEmail);
        metodos.preencher("teste@teste.com.br", campoEmailconf);
        metodos.click(checkbox);
        metodos.click(checkboxTermo);
        metodos.click(btnEnviar);
    }

    public void validarTexto() {
        metodos.validacaoTexto(textoValidacao, "Informações enviadas");
    }
}
