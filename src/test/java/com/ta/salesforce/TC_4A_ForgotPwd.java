package com.ta.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_4A_ForgotPwd extends ReusableMethod{

	public static void main(String[] args) {
		//Forgot Password- 4 A
		
		launchBrowser("ch");
		driver.get("https://login.salesforce.com");
		WebElement eleForgotPwdLink = driver.findElement(By.id("forgot_password_link"));
		explicitwait(eleForgotPwdLink);
		eleForgotPwdLink.click();
		WebElement eleforgotUsernamePH = driver.findElement(By.id("un"));
		eleforgotUsernamePH.clear();
		eleforgotUsernamePH.sendKeys("janicerath@tekarch.com");
		WebElement eleContinueButton = driver.findElement(By.id("continue"));
		eleContinueButton.click();
		
		System.out.println("Pass. reset password link sent to email.");
	}

}
