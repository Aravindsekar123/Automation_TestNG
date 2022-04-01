package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Page {
	
	public WebDriver driver;

	@FindBy(xpath="//img[@alt='My Store']")
	private WebElement Logo;

	public MyAccount_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogo() {
		return Logo;
	}
	
}
