package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_32 extends ReusableMethod{

	public static void main(String[] args) {
		// check the save and new button in new contact page
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
		newButton.click();
		WebElement lNamePH = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		explicitwait(lNamePH);
		lNamePH.clear();
		lNamePH.sendKeys("Indian");
		WebElement acNamePH = driver.findElement(By.xpath("//input[@id='con4']"));
		explicitwait(acNamePH);
		acNamePH.clear();
		acNamePH.sendKeys("Global Media");
		WebElement saveNewButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value='Save & New']"));
		explicitwait(saveNewButton);
		saveNewButton.click();
		System.out.println("Pass\nNew Contact is created and new page is displayed.");
		

	}

}
