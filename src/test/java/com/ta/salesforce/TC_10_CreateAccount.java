package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC_10_CreateAccount extends ReusableMethod{

	public static void main(String[] args) {
		// create an account
		launchBrowser("ch");
		login();
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		explicitwait(accountTab);
		accountTab.click();
		implicitwait();
		WebElement newTab = driver.findElement(By.xpath("//div[@class='pbHeader']//td[2]//input"));
		clickByJSE(newTab);
		
		WebElement accountNamePH = driver.findElement(By.xpath("//input[@id='acc2']"));
		explicitwait(accountNamePH);
		accountNamePH.sendKeys("Fancy Nancy");
		WebElement typeDropList = driver.findElement(By.xpath("//select[@id='acc6']"));
		explicitwait(typeDropList);
		clickByJSE(typeDropList);
		selectDropDownList(typeDropList, "Technology Partner");
		WebElement savebutton = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@value=' Save ']"));
		clickByJSE(savebutton);

		System.out.println("Pass\nNew Account page is displayed.");
		
		
		
		
	}

}
