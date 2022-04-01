package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut_Summary {
	
	public WebDriver driver;

	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement ptc1;

	public ProceedToCheckOut_Summary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc1() {
		return ptc1;
	}
}
