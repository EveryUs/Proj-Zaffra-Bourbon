package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import task.CadastroTask;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTask cadastro;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www2.zaffari.com.br/"); 
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
 
	@Test
	public void testMain() throws InterruptedException, IOException {
		this.cadastro.gerarCadastro();
		this.cadastro.preencherCadastro("Raul123", "s2btestador@gmail.com", "s2btester", "99999999999", "beija flor 412",
				"portugal", "porto alegre", "99999999", "51 99999999", "51 999999999");
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 		
		FileUtils.copyFile(scrFile1, new File("c:\\tmp\\cadastro1.png"));
		Thread.sleep(1500);
		this.cadastro.enviarCadastro();
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("c:\\tmp\\cadastro2.png"));
		Thread.sleep(1000);
	}
	 
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
