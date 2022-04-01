package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut_Payment {
	
	public WebDriver driver;
	
	@FindBy(className="bankwire")
	private WebElement pbw;

	public ProceedToCheckOut_Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPbw() {
		return pbw;
	}

}
