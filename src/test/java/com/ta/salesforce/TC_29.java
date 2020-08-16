package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_29 extends ReusableMethod{

	public static void main(String[] args) {
		// view a contact in the contact page
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement contactName = driver.findElement(By.xpath("//a[contains(text(),'Chopas')]"));
		explicitwait(contactName);
		clickByJSE(contactName);
		WebElement headname = driver.findElement(By.xpath("//h2[@class='topName']"));
		explicitwait(headname);
		System.out.println("Pass\n"+headname.getText()+" is displayed.");

	}

}
