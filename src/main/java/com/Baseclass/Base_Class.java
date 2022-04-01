package com.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver; //--> Null
	
	public static String value; //--> Null

	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver99.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void implicitWait(int sec , TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(sec, format);
	}

	public static void explicitWait(WebElement element , int sec) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}

	public static void takesScreenshot(String path) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(WebElement element , String data) {
		element.sendKeys(data);
	}

	public static void actions(WebElement element , String type ) {
		Actions act = new Actions(driver);

		if (type.equalsIgnoreCase("moveToElements")) {
			act.moveToElement(element).build().perform();
		}
		else if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
	}

	public static void dropdown(WebElement element , String type , String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}

	public static void scrollUpDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void frameOperation(String frameType, String id , String index , WebElement element ) {
		if (frameType.equalsIgnoreCase("frameId")) {
			driver.switchTo().frame(id);
		}
		else if (frameType.equalsIgnoreCase("frameIndex")) {
			driver.switchTo().frame(index);
		}
		else if (frameType.equalsIgnoreCase("Frameelement")) {
			driver.switchTo().frame(element);
		}
		else if (frameType.equalsIgnoreCase("parentFrame")) {
			driver.switchTo().parentFrame();
		}
		else if (frameType.equalsIgnoreCase("defaultContent")) {
			driver.switchTo().defaultContent();
		}

	}

	public static String particular_Cell_Data(String path, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(row_Index);

		Cell c = r.getCell(cell_Index);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();
		}

		else if (type.equals(CellType.NUMERIC)) {

			double cellValue = c.getNumericCellValue();

			int val = (int) cellValue; //narrowing type casting

			value = String.valueOf(val);

		}
		
		wb.close();

		return value;	
		
	}

	public static void close() {
		driver.close();	
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
}
