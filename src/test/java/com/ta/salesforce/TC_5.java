package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_5 extends ReusableMethod {

	public static void main(String[] args) throws Exception {
		//Select user menu for <username> drop down
		
		launchBrowser("ch");
		login();
		WebElement eleUserMenuButton = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		explicitwait(eleUserMenuButton);
		eleUserMenuButton.click();
		WebElement myProfile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		explicitwait(myProfile);
		System.out.println("Pass. Menu Dropdown List Displays:");
		System.out.println(myProfile.getText());
		WebElement mySettings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		System.out.println(mySettings.getText());
		WebElement devConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		System.out.println(devConsole.getText());
		WebElement SwitchToLightning = driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']"));
		System.out.println(SwitchToLightning.getText());
		WebElement LogoutButton = driver.findElement(By.xpath("//a[@title='Logout']"));
		System.out.println(LogoutButton.getText());
		
		
		
		
	}

}
