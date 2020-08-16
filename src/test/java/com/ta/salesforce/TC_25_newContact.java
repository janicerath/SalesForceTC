package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_25_newContact extends ReusableMethod{

	public static void main(String[] args) {
		// create new contact
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Contacts')]"));
		explicitwait(header);
		WebElement newButton = driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitwait(newButton);
		clickByJSE(newButton);
		WebElement lNamePH = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		explicitwait(lNamePH);
		lNamePH.clear();
		lNamePH.sendKeys("Chopas");
		WebElement acNamePH = driver.findElement(By.xpath("//input[@id='con4']"));
		explicitwait(acNamePH);
		acNamePH.clear();
		acNamePH.sendKeys("Umizoomi");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		clickByJSE(saveButton);
		System.out.println("Pass\nNew Contact created.");
		
		

	}

}
