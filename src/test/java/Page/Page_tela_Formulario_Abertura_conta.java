package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Metodos.Metodos;

public class Page_tela_Formulario_Abertura_conta {
	WebDriver driver;
	Metodos metodos;

	public Page_tela_Formulario_Abertura_conta(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);

	}

	private By campoNome = By.name("name");
	private By campoCelular = By.name("phone");
	private By campoEmail = By.name("email");
	private By campoEmailconf = By.name("emailConfirmation");
	private By checkbox = By.xpath("//span[normalize-space()='Aceito receber comunicações do Nubank por WhatsApp.']");
	private By checkboxTermo = By.xpath("//*[@id=\"label-accepted\"]/span[2]/span");
	private By btnEnviar = By.xpath("(//button[@type='submit'])[2]");

	public void preencherFomularioAberturaContaPf() throws InterruptedException {

		metodos.preencher("Samuel teste", campoNome);
		metodos.preencher("11958642578", campoCelular);
		metodos.preencher("teste@teste.com.br", campoEmail);
		metodos.preencher("teste@teste.com.br", campoEmailconf);
		metodos.click(checkbox);
		metodos.click(checkboxTermo);
		metodos.pausa(2000);
		metodos.scrollEClick(btnEnviar);
		

	}

}
