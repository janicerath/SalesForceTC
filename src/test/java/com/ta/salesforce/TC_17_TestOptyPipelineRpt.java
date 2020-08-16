package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_17_TestOptyPipelineRpt extends ReusableMethod{

	public static void main(String[] args) {
		// test opportunity pipeline report
		launchBrowser("ch");
		login();
		WebElement optyDropList = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		explicitwait(optyDropList);
		optyDropList.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Opportunities')]"));
		explicitwait(header);
		WebElement pipelineLink = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		explicitwait(pipelineLink);
		clickByJSE(pipelineLink);
		System.out.println("Pass\nOpportunity Pipeline Report Page is displayed.");
		
	}

}
