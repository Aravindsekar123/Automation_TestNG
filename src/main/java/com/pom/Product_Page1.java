package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page1 {
	
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement Quantity;
	
	@FindBy(id="group_1")
	private WebElement Size_Increase;
	
	@FindBy(xpath="//ul[@id='color_to_pick_list']/li[1]")
	private WebElement Color_ToSelect;
	
	@FindBy(name="Submit")
	private WebElement Submit;

	public Product_Page1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getSize_Increase() {
		return Size_Increase;
	}

	public WebElement getColor_ToSelect() {
		return Color_ToSelect;
	}

	public WebElement getSubmit() {
		return Submit;
	}

}
