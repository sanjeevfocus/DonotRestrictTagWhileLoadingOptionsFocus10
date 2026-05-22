package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class StockAnalysisBatchPage extends BaseEngine

{
	
	public StockAnalysisBatchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	public static WebElement  inventoryTransactionsStocksMenu;
	
	
	@FindBy(xpath="//span[text()='Excesses in Stocks']")
	public static WebElement  excessInStocks;
	
	@FindBy(xpath="//span[text()='New MRN']")
	public static WebElement  newMrn;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[2]/ul/li[4]/ul/li/a/span")
	public static List<WebElement> stocksVouchersList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	public static WebElement  select1stRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	public static WebElement  select1stRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	public static WebElement  select1stRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	public static WebElement  select1stRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	public static WebElement  select1stRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	public static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	public static WebElement enter_WarehouseTxt;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	public static WebElement  enter_ItemTxt;
	
	@FindBy(xpath = "//a[@id='id_transaction_homescreen_new']")
	public static WebElement newBtn;
	
	@FindBy(xpath="//input[@id='id_body_24']")
	public static WebElement  enter_UnitTxt;
	
	@FindBy(xpath="//input[@id='id_body_26']")
	public static WebElement  enter_Quantity;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	public static WebElement  enter_Rate;
	
	@FindBy(xpath="//*[@id='id_body_28']")
	public static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_22']")
	public static WebElement  enter_Reserve;
	
	@FindBy(xpath="//input[@id='id_body_13']")
	public static WebElement  enter_Batch;
	
	@FindBy(xpath="//input[@id='id_body_37']")
	public static WebElement enter_Expirydate;
	
	@FindBy(xpath="//input[@id='id_body_36']")
	public static WebElement enter_Mfgdate;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	public static WebElement  vouchersaveBtn;
	
	@FindBy(xpath="//input[@id='id_menu_search_input']")
	public static WebElement  HomePagesearch;
	
	@FindBy(xpath="//td[@title='DOLO650']")
	public static WebElement  stockAnalysisByBatch1stItem;
	
	@FindBy(xpath="//td[text()='Grand Total']")
	public static WebElement  grandTotalTxt;
	
	
	public boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		Thread.sleep(2000);

		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    String compname="Stock analysis by Batch";

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
	    
	    lp.clickOnSignInBtn();
	    
	  
		Thread.sleep(3500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		Thread.sleep(1500);
		
		String getCompanyTxt=companyName.getText();
		//String getLoginCompanyName=getCompanyTxt.substring(0, 15);
		//System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();
		
		boolean actDashboard = dashboard.isDisplayed();
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Stock analysis by Batch";
		boolean expDashboard = true;	
		
		Thread.sleep(2000);
		
		
		System.out.println("actUserInfo   :"+actUserInfo);
		System.out.println("expUserInfo   :"+expUserInfo);
		
		System.out.println("getCompanyTxt   	  :"+getCompanyTxt);
		System.out.println("expLoginCompanyName   :"+expLoginCompanyName);
		
		System.out.println("actDashboard   :"+actDashboard);
		System.out.println("expDashboard   :"+expDashboard);
		
		Thread.sleep(2000);
	
		
		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getCompanyTxt.contains(expLoginCompanyName) && actDashboard==expDashboard) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
    static String minus10Days;
    static String adding10Days;
    static String minus9Days;
    static String adding12Days;
	
	public boolean checkExcessesInStocksVoucherForUnitConvertionScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStocksMenu);		

		Thread.sleep(3000);
		
		ClickUsingJs(excessInStocks);
		
		Thread.sleep(2000);	
		
		ClickUsingJs(newBtn);		
		Thread.sleep(500);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		click(select1stRow_1stColumn);
		enterText(enter_WarehouseTxt, "HYDERABAD");		
		Thread.sleep(2000);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);
		
		
		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "BR COGS ITEM");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1000);
		
		tab(enter_UnitTxt);	
		Thread.sleep(1000);
		
		click(enter_Quantity);
		enterText(enter_Quantity, "10");		
		Thread.sleep(2000);
		tab(enter_Quantity);
		
		Thread.sleep(3500);
		
		click(enter_Rate);
		enterText(enter_Rate, "10");		
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(1000);	
		
		tab(enter_Gross);
		Thread.sleep(1000);	
		
		enterText(enter_Batch, "B1");		
		Thread.sleep(2000);
		tab(enter_Batch);
		Thread.sleep(1000);	
		
		minus10Days =minusDays(10);
		System.out.println("minus10Days    :"+minus10Days);
		Thread.sleep(1500);	
		
		
		clearValueFromTextBox(enter_Mfgdate);
		Thread.sleep(1200);
		
		enterText(enter_Mfgdate, minus10Days);		
		Thread.sleep(2000);
		tab(enter_Mfgdate);
		Thread.sleep(1500);	
		
		
		adding10Days =addingDays(10);
		System.out.println("adding10Days    :"+adding10Days);
		Thread.sleep(1500);
		
		clearValueFromTextBox(enter_Expirydate);
		Thread.sleep(1200);
		
		enterText(enter_Expirydate, adding10Days);		
		Thread.sleep(2000);
		tab(enter_Expirydate);
		Thread.sleep(1000);		

		// 2nd Row
		
		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		
		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "BR COGS ITEM");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1500);
		
		Thread.sleep(2000);
		tab(enter_UnitTxt);	
		Thread.sleep(1000);
		
		
		click(enter_Quantity);
		enterText(enter_Quantity, "10");		
		Thread.sleep(2000);
		tab(enter_Quantity);
		
		Thread.sleep(3500);
		
		click(enter_Rate);
		enterText(enter_Rate, "10");		
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(1000);	
		
		tab(enter_Gross);
		Thread.sleep(1000);	
		
		enterText(enter_Batch, "B1");		
		Thread.sleep(2000);
		tab(enter_Batch);
		Thread.sleep(1000);
	
		
	    minus9Days =minusDays(9);
		System.out.println("minus9Days    :"+minus9Days);
		
		clearValueFromTextBox(enter_Mfgdate);
		Thread.sleep(1200);
		
		enterText(enter_Mfgdate, minus9Days);		
		Thread.sleep(2000);
		tab(enter_Mfgdate);
		Thread.sleep(1500);	
		
		
	    adding12Days =addingDays(12);
		System.out.println("adding12Days    :"+adding12Days);
		Thread.sleep(1500);
		
		
		
		clearValueFromTextBox(enter_Expirydate);
		Thread.sleep(1200);
		
		enterText(enter_Expirydate, adding12Days);		
		Thread.sleep(2000);
		tab(enter_Expirydate);
		Thread.sleep(2000);		
		
		click(vouchersaveBtn);	

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";
		String actMessage = checkValidationMessage(expMessage1);

		System.out.println(
				"********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean checkStockAnalysisByBatchReportAfterInward()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	
	{
		
		click(HomePagesearch);
		Thread.sleep(1500);
		enterText(HomePagesearch, "Stock Analysis by Batch");		
		Thread.sleep(1500);
		HomePagesearch.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		IsVisible(stockAnalysisByBatch1stItem);
		Thread.sleep(1500);
		ClickUsingJs(sl_SelectAllItemsChkBox);
		Thread.sleep(1500);		
		dropDown(sl_DateOptionDropdown,"1");
		Thread.sleep(1500);		
		click(sl_OkBtn);
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, B1, 120.00, 8.33, 1,000.00, "+adding10Days+", "+minus10Days+", , 100.00, ]";
		
		System.out.println("actRow1List   :"+actRow1List);
		System.out.println("expRow1List   :"+expRow1List);
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, B1, 120.00, 8.33, 1,000.00, "+adding12Days+", "+minus9Days+", , 100.00, ]";
		
		System.out.println("actRow2List   :"+actRow2List);
		System.out.println("expRow2List   :"+expRow2List);
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, Grand Total, 240.00, 16.67, 2,000.00, , , , 200.00, ]";	
		
		System.out.println("actRow3List   :"+actRow3List);
		System.out.println("expRow3List   :"+expRow3List);
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List)) 
		{
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']//tr[1]//td")
	public static List<WebElement> batchPopupRow1Data;
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']//tr[2]//td")
	public static List<WebElement> batchPopupRow2Data;
	
	public boolean checkSavingShortageInStockVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStocksMenu);
		ClickUsingJs(shortagesInStockVoucher);		
		Thread.sleep(3000);		
		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		
		click(select1stRow_1stColumn);
		click(enter_WarehouseTxt);
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);
		
		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "BR COGS ITEM");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);
		
		tab(enter_UnitTxt);
		Thread.sleep(2000);
		
		click(select1stRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "120");
		Thread.sleep(2000);
		

		click(select1stRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);		
		
		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}
		
		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 120.00, "+minus10Days+", "+adding10Days+", 8.33, 0, "+getCurrentDateF2()+"]";
		
		System.out.println("actRow1Data   :"+actRow1Data);
		System.out.println("expRow1Data   :"+expRow1Data);
		
		
		int RowCount2 =batchPopupRow2Data.size();
		ArrayList<String> arrayList2=new ArrayList<String>();
		for(int i=0 ; i<RowCount2; i++)
		{
			String data =batchPopupRow2Data.get(i).getText();
			if(!data.isEmpty())
				arrayList2.add(data);
		}
		
		String actRow2Data=arrayList2.toString();
		String expRow2Data="[2, B1, 120.00, "+minus9Days+", "+adding12Days+", 8.33, 0, "+getCurrentDateF2()+"]";
		
		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);
		
		ClickUsingJs(batchPickOnFIFOIcon);
		Thread.sleep(1500);
		ClickUsingJs(batchOkIcon);
		Thread.sleep(2500);
		click(vouchersaveBtn);		
		Thread.sleep(1000);	
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";
		
		String actMessage = checkValidationMessage(expMessage1);		
	   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		
		if(actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		}
		else
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	@FindBy(xpath="//button[contains(text(),'Pick on FIFO')]")
	public static WebElement batchPickOnFIFOIcon;

	@FindBy(xpath="//button[@id='div_Ok1']")
	public static WebElement batchOkIcon;
	
	public boolean checkStockAnalysisByBatchReportAfterOutWardDocument()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	
	{
		
		click(HomePagesearch);
		Thread.sleep(1500);
		enterText(HomePagesearch, "Stock Analysis by Batch");		
		Thread.sleep(1500);
		HomePagesearch.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		IsVisible(stockAnalysisByBatch1stItem);
		Thread.sleep(1500);
		ClickUsingJs(sl_SelectAllItemsChkBox);
		Thread.sleep(1500);		
		dropDown(sl_DateOptionDropdown,"1");
		Thread.sleep(1500);		
		click(sl_OkBtn);
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, B1, 120.00, 8.33, 1,000.00, "+adding12Days+", "+minus9Days+", , 100.00, ]";
		
		System.out.println("actRow1List   :"+actRow1List);
		System.out.println("expRow1List   :"+expRow1List);
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, Grand Total, 120.00, 8.33, 1,000.00, , , , 100.00, ]";
		
		System.out.println("actRow2List   :"+actRow2List);
		System.out.println("expRow2List   :"+expRow2List);	
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	
	@FindBy(xpath="(//td[text()='1'])[2]//..//input")
	public static WebElement  voucherGrid1; 
	
	@FindBy(xpath="//a[@id='id_transaction_homescreen_Suspend']")
	public static WebElement  suspendBtn;
	
	public boolean checkSuspendShortageInStockVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStocksMenu);
		ClickUsingJs(shortagesInStockVoucher);		
		Thread.sleep(1500);
		IsVisible(newBtn);
		Thread.sleep(1500);
		ClickUsingJs(voucherGrid1);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendBtn));
		suspendBtn.click();

		Thread.sleep(1000);
		
		String expMessage = "Voucher Suspended Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		Thread.sleep(1500);
		System.out.println("actMessage   :"+actMessage);
		System.out.println("expMessage   :"+expMessage);	

		Thread.sleep(1500);

		if(actMessage.equalsIgnoreCase(expMessage))		
		 
		{
			
			
			return true;
		}
		else
		{
			
			return false;
		}
	}
	
	public boolean checkStockAnalysisByBatchReportAfterSuspendOutwardVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	
	{
		
		click(HomePagesearch);
		Thread.sleep(1500);
		enterText(HomePagesearch, "Stock Analysis by Batch");		
		Thread.sleep(1500);
		HomePagesearch.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		IsVisible(stockAnalysisByBatch1stItem);
		Thread.sleep(1500);
		ClickUsingJs(sl_SelectAllItemsChkBox);
		Thread.sleep(1500);		
		dropDown(sl_DateOptionDropdown,"1");
		Thread.sleep(1500);		
		click(sl_OkBtn);
		Thread.sleep(1500);
		IsVisible(grandTotalTxt);
		Thread.sleep(1500);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, B1, 120.00, 8.33, 1,000.00, "+adding10Days+", "+minus10Days+", , 100.00, ]";
		
		System.out.println("actRow1List   :"+actRow1List);
		System.out.println("expRow1List   :"+expRow1List);
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, B1, 120.00, 8.33, 1,000.00, "+adding12Days+", "+minus9Days+", , 100.00, ]";
		
		System.out.println("actRow2List   :"+actRow2List);
		System.out.println("expRow2List   :"+expRow2List);
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, Grand Total, 240.00, 16.67, 2,000.00, , , , 200.00, ]";	
		
		System.out.println("actRow3List   :"+actRow3List);
		System.out.println("expRow3List   :"+expRow3List);
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List)) 
		{
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean SaveBaseDocumentPOVoucherUsingSaveButton()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		Thread.sleep(3000);ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath="//span[@class='icon-menudots hiconright2']")
	public static WebElement  toggleBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_convert']//label")
	public static WebElement  convertOption;
	
	@FindBy(xpath="//select[@id='id_list_popup_list']")
	public static WebElement  convertOptionDropDown;
	
	@FindBy(xpath="//option[text()='Purchase Vouchers N']")
	public static WebElement  convertpurchaseN;
	
	@FindBy(xpath="//*[@id='id_transactionentry_suspend']")
	private static WebElement  new_Suspend;
	
	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  narration;
	
	@FindBy(xpath="//label[text()='Save As Version']")
	private static WebElement  saveAsVersion;	
	
	
	
	public boolean EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditNarrationAndQty()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		
		enterText(narration, "sanjeev1");
		Thread.sleep(2000);
		
		click(select1stRow_4thColumn);
		Thread.sleep(1500);
		enterText(enter_Quantity, "20");
		tab(enter_Quantity);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
			
		Thread.sleep(1500);		
		
		click(previousBtn);
		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		clearValueFromTextBox(narration);
		Thread.sleep(1000);
		enterText(narration, "sanjeev2");
		Thread.sleep(2000);
		
		click(select1stRow_4thColumn);
		Thread.sleep(1500);
		enterText(enter_Quantity, "30");
		tab(enter_Quantity);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		
		String expMessage3 = "Voucher saved successfully";
		String expMessage4 = ": 1";
		String actMessage2 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage2 + " Value Expected : " + expMessage3 + " " + expMessage4);
		
		Thread.sleep(1500);	
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2) && actMessage2.startsWith(expMessage3)
				&& actMessage2.endsWith(expMessage4)){
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return false;
		}
	}
	
	@FindBy(xpath="(//input[@value='Ok'])[3]")
	private static WebElement  workFlowOkBtn1;
	
	@FindBy(xpath="(//input[@value='Ok'])[4]")
	private static WebElement  workFlowOkBtn2;
	
	
	
	public boolean convertLinkDocumentPurchaseVoucherNFromBaseDoumentEntryPageAndValidateLinkdocumentQty()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {	
		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		IsVisible(toggleBtn);
		Thread.sleep(1000);
		click(toggleBtn);
		Thread.sleep(2000);
		click(convertOption);
		Thread.sleep(2500);
		IsVisible(convertpurchaseN);
		Thread.sleep(2500);
		
		dropDown("Purchase Vouchers N", convertOptionDropDown);
		Thread.sleep(3500);
		
		click(workFlowOkBtn1);
		Thread.sleep(1500);
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);
		
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Dozs, 30.00, PurOrd:1, 15.00, 450.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1800);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1800);
			return false;
		}
	}
	
	@FindBy(xpath = "//a[text()='Pending Purchases Orders']")
	public static WebElement pendingPurchasesOrdersLink;
	
	@FindBy(xpath = "//a[@id='id_transaction_homescreen_convert']")
	public static WebElement VoucherHomePageConvertField;
	
	public boolean saveLinkDocumenturchaseVoucherNFromPendingViewtabAndValidatetheQty() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(1200);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		//click(homePannelOpenBtn);
		Thread.sleep(1520);
		click(pendingPurchasesOrdersLink);
		Thread.sleep(2500);
		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		click(grid_ChkBox1);
		Thread.sleep(1500);
		click(VoucherHomePageConvertField);	
		Thread.sleep(1000);	
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Dozs, 30.00, PurOrd:1, 15.00, 450.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);		
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}


	}
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td")
	public static List<WebElement> workFlowRow1List;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[2]/td")
	public static List<WebElement> workFlowRow2List;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[3]/td")
	public static List<WebElement> workFlowRow3List;
	
	
	
	@FindBy(xpath="//input[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
	public static WebElement linkPopupHeaderCheckbox;
	
	@FindBy(xpath="(//input[@value='Ok'])[3]")
	public static WebElement linkPopupOkBtn;
	
	
	public boolean SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);	
		
		Thread.sleep(1200);
		ClickUsingJs(newBtn);
		Thread.sleep(700);		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt1));
		purchaseAccountTxt1.click();
		purchaseAccountTxt1.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    int row1List1 = workFlowRow1List.size();
		System.err.println(row1List1);
		ArrayList<String> row1SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row1List1; i++) {
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row1SalesList1.add(data);
			}
			
			
			
		}

		String actworkFlowRow1List = row1SalesList1.toString();
		String expworkFlowRow1List = "[1, PurOrd:1, "+getCurrentDateF2()+", STOCK ITEM, 360.0000000000000000]";
		//String expworkFlowRow1List = "[1, SalRet:1, "+getCurrentDateF2()+", STD RATE COGS ITEM, 1000.00]";

		System.out.println("actworkFlowRow1List       :" + actworkFlowRow1List);
		System.out.println("expworkFlowRow1List       :" + expworkFlowRow1List);
		
		Thread.sleep(2000);
		
		click(linkPopupHeaderCheckbox);
		click(linkPopupOkBtn);
		
		
		
		Thread.sleep(3000);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Dozs, 30.0000000000000000, PurOrd:1, 15.00, 450.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1)				
				&& actworkFlowRow1List.equalsIgnoreCase(expworkFlowRow1List))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2000);			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2000);	
			return false;
		}


	}	
	
	
	
	@FindBy(xpath="//li[@id='id_transactionentry_print']")
	public static WebElement  printbtn; 
	
	@FindBy(xpath="(//input[@value='Close'])[2]")
	public static WebElement  printInvoiceClosebtn;
	
	
	
	public boolean SaveBaseDocumentPOVoucherUsingSavePrintBtn()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		Thread.sleep(3000);ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STD RATE COGS ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		Thread.sleep(1500);
		click(printbtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 2";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	   
	   Thread.sleep(2500);
	   
	   click(printInvoiceClosebtn);
	   Thread.sleep(1500);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	public boolean EditBaseDocumentPOVoucher2UsingSaveVersionOptionAndEditNarrationAndRate()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(voucher2Checkbox);
		Thread.sleep(1000);
		
		doubleClick(voucher2Checkbox);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		
		enterText(narration, "sanjeev1");
		Thread.sleep(2000);
		
		click(select1stRow_5thColumn);
		Thread.sleep(1500);
		enterText(enter_Rate, "20");
		tab(enter_Rate);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
			
		Thread.sleep(1500);		
		
		click(previousBtn);
		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		clearValueFromTextBox(narration);
		Thread.sleep(1000);
		enterText(narration, "sanjeev2");
		Thread.sleep(2000);
		
		click(select1stRow_5thColumn);
		Thread.sleep(1500);
		enterText(enter_Rate, "30");
		tab(enter_Rate);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		
		String expMessage3 = "Voucher saved successfully";
		String expMessage4 = ": 2";
		String actMessage2 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage2 + " Value Expected : " + expMessage3 + " " + expMessage4);
		
		Thread.sleep(1500);	
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2) && actMessage2.startsWith(expMessage3)
				&& actMessage2.endsWith(expMessage4)){
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return false;
		}
	}
	
	public boolean convertLinkDocumentPurchaseVoucherNFromBaseDoument2EntryPageAndValidateLinkdocumentQty()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {	
		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(voucher2Checkbox);
		Thread.sleep(1000);
		
		doubleClick(voucher2Checkbox);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		IsVisible(toggleBtn);
		Thread.sleep(1000);
		click(toggleBtn);
		Thread.sleep(2000);
		click(convertOption);
		Thread.sleep(2500);
		IsVisible(convertpurchaseN);
		Thread.sleep(2500);
		
		dropDown("Purchase Vouchers N", convertOptionDropDown);
		Thread.sleep(3500);
		
		click(workFlowOkBtn1);
		Thread.sleep(1500);
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);
		
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, PurOrd:2, 30.00, 300.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}
	}
	
	public boolean saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher2AndValidatetheQty() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		//click(homePannelOpenBtn);
		Thread.sleep(1520);
		click(pendingPurchasesOrdersLink);
		Thread.sleep(2500);
		Thread.sleep(2000);
		IsVisible(voucher2Checkbox);
		Thread.sleep(1000);
		click(voucher2Checkbox);
		Thread.sleep(1500);
		click(VoucherHomePageConvertField);	
		Thread.sleep(1000);	
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STD RATE COGS ITEM, Dozs, 10.00, PurOrd:2, 30.00, 300.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);		
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}


	}
	
	public boolean SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);	
		
		Thread.sleep(1200);
		ClickUsingJs(newBtn);
		Thread.sleep(1000);		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt1));
		purchaseAccountTxt1.click();
		purchaseAccountTxt1.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    int row1List1 = workFlowRow1List.size();
		System.err.println(row1List1);
		ArrayList<String> row1SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row1List1; i++) {
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row1SalesList1.add(data);
			}
			
			
			
		}

		String actworkFlowRow1List = row1SalesList1.toString();
		String expworkFlowRow1List = "[1, PurOrd:1, "+getCurrentDateF2()+", STOCK ITEM, 360.0000000000000000]";		

		System.out.println("actworkFlowRow1List       :" + actworkFlowRow1List);
		System.out.println("expworkFlowRow1List       :" + expworkFlowRow1List);
		
		int row2List2 = workFlowRow2List.size();
		System.err.println(row2List2);
		ArrayList<String> row2SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row2List2; i++) {
			String data = workFlowRow2List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row2SalesList1.add(data);
			}
			
			
			
		}

		String actworkFlowRow2List = row2SalesList1.toString();
		String expworkFlowRow2List = "[2, PurOrd:2, "+getCurrentDateF2()+", STD RATE COGS ITEM, 120.0000000000000000]";		

		System.out.println("actworkFlowRow2List       :" + actworkFlowRow2List);
		System.out.println("expworkFlowRow2List       :" + expworkFlowRow2List);
		
		Thread.sleep(2000);
		
		click(linkPopupHeaderCheckbox);
		click(linkPopupOkBtn);
		
		
		Thread.sleep(3000);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Dozs, 30.0000000000000000, PurOrd:1, 15.00, 450.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			voucherGridBodyListArray1.add(data);
		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, STD RATE COGS ITEM, Dozs, 10.0000000000000000, PurOrd:2, 30.00, 300.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);
		
		Thread.sleep(1500);		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)				
				&& actworkFlowRow1List.equalsIgnoreCase(expworkFlowRow1List) && actworkFlowRow2List.equalsIgnoreCase(expworkFlowRow2List))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}


	}	
	
	public boolean SaveBaseDocumentPOVoucher3UsingControlSOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		
		//Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(2500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STD RATE COGS ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);	
		Thread.sleep(1500);
		
		ClickUsingJs(vendorAccountTxt);
		Thread.sleep(500);
		
		//Thread.sleep(1000);		
		//tab(enter_Gross);	
		
		//Thread.sleep(500);
		
		/* Robot robot = new Robot();
		// press Ctrl+S the Robot's way
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Thread.sleep(1500);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);	*/
		
		
	            Actions actions = new Actions(getDriver());

	          
	            actions.keyDown(Keys.CONTROL) // Press down the Control key
	                   .sendKeys("s")       // Send the 's' key
	                   .keyUp(Keys.CONTROL)   // Release the Control key
	                   .build()             // Build the composite action
	                   .perform();          // Execute the action

	            // Add a delay to observe the effect (optional)
	            Thread.sleep(700);

		
		
		
	
		//Thread.sleep(700);
		
		//new Actions(getDriver()).sendKeys(Keys.chord(Keys.CONTROL, "s")).perform();
		
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 3";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
	   
	   Thread.sleep(2500);
		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	public boolean EditBaseDocumentPOVoucher3UsingSaveVersionOptionAndEditNarrationAndChangeItemName()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(voucher3Checkbox);
		Thread.sleep(1000);
		
		doubleClick(voucher3Checkbox);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		
		enterText(narration, "sanjeev1");
		Thread.sleep(2000);
		
		click(select1stRow_2ndColumn);
		Thread.sleep(1500);
		clearValueFromTextBox(enter_ItemTxt);
		Thread.sleep(1000);		
		enterText(enter_ItemTxt, "STOCK ITEM");
		tab(enter_ItemTxt);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 3";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
			
		Thread.sleep(1500);		
		
		click(previousBtn);
		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		clearValueFromTextBox(narration);
		Thread.sleep(1000);
		enterText(narration, "sanjeev2");
		Thread.sleep(2000);
		
		click(select1stRow_2ndColumn);
		Thread.sleep(1500);
		clearValueFromTextBox(enter_ItemTxt);
		Thread.sleep(1000);		
		enterText(enter_ItemTxt, "BR COGS ITEM");
		tab(enter_ItemTxt);
		Thread.sleep(1500);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		
		String expMessage3 = "Voucher saved successfully";
		String expMessage4 = ": 3";
		String actMessage2 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage2 + " Value Expected : " + expMessage3 + " " + expMessage4);
		
		Thread.sleep(1500);	
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2) && actMessage2.startsWith(expMessage3)
				&& actMessage2.endsWith(expMessage4)){
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return false;
		}
	}
	
	public boolean convertLinkDocumentPurchaseVoucherNFromBaseDoument3EntryPageAndValidateLinkdocument()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {	
		
		Thread.sleep(1000);
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(voucher3Checkbox);
		Thread.sleep(1000);
		
		doubleClick(voucher3Checkbox);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		IsVisible(toggleBtn);
		Thread.sleep(1000);
		click(toggleBtn);
		Thread.sleep(2000);
		click(convertOption);
		Thread.sleep(2500);
		IsVisible(convertpurchaseN);
		Thread.sleep(2500);
		
		dropDown("Purchase Vouchers N", convertOptionDropDown);
		Thread.sleep(3500);
		
		click(workFlowOkBtn1);
		Thread.sleep(1500);
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);
		
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, BR COGS ITEM, Dozs, 10.00, PurOrd:3, 0.00, 0.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher3AndValidateLinkdocument() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(1500);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		//click(homePannelOpenBtn);
		Thread.sleep(1520);
		click(pendingPurchasesOrdersLink);
		Thread.sleep(2500);
		Thread.sleep(2000);
		IsVisible(voucher3Checkbox);
		Thread.sleep(1000);
		click(voucher3Checkbox);
		Thread.sleep(1500);
		click(VoucherHomePageConvertField);	
		Thread.sleep(1000);	
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(2500);		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, BR COGS ITEM, Dozs, 10.00, PurOrd:3, 0.00, 0.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);		
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}


	}
	
	
			
			@FindBy(xpath="(//td[text()='PurOrd:3'])[2]//..//input")
			public static WebElement  linkPoupUpVoucher3checkBox;
	
	public boolean SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher3() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException
	{
		Thread.sleep(1500);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);	
		
		Thread.sleep(1200);
		ClickUsingJs(newBtn);
		Thread.sleep(700);		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxt1));
		purchaseAccountTxt1.click();
		purchaseAccountTxt1.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    int row1List1 = workFlowRow1List.size();
		System.err.println(row1List1);
		ArrayList<String> row1SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row1List1; i++) {
			String data = workFlowRow1List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row1SalesList1.add(data);
			}
			
			
			
		}

		String actworkFlowRow1List = row1SalesList1.toString();
		String expworkFlowRow1List = "[1, PurOrd:1, "+getCurrentDateF2()+", STOCK ITEM, 360.0000000000000000]";		

		System.out.println("actworkFlowRow1List       :" + actworkFlowRow1List);
		System.out.println("expworkFlowRow1List       :" + expworkFlowRow1List);
		
		int row2List2 = workFlowRow2List.size();
		System.err.println(row2List2);
		ArrayList<String> row2SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row2List2; i++) {
			String data = workFlowRow2List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row2SalesList1.add(data);
			}
			
		}

		String actworkFlowRow2List = row2SalesList1.toString();
		String expworkFlowRow2List = "[2, PurOrd:2, "+getCurrentDateF2()+", STD RATE COGS ITEM, 120.0000000000000000]";		

		System.out.println("actworkFlowRow2List       :" + actworkFlowRow2List);
		System.out.println("expworkFlowRow2List       :" + expworkFlowRow2List);
		
		Thread.sleep(2000);
		
		int row3List2 = workFlowRow3List.size();
		System.err.println(row3List2);
		ArrayList<String> row3SalesList1 = new ArrayList<String>();
		for (int i = 0; i < row3List2; i++) {
			String data = workFlowRow3List.get(i).getText();
			
			if(data.isEmpty()==false)
			{
				row3SalesList1.add(data);
			}
			
		}

		String actworkFlowRow3List = row3SalesList1.toString();
		String expworkFlowRow3List = "[3, PurOrd:3, "+getCurrentDateF2()+", BR COGS ITEM, 120.0000000000000000]";		

		System.out.println("actworkFlowRow3List       :" + actworkFlowRow3List);
		System.out.println("expworkFlowRow3List       :" + expworkFlowRow3List);
		
		click(linkPoupUpVoucher3checkBox);
		click(linkPopupOkBtn);
		
		
		Thread.sleep(3000);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, BR COGS ITEM, Dozs, 10.0000000000000000, PurOrd:3, 0.00, 0.00, 0.00]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		
		
		Thread.sleep(1500);		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1)				
				&& actworkFlowRow1List.equalsIgnoreCase(expworkFlowRow1List) && actworkFlowRow2List.equalsIgnoreCase(expworkFlowRow2List)
				&& actworkFlowRow3List.equalsIgnoreCase(expworkFlowRow3List))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}


	}
	
	public boolean checkEraseAllTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ClickUsingJs(homeMenu);
		ClickUsingJs(dataMangementMenu);
		ClickUsingJs(eraseAll);		
		Thread.sleep(2000);
		ClickUsingJs(eraseTranscationsRadio);
		ClickUsingJs(eraseAllOkBtn);	
	
		if(getIsAlertPresent())
		{
			getWaitForAlert();
			
			getAlert().accept();
		}
		
		String expValidationMsg="Data deleted successfully.";
		
		String actValidationMsg=checkValidationMessage(expValidationMsg);
		
		System.out.println("************************************* checkEraseAllTransactions  *********************************");
		System.out.println("Message  :  "+actValidationMsg +" Value Expected : "+expValidationMsg);
		
		if (actValidationMsg.equalsIgnoreCase(expValidationMsg))
		{
			System.out.println("Voucher Saved");
			//excelReader.setCellData(xlfile, "Sheet6", 262, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Voucher Not Saved");
			//excelReader.setCellData(xlfile, "Sheet6", 262, 9, resFail);
			return false;
		}
	}
	
	public boolean SaveBaseDocumentPOVoucherUsingSaveVersionOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		Thread.sleep(2500);
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		Thread.sleep(3000);ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(2500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='id_header_4']")
	public static WebElement  purchasesVoucherN_VendorAccTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435470']")
	private static WebElement  placeOfSupply;
	
	public boolean SaveLinkDocumentPurchasesVoucherVatForSaveVersionOption()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);	
		
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		ClickUsingJs(newBtn);		
		Thread.sleep(1000);		
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");		
		purchasesVoucherN_VendorAccTxt.sendKeys(Keys.CONTROL + "l");
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkPopupHeaderCheckbox));
		boolean actworkFlowHeaderChkBoxCL = linkPopupHeaderCheckbox.isDisplayed();
		boolean expworkFlowHeaderChkBoxCL = true;

		System.err.println("linkPopupHeaderCheckbox : " + actworkFlowHeaderChkBoxCL + "  " + expworkFlowHeaderChkBoxCL);
	
		
		click(linkPopupHeaderCheckbox);
		Thread.sleep(1500);
		
		click(linkPopupOkBtn);
		Thread.sleep(3000);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, HYDERABAD, STOCK ITEM, , , Dozs, 0, 0.00, 0.00, 10.0000000000000000, PurOrd:1, 15.00, 150.00, 0.00, 0.00, 150.00, , , , , , ]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);
		
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1000);
		
		enterText(placeOfSupply, "Abu Dhabi");
		Thread.sleep(1500);
		tab(placeOfSupply);
		
		Thread.sleep(1520);
		
		
		click(select1stRow_3rdColumn);
		Thread.sleep(1500);
		
		click(select1stRow_4thColumn);
		Thread.sleep(1500);
		
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);
		
		Thread.sleep(1520);
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		Thread.sleep(1500);		
		
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && actMessage1.startsWith(expMessage1)
				&& actMessage1.endsWith(expMessage2))
		{	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return false;
		}
	}
	
	public boolean EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditRate()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		
		enterText(narration, "sanjeev1");
		Thread.sleep(2000);
		
		click(select1stRow_5thColumn);
		Thread.sleep(1500);
		enterText(enter_Rate, "20");
		tab(enter_Rate);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);		
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
			
		Thread.sleep(1500);		
		
		click(previousBtn);
		Thread.sleep(1000);
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		clearValueFromTextBox(narration);
		Thread.sleep(1000);
		enterText(narration, "sanjeev2");
		Thread.sleep(2000);
		
		click(select1stRow_5thColumn);
		Thread.sleep(1500);
		enterText(enter_Rate, "30");
		tab(enter_Rate);
		Thread.sleep(1500);
		click(toggleBtn);
		Thread.sleep(1500);
		IsVisible(saveAsVersion);
		
		
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(700);			
		
		String expMessage3 = "Voucher saved successfully";
		String expMessage4 = ": 1";
		String actMessage2 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage2 + " Value Expected : " + expMessage3 + " " + expMessage4);
		
		Thread.sleep(1500);	
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2) && actMessage2.startsWith(expMessage3)
				&& actMessage2.endsWith(expMessage4)){
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			
			
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			
			return false;
		}
	}
	
	@FindBy(xpath="//a[text()='Pending Purchases Orders']")
	private static WebElement  pendingPurchaseOrderView;
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']")
	public static WebElement  voucherBodyGrid;
	
	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']")
	public static WebElement workFlowTableBody;
	
	@FindBy(xpath="//a[text()='Pending Auto Sales Order']")
	private static WebElement  pendingAutosalesOrderView;
	
	public boolean checkValidatingLinkdocumentPurchasevoucherNHasPendingLinks()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		
		//click(homePageVoucherArrowBtn);
		Thread.sleep(3500);
		
		
		IsVisible(pendingPurchasesOrdersLink);
		Thread.sleep(1500);
		ClickUsingJs(pendingPurchasesOrdersLink);
		Thread.sleep(4500);	
		
		
		String VoucherBodyTxt = voucherBodyGrid.getText();
		//boolean actVoucherBody=voucherBodyGrid.getText().isEmpty();
		boolean expVoucherBody=true;
		
		boolean actVoucherBody = false;
		System.err.println("*"+VoucherBodyTxt+"*");
		
		if (voucherBodyGrid.getText().isEmpty() || VoucherBodyTxt.equalsIgnoreCase("") || VoucherBodyTxt.equalsIgnoreCase(" ")) {
			
			 actVoucherBody=true;
			
		}
		
		System.out.println("VoucherBody : "+actVoucherBody+" Value Expected : "+expVoucherBody);
		Thread.sleep(2000);
		
		Thread.sleep(2500);
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(5000);
		
		boolean exppurchaseVoucherWorlFlowText=false;
		
		boolean actpurchaseVoucherWorlFlowText=false;
		
		try
		
		{
			if(workFlowTableBody.isDisplayed())
			{
				actpurchaseVoucherWorlFlowText = true;
				
				System.err.println("**"+workFlowTableBody.getText()+"**");
			}	
			
		}
			catch (Exception e) 
			{
				//System.err.println(workFlowTableBody.getText());
				System.out.println("Pending link is not displyd");
			}
						
		
		
		System.out.println("actpurchaseVoucherWorlFlowText   :"+actpurchaseVoucherWorlFlowText);
		System.out.println("exppurchaseVoucherWorlFlowText   :"+exppurchaseVoucherWorlFlowText);	
		
		
		
		if (actpurchaseVoucherWorlFlowText==exppurchaseVoucherWorlFlowText &&
				actVoucherBody==expVoucherBody){
			
			click(new_CloseBtn);
			
			return true;
		} else {
			
			click(new_CloseBtn);
			
			return false;
		}
	}
	
	public boolean checkValidatingLinkdocumentPurchasevoucherVatHasPendingLinks()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);	
		
		Thread.sleep(2500);
		
		IsVisible(pendingPurchaseOrderView);
		Thread.sleep(1500);
		
		
		ClickUsingJs(pendingPurchaseOrderView);
		Thread.sleep(4500);	
		
		
		String VoucherBodyTxt = voucherBodyGrid.getText();
		//boolean actVoucherBody=voucherBodyGrid.getText().isEmpty();
		boolean expVoucherBody=true;
		
		boolean actVoucherBody = false;
		System.err.println("*"+VoucherBodyTxt+"*");
		
		if (voucherBodyGrid.getText().isEmpty() || VoucherBodyTxt.equalsIgnoreCase("") || VoucherBodyTxt.equalsIgnoreCase(" ")) {
			
			 actVoucherBody=true;
			
		}
		
		System.out.println("VoucherBody : "+actVoucherBody+" Value Expected : "+expVoucherBody);
		Thread.sleep(2000);
		
		Thread.sleep(2500);
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(5000);
		
		boolean exppurchaseVoucherWorlFlowText=false;
		
		boolean actpurchaseVoucherWorlFlowText=false;
		
		try
		
		{
			if(workFlowTableBody.isDisplayed())
			{
				actpurchaseVoucherWorlFlowText = true;
				
				System.err.println("**"+workFlowTableBody.getText()+"**");
			}	
			
		}
			catch (Exception e) 
			{
				//System.err.println(workFlowTableBody.getText());
				System.out.println("Pending link is not displyd");
			}
						
		
		
		System.out.println("actpurchaseVoucherWorlFlowText   :"+actpurchaseVoucherWorlFlowText);
		System.out.println("exppurchaseVoucherWorlFlowText   :"+exppurchaseVoucherWorlFlowText);
		
		
		
		if (actpurchaseVoucherWorlFlowText==exppurchaseVoucherWorlFlowText 
				&& actVoucherBody==expVoucherBody)
		{	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return false;
		}
	}
	
	public boolean saveNewMrnVoucherForSaveVersionOprtion()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);		

		Thread.sleep(3000);
		
		ClickUsingJs(newMrn);
		
		Thread.sleep(2000);	
		
		ClickUsingJs(newBtn);		
		Thread.sleep(500);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		
		enterText(purchasesVoucherN_VendorAccTxt, "Vendor A");
		Thread.sleep(1500);
		tab(purchasesVoucherN_VendorAccTxt);
		Thread.sleep(1500);
		
		enterText(wareHouseTxt, "HYDERABAD"); 
		Thread.sleep(1500);
		tab(wareHouseTxt);
		Thread.sleep(1500);
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1500);
		
		
		click(select1stRow_1stColumn);	
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "STOCK ITEM");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1000);
		
		tab(enter_UnitTxt);	
		Thread.sleep(1000);
		
		click(select1stRow_4thColumn);
		
		//click(enter_Quantity);
		enterText(enter_Quantity, "10");		
		Thread.sleep(2000);
		tab(enter_Quantity);
		
		Thread.sleep(1500);
		
		enterText(enter_Rate, "10");		
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(1000);	
		
		tab(enter_Gross);
		Thread.sleep(1000);		
		
		click(vouchersaveBtn);	

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";
		String actMessage = checkValidationMessage(expMessage1);

		System.out.println(
				"********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean SaveLinkDocumentNewPvVouchertForSaveVersionOptionAndGiveRateAs20()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(newPV);	
		
		Thread.sleep(2500);		
		ClickUsingJs(newBtn);		
		Thread.sleep(1000);		
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");		
		purchasesVoucherN_VendorAccTxt.sendKeys(Keys.CONTROL + "l");
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkPopupHeaderCheckbox));
		boolean actworkFlowHeaderChkBoxCL = linkPopupHeaderCheckbox.isDisplayed();
		boolean expworkFlowHeaderChkBoxCL = true;

		System.err.println("linkPopupHeaderCheckbox : " + actworkFlowHeaderChkBoxCL + "  " + expworkFlowHeaderChkBoxCL);
	
		
		click(linkPopupHeaderCheckbox);
		Thread.sleep(1500);
		
		click(linkPopupOkBtn);
		Thread.sleep(3000);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Dozs, 0, 10.0000000000000000, NDT67:1, 10.00, 100.00, 0.00, , , , , , ]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		Thread.sleep(1500);
		
		ClickUsingJs(purchaseAccountTxt1);
		Thread.sleep(1500);
		
		enterText(purchaseAccountTxt1, "Purchase");
		Thread.sleep(1500);
		tab(purchaseAccountTxt1);
		Thread.sleep(1500);
		
		ClickUsingJs(select1stRow_6thColumn);
		Thread.sleep(2500);
		
		enterText(enter_Rate, "20");
		Thread.sleep(1500);
		tab(enter_Rate);
		Thread.sleep(1500);	
		
		Thread.sleep(1500);
		ClickUsingJs(select1stRow_14thColumn);
		Thread.sleep(1200);
		
		dropDown("gmail", numberListDropDown);
		Thread.sleep(1500);
	
		click(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		Thread.sleep(1500);		
		
		
		
		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && actMessage1.startsWith(expMessage1)
				&& actMessage1.endsWith(expMessage2))
		{	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	public static WebElement  select1stRow_5thColumnRate;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	public static WebElement  select1stRow_7thColumnRate;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	public static WebElement  select1stRow_8thColumnGross;
	
	public boolean CheckMrnDocumentRateShouldDisply20AsPerPVRate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);		

		Thread.sleep(2000);
		ClickUsingJs(newMrn);
		Thread.sleep(1500);
		
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		String actRate =select1stRow_5thColumnRate.getText();
		String expRate ="20.00";
		
		System.out.println("actRate   :"+actRate);
		System.out.println("expRate   :"+expRate);
		

		if (actRate.equalsIgnoreCase(expRate)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean editNewPVVoucherGiveRateas50AndSaveUsingSaveVersionOprtion()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(newPV);
		Thread.sleep(2000);	
	
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		
		click(select1stRow_6thColumn);	
		enterText(enter_Rate, "50");		
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(1000);	
		
		tab(enter_Gross);
		Thread.sleep(1000);	
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(saveAsVersion);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(1000);
		getAlert().accept();
		Thread.sleep(1000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";
		String actMessage = checkValidationMessage(expMessage1);

		System.out.println(
				"********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean CheckMrnDocumentRateShouldDisply50AsPerPVRate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		Thread.sleep(2000);
		ClickUsingJs(newMrn);
		Thread.sleep(1500);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		String actRate =select1stRow_5thColumnRate.getText();
		String expRate ="50.00";
		
		System.out.println("actRate   :"+actRate);
		System.out.println("expRate   :"+expRate);
		

		if (actRate.equalsIgnoreCase(expRate)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			return false;
		}
	}
	
	public boolean checkSavingOpeningStockVoucher1ForTransactionGrossScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStocksMenu);
		click(openingStocksVoucher);		
		Thread.sleep(2500);		
		ClickUsingJs(newBtn);
		Thread.sleep(1000);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		
		click(select1stRow_1stColumn);	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxt));
		warehouseTxt.click();
		warehouseTxt.sendKeys("HYDERABAD");
		Thread.sleep(2000);
		warehouseTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STOCK ITEM");
		Thread.sleep(2000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "Pcs");
		Thread.sleep(1500);
		tab(enter_UnitTxt);
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.sendKeys("1");
		enter_Quantity.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println(
				"********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) 
		{
			return true;
		} else {
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='140']")
	public static WebElement  inventoryTransactionsSalesMenu; 
	
	@FindBy(xpath="//*[@id='2051']/span")
	public static WebElement  autoSalesOrdersVoucher;
	
	public boolean checkSavingAutoSalesOrderVoucher1ForTransactionGrossScenario() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoSalesOrdersVoucher));
		autoSalesOrdersVoucher.click();

		Thread.sleep(4500);

		
		ClickUsingJs(newBtn);

		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		enterText(customerAccountTxt, "Customer A");
		Thread.sleep(1500);
		tab(customerAccountTxt);
		Thread.sleep(1200);
		
		enterText(wareHouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(wareHouseTxt);
		Thread.sleep(1200);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		Thread.sleep(1000);
		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);
		Thread.sleep(1200);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
		enter_UnitTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		Thread.sleep(1000);
		enterText(enter_Quantity, "1");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(1500);
		enterText(enter_Rate, "7500");
		Thread.sleep(1200);
		tab(enter_Rate);
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();	
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))

		{
			
			
			return true;
		}
		else
		{
			
			return false;
		}
	}
	
	@FindBy(xpath = "//a[@id='2015']")
	public static WebElement salesInvoiceVoucher;
	
	@FindBy(xpath = "//a[@id='2052']")
	public static WebElement autoSalesInvoiceVoucher;
	
	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement customerAccounttxt;
	
	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement salesAccounttxt;
	
	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement salesDepartmenttxt;
	
	public boolean checkAutoSavingSalesInvoiceVoucher1ForTransactionGrossScenario()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(autoSalesInvoiceVoucher);
		Thread.sleep(1200);
		click(newBtn);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2000);
		
		enterText(salesAccounttxt, "Sales - Computers");
		Thread.sleep(1500);
		tab(salesAccounttxt);
		Thread.sleep(2000);
		
		
		enterText(customerAccounttxt, "Customer A");
		Thread.sleep(2000);
		click(customerAccounttxt);
		Thread.sleep(1500);
		
		click(wareHouseTxt);
		enterText(wareHouseTxt, "HYDERABAD");
		Thread.sleep(2000);
		tab(wareHouseTxt);
			
		
		enterText(salesDepartmenttxt, "DUBAI");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		Thread.sleep(3000);	
		
	
		Thread.sleep(3000);		
		click(select1stRow_1stColumn);
		
		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);
		click(select1stRow_4thColumn);
		enterText(enter_Quantity, "1");
		Thread.sleep(1000);
		Thread.sleep(2000);
		click(select1stRow_7thColumn);
		Thread.sleep(1200);
		enterText(enter_Rate, "3500");
		Thread.sleep(1000);
		tab(enter_Rate);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vouchersaveBtn));
		vouchersaveBtn.click();	
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
		{
    		
    		return true;
    	}
    		else{
    			
    			return false;
    		}
    		
    	}
	
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[10]")
	public static WebElement  linkPopupTransactionGross;
	
	public boolean checkValidatingLinkdocumentAutoSalesInvoiceRateAndGrossValues()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(autoSalesInvoiceVoucher);
		
		
		Thread.sleep(2500);
		
		
		click(pendingAutosalesOrderView);
		Thread.sleep(4500);	
		
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		String actRate =select1stRow_7thColumnRate.getText();
		String expRate ="7,500.00";
		
		System.out.println("actRate   :"+actRate);
		System.out.println("expRate   :"+expRate);
		
		String actGross =select1stRow_8thColumnGross.getText();
		String expGross ="7,500.00";
		
		System.out.println("actGross   :"+actGross);
		System.out.println("expGross   :"+expGross);
		
		Thread.sleep(2500);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1500);
		ClickUsingJs(contentChangeAlertMsg);
		Thread.sleep(2500);
		
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccounttxt));
		//salesAccounttxt.click();
		salesAccounttxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(2500);
		
		String actLinkPopupGrossVlaue =linkPopupTransactionGross.getText();
		String expLinkPopupGrossVlaue  ="7500.00";
		Thread.sleep(2000);
		
		System.out.println("actLinkPopupGrossVlaue  :"+actLinkPopupGrossVlaue);
		System.out.println("expLinkPopupGrossVlaue  :"+expLinkPopupGrossVlaue);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkPopupHeaderCheckbox));
		boolean actworkFlowHeaderChkBoxCL = linkPopupHeaderCheckbox.isDisplayed();
		boolean expworkFlowHeaderChkBoxCL = true;

		System.err.println("linkPopupHeaderCheckbox : " + actworkFlowHeaderChkBoxCL + "  " + expworkFlowHeaderChkBoxCL);
	
		
		click(linkPopupHeaderCheckbox);
		Thread.sleep(1500);
		
		click(linkPopupOkBtn);
		Thread.sleep(4500);
		
		
		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			voucherGridBodyListArray.add(data);
		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, STOCK ITEM, Pcs, 0, 1.00, NDT46:1, 0.0000000000000000, 7,500.00, 7,500.00, 0.00, , , , ]";
		
		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);
		
		
		if (actRate.equalsIgnoreCase(expRate) && actGross.equalsIgnoreCase(expGross)
				&& actLinkPopupGrossVlaue.equalsIgnoreCase(expLinkPopupGrossVlaue)
				&& actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1))
		{	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(2500);
			return false;
		}
	}
	
	@FindBy (xpath="//*[@id='1']/span")
	public static WebElement homeMenu;

	//Masters Menu	
	@FindBy (xpath="//*[@id='1000']")
	public static WebElement mastersMenu;

	//Accounts 
	@FindBy (xpath="//*[@id='1104']")
	public static WebElement accounts;


	//Master Main Header Fields		
	@FindBy(xpath="//a[@id='btnNew']/i")
	public static WebElement masterNewBtn;

	@FindBy(xpath="//*[@id='sName']")
	public static WebElement nameTxt;

	//AccountType	
	@FindBy(xpath="//select[@id='iAccountType']")
	public static WebElement accountTypeDropdown;

	@FindBy(xpath="//*[@id='sCode']")
	public static WebElement codeTxt; 

	@FindBy(xpath="(//*[@id='btnMasterSaveClick'])[1]")
	public static WebElement saveBtn;

	@FindBy(xpath="(//i[@class='icon-close hiconright2'])[1]")
	public static WebElement masterCloseBtn;
	
	@FindBy(xpath="//input[@id='txtsrch-term']")
	public static WebElement searchAccount;
	
	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	public static WebElement searchAccountMain;
	
	@FindBy(xpath="//i[@class='icon-properties hiconright2']")
	public static WebElement accountProperties;
	
	@FindBy(xpath="//h5[text()='Account Properties']")
	public static WebElement accountProperties1;
	
	@FindBy(xpath="//select[@id='ddlStatus']")
	public static WebElement accountPropertiesAccountStatus;
	
	@FindBy(xpath="//input[@id='btnPropOk']")
	public static WebElement accountPropOkBtn;
	
	
	public boolean CheckInActiveCustomerAccountInAccountMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		ClickUsingJs(homeMenu);
		Thread.sleep(1500);
		ClickUsingJs(mastersMenu);
		Thread.sleep(1500);
		ClickUsingJs(accounts);
		Thread.sleep(1500);	
		ClickUsingJs(searchAccountMain);
		Thread.sleep(1500);
		enterText(searchAccountMain, "Customer A");
		Thread.sleep(1500);
		tab(searchAccountMain);
		Thread.sleep(2000);		
		ClickUsingJs(accountProperties);
		Thread.sleep(2000);
		IsVisible(accountProperties1);
		Thread.sleep(1500);
		
		dropDown("In Active", accountPropertiesAccountStatus);
		Thread.sleep(1500);
		ClickUsingJs(accountPropOkBtn);
		
		String expMsg="Saved Successfully";
		String actMsg=checkValidationMessage(expMsg);
		Thread.sleep(1200);
		System.out.println("actMsg   :"+actMsg);
		System.out.println("expMsg   :"+expMsg);
		
		if(actMsg.equalsIgnoreCase(expMsg)) 
		{
			return true;
		}
		else {
			
			return false;
	
		}
	}
	
	public boolean checkValidatingLinkdocumentAutoSalesInvoiceAfterInActiveAccount()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(autoSalesInvoiceVoucher);	
		
		Thread.sleep(2500);
		IsVisible(pendingAutosalesOrderView);
		Thread.sleep(1000);
		
		click(pendingAutosalesOrderView);
		Thread.sleep(4500);	
		
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(1000);	
		
		String expMsg ="Account is inactive.";	
		String actMsg =checkValidationMessage(expMsg);
		
		Thread.sleep(1500);
		System.out.println("actMsg   :"+actMsg);
		System.out.println("expMsg   :"+expMsg);
		
		Thread.sleep(2500);
		
	
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1500);
		
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccounttxt));
		salesAccounttxt.click();
		salesAccounttxt.sendKeys(Keys.CONTROL + "l");

		
		click(linkPopupHeaderCheckbox);
		Thread.sleep(1500);
		
		click(linkPopupOkBtn);
		Thread.sleep(4500);
		
		String expMsg1 ="Account is inactive.";	
		String actMsg1 =checkValidationMessage(expMsg1);
		
		Thread.sleep(1500);
		System.out.println("actMsg1   :"+actMsg1);
		System.out.println("expMsg1   :"+expMsg1);
		
		Thread.sleep(1500);		
		
		
		if (actMsg.equalsIgnoreCase(expMsg) && actMsg1.equalsIgnoreCase(expMsg1))
		{	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			
			return false;
		}
	}
	
	
	
	@FindBy (xpath="//td[@title='Customer A']//..//input")
	public static WebElement customerACheckBox;
	
	public boolean CheckActiveCustomerAccountInAccountMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		click(homeMenu);
		Thread.sleep(1500);
		click(mastersMenu);
		Thread.sleep(1500);
		click(accounts);
		Thread.sleep(1500);	
		click(searchAccountMain);
		Thread.sleep(1500);
		enterText(searchAccountMain, "Customer B");
		Thread.sleep(1500);
		tab(searchAccountMain);
		Thread.sleep(2000);	
		ClickUsingJs(customerACheckBox);
		Thread.sleep(1500);	
		
		click(accountProperties);
		Thread.sleep(2000);
		//IsVisible(accountProperties1);
		Thread.sleep(1500);
		
		dropDown("Active", accountPropertiesAccountStatus);
		Thread.sleep(1500);
		ClickUsingJs(accountPropOkBtn);
		
		String expMsg="Saved Successfully";
		String actMsg=checkValidationMessage(expMsg);
		Thread.sleep(1200);
		System.out.println("actMsg   :"+actMsg);
		System.out.println("expMsg   :"+expMsg);
		
		if(actMsg.equalsIgnoreCase(expMsg)) 
		{
			return true;
		}
		else {
			
			return false;
	
		}
	}
	
	//Scenario:1  In Link popup screen Zero quantities showing
	
	public boolean SaveBaseDocumentPOVoucherWith2Rows()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		
		click(select2ndRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "STD RATE COGS ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	
	public boolean SaveLinkdocumentUsingCopyClipBoardOptionAndWithoutLinks() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);
		
		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		ClickUsingJs(toggleBtn);
		Thread.sleep(1200);
		IsVisible(copyToclipBoard);
		Thread.sleep(1000);
		ClickUsingJs(copyToclipBoard);
		Thread.sleep(2500);
		
		
		Thread.sleep(1200);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		
		ClickUsingJs(newBtn);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2500);
		
		Thread.sleep(1500);
		ClickUsingJs(toggleBtn);
		Thread.sleep(1200);
		IsVisible(pasteFromClipBoard);
		Thread.sleep(1000);
		ClickUsingJs(pasteFromClipBoard);
		Thread.sleep(500);
		
		checkValidationMessage("Paste from clipboard completed successfully");
		Thread.sleep(2500);
		
		ClickUsingJs(purchaseAccountTxt1);
		Thread.sleep(1000);
		enterText(purchaseAccountTxt1, "Purchase");
		Thread.sleep(2000);
		tab(purchaseAccountTxt1);
		Thread.sleep(1500);
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(2000);
		tab(departmentTxt);
		Thread.sleep(1500);
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return false;
		}


	}
	
	//*[@id='id_transactionentry_workflow_popup_heading']
	
	
			
	@FindBy(xpath="(//td[text()='STD RATE COGS ITEM'])[2]//..//input")
	public static WebElement  linkPopup1stRadioButton;
	
	@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_heading']//../span/i")
	public static WebElement  linkPopupCloseBtn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[2]//td")
	public static List<WebElement>  linkPopupRow1List;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]//td")
	public static List<WebElement>  linkPopupRow1List1;
	
	//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']//tr [not(contains(@data-deleted,'true'))]")
	public static List<WebElement>  linkPopupRowList;
	
	
	
	public boolean editLinkdocumentInFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
			
		Thread.sleep(1200);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		ClickUsingJs(select1stRow_3rdColumn);
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(1200);
		
		IsVisible(linkPopupHeading);
		Thread.sleep(1500);
		
		click(linkPopupOkBtn);
		Thread.sleep(2500);
		
		String actQty =select1stRow_3rdColumn.getText();
		String expQty ="10.0000000000000000";
		Thread.sleep(1500);
		System.out.println("actQty  :"+actQty);
		System.out.println("expQty  :"+expQty);
		
		ClickUsingJs(select2ndRow_3rdColumn);
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(1200);	

		IsVisible(linkPopupHeading);
		Thread.sleep(1500);
		
		boolean actRadibutton  =linkPopup1stRadioButton.isSelected();		
		boolean expRadibutton  =true;
		Thread.sleep(1500);
		
		System.out.println("actRadibutton  :"+actRadibutton);
		System.out.println("expRadibutton  :"+expRadibutton);
		
		Thread.sleep(1500);
		
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(1500);
		
		ClickUsingJs(select3rdRow_1stColumn);
		Thread.sleep(1500);
		
		purchaseAccountTxt1.sendKeys(Keys.CONTROL + "l");
		
		Thread.sleep(2500);
		
		int voucherLinkPopupListCount = linkPopupRow1List.size();

		ArrayList<String> voucherLinkPopupListArray = new ArrayList<String>();

		for (int i = 0; i < voucherLinkPopupListCount; i++) {
			String data = linkPopupRow1List.get(i).getText();
			if(data.isEmpty()==false) {
			voucherLinkPopupListArray.add(data);
			}
		}

		String actvoucherLinkPopupListRow1 = voucherLinkPopupListArray.toString();

		String expvoucherLinkPopupListRow1 = "[2, PurOrd:1, "+getCurrentDateF2()+", STD RATE COGS ITEM, 120.0000000000000000]";
		
		System.out.println(actvoucherLinkPopupListRow1);
		System.out.println(expvoucherLinkPopupListRow1);
		
		Thread.sleep(2500);
		
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(2500);
		
		
		
		if (actQty.equalsIgnoreCase(expQty) && actvoucherLinkPopupListRow1.equalsIgnoreCase(expvoucherLinkPopupListRow1)
				&& actRadibutton==expRadibutton)
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			ClickUsingJs(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			ClickUsingJs(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return false;
		
		}
		
	}
	
	public boolean editBaseDocumentPOVoucher1WithDifferentQty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		ClickUsingJs(inventoryMenu);	
		ClickUsingJs(inventoryTransactionsMenu);
		ClickUsingJs(inventoryTransactionsPurchasesMenu);
		ClickUsingJs(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		ClickUsingJs(select2ndRow_4thColumn);
		Thread.sleep(1500);
		enterText(enter_Quantity, "20");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(1200);	
		
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	public boolean SaveLinkdocument2UsingCopyClipBoardOptionAndWithoutLinksAndqtyAs10In2Rows() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);
		
		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);
		ClickUsingJs(toggleBtn);
		Thread.sleep(1200);
		IsVisible(copyToclipBoard);
		Thread.sleep(1000);
		ClickUsingJs(copyToclipBoard);
		Thread.sleep(2500);
		
		
		Thread.sleep(1200);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		
		ClickUsingJs(newBtn);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(2500);
		
		Thread.sleep(1500);
		ClickUsingJs(toggleBtn);
		Thread.sleep(1200);
		IsVisible(pasteFromClipBoard);
		Thread.sleep(1000);
		ClickUsingJs(pasteFromClipBoard);
		Thread.sleep(500);
		
		checkValidationMessage("Paste from clipboard completed successfully");
		Thread.sleep(2500);
		
		ClickUsingJs(purchaseAccountTxt1);
		Thread.sleep(1000);
		enterText(purchaseAccountTxt1, "Purchase");
		Thread.sleep(2000);
		tab(purchaseAccountTxt1);
		Thread.sleep(1500);
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(2000);
		tab(departmentTxt);
		Thread.sleep(1500);
		
		ClickUsingJs(select2ndRow_3rdColumn);
		Thread.sleep(1200);
		enterText(enter_Quantity, "10");
		Thread.sleep(1200);
		//tab(enter_Quantity);
		Thread.sleep(1500);
		
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2))
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			
			return false;
		}


	}
	
	public boolean editLinkdocument2InFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
			
		Thread.sleep(1200);
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVoucherNew);		
		Thread.sleep(1500);	
		
		IsVisible(voucher2Checkbox);
		Thread.sleep(1000);
		
		doubleClick(voucher2Checkbox);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(2500);
		
		ClickUsingJs(select1stRow_3rdColumn);
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(1200);
		
		IsVisible(linkPopupHeading);
		Thread.sleep(2500);
		
		 Actions actions = new Actions(getDriver());
		 
		 actions.sendKeys(Keys.ENTER).build().perform();

          
        /*actions.keyDown(Keys.ENTER) // Press down the Control key
                  // Send the 's' key
                 .keyUp(Keys.ENTER)   // Release the Control key
                 .build()             // Build the composite action
                 .perform();          // Execute the action

          // Add a delay to observe the effect (optional)     */
        
        
          Thread.sleep(2500);
          
        ClickUsingJs(select2ndRow_3rdColumn);
  		Thread.sleep(1500);
  		tab(enter_Quantity);
  		Thread.sleep(1200);	

  		IsVisible(linkPopupHeading);
  		Thread.sleep(1500);
		
		
  		actions.sendKeys(Keys.ENTER).build().perform();
  		
        /*  actions.keyDown(Keys.ENTER) // Press down the Control key
          // Send the 's' key
         .keyUp(Keys.ENTER)   // Release the Control key
         .build()             // Build the composite action
         .perform();          // Execute the action   */

  
          Thread.sleep(2500);
		
		
		
		
		ClickUsingJs(select3rdRow_1stColumn);
		Thread.sleep(1500);
		
		purchaseAccountTxt1.sendKeys(Keys.CONTROL + "l");
		
		Thread.sleep(2500);
		
		int actLinkPopupRowCount =linkPopupRowList.size();
		int expLinkPopupRowCount =1;
		
		Thread.sleep(1500);
		System.out.println("actLinkPopupRowCount  :"+actLinkPopupRowCount);
		System.out.println("expLinkPopupRowCount  :"+expLinkPopupRowCount);
		
		int voucherLinkPopupListCount = linkPopupRow1List.size();

		ArrayList<String> voucherLinkPopupListArray = new ArrayList<String>();

		for (int i = 0; i < voucherLinkPopupListCount; i++) {
			String data = linkPopupRow1List.get(i).getText();
			
			if(data.isEmpty()==false) {
				voucherLinkPopupListArray.add(data);
				}
		}

		String actvoucherLinkPopupListRow1 = voucherLinkPopupListArray.toString();

		String expvoucherLinkPopupListRow1 = "[2, PurOrd:1, "+getCurrentDateF2()+", STD RATE COGS ITEM, 120.0000000000000000]";
		
		System.out.println(actvoucherLinkPopupListRow1);
		System.out.println(expvoucherLinkPopupListRow1);
		
		Thread.sleep(2500);
		
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(2500);
		
		
		
		if (actvoucherLinkPopupListRow1.equalsIgnoreCase(expvoucherLinkPopupListRow1)
				&& actLinkPopupRowCount==expLinkPopupRowCount)
				{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			ClickUsingJs(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return true;
		} else {
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
			click(new_CloseBtn);
			Thread.sleep(1500);
			ClickUsingJs(contentChangeAlertMsg);
			Thread.sleep(2500);
			
			return false;
		
		}
		
	}
	
public boolean SaveBaseDocumentPOVoucher2WithUnitconversions()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2000);
		
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		Thread.sleep(1500);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(2500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "Test Unit");
		Thread.sleep(2500);
		tab(enter_ItemTxt);
		enterText(enter_UnitTxt, "Case");
		Thread.sleep(2000);
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		
		
		click(select2ndRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "Test Unit");
		Thread.sleep(1500);
		tab(enter_ItemTxt);	
		enterText(enter_UnitTxt, "Dozs");
		Thread.sleep(1500);
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "30");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);
		
		click(select3rdRow_1stColumn);
		enterText(pvWareHouseTxt, "HYDERABAD");		
		Thread.sleep(1500);
		tab(pvWareHouseTxt);		
		enterText(enter_ItemTxt, "Test Unit");
		Thread.sleep(1500);
		tab(enter_ItemTxt);	
		enterText(enter_UnitTxt, "Each");
		Thread.sleep(1500);
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "120");
		tab(enter_Quantity);		
		enterText(enter_Rate, "15");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);
		
		
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 2";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}


@FindBy(xpath="//*[@id='id_body_35_3']")
public static WebElement  lpurchaseOrderColumn;



public boolean verifyLinkPopupValuesInLinkdoumentPurchaseVoucherN() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
		
	Thread.sleep(1200);
	click(financialsMenu);
	click(financialsTransactionMenu);
	click(financialsTransactionsPurchaseMenu);
	click(purchaseVoucherNew);		
	Thread.sleep(1500);	
	
	ClickUsingJs(pendingPurchaseOrderView);
	Thread.sleep(1500);	
	
	IsVisible(voucher2Checkbox);
	Thread.sleep(1000);
	
	doubleClick(voucher2Checkbox);  
	Thread.sleep(700);	
	
	checkValidationMessage("Voucher loaded successfully");
	
	Thread.sleep(2500);
	
	ClickUsingJs(select1stRow_4thColumn);
	Thread.sleep(1500);
	
	
	lpurchaseOrderColumn.sendKeys(Keys.SPACE);
	Thread.sleep(2500);
	
	
	
	int actLinkPopupRowCount =linkPopupRowList.size();
	int expLinkPopupRowCount =1;
	
	Thread.sleep(1500);
	System.out.println("actLinkPopupRowCount  :"+actLinkPopupRowCount);
	System.out.println("expLinkPopupRowCount  :"+expLinkPopupRowCount);
	
	int voucherLinkPopupListCount = linkPopupRow1List1.size();

	ArrayList<String> voucherLinkPopupListArray = new ArrayList<String>();

	for (int i = 0; i < voucherLinkPopupListCount; i++) {
		String data = linkPopupRow1List1.get(i).getText();
		
		if(data.isEmpty()==false) {
			voucherLinkPopupListArray.add(data);
			}
	}

	String actvoucherLinkPopupListRow1 = voucherLinkPopupListArray.toString();

	String expvoucherLinkPopupListRow1 = "[1, PurOrd:2, "+getCurrentDateF2()+", Test Unit, 100.0000000000000000]";
	
	System.out.println(actvoucherLinkPopupListRow1);
	System.out.println(expvoucherLinkPopupListRow1);
	
	Thread.sleep(2500);
	
	ClickUsingJs(linkPopupCloseBtn);
	Thread.sleep(2500);
	
	
	
	if (actvoucherLinkPopupListRow1.equalsIgnoreCase(expvoucherLinkPopupListRow1)
			&& actLinkPopupRowCount==expLinkPopupRowCount)
			{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		click(new_CloseBtn);
		Thread.sleep(1500);
		ClickUsingJs(contentChangeAlertMsg);
		Thread.sleep(2500);
		
		return true;
	} else {
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		click(new_CloseBtn);
		Thread.sleep(1500);
		ClickUsingJs(contentChangeAlertMsg);
		Thread.sleep(2500);
		
		return false;
	
	}
	
}

	

@FindBy(xpath="//*[@id='id_menu_search_input']")
public static WebElement  homePageSearch;

	public boolean SaveBaseDocumentNewMrnVoucher()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
	
	
	click(inventoryMenu);	
	click(inventoryTransactionsMenu);
	click(inventoryTransactionsPurchasesMenu);
	click(newMrn);

	Thread.sleep(2000);
	
	Thread.sleep(3000);
	ClickUsingJs(newBtn);
	
	Thread.sleep(1500);//checkValidationMessage("Screen opened");
	
	Thread.sleep(1500);
	
	enterText(vendorAccountTxt, "Vendor A");

	Thread.sleep(1500);		
	tab(vendorAccountTxt);
	
	enterText(wareHouseTxt, "HYDERABAD");
	Thread.sleep(1500);		
	tab(wareHouseTxt);
	Thread.sleep(1500);
	
	enterText(departmentTxt, "DUBAI");
	Thread.sleep(1500);		
	tab(departmentTxt);
	Thread.sleep(1500);
	

	Thread.sleep(2000);
	
	click(select1stRow_1stColumn);			
	enterText(enter_ItemTxt, "STOCK ITEM");
	Thread.sleep(1500);
	tab(enter_ItemTxt);
	
	enterText(enter_UnitTxt, "Pcs");
	Thread.sleep(1500);
	tab(enter_UnitTxt);	
	
	click(select1stRow_4thColumn);
	
	enterText(enter_Quantity, "100");
	tab(enter_Quantity);		
	enterText(enter_Rate, "10");
	tab(enter_Rate);		
	Thread.sleep(1000);		
	tab(enter_Gross);	
	Thread.sleep(1500);
	click(vouchersaveBtn);
	
	String expMessage1= "Voucher saved successfully";
	String expMessage2= ": 1";
	
	String actMessage = checkValidationMessage(expMessage1);   
   
   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

	
	if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
		
		click(new_CloseBtn);
		return true;
	} else {
		click(new_CloseBtn);
		return false;
	}
}
	
	@FindBy(xpath="//a[text()='Pending New MRN']")
	public static WebElement  pendingNewMrn;
	
	@FindBy(xpath="//input[@id='id_body_35_4']")
	public static WebElement  lNewMrnColumn;
	
	@FindBy(xpath="//h5[text()='New MRN']")
	public static WebElement  linkPopupHeaderTxt;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[10]")
	public static WebElement  linkPopupQuantity;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	public static WebElement  afterLoadingQty;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	public static WebElement  afterLoadingQtyRow2;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[2]/input")
	public static WebElement  workFlowRow1ChckBox;
	
	@FindBy(xpath="//select[@id='id_body_16777361']")
	public static WebElement  numberListDropDown;
	
	
	
	
	
	public boolean SaveLinkDocumentNewPVVoucherWith70Qty()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(newPV);

		Thread.sleep(2000);
		IsVisible(pendingNewMrn);		
		Thread.sleep(1200);
		ClickUsingJs(pendingNewMrn);
		
		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Link data loaded");
		
		Thread.sleep(1500);
		
		enterText(purchaseAccountTxt1, "Purchase");
		Thread.sleep(1500);
		tab(purchaseAccountTxt1);

		Thread.sleep(2500);		
		
		ClickUsingJs(select1stRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_Quantity, "70");
		Thread.sleep(1000);
		tab(enter_Quantity);
		Thread.sleep(1500);
		
		lNewMrnColumn.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		
		IsVisible(linkPopupHeaderTxt);
		Thread.sleep(1200);
		
		String actLinkPopupQty =linkPopupQuantity.getText();
		
		String expLinkPopupQty ="100.0000000000000000";
		
		System.out.println("actLinkPopupQty    :"+actLinkPopupQty);
		System.out.println("expLinkPopupQty    :"+expLinkPopupQty);
		
		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(2500);
		IsVisible(afterLoadingQty);
		Thread.sleep(1000);
		
		String actQTy =afterLoadingQty.getText();
		String expQTy ="70.0000000000000000";
		
		Thread.sleep(1500);
		System.out.println("actQTy   :"+actQTy);
		System.out.println("expQTy   :"+expQTy);
		
		
		
		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(1200);		
		enter_ItemTxt.sendKeys(Keys.CONTROL+"l");
	    
	    Thread.sleep(2000);
	    
	    
	    IsVisible(linkPopupHeaderTxt);
		Thread.sleep(1200);
		
		String actafterLinkPopupQty =linkPopupQuantity.getText();
		
		String expafterLinkPopupQty ="30.0000000000000000";
		
		System.out.println("actafterLinkPopupQty    :"+actafterLinkPopupQty);
		System.out.println("expafterLinkPopupQty    :"+expafterLinkPopupQty);
		
		Thread.sleep(1500);
		
		ClickUsingJs(workFlowRow1ChckBox);
		Thread.sleep(1500);
		
		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(1500);
		IsVisible(afterLoadingQty);
		Thread.sleep(1000);
		
		String actQTy1 =afterLoadingQtyRow2.getText();
		String expQTy1 ="30.0000000000000000";
		
		Thread.sleep(1500);
		System.out.println("actQTy1   :"+actQTy1);
		System.out.println("expQTy1   :"+expQTy1);
		
		Thread.sleep(1500);
		ClickUsingJs(select1stRow_14thColumn);
		Thread.sleep(1200);
		
		dropDown("gmail", numberListDropDown);
		Thread.sleep(1500);
		
		ClickUsingJs(select2ndRow_14thColumn);
		Thread.sleep(1200);
		
		dropDown("outlook", numberListDropDown);
		Thread.sleep(1500);
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
	
		
		
		
		//ClickUsingJs(contentChangeAlertMsg);
		
		
		if (actLinkPopupQty.equalsIgnoreCase(expLinkPopupQty) && actQTy.equalsIgnoreCase(expQTy)
				&& actafterLinkPopupQty.equalsIgnoreCase(expafterLinkPopupQty)
				&& actQTy1.equalsIgnoreCase(expQTy1) && actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) {
			
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return false;
		}
	}
	
	public boolean SaveBaseDocumentNewMrnVoucher2()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(newMrn);

		Thread.sleep(2000);
		
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(2100);		
		tab(vendorAccountTxt);
		Thread.sleep(1500);
		
		enterText(wareHouseTxt, "HYDERABAD");
		Thread.sleep(1500);		
		tab(wareHouseTxt);
		
		Thread.sleep(1500);
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);		
		tab(departmentTxt);
		Thread.sleep(1500);
		

		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);		
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		tab(enter_ItemTxt);
		Thread.sleep(1500);
		enterText(enter_UnitTxt, "Pcs");
		Thread.sleep(1500);
		tab(enter_UnitTxt);	
		Thread.sleep(1500);
		
		click(select1stRow_4thColumn);
		Thread.sleep(1500);
		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "10");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	
		Thread.sleep(1500);
		click(vouchersaveBtn);
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 2";
		
		String actMessage = checkValidationMessage(expMessage1);   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);

		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			
			click(new_CloseBtn);
			return true;
		} else {
			click(new_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	public static WebElement  firstRowIndex;
	
	@FindBy(xpath="//label[text()='Duplicate Row']")
	public static WebElement  duplicateRowBtn;
	
public boolean SaveLinkDocumentNewPVVoucher2UsingLoadLinkManually()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(newPV);
		Thread.sleep(1500);

		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);		
		
		enterText(purchaseAccountTxt1, "Purchase");
		Thread.sleep(1500);
		tab(purchaseAccountTxt1);
		Thread.sleep(1000);
		
		enterText(vendorAccountTxt, "Vendor A");
		Thread.sleep(1500);
		tab(vendorAccountTxt);
		
		Thread.sleep(1000);
		
		enterText(wareHouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(wareHouseTxt);
		
		Thread.sleep(1000);
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1500);
			
		
		ClickUsingJs(select1stRow_1stColumn);
		Thread.sleep(1200);
		
		enterText(enter_ItemTxt, "STOCK ITEM");
		Thread.sleep(1500);
		
		
		
		ClickUsingJs(select1stRow_5thColumn);
		Thread.sleep(1200);		
		lNewMrnColumn.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		
		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(2500);
		IsVisible(afterLoadingQty);
		Thread.sleep(1000);
		
		String actQTy =afterLoadingQty.getText();
		String expQTy ="10.0000000000000000";
		
		Thread.sleep(1500);
		System.out.println("actQTy   :"+actQTy);
		System.out.println("expQTy   :"+expQTy);
		
		ClickUsingJs(select1stRow_4thColumn);
		Thread.sleep(1200);
		
		enterText(enter_Quantity, "7");
		Thread.sleep(1500);
		tab(enter_Quantity);
		
		
		Thread.sleep(1500);
		ClickUsingJs(select1stRow_14thColumn);
		Thread.sleep(1200);
		
		dropDown("gmail", numberListDropDown);
		Thread.sleep(1500);
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		Thread.sleep(1500);
		
		ClickUsingJs(previousBtn);
		Thread.sleep(1200);
	
		checkValidationMessage("Voucher loaded successfully");
		Thread.sleep(1500);
		
		contextClick(firstRowIndex);
		
		click(duplicateRowBtn);		
		Thread.sleep(1500);
		
		System.out.println("2nd Row Added");
		
		ClickUsingJs(select2ndRow_5thColumn);
		Thread.sleep(1200);		
		//lNewMrnColumn.sendKeys(Keys.SPACE);
		Thread.sleep(1500);
		
		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(2500);
		IsVisible(afterLoadingQtyRow2);
		Thread.sleep(1000);
		
		String actQTyRow2 =afterLoadingQtyRow2.getText();
		String expQTyRow2 ="3.0000000000000000";
		
		Thread.sleep(1500);
		System.out.println("actQTyRow2   :"+actQTyRow2);
		System.out.println("expQTyRow2   :"+expQTyRow2);
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(1500);
		click(billRefNewReferenceTxt);
		Thread.sleep(1000);
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);
		Thread.sleep(2000);
		
		String expMessage3 = "Voucher saved successfully";
		String expMessage4 = ": 2";
		String actMessage2 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage2 + " Value Expected : " + expMessage3 + " " + expMessage4);
		
		
		
		
		if (actQTy.equalsIgnoreCase(expQTy) && actQTyRow2.equalsIgnoreCase(expQTyRow2)
				&& actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)
				&& actMessage2.startsWith(expMessage3) && actMessage2.endsWith(expMessage4)) {
			
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return false;
		}
	}

	@FindBy(xpath="//a[@id='2001']/span")
	public static WebElement  cashAndBankMenu;
	
	@FindBy(xpath="//a[@id='2003']/span")
	public static WebElement  paymentsScreen;
	
	@FindBy(xpath="//a[@id='2077']/span")
	public static WebElement  paymentsLinkScreen;
	
	@FindBy(xpath="//input[@id='id_header_10']")
	public static WebElement  currencyTxt;

	public boolean savePaymentsVoucherwithCurrencyAsAED()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
	
	
	click(financialsMenu);
	click(financialsTransactionMenu);
	click(cashAndBankMenu);
	click(paymentsScreen);
	
	Thread.sleep(1500);

	ClickUsingJs(newBtn);
	
	Thread.sleep(1500);//checkValidationMessage("Screen opened");
	
	Thread.sleep(1500);		

	
	enterText(vendorAccountTxt, "Bank");
	Thread.sleep(1500);
	tab(vendorAccountTxt);
	
	Thread.sleep(1000);
	ClickUsingJs(currencyTxt);
	Thread.sleep(1000);
	clearValueFromTextBox(currencyTxt);
	Thread.sleep(1000);
	enterText(currencyTxt, "AED");
	Thread.sleep(1200);
	
	
	Thread.sleep(1000);
	
	enterText(departmentTxt, "DUBAI");
	Thread.sleep(1500);
	tab(departmentTxt);
	Thread.sleep(1500);
		
	
	ClickUsingJs(select1stRow_1stColumn);
	Thread.sleep(1200);
	
	enterText(enter_AccountTxt, "Authorized Capital");
	Thread.sleep(1500);
	tab(enter_AccountTxt);
	Thread.sleep(1500);
	
	enterText(enter_Amount, "100");
	Thread.sleep(1500);
	tab(enter_Amount);
	Thread.sleep(1500);
	
	
	ClickUsingJs(vouchersaveBtn);
	Thread.sleep(600);
	
	String expMessage1 = "Voucher saved successfully";
	String expMessage2 = ": 1";
	String actMessage1 = checkValidationMessage(expMessage1);

	System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
	
	
	if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) 
	
	{
		
		Thread.sleep(1500);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1200);
		return true;
	} else {
		Thread.sleep(1500);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1200);
		return false;
	}
}
	
	
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_heading']")
	public static WebElement  workFlowPopUpHeading;
	
	public boolean savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmount()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		ClickUsingJs(paymentsLinkScreen);
		
		Thread.sleep(1500);

		ClickUsingJs(newBtn);
		
		//Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);		
		
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(1500);
		IsVisible(workFlowPopUpHeading);
		Thread.sleep(1000);
		
		
		String actLinkPopupAmount =linkPopupTransactionGross.getText();
		String expLinkPopupAmount ="1400.00";
		
		Thread.sleep(1500);
		
		System.out.println("actLinkPopupAmount   :"+actLinkPopupAmount);
		System.out.println("expLinkPopupAmount   :"+expLinkPopupAmount);
		
		Thread.sleep(1500);
		
		ClickUsingJs(workFlowRow1ChckBox);		
		Thread.sleep(1500);
		ClickUsingJs(workFlowOkBtn2);
		Thread.sleep(3000);
		
			
		
		ClickUsingJs(select1stRow_2ndColumn);
		Thread.sleep(1500);
		
		enterText(enter_Amount, "50");
		Thread.sleep(1500);
		tab(enter_Amount);
		Thread.sleep(1500);
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(600);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)
				&& actLinkPopupAmount.equalsIgnoreCase(expLinkPopupAmount)) 
		
		{
			
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return false;
		}
	}
	
public boolean validateLinkPopupAmountWithOnEditing()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		ClickUsingJs(paymentsLinkScreen);
		
		Thread.sleep(1500);

		Thread.sleep(2000);
		IsVisible(grid_ChkBox1);
		Thread.sleep(1000);
		
		doubleClick(grid_ChkBox1);  
		Thread.sleep(700);	
		
		checkValidationMessage("Voucher loaded successfully");
		
		Thread.sleep(1500);		
		
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(1500);
		IsVisible(workFlowPopUpHeading);
		Thread.sleep(1000);
		
		
		String actLinkPopupAmount =linkPopupTransactionGross.getText();
		String expLinkPopupAmount ="700.00";
		
		Thread.sleep(1500);
		
		System.out.println("actLinkPopupAmount   :"+actLinkPopupAmount);
		System.out.println("expLinkPopupAmount   :"+expLinkPopupAmount);
		
			
		Thread.sleep(1500);
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(3000);
		
		ClickUsingJs(newBtn);
		
		//Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);
		
			
		
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(1500);
		IsVisible(workFlowPopUpHeading);
		Thread.sleep(1000);
		
		
		String actLinkPopupAmountWithNewVoucher =linkPopupTransactionGross.getText();
		String expLinkPopupAmountWithNewVoucher ="700.00";
		
		Thread.sleep(1500);
		
		System.out.println("actLinkPopupAmountWithNewVoucher   :"+actLinkPopupAmountWithNewVoucher);
		System.out.println("expLinkPopupAmountWithNewVoucher   :"+expLinkPopupAmountWithNewVoucher);
		
		Thread.sleep(2500);
		Thread.sleep(1500);
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(3000);
		
				
		Thread.sleep(1500);
		
		
		
		
		if (actLinkPopupAmountWithNewVoucher.equalsIgnoreCase(expLinkPopupAmountWithNewVoucher)
				&& actLinkPopupAmount.equalsIgnoreCase(expLinkPopupAmount)) 
		
		{
			
			Thread.sleep(1500);
			
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			
			Thread.sleep(1200);
			return false;
		}
	}

	@FindBy(xpath="//a[@id='16']")
	public static WebElement settingsMenu;	

	@FindBy(xpath="//a[@id='74']//span[contains(text(),'Design Workflow')]")
	public static WebElement designWorkflowbtn; 

	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Design Workflow')]")
	public static WebElement designWorkflowLabel; 

	@FindBy(xpath="//i[@class='icon icon-clear icon-font6']")
	public static WebElement clearBtn; 

	@FindBy(xpath="//a[@id='btnCancel']")
	public static WebElement closeBtn;
	
	@FindBy(xpath="//*[@id='btnCancel']/i")
	public static WebElement CloseBtn;

	@FindBy(xpath="//input[@id='optWorkflow']")
	public static WebElement workflowNameTxt; 
	
	@FindBy(xpath="//*[@id='line0']")
	public static WebElement link0TO1; 
	
	@FindBy(xpath="//select[@id='DDLLinkValue']")
	public static WebElement DefinitionLinkValueDropdown; 
	
	@FindBy(xpath="//*[@id='WorkflowSettingDialog']/div[2]/div/div[3]/div/input[2]")
	public static WebElement OkBtn;
	
	@FindBy(xpath="//*[@id='btnSave']/i") 
	public static WebElement  SaveBtn;

	public boolean selectTransactionAmountInPaymentFlowInLinkDefination()
		throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
	
	ClickUsingJs(settingsMenu);
	ClickUsingJs(designWorkflowbtn);		
	Thread.sleep(2000);
	click(workflowNameTxt);		
	enterText(workflowNameTxt, "Payments flow");
	Thread.sleep(2000);
	tab(workflowNameTxt);
	Thread.sleep(2000);
	
	//draggedPurchasesOrders.click();

	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '21')");

	Thread.sleep(1000);

	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link0TO1));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
	link0TO1.click();
	Thread.sleep(2500);
	
	
	dropDown("Transaction Amount", DefinitionLinkValueDropdown);
	Thread.sleep(1500);
	
	ClickUsingJs(OkBtn);

	Thread.sleep(2000);

	click(SaveBtn);

	String expMessage = "WorkFlow Saved Successfully";

	String actMessage = checkValidationMessage(expMessage);		
	
	System.out.println("actMessage     :"+actMessage);
	System.out.println("expMessage     :"+expMessage);
	
	Thread.sleep(2000);		
	click(CloseBtn);
	
	checkLogoutAndLogin();

	if (actMessage.equalsIgnoreCase(expMessage)) {

		return true;
	} else {

		return false;
	}
}
	
	
	public boolean selectAmountInPaymentFlowInLinkDefination()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {
		
		ClickUsingJs(settingsMenu);
		ClickUsingJs(designWorkflowbtn);		
		Thread.sleep(2000);
		click(workflowNameTxt);		
		enterText(workflowNameTxt, "Payments flow");
		Thread.sleep(2000);
		tab(workflowNameTxt);
		Thread.sleep(2000);
		
		//draggedPurchasesOrders.click();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '21')");

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link0TO1));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		Thread.sleep(2500);
		
		
		dropDown("Amount", DefinitionLinkValueDropdown);
		Thread.sleep(1500);
		
		ClickUsingJs(OkBtn);

		Thread.sleep(2000);

		click(SaveBtn);

		String expMessage = "WorkFlow Saved Successfully";

		String actMessage = checkValidationMessage(expMessage);		
		
		System.out.println("actMessage     :"+actMessage);
		System.out.println("expMessage     :"+expMessage);
		
		Thread.sleep(2000);		
		click(CloseBtn);
		
		checkLogoutAndLogin();

		if (actMessage.equalsIgnoreCase(expMessage)) {

			return true;
		} else {

			return false;
		}
	}
	
	public boolean checkLogout()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		userNameDisplayLogo.click();
		Thread.sleep(300);
		ClickUsingJs(logoutOption);		

		Thread.sleep(2000);

		System.out.println("Logout  Successfully");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		boolean actUserName = username.isDisplayed();
		boolean expUserName = true;

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		boolean actPassword = password.isDisplayed();
		boolean expPassword = true;

		System.out.println("*************************CheckLogout***************************");

		System.out.println("UserName is Displaying : " + actUserName + "  Value Expected  " + expUserName);
		System.out.println("Password is Displaying : " + actPassword + "  Value Expected  " + expPassword);

		if (actUserName == expUserName && actPassword == expPassword) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkLogoutAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		
		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "su";

		String pawslt = "su";

		//checkEraseAllTransactions();
		
		click(userNameDisplayLogo);
		Thread.sleep(1300);
		ClickUsingJs(logoutOption);
		Thread.sleep(1300);

		Thread.sleep(3000);
		
	     Thread.sleep(2500);

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);
		
		String compname="Stock analysis by Batch";

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

		lp.clickOnSignInBtn();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
	
		
		Thread.sleep(1500);
		
		String getCompanyTxt=companyName.getText();
		
		boolean actDashboard = dashboard.isDisplayed();
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Stock analysis by Batch";
		boolean expDashboard = true;	
		
		Thread.sleep(2000);
		
		
		System.out.println("actUserInfo   :"+actUserInfo);
		System.out.println("expUserInfo   :"+expUserInfo);
		
		System.out.println("getCompanyTxt   	  :"+getCompanyTxt);
		System.out.println("expLoginCompanyName   :"+expLoginCompanyName);
		
		System.out.println("actDashboard   :"+actDashboard);
		System.out.println("expDashboard   :"+expDashboard);
		
		Thread.sleep(2000);
	
		
		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getCompanyTxt.contains(expLoginCompanyName) && actDashboard==expDashboard) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean savePaymentsVoucherwithCurrencyAsAEDWhenLinkValueAsTransactionAmount()	throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		click(paymentsScreen);
		
		Thread.sleep(1500);

		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);		

		
		enterText(vendorAccountTxt, "Bank");
		Thread.sleep(1500);
		tab(vendorAccountTxt);
		
		Thread.sleep(1000);
		ClickUsingJs(currencyTxt);
		Thread.sleep(1000);
		clearValueFromTextBox(currencyTxt);
		Thread.sleep(1000);
		enterText(currencyTxt, "AED");
		Thread.sleep(1200);
		
		
		Thread.sleep(1000);
		
		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1500);
			
		
		ClickUsingJs(select1stRow_1stColumn);
		Thread.sleep(1200);
		
		enterText(enter_AccountTxt, "Authorized Capital");
		Thread.sleep(1500);
		tab(enter_AccountTxt);
		Thread.sleep(1500);
		
		enterText(enter_Amount, "100");
		Thread.sleep(1500);
		tab(enter_Amount);
		Thread.sleep(1500);
		
		
		ClickUsingJs(vouchersaveBtn);
		Thread.sleep(600);
		
		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
		
		
		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) 
		
		{
			
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return false;
		}
	}
	
public boolean validateLinkPopupAmountWithOnEditingWhenLinkValueAsTransactionAmount()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(cashAndBankMenu);
		ClickUsingJs(paymentsLinkScreen);
		
		Thread.sleep(1500);

		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);		
		
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(1500);
		IsVisible(workFlowPopUpHeading);
		Thread.sleep(1000);
		
		
		String actLinkPopupAmount =linkPopupTransactionGross.getText();
		String expLinkPopupAmount ="50.00";
		
		Thread.sleep(1500);
		
		System.out.println("actLinkPopupAmount   :"+actLinkPopupAmount);
		System.out.println("expLinkPopupAmount   :"+expLinkPopupAmount);
		
		Thread.sleep(1500);
		
		
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(3000);
		
		ClickUsingJs(newBtn);
		
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		
		Thread.sleep(1500);	
			
		
		vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
		
		Thread.sleep(1500);
		IsVisible(workFlowPopUpHeading);
		Thread.sleep(1000);
		
		
		String actLinkPopupAmountWithNewVoucher =linkPopupTransactionGross.getText();
		String expLinkPopupAmountWithNewVoucher ="50.00";
		
		Thread.sleep(1500);
		
		System.out.println("actLinkPopupAmountWithNewVoucher   :"+actLinkPopupAmountWithNewVoucher);
		System.out.println("expLinkPopupAmountWithNewVoucher   :"+expLinkPopupAmountWithNewVoucher);
		
		Thread.sleep(2500);
		Thread.sleep(1500);
		ClickUsingJs(linkPopupCloseBtn);
		Thread.sleep(3000);
		
				
		Thread.sleep(1500);
		
		
		if (actLinkPopupAmountWithNewVoucher.equalsIgnoreCase(expLinkPopupAmountWithNewVoucher)
				&& actLinkPopupAmount.equalsIgnoreCase(expLinkPopupAmount)) 
		
		{
			
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return true;
		} else {
			Thread.sleep(1500);
			ClickUsingJs(new_CloseBtn);
			Thread.sleep(1200);
			return false;
		}
	}

public boolean savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmountWhenLinkValueAsTransactionAmount()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		
	
	
	click(financialsMenu);
	click(financialsTransactionMenu);
	click(cashAndBankMenu);
	ClickUsingJs(paymentsLinkScreen);
	
	Thread.sleep(1500);

	ClickUsingJs(newBtn);
	
	Thread.sleep(1500);//checkValidationMessage("Screen opened");
	
	Thread.sleep(1500);		
	
	vendorAccountTxt.sendKeys(Keys.CONTROL+"l");
	
	Thread.sleep(1500);
	IsVisible(workFlowPopUpHeading);
	Thread.sleep(1000);
	
	
	String actLinkPopupAmount =linkPopupTransactionGross.getText();
	String expLinkPopupAmount ="100.00";
	
	Thread.sleep(1500);
	
	System.out.println("actLinkPopupAmount   :"+actLinkPopupAmount);
	System.out.println("expLinkPopupAmount   :"+expLinkPopupAmount);
	
	Thread.sleep(1500);
	
	ClickUsingJs(workFlowRow1ChckBox);		
	Thread.sleep(1500);
	ClickUsingJs(workFlowOkBtn2);
	Thread.sleep(3000);
	
		
	
	ClickUsingJs(select1stRow_2ndColumn);
	Thread.sleep(1500);
	
	enterText(enter_Amount, "50");
	Thread.sleep(1500);
	tab(enter_Amount);
	Thread.sleep(1500);
	
	
	ClickUsingJs(vouchersaveBtn);
	Thread.sleep(600);
	
	String expMessage1 = "Voucher saved successfully";
	String expMessage2 = ": 1";
	String actMessage1 = checkValidationMessage(expMessage1);

	System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);
	
	
	if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)
			&& actLinkPopupAmount.equalsIgnoreCase(expLinkPopupAmount)) 
	
	{
		
		Thread.sleep(1500);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1200);
		return true;
	} else {
		Thread.sleep(1500);
		ClickUsingJs(new_CloseBtn);
		Thread.sleep(1200);
		return false;
	}
}
	
	
	
}
