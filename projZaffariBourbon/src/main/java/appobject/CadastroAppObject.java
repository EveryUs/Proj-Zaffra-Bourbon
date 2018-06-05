package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	
	private WebDriver driver; 
	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCadastreseButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"topo\"]/div/div[1]/div[4]/ul/li[5]/a/cufon/canvas"));
	} 
	
	public WebElement getSeuNomeTextField() {
		return this.driver.findElement(By.id("nome")); 
	}
	
	public WebElement getEmailtextField() {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getAniversarioTextField() {
		return this.driver.findElement(By.id("aniversario"));
	} 
	
	public WebElement getCPFTExtButton() {
		return this.driver.findElement(By.id("cpfCadastro"));
	}
	
	public WebElement getEnderecoTextField() {
		return this.driver.findElement(By.id("endereco"));
	}
	
	public WebElement getBairroTextField() {
		return this.driver.findElement(By.id("bairro"));
	}
	
	public WebElement getCidadeTExtField() {
		return this.driver.findElement(By.id("cidade"));
	}

	public WebElement getCEPTextField() {
		return this.driver.findElement(By.id("cep"));
	}

	public WebElement getTelefoneTextField() {
		return this.driver.findElement(By.id("telefone"));
	}

	public WebElement getCelularTextField() {
		return this.driver.findElement(By.id("celular"));
	}

	public WebElement getCadastrarButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"frmCadastro\"]/div[2]/div[3]/input"));
	}
}
 