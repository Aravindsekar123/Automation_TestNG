package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.MyAccount_Page;
import com.pom.Order_Confirmation;
import com.pom.Order_Summary;
import com.pom.ProceedToCheckOut_Address;
import com.pom.ProceedToCheckOut_Payment;
import com.pom.ProceedToCheckOut_Shipping;
import com.pom.ProceedToCheckOut_SignIn;
import com.pom.ProceedToCheckOut_Summary;
import com.pom.Product_Page1;

public class Page_Object_Manager {
	
	public WebDriver driver; //null driver
	
	private Home_Page hp;  //null
	
	private Login_Page lg;  //null
	
	private MyAccount_Page myacct; //null
	
	private Product_Page1 pg1;  //null
	
	private ProceedToCheckOut_Summary ptc1;  //null
	
	private ProceedToCheckOut_SignIn ptc2;  //null
	
	private ProceedToCheckOut_Address ptc3;  //null
	
	private ProceedToCheckOut_Shipping ptc4;  //null
	
	private ProceedToCheckOut_Payment ptc5;  //null
	
	private Order_Summary os;  //null
	
	private Order_Confirmation oc;  //null
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page get_Instance_Hp() {
		
		if (hp==null) {
			hp = new Home_Page(driver);
		}
		
		return hp;
	}

	public Login_Page get_Instance_Lg() {
		
		if (lg==null) {
			lg = new Login_Page(driver);
		}
		
		return lg;
	}
	
	public MyAccount_Page get_Instance_Myacct() {
		
		if (myacct==null) {
			myacct = new MyAccount_Page(driver);
		}
		
		return myacct;
	}

	public Product_Page1 get_Instance_Pg1() {
		
		if (pg1==null) {
			pg1 = new Product_Page1(driver);
		}
		
		return pg1;
	}

	public ProceedToCheckOut_Summary get_Instance_Ptc1() {
		
		if (ptc1==null) {
			ptc1 = new ProceedToCheckOut_Summary(driver);
		}
		
		return ptc1;
	}

	public ProceedToCheckOut_SignIn get_Instance_Ptc2() {
		
		if (ptc2==null) {
			ptc2 = new ProceedToCheckOut_SignIn(driver);
		}
		
		return ptc2;
	}

	public ProceedToCheckOut_Address get_Instance_Ptc3() {
		
		if (ptc3==null) {
			ptc3 = new ProceedToCheckOut_Address(driver);
		}
		
		return ptc3;
	}

	public ProceedToCheckOut_Shipping get_Instance_Ptc4() {
		
		if (ptc4==null) {
			ptc4 = new ProceedToCheckOut_Shipping(driver);
		}
		
		return ptc4;
	}

	public ProceedToCheckOut_Payment get_Instance_Ptc5() {
		
		if (ptc5==null) {
			ptc5 = new ProceedToCheckOut_Payment(driver);
		}
		
		return ptc5;
	}

	public Order_Summary get_Instance_Os() {
		
		if (os==null) {
			os = new Order_Summary(driver);
		}
		
		return os;
	}

	public Order_Confirmation get_Instance_Oc() {
		
		if (oc==null) {
			oc = new Order_Confirmation(driver);
		}
		
		return oc;
	}	

}
