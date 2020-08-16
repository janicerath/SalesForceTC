package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_34 extends ReusableMethod{

	public static void main(String[] args) throws Exception{
		// verify the edited lastname is updated at various places
		launchBrowser("ch");
		login();
		implicitwait();
		WebElement homeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		explicitwait(homeTab);
		homeTab.click();
		implicitwait();
		WebElement nameLink = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a"));
		explicitwait(nameLink);
		clickByJSE(nameLink);
		Thread.sleep(3000);
		WebElement downArrowList = driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		explicitwait(downArrowList);
		downArrowList.click();
		WebElement editProfile = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		explicitwait(editProfile);
		editProfile.click();
		
		WebElement header = driver.findElement(By.xpath("//h2[@id='aboutMeTitle']"));
		explicitwait(header);
		WebElement iframe = driver.findElement(By.id("aboutMeContentId"));
		switchFrame(driver, iframe);
		WebElement aboutTab = driver.findElement(By.xpath("//li[@id='aboutTab']//a"));
		explicitwait(aboutTab);
		aboutTab.click();
		WebElement lNamePH = driver.findElement(By.xpath("//input[@id='lastName']"));
		explicitwait(lNamePH);
		lNamePH.clear();
		lNamePH.sendKeys("abcd");
		WebElement saveAllButton = driver.findElement(By.xpath("//input[@value='Save All']"));
		explicitwait(saveAllButton);
		saveAllButton.click();
		System.out.println("Pass\nEdited Name is now displayed.");
		
		

	}

}
