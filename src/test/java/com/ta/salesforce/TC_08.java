package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_08 extends ReusableMethod{

	public static void main(String[] args) {
		// Select "Developer Console" option from userMenu for <username> drop down
		
		launchBrowser("ch");
		login();
		userMenuButton();
		WebElement devConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		explicitwait(devConsole);
		devConsole.click();
		System.out.println("Pass\nDeveloper Console window is displayed");
		switchWindow(1);
		driver.close();
		switchOriginWindow();
		System.out.println("Developer Console window is closed");
	}

}
