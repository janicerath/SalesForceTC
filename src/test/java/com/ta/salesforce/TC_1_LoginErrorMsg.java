package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1_LoginErrorMsg extends ReusableMethod {

	public static void main(String[] args) throws Exception{
		
		//Login Error Message - 1

		launchBrowser("ch");
		driver.get("https://www.salesforce.com");
		WebElement eleButtonLogin = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		explicitwait(eleButtonLogin, 5);
		eleButtonLogin.click();
		Thread.sleep(2000);
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
		WebElement elebuttLogin = driver.findElement(By.id("Login"));
		elebuttLogin.click();
		WebElement eleErrorMsg = driver.findElement(By.xpath("//div[@id='error']"));
		printText(eleErrorMsg);
		
	
	}

}


