package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_7 extends ReusableMethod{

	public static void main(String[] args) throws Exception{
		// Select "My settings" option from user menu for <username> drop down
		launchBrowser("ch");
		login();

		WebElement eleUserMenuButton = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		explicitwait(eleUserMenuButton);
		eleUserMenuButton.click();
		WebElement mySettings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		explicitwait(mySettings);
		mySettings.click();
			//Download Login History
		implicitwait();
		WebElement linkPersonal = driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
		explicitwait(linkPersonal);
		clickByJSE(linkPersonal);
		Thread.sleep(1000);
		WebElement loginHx = driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		explicitwait(loginHx);
		loginHx.click();
		WebElement downloadLoginHx = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, ')]"));
		explicitwait(downloadLoginHx);
		downloadLoginHx.click();
		System.out.println("Pass:\t\t.csv file downloaded.");
		Thread.sleep(3000);
		
		
		// Display Layout - add Tabs
		
		WebElement linkDisplayLayout = driver.findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
		explicitwait(linkDisplayLayout);
		linkDisplayLayout.click();
		WebElement customTabLink = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		explicitwait(customTabLink);
		customTabLink.click();
		WebElement customDropList = driver.findElement(By.xpath("//select[@id='p4']"));
		explicitwait(customDropList);
		customDropList.click();
		
		Select select = new Select(customDropList);
		select.selectByVisibleText("Salesforce Chatter");
		
		WebElement selectFromBox = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		explicitwait(selectFromBox);
		WebElement eleReport = driver.findElement(By.xpath("//option[@value='report']"));
		explicitwait(eleReport);
		eleReport.click();
		WebElement eleAdd = driver.findElement(By.xpath("//a[@id='duel_select_0_right']"));
		explicitwait(eleAdd);
		eleAdd.click();
		WebElement saveButton = driver.findElement(By.xpath("//input[@name='save']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass:\t\tReports added.");
		Thread.sleep(3000);
			
		//EmailSetUp
		
		WebElement emailSetUp = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		explicitwait(emailSetUp, 15);
		emailSetUp.click();
		WebElement emailSetting = driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		explicitwait(emailSetting);
		emailSetting.click();
		WebElement emailHeader = driver.findElement(By.xpath("//h1[contains(text(),'My Email Settings')]"));
		explicitwait(emailHeader);
		WebElement sendernamePH = driver.findElement(By.xpath("//input[@id='sender_name']"));
		sendernamePH.clear();
		sendernamePH.sendKeys("Jan Rath");
		WebElement emailPH = driver.findElement(By.xpath("//input[@id='sender_email']"));
		emailPH.clear();
		emailPH.sendKeys("janice.wmrath@tekarch.net");
		WebElement bccRadioButt = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		explicitwait(bccRadioButt);
		bccRadioButt.click();
		WebElement saveButton1 = driver.findElement(By.xpath("//input[@name='save']"));
		explicitwait(saveButton1);
		clickByJSE(saveButton1);
		Thread.sleep(1000);
		alertAccept();
		System.out.println("Pass:\t\tMy Settings page is displayed.");
		Thread.sleep(3000);
		//Calendar&remainders
		
		WebElement Calendar = driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']"));
		explicitwait(Calendar);
		Calendar.click();
		WebElement remainderLink = driver.findElement(By.xpath("//a[@id='Reminders_font']"));
		explicitwait(remainderLink);
		remainderLink.click();
		WebElement testLink = driver.findElement(By.xpath("//input[@value='Open a Test Reminder']"));
		explicitwait(testLink);
		testLink.click();
		System.out.println("Pass:\t\tEvent Window Opened.");
		
	}

}
