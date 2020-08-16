package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_13_MergeAccounts extends ReusableMethod{

	public static void main(String[] args) {
		// Merge Accounts
		launchBrowser("ch");
		login();
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		explicitwait(accountTab);
		accountTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		explicitwait(header);
		WebElement mergeAccount = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		explicitwait(mergeAccount);
		clickByJSE(mergeAccount);
		WebElement findacPH = driver.findElement(By.xpath("//input[@id='srch']"));
		explicitwait(findacPH);
		findacPH.clear();
		findacPH.sendKeys("Fancy");
		WebElement findacButton = driver.findElement(By.xpath("//input[@value='Find Accounts']"));
		explicitwait(findacButton);
		findacButton.click();
		WebElement header1 = driver.findElement(By.xpath("//h1[contains(text(),'Merge My Accounts')]"));
		explicitwait(header1);
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='cid0']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='cid1']"));
		WebElement nextButton = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@value=' Next ']"));
					
		if (checkBox1.isSelected() && checkBox2.isSelected()) {
			nextButton.click();
		}
		else {
			checkBox1.click();
			checkBox2.click();
			nextButton.click();
			
		}
		
		WebElement mergeButton = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@value=' Merge ']"));
		explicitwait(mergeButton);
		mergeButton.click();
		alertAccept();
		System.out.println("Pass\nAccount Merged.");
		
		
		
		
	}

}
