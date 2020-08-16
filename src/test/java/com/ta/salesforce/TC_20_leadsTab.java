package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_20_leadsTab extends ReusableMethod{

	public static void main(String[] args) {
		// check leads tab link
		
		launchBrowser("ch");
		login();
		WebElement leadsLink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink);
		leadsLink.click();
		System.out.println("Pass\nLead HomePage is displayed.");

	}

}
