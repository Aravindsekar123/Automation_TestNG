package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	
	private WebElement Signin_Btn;
	
	@FindBy(xpath="(//a[normalize-space()='Faded Short Sleeve T-shirts'])[1]")
	
	private WebElement Faded_Tshirt;
	
	@FindBy(xpath="(//a[normalize-space()='Blouse'])[1]")
	
	private WebElement Blouse;
	
	@FindBy(xpath="(//a[normalize-space()='Printed Dress'])[1]")
	
	private WebElement Printed_Dress;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin_Btn() {
		return Signin_Btn;
	}
	
	public WebElement getFaded_Tshirt() {
		return Faded_Tshirt;
	}
	
	public WebElement getPrinted_Dress() {
		return Printed_Dress;
	}

	public WebElement getBlouse() {
		return Blouse;
	}

}
