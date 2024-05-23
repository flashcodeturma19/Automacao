package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Metodos.Metodos;

public class Page_tela_home {
    WebDriver driver;
    Metodos metodos;

    public Page_tela_home(WebDriver driver) {
        this.driver = driver;
        this.metodos = new Metodos(driver);
    }

    private By campoCpf = By.name("cpf");
    private By btnContinuar = By.id("test");
    private By textoValidacao = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > h4");

    public void telaHomeCampocpf() throws InterruptedException {
        Thread.sleep(3000);    
        metodos.preencher("57749996028", campoCpf);
        metodos.click(btnContinuar);            
   
    }

    public void validarTexto() {
        metodos.validacaoTexto(textoValidacao, "Informações enviadas");
    }
}
