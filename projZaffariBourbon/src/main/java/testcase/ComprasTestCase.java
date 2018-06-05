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
import task.ComprasTask;

public class ComprasTestCase {
	
	private WebDriver driver;
	private ComprasTask compras;

	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www2.zaffari.com.br/"); 
		this.driver.manage().window().maximize();
		this.compras = new ComprasTask(driver);
	}
	
	@Test
	public void Main() throws InterruptedException, IOException {
		this.compras.gerarMenuCompras();
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 		
		FileUtils.copyFile(scrFile1, new File("c:\\tmp\\compras1.png"));
		this.compras.gerarComprasPersonalizadas();
		this.compras.preencherAcougue("nove", "13kg no máximo", "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
				"13*4");
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 		
		FileUtils.copyFile(scrFile2, new File("c:\\tmp\\compras1.png"));
		this.compras.gerarPadaria();
		this.compras.preencherPadaria("So um", "mas um bem grande", "uma so com recheio", "de creme");
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 		
		FileUtils.copyFile(scrFile3, new File("c:\\tmp\\compras2.png"));
		this.compras.incluirPruduto();
		Thread.sleep(2000);
	}		
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
