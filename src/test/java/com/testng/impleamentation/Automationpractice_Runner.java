package com.testng.impleamentation;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Baseclass.Base_Class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.configuration.helper.File_Reader_Manager;
import com.helper.Page_Object_Manager;

public class Automationpractice_Runner extends Base_Class {
	
	public static WebDriver driver = browser_Configuration("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automationpractice_Runner.class);

	public static ExtentSparkReporter spark_Reporter;

	public static ExtentReports reports;
	
	@BeforeTest
	private void report_Generation() {
		
		spark_Reporter = new ExtentSparkReporter("C:\\Users\\aravind\\eclipse-workspace\\AutomationPractice_TestNG\\Report_AutomationPractice\\Report.html");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_Reporter);
	}
	
	@AfterTest
	private void flush() {
		
		reports.flush();

	}
	
	@BeforeClass
	private void After_Browser_Launch() throws Throwable  {
		
		PropertyConfigurator.configure("log4j.properties");
		
		implicitWait(10, TimeUnit.SECONDS);
		
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url();

		getUrl(url);
		
		log.info("Url Launch");
		
	}
	
	@BeforeMethod
	private void Sign_In() throws Throwable {
		
		clickOnElement(pom.get_Instance_Hp().getSignin_Btn());
		
		String mailId = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Email();
		
		inputValueElement(pom.get_Instance_Lg().getMail_Id(), mailId);
		
		String password = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Password();

		inputValueElement(pom.get_Instance_Lg().getPassword(), password);
		
		clickOnElement(pom.get_Instance_Lg().getSignin_Button());

	}
	
	
	@Test(priority = 1)
	private void Faded_TShirt() throws Throwable {
		
		log.info("User Signin done 1");
		
		clickOnElement(pom.get_Instance_Myacct().getLogo());
		
		actions(pom.get_Instance_Hp().getFaded_Tshirt(), "moveToElement");
		
		actions(pom.get_Instance_Hp().getFaded_Tshirt(), "click");
		
		frameOperation("parentFrame",null,null,null);
		
		actions(pom.get_Instance_Pg1().getQuantity(), "click");
		
		dropdown(pom.get_Instance_Pg1().getSize_Increase(), "byIndex", "2");
		
		actions(pom.get_Instance_Pg1().getColor_ToSelect(), "click");
		
		actions(pom.get_Instance_Pg1().getSubmit(), "click");
		
		explicitWait(pom.get_Instance_Ptc1().getPtc1(), 30);
		
		actions(pom.get_Instance_Ptc2().getPtc2(), "click");
		
		String landmark = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Landmark();
		
		inputValueElement(pom.get_Instance_Ptc3().getMessage(), landmark);

		actions(pom.get_Instance_Ptc3().getPct3(), "click");
		
		actions(pom.get_Instance_Ptc4().getTos(), "click");
		
		actions(pom.get_Instance_Ptc4().getPtc4(), "click");
		
		actions(pom.get_Instance_Ptc5().getPbw(), "click");
		
		actions(pom.get_Instance_Os().getCmo(), "click");
		
		takesScreenshot("C:\\Users\\aravind\\eclipse-workspace\\AutomationPractice_TestNG\\Screenshot\\AutomationPractice_Faded_TShirt.png");
		
		log.info("Product Purchased 1");

	}
	
	@Test(priority = 2)
	private void Blouse() throws Throwable {
		
		log.info("User Signin done 2");
		
		clickOnElement(pom.get_Instance_Myacct().getLogo());
		
		actions(pom.get_Instance_Hp().getBlouse(), "moveToElement");
		
		actions(pom.get_Instance_Hp().getBlouse(), "click");
		
		frameOperation("parentFrame",null,null,null);
		
		actions(pom.get_Instance_Pg1().getQuantity(), "click");
		
		dropdown(pom.get_Instance_Pg1().getSize_Increase(), "byIndex", "2");
		
		actions(pom.get_Instance_Pg1().getColor_ToSelect(), "click");
		
		actions(pom.get_Instance_Pg1().getSubmit(), "click");
		
		explicitWait(pom.get_Instance_Ptc1().getPtc1(), 30);
		
		actions(pom.get_Instance_Ptc2().getPtc2(), "click");
		
		String landmark = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Landmark();
		
		inputValueElement(pom.get_Instance_Ptc3().getMessage(), landmark);

		actions(pom.get_Instance_Ptc3().getPct3(), "click");
		
		actions(pom.get_Instance_Ptc4().getTos(), "click");
		
		actions(pom.get_Instance_Ptc4().getPtc4(), "click");
		
		actions(pom.get_Instance_Ptc5().getPbw(), "click");
		
		actions(pom.get_Instance_Os().getCmo(), "click");
		
		takesScreenshot("C:\\Users\\aravind\\eclipse-workspace\\AutomationPractice_TestNG\\Screenshot\\AutomationPractice_Blouse.png");
		
		log.info("Product Purchased 2");

	}
	
	@Test(priority = 3)
	private void Printed_Dress() throws Throwable {
		
		log.info("User Signin done 3");
		
		clickOnElement(pom.get_Instance_Myacct().getLogo());
		
		actions(pom.get_Instance_Hp().getPrinted_Dress(), "moveToElement");
		
		actions(pom.get_Instance_Hp().getPrinted_Dress(), "click");
		
		frameOperation("parentFrame",null,null,null);
		
		actions(pom.get_Instance_Pg1().getQuantity(), "click");
		
		dropdown(pom.get_Instance_Pg1().getSize_Increase(), "byIndex", "2");
		
		actions(pom.get_Instance_Pg1().getColor_ToSelect(), "click");
		
		actions(pom.get_Instance_Pg1().getSubmit(), "click");
		
		explicitWait(pom.get_Instance_Ptc1().getPtc1(), 30);
		
		actions(pom.get_Instance_Ptc2().getPtc2(), "click");
		
		String landmark = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Landmark();
		
		inputValueElement(pom.get_Instance_Ptc3().getMessage(), landmark);

		actions(pom.get_Instance_Ptc3().getPct3(), "click");
		
		actions(pom.get_Instance_Ptc4().getTos(), "click");
		
		actions(pom.get_Instance_Ptc4().getPtc4(), "click");
		
		actions(pom.get_Instance_Ptc5().getPbw(), "click");
		
		actions(pom.get_Instance_Os().getCmo(), "click");
		
		takesScreenshot("C:\\Users\\aravind\\eclipse-workspace\\AutomationPractice_TestNG\\Screenshot\\AutomationPractice_Printed_Dress.png");
		
		log.info("Product Purchased 3");

	}
	
	@AfterMethod
	private void Sign_Out() {
	
		actions(pom.get_Instance_Oc().getLogout(), "click");

	}
	
	@AfterClass
	private void Final_Method() {
		
		close();
		
	}
	
	
	
	
}
