package com.ta.salesforce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_14_CreateAccountReport extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Create Account Report
		
		launchBrowser("ch");
		login();
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		explicitwait(accountTab);
		accountTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		explicitwait(header);
		WebElement acActivityLink = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last acti')]"));
		explicitwait(acActivityLink);
		clickByJSE(acActivityLink);
		
		WebElement datefieldDropList = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
		explicitwait(datefieldDropList);
		datefieldDropList.click();
		WebElement createDate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		explicitwait(createDate);
		createDate.click();
		WebElement dateFrom = driver.findElement(By.xpath("//input[@id='ext-comp-1042']"));
		explicitwait(dateFrom);
		dateFrom.click();
		dateFrom.sendKeys("08/14/2020");
		WebElement saveButton = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		explicitwait(saveButton);
		saveButton.click();
		WebElement reportNamePH = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		explicitwait(reportNamePH);
		reportNamePH.click();
		reportNamePH.sendKeys("second Report");
		WebElement reportUniqueName = driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		explicitwait(reportUniqueName);
		reportUniqueName.click();
		reportUniqueName.clear();
		reportUniqueName.sendKeys("unique_report11");
		Thread.sleep(2000);
		WebElement saveAndRunButton = driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
		explicitwait(saveAndRunButton);
		saveAndRunButton.click();
		System.out.println("Pass. Report is displayed");
		
		
	}

}
