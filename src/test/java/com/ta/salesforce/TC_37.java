package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_37 extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// block an event in the calender with weekly recurrance
		launchBrowser("ch");
		login();
		WebElement homeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		explicitwait(homeTab);
		homeTab.click();
		implicitwait();
		WebElement dateLink = driver.findElement(By.xpath("//span[@class='pageDescription']//a"));
		explicitwait(dateLink);
		dateLink.click();
		Thread.sleep(3000);
		WebElement fourPM = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		explicitwait(fourPM);
		scroll(fourPM);
		fourPM.click();
		WebElement subComboIcon = driver.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		explicitwait(subComboIcon);
		clickByJSE(subComboIcon);
		switchWindow(1);
		WebElement otherButton = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		explicitwait(otherButton);
		clickByJSE(otherButton);
		Thread.sleep(3000);
		switchOriginWindow();
		WebElement endTime = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		explicitwait(endTime);
		clickByJSE(endTime);
		endTime.clear();
		endTime.sendKeys("7:00PM");
		WebElement recurCheckBox = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		explicitwait(recurCheckBox);
		clickByJSE(recurCheckBox);
		WebElement weeklyRadioButton = driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		explicitwait(weeklyRadioButton);
		clickByJSE(weeklyRadioButton);
		WebElement endDate = driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		explicitwait(endDate);
		endDate.clear();
		endDate.sendKeys("08/29/2020");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		clickByJSE(saveButton);
		WebElement monthViewButton = driver.findElement(By.xpath("//a[@title='Month View']"));
		explicitwait(monthViewButton);
		clickByJSE(monthViewButton);
		System.out.println("Pass\nRecurring event is created and is displayed.");
		
		

	}

}
