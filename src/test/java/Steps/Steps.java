package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Metodos.Metodos;
import Page.Page_tela_Formulario_Abertura_conta;
import Page.Page_tela_home;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    WebDriver driver;
    Metodos metodos;
    Page_tela_home elementos;
    Page_tela_Formulario_Abertura_conta formulario;

    @Given("que acesse a url {string}")
    public void que_acesse_a_url(String url) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        driver = new ChromeDriver();
        metodos = new Metodos(driver);
        elementos = new Page_tela_home(driver);
        formulario = new Page_tela_Formulario_Abertura_conta(driver);
        metodos.abrirNavegador(url);
    }

    @Given("preencha o campo cpf")
    public void preencha_o_campo_cpf() throws InterruptedException {
        elementos.telaHomeCampocpf();
    }

    @When("preencher o formulario de abertua de conta")
    public void preencher_o_formulario_de_abertua_de_conta() throws InterruptedException {
    	metodos = new Metodos(driver);
    	formulario.preencherFomularioAberturaContaPf();
    }

    @Then("realizo a validacao de formulario enviado com sucesso")
    public void realizo_a_validacao_de_formulario_enviado_com_sucesso() {
        elementos.validarTexto();
    }
    
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
