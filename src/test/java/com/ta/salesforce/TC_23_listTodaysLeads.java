package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_23_listTodaysLeads extends ReusableMethod{

	public static void main(String[] args) {
		// List item "Todays leads" work
		
		launchBrowser("ch");
		login();
		WebElement leadsLink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink);
		leadsLink.click();
		implicitwait();
		WebElement dropdownList = driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitwait(dropdownList);
		selectDropDownList(dropdownList, "Today's Leads");
		System.out.println("Pass\nTodays Leads page is displayed.");

	}

}
