package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut_Address {
	
	public WebDriver driver;
	
	@FindBy(name="message")
	private WebElement Message;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement pct3;

	public ProceedToCheckOut_Address(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMessage() {
		return Message;
	}

	public WebElement getPct3() {
		return pct3;
	}
	

}
