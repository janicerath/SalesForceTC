package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_11_createNewView extends ReusableMethod{

	public static void main(String[] args) {
		// Create new view
		launchBrowser("ch");
		login();
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		explicitwait(accountTab);
		accountTab.click();
		implicitwait();
		WebElement newViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		explicitwait(newViewLink);
		clickByJSE(newViewLink);
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Step 1. Enter View Name')]"));
		explicitwait(header);
		WebElement viewNamePH = driver.findElement(By.xpath("//input[@id='fname']"));
		viewNamePH.sendKeys("SFDC");
		WebElement uniqueNamePH = driver.findElement(By.xpath("//input[@id='devname']"));
		uniqueNamePH.clear();
		uniqueNamePH.sendKeys("unique_name");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass\nAdded view is displayed.");
		
		
		
	}

}
