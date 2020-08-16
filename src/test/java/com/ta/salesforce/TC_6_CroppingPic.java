package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_6_CroppingPic extends ReusableMethod {

	public static void main(String[] args) {
		// upload and crop profile pic
		
		launchBrowser("ch");
		login();
		WebElement eleUserMenuButton = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		explicitwait(eleUserMenuButton);
		eleUserMenuButton.click();
		WebElement myProfile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		explicitwait(myProfile);
		myProfile.click();
		implicitwait();
		
		WebElement moderatorButton = driver.findElement(By.xpath("//span[@id='displayBadge']"));
		explicitwait(moderatorButton);
		Actions ac = new Actions(driver);
		ac.moveToElement(moderatorButton);
		WebElement uploadPhotoLink = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		explicitwait(uploadPhotoLink);
		clickByJSE(uploadPhotoLink);
		WebElement popUpHeader = driver.findElement(By.xpath("//h2[@id='uploadPhotoTitle']"));
		explicitwait(popUpHeader);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		driver.switchTo().frame(iframe);
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		explicitwait(chooseFile);
		chooseFile.sendKeys("C:\\Users\\Danielle's Ideapad\\eclipse-workspace\\jpeg\\S3Q7.jpg");
		WebElement saveFileButton = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		explicitwait(saveFileButton);
		saveFileButton.click();
		WebElement frameLabel = driver.findElement(By.xpath("//p[contains(text(),'Profile Photo')]"));
		explicitwait(frameLabel);
		WebElement SEcorner = driver.findElement(By.xpath("//div[@class='imgCrop_clickArea']"));
		explicitwait(SEcorner);
		ac.dragAndDropBy(SEcorner, 0, 0).perform();
		

	}

}
