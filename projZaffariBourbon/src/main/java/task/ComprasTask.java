package task;

import org.openqa.selenium.WebDriver;

import appobject.ComprasAppObject;

public class ComprasTask {
	
	private ComprasAppObject comprasAppObject;
	
	public ComprasTask(WebDriver driver) {
		this.comprasAppObject = new ComprasAppObject(driver);
	} 
	
	public void gerarMenuCompras() {
		this.comprasAppObject.getGuiaComprasButton().click();
	}
	
	public void gerarComprasPersonalizadas() {
		this.comprasAppObject.getGuiaPersonalizado().click();
	}
	
	public void preencherAcougue(String costelaQ, String costelaO, String kitQ, String kitO) {
		this.comprasAppObject.getCostelaQuantidade().sendKeys(costelaQ);
		this.comprasAppObject.getCostelaObs().sendKeys(costelaO);
		this.comprasAppObject.getKitChurrasQuantidade().sendKeys(kitQ);
		this.comprasAppObject.getKitChurrasbs().sendKeys(kitO);
	}
	
	public void gerarPadaria() {
		this.comprasAppObject.getPadariaButton().click();
	}
	
	public void preencherPadaria(String cacetinhoQ, String cacetinhoO, String cucaQ, String cucaO) {
		this.comprasAppObject.getCacetinhoQuantidade().sendKeys(cacetinhoQ);
		this.comprasAppObject.getCacetinhoObs().sendKeys(cacetinhoO);
		this.comprasAppObject.getCucaQuantidade().sendKeys(cucaQ);
		this.comprasAppObject.getCucaObs().sendKeys(cucaO);
	}
	
	public void incluirPruduto() {
		this.comprasAppObject.getIncluirProdutosButton().click();
	}

}
