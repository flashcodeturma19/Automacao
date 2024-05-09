package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Metodos.Metodos;

public class Elementos {
     
	WebDriver driver;
	Metodos metodos = new Metodos();
	
	private By campoCpf = By.name("cpf");
	private By campoNome = By.name("name");
	private By campoCelular = By.name("phone");
	private By campoEmail = By.name("email");
	private By campoEmailconf = By.name("emailConfirmation");
	private By checkbox = By.xpath("//span[normalize-space()='Aceito receber comunicações do Nubank por WhatsApp.']"); 
	private By checkboxTermo = By.xpath("//*[@id=\"label-accepted\"]/span[2]/span");
	private By btnEnviar = By.xpath("//button[@type='submit']");
	

	public void telaHomeCampocpf() {
	metodos.Preencher("57749996028", campoCpf);
		
		
}
	
	
	
	
}
