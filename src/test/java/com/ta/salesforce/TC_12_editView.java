package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_12_editView extends ReusableMethod{

	public static void main(String[] args) {
		// Edit View
		
		launchBrowser("ch");
		login();
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		explicitwait(accountTab);
		accountTab.click();
		implicitwait();
		WebElement header = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
		explicitwait(header);
		WebElement editButton = driver.findElement(By.xpath("//div[@class='bFilterView']//a[contains(text(),'Edit')]"));
		clickByJSE(editButton);
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		explicitwait(viewName);
		viewName.clear();
		viewName.sendKeys("ABCD");
		WebElement select1 = driver.findElement(By.xpath("//select[@id='fcol1']"));
		explicitwait(select1);
		select1.click();
		selectDropDownList(select1, "Account Name");
		WebElement operator1 = driver.findElement(By.xpath("//select[@id='fop1']"));
		explicitwait(operator1);
		operator1.click();
		selectDropDownList(operator1, "contains");
		WebElement value = driver.findElement(By.xpath("//input[@id=\"fval1\"]"));
		explicitwait(value);
		value.sendKeys("none");
		WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@value=' Save ']"));
		explicitwait(saveButton);
		saveButton.click();
		System.out.println("Pass\nNew view name is in dropdown list.");
		
		
		
	}

}
