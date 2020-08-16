package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_33 extends ReusableMethod{

	public static void main(String[] args) {
		// verify if the fristname and lastname of the loggedin user is displayed
		launchBrowser("ch");
		login();
		WebElement homeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		explicitwait(homeTab);
		homeTab.click();
		implicitwait();
		WebElement nameLink = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a"));
		explicitwait(nameLink);
		nameLink.click();
		System.out.println("Pass\nMyProfile Page is displayed.");
		
		
		
	}

}
