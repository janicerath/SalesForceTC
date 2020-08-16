package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_18_TestStuckOptyRpt extends ReusableMethod{

	public static void main(String[] args) {
		// test stuck opportunity report

		launchBrowser("ch");
		login();
		WebElement optyDropList = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		explicitwait(optyDropList);
		optyDropList.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Opportunities')]"));
		explicitwait(header);
		WebElement stuckOptyLink = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		explicitwait(stuckOptyLink);
		clickByJSE(stuckOptyLink);
		System.out.println("Pass\nStuck opportunities report is displayed.");
		
		
		
	}

}
