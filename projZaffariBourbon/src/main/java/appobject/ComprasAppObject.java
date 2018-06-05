package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprasAppObject {
	
	private WebDriver driver; 
	
	public ComprasAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getGuiaComprasButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"topo\"]/div/div[1]/div[4]/ul/li[3]/a"));
	} 
	
	public WebElement getGuiaPersonalizado() {
		return this.driver.findElement(By.xpath("//*[@id=\"cont-b-guia\"]/a"));
	}
	
	public WebElement getCostelaQuantidade() {
		return this.driver.findElement(By.id("qtdGuia576"));
	}
	
	public WebElement getCostelaObs() {
		return this.driver.findElement(By.id("obsGuia576"));
	}

	public WebElement getKitChurrasQuantidade() {
		return this.driver.findElement(By.id("qtdGuia574"));
	}

	public WebElement getKitChurrasbs() {
		return this.driver.findElement(By.id("obsGuia577"));
	}

	public WebElement getPadariaButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"conteudo-paginas-fundo\"]/div[5]/ul/li[12]/a"));
	}
	public WebElement getCacetinhoQuantidade() {
		return this.driver.findElement(By.id("qtdGuia638"));
	}
	public WebElement getCacetinhoObs() {
		return this.driver.findElement(By.id("obsGuia638"));
	}
	public WebElement getCucaQuantidade() {
		return this.driver.findElement(By.id("qtdGuia646"));
	}
	public WebElement getCucaObs() {
		return this.driver.findElement(By.id("obsGuia646"));
	}
	public WebElement getIncluirProdutosButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"guia-compras-botoes\"]/img"));
	}
}
