package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_24_checkNewButton extends ReusableMethod{

	public static void main(String[] args) {
		// check New Button on Leads Home

		launchBrowser("ch");
		login();
		WebElement leadsLink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink);
		leadsLink.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Leads')]"));
		explicitwait(header);
		WebElement newbutton = driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitwait(newbutton);
		newbutton.click();
		WebElement lNamePH = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		explicitwait(lNamePH);
		lNamePH.clear();
		lNamePH.sendKeys("Flores");
		WebElement companyPH = driver.findElement(By.xpath("//input[@id='lea3']"));
		explicitwait(companyPH);
		companyPH.clear();
		companyPH.sendKeys("ABCD");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass\nNew lead saved and view page is displayed.");
		
		
	}

}
