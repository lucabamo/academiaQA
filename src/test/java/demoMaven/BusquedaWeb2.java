
package demoMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusquedaWeb2 {

	WebDriver driverChrome;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty(ParameterRepository.chromeWebDriver ,ParameterRepository.pathChromeDriver);
		
		driverChrome = new ChromeDriver();
		//driverChrome.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {		
		driverChrome.close();
		driverChrome.quit();
	}
	
	
	@Test
	public void busquedaSelenium() {
		
		driverChrome.get(ParameterRepository.urlGoogle);
		
		WebElement searchBar = driverChrome.findElement(By.xpath(LocatorRepository.searchFieldXpath));
		searchBar.clear();
		searchBar.sendKeys(ParameterRepository.search + Keys.ENTER);
		
		////a[@href='https://selenium.dev/projects/']
		
		WebElement link = driverChrome.findElement(By.xpath(LocatorRepository.projectsSeleniumXpath));
		link.click();
		
		WebElement logoSelenium = driverChrome.findElement(By.xpath(LocatorRepository.logoSeleniumXpath));
		Assert.assertTrue(logoSelenium.isDisplayed());
		
		//Aqu� muestro otra forma que me parece m�s correcta porque no se basa en el link, que el link puede
		//que sea cambiado m�s f�cilmente que la descripci�n
		// //nav/a[text()='Downloads']
		link = driverChrome.findElement(By.xpath(LocatorRepository.downloadsSeleniumXpath));
		link.click();
		
		link = driverChrome.findElement(By.xpath(LocatorRepository.apiDocsSeleniumXpath));
		link.click();
		
		String actualUrl = driverChrome.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, ParameterRepository.apiDocsURL);
		
		/* Un framework es considerado una combinaci�n de protocolos, reglas, estandares de c�digo y guias que
		 * pueden ser incorporadas dentro de un sistema.
		 * */
		
	}
	//Entrar a google, verificar que est� en google
	//Buscar a una persona y saber si tiene link en wikipedia y verificar que es wikipedia verificar que est� en espa�ol
	//y cambiar la p�gina a ingl�s y verificar que estamos en wikipedia en ingl�s
	
	
}
