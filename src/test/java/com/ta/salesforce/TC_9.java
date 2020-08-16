package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_9 extends ReusableMethod {

	public static void main(String[] args) {
		// select Logout option from user menu dropdown
		
		launchBrowser("ch");
		login();
		userMenuButton();
		WebElement logoutButton = driver.findElement(By.xpath("//a[@title='Logout']"));
		explicitwait(logoutButton);
		logoutButton.click();
		System.out.println("Pass\nSuccessfully Logout.");

	}

}
