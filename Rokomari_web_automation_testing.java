package rokomari_WebAutomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rokomari_web_automation_testing {
	
	@Test
	public void webautomation() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		//create a chromeDriver object named driver
		WebDriver driver = new FirefoxDriver();
		
		//go to google web page
		driver.get("https://www.rokomari.com/book");
		//Maximize the browser window
		
		driver.manage().window().maximize();
		
		
		WebElement inputTextElement = driver.findElement(By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='j_username']"));
		inputTextElement.sendKeys("safatmanzur@gmail.com");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='j_password']"));
		inputTextElement.sendKeys("12348765ab");
		
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
//		inputTextElement = driver.findElement(By.xpath("//a[@href='/book?ref=nm']"));
//		inputTextElement.click();
//		Thread.sleep(3000);
		
        Actions action = new Actions(driver);
		
		WebElement mainMenuElement = driver.findElement(By.xpath("//a[@id='js--authors']"));
		action.clickAndHold(mainMenuElement).build().perform();
		Thread.sleep(3000);
		
		WebElement subElement = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		System.out.println(subElement.getText());
		subElement.click();

		Thread.sleep(3000);
		
        JavascriptExecutor js =  (JavascriptExecutor)driver;
	    
//	    //button[normalize-space()='Sign In']
//	    Thread.sleep(3000);
	    
//	    js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
//	    Thread.sleep(3000);
	    
	    WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'Nil Hati')]"));
	    Thread.sleep(3000);
	    
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    Thread.sleep(3000);    
	    
	  
	    inputTextElement = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
        js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
		
		mainMenuElement = driver.findElement(By.xpath("//div[@title='দারুচিনি দ্বীপ হুমায়ূন আহমেদ']//div[2]"));
		action.clickAndHold(mainMenuElement).build().perform();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//div[@title='দারুচিনি দ্বীপ হুমায়ূন আহমেদ']//div[1]//div[1]//button[1]"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//img[@alt='cart_icon']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//fieldset[@class='group']//input[@id='phone2']"));
		inputTextElement.clear();
		Thread.sleep(3000);
		inputTextElement.sendKeys("01687195471");
		Thread.sleep(3000);
		
        WebElement country = driver.findElement(By.xpath("//select[@id='js--country']"));
		
		Select select = new Select(country);
		select.selectByVisibleText("Bangladesh");
		Thread.sleep(3000);	
				
        WebElement city = driver.findElement(By.xpath("//select[@id='js--city']"));
		
		Select select1 = new Select(city);
		select1.selectByVisibleText("ঢাকা");
		Thread.sleep(3000);
		
		WebElement area = driver.findElement(By.xpath("//select[@id='js--area']"));
		
		Select select2 = new Select(area);
		select2.selectByVisibleText("উত্তরা   ");
		Thread.sleep(3000);
		
		
		inputTextElement = driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > fieldset:nth-child(6) > textarea:nth-child(1)"));
		inputTextElement.clear();
		Thread.sleep(3000);
		inputTextElement.sendKeys("Uttara, Sector-6");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//label[@for='bkash']"));
		inputTextElement.click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(3000);
			    
		driver.quit();			
		
	}

}
