package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_4B_ForgotPwd extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Forgot Password- 4B
		launchBrowser("ch");
		driver.get("https://login.salesforce.com");
		
		WebElement eleUsernamePH = driver.findElement(By.xpath("//input[@id='username']"));
		explicitwait(eleUsernamePH);
		eleUsernamePH.click();
		eleUsernamePH.clear();
		eleUsernamePH.sendKeys("123");
		WebElement elePasswordPH = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		explicitwait(elePasswordPH);
		elePasswordPH.clear();
		elePasswordPH.sendKeys("22131");
		driver.findElement(By.id("Login")).click();
		
		WebElement eleErrorMsg = driver.findElement(By.id("error"));
		explicitwait(eleErrorMsg);
		printText(eleErrorMsg);
		
	}

}
