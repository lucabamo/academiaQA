package demoMaven;

public class LocatorRepository {
	
	//Xpath for the search field in main page google
	final static String searchFieldXpath = "//input[@type='text']";
	
	//Xpath for find projects in selenium
	final static String projectsSeleniumXpath = "//div/a/h3[text()='Selenium Projects']";
	//Other posible xpath for this case is:
	//final static String projectsSeleniumXpath = "//a[@href='https://selenium.dev/projects/']";
	//Which use the href like locator, this is not recommended

	//Xpath for find downloads in selenium
	final static String downloadsSeleniumXpath = "//nav/a[text()='Downloads']";
	
	//Xpath for find java docs api in selenium
	final static String apiDocsSeleniumXpath = "//a[@href='https://seleniumhq.github.io"
			+ "/selenium/docs/api/java/index.html']";
	
	final static String logoSeleniumXpath = "//header/a/img[@src='/images/selenium_logo_large.png']";
	
	final static String wikipedia = "//div/a/h3[contains(text(),'Wikipedia, la enciclopedia')]";
	
	final static String logoWikipedia = "//div//a[@class='mw-wiki-logo']";
	
	final static String cambiarIdiomaIngles = "//li/a[@class='interlanguage-link-target'][contains(text(),'English')]";
	
	final static String logoWikipediaIngles = "//div//a[@class='mw-wiki-logo'] [@title='Visit the main page']";

	
}
