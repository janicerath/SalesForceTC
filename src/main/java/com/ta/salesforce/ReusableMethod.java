package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethod {

	public static WebDriver driver;
		
	public static void launchBrowser(String brType) {
		
		switch (brType) {
		case("ch"):
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		
		case("edge"):
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
			
		case("ff"):
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			
		default:
			break;
				
		}
				
	}
	
	public static void explicitwait (WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void explicitwait (WebElement ele, int iTime) {
		WebDriverWait wait = new WebDriverWait (driver, iTime);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}
	
	/*
	public static void eleClickable (WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	*/
	
	public static void login() {
		/*
		driver.get("https://www.salesforce.com");
		WebElement eleButtonLogin = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		explicitwait(eleButtonLogin, 5);
		eleButtonLogin.click();
		*/
		driver.get("https://login.salesforce.com");
		WebElement eleLabelUsername = driver.findElement(By.xpath("//label[contains(text(),'Username')]"));
		explicitwait(eleLabelUsername);
		WebElement eleUsernamePH = driver.findElement(By.xpath("//input[@id='username']"));
		explicitwait(eleUsernamePH);
		eleUsernamePH.click();
		eleUsernamePH.clear();
		eleUsernamePH.sendKeys("janicerath@tekarch.com");
		WebElement elePasswordPH = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		explicitwait(elePasswordPH);
		elePasswordPH.clear();
		elePasswordPH.sendKeys("janrath123");
		driver.findElement(By.id("Login")).click();
		
	}
	
	public static void printText(WebElement obj) throws Exception{
		Thread.sleep(1000);
		if (obj.isDisplayed())
		{
			System.out.println("Pass:  Text Displayed below");
			System.out.println(obj.getText());
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
	}

	public static void switchFrame(WebDriver driver, WebElement eleFrame) {
		driver.switchTo().frame(eleFrame);
		
	}
	
	public static void mouseHover (WebDriver driver, WebElement ele) {
		Actions ac = new Actions (driver);
		ac.moveToElement(ele);
		
	}
	
	
}//End of public class
