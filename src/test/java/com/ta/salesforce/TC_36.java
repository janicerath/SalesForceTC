package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_36 extends ReusableMethod{

	public static void main(String[] args) throws Exception{
		// blocking an event in the calendar
		
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
		WebElement eightPM = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		explicitwait(eightPM);
		scroll(eightPM);
		eightPM.click();
		WebElement subComboIcon = driver.findElement(By.xpath("//a[@title='Combo (New Window)']"));
		explicitwait(subComboIcon);
		clickByJSE(subComboIcon);
		Thread.sleep(5000);
		switchWindow(1);
		WebElement otherButton = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		explicitwait(otherButton);
		clickByJSE(otherButton);
		Thread.sleep(2000);
		switchOriginWindow();
		Thread.sleep(2000);
		WebElement endTime = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		explicitwait(endTime);
		endTime.click();
		endTime.clear();
		endTime.sendKeys("11:30PM");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass\nEvent created and is displayed.");
		

	}

}
