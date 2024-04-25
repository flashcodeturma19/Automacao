package AutNubank;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoNubank {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		// comando para indicar qual navegador vou utilizar e qual o caminho do driver
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//comando paara adicionar as funçoes no chromedriver dentro do meu driver
		driver  = new ChromeDriver();
		//comando para indicar qual site desejamos abrir
		driver.get("https://nubank.com.br/");
		//comando para maximizar a tela 
		driver.manage().window().maximize();
		//coamando para busca um elemento e realizar a acao de preencher
		
		driver.findElement(By.name("cpf")).sendKeys("53307568043");
		Thread.sleep(5000);
		driver.findElement(By.id("test")).click();
		driver.findElement(By.name("name")).sendKeys("Samuewl xavier");
		driver.findElement(By.name("phone")).sendKeys("11918151712");
		driver.findElement(By.name("email")).sendKeys("teste@teste.com.br");
		driver.findElement(By.name("emailConfirmation")).sendKeys("teste@teste.com.br");
		driver.findElement(By.xpath("//*[@id=\"label-acceptedWhatsapp\"]/span[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"label-accepted\"]/span[2]/span")).click();
		
		WebElement elemento  = driver.findElement(By.xpath("//*[@id=\"complete-form-drawer\"]/div/div/div[2]/form/div/div[2]/div/button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", elemento);
		 Thread.sleep(5000);
		 elemento.click();
		
	}

	@After
	public void tearDown() throws Exception {
//	driver.quit();
	}

	@Test
	public void validacaoNubank() {
		String texto;
		
		//comando para buscar o elemento e pegar otexto do elemento e guardar na variavel texto
		texto = driver.findElement(By.xpath("//*[@id=\"short-form\"]/h3")).getText();
		
		//coamndo para validar te o texto que passei como parametro e o texto em tela sao iguais
		assertEquals("Peça sua conta e cartão de crédito do Nubank", texto);
		driver.findElement(By.id("test")).click();
	}

}
