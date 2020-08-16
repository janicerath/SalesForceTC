package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_27 extends ReusableMethod{

	public static void main(String[] args) {
		// check recently created contact in the Contact Page
		launchBrowser("ch");
		login();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		contactTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Contacts')]"));
		explicitwait(header);
		WebElement droplist = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		explicitwait(droplist);
		selectDropDownList(droplist, "Recently Created");
		System.out.println("Pass\nRecent created contact shown.");
		

	}

}
