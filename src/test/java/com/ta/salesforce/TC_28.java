package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_28 extends ReusableMethod{

	public static void main(String[] args) {
		// check My Contacts view in the Contact Page
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Contacts')]"));
		explicitwait(header);
		WebElement droplist = driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitwait(droplist);
		selectDropDownList(droplist, "My Contacts");
		System.out.println("Pass\nMy Contacts view is displayed.");
		
		

	}

}
