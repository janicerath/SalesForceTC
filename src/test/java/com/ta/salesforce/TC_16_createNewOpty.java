package com.ta.salesforce;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_16_createNewOpty extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Create new opportunity
		launchBrowser("ch");
		login();
		WebElement optyDropList = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		explicitwait(optyDropList);
		optyDropList.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'Recent Opportunities')]"));
		explicitwait(header);
		WebElement newButton = driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitwait(newButton);
		clickByJSE(newButton);
		WebElement optyNamePH = driver.findElement(By.xpath("//input[@id='opp3']"));
		explicitwait(optyNamePH);
		optyNamePH.clear();
		optyNamePH.sendKeys("OptyName");
		WebElement accountNamePH = driver.findElement(By.xpath("//input[@id='opp4']"));
		accountNamePH.clear();
		accountNamePH.sendKeys("Fancy Nancy");
		WebElement closeDatePH = driver.findElement(By.xpath("//input[@id='opp9']"));
		closeDatePH.clear();
		closeDatePH.sendKeys("09/14/2020");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		WebElement stagePH = driver.findElement(By.xpath("//select[@id='opp11']"));
		selectDropDownList(stagePH, "Qualification");
		WebElement probabilityPH = driver.findElement(By.xpath("//input[@id='opp12']"));
		explicitwait(probabilityPH);
		probabilityPH.clear();
		probabilityPH.sendKeys("15");
		WebElement leadPH = driver.findElement(By.xpath("//select[@id='opp6']"));
		explicitwait(leadPH);
		selectDropDownList(leadPH, "Other");
		WebElement priCampaign = driver.findElement(By.xpath("//input[@id='opp17']"));
		explicitwait(priCampaign);
		priCampaign.clear();
		priCampaign.sendKeys("Anything");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@value=' Save ']"));
		explicitwait(saveButton);
		clickByJSE(saveButton);
		System.out.println("Pass\nNew Opportunity Page is displayed.");
		
		

	}

}
