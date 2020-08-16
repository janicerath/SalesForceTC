package com.ta.salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_21_leadsSelectView extends ReusableMethod{

	public static void main(String[] args) {
		// validate view dropdown list contents in Leads
		launchBrowser("ch");
		login();
		WebElement leadsLink = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		explicitwait(leadsLink);
		leadsLink.click();
		implicitwait();
		WebElement dropdownList = driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitwait(dropdownList);
		Select dropdown = new Select (dropdownList);
		List<WebElement> listoptions = dropdown.getOptions();
		for (int i = 0; i<listoptions.size(); i++)
		{
			System.out.println(listoptions.get(i).getText());
		}
		System.out.println("Pass\nDrop down list options are displayed above.");
		
		

	}

}
