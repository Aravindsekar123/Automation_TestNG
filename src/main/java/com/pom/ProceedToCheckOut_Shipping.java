package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut_Shipping {
	
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement tos;
	
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement ptc4;

	public ProceedToCheckOut_Shipping(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTos() {
		return tos;
	}

	public WebElement getPtc4() {
		return ptc4;
	}

}
