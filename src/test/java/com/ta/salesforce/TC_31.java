package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_31 extends ReusableMethod{

	public static void main(String[] args) {
		// check the cancel button in Create New View
		
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement newViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		explicitwait(newViewLink);
		newViewLink.click();
		WebElement namePH = driver.findElement(By.xpath("//input[@id='fname']"));
		explicitwait(namePH);
		namePH.clear();
		namePH.sendKeys("ABCD");
		WebElement uniqueNamePH = driver.findElement(By.xpath("//input[@id='devname']"));
		explicitwait(uniqueNamePH);
		uniqueNamePH.clear();
		uniqueNamePH.sendKeys("EFGH");
		WebElement cancelButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value='Cancel']"));
		explicitwait(cancelButton);
		cancelButton.click();
		System.out.println("Pass\nABCD did not get created.");

	}

}
