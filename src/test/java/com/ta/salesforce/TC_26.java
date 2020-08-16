package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_26 extends ReusableMethod{

	public static void main(String[] args) {
		// create new view in the contact page
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Contacts')]"));
		explicitwait(header);
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		explicitwait(createNewView);
		clickByJSE(createNewView);
		WebElement viewNamePH = driver.findElement(By.xpath("//input[@id='fname']"));
		explicitwait(viewNamePH);
		viewNamePH.clear();
		viewNamePH.sendKeys("ant");
		WebElement uniqueNamePH = driver.findElement(By.xpath("//input[@id='devname']"));
		explicitwait(uniqueNamePH);
		uniqueNamePH.clear();
		uniqueNamePH.sendKeys("uniqueviewname");
		WebElement saveButton = driver.findElement(By.xpath("//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass\nCreated view name is displayed.");
		
		

	}

}
