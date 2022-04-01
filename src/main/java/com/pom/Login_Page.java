package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement Mail_Id;
	
	@FindBy(id="passwd")
	private WebElement Password;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	private WebElement Signin_Button;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMail_Id() {
		return Mail_Id;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignin_Button() {
		return Signin_Button;
	}
	
}
