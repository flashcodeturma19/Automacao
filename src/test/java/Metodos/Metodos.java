package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void Preencher(String texto, By element) {
		driver.findElement(element).sendKeys(texto);
		
	}
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();

		//Maximizar a página
		driver.manage().window().maximize();
		driver.get("https://nubank.com.br/");
	}

}
