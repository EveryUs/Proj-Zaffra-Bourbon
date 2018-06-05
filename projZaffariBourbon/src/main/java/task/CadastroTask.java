package task;

import org.openqa.selenium.WebDriver;

import appobject.CadastroAppObject;

public class CadastroTask {
	
	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver); 
	}
	
	public void gerarCadastro() {
		this.cadastroAppObject.getCadastreseButton().click();
	}
	
	public void preencherCadastro(String seunome, String email, String aniversario, String cpf, String endereco, String bairro, String cidade, String cep, String telefone, String celular) {
		this.cadastroAppObject.getSeuNomeTextField().sendKeys(seunome);
		this.cadastroAppObject.getEmailtextField().sendKeys(email);
		this.cadastroAppObject.getAniversarioTextField().sendKeys(aniversario);
		this.cadastroAppObject.getCPFTExtButton().sendKeys(cpf);
		this.cadastroAppObject.getEnderecoTextField().sendKeys(endereco);
		this.cadastroAppObject.getBairroTextField().sendKeys(bairro);
		this.cadastroAppObject.getCidadeTExtField().sendKeys(cidade);
		this.cadastroAppObject.getCEPTextField().sendKeys(cep);
		this.cadastroAppObject.getTelefoneTextField().sendKeys(telefone);
		this.cadastroAppObject.getCelularTextField().sendKeys(celular);
	}
	
	public void enviarCadastro() {
		this.cadastroAppObject.getCadastrarButton().click();
	}
}