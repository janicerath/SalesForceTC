package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_30 extends ReusableMethod{

	public static void main(String[] args) {
		// check error message if, required info is not entered while creating a new view in contacts.
		
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement newViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		explicitwait(newViewLink);
		newViewLink.click();
		WebElement uniqueNamePH = driver.findElement(By.xpath("//input[@id='devname']"));
		explicitwait(uniqueNamePH);
		uniqueNamePH.clear();
		uniqueNamePH.sendKeys("EFGH");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='requiredInput']//div[@class='errorMsg']"));
		explicitwait(errorMsg);
		System.out.println("Pass\n"+errorMsg.getText()+" is displayed.");
		

	}

}
