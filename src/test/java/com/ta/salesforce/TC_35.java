package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TC_35 extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// verify the tab customization
		launchBrowser("ch");
		login();
		implicitwait();
		WebElement contactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		explicitwait(contactTab);
		WebElement plusButton = driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a"));
		explicitwait(plusButton);
		plusButton.click();
		WebElement customizeButton = driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
		explicitwait(customizeButton);
		customizeButton.click();
		WebElement selectedTab = driver.findElement(By.xpath("//select[@id='duel_select_1']"));
		explicitwait(selectedTab);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", selectedTab);
		selectDropDownList(selectedTab, "Cases");
		WebElement removeButton = driver.findElement(By.xpath("//a[@id='duel_select_0_left']"));
		explicitwait(removeButton);
		removeButton.click();
		WebElement saveButton = driver.findElement(By.xpath("//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		Thread.sleep(2000);
		Logout();
		Thread.sleep(3000);
		login();
		System.out.println("Pass\nTab has been removed.");

	}

}
