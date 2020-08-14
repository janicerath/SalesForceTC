package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_3_CheckRmbMe extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Check RemeberMe - 3
		launchBrowser("ch");

		driver.get("https://www.salesforce.com");
		WebElement eleButtonLogin = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		explicitwait(eleButtonLogin, 5);
		eleButtonLogin.click();
		Thread.sleep(1000);
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
		WebElement eleRmbMeCheckBox = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		eleRmbMeCheckBox.click();
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		
		WebElement eleMenuButtUser = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		explicitwait(eleMenuButtUser);
		eleMenuButtUser.click();
		WebElement eleLogoutButton = driver.findElement(By.xpath("//a[@title='Logout']"));
		explicitwait(eleLogoutButton);
		eleLogoutButton.click();
		
		System.out.println("Pass: Saved Username is displayed.");
	}

}
