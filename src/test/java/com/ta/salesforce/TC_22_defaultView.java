package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_22_defaultView extends ReusableMethod {

	public static void main(String[] args) throws Exception {
		// functionality of the Go Button
		launchBrowser("ch");
		login();
		WebElement leadsLink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink);
		leadsLink.click();
		implicitwait();
		WebElement dropdownList = driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitwait(dropdownList);
		selectDropDownList(dropdownList, "All Open Leads");
		WebElement goButton = driver.findElement(By.xpath("//input[@value=' Go! ']"));
		explicitwait(goButton);
		goButton.click();
		
		WebElement dropbox = driver.findElement(By.xpath("//select[@name='fcf']"));
		explicitwait(dropbox);
		System.out.println(dropbox.getText());
		
		Thread.sleep(2000);
		Logout();
		Thread.sleep(2000);
		login();
		WebElement leadsLink1 = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink1);
		leadsLink1.click();
		WebElement goButton1 = driver.findElement(By.xpath("//input[@value=' Go! ']"));
		explicitwait(goButton1);
		goButton1.click();
		WebElement dropbox1 = driver.findElement(By.xpath("//select[@name='fcf']"));
		explicitwait(dropbox1);
		System.out.println(dropbox1.getText());
		System.out.println("Pass\nSaved lead page from previous login is opened after re-login. ");
		
		
		
		

	}

}
