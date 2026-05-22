package com.focus.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.focus.Pages.LoginPage;
import com.focus.repository.ElementRepository;

import com.focus.supporters.ExcelReader;
import com.focus.utilities.DriverUtility;
import com.focus.utilities.POJOUtility;
import com.focus.utilities.ScreenshotUtility;

public class BaseEngine extends ElementRepository{

	private static WebDriver driver;
	private static String baseDir;
	private static String tcName;
	//private static ExtentReports extentReports;
	//private static ExtentTest extentTest;
	
	public static ExtentReports extentReports;
	private static ExtentTest extentTest;
	private static Logger logger;
	private static WebDriverWait wait;

	private String filePath;
	private FileInputStream fip;
	private FileOutputStream fop;
	private Workbook workbook;
	private Sheet sheet;
	private Cell cell;
	private CellStyle style;
	private Row row;
	private String res = null;

	private static Alert alert;

	// private String xlfile="\\E:\\ZFocusAI\\TestData.xls";

	
	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {

		baseDir = System.getProperty("user.dir");
		PropertyConfigurator.configure(baseDir + "\\log4j.properties");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(DriverUtility.chromeKey, baseDir + DriverUtility.chromeValue);
			String downloadFilepath = getBaseDir() + "\\autoIt\\ExportFiles";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			chromePrefs.put("safebrowsing.enabled", "true");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			
			
			/*options.addArguments("--incognito");
		
			
			// automation browser popup start
			
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			
			// automation browser popup end
			
			
			
			*/
			
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(cap);
			initActivities();
		}

		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty(DriverUtility.chromeKey,
		 * baseDir+DriverUtility.chromeValue); driver=new ChromeDriver();
		 * initActivities(); }
		 */

		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtility.ieKey, baseDir + DriverUtility.ieValue);
			driver = new InternetExplorerDriver();
			initActivities();
		}

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(DriverUtility.firefoxKey, baseDir + DriverUtility.firefoxValue);
			driver = new FirefoxDriver();
			initActivities();
		}
	}

	public void initActivities() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@BeforeMethod
	public void beforeMethodExecution(Method method) {
		tcName = method.getName();
		// System.out.println("tc started");
		logger = Logger.getLogger(BaseEngine.class);

		getLogger().info("Currently Executing Test Case Name is : " + tcName);
		//extentTest = extentReports.startTest(tcName);
		
		extentTest =extentReports.createTest(tcName);

		System.out.println("This Is Before Method Execution And Trying To Executing The Method: " + tcName);
		// Excel Update is Written as below
	}

	@AfterMethod
	public void afterMethodExecution(ITestResult result)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		// System.out.println(res);
		// System.out.println(result.getStatus());
		// System.out.println("This is After method");

		if (result.getStatus() == ITestResult.SUCCESS) {
			res = "Pass";
			getLogger().info("Test Case is Passed : " + tcName);
			// excelReader.setCellData(xlfile, "Sheet3", 0, 0, res);
			//ExtentTest.log(LogStatus.PASS, "Test Case is Passed  : " + tcName);
			
			extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));			
			
			System.out.println("Pass : Test Case is Passed from after Method : " + tcName);
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			res = "Fail";
			getLogger().info("Test Case is Failed : " + tcName + "So Taking the Screenshot");
			// excelReader.setCellData(xlfile, "Sheet3", 0, 1, res);
			//extentTest.log(LogStatus.FAIL, "Test Case is Failed : " + tcName);
			extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
			extentTest.fail(result.getThrowable());
			ScreenshotUtility.screenshot();
			System.out.println("Fail : Test Case Is Failed After Method Execution : " + tcName);
			// System.out.println("Log Message:: @AfterMethod:
			// Method-"+methodName+"- has
			// Failed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			res = "Skip";
			getLogger().info("Test Case is Skipped : " + tcName + "So Taking the Screenshot");
			// excelReader.setCellData(xlfile, "Sheet3", 0, 2, res);
			//extentTest.log(LogStatus.SKIP, "Test Case is Skipped : " + tcName);
			extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
			extentTest.skip(result.getThrowable());
			ScreenshotUtility.screenshot();
			System.out.println("Skip : Test Case Is Skipped After Method Execution : " + tcName);
		}

	}

	@AfterSuite
	public void closeBrowser() {
		if (driver == null) {
			getLogger().info("Driver is pointing to Null : @AfterSuite");
		} else {
			driver.close();
		}

	}

	@BeforeTest
	public void intialiseReports() {
		//extentReports = new ExtentReports(baseDir + "\\reports\\FocusAutomationReport.html");
		//extentReports = new ExtentReports(baseDir +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
		//extentReports.assignProject("FocusAI");
		
		extentReports 		=new ExtentReports();
	
		ExtentSparkReporter spark=new ExtentSparkReporter(baseDir +"\\reports\\"+getCurrentDateFormatWithTime()+"---FocusAutomationReport.html");
		extentReports.attachReporter(spark);
	}

	@AfterTest
	public void generateReports() {
		extentReports.flush();
		//extentReports.endTest(extentTest);
	}

	public static String getTCName() {
		return tcName;
	}

	public static String getBaseDir() {
		return baseDir;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void enterUrl(String url) {
		getDriver().get(url);
	}

	public static boolean isElementNotDisplayed(WebElement we) {
		try {
			if (we.isDisplayed()) {
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;

	}

	public static void getWaitForAlert() {
		new WebDriverWait(getDriver(), 800).ignoring(NoAlertPresentException.class)
				.until(ExpectedConditions.alertIsPresent());
	}

	public static Alert getAlert() {
		alert = getDriver().switchTo().alert();
		return alert;
	}

	public static void getFrame(WebElement ele) {
		getDriver().switchTo().frame(ele);

	}

	public static boolean getIsAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}
	}

	public static Wait getWebDriverWait() {
		wait = new WebDriverWait(getDriver(), 90);
		return wait;

	}
	
	public static String getCurrentDateFormatWithTime() {
		
		//String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
		String timeStamp = new SimpleDateFormat("MMM"+" "+"dd"+" "+"yyyy"+" "+"HH"+" "+"mm").format(Calendar.getInstance().getTime());

		System.out.println(timeStamp );
		return timeStamp;
		/*Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;*/

	}

	public static Wait getFluentWebDriverWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		return wait;
	}

	public static String getDate() {

		DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		Calendar cal = Calendar.getInstance();
		// System.out.println(dateFormat.format(cal.getTime()));
		return dateFormat.format(cal.getTime());

	}

	public static String getCurrentDate() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String getCurrentDateF2() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}
	
	public static String getCurrentDateF5() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}

	public static String getCurrentDateFormat() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}
	
	public static String getCurrentDateF3() {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = dateFormat.format(date);
		// System.out.println(strDate);
		return strDate;

	}
	
	public String addingDays(int i)
	{
		LocalDate futureDate = LocalDate.now().plusDays(i);		
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);	     
	     System.out.println("after adding "+i+" days  :"+ dateStr);
		return dateStr;

	}
	
	public String addingWeeks(int i)
	{
		LocalDate futureDate = LocalDate.now().plusWeeks(i);		
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);	     
	     System.out.println("after adding "+i+" Weeks  :"+ dateStr);
		return dateStr;

	}
	
	public String addingMonths(int i)
	{
		LocalDate futureDate = LocalDate.now().plusMonths(i);		
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);	     
	     System.out.println("after adding "+i+" Months  :"+ dateStr);
		return dateStr;

	}
	
	public String addingYears(int i)
	{
		LocalDate futureDate = LocalDate.now().plusYears(i);		
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);
	     System.out.println("after adding "+i+" Years  :"+ dateStr);
		return dateStr;
	     

	}
	
	public String minusDays(int i)
	{
		LocalDate futureDate = LocalDate.now().minusDays(i);	
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);
	     System.out.println("after removing "+i+" days  :"+ dateStr);
		return dateStr;

	}
	
	
	public String minusWeeks(int i)
	{
		LocalDate futureDate = LocalDate.now().minusWeeks(i);	
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);
	     System.out.println("after removing "+i+" weeks  :"+ dateStr);
		return dateStr;

	}
	
	public String minusMoths(int i)
	{
		LocalDate futureDate = LocalDate.now().minusMonths(i);	
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);
	     System.out.println("after removing "+i+" Months  :"+ dateStr);
		return dateStr;

	}
	
	public String minusYears(int i)
	{
		LocalDate futureDate = LocalDate.now().minusYears(i);	
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     String dateStr = futureDate.format(formatter);
	     System.out.println("after removing "+i+" Years  :"+ dateStr);
		return dateStr;

	}
	
	public void currentTimeDateAndDayWithPM()
	{
		
		ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss a");

        // 3. Format the ZonedDateTime object into a string
        String formattedDateTime = now.format(formatter);

        // 4. Print the result
        System.out.println("Current Date and Time: " + formattedDateTime);
		
	}

	public static String getTextByJs(WebElement element) { // for only getText (Individual text only)
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		String text = (String) js.executeScript("return arguments[0].innerHTML", element);
		return text;
	}

	public static void ClickUsingJs(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].click();", element);

	}

	public static void click(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.click();
	}

	public static void IsVisible(WebElement element) {
		new WebDriverWait(getDriver(), 120).until(ExpectedConditions.visibilityOf(element));		
		System.err.println("element is visible");
	}
	
	public static void enterText(WebElement element, String Value) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(Value);
	}

	public static String getText(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		return element.getText();
	}

	public static void clearValueFromTextBox(WebElement element) throws InterruptedException {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));
		
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1500);
		element.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1500);

		//element.clear();
	}
	
	public static void handleComboBoxUsingByProp(By element, By purchasesAccComboList2, String Value) throws InterruptedException 
	{
		Thread.sleep(1200);
		getDriver().findElement(element).sendKeys(Keys.SPACE);
		
		//int warehouseCount = purchasesAccComboList2.size();
		//Thread.sleep(2500);
		
		int warehouseCount = getDriver().findElements(purchasesAccComboList2).size();

		System.out.println("Warehouse List Size: " + warehouseCount);

		for (int i = 0; i < warehouseCount; i++) {
			String warehouse = getDriver().findElements(purchasesAccComboList2).get(i).getText();

			if (warehouse.equalsIgnoreCase(Value)) {
				getDriver().findElements(purchasesAccComboList2).get(i).click();
				//Thread.sleep(1000);
				getDriver().findElement(element).sendKeys(Keys.TAB);
				break;
			}
		}
	}
	
	
	public static void handleComboBox(WebElement element, List<WebElement> ComboBoxList, String Value) throws InterruptedException 
	{
		Thread.sleep(1200);
		element.sendKeys(Keys.SPACE);
		
		int warehouseCount = ComboBoxList.size();

		System.out.println("Warehouse List Size: " + warehouseCount);

		for (int i = 0; i < warehouseCount; i++) {
			String warehouse = ComboBoxList.get(i).getText();

			if (warehouse.equalsIgnoreCase(Value)) {
				ComboBoxList.get(i).click();
				element.sendKeys(Keys.TAB);
				break;
			}
		}
	}

	public static void tab(WebElement element) {

		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(element));

		element.sendKeys(Keys.TAB);
	}

	public static void ScrollToElement(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	
	
	public static String getMonth() {
		DateFormat dateFormat = new SimpleDateFormat("MMMM");
		Calendar cal = Calendar.getInstance();
		// System.out.println(dateFormat.format(cal.getTime()));
		return dateFormat.format(cal.getTime());
	}

	public static void dropDown(WebElement element, String value) {

		new Select(element).selectByValue(value);

	}

	public static void dropDown(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public static void dropDown(String str, WebElement element) {

		new Select(element).selectByVisibleText(str);

	}

	public static void contextClick(WebElement element) {

		try {
			Actions action = new Actions(getDriver()).contextClick(element);

			action.build().perform();

			System.out.println("right clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}
	
	public void removetTxt(WebElement element)
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	}

	public void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(getDriver()).moveToElement(element).click();

			action.build().perform();

			System.out.println("MoveTo element clicked the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}
	
	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
	    try {
	    	
	        if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) 
	        
	        {
	            Actions action = new Actions(driver);
	            action.dragAndDrop(sourceElement, destinationElement).build().perform();
	        } else {
	            System.out.println("Element was not displayed to drag");
	        }
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
	                + e.getStackTrace());
	    } catch (NoSuchElementException e) {
	        System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
	    } catch (Exception e) {
	        System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
	    }
	}
	
	public void dragAndDrop1(WebElement sourceElement, WebElement destinationElement)
    {
        (new Actions(driver)).dragAndDrop(sourceElement, destinationElement).perform();
    }
	
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[2]")
	public static List<WebElement> errorMessageList;
	
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[1]/button")
	public static List<WebElement> errorMessageCloseBtnList;
	
	public static String SavingInBackground(int count) throws InterruptedException
	   {
		   Thread.sleep(2500);
		   
		   String message;
		   
		   HashSet<String> actMessage = new HashSet();
		   
		   for (int i = 0; i < count; i++) 
		   {
			   String data = errorMessageList.get(i).getText();
			   System.err.println(data);
			   actMessage.add(data);
			   errorMessageCloseBtnList.get(i).click();
		   }
		   
		   message = actMessage.toString();
		   
		   return message;
	   }
	
	public static String SavingInBackgroundTrial() throws InterruptedException
	{
		Thread.sleep(3000);

		int count = errorMessageList.size();

		String message;

		HashSet<String> actMessage = new HashSet();

		for (int i = 0; i < count; i++) 
		{
			String data = errorMessageList.get(i).getText();
			System.err.println(data);
			actMessage.add(data);
			errorMessageCloseBtnList.get(i).click();
		}

		message = actMessage.toString();

		return message;
	}
	
	
	public static boolean SavingInBackground(String docno) throws InterruptedException
	{	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));


		String actErrorMessage=errorMessage.getText();
		String expErrorMessage="Voucher saved successfully";
		String expErrorMessage1=docno;


		if (actErrorMessage.startsWith(expErrorMessage) && 
				actErrorMessage.endsWith(expErrorMessage1)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();

			System.out.println("ValidationMessage  :  "+actErrorMessage +" Starts With  : "+expErrorMessage+" Ends With "+expErrorMessage1);

			return true;
		}

		else
		{
		return false;
		}
	}
	catch(Exception e)
	{
		System.err.println("Error Message NOT Found or NOT Clickable");
		System.err.println(e.getMessage());
		return false;
	}

}	

public static String activeElement() {
		
		WebElement actualElement =getDriver().switchTo().activeElement();
		 String actActiveElement  =actualElement.getAttribute("id");
		 
		 return actActiveElement;

	}
	
	public static boolean SavingInvoucherWithTransNegative(String docno) throws InterruptedException
	{	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));


		String actErrorMessage=errorMessage.getText();
		String expErrorMessage="Voucher saved successfully";
		String expErrorMessage1=docno;

		
		

		if (actErrorMessage.startsWith(expErrorMessage) && 
				actErrorMessage.endsWith(expErrorMessage1)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();

			System.out.println("ValidationMessage  :  "+actErrorMessage +" Starts With  : "+expErrorMessage+" Ends With "+expErrorMessage1);

			return true; 
		}

		else
		{
		return false;
		}
	}
	catch(Exception e)
	{
		System.err.println("Error Message NOT Found or NOT Clickable");
		System.err.println(e.getMessage());
		return false;
	}

}	
	
	
	
public static void reLogin(String userName, String passWord) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
		//excelReader = new ExcelReader(POJOUtility.getExcelPath());

		Thread.sleep(3000);
		click(userNameDisplayLogo);
		Thread.sleep(1000);
		click(logoutOption);
		Thread.sleep(3000);

		//String unamelt = excelReader.getCellData(xlSheetName, 102, 5);

		//String pawslt = excelReader.getCellData(xlSheetName, 103, 5);

		LoginPage.enterUserName(userName);
		LoginPage.enterPassword(passWord);
		
		String compname="Maintain Quantity a";

		Select oSelect = new Select(companyDropDownList);

		List <WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		System.out.println("CompanyDropdownList Count :"+cqSize);

		int i;

		for(i=0; i<elementCount.size(); i++) 
		{

			elementCount.get(i).getText();

			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();
			}
		}


		Thread.sleep(2000);
		LoginPage.clickOnSignInBtn();

		/*Select company = new Select(companyDropDownList);
		company.selectByValue("108");
		Thread.sleep(2000);

		LoginPage.clickOnSignInBtn();
		
		try {
			
			if(loginPageErrorMesg.isDisplayed())
			{
				
				enterText(username, userName);
				enterText(password, passWord);
				Select company1 = new Select(companyDropDownList);
				company1.selectByValue("108");
				Thread.sleep(2000);
				click(signIn);
			}
			
		} catch (Exception e) {
			
			System.err.println("Error Message NOT Found or NOT Clickable");
		System.err.println(e.getMessage());

		String Exception = e.getMessage();*/

		
		Thread.sleep(3000);

		System.out.println("Signing");
	}






public  static void reLogin1(String userName, String passWord) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	
	//excelReader = new ExcelReader(POJOUtility.getExcelPath());

	Thread.sleep(3000);
	click(userNameDisplayLogo);
	Thread.sleep(1000);
	click(logoutOption);
	Thread.sleep(3000);

	//String unamelt = excelReader.getCellData(xlSheetName, 102, 5);

	//String pawslt = excelReader.getCellData(xlSheetName, 103, 5);

	LoginPage.enterUserName(userName);
	LoginPage.enterPassword(passWord);

	/*Select company = new Select(companyDropDownList);
	company.selectByValue("36");
	Thread.sleep(2000);

	LoginPage.clickOnSignInBtn();
	
	try {
		
		if(loginPageErrorMesg.isDisplayed())
		{
			
			enterText(username, userName);
			enterText(password, passWord);
			Select company1 = new Select(companyDropDownList);
			company1.selectByValue("36");
			Thread.sleep(2000);
			click(signIn);
		}
		
	} catch (Exception e) {
		
		System.err.println("Error Message NOT Found or NOT Clickable");
	System.err.println(e.getMessage());

	String Exception = e.getMessage();

	}*/

	String compname="Transaction Authorization";

	Select oSelect = new Select(companyDropDownList);

	List <WebElement> elementCount = oSelect.getOptions();

	int cqSize = elementCount.size();

	System.out.println("CompanyDropdownList Count :"+cqSize);

	int i;

	for(i=0; i<elementCount.size(); i++) 
	{

		elementCount.get(i).getText();

		String optionName = elementCount.get(i).getText();
		if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		{
			System.out.println("q"+elementCount.get(i).getText());
			elementCount.get(i).click();
		}
	}


	Thread.sleep(2000);
	
	

	Thread.sleep(2000);
	LoginPage.clickOnSignInBtn();

	System.out.println("Signing");
}


public  static void reLogin2(String userName, String passWord) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	
	//excelReader = new ExcelReader(POJOUtility.getExcelPath());

	Thread.sleep(3000);
	click(userNameDisplayLogo);
	Thread.sleep(1000);
	click(logoutOption);
	Thread.sleep(3000);

	//String unamelt = excelReader.getCellData(xlSheetName, 102, 5);

	//String pawslt = excelReader.getCellData(xlSheetName, 103, 5);

	LoginPage.enterUserName(userName);
	LoginPage.enterPassword(passWord);

	/*Select company = new Select(companyDropDownList);
	company.selectByValue("36");
	Thread.sleep(2000);

	LoginPage.clickOnSignInBtn();
	
	try {
		
		if(loginPageErrorMesg.isDisplayed())
		{
			
			enterText(username, userName);
			enterText(password, passWord);
			Select company1 = new Select(companyDropDownList);
			company1.selectByValue("36");
			Thread.sleep(2000);
			click(signIn);
		}
		
	} catch (Exception e) {
		
		System.err.println("Error Message NOT Found or NOT Clickable");
	System.err.println(e.getMessage());

	String Exception = e.getMessage();

	}*/

	String compname="TESTING COGS";

	Select oSelect = new Select(companyDropDownList);

	List <WebElement> elementCount = oSelect.getOptions();

	int cqSize = elementCount.size();

	System.out.println("CompanyDropdownList Count :"+cqSize);

	int i;

	for(i=0; i<elementCount.size(); i++) 
	{

		elementCount.get(i).getText();

		String optionName = elementCount.get(i).getText();
		if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		{
			System.out.println("q"+elementCount.get(i).getText());
			elementCount.get(i).click();
		}
	}


	Thread.sleep(2000);
	
	

	Thread.sleep(2000);
	LoginPage.clickOnSignInBtn();

	System.out.println("Signing");
}


public  static void reLogin3(String userName, String passWord) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	
	//excelReader = new ExcelReader(POJOUtility.getExcelPath());

	Thread.sleep(3000);
	click(userNameDisplayLogo);
	Thread.sleep(1000);
	click(logoutOption);
	Thread.sleep(3000);

	//String unamelt = excelReader.getCellData(xlSheetName, 102, 5);

	//String pawslt = excelReader.getCellData(xlSheetName, 103, 5);

	LoginPage.enterUserName(userName);
	LoginPage.enterPassword(passWord);

	/*Select company = new Select(companyDropDownList);
	company.selectByValue("36");
	Thread.sleep(2000);

	LoginPage.clickOnSignInBtn();
	
	try {
		
		if(loginPageErrorMesg.isDisplayed())
		{
			
			enterText(username, userName);
			enterText(password, passWord);
			Select company1 = new Select(companyDropDownList);
			company1.selectByValue("36");
			Thread.sleep(2000);
			click(signIn);
		}
		
	} catch (Exception e) {
		
		System.err.println("Error Message NOT Found or NOT Clickable");
	System.err.println(e.getMessage());

	String Exception = e.getMessage();

	}*/

	String compname="Maintain quantity overall and value overall";

	Select oSelect = new Select(companyDropDownList);

	List <WebElement> elementCount = oSelect.getOptions();

	int cqSize = elementCount.size();

	System.out.println("CompanyDropdownList Count :"+cqSize);

	int i;

	for(i=0; i<elementCount.size(); i++) 
	{

		elementCount.get(i).getText();

		String optionName = elementCount.get(i).getText();
		if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		{
			System.out.println("q"+elementCount.get(i).getText());
			elementCount.get(i).click();
		}
	}


	Thread.sleep(2000);
	
	

	Thread.sleep(2000);
	LoginPage.clickOnSignInBtn();

	System.out.println("Signing");
}

public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	   Thread.sleep(2000);
	   
     try
     {
             getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
             String actErrorMessage=errorMessage.getText();
             String expErrorMessage=ExpMessage;

             try
             {
             
	                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
	                errorMessageCloseBtn.click();
             	
	                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
	                
	                return actErrorMessage;
             }
             catch(Exception ee)
             {
             	
             	System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
             	
             	return actErrorMessage;
             }
     }
     catch(Exception e)
     {
             System.err.println("Error Message NOT Found or NOT Clickable");
             System.err.println(e.getMessage());
             
             String Exception=e.getMessage();
         
             return Exception;
     }
}


public static String checkDownloadedFileName(WebDriver driver) throws InterruptedException, AWTException
{
		/*String mainWindow = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}

		driver.get("chrome://downloads");*/

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

		int count = openTabs.size();
		
	 	System.out.println("openTabs : "+count);

	 	getDriver().switchTo().window(openTabs.get(count-2));
	 	
	 	getDriver().switchTo().window(openTabs.get(count-1));
	 	
	 	Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;

		String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");

		System.err.println("Download deatils");
		System.out.println("File Name :-" + fileName);

		Thread.sleep(2000);
		
		/*driver.close();

		driver.switchTo().window(mainWindow);*/
		
		getDriver().switchTo().window(openTabs.get(count-1)).close();
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(count-2));
		
		return fileName;
	}

public static void ScrollIntoView(WebElement element)
{
	   JavascriptExecutor js = (JavascriptExecutor) getDriver(); 
	   js.executeScript("arguments[0].scrollIntoView();",element);
}



public void doubleClick(WebElement element) 
{

		try 
		{
			Actions action = new Actions(getDriver()).doubleClick(element);

			action.build().perform();

			System.out.println("double clicked the element");
		} 
		catch (StaleElementReferenceException e)
		{
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println("Element " + element + " was not found in DOM " + e.getStackTrace());
		} 
		catch (Exception e) 
		{
			System.out.println("Element " + element + " was not clickable " + e.getStackTrace());
		}
	}

@FindBy (xpath="//*[@id='25']")
public static WebElement dataMangementMenu;

@FindBy (xpath="//*[@id='26']/span")
public static WebElement backup;

@FindBy (xpath="//*[@id='27']/span")
public static WebElement restore;

@FindBy (xpath="//button[@class='btn Fbutton']")
public static WebElement folderpathExpandBtn;

@FindBy (xpath="//i[@class='icon-restore hiconright2']")
public static WebElement restoreCompanyBtn;

@FindBy (xpath="//*[@class='FButton-Primary'][contains(text(),'Yes')]")
public static WebElement overRideYesBtn;



//button[text()='Cancel']//..//input[@class='FButton-Primary font-5']

public static void checkLoginToSelectedCompany(String cname,String username,String Password) throws InterruptedException
{
	  Thread.sleep(3000);
	     
	     LoginPage lp= new LoginPage(getDriver());
	     
	     lp.enterUserName(username);
	     
	     lp.enterPassword(Password);
	     
			String compname = cname;

			Select oSelect = new Select(companyDropDownList);

			List<WebElement> elementCount = oSelect.getOptions();

			int cqSize = elementCount.size();

			System.out.println("CompanyDropdownList Count :" + cqSize);

			int i;

			for (i = 0; i < elementCount.size(); i++) {

				elementCount.get(i).getText();

				String optionName = elementCount.get(i).getText();
				if (optionName.toUpperCase().startsWith(compname.toUpperCase())) {
					System.out.println("Logined Company" + elementCount.get(i).getText());
					elementCount.get(i).click();
				}

			}

			Thread.sleep(2000);

			lp.clickOnSignInBtn();
			Thread.sleep(2000);
			
			
}






}
