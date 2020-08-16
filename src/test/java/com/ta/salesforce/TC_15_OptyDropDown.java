package com.ta.salesforce;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_15_OptyDropDown extends ReusableMethod{

	public static void main(String[] args) {
		// Opportunities dropdown
		launchBrowser("ch");
		login();
		WebElement optyDropList = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		explicitwait(optyDropList);
		optyDropList.click();
		implicitwait();
		WebElement dropdownList = driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitwait(dropdownList);
		clickByJSE(dropdownList);
		Select dropdown = new Select(dropdownList);
		List<WebElement> listoptions = dropdown.getOptions();
		int itemCount = listoptions.size();
		for(int i = 0; i < itemCount; i++)
		{
		    System.out.println(listoptions.get(i).getText());
		}
		
		System.out.println("Pass\nDropDown List options printed above.");
		
	}

}
