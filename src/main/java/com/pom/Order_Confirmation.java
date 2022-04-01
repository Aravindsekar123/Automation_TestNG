package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation {

	public WebDriver driver;
	
	@FindBy(className="logout")
	private WebElement logout;
	
	public Order_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
}
