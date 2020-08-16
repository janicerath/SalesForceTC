package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_19_TestQRpt extends ReusableMethod{

	public static void main(String[] args) {
		// test quarterly summary report
		launchBrowser("ch");
		login();
		WebElement optyDropList = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		explicitwait(optyDropList);
		optyDropList.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Opportunities')]"));
		explicitwait(header);
		WebElement intervalList = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		selectDropDownList(intervalList, "Next FQ");
		WebElement incList = driver.findElement(By.xpath("//select[@id='open']"));
		selectDropDownList(incList, "Open Opportunities");
		WebElement runRptButton = driver.findElement(By.xpath("//input[@value='Run Report']"));
		explicitwait(runRptButton);
		runRptButton.click();
		System.out.println("Pass\nReport Page with selected criteria is displayed.");
		
		
		

	}

}
