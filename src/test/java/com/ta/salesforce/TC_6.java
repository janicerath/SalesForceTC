package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_6 extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Select "My Profile" option from user menu for <username> drop down

		launchBrowser("ch");
		login();
		WebElement eleUserMenuButton = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		explicitwait(eleUserMenuButton);
		eleUserMenuButton.click();
		WebElement myProfile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		explicitwait(myProfile);
		myProfile.click();
		implicitwait();
		
		//Edit Last Name
		WebElement editModeratorButton = driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		explicitwait(editModeratorButton);
		clickByJSE(editModeratorButton);
		WebElement editProfileLink = driver.findElement(By.xpath("//a[@title='Edit Profile']"));
		explicitwait(editProfileLink);
		editProfileLink.click();
		WebElement ProfilePopup = driver.findElement(By.xpath("//div[@id='aboutMeContent']"));
		explicitwait(ProfilePopup);
		WebElement iframe = driver.findElement(By.id("aboutMeContentId"));
		switchFrame(driver, iframe);
		WebElement AboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		explicitwait(AboutTab);
		AboutTab.click();
		WebElement lastNamePH = driver.findElement(By.xpath("//input[@id='lastName']"));
		explicitwait(lastNamePH);
		lastNamePH.clear();
		lastNamePH.sendKeys("Rath");
		WebElement saveAll = driver.findElement(By.xpath("//input[@value='Save All']"));
		explicitwait(saveAll);
		saveAll.click();
		driver.switchTo().defaultContent();
		WebElement uNameNode = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		explicitwait(uNameNode);
		System.out.println("Pass\nChanged last name: "+ uNameNode.getText() +"is Displayed");
		Thread.sleep(3000);		
		//Post Text

		WebElement postLink = driver.findElement(By.xpath("//a[@title='Post']"));
		explicitwait(postLink);
		postLink.click();
		WebElement postFrame = driver.findElement(By.xpath("//iframe[1]"));
		switchFrame(driver, postFrame);
		WebElement postBody = driver.findElement(By.xpath("//html[1]/body[1]"));
		explicitwait(postBody);
		postBody.click();
		postBody.sendKeys("Posted text content");
		driver.switchTo().defaultContent();
		WebElement shareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		explicitwait(shareButton);
		shareButton.click();
		System.out.println("Pass:\t\tText posted.");
		Thread.sleep(3000);
		
		//File upload
		
		WebElement fileLink = driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']"));
		explicitwait(fileLink);
		fileLink.click();
		WebElement tablePanel = driver.findElement(By.xpath("//div[@class='panelBody clear']//table[@class='chatterPublisherActionsContainer']"));
		explicitwait(tablePanel);
		WebElement uploadFileButton = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		explicitwait(uploadFileButton, 15);
		uploadFileButton.click();
		WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		explicitwait(chooseFileButton);
		chooseFileButton.sendKeys("C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\jpeg\\S3Q1.jpg");
		explicitwait(chooseFileButton);
		WebElement shareButton1 = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		explicitwait(shareButton1);
		shareButton1.click();
		System.out.println("Pass\t\tSelected file is posted.");
		Thread.sleep(3000);
		
		//Add photo link
		
		WebElement elePhoto = driver.findElement(By.xpath("//div[@id='photoSection']"));
		explicitwait(elePhoto);
		mouseHover(driver, elePhoto);
		
		WebElement addPhotoLink = driver.findElement(By.xpath("//span[@id='displayBadge']"));
		explicitwait(addPhotoLink);
		addPhotoLink.click();
		
		WebElement uploadPhotoContent = driver.findElement(By.xpath("//div[@id='uploadPhotoContent']"));
		explicitwait(uploadPhotoContent);
		WebElement frameUploadPhoto = driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		switchFrame(driver, frameUploadPhoto);
		WebElement choosePhotoFile = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		explicitwait(choosePhotoFile);
		choosePhotoFile.sendKeys("C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\jpeg\\S3Q5.jpg");
		WebElement uploadPhotoSave = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		explicitwait(uploadPhotoSave);
		uploadPhotoSave.click();
		//cropping
		driver.switchTo().parentFrame();
		WebElement upPhotoHeader = driver.findElement(By.xpath("//h2[@id='uploadPhotoTitle']"));
		explicitwait(upPhotoHeader);
		System.out.println(upPhotoHeader.getText());
		switchFrame(driver, frameUploadPhoto);
		Thread.sleep(1000);
		WebElement croppedPhotoSave = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		explicitwait(croppedPhotoSave, 15);
		croppedPhotoSave.click();
		System.out.println("Pass. Photo is displayed.");
		
		
	}

}
