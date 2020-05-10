

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SecondIT {
	private static WebDriver driver;
	String URL = "http://localhost:8081/Hello";
	
	@BeforeClass
	public static void setDriver() {

        System.setProperty("webdriver.gecko.driver", "geckodriver");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

       
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        
        driver = new FirefoxDriver(firefoxOptions);
        
	}

	@Test
	public void verifyHomePageTittle() {
		// driver.navigate().to(URL);
		driver.get(URL);
		String getTitle = driver.getTitle();
		// driver.quit();
		Assert.assertEquals(getTitle, "My Naive Calculator");
	}
	
	@Test
	public void verifyAdd() {
		
		String ans="";
		WebDriverWait wait= new WebDriverWait(driver, 1);
		Alert alert;
		try {
			driver.navigate().to(URL); // String getTitle = driver.getTitle(); //Scanner
			driver.findElement(By.id("op1")).sendKeys("10");
			driver.findElement(By.id("op2")).sendKeys("5");
			driver.findElement(By.id("addbtn")).click();
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			alert= driver.switchTo().alert();
			ans =alert.getText().trim();
			alert.accept();
		}
		catch (Exception e) {
			System.out.println("In exception");		
		}
		Assert.assertEquals(ans, "Answer = 15");
	}
	
	@Test
	public void verifySub() {
		
		String ans="";
		WebDriverWait wait= new WebDriverWait(driver, 1);
		Alert alert;
		try {
			driver.navigate().to(URL); // String getTitle = driver.getTitle(); //Scanner
			driver.findElement(By.id("op1")).sendKeys("10");
			driver.findElement(By.id("op2")).sendKeys("5");
			driver.findElement(By.id("subbtn")).click();
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			alert= driver.switchTo().alert();
			ans =alert.getText().trim();
			alert.accept();
		}
		catch (Exception e) {
			System.out.println("In exception");		
		}
		Assert.assertEquals(ans, "Answer = 5");
	}
	
	@Test
	public void verifyMul() {
		
		String ans="";
		WebDriverWait wait= new WebDriverWait(driver, 1);
		Alert alert;
		try {
			driver.navigate().to(URL); // String getTitle = driver.getTitle(); //Scanner
			driver.findElement(By.id("op1")).sendKeys("10");
			driver.findElement(By.id("op2")).sendKeys("5");
			driver.findElement(By.id("mulbtn")).click();
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			alert= driver.switchTo().alert();
			ans =alert.getText().trim();
			alert.accept();
		}
		catch (Exception e) {
			System.out.println("In exception");		
		}
		Assert.assertEquals(ans, "Answer = 50");
	}
	
	@Test
	public void verifyDiv() {
		
		String ans="";
		WebDriverWait wait= new WebDriverWait(driver, 1);
		Alert alert;
		try {
			driver.navigate().to(URL); // String getTitle = driver.getTitle(); //Scanner
			driver.findElement(By.id("op1")).sendKeys("10");
			driver.findElement(By.id("op2")).sendKeys("5");
			driver.findElement(By.id("divbtn")).click();
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			alert= driver.switchTo().alert();
			ans =alert.getText().trim();
			alert.accept();
		}
		catch (Exception e) {
			System.out.println("In exception");		
		}
		Assert.assertEquals(ans, "Answer = 2.0");
	}
	 

	
	@AfterClass
	public static void delDriver() {
		driver.quit();
	}	 

}
