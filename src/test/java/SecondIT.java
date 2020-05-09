

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SecondIT {
	private WebDriver driver; 
	String URL = "http://localhost:8081/Hello";

	
	
	@Test
	public void verifyHomePageTittle() {
		driver = (WebDriver) new FirefoxDriver();
		driver.navigate().to(URL);
		String getTitle = driver.getTitle();
		driver.quit();
		Assert.assertEquals(getTitle, "My Naive Calculator");
	}
	
	@Test
	public void verifyAdd() {
		driver = (WebDriver) new FirefoxDriver();
		driver.navigate().to(URL);
		//String getTitle = driver.getTitle();
		//Scanner sc=new Scanner(System.in);sc.nextInt();
		//System.out.println(getTitle);
		driver.findElement(By.id("op1")).sendKeys("10");
		driver.findElement(By.id("op2")).sendKeys("5");
		driver.findElement(By.id("addbtn")).click();
		String ans = driver.switchTo().alert().getText();
		driver.quit();
		Assert.assertEquals(ans, "Answer = 15");
	}
	
	@Test
	public void verifySub() {
		driver = (WebDriver) new FirefoxDriver();
		driver.navigate().to(URL);
		//String getTitle = driver.getTitle();
		//Scanner sc=new Scanner(System.in);sc.nextInt();
		//System.out.println(getTitle);
		driver.findElement(By.id("op1")).sendKeys("10");
		driver.findElement(By.id("op2")).sendKeys("5");
		driver.findElement(By.id("subbtn")).click();
		String ans = driver.switchTo().alert().getText();
		driver.quit();
		Assert.assertEquals(ans, "Answer = 5");
	}
	
	@Test
	public void verifyMul() {
		driver = (WebDriver) new FirefoxDriver();
		driver.navigate().to(URL);
		//String getTitle = driver.getTitle();
		//Scanner sc=new Scanner(System.in);sc.nextInt();
		//System.out.println(getTitle);
		driver.findElement(By.id("op1")).sendKeys("10");
		driver.findElement(By.id("op2")).sendKeys("5");
		driver.findElement(By.id("mulbtn")).click();
		String ans = driver.switchTo().alert().getText();
		driver.quit();
		Assert.assertEquals(ans, "Answer = 50");
	}
	
	@Test
	public void verifyDiv() {
		driver = (WebDriver) new FirefoxDriver();
		driver.navigate().to(URL);
		//String getTitle = driver.getTitle();
		//Scanner sc=new Scanner(System.in);sc.nextInt();
		//System.out.println(getTitle);
		driver.findElement(By.id("op1")).sendKeys("10");
		driver.findElement(By.id("op2")).sendKeys("5");
		driver.findElement(By.id("divbtn")).click();
		String ans = driver.switchTo().alert().getText();
		driver.quit();
		Assert.assertEquals(ans, "Answer = 2.0");
	}
	
	
	
}
