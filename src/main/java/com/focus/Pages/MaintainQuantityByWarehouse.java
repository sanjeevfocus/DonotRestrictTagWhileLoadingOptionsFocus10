package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class MaintainQuantityByWarehouse extends BaseEngine {
	
	public MaintainQuantityByWarehouse(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		Thread.sleep(2000);

		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
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
	    
	    lp.clickOnSignInBtn();
	    
	  
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 12);
		System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();
		
		boolean actDashboard = dashboard.isDisplayed();
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="TESTING COGS";
		boolean expDashboard = true;
		
		System.err.println(actDashboard);
		System.err.println(expDashboard);
		
		System.err.println(getLoginCompanyName);
		System.err.println(expLoginCompanyName);
		
		
		Thread.sleep(2000);
	
		
		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@FindBy(xpath = "//a[@id='578']")
	public static WebElement InventoryReportsStockValuation;
	
	@FindBy(xpath = "//*[@id='selectAllMasters_']//..//span")
	public static WebElement selectAllItemChkBox;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']//tr/td[6]")
	public static List<WebElement> reportsCol6List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']//tr/td[7]")
	public static List<WebElement> reportsCol7List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']//tr/td[9]")
	public static List<WebElement> reportsCol9List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']//tr/td[10]")
	public static List<WebElement> reportsCol10List;
	
	@FindBy(xpath = "//*[@id='dvReportDetails']//tr/td[11]")
	public static List<WebElement> reportsCol11List;
	
	@FindBy(xpath = "//*[@id='id_menu_search_input']")
	public static WebElement homePageMainSearch;
	
	@FindBy(xpath = "//span[@id='535']")
	public static WebElement balanceSheetElement;
	
	@FindBy(xpath = "//*[@id='idFilterCustomizeIcon']")
	public static WebElement filterCustamizationBtn;
	
	@FindBy(xpath = "(//a[contains(text(),'Account')])[1]//..//i")
	public static WebElement filterCustamizationAccountExpandBtn;
	
	@FindBy(xpath = "(//input[@id='5002'])[1]//../span")
	public static WebElement filterCustamizationNameFiledCheckBox;
	
	@FindBy(xpath = "(//input[@id='5002'])[1]")
	public static WebElement filterCustamizationNameFiledCheckBoxIsSelected;
	
	@FindBy(xpath = "//input[@id='FOption_535_0_DefaultFilter_0']")
	public static WebElement filterCustamizationAccountTxt;
	
	// Validate unit price value for WA-RMA Item.
	public boolean checkStockValuationReport()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {	
		
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(3000);
		
		IsVisible(selectAllItemChkBox);
		Thread.sleep(1200);
		
		click(selectAllItemChkBox);
		
		Thread.sleep(1500);
		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);
		
		
		
		
		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for(int i=0;i<col6ListCount;i++)
		{
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[30.3434, 16.2424, 43.4289, 90.0147]";
		
		
		
		
		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for(int i=0;i<col7ListCount;i++)
		{
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString();   // Validate unit price value for WA-RMA Item.
		String expCol7List = "[7.5859, 4.0606, 10.8572, 22.5037]";
		
		
		System.out.println("*********************************checkStockValuationReport *****************************************");
		
		System.out.println(actCol61List);
		System.out.println(expCol6List);
		
		System.out.println(actCol71List);
		System.out.println(expCol7List);
		
		
		
	
		
		if(actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List))
		{
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkBaseDRYTDColumnInBalanceSheetReport()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
	
		
		click(homePageMainSearch);		
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);	
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);
		
		click(stockLedgerFilterBtn);
		
		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);			
		
		
		click(filterCustamizationBtn);
		Thread.sleep(1200);
		click(filterCustamizationAccountExpandBtn);
		Thread.sleep(1000);
		
		if(filterCustamizationNameFiledCheckBoxIsSelected.isSelected()==false)
		{
			click(filterCustamizationNameFiledCheckBox);
		}
		
		Thread.sleep(2000);	
		moveToElement(stockLedgerFilterOkBtn);
		Thread.sleep(2000);
		
		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(3000);
		click(stockLedgerFilterOkBtn);
		
		Thread.sleep(6000);
		
		
		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for(int i=0;i<col9ListCount;i++)
		{
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[619.5516, 43.4291, 545.7777, 30.3448, , 619.5516]";
		
		
		
		
		
		
		
		System.out.println("*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");
		
	
		System.out.println(actCol91List);
		System.out.println(expCol9List);
		
		
		
	
		
		if(/*actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List))
		{
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		}
		else
		{
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	@FindBy (xpath="//*[@id='id_transaction_bins_grid_col_1-1']")
	private static WebElement binRow1;
	
	public boolean checkSavePurchasesVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(PurchasesVoucher);
		Thread.sleep(1500);
		click(newBtn);
		checkValidationMessage("Screen opened");
		click(purchaseDatetxt);
		purchaseDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		purchaseDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(purchaseDatetxt, "01/01/2024");
		Thread.sleep(1200);		
		tab(purchaseDatetxt);
		Thread.sleep(2000);
		
		
		
		enterText(vendorAccounttxt, "Vendor A");
		Thread.sleep(2000);
		tab(vendorAccounttxt);
		Thread.sleep(2000);
		
		enterText(purchasesDepartmenttxt, "DEPT1");
		Thread.sleep(1500);
		tab(purchasesDepartmenttxt);
		Thread.sleep(1000);

	
		click(select1stRow_1stColumn);
		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1500);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(1500);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		tab(enterRatetxt);
		Thread.sleep(2000);
		click(select1stRow_13thColumn);
		enterText(enterBatchtxt, "01012023H");
		tab(enterBatchtxt);
		

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(1500);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		tab(enterRatetxt);
		Thread.sleep(2000);
		click(select2ndRow_13thColumn);
		enterText(enterBatchtxt, "01012023S");
		tab(enterBatchtxt);
		

		// 3rd Row

		click(select3rdRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		tab(enterRatetxt);
		
		
		click(select3rdRow_14thColumn);
		
		Thread.sleep(2500);
		
		
		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		

		// 4th Row

		click(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		tab(enterRatetxt);
		
		
		click(select4thRow_14thColumn);
		Thread.sleep(3000);
		
		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		

		// 5th Row

		click(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		tab(enterRatetxt);
		
		Thread.sleep(3000);
		

		String actual5throwAvgRate 			= select5thRow_AvgRate1.getText();
		String exp5throwAvgRate			    = "10.8572000";
		
		System.out.println("actual5throwAvgRate  :"+actual5throwAvgRate);
		System.out.println("exp5throwAvgRate     :"+exp5throwAvgRate);
		
		
		String actual5throwOverallAvgRate   = select5thRow_OverAllAvgRate1.getText();
		String exp5throwoverallAvgRate      = "10.8572000";
		
		System.out.println("actual5throwOverallAvgRate  :"+actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate     :"+exp5throwoverallAvgRate);
		

		click(select5thRow_15thColumn);
		
		
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);
		Thread.sleep(1000);
		
		
		enterText(rmaSerialNumberTxtField, "01012023HYD,10");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		//tab(enterBatCodetxt);

		// 6th Row
		Thread.sleep(1000);
		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		tab(enterRatetxt);
		
		Thread.sleep(3000);
		

		String actual6throwAvgRate 			= select6thRow_AvgRate1.getText();
		String exp6throwAvgRate			    = "10.8572000";
		
		System.out.println("actual6throwAvgRate  :"+actual6throwAvgRate);
		System.out.println("exp6throwAvgRate     :"+exp6throwAvgRate);
		
		
		String actual6throwOverallAvgRate   = select6thRow_OverAllAvgRate1.getText();
		String exp6throwoverallAvgRate      = "10.8572000";
		
		System.out.println("actual6throwOverallAvgRate  :"+actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate     :"+exp6throwoverallAvgRate);
		

		click(select6thRow_15thColumn);
		
		
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		Thread.sleep(1000);
		
		
		enterText(rmaSerialNumberTxtField, "01012023SEC,10");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		
		
		Thread.sleep(2000);
		
	
		click(voucherSaveBtn);
		
		Thread.sleep(2000);
		
		

		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(2000);
	
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 54";
		
		String actMessage = checkValidationMessage(expMessage1);	
	   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && (actRMAPopupIsDisplaying1==expRMAPopupIsDisplaying1)
				&& actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate) && actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {
			
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return true;
			
		} else {
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return false;

		} 

	}
	
	public boolean checkPostingDetailsInPurchasesVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(PurchasesVoucher);
		Thread.sleep(1500);
		
		doubleClick(PurchasesVoucherNo54);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		String actPostingDetailsBatchName  =postingDetailsBatchName.getText();
		String expPostingDetailsBatchName  ="INV-BR";
		
		System.out.println("actPostingDetailsBatchName   :"+actPostingDetailsBatchName);
		System.out.println("expPostingDetailsBatchName   :"+expPostingDetailsBatchName);
		
		String actPostingDetailsBatchAmount  =postingDetailsBatchAmount.getText();
		String expPostingDetailsBatchAmount  ="2,005.8010";
		
		System.out.println("actPostingDetailsBatchAmount   :"+actPostingDetailsBatchAmount);
		System.out.println("expPostingDetailsBatchAmount   :"+expPostingDetailsBatchAmount);
		
		
		
		String actPostingDetailsFifoName  =postingDetailsFifoName.getText();
		String expPostingDetailsFifoName  ="INV-FIFO";
		
		System.out.println("actPostingDetailsFifoName   :"+actPostingDetailsFifoName);
		System.out.println("expPostingDetailsFifoName   :"+expPostingDetailsFifoName);
		
		
		String actPostingDetailsFifoAmount  =postingDetailsFifoAmount.getText();
		String expPostingDetailsFifoAmount  ="2,005.8010";
		
		System.out.println("actPostingDetailsFifoAmount   :"+actPostingDetailsFifoAmount);
		System.out.println("actPostingDetailsFifoAmount   :"+actPostingDetailsFifoAmount);
		
		
		String actpostingDetailsWaName  =postingDetailsWaName.getText();
		String exppostingDetailsWaName  ="INV-WA";
		
		System.out.println("actpostingDetailsWaName   :"+actpostingDetailsWaName);
		System.out.println("exppostingDetailsWaName   :"+exppostingDetailsWaName);
		
		
		String actpostingDetailsWaAmount  =postingDetailsWaAmount.getText();
		String exppostingDetailsWaAmount  ="2,005.8010";
		
		System.out.println("actpostingDetailsWaAmount   :"+actpostingDetailsWaAmount);
		System.out.println("exppostingDetailsWaAmount   :"+exppostingDetailsWaAmount);
		
		
		click(postingDetailsCloseBtn);
		
		if (actPostingDetailsBatchName.equalsIgnoreCase(expPostingDetailsBatchName) && actPostingDetailsBatchAmount.equalsIgnoreCase(expPostingDetailsBatchAmount)
				&& actPostingDetailsFifoName.equalsIgnoreCase(expPostingDetailsFifoName) && actPostingDetailsFifoAmount.equalsIgnoreCase(expPostingDetailsFifoAmount)
				&& actpostingDetailsWaName.equalsIgnoreCase(exppostingDetailsWaName) && actpostingDetailsWaAmount.equalsIgnoreCase(exppostingDetailsWaAmount)) 
		{
			
			ClickUsingJs(new_CloseBtn);			
			Thread.sleep(1000);
			ClickUsingJs(voucherhomeCloseBtn);
			
			return true;
			
		} else {
			ClickUsingJs(new_CloseBtn);			
			Thread.sleep(1000);
			ClickUsingJs(voucherhomeCloseBtn);
			
			return false;

		} 

	}
	
	
	
	// Validate unit price value for WA-RMA Item.
		public boolean checkStockValuationReportAfterSavingPurchaseVoucher()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {	
			
			click(inventoryMenu);
			click(InventoryReportsMenu);
			click(InventoryReportsStockValuation);
			Thread.sleep(1500);
			click(selectAllItemChkBox);
			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			
			
			
			
			int col6ListCount = reportsCol6List.size();
			ArrayList<String> col6ListArray = new ArrayList<String>();
			for(int i=0;i<col6ListCount;i++)
			{
				String data = reportsCol6List.get(i).getText();
				col6ListArray.add(data);
			}
			String actCol61List = col6ListArray.toString();
			String expCol6List = "[2,036.1444, 2,022.0434, 2,049.2299, 6,107.4177]";
			
			
			
			
			int col7ListCount = reportsCol7List.size();
			ArrayList<String> col7ListArray = new ArrayList<String>();
			for(int i=0;i<col7ListCount;i++)
			{
				String data = reportsCol7List.get(i).getText();
				col7ListArray.add(data);
			}
			String actCol71List = col7ListArray.toString();   // Validate unit price value for WA-RMA Item.
			String expCol7List = "[84.8394, 84.2518, 85.3846, 254.4757]";
			
			
			System.out.println("*********************************checkStockValuationReport *****************************************");
			
			System.out.println(actCol61List);
			System.out.println(expCol6List);
			
			System.out.println(actCol71List);
			System.out.println(expCol7List);
			
			
			
		
			
			if(actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List))
			{
				click(report_CloseBtn);
				Thread.sleep(1000);
				click(sl_CloseBtn);
				return true;
			}
			else
			{
				click(report_CloseBtn);
				Thread.sleep(1000);
				click(sl_CloseBtn);
				return false;
			}
		}
		
		public boolean checkBaseDRYTDColumnInBalanceSheetReportAfterSavingPurchaseVoucher()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
		
			
			click(homePageMainSearch);		
			enterText(homePageMainSearch, "Balance Sheet");
			Thread.sleep(2000);	
			click(balanceSheetElement);
			Thread.sleep(2000);
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(3000);
			
			click(stockLedgerFilterBtn);
			
			Thread.sleep(2000);
			click(stockLedgerFilterField);
			Thread.sleep(1500);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

			boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
			boolean expFilterpopupIsDisplaying = true;

			System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
					+ expFilterpopupIsDisplaying);			
			
			
			Thread.sleep(2000);
			
			enterText(filterCustamizationAccountTxt, "Inventory Group");
			Thread.sleep(2000);
			click(stockLedgerFilterOkBtn);
			
			Thread.sleep(3000);
			
			
			int col9ListCount = reportsCol9List.size();
			ArrayList<String> col9ListArray = new ArrayList<String>();
			for(int i=0;i<col9ListCount;i++)
			{
				String data = reportsCol9List.get(i).getText();
				col9ListArray.add(data);
			}
			String actCol91List = col9ListArray.toString();
			String expCol9List = "[6,636.9546, 2,049.2301, 2,551.5787, 2,036.1458, , 6,636.9546]";
			
			
			
			
			
			
			
			System.out.println("*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");
			
		
			System.out.println(actCol91List);
			System.out.println(expCol9List);
			
			
			
		
			
			if(/*actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List))
			{
				click(report_CloseBtn);
				Thread.sleep(1000);
				click(sl_CloseBtn);
				return true;
			}
			else
			{
				click(report_CloseBtn);
				Thread.sleep(1000);
				click(sl_CloseBtn);
				return false;
			}
		}
		
		
		public boolean checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouse()
				throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		
			reLogin2("inv", "su");
			
			click(financialsMenu);
			click(financialsTransactionMenu);
			click(financialsTransactionsSalesMenu);
			click(salesInvoiceVoucher);
			click(newBtn);
			checkValidationMessage("Screen opened");
			click(salesDatetxt);
			salesDatetxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			salesDatetxt.sendKeys(Keys.BACK_SPACE);
			enterText(salesDatetxt, "02/01/2024");
			Thread.sleep(1500);
			tab(salesDatetxt);
			Thread.sleep(2000);
			enterText(salesAccounttxt, "Sales - Computers");
			tab(salesAccounttxt);
			Thread.sleep(2000);
			enterText(customerAccounttxt, "Customer A");
			Thread.sleep(2000);
			click(customerAccounttxt);
			enterText(salesDepartmenttxt, "DEPT1");
			Thread.sleep(1000);
			tab(salesDepartmenttxt);
			Thread.sleep(3000);		
			click(select1stRow_1stColumn);
				
			enterText(enterWarehousettxt, "HYD");
			Thread.sleep(2000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "BR-BATCH");
			Thread.sleep(2000);
			tab(enterItemttxt);
			Thread.sleep(2000);
			
			String actAvailableStock      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStock	  ="11.00";
			
			
			
			System.out.println("actAvailableStock       :"+actAvailableStock);
			System.out.println("expAvailableStock       :"+expAvailableStock);
			
			
			tab(enterAvailableStocktxt);
			
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			Thread.sleep(2000);
			click(select1stRow_11thColumn);
			
			Thread.sleep(2000);
			
			String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
			String expRow1Baseqty		="1.00";
		
			
			String actRow1Rate			=batchPopUPRow1RateTxt.getText();
			String expRow1Rate			="4.0101";
		
			
			String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
			String expRow2Baseqty		="10.00";
		
			
			String actRow2Rate			=batchPopUPRow2RateTxt.getText();
			String expRow2Rate			="100.1234";
		
			
			
			
			System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
			System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
			
			System.out.println("actRow1Rate                :"+actRow1Rate);
			System.out.println("expRow1Rate                :"+expRow1Rate);
			
			System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
			System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
			
			System.out.println("actRow2Rate                :"+actRow2Rate);
			System.out.println("expRow2Rate                :"+expRow2Rate);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
			
			boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
			boolean expBatchpopupIsDisplaying = true;
			
			
			System.out.println("Batch Popup isDisplaying  : "+actBatchpopupIsDisplaying+"  Value Expected  "+expBatchpopupIsDisplaying);
			click(batchPickOnFIFOIcon);
	    	click(batchOkIcon);
	    	
	    	Thread.sleep(2000);
	    	click(select3rdRow_1stColumn);
	    	
	    	int row1List=Row1SalesInvoicevocherBodyList.size();
			System.err.println(row1List);
			ArrayList<String> row1SalesList = new ArrayList<String>();
			for(int i=0 ; i < row1List ;i++)
		  	{
		  		String data=Row1SalesInvoicevocherBodyList.get(i).getText();
		  		row1SalesList.add(data);
		  	}
			
			String actrow1SalesList = row1SalesList.toString();
			String exprow1SalesList = "[1, HYD, BR-BATCH, 1.00, 1.00, 55.0000, 55.0000, 0.00, 4.0101000, 4.0101000, 4.0101, 04112022EXH, , ]";
			
			
			System.out.println("actrow1SalesList       :"+actrow1SalesList);		
			System.out.println("exprow1SalesList       :"+exprow1SalesList);
			
			int row2List=Row2SalesInvoicevocherBodyList.size();
			System.err.println(row2List);
			ArrayList<String> row2SalesList = new ArrayList<String>();
			for(int i=0 ; i < row2List ;i++)
		  	{
		  		String data=Row2SalesInvoicevocherBodyList.get(i).getText();
		  		row2SalesList.add(data);
		  	}
			
			String actrow2SalesList = row2SalesList.toString();
			String exprow2SalesList = "[2, HYD, BR-BATCH, 10.00, 4.00, 55.0000, 220.0000, 0.00, 100.1234000, 100.1234000, 400.4936, 01012023H, , ]";
			
			
			System.out.println("actrow2SalesList       :"+actrow2SalesList);		
			System.out.println("exprow2SalesList       :"+exprow2SalesList);
			
		
			
	    	Thread.sleep(2000);
	    	
	    	if(actAvailableStock.equalsIgnoreCase(expAvailableStock)
	    			&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate)
	    			&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)
	    			&& actrow1SalesList.equalsIgnoreCase(exprow1SalesList) && actrow2SalesList.equalsIgnoreCase(exprow2SalesList)
	    			) {
	    		
	    		
	    		
	    		return true;
	    	}
	    		else{
	    			
	    		
	    			return false;
	    		}
	    		
	    	}
		
		
				
		public boolean checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
			
			

			// 4th Row
			Thread.sleep(2000);

			//click(select4thRow_1stColumn);
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
			enterText(enterWarehousettxt, "SEC");
			Thread.sleep(3000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "BR-BATCH");
			Thread.sleep(2000);
			tab(enterItemttxt);
			Thread.sleep(2000);
			
			String actAvailableStock1      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStock1	   ="11.00";
			
			
			
			System.out.println("actAvailableStock1       :"+actAvailableStock1);
			System.out.println("expAvailableStock1       :"+expAvailableStock1);		
			
			
			tab(enterAvailableStocktxt);
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			click(select3rdRow_11thColumn);
			
			Thread.sleep(2000);
			
			
			String actRow1Baseqty1		=batchPopUPRow1BaseQuantityTxt.getText();
			String expRow1Baseqty1		="1.00";
			
			
			String actRow1Rate1			=batchPopUPRow1RateTxt.getText();
			String expRow1Rate1			="4.1111";
		
			
			String actRow2Baseqty1		=batchPopUPRow2BaseQuantityTxt.getText();
			String expRow2Baseqty1		="10.00";
			
			
			String actRow2Rate1			=batchPopUPRow2RateTxt.getText();
			String expRow2Rate1			="100.4567";
			
			
		
			
			System.out.println("actRow1Baseqty1             :"+actRow1Baseqty1);
			System.out.println("expRow1Baseqty1             :"+expRow1Baseqty1);
			
			System.out.println("actRow1Rate1                :"+actRow1Rate1);
			System.out.println("expRow1Rate1                :"+expRow1Rate1);
			
			System.out.println("actRow2Baseqty1             :"+actRow2Baseqty1);
			System.out.println("expRow2Baseqty1             :"+expRow2Baseqty1);
			
			System.out.println("actRow2Rate1                :"+actRow2Rate1);
			System.out.println("expRow2Rate1                :"+expRow2Rate1);			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
			
			boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
			boolean expBatchpopupIsDisplaying2 = true;
			
			
			System.out.println("Batch Popup isDisplaying  : "+actBatchpopupIsDisplaying1+"  Value Expected  "+expBatchpopupIsDisplaying2);
			click(batchPickOnFIFOIcon);
	    	click(batchOkIcon);
	    	
	    	Thread.sleep(3000);
	    	
	    	int row3List=Row3SalesInvoicevocherBodyList.size();
			System.err.println(row3List);
			ArrayList<String> row3SalesList = new ArrayList<String>();
			for(int i=0 ; i < row3List ;i++)
		  	{
		  		String data=Row3SalesInvoicevocherBodyList.get(i).getText();
		  		row3SalesList.add(data);
		  	}
			
			String actrow3SalesList = row3SalesList.toString();
			String exprow3SalesList = "[3, SEC, BR-BATCH, 1.00, 1.00, 55.0000, 55.0000, 0.00, 4.1111000, 4.1111000, 4.1111, 04112022EXS, , ]";
			
			
			System.out.println("actrow3SalesList       :"+actrow3SalesList);		
			System.out.println("exprow3SalesList       :"+exprow3SalesList);
			
			Thread.sleep(2000);
			click(select5thRow_1stColumn);
			
			int row4List=Row4SalesInvoicevocherBodyList.size();
			System.err.println(row4List);
			ArrayList<String> row4SalesList = new ArrayList<String>();
			for(int i=0 ; i < row4List ;i++)
		  	{
		  		String data=Row4SalesInvoicevocherBodyList.get(i).getText();
		  		row4SalesList.add(data);
		  	}
			
			String actrow4SalesList = row4SalesList.toString();
			String exprow4SalesList = "[4, SEC, BR-BATCH, 10.00, 4.00, 55.0000, 220.0000, 0.00, 100.4567000, 100.4567000, 401.8268, 01012023S, , ]";
			
			
			System.out.println("actrow4SalesList       :"+actrow4SalesList);		
			System.out.println("exprow4SalesList       :"+exprow4SalesList);
			
			Thread.sleep(2000);
			
			if(actAvailableStock1.equalsIgnoreCase(expAvailableStock1) && actRow1Baseqty1.equalsIgnoreCase(expRow1Baseqty1) 
					&& actRow1Rate1.equalsIgnoreCase(expRow1Rate1) && actRow2Baseqty1.equalsIgnoreCase(expRow2Baseqty1) 
					&& actRow2Rate1.equalsIgnoreCase(expRow2Rate1) && actrow4SalesList.equalsIgnoreCase(exprow4SalesList)
					&& actrow3SalesList.equalsIgnoreCase(exprow3SalesList)){
				
						
				return true;
			}
				else{
					
					
					return false;
				}
				}
		
		public boolean checkSavingSalesInvoiceVoucherFifoItemWith2Warehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{ 	
			
			
			
			Thread.sleep(2000);

			//click(select6thRow_1stColumn);
			enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
			enterText(enterWarehousettxt, "HYD");
			Thread.sleep(2000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "FIFO-BIN");
			Thread.sleep(2000);
			tab(enterItemttxt);
			
			
			Thread.sleep(2000);
			
			String actAvailableStockInHyd      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStockInHyd	   ="11.00";
			
			
			
			System.out.println("actAvailableStockInHyd        :"+actAvailableStockInHyd);
			System.out.println("expAvailableStockInHyd        :"+expAvailableStockInHyd);
			
			
			tab(enterAvailableStocktxt);
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			click(select5thRow_11thColumn);
			

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

			boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
			boolean expBinpopupIsDisplaying = true;
			

			System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
					+ expBinpopupIsDisplaying);

			click(binSearchBtn);
			Thread.sleep(1000);
			IsVisible(binRow1);
			Thread.sleep(1200);
			click(binAutoAllocateBtn);
			Thread.sleep(2000);
			click(binOkBtn);
			
				
			

			// 7th Row

			ClickUsingJs(select6thRow_1stColumn);
			enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
			enterText(enterWarehousettxt, "SEC");
			Thread.sleep(2000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "FIFO-BIN");
			Thread.sleep(2000);
			tab(enterItemttxt);
			
			
			Thread.sleep(2000);
			
			String actAvailableStockInSec      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStockInSec	   ="11.00";
			
			
			
			System.out.println("actAvailableStockInSec       :"+actAvailableStockInSec);
			System.out.println("expAvailableStockInSec       :"+expAvailableStockInSec);
			
			
			tab(enterAvailableStocktxt);
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			click(select6thRow_12thColumn);
			
		
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

			boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
			boolean expBinpopupIsDisplaying1 = true;
			

			System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
					+ expBinpopupIsDisplaying1);

			click(binSearchBtn);
			Thread.sleep(1000);
			IsVisible(binRow1);
			Thread.sleep(1200);
			click(binAutoAllocateBtn);
			Thread.sleep(2000);
			click(binOkBtn);
			
			Thread.sleep(2000);
			
			if(actAvailableStockInHyd.equalsIgnoreCase(expAvailableStockInHyd) && actBinpopupIsDisplaying==expBinpopupIsDisplaying
						&& actAvailableStockInSec.equalsIgnoreCase(expAvailableStockInSec) && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
				

				return true;
			}
			else{
				
				return false;
				
			}
		}
		
		public boolean checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
			
			

			// 8th Row
			Thread.sleep(2000);

			ClickUsingJs(select7thRow_1stColumn);
			enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
			enterText(enterWarehousettxt, "HYD");
			Thread.sleep(2000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "WA-RMA");
			Thread.sleep(2000);
			tab(enterItemttxt);
			
			
			
			Thread.sleep(2000);
			
			String actAvailableStock4      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStock4	   ="11.00";
			
			
			
			System.out.println("actAvailableStock4       :"+actAvailableStock4);
			System.out.println("expAvailableStock4       :"+expAvailableStock4);	
			
			
			tab(enterAvailableStocktxt);
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			click(select7thRow_13thColumn);
			
			Thread.sleep(1000);
			//enterRmatxt.sendKeys(Keys.SPACE);
			Thread.sleep(1000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

			boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
			boolean expRMAPopupIsDisplaying = true;
			

			System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
					+ expRMAPopupIsDisplaying);
			
			click(rmaSearchGridField);
			Thread.sleep(1000);
			
			int count = rmaSerialNos.size();
			
			ArrayList<String> SearchRMA = new ArrayList<String>();
			
			for (int i = 0; i < count; i++) 
			{
				String data = rmaSerialNos.get(i).getText();
				SearchRMA.add(data);
				
				if (data.equalsIgnoreCase("01012023HYD") ||
						data.equalsIgnoreCase("01012023HYD1") ||
						data.equalsIgnoreCase("01012023HYD2") || 
						data.equalsIgnoreCase("01012023HYD3") || 
						data.equalsIgnoreCase("01012023HYD4")) 
				{
					rmaSerialNoCheckBoxes.get(i).click();
				}
			}
			
			String actSearchRMASerialNoList = SearchRMA.toString();
			String expSearchRMASerialNoList = "[01012023HYD, 01012023HYD1, 01012023HYD2, 01012023HYD3, 01012023HYD4, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023HYD8, 01012023HYD9, 18102022EXH1]"; 
		
			
			System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
			System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
			
			
			//click(searchRmaSelectAllGridCheckBox);
			click(searchRmaOkBtn);
			
			int serialcount	=rmaSerialNoList.size();
			ArrayList<String> rmaSerialnos = new ArrayList<String>();
			for (int i = 0; i < serialcount; i++) {
				String data=rmaSerialNoList.get(i).getText();
				rmaSerialnos.add(data);
			}
			
			String actRmaSerialNo 	=rmaSerialnos.toString();
			String expRmaSerialNo	="[01012023HYD, 01012023HYD1, 01012023HYD2, 01012023HYD3, 01012023HYD4]";
		
			
			System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
			System.out.println("expRmaSerialNo       :"+expRmaSerialNo);
			
		
			click(RMAPopupOkBtn);	
			Thread.sleep(2000);
			tab(enterRmatxt);
			
					
	    	Thread.sleep(3000);
	    	
	    	
	    	String actual8throwAvgRate 				= select7thRow_AvgRate.getText();
			String exp8throwAvgRate 				= "85.3846000";
			
			
			String actual8throwOverallAvgRate		= select7thRow_OverAllAvgRate.getText();
			String exp8throwoverallAvgRate			= "85.3846000";
			
			
			String act8throwAvailableStock  		=select7thRow_AvailaleStock.getText();
			String exp8throwAvailableStock 			="11.00";
			
			
			System.out.println("actual8throwAvgRate             :"+actual8throwAvgRate);
			System.out.println("exp8throwAvgRate                :"+exp8throwAvgRate);
			
			System.out.println("actual8throwOverallAvgRate      :"+actual8throwOverallAvgRate);
			System.out.println("exp8throwoverallAvgRate         :"+exp8throwoverallAvgRate);
			
			System.out.println("act8throwAvailableStock         :"+act8throwAvailableStock);
			System.out.println("exp8throwAvailableStock         :"+exp8throwAvailableStock);
			
			if(actAvailableStock4.equalsIgnoreCase(expAvailableStock4) && actRMAPopupIsDisplaying==expRMAPopupIsDisplaying 
					&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) && actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
					&& actual8throwAvgRate.equalsIgnoreCase(exp8throwAvgRate) && actual8throwOverallAvgRate.equalsIgnoreCase(exp8throwoverallAvgRate)
					&& act8throwAvailableStock.equalsIgnoreCase(exp8throwAvailableStock)){
				
				
				return true;
				
			}else{
				
			
				return false;
			}
		}
		
		public boolean checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{

			
			
			// 9th Row
			Thread.sleep(1000);
			//getAction().moveToElement(select9thRow_1stColumn).click().perform();
			ClickUsingJs(select8thRow_1stColumn);
			enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
			enterText(enterWarehousettxt, "SEC");
			Thread.sleep(2000);
			tab(enterWarehousettxt);
			enterText(enterItemttxt, "WA-RMA");
			Thread.sleep(2000);
			tab(enterItemttxt);
			
			
			Thread.sleep(2000);
			
			String actAvailableStock5      =enterAvailableStocktxt.getAttribute("value");
			String expAvailableStock5	   ="11.00";
			
			
			
			System.out.println("actAvailableStock5       :"+actAvailableStock5);
			System.out.println("expAvailableStock5       :"+actAvailableStock5);	
			
			
			
			tab(enterAvailableStocktxt);
			enterText(enterQuantitytxt, "5");
			tab(enterQuantitytxt);
			enterText(enterRatetxt, "55");
			tab(enterRatetxt);
			ClickUsingJs(select8thRow_13thColumn);
			
			

			Thread.sleep(1000);
			//enterRmatxt.sendKeys(Keys.SPACE);
			Thread.sleep(1000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

			boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
			boolean expRMAPopupIsDisplaying1 = true;
			

			System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
					+ expRMAPopupIsDisplaying1);
			
			click(rmaSearchGridField);
			Thread.sleep(1000);
			
			int count = rmaSerialNos.size();
			
			ArrayList<String> SearchRMA = new ArrayList<String>();
			
			for (int i = 0; i < count; i++) 
			{
				String data = rmaSerialNos.get(i).getText();
				SearchRMA.add(data);
				
				if (data.equalsIgnoreCase("01012023SEC") || data.equalsIgnoreCase("01012023SEC1") 
						|| data.equalsIgnoreCase("01012023SEC2") || data.equalsIgnoreCase("01012023SEC3") || 
						data.equalsIgnoreCase("01012023SEC4")) 
				{
					rmaSerialNoCheckBoxes.get(i).click();
				}
			}
			
			String actSearchRMASerialNoList = SearchRMA.toString();
			String expSearchRMASerialNoList = "[01012023SEC, 01012023SEC1, 01012023SEC2, 01012023SEC3, 01012023SEC4, 01012023SEC5, 01012023SEC6, 01012023SEC7, 01012023SEC8, 01012023SEC9, 04112022EXS1]"; 
			
			
			System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
			System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
			
			
			//click(searchRmaSelectAllGridCheckBox);
			ClickUsingJs(searchRmaOkBtn);
			
			int serialcount	=rmaSerialNoList.size();
			ArrayList<String> rmaSerialnos = new ArrayList<String>();
			for (int i = 0; i < serialcount; i++) {
				String data=rmaSerialNoList.get(i).getText();
				rmaSerialnos.add(data);
			}
			
			String actRmaSerialNo 	=rmaSerialnos.toString();
			String expRmaSerialNo	="[01012023SEC, 01012023SEC1, 01012023SEC2, 01012023SEC3, 01012023SEC4]";
			
			
			System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
			System.out.println("expRmaSerialNo       :"+expRmaSerialNo);		
			
			
			click(RMAPopupOkBtn);	
			Thread.sleep(1000);
			tab(enterRmatxt);
			
			
			Thread.sleep(3000);
	    	
	    	
	    	String actual9throwAvgRate 				= select8thRow_AvgRate.getText();
			String exp9throwAvgRate 				= "85.3846000";
			
			
			String actual9throwOverallAvgRate		= select8thRow_OverAllAvgRate.getText();
			String exp9throwoverallAvgRate			= "85.3846000";
			
			
			String act9throwAvailableStock  		=select8thRow_AvailaleStock.getText();
			String exp9throwAvailableStock 			="11.00";
		
			
			System.out.println("actual9throwAvgRate             :"+actual9throwAvgRate);
			System.out.println("exp9throwAvgRate                :"+exp9throwAvgRate);
			
			System.out.println("actual9throwOverallAvgRate      :"+actual9throwOverallAvgRate);
			System.out.println("exp9throwoverallAvgRate         :"+exp9throwoverallAvgRate);
			
			System.out.println("act9throwAvailableStock         :"+act9throwAvailableStock);
			System.out.println("exp9throwAvailableStock         :"+exp9throwAvailableStock);
			
					
		
			Thread.sleep(2000);
			
			//String docno=documentNumberTxt.getAttribute("value");
			ClickUsingJs(voucherSaveBtn);
			
			Thread.sleep(1500);		
			

			click(billRefNewRefTxt);
			Thread.sleep(1000);
			
			click(billRefPickIcon);
			Thread.sleep(1500);
			click(billRefOkBtn);

			Thread.sleep(2000);
			
			
			
			String expMessage1= "Voucher saved successfully";
			String expMessage2= ": 51";
			
			String actMessage = checkValidationMessage(expMessage1);	
		   
		   
		   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
			
			Thread.sleep(2000);

			
			
			if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actAvailableStock5.equalsIgnoreCase(expAvailableStock5) && actRMAPopupIsDisplaying1==expRMAPopupIsDisplaying1 
					&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) && actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
					&& actual9throwAvgRate.equalsIgnoreCase(exp9throwAvgRate) && actual9throwOverallAvgRate.equalsIgnoreCase(exp9throwoverallAvgRate)
					&& act9throwAvailableStock.equalsIgnoreCase(exp9throwAvailableStock)){	
				click(new_CloseBtn);			
				Thread.sleep(2000);
				click(voucherhomeCloseBtn);
				
				return true;
				
			} else {
				click(new_CloseBtn);			
				Thread.sleep(2000);
				click(voucherhomeCloseBtn);
				
				return false;

			}

		}
		
		public boolean checkPostingDetailsInSalesInvoiceVoucher()
				throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
			
			
			click(financialsMenu);
			click(financialsTransactionMenu);
			click(financialsTransactionsSalesMenu);
			click(salesInvoiceVoucher);
			Thread.sleep(1500);
			
			doubleClick(salesInvoiceVoucherNo51);
			
			//click(newBtn);
			checkValidationMessage("Voucher loaded successfully");
			
			click(toggleBtn);
			Thread.sleep(1500);
			click(postingDetailsField);
			Thread.sleep(3500);
			
			int postingDetailsDebitListCount  =postingDetailsDebitList.size();
			ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
			
			for(int i=0; i<postingDetailsDebitListCount; i++)
			{
				String data  =postingDetailsDebitList.get(i).getText();
				postingDetailsDebitListArray.add(data);
			}
			
			String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
			String exppostingDetailsDebitList  ="[Customer A, 1,650.0000, COGS ACC, 2,474.7290]";
			
			System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
			System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
			
			
			int postingDetailsCreditListCount  =postingDetailsCreditList.size();
			ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
			
			for(int i=0; i<postingDetailsCreditListCount; i++)
			{
				String data  =postingDetailsCreditList.get(i).getText();
				postingDetailsCreditListArray.add(data);
			}
			
			String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
			String exppostingDetailsCreditList  ="[Sales - Computers, 1,650.0000, INV-BR, 810.4416, INV-FIFO, 810.4416, INV-WA, 853.8458]";
			
			System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
			System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
			
			
			
			/*String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
			String exppostingDetailsDebitSum  ="4,124.7290";
			
			System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
			System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
			
			String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
			String exppostingDetailsCreditSum  ="4,124.7290";
			
			System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
			System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum); */
			
			
			click(postingDetailsCloseBtn);
			
			if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
			/* && actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) */ 
			/* && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum) */) 
		{

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);

			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);

			return false;

		}

	}

	// Validate unit price value for WA-RMA Item.
	public boolean checkStockValuationReportAfterSavingSalesinvoiceVoucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(1500);
		click(selectAllItemChkBox);

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);

		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for (int i = 0; i < col6ListCount; i++) {
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[1,203.4806, 1,204.8138, 1,105.5660, 3,513.8604]";

		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for (int i = 0; i < col7ListCount; i++) {
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol7List = "[100.2901, 100.4012, 92.1305, 292.8217]";

		System.out.println(
				"*********************************checkStockValuationReport *****************************************");

		System.out.println(actCol61List);
		System.out.println(expCol6List);

		System.out.println(actCol71List);
		System.out.println(expCol7List);

		if (actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}

	public boolean checkBaseDRYTDColumnInBalanceSheetReportAfterSavingSalesinvoiceVoucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homePageMainSearch);
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);

		click(stockLedgerFilterBtn);

		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		Thread.sleep(2000);

		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(2000);
		click(stockLedgerFilterOkBtn);

		Thread.sleep(3000);

		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for (int i = 0; i < col9ListCount; i++) {
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[4,162.2256, 1,195.3843, 1,741.1371, 1,225.7042, , 4,162.2256]";

		System.out.println(
				"*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");

		System.out.println(actCol91List);
		System.out.println(expCol9List);

		if (/* actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkLoginToSUUserAndSavingStockTransferVocher1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		reLogin2("su", "su");

		Thread.sleep(3000);

		System.out.println("Signing");

		// Login User Name is Verify

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		String actUserInfo = userNameDisplayLogo.getText();
		String expUserInfo = "su";
		

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo
				+ ". Value Expected : " + expUserInfo);

		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName = actGetLoginCompanyNameInformation.substring(0, 12);
		String expGetLoginCompanyName = "TESTING COGS";
		
		//companyLogo.click();

		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName
				+ ". Value Expected : " + expGetLoginCompanyName);

		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsStockMenuStockTransfersMenu);
		Thread.sleep(1500);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(stockTransferDatetxt);
		stockTransferDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		stockTransferDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(stockTransferDatetxt, "03/01/2024");
		tab(stockTransferDatetxt);
		tab(stockTransferIssuestxt);
		Thread.sleep(1000);
		enterText(stockTransferWarehousetxt, "HYD");
		Thread.sleep(1000);
		tab(stockTransferWarehousetxt);
		Thread.sleep(2000);

		click(select1stRow_1stColumn);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		String actRow1AvgRate = select1stRow_AvgRate.getText();
		String expRow1AvgRate = "0.0000000";
		

		String actRow1OverAllAvgRate = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate = "0.0000000";
		

		System.out.println("actRow1AvgRate             :" + actRow1AvgRate);
		System.out.println("expRow1AvgRate             :" + expRow1AvgRate);

		System.out.println("actRow1OverAllAvgRate      :" + actRow1OverAllAvgRate);
		System.out.println("expRow1OverAllAvgRate      :" + expRow1OverAllAvgRate);

		click(select1stRow_8thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));

		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		

		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1000);
		click(batchOkIcon);

		Thread.sleep(2000);

		String actRow1AvgRate1 = select1stRow_AvgRate.getText();
		String expRow1AvgRate1 = "100.1234000";
		

		String actRow1OverAllAvgRate1 = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate1 = "100.1234000";
	

		String actRow1BatchText = select1stRow_BatchText.getText();
		String expRow1BatchText = "01012023H";
		

		System.out.println("actRow1AvgRate1             :" + actRow1AvgRate1);
		System.out.println("expRow1AvgRate1             :" + expRow1AvgRate1);

		System.out.println("actRow1OverAllAvgRate1      :" + actRow1OverAllAvgRate1);
		System.out.println("expRow1OverAllAvgRate1      :" + expRow1OverAllAvgRate1);

		System.out.println("actRow1BatchText            :" + actRow1BatchText);
		System.out.println("expRow1BatchText            :" + expRow1BatchText);

		click(select2ndRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select2ndRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023HYD5") || data.equalsIgnoreCase("01012023HYD6")
					|| data.equalsIgnoreCase("01012023HYD7")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023HYD8, 01012023HYD9, 18102022EXH1]";
		

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023HYD5, 01012023HYD6, 01012023HYD7]";
		

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(1000);
		tab(enterRmatxt);

		Thread.sleep(3000);

		String actRow2AvgRate = select2ndRow_AvgRate.getText();
		String expRow2AvgRate = "85.3846000";
		

		String actRow2OverAllAvgRate = select2ndRow_OverAllAvgRate.getText();
		String expRow2OverAllAvgRate = "85.3846000";
		

		System.out.println("actRow2AvgRate             		  :" + actRow2AvgRate);
		System.out.println("expRow2AvgRate             		  :" + expRow2AvgRate);

		System.out.println("actRow2OverAllAvgRate             :" + actRow2OverAllAvgRate);
		System.out.println("expRow2OverAllAvgRate             :" + expRow2OverAllAvgRate);

		// 3rd Row

		click(select3rdRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterWarehousettxt2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select3rdRow_9thColumn);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		tab(bin1Txt);

		// bin2Txt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		String actBinpopupIsDisplaying1 = Boolean.toString(binSearchTxt.isDisplayed());
		String expBinpopupIsDisplaying1 = "true";
		// excelReader.setCellData(xlfile, xlSheetName, 197, 7,
		// actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		// String docno=documentNumberTxt.getAttribute("value");
		click(voucherSaveBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 93";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actRow1AvgRate.equalsIgnoreCase(expRow1AvgRate)
				&& actRMAPopupIsDisplaying1 == expRMAPopupIsDisplaying1
				&& actRow1OverAllAvgRate.equalsIgnoreCase(expRow1OverAllAvgRate)
				&& actRow1AvgRate1.equalsIgnoreCase(expRow1AvgRate1)
				&& actRow1OverAllAvgRate1.equalsIgnoreCase(expRow1OverAllAvgRate1)
				&& actRow1BatchText.equalsIgnoreCase(expRow1BatchText)
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actRow2AvgRate.equalsIgnoreCase(expRow2AvgRate)
				&& actRow2OverAllAvgRate.equalsIgnoreCase(expRow2OverAllAvgRate)
				&& actBatchpopupIsDisplaying==expBatchpopupIsDisplaying
		        && actBinpopupIsDisplaying==expBinpopupIsDisplaying
		        && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			
			return false;

		}
	}
	
	public boolean checkSavingStockTransferVocher2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		

		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsStockMenuStockTransfersMenu);
		Thread.sleep(1500);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(stockTransferDatetxt);
		stockTransferDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		stockTransferDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(stockTransferDatetxt, "04/01/2024");
		tab(stockTransferDatetxt);
		tab(stockTransferIssuestxt);
		Thread.sleep(1000);
		enterText(stockTransferWarehousetxt, "SEC");
		Thread.sleep(1000);
		tab(stockTransferWarehousetxt);
		Thread.sleep(2000);

		ClickUsingJs(select1stRow_1stColumn);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		String actRow1AvgRate = select1stRow_AvgRate.getText();
		String expRow1AvgRate = "0.0000000";
		

		String actRow1OverAllAvgRate = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate = "0.0000000";
	

		System.out.println("actRow1AvgRate             :" + actRow1AvgRate);
		System.out.println("expRow1AvgRate             :" + expRow1AvgRate);

		System.out.println("actRow1OverAllAvgRate      :" + actRow1OverAllAvgRate);
		System.out.println("expRow1OverAllAvgRate      :" + expRow1OverAllAvgRate);

		click(select1stRow_8thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));

		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		

		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1000);
		click(batchOkIcon);

		Thread.sleep(2000);

		String actRow1AvgRate1 = select1stRow_AvgRate.getText();
		String expRow1AvgRate1 = "100.4567000";
		

		String actRow1OverAllAvgRate1 = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate1 = "100.4567000";
		

		String actRow1BatchText = select1stRow_BatchText.getText();
		String expRow1BatchText = "01012023S";
		

		System.out.println("actRow1AvgRate1             :" + actRow1AvgRate1);
		System.out.println("expRow1AvgRate1             :" + expRow1AvgRate1);

		System.out.println("actRow1OverAllAvgRate1      :" + actRow1OverAllAvgRate1);
		System.out.println("expRow1OverAllAvgRate1      :" + expRow1OverAllAvgRate1);

		System.out.println("actRow1BatchText            :" + actRow1BatchText);
		System.out.println("expRow1BatchText            :" + expRow1BatchText);

		click(select2ndRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select2ndRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023SEC5") || data.equalsIgnoreCase("01012023SEC6")
					|| data.equalsIgnoreCase("01012023SEC7")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023SEC5, 01012023SEC6, 01012023SEC7, 01012023SEC8, 01012023SEC9, 04112022EXS1]";
		

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023SEC5, 01012023SEC6, 01012023SEC7]";
		

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(1000);
		tab(enterRmatxt);

		Thread.sleep(3000);

		String actRow2AvgRate = select2ndRow_AvgRate.getText();
		String expRow2AvgRate = "85.3846000";
	

		String actRow2OverAllAvgRate = select2ndRow_OverAllAvgRate.getText();
		String expRow2OverAllAvgRate = "85.3846000";
		

		System.out.println("actRow2AvgRate             		  :" + actRow2AvgRate);
		System.out.println("expRow2AvgRate             		  :" + expRow2AvgRate);

		System.out.println("actRow2OverAllAvgRate             :" + actRow2OverAllAvgRate);
		System.out.println("expRow2OverAllAvgRate             :" + expRow2OverAllAvgRate);
		
		Thread.sleep(1566);

		// 3rd Row

		ClickUsingJs(select3rdRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterWarehousettxt2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		ClickUsingJs(select3rdRow_9thColumn);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		tab(bin1Txt);

		// bin2Txt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		String actBinpopupIsDisplaying1 = Boolean.toString(binSearchTxt.isDisplayed());
		String expBinpopupIsDisplaying1 = "true";
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		// String docno=documentNumberTxt.getAttribute("value");
		ClickUsingJs(voucherSaveBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 94";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actRow1AvgRate.equalsIgnoreCase(expRow1AvgRate)
				&& actRMAPopupIsDisplaying1 == expRMAPopupIsDisplaying1
				&& actRow1OverAllAvgRate.equalsIgnoreCase(expRow1OverAllAvgRate)
				&& actRow1AvgRate1.equalsIgnoreCase(expRow1AvgRate1)
				&& actRow1OverAllAvgRate1.equalsIgnoreCase(expRow1OverAllAvgRate1)
				&& actRow1BatchText.equalsIgnoreCase(expRow1BatchText)
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actRow2AvgRate.equalsIgnoreCase(expRow2AvgRate)
				&& actRow2OverAllAvgRate.equalsIgnoreCase(expRow2OverAllAvgRate)
				&& actBatchpopupIsDisplaying==expBatchpopupIsDisplaying
		        && actBinpopupIsDisplaying==expBinpopupIsDisplaying
		        && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			
			return false;

		}
	}
	
	public boolean checkStockValuationReportAfterStockTransferVoucher1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(1500);
		click(selectAllItemChkBox);

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);

		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for (int i = 0; i < col6ListCount; i++) {
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[1,225.7028, 1,405.3939, 1,195.3841, 3,826.4808]";

		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for (int i = 0; i < col7ListCount; i++) {
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol7List = "[87.5502, 100.3853, 85.3846, 273.3201]";

		System.out.println(
				"*********************************checkStockValuationReport *****************************************");

		System.out.println(actCol61List);
		System.out.println(expCol6List);

		System.out.println(actCol71List);
		System.out.println(expCol7List);

		if (actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
		
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}

	public boolean checkBaseDRYTDColumnInBalanceSheetReportStockTransferVoucher2()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homePageMainSearch);
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);

		click(stockLedgerFilterBtn);

		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		Thread.sleep(2000);

		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(2000);
		click(stockLedgerFilterOkBtn);

		Thread.sleep(3000);

		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for (int i = 0; i < col9ListCount; i++) {
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[4,162.2256, 1,195.3843, 1,741.1371, 1,225.7042, , 4,162.2256]";

		System.out.println(
				"*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");

		System.out.println(actCol91List);
		System.out.println(expCol9List);

		if (/* actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean  checkSavingexcessInStocksVoucherWithALLItemsInInvUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		
		reLogin2("inv", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "inv";	
		

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 12);
		String expGetLoginCompanyName            = "TESTING COGS";   
		
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsExcessesStocks);
		click(newBtn);
		
		checkValidationMessage("Screen opened");
		
		click(excessesStockDatetxt);
		excessesStockDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		excessesStockDatetxt.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		enterText(excessesStockDatetxt, "05/01/2024");
		Thread.sleep(1500);
		tab(excessesStockDatetxt);
		
		enterText(partyAccounttxt, "Cost of goods sold - Computers");
		Thread.sleep(1500);
		tab(partyAccounttxt);
		
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1500);
		tab(salesDepartmenttxt);
		
		
		
		
		ClickUsingJs(select1stRow_1stColumn);
		
		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1000);
		tab(enterWarehousettxt);
				
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select1stRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		click(select1stRow_14thColumn);
		
		enterText(enterBatchtxt, "05012023EXH");
		tab(enterBatchtxt);
		
		// 2nd Row
		
		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);		
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(1000);
		tab(enterWarehousettxt);				
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);	
		
		ClickUsingJs(select2ndRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		
		click(select2ndRow_14thColumn);
		
		enterText(enterBatchtxt, "05012023EXS");
		tab(enterBatchtxt);
		
		//3rd Row
		
		ClickUsingJs(select3rdRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		click(select3rdRow_4thColumn);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		
		ClickUsingJs(select3rdRow_15thColumn);		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);

		// 4th Row

		ClickUsingJs(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		ClickUsingJs(select4thRow_4thColumn);
		
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		
		ClickUsingJs(select4thRow_15thColumn);		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		ClickUsingJs(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		// 5th Row

		ClickUsingJs(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		ClickUsingJs(select5thRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		ClickUsingJs(select5thRow_16thColumn);
		
		Thread.sleep(2000);
		
		String actual5throwAvgRate 			= select5thRow_AvgRateExcess.getText();
		String exp5throwAvgRate			    = "85.3846000";
	
		
		String actual5throwOverallAvgRate   = select5thRow_ExcessStockOverAllAvgRate1.getText();
		String exp5throwoverallAvgRate      = "85.3846000";
		
		
		System.out.println("actual5throwAvgRate       	 :" + actual5throwAvgRate);
		System.out.println("exp5throwAvgRate             :" + exp5throwAvgRate);

		System.out.println("actual5throwOverallAvgRate   :" + actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate      :" + exp5throwoverallAvgRate);
		
		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);
		
		enterText(rmaSerialNumberTxtField, "05012023EXH1");
		ClickUsingJs(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);

		// 6th Row
		Thread.sleep(1000);
		ClickUsingJs(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);		
		tab(enterItemttxt);
		
		ClickUsingJs(select6thRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		ClickUsingJs(select6thRow_16thColumn);
		
		Thread.sleep(2000);
		
		String actual6throwAvgRate 				= select6thRow_AvgRate.getText();
		String exp6throwAvgRate 				= "85.3846000";
	
		
		String actual6throwOverallAvgRate		= select6thRow_ExcessStockOverAllAvgRate1.getText();
		String exp6throwoverallAvgRate			= "85.3846000";
	
		
		System.out.println("actual6throwAvgRate      	 :" + actual6throwAvgRate);
		System.out.println("exp6throwAvgRate          	 :" + exp6throwAvgRate);

		System.out.println("actual6throwOverallAvgRate   :" + actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate      :" + exp6throwoverallAvgRate);
		
		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		enterText(rmaSerialNumberTxtField, "05012023EXS1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(2000);		
		tab(enterRmatxt);
		
		
		Thread.sleep(2000);
		ClickUsingJs(voucherSaveBtn);
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 46";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate)
				&& actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {
			
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return true;
			
		} else {
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return false;

		}

	}
	
	
	public boolean checkPostingDetailsInexcessInStocksVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsExcessesStocks);
		Thread.sleep(1500);
		
		doubleClick(ExcessInStockVoucherNo46);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[INV-BR, 202.5801, INV-FIFO, 202.5801, INV-WA, 202.5801]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[Cost of goods sold - Computers, 607.7403]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="607.7403";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="607.7403";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
	
		
	
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	public boolean checkStockValuationReportAfterExcessStockVoucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(1500);
		click(selectAllItemChkBox);

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);

		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for (int i = 0; i < col6ListCount; i++) {
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[804.3204, 805.3203, 755.3631, 2,365.0038]";

		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for (int i = 0; i < col7ListCount; i++) {
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol7List = "[100.5401, 100.6650, 94.4204, 295.6255]";

		System.out.println(
				"*********************************checkStockValuationReport *****************************************");

		System.out.println(actCol61List);
		System.out.println(expCol6List);

		System.out.println(actCol71List);
		System.out.println(expCol7List);

		if (actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
		
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}

	public boolean checkBaseDRYTDColumnInBalanceSheetReportAfterExcessStock()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homePageMainSearch);
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);

		click(stockLedgerFilterBtn);

		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		Thread.sleep(2000);

		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(2000);
		click(stockLedgerFilterOkBtn);

		Thread.sleep(3000);

		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for (int i = 0; i < col9ListCount; i++) {
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[4,769.9659, 1,397.9644, 1,943.7172, 1,428.2843, , 4,769.9659]";

		System.out.println(
				"*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");

		System.out.println(actCol91List);
		System.out.println(expCol9List);

		if (/* actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath = "//a[@id='2033']")
	public static WebElement inventoryTransactionsStockMenu;
	
	@FindBy(xpath = "//a[@id='2056']/span")
	public static WebElement inventoryTransactionsStockOut;
	
	@FindBy(xpath = "//*[@id='trRender_1']/td[2]/input")
	public static WebElement stockoutHomepageRpw1Checkbx;
	
	@FindBy(xpath = "//a[@id='2034']")
	public static WebElement inventoryTransactionsShortagesInStocks;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement shortagesInStockDatetxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[1]/td[2]")
	public static WebElement batchPopUPRow1BatchNoTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[2]/td[2]")
	public static WebElement batchPopUPRow2BatchNoTxt;
	
	public boolean  checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		reLogin2("su", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "su";	
		

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 12);
		String expGetLoginCompanyName            = "TESTING COGS";   
		
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		Thread.sleep(2000);

		
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsShortagesInStocks);
		click(newBtn);	
		
		checkValidationMessage("Screen opened");
		
		
		click(shortagesInStockDatetxt);
		shortagesInStockDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		shortagesInStockDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(shortagesInStockDatetxt, "06/01/2024");
		Thread.sleep(1000);
		tab(shortagesInStockDatetxt);	
		
		
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		
		
		click(select1stRow_1stColumn);		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1000);
		tab(enterWarehousettxt);	
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select1stRow_9thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNo		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNo		="01012023H";
		
		
		String actRow2BatchNo		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNo		="05012023EXH";
		
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="3.00";
		
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="100.1234";
	
		
		String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty		="1.00";
	
		
		String actRow2Rate			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate			="101.1234";
		
		
	
		System.out.println("actRow1BatchNo             :"+actRow1BatchNo);
		System.out.println("expRow1BatchNo             :"+expRow1BatchNo);
		
		System.out.println("actRow2BatchNo             :"+actRow2BatchNo);
		System.out.println("expRow2BatchNo             :"+expRow2BatchNo);		
		
		
		System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate                :"+actRow1Rate);
		System.out.println("expRow1Rate                :"+expRow1Rate);
		
		System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
		System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
		
		System.out.println("actRow2Rate                :"+actRow2Rate);
		System.out.println("expRow2Rate                :"+expRow2Rate);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1500);
		click(batchOkIcon);
		Thread.sleep(1500);

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select2ndRow_9thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNoSecLocation		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNoSecLocation		="01012023S";
		
		
		String actRow2BatchNoSecLocation		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNoSecLocation		="05012023EXS";
		
		
		String actRow1BaseqtySecLocation		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1BaseqtySecLocation		="3.00";
		
		
		String actRow1RateSecLocation			=batchPopUPRow1RateTxt.getText();
		String expRow1RateSecLocation			="100.4567";
		
		
		String actRow2BaseqtySecLocation		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2BaseqtySecLocation		="1.00";
	
		
		String actRow2RateSecLocation			=batchPopUPRow2RateTxt.getText();
		String expRow2RateSecLocation			="101.4567";
		
		
	
		System.out.println("actRow1BatchNoSecLocation             :"+actRow1BatchNoSecLocation);
		System.out.println("expRow1BatchNoSecLocation             :"+expRow1BatchNoSecLocation);
		
		System.out.println("actRow2BatchNoSecLocation             :"+actRow2BatchNoSecLocation);
		System.out.println("expRow2BatchNoSecLocation             :"+expRow2BatchNoSecLocation);
		
		
		
		System.out.println("actRow1BaseqtySecLocation             :"+actRow1BaseqtySecLocation);
		System.out.println("expRow1BaseqtySecLocation             :"+expRow1BaseqtySecLocation);
		
		System.out.println("actRow1RateSecLocation                :"+actRow1RateSecLocation);
		System.out.println("expRow1RateSecLocation                :"+expRow1RateSecLocation);
		
		System.out.println("actRow2BaseqtySecLocation             :"+actRow2BaseqtySecLocation);
		System.out.println("expRow2BaseqtySecLocation             :"+expRow2BaseqtySecLocation);
		
		System.out.println("actRow2RateSecLocation                :"+actRow2RateSecLocation);
		System.out.println("expRow2RateSecLocation                :"+expRow2RateSecLocation);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying1 = true;
		
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying1 + "  Value Expected  "
				+ expBatchpopupIsDisplaying1);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);
		
		if(actRow1BatchNo.equalsIgnoreCase(expRow1BatchNo) && actRow2BatchNo.equalsIgnoreCase(expRow2BatchNo) 
				&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate) 
				&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)
				&& actRow1BatchNoSecLocation.equalsIgnoreCase(expRow1BatchNoSecLocation) && actRow2BatchNoSecLocation.equalsIgnoreCase(expRow2BatchNoSecLocation)
				&& actRow1BaseqtySecLocation.equalsIgnoreCase(expRow1BaseqtySecLocation) && actRow1RateSecLocation.equalsIgnoreCase(expRow1RateSecLocation)
				&& actRow2BaseqtySecLocation.equalsIgnoreCase(expRow2BaseqtySecLocation) && actRow2RateSecLocation.equalsIgnoreCase(expRow2RateSecLocation)){
			
			
			return true;
		}
			else{
				
				
				return false;
			}
		
	}
	
	public boolean  checkSavingShortagesinStockVoucherWithBrItemTestWareHosue() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		
		// 3rd Row

				ClickUsingJs(select3rdRow_1stColumn);
				Thread.sleep(2000);
				enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
				Thread.sleep(2000);
				enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
				enterText(enterWarehousettxt, "TEST");
				Thread.sleep(3000);
				tab(enterWarehousettxt);
				
				enterText(enterItemttxt, "BR-BATCH");
				Thread.sleep(2000);
				tab(enterItemttxt);
				Thread.sleep(2000);	
				
				enterText(enterQuantitytxt, "6");
				tab(enterQuantitytxt);
				
				enterText(enterRatetxt, "200");
				tab(enterRatetxt);	
				
				click(select3rdRow_9thColumn);
				
				Thread.sleep(3000);
				
				String actRow1BatchNoTestLocation		=batchPopUPRow1BatchNoTxt.getText();
				String expRow1BatchNoTestLocation		="01112022PS";
				
				
				String actRow2BatchNoTestLocation		=batchPopUPRow2BatchNoTxt.getText();
				String expRow2BatchNoTestLocation		="01012023H";
				
				
				String actRow3BatchNoTestLocation		=batchPopUPRow3BatchNoTxt.getText();
				String expRow3BatchNoTestLocation		="01012023S";
				
				
				String actRow1BaseqtyTestLocation		=batchPopUPRow1BaseQuantityTxt.getText();
				String expRow1BaseqtyTestLocation		="2.00";
				
				
				String actRow1RateTestLocation			=batchPopUPRow1RateTxt.getText();
				String expRow1RateTestLocation			="11.1111";
			
				
				String actRow2BaseqtyTestLocation		=batchPopUPRow2BaseQuantityTxt.getText();
				String expRow2BaseqtyTestLocation		="3.00";
				
				
				String actRow2RateTestLocation			=batchPopUPRow2RateTxt.getText();
				String expRow2RateTestLocation			="100.1234";
				
				
				String actRow3BaseqtyTestLocation		=batchPopUPRow3BaseQuantityTxt.getText();
				String expRow3BaseqtyTestLocation		="3.00";
				
				
				String actRow3RateTestLocation			=batchPopUPRow3RateTxt.getText();
				String expRow3RateTestLocation			="100.4567";
				
				
				
			
				System.out.println("actRow1BatchNoTestLocation             :"+actRow1BatchNoTestLocation);
				System.out.println("expRow1BatchNoTestLocation             :"+expRow1BatchNoTestLocation);
				
				System.out.println("actRow2BatchNoTestLocation             :"+actRow2BatchNoTestLocation);
				System.out.println("expRow2BatchNoTestLocation             :"+expRow2BatchNoTestLocation);
				
				System.out.println("actRow3BatchNoTestLocation             :"+actRow3BatchNoTestLocation);
				System.out.println("expRow3BatchNoTestLocation             :"+expRow3BatchNoTestLocation);
				
				System.out.println("actRow3RateTestLocation                :"+actRow3RateTestLocation);
				System.out.println("expRow3RateTestLocation                :"+expRow3RateTestLocation);
				
				System.out.println("actRow3BaseqtyTestLocation             :"+actRow3BaseqtyTestLocation);
				System.out.println("expRow3BaseqtyTestLocation             :"+expRow3BaseqtyTestLocation);
				
				System.out.println("actRow1BaseqtyTestLocation             :"+actRow1BaseqtyTestLocation);
				System.out.println("expRow1BaseqtyTestLocation             :"+expRow1BaseqtyTestLocation);
				
				System.out.println("actRow1RateTestLocation                :"+actRow1RateTestLocation);
				System.out.println("expRow1RateTestLocation                :"+expRow1RateTestLocation);
				
				System.out.println("actRow2BaseqtyTestLocation             :"+actRow2BaseqtyTestLocation);
				System.out.println("expRow2BaseqtyTestLocation             :"+expRow2BaseqtyTestLocation);
				
				System.out.println("actRow2RateTestLocation                :"+actRow2RateTestLocation);
				System.out.println("expRow2RateTestLocation                :"+expRow2RateTestLocation);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
				
				boolean actBatchpopupIsDisplaying2 = batchPickOnFIFOIcon.isDisplayed();
				boolean expBatchpopupIsDisplaying2 = true;
				
				
				System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying2 + "  Value Expected  "
						+ expBatchpopupIsDisplaying2);
				click(batchPickOnFIFOIcon);
				click(batchOkIcon);
				
				Thread.sleep(2000);
				click(select6thRow_1stColumn);

				int row3List=Row3ShortageInStockVoucherBodyList.size();
				System.err.println(row3List);
				ArrayList<String> row3ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row3List ;i++)
			  	{
			  		String data=Row3ShortageInStockVoucherBodyList.get(i).getText();
			  		row3ShortageStockList.add(data);
			  	}
				
				String actrow3ShortageStockList = row3ShortageStockList.toString();
				String exprow3ShortageStockList = "[3, TEST, BR-BATCH, 2.00, 200.0000, 400.0000, 11.1111000, 11.1111000, 22.2222, 01112022PS, , ]";
				
				
				System.out.println("actrow3ShortageStockList       :"+actrow3ShortageStockList);		
				System.out.println("exprow3ShortageStockList       :"+exprow3ShortageStockList);
				
				
				int row4List=Row4ShortageInStockVoucherBodyList.size();
				System.err.println(row4List);
				ArrayList<String> row4ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row4List ;i++)
			  	{
			  		String data=Row4ShortageInStockVoucherBodyList.get(i).getText();
			  		row4ShortageStockList.add(data);
			  	}
				
				String actrow4ShortageStockList = row4ShortageStockList.toString();
				String exprow4ShortageStockList = "[4, TEST, BR-BATCH, 3.00, 200.0000, 600.0000, 100.1234000, 100.1234000, 300.3702, 01012023H, , ]";
				
				
				System.out.println("actrow4ShortageStockList       :"+actrow4ShortageStockList);		
				System.out.println("exprow4ShortageStockList       :"+exprow4ShortageStockList);
				
				int row5List=Row5ShortageInStockVoucherBodyList.size();
				System.err.println(row5List);
				ArrayList<String> row5ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row5List ;i++)
			  	{
			  		String data=Row5ShortageInStockVoucherBodyList.get(i).getText();
			  		row5ShortageStockList.add(data);
			  	}
				
				String actrow5ShortageStockList = row5ShortageStockList.toString();
				String exprow5ShortageStockList = "[5, TEST, BR-BATCH, 1.00, 200.0000, 200.0000, 100.4567000, 100.4567000, 100.4567, 01012023S, , ]";
				
				
				System.out.println("actrow5ShortageStockList       :"+actrow5ShortageStockList);		
				System.out.println("exprow5ShortageStockList       :"+exprow5ShortageStockList);
		
				if(actRow1BatchNoTestLocation.equalsIgnoreCase(expRow1BatchNoTestLocation) && actRow2BatchNoTestLocation.equalsIgnoreCase(expRow2BatchNoTestLocation) 
						&& actRow3BatchNoTestLocation.equalsIgnoreCase(expRow3BatchNoTestLocation) && actRow3BaseqtyTestLocation.equalsIgnoreCase(expRow3BaseqtyTestLocation) 
						&& actRow3RateTestLocation.equalsIgnoreCase(expRow3RateTestLocation) && actRow1BaseqtyTestLocation.equalsIgnoreCase(expRow1BaseqtyTestLocation)
						&& actRow1RateTestLocation.equalsIgnoreCase(expRow1RateTestLocation) && actRow2BaseqtyTestLocation.equalsIgnoreCase(expRow2BaseqtyTestLocation) 
						&& actRow2RateTestLocation.equalsIgnoreCase(expRow2RateTestLocation) && actrow3ShortageStockList.equalsIgnoreCase(exprow3ShortageStockList)
						&& actrow4ShortageStockList.equalsIgnoreCase(exprow4ShortageStockList) && actrow5ShortageStockList.equalsIgnoreCase(exprow5ShortageStockList)){
					
					
					return true;
				}
					else{
						
						
						return false;
					}
		
	          }
	
	public boolean  checkSavingShortagesinStockVoucherWithFifoItem3WareHosue() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
	  
// 3rd Row

		//click(select6thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select6thRow_10thColumn);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		
		//7th Row
		
		ClickUsingJs(select7thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select7thRow_10thColumn);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
	

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		//tab(bin1Txt);
		
		//8th Row
		
		ClickUsingJs(select8thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "TEST");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "6");
		tab(enterQuantitytxt);

		enterText(enterRatetxt, "200");
		tab(enterRatetxt);

		click(select8thRow_10thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying2 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying2 = true;
	

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying2 + "  Value Expected  "
				+ expBinpopupIsDisplaying2);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		// tab(bin1Txt);
		Thread.sleep(2000);

		if (actBinpopupIsDisplaying == expBinpopupIsDisplaying && actBinpopupIsDisplaying1 == expBinpopupIsDisplaying1
				&& actBinpopupIsDisplaying2 == expBinpopupIsDisplaying2) {

			
			return true;

		} else {

			
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemHydWareHosue()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		// 9th Row

		ClickUsingJs(select9thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);

		click(select9thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023HYD8")
					|| data.equalsIgnoreCase("01012023HYD9")
					|| data.equalsIgnoreCase("05012023EXH1")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023HYD8, 01012023HYD9, 05012023EXH1, 18102022EXH1]";
		

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023HYD8, 01012023HYD9, 05012023EXH1]";
		

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row9List = Row9ShortageInStockVoucherBodyList.size();
		System.err.println(row9List);
		ArrayList<String> row9ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row9List; i++) {
			String data = Row9ShortageInStockVoucherBodyList.get(i).getText();
			row9ShortageStockList.add(data);
		}

		String actrow9ShortageStockList = row9ShortageStockList.toString();
		String exprow9ShortageStockList = "[9, HYD, WA-RMA, 3.00, 100.0000, 300.0000, 87.3728000, 87.3728000, 262.1184, , , 01012023HYD8,01012023HYD9,05012023EXH1]";
		

		System.out.println("actrow9ShortageStockList       :" + actrow9ShortageStockList);
		System.out.println("exprow9ShortageStockList       :" + exprow9ShortageStockList);

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow9ShortageStockList.equalsIgnoreCase(exprow9ShortageStockList)) {

			
			return true;

		} else {

		
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemSecWareHosue()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		

		// 10th Row

		ClickUsingJs(select10thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);

		click(select10thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023SEC8")
					|| data.equalsIgnoreCase("01012023SEC9")
					|| data.equalsIgnoreCase("04112022EXS1")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023SEC8, 01012023SEC9, 04112022EXS1, 05012023EXS1]";
		

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023SEC8, 01012023SEC9, 04112022EXS1]";
		

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row10List = Row10ShortageInStockVoucherBodyList.size();
		System.err.println(row10List);
		ArrayList<String> row10ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row10List; i++) {
			String data = Row10ShortageInStockVoucherBodyList.get(i).getText();
			row10ShortageStockList.add(data);
		}

		String actrow10ShortageStockList = row10ShortageStockList.toString();
		String exprow10ShortageStockList = "[10, SEC, WA-RMA, 3.00, 100.0000, 300.0000, 87.3728000, 87.3728000, 262.1184, , , 01012023SEC8,01012023SEC9,04112022EXS1]";
		

		System.out.println("actrow10ShortageStockList       :" + actrow10ShortageStockList);
		System.out.println("exprow10ShortageStockList       :" + exprow10ShortageStockList);

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow10ShortageStockList.equalsIgnoreCase(exprow10ShortageStockList)) {

		
			return true;

		} else {

			
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemTestWareHosue()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		

		// 11th Row

		ClickUsingJs(select11thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "TEST");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "6");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "200");
		tab(enterRatetxt);

		click(select11thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("20062022PS8")
					|| data.equalsIgnoreCase("20082021PS8")
					|| data.equalsIgnoreCase("01012023HYD5")
					|| data.equalsIgnoreCase("01012023HYD6")
					|| data.equalsIgnoreCase("01012023HYD7")
					|| data.equalsIgnoreCase("01012023SEC5")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[20062022PS8, 20082021PS8, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023SEC5, 01012023SEC6, 01012023SEC7]";
		

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[20062022PS8, 20082021PS8, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023SEC5]";
		

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row11List = Row11ShortageInStockVoucherBodyList.size();
		System.err.println(row11List);
		ArrayList<String> row11ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row11List; i++) {
			String data = Row11ShortageInStockVoucherBodyList.get(i).getText();
			row11ShortageStockList.add(data);
		}

		String actrow11ShortageStockList = row11ShortageStockList.toString();
		String exprow11ShortageStockList = "[11, TEST, WA-RMA, 6.00, 200.0000, 1,200.0000, 87.3728000, 87.3728000, 524.2368, , , 20062022PS8,20082021PS8,01012023HYD5,01012023HYD6,01012023HYD7,01012023SEC5]";
		

		System.out.println("actrow11ShortageStockList       :" + actrow11ShortageStockList);
		System.out.println("exprow11ShortageStockList       :" + exprow11ShortageStockList);

		/*String docno = documentNumberTxt.getAttribute("value");
		Thread.sleep(2000);*/
		click(voucherSaveBtn);
		
		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 46";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);


		

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actMessage.startsWith(expMessage1)
				&& actMessage.endsWith(expMessage2)
				&& actrow11ShortageStockList.equalsIgnoreCase(exprow11ShortageStockList)) {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return true;

		} else {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return false;
		}

	}
	
	
	public boolean checkPostingDetailsInShortagesInStockVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsShortagesInStocks);
		
		Thread.sleep(2000);
		
		doubleClick(ExcessInStockVoucherNo46);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[COGS-Shortages in Stock, 3,098.0520]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[INV-BR, 1,024.7894, INV-FIFO, 1,024.7894, INV-WA, 1,048.4732]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="3,098.0520";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="3,098.0520";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
	
		
	
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	
	public boolean  checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		/*Thread.sleep(3000);
		click(userNameDisplayLogo);
		Thread.sleep(1000);
		click(logoutOption);		
		Thread.sleep(3000);
		
		String unamelt=excelReader.getCellData(xlSheetName, 373, 5);

		String pawslt=excelReader.getCellData(xlSheetName, 374, 5);
		
		LoginPage.enterUserName(unamelt);	     
        LoginPage.enterPassword(pawslt);
        
		
		 Select company = new Select(companyDropDownList);
		 company.selectByValue(excelReader.getCellData(xlSheetName, 375, 5));
		 Thread.sleep(2000);
		 
  
        LoginPage.clickOnSignInBtn();  */
		
		reLogin2("inv", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "inv";	
		//excelReader.setCellData(xlfile, xlSheetName, 373, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 12);
		String expGetLoginCompanyName            = "TESTING COGS"; 
		//excelReader.setCellData(xlfile, xlSheetName, 374, 7, actGetLoginCompanyName);
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		
		Thread.sleep(1000);
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(financialsTransactionsPurchaseMenuPurchasesReturns);
		click(newBtn);	
		
		checkValidationMessage("Screen opened");
		
		click(purchaseReturnsDatetxt);
		purchaseReturnsDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		purchaseReturnsDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(purchaseReturnsDatetxt, "07/01/2024");
		tab(purchaseReturnsDatetxt);
		
		Thread.sleep(2000);
		//enterText(purchasesReturnsAccounttxt, excelReader.getCellData(xlSheetName, 377, 5));
		//tab(purchasesReturnsAccounttxt);
		//Thread.sleep(2000);
		enterText(purchasesReturnsvendorAccounttxt, "Vendor A");
		Thread.sleep(2000);
		//click(purchasesReturnsDepartmenttxt);
		enterText(purchasesReturnsDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(purchasesReturnsDepartmenttxt);			
		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
			
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select1stRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);
		Thread.sleep(2000);
		
		click(select1stRow_11thColumn);			
		Thread.sleep(2000);
		
		String actRow1BatchNo		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNo		="05012023EXH";
		//excelReader.setCellData(xlfile, xlSheetName, 375, 7, actRow1BatchNo);
		
		/*String actRow2BatchNo		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNo		=excelReader.getCellData(xlSheetName, 376, 6);
		excelReader.setCellData(xlfile, xlSheetName, 376, 7, actRow2BatchNo);*/
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 377, 7, actRow1Baseqty);
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="101.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 378, 7, actRow1Rate);
		
		/*String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty		=excelReader.getCellData(xlSheetName, 379, 6);
		excelReader.setCellData(xlfile, xlSheetName, 379, 7, actRow2Baseqty);
		
		String actRow2Rate			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate			=excelReader.getCellData(xlSheetName, 380, 6);
		excelReader.setCellData(xlfile, xlSheetName, 380, 7, actRow2Rate);*/
		
	
		System.out.println("actRow1BatchNo             :"+actRow1BatchNo);
		System.out.println("expRow1BatchNo             :"+expRow1BatchNo);
		
		/*System.out.println("actRow2BatchNo             :"+actRow2BatchNo);
		System.out.println("expRow2BatchNo             :"+expRow2BatchNo);*/		
		
		
		System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate                :"+actRow1Rate);
		System.out.println("expRow1Rate                :"+expRow1Rate);
		
		/*System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
		System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
		
		System.out.println("actRow2Rate                :"+actRow2Rate);
		System.out.println("expRow2Rate                :"+expRow2Rate);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 381, 7, actBatchpopupIsDisplaying);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);

		// 2nd Row
		
		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		click(select2ndRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);
		
		click(select2ndRow_11thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNoSecLocation		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNoSecLocation		="05012023EXS";
		//excelReader.setCellData(xlfile, xlSheetName, 382, 7, actRow1BatchNoSecLocation);
	
		
		String actRow1BaseqtySecLocation		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1BaseqtySecLocation		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 383, 7, actRow1BaseqtySecLocation);
		
		String actRow1RateSecLocation			=batchPopUPRow1RateTxt.getText();
		String expRow1RateSecLocation			="101.4567";
		//excelReader.setCellData(xlfile, xlSheetName, 384, 7, actRow1RateSecLocation);
		
	
	
		System.out.println("actRow1BatchNoSecLocation             :"+actRow1BatchNoSecLocation);
		System.out.println("expRow1BatchNoSecLocation             :"+expRow1BatchNoSecLocation);			
		
		System.out.println("actRow1BaseqtySecLocation             :"+actRow1BaseqtySecLocation);
		System.out.println("expRow1BaseqtySecLocation             :"+expRow1BaseqtySecLocation);
		
		System.out.println("actRow1RateSecLocation                :"+actRow1RateSecLocation);
		System.out.println("expRow1RateSecLocation                :"+expRow1RateSecLocation);
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 385, 7, actBatchpopupIsDisplaying1);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying1 + "  Value Expected  "
				+ expBatchpopupIsDisplaying1);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);
		
		if(actRow1BatchNo.equalsIgnoreCase(expRow1BatchNo) /*&& actRow2BatchNo.equalsIgnoreCase(expRow2BatchNo)*/ 
				&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate) 
				/*&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)*/
				&& actRow1BatchNoSecLocation.equalsIgnoreCase(expRow1BatchNoSecLocation) 
				&& actRow1BaseqtySecLocation.equalsIgnoreCase(expRow1BaseqtySecLocation) 
				&& actRow1RateSecLocation.equalsIgnoreCase(expRow1RateSecLocation)){
			
			//excelReader.setCellData(xlfile, xlSheetName, 373, 8, resPass);
			
			return true;
		}
			else{
				
				//excelReader.setCellData(xlfile, xlSheetName, 373, 8, resFail);
				return false;
			} 
	
	
	}
	
	
	public boolean  checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
	//excelReader=new ExcelReader(POJOUtility.getExcelPath());
	// 3rd Row

		ClickUsingJs(select3rdRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "HYD");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "FIFO-BIN");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select3rdRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	click(select3rdRow_12thColumn);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

	boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
	boolean expBinpopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 388, 7, actBinpopupIsDisplaying);


	System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
			+ expBinpopupIsDisplaying);

	click(binSearchBtn);
	Thread.sleep(1000);
	IsVisible(binRow1);
	Thread.sleep(1200);
	click(binAutoAllocateBtn);
	Thread.sleep(2000);
	click(binOkBtn);

	// 4th Row

	ClickUsingJs(select4thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "SEC");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "FIFO-BIN");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select4thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	
	click(select4thRow_12thColumn);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

	boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
	boolean expBinpopupIsDisplaying1 = true;
	//excelReader.setCellData(xlfile, xlSheetName, 389, 7, actBinpopupIsDisplaying1);


	System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
			+ expBinpopupIsDisplaying1);

	click(binSearchBtn);
	Thread.sleep(1000);
	IsVisible(binRow1);
	Thread.sleep(1200);
	click(binAutoAllocateBtn);
	Thread.sleep(2000);
	click(binOkBtn);

	if (actBinpopupIsDisplaying==expBinpopupIsDisplaying
			&& actBinpopupIsDisplaying1==expBinpopupIsDisplaying1) {
		
		//excelReader.setCellData(xlfile, xlSheetName, 388, 8, resPass);
		return true;

	} else {
		//excelReader.setCellData(xlfile, xlSheetName, 388, 8, resFail);
		return false;
	}

}
	
	public boolean  checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());	
	// 5th Row

	ClickUsingJs(select5thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "HYD");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "WA-RMA");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select5thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	click(select5thRow_12thColumn);
	
	Thread.sleep(2000);
	
	//enterRmatxt.sendKeys(Keys.SPACE);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
	boolean expRMAPopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 396, 7, actRMAPopupIsDisplaying);


	System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
			+ expRMAPopupIsDisplaying);
	
	
	Thread.sleep(1000);
	click(rmaSearchGridField);
	Thread.sleep(1000);
	
	int count = rmaSerialNos.size();
	
	ArrayList<String> SearchRMA = new ArrayList<String>();
	
	for (int i = 0; i < count; i++) 
	{
		String data = rmaSerialNos.get(i).getText();
		SearchRMA.add(data);
		
		if (data.equalsIgnoreCase("18102022EXH1")) 
		{
			rmaSerialNoCheckBoxes.get(i).click();
		}
	}
	
	String actSearchRMASerialNoList = SearchRMA.toString();
	String expSearchRMASerialNoList = "[18102022EXH1]"; 
	//excelReader.setCellData(xlfile, xlSheetName, 397, 7, actSearchRMASerialNoList);

	
	System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
	System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
	
	
	//click(searchRmaSelectAllGridCheckBox);
	click(searchRmaOkBtn);
	
	int serialcount	=rmaSerialNoList.size();
	ArrayList<String> rmaSerialnos = new ArrayList<String>();
	for (int i = 0; i < serialcount; i++) {
		String data=rmaSerialNoList.get(i).getText();
		rmaSerialnos.add(data);
	}
	
	String actRmaSerialNo 	=rmaSerialnos.toString();
	String expRmaSerialNo	="[18102022EXH1]";
	//excelReader.setCellData(xlfile, xlSheetName, 398, 7, actRmaSerialNo);

	
	System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
	System.out.println("expRmaSerialNo       :"+expRmaSerialNo);
	

	click(RMAPopupOkBtn);	
	Thread.sleep(2000);
	tab(enterRmatxt);
	
	Thread.sleep(2000);
	int row5List=Row5ShortageInStockVoucherBodyList.size();
	System.err.println(row5List);
	ArrayList<String> row5ShortageStockList = new ArrayList<String>();
	for(int i=0 ; i < row5List ;i++)
  	{
  		String data=Row5ShortageInStockVoucherBodyList.get(i).getText();
  		row5ShortageStockList.add(data);
  	}
	
	String actrow5ShortageStockList = row5ShortageStockList.toString();
	String exprow5ShortageStockList = "[5, HYD, WA-RMA, INV-WA, 1.00, 100.0000, 100.0000, 0.00, 87.3728000, 87.3728000, 0.00, , , 18102022EXH1]";
	//excelReader.setCellData(xlfile, xlSheetName, 399, 7, actrow5ShortageStockList);

	
	System.out.println("actrow5ShortageStockList       :"+actrow5ShortageStockList);		
	System.out.println("exprow5ShortageStockList       :"+exprow5ShortageStockList);
	
	
	
	
	
	if(actRMAPopupIsDisplaying==expRMAPopupIsDisplaying && actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) 
			&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actrow5ShortageStockList.equalsIgnoreCase(exprow5ShortageStockList)){
		
		//excelReader.setCellData(xlfile, xlSheetName, 396, 8, resPass);
		return true;
		
	}else{
		
		//excelReader.setCellData(xlfile, xlSheetName, 396, 8, resFail);
		return false;
	}


			
	}
	
	public boolean  checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		
	//excelReader=new ExcelReader(POJOUtility.getExcelPath());	
	// 6th Row

		ClickUsingJs(select6thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "SEC");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "WA-RMA");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select6thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	click(select6thRow_11thColumn);
	
	Thread.sleep(2000);

	
	//enterRmatxt.sendKeys(Keys.SPACE);
	Thread.sleep(1000);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
	boolean expRMAPopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 401, 7, actRMAPopupIsDisplaying);

	System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
			+ expRMAPopupIsDisplaying);
	
	click(rmaSearchGridField);
	Thread.sleep(1000);
	
	int count = rmaSerialNos.size();
	
	ArrayList<String> SearchRMA = new ArrayList<String>();
	
	for (int i = 0; i < count; i++) 
	{
		String data = rmaSerialNos.get(i).getText();
		SearchRMA.add(data);
		
		if (data.equalsIgnoreCase("05012023EXS1")) 
		{
			rmaSerialNoCheckBoxes.get(i).click();
		}
	}
	
	String actSearchRMASerialNoList = SearchRMA.toString();
	String expSearchRMASerialNoList = "[05012023EXS1]"; 
	//excelReader.setCellData(xlfile, xlSheetName, 402, 7, actSearchRMASerialNoList);
	
	System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
	System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
	
	
	//click(searchRmaSelectAllGridCheckBox);
	click(searchRmaOkBtn);
	
		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[05012023EXS1]";
		// excelReader.setCellData(xlfile, xlSheetName, 403, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row6List = Row6ShortageInStockVoucherBodyList.size();
		System.err.println(row6List);
		ArrayList<String> row6ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row6List; i++) {
			String data = Row6ShortageInStockVoucherBodyList.get(i).getText();
			row6ShortageStockList.add(data);
		}

		String actrow6ShortageStockList = row6ShortageStockList.toString();
		String exprow6ShortageStockList = "[6, SEC, WA-RMA, INV-WA, 1.00, 100.0000, 100.0000, 0.00, 87.3728000, 87.3728000, 0.00, , , 05012023EXS1]";
		// excelReader.setCellData(xlfile, xlSheetName, 404, 7,
		// actrow6ShortageStockList);

		System.out.println("actrow6ShortageStockList       :" + actrow6ShortageStockList);
		System.out.println("exprow6ShortageStockList       :" + exprow6ShortageStockList);

		/*
		 * String docno=documentNumberTxt.getAttribute("value");
		 * Thread.sleep(2000);
		 */
		click(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 48";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		/*
		 * String actMessage = SavingInBackgroundTrial();
		 * 
		 * HashSet<String> expMsg = new HashSet();
		 * 
		 * expMsg.add(excelReader.getCellData(xlSheetName, 405, 6));
		 * expMsg.add(excelReader.getCellData(xlSheetName, 406, 6));
		 * excelReader.setCellData(xlfile, xlSheetName, 405, 7, actMessage);
		 * 
		 * String expMessage = expMsg.toString();
		 * 
		 * System.out.println("Actual Message    : " + actMessage);
		 * System.out.println("Expected Message  : " + expMessage);
		 */

		/*
		 * boolean actSaving=SavingInBackground(docno); boolean expSaving=true;
		 * 
		 * String expMessage1= excelReader.getCellData(xlSheetName, 405, 6);
		 * String expMessage2= excelReader.getCellData(xlSheetName, 406, 6);
		 * 
		 * String actMessage = checkValidationMessage(expMessage1);
		 * excelReader.setCellData(xlfile, xlSheetName, 405, 7, actMessage);
		 * 
		 * 
		 * 
		 * System.out.println("SavingMessage  :  "+actMessage
		 * +" Value Expected : "+expMessage1+" "+expMessage2);
		 */

		if (actRMAPopupIsDisplaying == expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow6ShortageStockList.equalsIgnoreCase(exprow6ShortageStockList)
				&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 401, 8, resPass);

			return true;

		} else {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 401, 8, resFail);
			return false;
		}

	}
	
	public boolean checkPostingDetailsInPurchaseReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(financialsTransactionsPurchaseMenuPurchasesReturns);
		
		Thread.sleep(2000);
		
		doubleClick(purchasesReturnsVoucherNo48);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[Vendor A, 600.0000]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[INV-BR, 202.5801, INV-FIFO, 101.1234, INV-WA, 174.7455, COGS ACC, 121.5510]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="600.0000";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="600.0000";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
		click(postingDetailsCloseBtn);
		
		Thread.sleep(2500);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}

	public boolean checkSavingSalesReturnsVoucherWithAllItemsINVUser()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		// excelReader=new ExcelReader(POJOUtility.getExcelPath());

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(financialsTransactionsSalesMenuSalesReturn);
		Thread.sleep(2500);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(salesDatetxt);
		salesDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		salesDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(salesDatetxt, "08/03/2024");
		tab(salesDatetxt);
		Thread.sleep(2000);
		enterText(salesAccounttxt, "Sales - Computers");
		tab(salesAccounttxt);
		Thread.sleep(2000);
		enterText(customerAccounttxt, "Customer A");
		Thread.sleep(2000);
		click(customerAccounttxt);
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		Thread.sleep(3000);

		// 1st Row

		click(select1stRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		click(select1stRow_10thColumn);

		enterText(enterBatchtxt, "01012023H");
		tab(enterBatchtxt);

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		click(select2ndRow_10thColumn);

		enterText(enterBatchtxt, "05012023EXS");
		tab(enterBatchtxt);

		// 3rd Row

		click(select3rdRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		click(select3rdRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 407, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		// 4th Row

		click(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select4thRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 408, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);

		// 5th Row

		click(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select5thRow_12thColumn);
		Thread.sleep(2000);
		String actual5throwAvgRate = select5thRow_SalesReturnsAvgRate.getText();
		String exp5throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 409, 7, actual5throwAvgRate);

		String actual5throwOverallAvgRate = select5thRow_SalesReturnsOverallAvgRate.getText();
		String exp5throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 410, 7, actual5throwOverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 411, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		enterText(rmaSerialNumberTxtField, "08012023SH1,1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		// tab(enterBatCodetxt);

		// 6th Row
		Thread.sleep(1000);
		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select6thRow_11thColumn);
		Thread.sleep(2000);

		String actual6throwAvgRate = select6thRow_SalesReturnsAvgRate.getText();
		String exp6throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 412, 7, actual6throwAvgRate);

		String actual6throwOverallAvgRate = select6thRow_SalesReturnsOverallAvgRate.getText();
		String exp6throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 413, 7, actual6throwOverallAvgRate);

		System.out.println("actual5throwAvgRate       	 :" + actual5throwAvgRate);
		System.out.println("exp5throwAvgRate             :" + exp5throwAvgRate);

		System.out.println("actual5throwOverallAvgRate   :" + actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate      	:" + exp5throwoverallAvgRate);

		System.out.println("actual6throwAvgRate      	 :" + actual6throwAvgRate);
		System.out.println("exp6throwAvgRate          	 :" + exp6throwAvgRate);

		System.out.println("actual6throwOverallAvgRate   :" + actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate      :" + exp6throwoverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 414, 7, actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		enterText(rmaSerialNumberTxtField, "08012023SS1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		

		Thread.sleep(3000);
		click(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 50";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate)
				&& actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resPass);
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resFail);
			return false;

		}

	}
	
	public boolean checkPostingDetailsInSalesReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(financialsTransactionsSalesMenuSalesReturn);
		
		Thread.sleep(2000);
		
		doubleClick(salesReturnsVoucherNo50);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[Sales - Computers, 6.0000, INV-BR, 201.5801, INV-FIFO, 101.4567, INV-WA, 174.7456]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[Customer A, 6.0000, COGS-Sales Return, 477.7824]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
	/*	String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="483.7824";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="483.7824";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum); */
		
		
		
	
		
	
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
		/* && actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) */ 
		/* && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum) */) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	public boolean checkSavingSalesReturnsVoucherWithAllItemsINVUser1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		// excelReader=new ExcelReader(POJOUtility.getExcelPath());

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(financialsTransactionsSalesMenuSalesReturn);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(salesDatetxt);
		salesDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		salesDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(salesDatetxt, "09/03/2024");
		tab(salesDatetxt);
		Thread.sleep(2000);
		enterText(salesAccounttxt, "Sales - Computers");
		tab(salesAccounttxt);
		Thread.sleep(2000);
		enterText(customerAccounttxt, "Customer A");
		Thread.sleep(2000);
		click(customerAccounttxt);
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		Thread.sleep(3000);

		// 1st Row

		click(select1stRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-PB");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "10");
		tab(enterRatetxt);
		
		Thread.sleep(2000);
		
		//click(select1stRow_9thColumn);
		
		String actPriceBookRate  =select1stRow_9thColumn.getAttribute("data-value");
		String expPriceBookRate  ="10.1";
		
		System.out.println("actPriceBookRate   :"+actPriceBookRate);
		System.out.println("expPriceBookRate   :"+expPriceBookRate);
		
		
		
		//click(priceBookrate);

		click(select1stRow_10thColumn);

		enterText(enterBatchtxt, "09032023SH1");   //01012023H
		tab(enterBatchtxt);

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-PB");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "10");
		tab(enterRatetxt);
		
		Thread.sleep(2000);
		
		String actPriceBookRateRow2  =select2ndRow_9thColumn.getAttribute("data-value");
		String expPriceBookRateRow2  ="10.1";
		
		System.out.println("actPriceBookRateRow2   :"+actPriceBookRateRow2);
		System.out.println("expPriceBookRateRow2   :"+expPriceBookRateRow2);

		/*click(select2ndRow_10thColumn);

		enterText(enterBatchtxt, "09032023SS1");
		tab(enterBatchtxt);

		// 3rd Row

		click(select3rdRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);*/

		click(select2ndRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 407, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		// 4th Row

		click(select3rdRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-PB");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "10");
		tab(enterRatetxt);
		
		
		Thread.sleep(2000);
		
		String actPriceBookRateRow3  =select3rdRow_9thColumn.getAttribute("data-value");
		String expPriceBookRateRow3  ="10.1";
		
		System.out.println("actPriceBookRateRow3   :"+actPriceBookRateRow3);
		System.out.println("expPriceBookRateRow3   :"+expPriceBookRateRow3);
		
		
		
		
		
		
		/*click(select4thRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 408, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(3000);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);

		// 5th Row

		click(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);*/
		click(select3rdRow_12thColumn);
		Thread.sleep(2000);
		/*String actual5throwAvgRate = select5thRow_SalesReturnsAvgRate.getText();
		String exp5throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 409, 7, actual5throwAvgRate);

		String actual5throwOverallAvgRate = select5thRow_SalesReturnsOverallAvgRate.getText();
		String exp5throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 410, 7, actual5throwOverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);*/
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 411, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		enterText(rmaSerialNumberTxtField, "09012023SH1,1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		// tab(enterBatCodetxt);

		// 6th Row
		/*Thread.sleep(1000);
		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select6thRow_11thColumn);
		Thread.sleep(2000);

		String actual6throwAvgRate = select6thRow_SalesReturnsAvgRate.getText();
		String exp6throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 412, 7, actual6throwAvgRate);

		String actual6throwOverallAvgRate = select6thRow_SalesReturnsOverallAvgRate.getText();
		String exp6throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 413, 7, actual6throwOverallAvgRate);

		System.out.println("actual5throwAvgRate       	 :" + actual5throwAvgRate);
		System.out.println("exp5throwAvgRate             :" + exp5throwAvgRate);

		System.out.println("actual5throwOverallAvgRate   :" + actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate      	:" + exp5throwoverallAvgRate);

		System.out.println("actual6throwAvgRate      	 :" + actual6throwAvgRate);
		System.out.println("exp6throwAvgRate          	 :" + exp6throwAvgRate);

		System.out.println("actual6throwOverallAvgRate   :" + actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate      :" + exp6throwoverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 414, 7, actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		enterText(rmaSerialNumberTxtField, "08012023SS1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);*/

		

		Thread.sleep(3000);
		click(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 51";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actPriceBookRate.equalsIgnoreCase(expPriceBookRate) && actPriceBookRateRow2.equalsIgnoreCase(expPriceBookRateRow2)
				&& actPriceBookRateRow3.equalsIgnoreCase(expPriceBookRateRow3)) {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resPass);
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resFail);
			return false;

		}

	}
	
	public boolean checkPostingDetailsInSalesReturnsVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(financialsTransactionsSalesMenuSalesReturn);
		
		Thread.sleep(2000);
		
		doubleClick(salesReturnsVoucherNo51);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[Sales - Computers, 30.0000, BR-PB, 10.1000, FIFO-PB, 10.1000, WA-PB, 10.1000]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[Customer A, 30.0000, COGS-Sales Return, 30.3000]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="60.3000";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="60.3000";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
	
		
	
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	public boolean checkStockValuationReportAfterSalesReturnsVoucher2()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(1500);
		click(selectAllItemChkBox);

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);

		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for (int i = 0; i < col6ListCount; i++) {
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[10.1000, 10.1000, 10.1000, 174.7456, 101.4567, 201.5801, 508.0824]";

		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for (int i = 0; i < col7ListCount; i++) {
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol7List = "[10.1000, 10.1000, 10.1000, 87.3728, 50.7284, 100.7901, 269.1912]";

		System.out.println(
				"*********************************checkStockValuationReport *****************************************");

		System.out.println(actCol61List);
		System.out.println(expCol6List);

		System.out.println(actCol71List);
		System.out.println(expCol7List);

		if (actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
		
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}

	public boolean checkBaseDRYTDColumnInBalanceSheetReportAfterSalesReturnsVoucher2()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homePageMainSearch);
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);

		click(stockLedgerFilterBtn);

		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		Thread.sleep(2000);

		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(2000);
		click(stockLedgerFilterOkBtn);

		Thread.sleep(3000);

		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for (int i = 0; i < col9ListCount; i++) {
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[349.4913, 919.2611, 402.4949, 10.1000, 10.1000, 10.1000, , 1,701.5473]";

		System.out.println(
				"*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");

		System.out.println(actCol91List);
		System.out.println(expCol9List);

		if (/* actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='140']")
	public static WebElement  inventoryTransactionsSalesMenu; 
	
	@FindBy(xpath="//*[@id='2055']/span")
	public static WebElement  deliveryNotesVoucher1;
	
	
	@FindBy(xpath="//*[@id='2056']/span")
	public static WebElement  salesInvoice1Voucher;
	
	@FindBy(xpath = "//td[text()='SalOrd:2']//..//input")
	public static List<WebElement> workFlowSalesOrderList;
	
	
	@FindBy(xpath = "//td[text()='DN1:2']//..//input")
	public static List<WebElement> workFlowDeliveryNotes1List;
	
	@FindBy(xpath="(//input[@class='FButton-Primary FPopupChildren mx-1'])[4]")
	public static WebElement  workFlowOkBtnCL;
	
	public boolean checkSavingDeliveryNotes1VoucherUsingLinks()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		reLogin2("su", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "SU";	
		//excelReader.setCellData(xlfile, xlSheetName, 373, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 12);
		String expGetLoginCompanyName            = "TESTING COGS"; 
		//excelReader.setCellData(xlfile, xlSheetName, 374, 7, actGetLoginCompanyName);
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		
		Thread.sleep(1000);
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsSalesMenu);
		click(deliveryNotesVoucher1);	

		Thread.sleep(2000);
		click(newBtn);

		checkValidationMessage("Screen opened");
		
        customerAccounttxt.sendKeys(Keys.CONTROL + "l");
		
		Thread.sleep(3000);
		
		
		int workFlowSalesOrderListCount   =workFlowSalesOrderList.size();
		
		for(int i=0; i<workFlowSalesOrderListCount; i++ )
		{
			workFlowSalesOrderList.get(i).click();
		}
		
		click(workFlowOkBtnCL);
		
		Thread.sleep(2000);
		
		ClickUsingJs(select1stRow_11thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNo       =batchPopUPRow1BatchNoTxt.getText();		
		String expRow1BatchNo       ="01012023H";
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 136, 7, actRow1Baseqty);
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="100.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 137, 7, actRow1Rate);
		
		System.out.println("actRow1BatchNo   :"+actRow1BatchNo);
		System.out.println("expRow1BatchNo   :"+expRow1BatchNo);
		
		System.out.println("actRow1Baseqty   :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty   :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate   :"+actRow1Rate);
		System.out.println("expRow1Rate   :"+expRow1Rate);
		
		Thread.sleep(1500);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 385, 7, actBatchpopupIsDisplaying1);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying1 + "  Value Expected  "
				+ expBatchpopupIsDisplaying1);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);
		
		ClickUsingJs(select3rdRow_1stColumn);
		
		Thread.sleep(2000);
    	
    	int row1List=Row1SalesInvoicevocherBodyList.size();
		System.err.println(row1List);
		ArrayList<String> row1SalesList = new ArrayList<String>();
		for(int i=0 ; i < row1List ;i++)
	  	{
	  		String data=Row1SalesInvoicevocherBodyList.get(i).getText();
	  		row1SalesList.add(data);
	  	}
		
		String actrow1SalesList = row1SalesList.toString();
		String exprow1SalesList = "[1, BR-BATCH, 1.00, 1.00, SalOrd:2, 22.0000, 22.0000, 0.00, 100.1234000, 100.1234000, 100.1234, 01012023H, , ]";
		//excelReader.setCellData(xlfile, xlSheetName, 143, 7, actrow1SalesList);
		
		System.out.println("actrow1SalesList       :"+actrow1SalesList);		
		System.out.println("exprow1SalesList       :"+exprow1SalesList);
		
		Thread.sleep(2000);
		
		
		
		String actual5throwAvgRate = select3rdRow_DeliveryNote1AvgRate.getText();
		String exp5throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 409, 7, actual5throwAvgRate);

		String actual5throwOverallAvgRate = select3rdRow_DeliveryNote1OverAllAvgRate.getText();
		String exp5throwoverallAvgRate = "87.3728000";
		
		System.out.println("actual5throwAvgRate  :"+actual5throwAvgRate);
		System.out.println("exp5throwAvgRate     :"+exp5throwAvgRate);
		
		System.out.println("actual5throwOverallAvgRate  :"+actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate     :"+exp5throwoverallAvgRate);
		
		
		ClickUsingJs(select3rdRow_13thColumn);
		
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		// excelReader.setCellData(xlfile, xlSheetName, 191, 7,
		// actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("08012023SH1")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[08012023SH1]";
		// excelReader.setCellData(xlfile, xlSheetName, 192, 7,
		// actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[08012023SH1]";
		// excelReader.setCellData(xlfile, xlSheetName, 193, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(1000);
		tab(enterRmatxt);

		Thread.sleep(3000);
		
		Thread.sleep(3000);
		click(voucherSaveBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actRow1BatchNo.equalsIgnoreCase(expRow1BatchNo)
				&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate) 
				&& actBatchpopupIsDisplaying1==expBatchpopupIsDisplaying1 && actrow1SalesList.equalsIgnoreCase(exprow1SalesList) 
		&& actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate) && actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
		&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) && actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo))
		 {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);;
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return false;
		}
	}
	
	public boolean checkPostingDetailsInDeliveryNotes1Voucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsSalesMenu);
		click(deliveryNotesVoucher1);
		
		Thread.sleep(2000);
		
		doubleClick(deliverNotes1VoucherNo2);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[WIP Account, 288.6196]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[INV-BR, 100.1234, INV-FIFO, 101.1234, INV-WA, 87.3728]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="288.6196";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="288.6196";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	public boolean checkSavingSalesInvoice1Voucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(salesInvoice1Voucher);	

		Thread.sleep(2000);
		click(newBtn);

		checkValidationMessage("Screen opened");
		
        customerAccounttxt.sendKeys(Keys.CONTROL + "l");
		
		Thread.sleep(3000);
		
		
		int workFlowDeliveryNotes1ListCount   =workFlowDeliveryNotes1List.size();
		
		for(int i=0; i<workFlowDeliveryNotes1ListCount; i++ )
		{
			workFlowDeliveryNotes1List.get(i).click();
		}
		
		click(workFlowOkBtnCL);
		
		Thread.sleep(2000);
		
		
		enterText(stockAccounttxt, "Sales - Computers");
		Thread.sleep(1500);
		tab(stockAccounttxt);
		
		
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1500);
		tab(salesDepartmenttxt);
		
		Thread.sleep(1500);		
		
		Thread.sleep(2000);
    	
    	int row1List=Row1SalesInvoicevocherBodyList.size();
		System.err.println(row1List);
		ArrayList<String> row1SalesList = new ArrayList<String>();
		for(int i=0 ; i < row1List ;i++)
	  	{
	  		String data=Row1SalesInvoicevocherBodyList.get(i).getText();
	  		row1SalesList.add(data);
	  	}
		
		String actrow1SalesList = row1SalesList.toString();
		String exprow1SalesList = "[1, BR-BATCH, 0.00, 1.00, DN1:2, 22.0000, 22.0000, 0.00, 100.1234000, 100.1234000, 100.1234, 01012023H, ]";
		//excelReader.setCellData(xlfile, xlSheetName, 143, 7, actrow1SalesList);
		
		System.out.println("actrow1SalesList       :"+actrow1SalesList);		
		System.out.println("exprow1SalesList       :"+exprow1SalesList);
		
		Thread.sleep(2000);
		
		int row2List=Row2SalesInvoicevocherBodyList.size();
		System.err.println(row2List);
		ArrayList<String> row2SalesList = new ArrayList<String>();
		for(int i=0 ; i < row2List ;i++)
	  	{
	  		String data=Row2SalesInvoicevocherBodyList.get(i).getText();
	  		row2SalesList.add(data);
	  	}
		
		String actrow2SalesList = row2SalesList.toString();
		String exprow2SalesList = "[2, FIFO-BIN, 3.00, 1.00, DN1:2, 22.0000, 22.0000, 0.00, 101.4567000, 101.4567000, 101.4567, , BIN1]";
		//excelReader.setCellData(xlfile, xlSheetName, 144, 7, actrow2SalesList);
		
		System.out.println("actrow2SalesList       :"+actrow2SalesList);		
		System.out.println("exprow2SalesList       :"+exprow2SalesList);
		
		int row3List=Row3SalesInvoicevocherBodyList.size();
		System.err.println(row3List);
		ArrayList<String> row3SalesList = new ArrayList<String>();
		for(int i=0 ; i < row3List ;i++)
	  	{
	  		String data=Row3SalesInvoicevocherBodyList.get(i).getText();
	  		row3SalesList.add(data);
	  	}
		
		String actrow3SalesList = row3SalesList.toString();
		String exprow3SalesList = "[3, WA-RMA, 3.00, 1.00, DN1:2, 22.0000, 22.0000, 0.00, 87.3728000, 87.3728000, 87.3728, , ]";
		
		
		System.out.println("actrow3SalesList       :"+actrow3SalesList);		
		System.out.println("exprow3SalesList       :"+exprow3SalesList);
		
		Thread.sleep(3000);
		ClickUsingJs(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actrow1SalesList.equalsIgnoreCase(exprow1SalesList) 
		&& actrow2SalesList.equalsIgnoreCase(actrow2SalesList) && actrow3SalesList.equalsIgnoreCase(exprow3SalesList))
		 {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);;
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			return false;
		}
	}
	
	public boolean checkPostingSalesInvoice1Voucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(salesInvoice1Voucher);
		
		Thread.sleep(2000);
		
		doubleClick(salesInvoice1VoucherNo2);
		
		//click(newBtn);
		checkValidationMessage("Voucher loaded successfully");
		
		click(toggleBtn);
		Thread.sleep(1500);
		click(postingDetailsField);
		Thread.sleep(3500);
		
		int postingDetailsDebitListCount  =postingDetailsDebitList.size();
		ArrayList<String> postingDetailsDebitListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsDebitListCount; i++)
		{
			String data  =postingDetailsDebitList.get(i).getText();
			postingDetailsDebitListArray.add(data);
		}
		
		String actpostingDetailsDebitList  =postingDetailsDebitListArray.toString();
		String exppostingDetailsDebitList  ="[Customer A, 66.0000, COGS ACC, 288.6196]";
		
		System.out.println("actpostingDetailsDebitList       :"+actpostingDetailsDebitList);
		System.out.println("exppostingDetailsDebitList       :"+exppostingDetailsDebitList);
		
		
		int postingDetailsCreditListCount  =postingDetailsCreditList.size();
		ArrayList<String> postingDetailsCreditListArray =new ArrayList<>();
		
		for(int i=0; i<postingDetailsCreditListCount; i++)
		{
			String data  =postingDetailsCreditList.get(i).getText();
			postingDetailsCreditListArray.add(data);
		}
		
		String actpostingDetailsCreditList  =postingDetailsCreditListArray.toString();
		String exppostingDetailsCreditList  ="[Sales - Computers, 66.0000, WIP Account, 288.6196]";
		
		System.out.println("actpostingDetailsCreditList       :"+actpostingDetailsCreditList);
		System.out.println("exppostingDetailsCreditList       :"+exppostingDetailsCreditList);
		
		
		
		String actpostingDetailsDebitSum  =postingDetailsDebitSum.getText();
		String exppostingDetailsDebitSum  ="354.6196";
		
		System.out.println("actpostingDetailsDebitSum       :"+actpostingDetailsDebitSum);
		System.out.println("exppostingDetailsDebitSum       :"+exppostingDetailsDebitSum);
		
		String actpostingDetailsCreditSum  =postingDetailsCreditSum.getText();
		String exppostingDetailsCreditSum  ="354.6196";
		
		System.out.println("actpostingDetailsCreditSum       :"+actpostingDetailsCreditSum);
		System.out.println("exppostingDetailsCreditSum       :"+exppostingDetailsCreditSum);
		
		
		
		click(postingDetailsCloseBtn);
		
		if (actpostingDetailsDebitList.equalsIgnoreCase(exppostingDetailsDebitList) && actpostingDetailsCreditList.equalsIgnoreCase(exppostingDetailsCreditList)
				&& actpostingDetailsDebitSum.equalsIgnoreCase(exppostingDetailsDebitSum) && actpostingDetailsCreditSum.equalsIgnoreCase(exppostingDetailsCreditSum)) 
	{

		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return true;

	} else {
		click(new_CloseBtn);
		Thread.sleep(1000);
		click(voucherhomeCloseBtn);

		return false;

	}

}
	
	@FindBy(xpath = "//i[@class='icon-custamize hiconright2']")
	public static WebElement itemQueryCustomization;
	
	
	@FindBy(xpath = "//label[contains(text(),'Buying Rate')]//span")
	public static WebElement buyingRateCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Buying Rate')]/input")
	public static WebElement buyingRateCheckBoxIsSelected;
	
	@FindBy(xpath = "//label[contains(text(),'Buying Val 1')][1]/span")
	public static WebElement buyingVal1CheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Buying Val 1')][1]/input")
	public static WebElement buyingVal1CheckBoxIsSelected;
	
	@FindBy(xpath = "//input[@value='Ok']")
	public static WebElement itemQueryCustomizationOkBtn;
	
	@FindBy(xpath = "(//*[@id='8585216'])[1]")
	public static WebElement buyingRateTxt;
	
	@FindBy(xpath = "(//*[@id='8585217'])[1]")
	public static WebElement buyingVal1Txt;
	
	
	
	public boolean validteItemQueryStocksInWAPBtem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(itemqueryMenu);
		click(itemTxt);
		Thread.sleep(2000);
		
		click(itemQueryCustomization);
		
		Thread.sleep(1500);
		
		if (buyingRateCheckBoxIsSelected.isSelected()==false) {
			
			click(buyingRateCheckBox);	
			
		}
		
		Thread.sleep(2500);
		
		if (buyingVal1CheckBoxIsSelected.isSelected()==false) {
			
			click(buyingVal1CheckBox);	
			
		}
		
		Thread.sleep(1500);
		
		click(itemQueryCustomizationOkBtn);
		
		Thread.sleep(1500);
		
		
		enterText(itemTxt, "WA-PB");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);
		
		
		String actlbuyingRateTxt       = getText(buyingRateTxt);
		String expbuyingRateTxt        = "10.1";
		
		
		String actlbuyingVal1Txt       = getText(buyingVal1Txt);
		String expbuyingVal1Txt        = "0";
		
		

		String actlCurrentStock       = getText(currentStockTxt);
		String expCurrentStock        = "1.00";
		

		String actlavgStockRate       = getText(avgStockRateTxt);
		String expavgStockRate        = "10.1000";
		

		String actlstockValueTxt      = getText(stockValueTxt);
		String expstockValueTxt       = "10.1000";
		
		

		System.out.println("=====Stocks In Batch Items======");

		System.out.println("actlbuyingRateTxt           :" + actlbuyingRateTxt);
		System.out.println("expbuyingRateTxt            :" + expbuyingRateTxt);
		
		System.out.println("actlbuyingVal1Txt           :" + actlbuyingVal1Txt);
		System.out.println("expbuyingVal1Txt            :" + expbuyingVal1Txt);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlbuyingRateTxt.equalsIgnoreCase(expbuyingRateTxt) && actlbuyingVal1Txt.equalsIgnoreCase(expbuyingVal1Txt) 
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			
			return true;
		} else {
			
			return false;
		}

	}
	
	@FindBy(xpath = "//i[@class='icon-filter2 hiconright2']")
	public static WebElement reportsCustomizationBtn;
	
	@FindBy(xpath = "//span[@id='id_Trans_spanPlus']")
	public static WebElement reportsCustomizationItemExpandBtn;
	
	@FindBy(xpath = "//li[contains(text(),'Buying Rate')]")
	public static WebElement buyingRateField;
	
	@FindBy(xpath = "//li[contains(text(),'Buying Val 1')][1]")
	public static WebElement buyingVal1Field;
	
	
	@FindBy(xpath = "//a[@id='Save']")
	public static WebElement customizationSaveBtn;
	
	
	public boolean checkStockValuationReportAfterSalesInvoice1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		Thread.sleep(1500);
		
		click(reportsCustomizationBtn);
		
		Thread.sleep(5000);
		
		click(reportsCustomizationItemExpandBtn);
		Thread.sleep(3000);
		
		doubleClick(buyingRateField);
		Thread.sleep(2000);
		
		doubleClick(buyingVal1Field);
		Thread.sleep(2000);
		
		ClickUsingJs(customizationSaveBtn);
		
		String expMessage  ="Data saved successfully";
		String actMessage   =checkValidationMessage(expMessage);
		
		System.out.println("actMessage  :"+actMessage);
		System.out.println("expMessage  :"+expMessage);
		
		
		
		
		
		
		click(selectAllItemChkBox);

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		
		
		

		int col6ListCount = reportsCol6List.size();
		ArrayList<String> col6ListArray = new ArrayList<String>();
		for (int i = 0; i < col6ListCount; i++) {
			String data = reportsCol6List.get(i).getText();
			col6ListArray.add(data);
		}
		String actCol61List = col6ListArray.toString();
		String expCol6List = "[10.1000, 10.1000, 10.1000, 262.1183, 304.0368, 302.3701, 898.8252]";

		int col7ListCount = reportsCol7List.size();
		ArrayList<String> col7ListArray = new ArrayList<String>();
		for (int i = 0; i < col7ListCount; i++) {
			String data = reportsCol7List.get(i).getText();
			col7ListArray.add(data);
		}
		String actCol71List = col7ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol7List = "[10.1000, 10.1000, 10.1000, 87.3728, 101.3456, 100.7900, 319.8084]";
		
		
		
		int col10ListCount = reportsCol10List.size();
		ArrayList<String> col10ListArray = new ArrayList<String>();
		for (int i = 0; i < col10ListCount; i++) {
			String data = reportsCol10List.get(i).getText();
			col10ListArray.add(data);
		}
		String actCol101List = col10ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol10List = "[10.10, 10.10, 10.10, , , , 30.00]";
		
		
		
		/*int col11ListCount = reportsCol11List.size();
		ArrayList<String> col11ListArray = new ArrayList<String>();
		for (int i = 0; i < col11ListCount; i++) {
			String data = reportsCol11List.get(i).getText();
			col11ListArray.add(data);
		}
		String actCol11List = col11ListArray.toString(); // Validate unit price value for WA-RMA Item.
		String expCol11List = "[7.00, 8.00, 9.00, 1.00, 2.00, 3.00, 30.00]";*/

		System.out.println(
				"*********************************checkStockValuationReport *****************************************");

		System.out.println(actCol61List);
		System.out.println(expCol6List);

		System.out.println(actCol71List);
		System.out.println(expCol7List);
		
		System.out.println(actCol101List);
		System.out.println(expCol10List);
		
		/*System.out.println(actCol11List);
		System.out.println(expCol11List);*/

		if (actCol61List.equalsIgnoreCase(expCol6List) && actCol71List.equalsIgnoreCase(expCol7List)
				&& actCol101List.equalsIgnoreCase(expCol10List) /*&& actCol11List.equalsIgnoreCase(expCol11List)*/) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
		
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}

	public boolean checkBaseDRYTDColumnInBalanceSheetReportAfterSalesInvoice1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(homePageMainSearch);
		enterText(homePageMainSearch, "Balance Sheet");
		Thread.sleep(2000);
		click(balanceSheetElement);
		Thread.sleep(2000);
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(3000);

		click(stockLedgerFilterBtn);

		Thread.sleep(2000);
		click(stockLedgerFilterField);
		Thread.sleep(1500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterText));

		boolean actFilterpopupIsDisplaying = stockLedgerFilterText.isDisplayed();
		boolean expFilterpopupIsDisplaying = true;

		System.out.println("Filter Popup isDisplaying  : " + actFilterpopupIsDisplaying + "  Value Expected  "
				+ expFilterpopupIsDisplaying);

		Thread.sleep(2000);

		enterText(filterCustamizationAccountTxt, "Inventory Group");
		Thread.sleep(2000);
		click(stockLedgerFilterOkBtn);

		Thread.sleep(3000);

		int col9ListCount = reportsCol9List.size();
		ArrayList<String> col9ListArray = new ArrayList<String>();
		for (int i = 0; i < col9ListCount; i++) {
			String data = reportsCol9List.get(i).getText();
			col9ListArray.add(data);
		}
		String actCol91List = col9ListArray.toString();
		String expCol9List = "[262.1185, 1,216.7123, 302.3715, 10.1000, 10.1000, 10.1000, , 1,811.5023]";

		System.out.println(
				"*********************************checkBalanceSheetBaseDR(YTD)ColumnReport *****************************************");

		System.out.println(actCol91List);
		System.out.println(expCol9List);

		if (/* actCol61List.equalsIgnoreCase(expCol6List) && */actCol91List.equalsIgnoreCase(expCol9List)) {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(1000);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	public boolean validteItemQueryStocksInBatchItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		 //excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(itemqueryMenu);
		click(itemTxt);
		Thread.sleep(2000);
		enterText(itemTxt, "BR-BATCH");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);
		
		String actlOpenStockQuantity  = getText(openStockQuantityTxt);
		String expOpenStockQuantity   = "10.00";
		//

		String actlCurrentStock       = getText(currentStockTxt);
		String expCurrentStock        = "3.00";
		

		String actlavgStockRate       = getText(avgStockRateTxt);
		String expavgStockRate        = "100.7900";
		

		String actlstockValueTxt      = getText(stockValueTxt);
		String expstockValueTxt       = "302.3701";
		
		

		System.out.println("=====Stocks In Batch Items======");

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			
			return true;
		} else {
			
			return false;
		}

	}

	public boolean validteItemQueryStocksInFifoItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		click(itemTxt);
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.BACK_SPACE);
		enterText(itemTxt, "FIFO-BIN");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);

		String actlOpenStockQuantity = getText(openStockQuantityTxt);
		String expOpenStockQuantity  = "10.00";
		

		String actlCurrentStock      = getText(currentStockTxt);
		String expCurrentStock       = "3.00";
		

		String actlavgStockRate      = getText(avgStockRateTxt);
		String expavgStockRate       = "101.3456";
		

		String actlstockValueTxt     = getText(stockValueTxt);
		String expstockValueTxt      = "304.0368";
		

		System.out.println("=====Stocks In FIFO Items======");

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			return true;
		} else {
			
			return false;
		}

	}

	public boolean validteItemQueryStocksInWAItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		click(itemTxt);
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.BACK_SPACE);
		enterText(itemTxt, "WA-RMA");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);

		String actlOpenStockQuantity = getText(openStockQuantityTxt);
		String expOpenStockQuantity  = "10.00";
		

		String actlCurrentStock      = getText(currentStockTxt);
		String expCurrentStock       = "3.00";
		

		String actlavgStockRate      = getText(avgStockRateTxt);
		String expavgStockRate       = "87.3728";
		

		String actlstockValueTxt     = getText(stockValueTxt);
		String expstockValueTxt      = "262.1183";
		
		
		Thread.sleep(2000);

		//ScrollToElement(balanceByWarehouseBtn);
		click(balanceByWarehouseBtn);

		Thread.sleep(3000);

		int count = row1BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow1 = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = row1BalanceByWareHouseList.get(i).getText();
			warehouseRow1.add(data);
		}

		String actwarehouseRow1List = warehouseRow1.toString();
		String expWarehouseRow1List = "[1, SEC, 1.00, 0.00, 1.00, 87.3728, 87.3728]";
		

		int count1 = row2BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow2 = new ArrayList<String>();

		for (int i = 0; i < count1; i++) {
			String data = row2BalanceByWareHouseList.get(i).getText();
			warehouseRow2.add(data);
		}

		String actwarehouseRow2List = warehouseRow2.toString();
		String expWarehouseRow2List = "[2, TEST, 2.00, 0.00, 2.00, 67.0435, 134.0870]";
		

		int count2 = row3BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow3 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) {
			String data = row3BalanceByWareHouseList.get(i).getText();
			warehouseRow3.add(data);
		}

		String actwarehouseRow3List = warehouseRow3.toString();
		String expWarehouseRow3List = "[, , 3.00, 0.00, 3.00, , 221.4598]";
		

		System.out.println("=====Stocks In WA Items======");
		
		

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

	
		
		System.out.println("===========Balance By Warehouse=======");

		System.out.println(actwarehouseRow1List);
		System.out.println(expWarehouseRow1List);

		System.out.println(actwarehouseRow2List);
		System.out.println(expWarehouseRow2List);

		System.out.println(actwarehouseRow3List);
		System.out.println(expWarehouseRow3List);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)
				&& actwarehouseRow1List.equalsIgnoreCase(expWarehouseRow1List)
				&& actwarehouseRow2List.equalsIgnoreCase(expWarehouseRow2List)
				&& actwarehouseRow3List.equalsIgnoreCase(expWarehouseRow3List)) 
		{
			
			
			return true;
		} else {
			
			return false;
		}

	}
	
public boolean validteItemQueryStocksInBRPBItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	
	click(inventoryMenu);
	click(InventoryReportsMenu);
	click(itemqueryMenu);
	click(itemTxt);
	Thread.sleep(2000);
	enterText(itemTxt, "BR-PB");
	Thread.sleep(3000);
	click(getStockBtn);
	Thread.sleep(3000);
		
		
	/*	click(itemTxt);
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.BACK_SPACE);
		enterText(itemTxt, "BR-PB");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000); */

		String actlOpenStockQuantity = getText(openStockQuantityTxt);
		String expOpenStockQuantity  = "0.00";
		

		String actlCurrentStock      = getText(currentStockTxt);
		String expCurrentStock       = "1.00";
		

		String actlavgStockRate      = getText(avgStockRateTxt);
		String expavgStockRate       = "10.1000";
		

		String actlstockValueTxt     = getText(stockValueTxt);
		String expstockValueTxt      = "10.1000";
		

		System.out.println("=====Stocks In BR-PB Items======");

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			return true;
		} else {
			
			return false;
		}

	}


public boolean validteItemQueryStocksInFIFOPBItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

	
	
	click(itemTxt);
	Thread.sleep(2000);
	itemTxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	itemTxt.sendKeys(Keys.BACK_SPACE);
	enterText(itemTxt, "FIFO-PB");
	Thread.sleep(3000);
	click(getStockBtn);
	Thread.sleep(3000);

	String actlOpenStockQuantity = getText(openStockQuantityTxt);
	String expOpenStockQuantity  = "0.00";
	

	String actlCurrentStock      = getText(currentStockTxt);
	String expCurrentStock       = "1.00";
	

	String actlavgStockRate      = getText(avgStockRateTxt);
	String expavgStockRate       = "10.1000";
	

	String actlstockValueTxt     = getText(stockValueTxt);
	String expstockValueTxt      = "10.1000";
	

	System.out.println("=====Stocks In FIFO-PB Items======");

	System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
	System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

	System.out.println("actlCurrentStock           :" + actlCurrentStock);
	System.out.println("expCurrentStock            :" + expCurrentStock);

	System.out.println("actlavgStockRate           :" + actlavgStockRate);
	System.out.println("expavgStockRate            :" + expavgStockRate);

	System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
	System.out.println("expstockValueTxt           :" + expstockValueTxt);

	if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
			&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
			&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
			&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
		
		return true;
	} else {
		
		return false;
	}

}

public boolean validteItemQueryStocksInWAPBItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

	
	
	click(itemTxt);
	Thread.sleep(2000);
	itemTxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	itemTxt.sendKeys(Keys.BACK_SPACE);
	enterText(itemTxt, "WA-PB");
	Thread.sleep(3000);
	click(getStockBtn);
	Thread.sleep(3000);

	String actlOpenStockQuantity = getText(openStockQuantityTxt);
	String expOpenStockQuantity  = "0.00";
	

	String actlCurrentStock      = getText(currentStockTxt);
	String expCurrentStock       = "1.00";
	

	String actlavgStockRate      = getText(avgStockRateTxt);
	String expavgStockRate       = "10.1000";
	

	String actlstockValueTxt     = getText(stockValueTxt);
	String expstockValueTxt      = "10.1000";
	

	System.out.println("=====Stocks In WA-PB Items======");

	System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
	System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

	System.out.println("actlCurrentStock           :" + actlCurrentStock);
	System.out.println("expCurrentStock            :" + expCurrentStock);

	System.out.println("actlavgStockRate           :" + actlavgStockRate);
	System.out.println("expavgStockRate            :" + expavgStockRate);

	System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
	System.out.println("expstockValueTxt           :" + expstockValueTxt);

	if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
			&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
			&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
			&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
		
		return true;
	} else {
		
		return false;
	}

}



@FindBy(xpath = "//td[text()='Total']")
public static WebElement lastRowTotal;

public boolean checkStockStatementReporFortBrBatchItem()
		throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	

	click(inventoryMenu);
	click(InventoryReportsMenu);
	click(InventoryStockStatementMenu);
	Thread.sleep(3000);

	int rowcount = stockLedgerHometableRowCount.size();

	System.out.println(rowcount);

	for (int i = 0; i < rowcount; i++) {
		String actName = ledgerHometableItemNamesList.get(i).getText();

		System.out.println(actName);

		if (actName.equalsIgnoreCase("BR-BATCH")) {
			stockLedgerHometableItemChkboxList.get(i).click();
		}
	}

	dropDown(sl_DateOptionDropdown, "1");
	Thread.sleep(2000);
	click(sl_OkBtn);
	Thread.sleep(2000);
	click(stockLedgerLastBtn);
	Thread.sleep(1500);
    IsVisible(lastRowTotal);
    Thread.sleep(1500);
	
	
	int reportsByWarehouseRow6ListCount1 = reportsLastRowbutOneList.size();
	ArrayList<String> reportsByWarehouseRow6ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow6ListCount1; i++) {
		String data = reportsLastRowbutOneList.get(i).getText();
		reportsByWarehouseRow6ListArray1.add(data);
	}
	String actRow6List1 = reportsByWarehouseRow6ListArray1.toString();
	String expRow6List1 = "[618, 16/03/2024, 4.0000, , 1.0000, 3.0000, 302.3701, HYD, BR-BATCH]";
	
	
	int reportsByWarehouseRow7ListCount1 = reportsLastRowList.size();
	ArrayList<String> reportsByWarehouseRow7ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow7ListCount1; i++) {
		String data = reportsLastRowList.get(i).getText();
		reportsByWarehouseRow7ListArray1.add(data);
	}
	String actRow7List1 = reportsByWarehouseRow7ListArray1.toString();
	String expRow7List1 = "[619, Total, 7,713.0000, 1,459.0000, 1,466.0000, 3.0000, 302.3701, , ]";
	

	
	
	System.out.println(actRow6List1);
	System.out.println(expRow6List1);
	
	System.out.println(actRow7List1);
	System.out.println(expRow7List1);
	
	
	if (actRow7List1.equalsIgnoreCase(expRow7List1) && actRow6List1.equalsIgnoreCase(expRow6List1)) {
		click(report_CloseBtn);
		
		return true;
	} else {
		click(report_CloseBtn);
		
		return false;
	}

}

public boolean checkStockStatementReportForFifoItem()
		throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	
	

	Thread.sleep(3000);

	if (fifoItemCheckBox.isSelected() == false) {
		click(fifoItemCheckBox);
	}

	if (brBatchItemCheckBox.isSelected() == true) {
		click(brBatchItemCheckBox);
	}

	if (rmaItemCheckBox.isSelected() == true) {
		click(rmaItemCheckBox);

	}

	dropDown(sl_DateOptionDropdown, "1");
	Thread.sleep(2000);
	click(sl_OkBtn);
	Thread.sleep(2000);
	click(stockLedgerLastBtn);
	Thread.sleep(1500);
	IsVisible(lastRowTotal);
	Thread.sleep(1500);
	

	int reportsByWarehouseRow6ListCount1 = reportsLastRowbutOneList.size();
	ArrayList<String> reportsByWarehouseRow6ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow6ListCount1; i++) {
		String data = reportsLastRowbutOneList.get(i).getText();
		reportsByWarehouseRow6ListArray1.add(data);
	}
	String actRow6List1 = reportsByWarehouseRow6ListArray1.toString();
	String expRow6List1 = "[618, 16/03/2024, 4.0000, , 1.0000, 3.0000, 304.0368, HYD, FIFO-BIN]";
	
	
	int reportsByWarehouseRow7ListCount1 = reportsLastRowList.size();
	ArrayList<String> reportsByWarehouseRow7ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow7ListCount1; i++) {
		String data = reportsLastRowList.get(i).getText();
		reportsByWarehouseRow7ListArray1.add(data);
	}
	String actRow7List1 = reportsByWarehouseRow7ListArray1.toString();
	String expRow7List1 = "[619, Total, 7,713.0000, 1,459.0000, 1,466.0000, 3.0000, 304.0368, , ]";
	

	
	
	System.out.println(actRow6List1);
	System.out.println(expRow6List1);
	
	System.out.println(actRow7List1);
	System.out.println(expRow7List1);
	



	if (actRow7List1.equalsIgnoreCase(expRow7List1) && actRow6List1.equalsIgnoreCase(expRow6List1)) {
		click(report_CloseBtn);
		
		return true;
	} else {
		click(report_CloseBtn);
		
		return false;
	}

}

public boolean checkStockStatementReportForRmaItem()
		throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	
	

	Thread.sleep(3000);

	if (fifoItemCheckBox.isSelected() == true) {
		click(fifoItemCheckBox);

	}

	if (brBatchItemCheckBox.isSelected() == true) {
		click(brBatchItemCheckBox);
	}

	if (rmaItemCheckBox.isSelected() == false) {
		click(rmaItemCheckBox);

	}

	dropDown(sl_DateOptionDropdown, "1");
	Thread.sleep(2000);
	click(sl_OkBtn);
	Thread.sleep(2000);
	click(stockLedgerLastBtn);
	Thread.sleep(1500);
	IsVisible(lastRowTotal);
	Thread.sleep(1500);

	
	
	int reportsByWarehouseRow7ListCount1 = reportsLastRowbutOneList.size();
	ArrayList<String> reportsByWarehouseRow7ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow7ListCount1; i++) {
		String data = reportsLastRowbutOneList.get(i).getText();
		reportsByWarehouseRow7ListArray1.add(data);
	}
	String actRow7List1 = reportsByWarehouseRow7ListArray1.toString();
	String expRow7List1 = "[619, 16/03/2024, 4.0000, , 1.0000, 3.0000, 262.1183, HYD, WA-RMA]";
	
	
	int reportsByWarehouseRow8ListCount1 = reportsLastRowList.size();
	ArrayList<String> reportsByWarehouseRow8ListArray1 = new ArrayList<String>();
	for (int i = 0; i < reportsByWarehouseRow8ListCount1; i++) {
		String data = reportsLastRowList.get(i).getText();
		reportsByWarehouseRow8ListArray1.add(data);
	}
	String actRow8List1 = reportsByWarehouseRow8ListArray1.toString();
	String expRow8List1 = "[620, Total, 7,616.0000, 1,459.0000, 1,466.0000, 3.0000, 262.1183, , ]";
	

	
	
	System.out.println(actRow7List1);
	System.out.println(expRow7List1);
	
	System.out.println(actRow8List1);
	System.out.println(expRow8List1);
	
	

	if (actRow8List1.equalsIgnoreCase(expRow8List1) && actRow7List1.equalsIgnoreCase(expRow7List1)) {
		click(report_CloseBtn);
		Thread.sleep(2000);
		//click(sl_CloseBtn);
		
		return true;
	} else {
		click(report_CloseBtn);
		Thread.sleep(2000);
		//click(sl_CloseBtn);
		
		return false;
	}

}

public boolean checkStockStatementReportForBRPBItem()
		throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	
	

	Thread.sleep(2000);	

	if (brPBItemCheckBox.isSelected() == false) {
		click(brPBItemCheckBox);
	}
	
	/*if (wapbItemCheckBox.isSelected() == false) {
		click(wapbItemCheckBox);
	}*/

	if (rmaItemCheckBox.isSelected() == true) {
		click(rmaItemCheckBox);

	}

	dropDown(sl_DateOptionDropdown, "1");
	Thread.sleep(2000);
	click(sl_OkBtn);
	Thread.sleep(2000);
	//click(stockLedgerLastBtn);
	Thread.sleep(5000);

	int reportsByWarehouseRow1ListCount = reportsRow1List.size();
	ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
	for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
	{
		String data = reportsRow1List.get(i).getText();
		reportsByWarehouseRow1ListArray.add(data);
	}
	String actRow1List = reportsByWarehouseRow1ListArray.toString();
	String expRow1List = "[1, BR-PB [BR-PB]]";
	
	
	

	int reportsByWarehouseRow2ListCount = reportsRow2List.size();
	ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
	for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
	{
		String data = reportsRow2List.get(i).getText();
		reportsByWarehouseRow2ListArray.add(data);
	}
	String actRow2List = reportsByWarehouseRow2ListArray.toString();
	String expRow2List = "[2, 09/03/2024, SalRet:51, BR-PB, 1.0000, 10.1000, , , 1.0000, 10.1000, , 10.1000, 10.1000, HYD, 09032023SH1, , ]";
	
	
	
	
	
	
	
	System.out.println(actRow1List);
	System.out.println(expRow1List);
	
	System.out.println(actRow2List);
	System.out.println(expRow2List);
	
	
	
	

	if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
		click(report_CloseBtn);
		Thread.sleep(2000);
		//click(sl_CloseBtn);
		
		return true;
	} else {
		click(report_CloseBtn);
		Thread.sleep(2000);
		//click(sl_CloseBtn);
		
		return false;
	}
}	
	public boolean checkStockStatementReportForFIFOPBItem()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		

		Thread.sleep(4000);

		if (fifoPbItemCheckBox.isSelected() == false) {
			click(fifoPbItemCheckBox);

		}

		if (brPBItemCheckBox.isSelected() == true) {
			click(brPBItemCheckBox);
		}
		
		Thread.sleep(1500);
	
		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		//click(stockLedgerLastBtn);
		Thread.sleep(5000);

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, FIFO-PB [FIFO-PG]]";
		
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 09/03/2024, SalRet:51, FIFO-PB, 1.0000, 10.1000, , , 1.0000, 10.1000, , 10.1000, 10.1000, HYD, , BIN1-1.00, ]";
		
		
		
		
		
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);		
		
		
		

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
			click(report_CloseBtn);
			Thread.sleep(2000);
			//click(sl_CloseBtn);
			
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(2000);
			//click(sl_CloseBtn);
			
			return false;
		}
	}	
		
		public boolean checkStockStatementReportForWAPBItem()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
			

			Thread.sleep(4000);

			if (fifoPbItemCheckBox.isSelected() == true) {
				click(fifoPbItemCheckBox);

			}

			
			if (wapbItemCheckBox.isSelected() == false) {
				click(wapbItemCheckBox);
			}

			

			dropDown(sl_DateOptionDropdown, "1");
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			//click(stockLedgerLastBtn);
			Thread.sleep(7000);

			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[1, WA-PB [WA-PB]]";
			
			
			

			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[2, 09/03/2024, SalRet:51, WA-PB, 1.0000, 10.1000, , , 1.0000, 10.1000, , 10.1000, 10.1000, HYD, , , 09012023SH1]";
			
			
			
			
			
			
			
			System.out.println(actRow1List);
			System.out.println(expRow1List);
			
			System.out.println(actRow2List);
			System.out.println(expRow2List);
			
			
			
			

			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
				click(report_CloseBtn);
				Thread.sleep(2000);
				click(sl_CloseBtn);
				
				return true;
			} else {
				click(report_CloseBtn);
				Thread.sleep(2000);
				click(sl_CloseBtn);
				
				return false;
			}

}
		
		
		public boolean checkLogout()
				throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
			userNameDisplayLogo.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

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
		
		
		
		public boolean checkStockMovementReportByDefaultForCogsPosting()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
		
			click(inventoryMenu);
			click(InventoryReportsMenu);
			click(InventoryReportsStockMovement);
			click(sl_HeaderSelectChkBox);
			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(5000);
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[1, WA-RMA, 10.0000, 101.0100, 1,459.0000, 20,643.7507, 1,466.0000, 20,482.6423, 3.0000, 262.1183, 87.3728, , , ]";
			
			
			

			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[2, FIFO-BIN, 10.0000, 101.0100, 1,459.0000, 20,223.5403, 1,466.0000, 20,020.5135, 3.0000, 304.0368, 101.3456, , , ]";
			
			
			
			
			int reportsRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsRow3ListArray.add(data);
			}
			String actRow3List = reportsRow3ListArray.toString();
			String expRow3List = "[3, BR-BATCH, 10.0000, 101.0100, 1,459.0000, 20,650.3612, 1,466.0000, 20,449.0011, 3.0000, 302.3701, 100.7900, , , ]";
			
			
			
			
			int reportsRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsRow4ListArray.add(data);
			}
			String actRow4List = reportsRow4ListArray.toString();
			String expRow4List = "[4, WA-PB, , , 1.0000, 10.1000, , , 1.0000, 10.1000, 10.1000, , , ]";
			
			
			int reportsRow5ListCount = reportsRow5List.size();
			ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow5ListCount;i++)
			{
				String data = reportsRow5List.get(i).getText();
				reportsRow5ListArray.add(data);
			}
			String actRow5List = reportsRow5ListArray.toString();
			String expRow5List = "[5, FIFO-PB, , , 1.0000, 10.1000, , , 1.0000, 10.1000, 10.1000, , , ]";
			
			
			
			int report6thRowListCount = reportsRow6List.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=0;i<report6thRowListCount;i++)
			{
				String data = reportsRow6List.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[6, BR-PB, , , 1.0000, 10.1000, , , 1.0000, 10.1000, 10.1000, , , ]";
			
			
			
			int report7thRowListCount = reportsRow7List.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=0;i<report7thRowListCount;i++)
			{
				String data = reportsRow7List.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[7, Grand Total, 30.0000, 303.0300, 4,380.0000, 61,547.9522, 4,398.0000, 60,952.1570, 12.0000, 898.8252, 319.8084, , , ]";
			
		
			
			System.out.println("*********************************checkStockMovement Report*****************************************");
			
			System.out.println(actRow1List);
			System.out.println(expRow1List);
			
			System.out.println(actRow2List);
			System.out.println(expRow2List);
			
			System.out.println(actRow3List);
			System.out.println(expRow3List);
			
			System.out.println(actRow4List);
			System.out.println(expRow4List);
			
			System.out.println(actRow5List);
			System.out.println(expRow5List);
			
			System.out.println(actRow6List);
			System.out.println(expRow6List);
			
			System.out.println(actRow7List);
			System.out.println(expRow7List);
			
		
			
			if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
					&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) 
					&& actRow6List.equalsIgnoreCase(expRow6List)
					&& actRow7List.equalsIgnoreCase(expRow7List))
			{
				click(report_CloseBtn);
				
				return true;
			}
			else
			{
				click(report_CloseBtn);
				
				return false;
			}
		}
		
		
		public boolean checkStockValuationReportByProductForCogsPosting()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
			
			
			click(inventoryMenu);
			click(InventoryReportsMenu);
			click(InventoryReportsStockValuation);
			//click(sl_HeaderSelectChkBox);
			Thread.sleep(1500);
			click(selectAllItemChkBox);
			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[1, WA-PB, WA-PB, WA-PB, 1.0000, 10.1000, 10.1000, , , 7.00, 7.00]";
			
			
			

			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[2, FIFO-PB, FIFO-PG, FIFO-PB, 1.0000, 10.1000, 10.1000, , , 8.00, 8.00]";
			
			
			
			
			int reportsRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsRow3ListArray.add(data);
			}
			String actRow3List = reportsRow3ListArray.toString();
			String expRow3List = "[3, BR-PB, BR-PB, BR-PB, 1.0000, 10.1000, 10.1000, , , 9.00, 9.00]";
			
			
			
			
			int reportsRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsRow4ListArray.add(data);
			}
			String actRow4List = reportsRow4ListArray.toString();
			String expRow4List = "[4, WA-RMA, WA-RMA, WA-RMA, 3.0000, 262.1183, 87.3728, , , 1.00, 1.00]";
			
			
			int reportsRow5ListCount = reportsRow5List.size();
			ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
			for(int i=0;i<reportsRow5ListCount;i++)
			{
				String data = reportsRow5List.get(i).getText();
				reportsRow5ListArray.add(data);
			}
			String actRow5List = reportsRow5ListArray.toString();
			String expRow5List = "[5, FIFO-BIN, FIFO-BIN, FIFO-BIN, 3.0000, 304.0368, 101.3456, , , 2.00, 2.00]";
			
			
			
			int report6thRowListCount = reportsRow6List.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=0;i<report6thRowListCount;i++)
			{
				String data = reportsRow6List.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[6, BR-BATCH, BR-BATCH, BR-BATCH, 3.0000, 302.3701, 100.7900, , , 3.00, 3.00]";
			
			
			
			int report7thRowListCount = reportsRow7List.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=0;i<report7thRowListCount;i++)
			{
				String data = reportsRow7List.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[7, Grand Total, , , 12.0000, 898.8252, 319.8084, , , 30.00, 30.00]";
			
		
			
			System.out.println("*********************************checkStockValuationReport *****************************************");
			
			System.out.println(actRow1List);
			System.out.println(expRow1List);
			
			System.out.println(actRow2List);
			System.out.println(expRow2List);
			
			System.out.println(actRow3List);
			System.out.println(expRow3List);
			
			System.out.println(actRow4List);
			System.out.println(expRow4List);
			
			System.out.println(actRow5List);
			System.out.println(expRow5List);
			
			System.out.println(actRow6List);
			System.out.println(expRow6List);
			
			System.out.println(actRow7List);
			System.out.println(expRow7List);
			
		
			
			if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
					&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) 
					&& actRow6List.equalsIgnoreCase(expRow6List)
					&& actRow7List.equalsIgnoreCase(expRow7List))
			{
				click(report_CloseBtn);
				
				return true;
			}
			else
			{
				click(report_CloseBtn);
				
				return false;
			}
		}
		
		
		public boolean checkStockLedgerReportForBrBatchItem()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
			click(inventoryMenu);
			click(InventoryReportsMenu);
			click(InventoryStockLedgerMenu);
			Thread.sleep(3000);

			int rowcount = stockLedgerHometableRowCount.size();

			System.out.println(rowcount);

			for (int i = 0; i < rowcount; i++) {
				String actName = ledgerHometableItemNamesList.get(i).getText();

				System.out.println(actName);

				if (actName.equalsIgnoreCase("BR-BATCH")) {
					stockLedgerHometableItemChkboxList.get(i).click();
				}
			}
			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			click(stockLedgerLastBtn);
			Thread.sleep(1500);
			IsVisible(lastRowTotal);
			Thread.sleep(1500);


			int reportsByWarehouseRow6ListCount = reportsLastRowbutOneList.size();
			ArrayList<String> reportsByWarehouseRow6ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow6ListCount;i++)
			{
				String data = reportsLastRowbutOneList.get(i).getText();
				reportsByWarehouseRow6ListArray.add(data);
			}
			String actRow6List = reportsByWarehouseRow6ListArray.toString();
			String expRow6List = "[1043, 16/03/2024, DN1:2, BR-BATCH, , , 1.0000, 100.1234, 3.0000, , 100.1234, 302.3701, 100.7900, HYD, 01012023H, , ]";
			
			
			
			int reportsByWarehouseRow7ListCount = reportsLastRowList.size();
			ArrayList<String> reportsByWarehouseRow7ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow7ListCount;i++)
			{
				String data = reportsLastRowList.get(i).getText();
				reportsByWarehouseRow7ListArray.add(data);
			}
			String actRow7List = reportsByWarehouseRow7ListArray.toString();
			String expRow7List = "[1044, Total, , , 1,469.0000, 5,315.5492, 1,466.0000, 9,113.6428, 3.0000, 20,650.3612, 20,449.0011, 302.3701, 14,699.8287, , , , ]";
			
			System.out.println("*********************************checkStockLedger Report*****************************************");
			
			
			
			System.out.println(actRow6List);
			System.out.println(expRow6List);
			
			System.out.println(actRow7List);
			System.out.println(expRow7List);
			
			
			
			Thread.sleep(1000);

			if (actRow7List.equalsIgnoreCase(expRow7List) && actRow6List.equalsIgnoreCase(expRow6List)) {

				click(report_CloseBtn);
				
				
				return true;
			} else {
				click(report_CloseBtn);
				
				return false;
			}

		}
		
		

		
		
		
		
		public boolean checkStockLedgerReportForFifoItem() // values taken from item query
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

			
			
			Thread.sleep(3000);

			if (fifoItemCheckBox.isSelected() == false) {
				click(fifoItemCheckBox);
			}

			if (brBatchItemCheckBox.isSelected() == true) {
				click(brBatchItemCheckBox);
			}

			if (rmaItemCheckBox.isSelected() == true) {
				click(rmaItemCheckBox);

			}

			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			click(stockLedgerLastBtn);
			Thread.sleep(1500);
			IsVisible(lastRowTotal);
			Thread.sleep(1500);

			int reportsByWarehouseRow1ListCount = reportsLastRowbutOneList.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsLastRowbutOneList.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[800, 16/03/2024, DN1:2, FIFO-BIN, , , 1.0000, 101.1234, 3.0000, , 101.1234, 304.0368, 101.2901, HYD, , BIN1--1.00, ]";
			
			
			

			int reportsByWarehouseRow2ListCount = reportsLastRowList.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsLastRowList.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[801, Total, , , 1,469.0000, 4,831.7386, 1,466.0000, 5,969.5822, 3.0000, 20,223.5403, 20,020.5135, 304.0368, 11,250.3257, , , , ]";
			
			System.out.println("*********************************checkStockLedger Report*****************************************");
			
			System.out.println(actRow1List);
			System.out.println(expRow1List);
			
			System.out.println(actRow2List);
			System.out.println(expRow2List);
			
			
			
			Thread.sleep(1000);

			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {

				click(report_CloseBtn);
							
				return true;
			} else {
				
				click(report_CloseBtn);
				
				return false;
			}

		}
		
		

		
		
		public boolean checkStockLedgerReportForRmaItem()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

			
			
			
			Thread.sleep(3000);

			if (fifoItemCheckBox.isSelected() == true) {
				click(fifoItemCheckBox);

			}

			if (brBatchItemCheckBox.isSelected() == true) {
				click(brBatchItemCheckBox);
			}

			if (rmaItemCheckBox.isSelected() == false) {
				click(rmaItemCheckBox);

			}
			
			dropDown(sl_DateOptionDropdown, "1");		
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			click(stockLedgerLastBtn);
			Thread.sleep(2000);
			Thread.sleep(1500);
			IsVisible(lastRowTotal);
			Thread.sleep(1500);

				

			
			int reportsByWarehouseRow3ListCount = reportsLastRowbutOneList.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsLastRowbutOneList.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[802, 16/03/2024, DN1:2, WA-RMA, , , 1.0000, 87.3728, 3.0000, , 87.3728, 262.1183, 87.3728, HYD, , , 08012023SH1]";
			
			
			int reportsByWarehouseRow4ListCount = reportsLastRowList.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsLastRowList.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[803, Total, , , 1,469.0000, 5,288.5353, 1,466.0000, 5,957.9229, 3.0000, 20,643.7507, 20,482.6423, 262.1183, 11,162.1992, , , , ]";
			
			System.out.println("*********************************checkStockLedger Report*****************************************");
			
			
			
			
			
			System.out.println(actRow3List);
			System.out.println(expRow3List);
			
			System.out.println(actRow4List);
			System.out.println(expRow4List);
			
			
			
			Thread.sleep(1000);

			if (actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)){

				click(report_CloseBtn);
				Thread.sleep(2000);
				//click(sl_CloseBtn);
				

				return true;
			} else {
				click(report_CloseBtn);
				Thread.sleep(2000);
				//click(sl_CloseBtn);
				
				return false;
			}

		
		}	
		
		public boolean checkStockLedgerReportForBRPBItem()
				throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
			
			

			Thread.sleep(2000);	

			if (brPBItemCheckBox.isSelected() == false) {
				click(brPBItemCheckBox);
			}
			
			/*if (wapbItemCheckBox.isSelected() == false) {
				click(wapbItemCheckBox);
			}*/

			if (rmaItemCheckBox.isSelected() == true) {
				click(rmaItemCheckBox);

			}

			dropDown(sl_DateOptionDropdown, "1");
			Thread.sleep(2000);
			click(sl_OkBtn);
			Thread.sleep(2000);
			//click(stockLedgerLastBtn);
			Thread.sleep(5000);

			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[1, BR-PB [BR-PB]]";
			
			
			

			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[2, 09/03/2024, , 1.0000, , 1.0000, 10.1000, HYD, BR-PB]";
			
			
			
			
			
			
			
			System.out.println(actRow1List);
			System.out.println(expRow1List);
			
			System.out.println(actRow2List);
			System.out.println(expRow2List);
			
			
			
			

			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
				click(report_CloseBtn);
				Thread.sleep(2000);
				//click(sl_CloseBtn);
				
				return true;
			} else {
				click(report_CloseBtn);
				Thread.sleep(2000);
				//click(sl_CloseBtn);
				
				return false;
			}
		}	
			public boolean checkStockLedgerReportForFIFOPBItem()
					throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
				
				

				Thread.sleep(4000);

				if (fifoPbItemCheckBox.isSelected() == false) {
					click(fifoPbItemCheckBox);

				}

				if (brPBItemCheckBox.isSelected() == true) {
					click(brPBItemCheckBox);
				}
				
				Thread.sleep(1500);
			
				dropDown(sl_DateOptionDropdown, "1");
				Thread.sleep(2000);
				click(sl_OkBtn);
				Thread.sleep(2000);
				//click(stockLedgerLastBtn);
				Thread.sleep(5000);

				int reportsByWarehouseRow1ListCount = reportsRow1List.size();
				ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
				for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
				{
					String data = reportsRow1List.get(i).getText();
					reportsByWarehouseRow1ListArray.add(data);
				}
				String actRow1List = reportsByWarehouseRow1ListArray.toString();
				String expRow1List = "[1, FIFO-PB [FIFO-PG]]";
				
				
				

				int reportsByWarehouseRow2ListCount = reportsRow2List.size();
				ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
				for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
				{
					String data = reportsRow2List.get(i).getText();
					reportsByWarehouseRow2ListArray.add(data);
				}
				String actRow2List = reportsByWarehouseRow2ListArray.toString();
				String expRow2List = "[2, 09/03/2024, , 1.0000, , 1.0000, 10.1000, HYD, FIFO-PB]";
				
				
				
				
				
				
				
				System.out.println(actRow1List);
				System.out.println(expRow1List);
				
				System.out.println(actRow2List);
				System.out.println(expRow2List);		
				
				
				

				if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
					click(report_CloseBtn);
					Thread.sleep(2000);
					//click(sl_CloseBtn);
					
					return true;
				} else {
					click(report_CloseBtn);
					Thread.sleep(2000);
					//click(sl_CloseBtn);
					
					return false;
				}
			}	
				
				public boolean checkStockLedgerReportForWAPBItem()
						throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
					
					

					Thread.sleep(4000);

					if (fifoPbItemCheckBox.isSelected() == true) {
						click(fifoPbItemCheckBox);

					}

					
					if (wapbItemCheckBox.isSelected() == false) {
						click(wapbItemCheckBox);
					}

					

					dropDown(sl_DateOptionDropdown, "1");
					Thread.sleep(2000);
					click(sl_OkBtn);
					Thread.sleep(2000);
					//click(stockLedgerLastBtn);
					Thread.sleep(7000);

					int reportsByWarehouseRow1ListCount = reportsRow1List.size();
					ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
					for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
					{
						String data = reportsRow1List.get(i).getText();
						reportsByWarehouseRow1ListArray.add(data);
					}
					String actRow1List = reportsByWarehouseRow1ListArray.toString();
					String expRow1List = "[1, WA-PB [WA-PB]]";
					
					
					

					int reportsByWarehouseRow2ListCount = reportsRow2List.size();
					ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
					for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
					{
						String data = reportsRow2List.get(i).getText();
						reportsByWarehouseRow2ListArray.add(data);
					}
					String actRow2List = reportsByWarehouseRow2ListArray.toString();
					String expRow2List = "[2, 09/03/2024, , 1.0000, , 1.0000, 10.1000, HYD, WA-PB]";
					
					
					
					
					
					
					
					System.out.println(actRow1List);
					System.out.println(expRow1List);
					
					System.out.println(actRow2List);
					System.out.println(expRow2List);
					
					
					
					

					if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) {
						click(report_CloseBtn);
						Thread.sleep(2000);
						click(sl_CloseBtn);
						
						return true;
					} else {
						click(report_CloseBtn);
						Thread.sleep(2000);
						click(sl_CloseBtn);
						
						return false;
					}

		}
	
	
	public boolean checkLoginToMaintainQuantityAndValueOverallCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		
		/*Thread.sleep(3000);
		click(userNameDisplayLogo);
		Thread.sleep(1000);
		click(logoutOption);
		Thread.sleep(3000);
		Thread.sleep(2000);*/

		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
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
	    
	    lp.clickOnSignInBtn();
	    
	  
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 25);
		System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();
		
		boolean actDashboard = dashboard.isDisplayed();
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Maintain quantity overall";
		boolean expDashboard = true;
		
		System.err.println(actDashboard);
		System.err.println(expDashboard);
		
		System.err.println(getLoginCompanyName);
		System.err.println(expLoginCompanyName);
		
		
		Thread.sleep(2000);
	
		
		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath = "//*[@id='25']/span")
	public static WebElement dataMangementMenu;

	@FindBy(xpath = "//*[@id='26']/span")
	public static WebElement backup;

	@FindBy(xpath = "//*[@id='27']/span")
	public static WebElement restore;
	
	@FindBy (xpath="//button[@class='btn Fbutton']")
   	public static WebElement folderpathExpandBtn;
   	
   	@FindBy (xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a/i")
   	public static WebElement restoreCompanyBtn;
   	
   	@FindBy (xpath="//*[@id='RestoreCompanyModal']/div/div/div[2]/button[1]")
   	public static WebElement overRideYesBtn;
	
	public static boolean checkRestoringCompanyForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "su";

		String pawslt = "su";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\Maintainquantity.exe");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		restoreCompanyBtn.click();

		try {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
			overRideYesBtn.click();
			
			Thread.sleep(130000);

		} catch (Exception e) {
			System.err.println("NO OLDER COMPANY EXISTS");
		}

		if (getIsAlertPresent()) {
			getWaitForAlert();

			getAlert().accept();
		}

		//Thread.sleep(120000);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		userNameDisplayLogo.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(3000);

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);
		
				
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
		
		
		

		lp.clickOnSignInBtn();

		Thread.sleep(5000);

		String actUserInfo1 = userNameDisplay.getText();

		System.out.println("User Info  : " + actUserInfo1);

		System.out.println("User Info Capture Text  :  " + userNameDisplay.getText());

		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();

		String getCompanyTxt1 = companyName.getText();
		String getLoginCompanyName1 = getCompanyTxt1.substring(0, 25);
		System.out.println("company name  :  " + getLoginCompanyName1);
		//companyLogo.click();

		String expUserInfo1 = "SU";
		String expLoginCompanyName1 = "Maintain quantity overall";

		System.out.println("UserInfo1             : " + actUserInfo1 + " Value Expected : " + expUserInfo1);
		System.out.println(
				"LoginCompanyName1     : " + getLoginCompanyName1 + " Value Expected : " + expLoginCompanyName1);

		if (actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean checkSavePurchasesVoucherForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {	
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(PurchasesVoucher);
		Thread.sleep(1500);
		click(newBtn);
		checkValidationMessage("Screen opened");
		click(purchaseDatetxt);
		purchaseDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		purchaseDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(purchaseDatetxt, "01/01/2024");
		Thread.sleep(1200);		
		tab(purchaseDatetxt);
		Thread.sleep(2000);
		
		
		
		enterText(vendorAccounttxt, "Vendor A");
		Thread.sleep(2000);
		tab(vendorAccounttxt);
		Thread.sleep(2000);
		
		enterText(purchasesDepartmenttxt, "DEPT1");
		Thread.sleep(1500);
		tab(purchasesDepartmenttxt);
		Thread.sleep(1000);

		////ScrollToElement(select1stRow_1stColumn);

		click(select1stRow_1stColumn);
		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1500);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(1500);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		tab(enterRatetxt);
		Thread.sleep(2000);
		click(select1stRow_13thColumn);
		enterText(enterBatchtxt, "01012023H");
		tab(enterBatchtxt);
		

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(1500);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		tab(enterRatetxt);
		Thread.sleep(2000);
		click(select2ndRow_13thColumn);
		enterText(enterBatchtxt, "01012023S");
		tab(enterBatchtxt);
		

		// 3rd Row

		click(select3rdRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		Thread.sleep(2000);
		tab(enterRatetxt);
		
		
		click(select3rdRow_14thColumn);
		
		Thread.sleep(2500);
	

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		

		// 4th Row

		click(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		Thread.sleep(2000);
		tab(enterRatetxt);
		
		
		click(select4thRow_14thColumn);
		Thread.sleep(3000);
		
		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		

		// 5th Row

		click(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.1234");
		tab(enterRatetxt);
		
		Thread.sleep(3000);
		

		String actual5throwAvgRate 			= select5thRow_AvgRate1.getText();
		String exp5throwAvgRate			    = "10.8573000";
		
		System.out.println("actual5throwAvgRate  :"+actual5throwAvgRate);
		System.out.println("exp5throwAvgRate     :"+exp5throwAvgRate);
		
		
		String actual5throwOverallAvgRate   = select5thRow_OverAllAvgRate1.getText();
		String exp5throwoverallAvgRate      = "10.8573000";
		
		System.out.println("actual5throwOverallAvgRate  :"+actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate     :"+exp5throwoverallAvgRate);
		

		click(select5thRow_15thColumn);	
		
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);
		Thread.sleep(1000);
		
		
		enterText(rmaSerialNumberTxtField, "01012023HYD,10");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		//tab(enterBatCodetxt);

		// 6th Row
		Thread.sleep(1000);
		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(1000);
		tab(purchaseAccountTxt);
		
		
		enterText(enterQuantitytxt, "10");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100.4567");
		tab(enterRatetxt);
		
		Thread.sleep(3000);
		

		String actual6throwAvgRate 			= select6thRow_AvgRate1.getText();
		String exp6throwAvgRate			    = "10.8573000";
		
		System.out.println("actual6throwAvgRate  :"+actual6throwAvgRate);
		System.out.println("exp6throwAvgRate     :"+exp6throwAvgRate);
		
		
		String actual6throwOverallAvgRate   = select6thRow_OverAllAvgRate1.getText();
		String exp6throwoverallAvgRate      = "10.8573000";
		
		System.out.println("actual6throwOverallAvgRate  :"+actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate     :"+exp6throwoverallAvgRate);
		

		click(select6thRow_15thColumn);
		
		
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		Thread.sleep(1000);
		
		
		enterText(rmaSerialNumberTxtField, "01012023SEC,10");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		
		
		Thread.sleep(2000);
		
	
		click(voucherSaveBtn);
		
		Thread.sleep(2000);
		
		

		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(2000);
	
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 54";
		
		String actMessage = checkValidationMessage(expMessage1);	
	   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && (actRMAPopupIsDisplaying1==expRMAPopupIsDisplaying1)
				&& actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate) && actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {
			
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return true;
			
		} else {
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return false;

		} 

	}
	
	
	public boolean checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		reLogin3("inv", "su");
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(salesInvoiceVoucher);
		click(newBtn);
		checkValidationMessage("Screen opened");
		click(salesDatetxt);
		salesDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		salesDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(salesDatetxt, "02/01/2024");
		Thread.sleep(1500);
		tab(salesDatetxt);
		Thread.sleep(2000);
		enterText(salesAccounttxt, "Sales - Computers");
		tab(salesAccounttxt);
		Thread.sleep(2000);
		enterText(customerAccounttxt, "Customer A");
		Thread.sleep(2000);
		click(customerAccounttxt);
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		Thread.sleep(3000);		
		click(select1stRow_1stColumn);
			
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);
		
		String actAvailableStock      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStock	  ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 135, 7, actAvailableStock);
		
		
		System.out.println("actAvailableStock       :"+actAvailableStock);
		System.out.println("expAvailableStock       :"+expAvailableStock);
		
		
		tab(enterAvailableStocktxt);
		
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		Thread.sleep(2000);
		click(select1stRow_11thColumn);
		
		Thread.sleep(2000);
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 136, 7, actRow1Baseqty);
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="4.0101";
		//excelReader.setCellData(xlfile, xlSheetName, 137, 7, actRow1Rate);
		
		String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty		="10.00";
		//excelReader.setCellData(xlfile, xlSheetName, 138, 7, actRow2Baseqty);
		
		String actRow2Rate			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate			="100.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 139, 7, actRow2Rate);
		
		/*String actRow3Baseqty		=batchPopUPRow3BaseQuantityTxt.getText();
		String expRow3Baseqty		=excelReader.getCellData(xlSheetName, 140, 6);
		excelReader.setCellData(xlfile, xlSheetName, 140, 7, actRow3Baseqty);
		
		String actRow3Rate			=batchPopUPRow3RateTxt.getText();
		String expRow3Rate			=excelReader.getCellData(xlSheetName, 141, 6);
		excelReader.setCellData(xlfile, xlSheetName, 141, 7, actRow3Rate);*/
		
		System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate                :"+actRow1Rate);
		System.out.println("expRow1Rate                :"+expRow1Rate);
		
		System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
		System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
		
		System.out.println("actRow2Rate                :"+actRow2Rate);
		System.out.println("expRow2Rate                :"+expRow2Rate);
		
		/*System.out.println("actRow3Baseqty             :"+actRow3Baseqty);
		System.out.println("expRow3Baseqty             :"+expRow3Baseqty);
		
		System.out.println("actRow3Rate                :"+actRow3Rate);
		System.out.println("expRow3Rate                :"+expRow3Rate);*/
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 142, 7, actBatchpopupIsDisplaying);
		
		System.out.println("Batch Popup isDisplaying  : "+actBatchpopupIsDisplaying+"  Value Expected  "+expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
    	click(batchOkIcon);
    	
    	Thread.sleep(2000);
    	click(select3rdRow_1stColumn);
    	
    	int row1List=Row1SalesInvoicevocherBodyList.size();
		System.err.println(row1List);
		ArrayList<String> row1SalesList = new ArrayList<String>();
		for(int i=0 ; i < row1List ;i++)
	  	{
	  		String data=Row1SalesInvoicevocherBodyList.get(i).getText();
	  		row1SalesList.add(data);
	  	}
		
		String actrow1SalesList = row1SalesList.toString();
		String exprow1SalesList = "[1, HYD, BR-BATCH, 1.00, 1.00, 55.0000, 55.0000, 0.00, 4.0101000, 4.0101000, 4.0101, 04112022EXH, , ]";
		//excelReader.setCellData(xlfile, xlSheetName, 143, 7, actrow1SalesList);
		
		System.out.println("actrow1SalesList       :"+actrow1SalesList);		
		System.out.println("exprow1SalesList       :"+exprow1SalesList);
		
		int row2List=Row2SalesInvoicevocherBodyList.size();
		System.err.println(row2List);
		ArrayList<String> row2SalesList = new ArrayList<String>();
		for(int i=0 ; i < row2List ;i++)
	  	{
	  		String data=Row2SalesInvoicevocherBodyList.get(i).getText();
	  		row2SalesList.add(data);
	  	}
		
		String actrow2SalesList = row2SalesList.toString();
		String exprow2SalesList = "[2, HYD, BR-BATCH, 10.00, 4.00, 55.0000, 220.0000, 0.00, 100.1234000, 100.1234000, 400.4936, 01012023H, , ]";
		//excelReader.setCellData(xlfile, xlSheetName, 144, 7, actrow2SalesList);
		
		System.out.println("actrow2SalesList       :"+actrow2SalesList);		
		System.out.println("exprow2SalesList       :"+exprow2SalesList);
		
		
		/*int row3List=Row3SalesInvoicevocherBodyList.size();
		System.err.println(row3List);
		ArrayList<String> row3SalesList = new ArrayList<String>();
		for(int i=0 ; i < row3List ;i++)
	  	{
	  		String data=Row3SalesInvoicevocherBodyList.get(i).getText();
	  		row3SalesList.add(data);
	  	}
		
		String actrow3SalesList = row3SalesList.toString();
		String exprow3SalesList = excelReader.getCellData(xlSheetName, 145, 6);
		excelReader.setCellData(xlfile, xlSheetName, 145, 7, actrow3SalesList);
		
		System.out.println("actrow3SalesList       :"+actrow3SalesList);		
		System.out.println("exprow3SalesList       :"+exprow3SalesList);*/
		
    	Thread.sleep(2000);
    	
    	if(actAvailableStock.equalsIgnoreCase(expAvailableStock)
    			&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate)
    			&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)
    			&& actrow1SalesList.equalsIgnoreCase(exprow1SalesList) && actrow2SalesList.equalsIgnoreCase(exprow2SalesList)
    			) {
    		
    		//excelReader.setCellData(xlfile, xlSheetName, 134, 8, resPass);
    		
    		return true;
    	}
    		else{
    			
    			//excelReader.setCellData(xlfile, xlSheetName, 134, 8, resFail);
    			return false;
    		}
    		
    	}
	
	
			
	public boolean checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouseForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());

		// 4th Row
		Thread.sleep(2000);

		//click(select4thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);
		
		String actAvailableStock1      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStock1	   ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 146, 7, actAvailableStock1);
		
		
		System.out.println("actAvailableStock1       :"+actAvailableStock1);
		System.out.println("expAvailableStock1       :"+expAvailableStock1);		
		
		
		tab(enterAvailableStocktxt);
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		click(select3rdRow_11thColumn);
		
		Thread.sleep(2000);
		
		
		String actRow1Baseqty1		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty1		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 147, 7, actRow1Baseqty1);
		
		String actRow1Rate1			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate1			="4.1111";
		//excelReader.setCellData(xlfile, xlSheetName, 148, 7, actRow1Rate1);
		
		String actRow2Baseqty1		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty1		="10.00";
		//excelReader.setCellData(xlfile, xlSheetName, 149, 7, actRow2Baseqty1);
		
		String actRow2Rate1			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate1			="100.4567";
		//excelReader.setCellData(xlfile, xlSheetName, 150, 7, actRow2Rate1);
		
	
		
		System.out.println("actRow1Baseqty1             :"+actRow1Baseqty1);
		System.out.println("expRow1Baseqty1             :"+expRow1Baseqty1);
		
		System.out.println("actRow1Rate1                :"+actRow1Rate1);
		System.out.println("expRow1Rate1                :"+expRow1Rate1);
		
		System.out.println("actRow2Baseqty1             :"+actRow2Baseqty1);
		System.out.println("expRow2Baseqty1             :"+expRow2Baseqty1);
		
		System.out.println("actRow2Rate1                :"+actRow2Rate1);
		System.out.println("expRow2Rate1                :"+expRow2Rate1);			
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying2 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 151, 7, actBatchpopupIsDisplaying1);
		
		System.out.println("Batch Popup isDisplaying  : "+actBatchpopupIsDisplaying1+"  Value Expected  "+expBatchpopupIsDisplaying2);
		click(batchPickOnFIFOIcon);
    	click(batchOkIcon);
    	
    	Thread.sleep(3000);
    	
    	int row3List=Row3SalesInvoicevocherBodyList.size();
		System.err.println(row3List);
		ArrayList<String> row3SalesList = new ArrayList<String>();
		for(int i=0 ; i < row3List ;i++)
	  	{
	  		String data=Row3SalesInvoicevocherBodyList.get(i).getText();
	  		row3SalesList.add(data);
	  	}
		
		String actrow3SalesList = row3SalesList.toString();
		String exprow3SalesList = "[3, SEC, BR-BATCH, 1.00, 1.00, 55.0000, 55.0000, 0.00, 4.1111000, 4.1111000, 4.1111, 04112022EXS, , ]";
		//excelReader.setCellData(xlfile, xlSheetName, 152, 7, actrow4SalesList);
		
		System.out.println("actrow3SalesList       :"+actrow3SalesList);		
		System.out.println("exprow3SalesList       :"+exprow3SalesList);
		
		Thread.sleep(2000);
		click(select5thRow_1stColumn);
		
		int row4List=Row4SalesInvoicevocherBodyList.size();
		System.err.println(row4List);
		ArrayList<String> row4SalesList = new ArrayList<String>();
		for(int i=0 ; i < row4List ;i++)
	  	{
	  		String data=Row4SalesInvoicevocherBodyList.get(i).getText();
	  		row4SalesList.add(data);
	  	}
		
		String actrow4SalesList = row4SalesList.toString();
		String exprow4SalesList = "[4, SEC, BR-BATCH, 10.00, 4.00, 55.0000, 220.0000, 0.00, 100.4567000, 100.4567000, 401.8268, 01012023S, , ]";
		//excelReader.setCellData(xlfile, xlSheetName, 153, 7, actrow5SalesList);
		
		System.out.println("actrow4SalesList       :"+actrow4SalesList);		
		System.out.println("exprow4SalesList       :"+exprow4SalesList);
		
		Thread.sleep(2000);
		
		if(actAvailableStock1.equalsIgnoreCase(expAvailableStock1) && actRow1Baseqty1.equalsIgnoreCase(expRow1Baseqty1) 
				&& actRow1Rate1.equalsIgnoreCase(expRow1Rate1) && actRow2Baseqty1.equalsIgnoreCase(expRow2Baseqty1) 
				&& actRow2Rate1.equalsIgnoreCase(expRow2Rate1) && actrow4SalesList.equalsIgnoreCase(exprow4SalesList)
				&& actrow3SalesList.equalsIgnoreCase(exprow3SalesList)){
			
			//excelReader.setCellData(xlfile, xlSheetName, 146, 8, resPass);			
			return true;
		}
			else{
				
				//excelReader.setCellData(xlfile, xlSheetName, 146, 8, resFail);
				return false;
			}
			}
	
	public boolean checkSavingSalesInvoiceVoucherFifoItemWith2WarehouseForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{ 	
		
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		Thread.sleep(2000);

		//click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		
		Thread.sleep(2000);
		
		String actAvailableStockInHyd      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStockInHyd	   ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 154, 7, actAvailableStockInHyd);
		
		
		System.out.println("actAvailableStockInHyd        :"+actAvailableStockInHyd);
		System.out.println("expAvailableStockInHyd        :"+expAvailableStockInHyd);
		
		
		tab(enterAvailableStocktxt);
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		click(select5thRow_11thColumn);
		

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 155, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(1566);
		
		
		

		// 7th Row

		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		
		Thread.sleep(2000);
		
		String actAvailableStockInSec      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStockInSec	   ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 156, 7, actAvailableStockInSec);
		
		
		System.out.println("actAvailableStockInSec       :"+actAvailableStockInSec);
		System.out.println("expAvailableStockInSec       :"+expAvailableStockInSec);
		
		
		tab(enterAvailableStocktxt);
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		click(select6thRow_12thColumn);
		
	
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 157, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		
		Thread.sleep(2000);
		
		if(actAvailableStockInHyd.equalsIgnoreCase(expAvailableStockInHyd) && actBinpopupIsDisplaying==expBinpopupIsDisplaying
					&& actAvailableStockInSec.equalsIgnoreCase(expAvailableStockInSec) && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
			//excelReader.setCellData(xlfile, xlSheetName, 154, 8, resPass);

			return true;
		}
		else{
			//excelReader.setCellData(xlfile, xlSheetName, 154, 8, resFail);
			return false;
			
		}
	}
	
	public boolean checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouseForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());

		// 8th Row
		Thread.sleep(2000);

		click(select7thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		
		
		Thread.sleep(2000);
		
		String actAvailableStock4      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStock4	   ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 162, 7, actAvailableStock4);
		
		
		System.out.println("actAvailableStock4       :"+actAvailableStock4);
		System.out.println("expAvailableStock4       :"+expAvailableStock4);	
		
		
		tab(enterAvailableStocktxt);
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		click(select7thRow_13thColumn);
		
		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 163, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);
		
		click(rmaSearchGridField);
		Thread.sleep(1000);
		
		int count = rmaSerialNos.size();
		
		ArrayList<String> SearchRMA = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);
			
			if (data.equalsIgnoreCase("01012023HYD") ||
					data.equalsIgnoreCase("01012023HYD1") ||
					data.equalsIgnoreCase("01012023HYD2") || 
					data.equalsIgnoreCase("01012023HYD3") || 
					data.equalsIgnoreCase("01012023HYD4")) 
			{
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}
		
		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023HYD, 01012023HYD1, 01012023HYD2, 01012023HYD3, 01012023HYD4, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023HYD8, 01012023HYD9, 18102022EXH1]"; 
		//excelReader.setCellData(xlfile, xlSheetName, 164, 7, actSearchRMASerialNoList);
		
		System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
		
		
		//click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);
		
		int serialcount	=rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data=rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}
		
		String actRmaSerialNo 	=rmaSerialnos.toString();
		String expRmaSerialNo	="[01012023HYD, 01012023HYD1, 01012023HYD2, 01012023HYD3, 01012023HYD4]";
		//excelReader.setCellData(xlfile, xlSheetName, 165, 7, actRmaSerialNo);
		
		System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
		System.out.println("expRmaSerialNo       :"+expRmaSerialNo);
		
	
		click(RMAPopupOkBtn);	
		Thread.sleep(2000);
		tab(enterRmatxt);
		
				
    	Thread.sleep(3000);
    	
    	
    	String actual8throwAvgRate 				= select7thRow_AvgRate.getText();
		String exp8throwAvgRate 				= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 166, 7, actual8throwAvgRate);
		
		String actual8throwOverallAvgRate		= select7thRow_OverAllAvgRate.getText();
		String exp8throwoverallAvgRate			= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 167, 7, actual8throwOverallAvgRate);
		
		String act8throwAvailableStock  		=select7thRow_AvailaleStock.getText();
		String exp8throwAvailableStock 			="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 168, 7, act8throwAvailableStock);
		
		System.out.println("actual8throwAvgRate             :"+actual8throwAvgRate);
		System.out.println("exp8throwAvgRate                :"+exp8throwAvgRate);
		
		System.out.println("actual8throwOverallAvgRate      :"+actual8throwOverallAvgRate);
		System.out.println("exp8throwoverallAvgRate         :"+exp8throwoverallAvgRate);
		
		System.out.println("act8throwAvailableStock         :"+act8throwAvailableStock);
		System.out.println("exp8throwAvailableStock         :"+exp8throwAvailableStock);
		
		if(actAvailableStock4.equalsIgnoreCase(expAvailableStock4) && actRMAPopupIsDisplaying==expRMAPopupIsDisplaying 
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) && actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actual8throwAvgRate.equalsIgnoreCase(exp8throwAvgRate) && actual8throwOverallAvgRate.equalsIgnoreCase(exp8throwoverallAvgRate)
				&& act8throwAvailableStock.equalsIgnoreCase(exp8throwAvailableStock)){
			
			//excelReader.setCellData(xlfile, xlSheetName, 162, 8, resPass);
			return true;
			
		}else{
			
			//excelReader.setCellData(xlfile, xlSheetName, 162, 8, resFail);
			return false;
		}
	}
	
	public boolean checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouseForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{

		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		// 9th Row
		Thread.sleep(1000);
		//getAction().moveToElement(select9thRow_1stColumn).click().perform();
		click(select8thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		
		Thread.sleep(2000);
		
		String actAvailableStock5      =enterAvailableStocktxt.getAttribute("value");
		String expAvailableStock5	   ="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 171, 7, actAvailableStock5);
		
		
		System.out.println("actAvailableStock5       :"+actAvailableStock5);
		System.out.println("expAvailableStock5       :"+actAvailableStock5);	
		
		
		
		tab(enterAvailableStocktxt);
		enterText(enterQuantitytxt, "5");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "55");
		tab(enterRatetxt);
		click(select8thRow_13thColumn);
		
		

		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 172, 7, actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		
		click(rmaSearchGridField);
		Thread.sleep(1000);
		
		int count = rmaSerialNos.size();
		
		ArrayList<String> SearchRMA = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);
			
			if (data.equalsIgnoreCase("01012023SEC") || data.equalsIgnoreCase("01012023SEC1") 
					|| data.equalsIgnoreCase("01012023SEC2") || data.equalsIgnoreCase("01012023SEC3") || 
					data.equalsIgnoreCase("01012023SEC4")) 
			{
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}
		
		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023SEC, 01012023SEC1, 01012023SEC2, 01012023SEC3, 01012023SEC4, 01012023SEC5, 01012023SEC6, 01012023SEC7, 01012023SEC8, 01012023SEC9, 04112022EXS1]"; 
		//excelReader.setCellData(xlfile, xlSheetName, 173, 7, actSearchRMASerialNoList);
		
		System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
		
		
		//click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);
		
		int serialcount	=rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data=rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}
		
		String actRmaSerialNo 	=rmaSerialnos.toString();
		String expRmaSerialNo	="[01012023SEC, 01012023SEC1, 01012023SEC2, 01012023SEC3, 01012023SEC4]";
		//excelReader.setCellData(xlfile, xlSheetName, 174, 7, actRmaSerialNo);
		
		System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
		System.out.println("expRmaSerialNo       :"+expRmaSerialNo);		
		
		
		click(RMAPopupOkBtn);	
		Thread.sleep(1000);
		tab(enterRmatxt);
		
		
		Thread.sleep(3000);
    	
    	
    	String actual9throwAvgRate 				= select8thRow_AvgRate.getText();
		String exp9throwAvgRate 				= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 175, 7, actual9throwAvgRate);
		
		String actual9throwOverallAvgRate		= select8thRow_OverAllAvgRate.getText();
		String exp9throwoverallAvgRate			= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 176, 7, actual9throwOverallAvgRate);
		
		String act9throwAvailableStock  		=select8thRow_AvailaleStock.getText();
		String exp9throwAvailableStock 			="22.00";
		//excelReader.setCellData(xlfile, xlSheetName, 177, 7, act9throwAvailableStock);
		
		System.out.println("actual9throwAvgRate             :"+actual9throwAvgRate);
		System.out.println("exp9throwAvgRate                :"+exp9throwAvgRate);
		
		System.out.println("actual9throwOverallAvgRate      :"+actual9throwOverallAvgRate);
		System.out.println("exp9throwoverallAvgRate         :"+exp9throwoverallAvgRate);
		
		System.out.println("act9throwAvailableStock         :"+act9throwAvailableStock);
		System.out.println("exp9throwAvailableStock         :"+exp9throwAvailableStock);
		
				
	
		Thread.sleep(2000);
		
		//String docno=documentNumberTxt.getAttribute("value");
		ClickUsingJs(voucherSaveBtn);
		
		Thread.sleep(2000);
		
		

		click(billRefNewRefTxt);
		Thread.sleep(2000);
		
		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(2000);
	
		
		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 51";
		
		String actMessage = checkValidationMessage(expMessage1);	
	   
	   
	   System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);
		
		Thread.sleep(2000);

		
		
		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actAvailableStock5.equalsIgnoreCase(expAvailableStock5) && actRMAPopupIsDisplaying1==expRMAPopupIsDisplaying1 
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) && actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actual9throwAvgRate.equalsIgnoreCase(exp9throwAvgRate) && actual9throwOverallAvgRate.equalsIgnoreCase(exp9throwoverallAvgRate)
				&& act9throwAvailableStock.equalsIgnoreCase(exp9throwAvailableStock)){	
			click(new_CloseBtn);			
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 171, 8, resPass);
			return true;
			
		} else {
			click(new_CloseBtn);			
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 171, 8, resFail);
			return false;

		}

	}
	
	
	public boolean checkLoginToSUUserAndSavingStockTransferVocher1ForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		reLogin3("su", "su");

		Thread.sleep(3000);

		System.out.println("Signing");

		// Login User Name is Verify

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
		String actUserInfo = userNameDisplayLogo.getText();
		String expUserInfo = "su";
		// excelReader.setCellData(xlfile, xlSheetName, 183, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo
				+ ". Value Expected : " + expUserInfo);

		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName = actGetLoginCompanyNameInformation.substring(0, 25);
		String expGetLoginCompanyName = "Maintain quantity overall and value overall";
		// excelReader.setCellData(xlfile, xlSheetName, 184, 7,
		// actGetLoginCompanyName);
		//companyLogo.click();

		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName
				+ ". Value Expected : " + expGetLoginCompanyName);

		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsStockMenuStockTransfersMenu);
		Thread.sleep(1500);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(stockTransferDatetxt);
		stockTransferDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		stockTransferDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(stockTransferDatetxt, "03/01/2024");
		tab(stockTransferDatetxt);
		tab(stockTransferIssuestxt);
		Thread.sleep(1000);
		enterText(stockTransferWarehousetxt, "HYD");
		Thread.sleep(1000);
		tab(stockTransferWarehousetxt);
		Thread.sleep(2000);

		click(select1stRow_1stColumn);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		String actRow1AvgRate = select1stRow_AvgRate.getText();
		String expRow1AvgRate = "0.0000000";
		// excelReader.setCellData(xlfile, xlSheetName, 185, 7, actRow1AvgRate);

		String actRow1OverAllAvgRate = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate = "0.0000000";
		// excelReader.setCellData(xlfile, xlSheetName, 186, 7,
		// actRow1OverAllAvgRate);

		System.out.println("actRow1AvgRate             :" + actRow1AvgRate);
		System.out.println("expRow1AvgRate             :" + expRow1AvgRate);

		System.out.println("actRow1OverAllAvgRate      :" + actRow1OverAllAvgRate);
		System.out.println("expRow1OverAllAvgRate      :" + expRow1OverAllAvgRate);

		click(select1stRow_8thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));

		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		// excelReader.setCellData(xlfile, xlSheetName, 187, 7,
		// actBatchpopupIsDisplaying);

		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1000);
		click(batchOkIcon);

		Thread.sleep(2000);

		String actRow1AvgRate1 = select1stRow_AvgRate.getText();
		String expRow1AvgRate1 = "100.1234000";
		// excelReader.setCellData(xlfile, xlSheetName, 188, 7, actRow1AvgRate);

		String actRow1OverAllAvgRate1 = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate1 = "100.1234000";
		// excelReader.setCellData(xlfile, xlSheetName, 189, 7,
		// actRow1OverAllAvgRate1);

		String actRow1BatchText = select1stRow_BatchText.getText();
		String expRow1BatchText = "01012023H";
		// excelReader.setCellData(xlfile, xlSheetName, 190, 7,
		// actRow1BatchText);

		System.out.println("actRow1AvgRate1             :" + actRow1AvgRate1);
		System.out.println("expRow1AvgRate1             :" + expRow1AvgRate1);

		System.out.println("actRow1OverAllAvgRate1      :" + actRow1OverAllAvgRate1);
		System.out.println("expRow1OverAllAvgRate1      :" + expRow1OverAllAvgRate1);

		System.out.println("actRow1BatchText            :" + actRow1BatchText);
		System.out.println("expRow1BatchText            :" + expRow1BatchText);

		click(select2ndRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select2ndRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		// excelReader.setCellData(xlfile, xlSheetName, 191, 7,
		// actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023HYD5") || data.equalsIgnoreCase("01012023HYD6")
					|| data.equalsIgnoreCase("01012023HYD7")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023HYD8, 01012023HYD9, 18102022EXH1]";
		// excelReader.setCellData(xlfile, xlSheetName, 192, 7,
		// actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023HYD5, 01012023HYD6, 01012023HYD7]";
		// excelReader.setCellData(xlfile, xlSheetName, 193, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(1000);
		tab(enterRmatxt);

		Thread.sleep(3000);

		String actRow2AvgRate = select2ndRow_AvgRate.getText();
		String expRow2AvgRate = "85.3846000";
		// excelReader.setCellData(xlfile, xlSheetName, 194, 7, actRow2AvgRate);

		String actRow2OverAllAvgRate = select2ndRow_OverAllAvgRate.getText();
		String expRow2OverAllAvgRate = "85.3846000";
		// excelReader.setCellData(xlfile, xlSheetName, 195, 7,
		// actRow2OverAllAvgRate);

		System.out.println("actRow2AvgRate             		  :" + actRow2AvgRate);
		System.out.println("expRow2AvgRate             		  :" + expRow2AvgRate);

		System.out.println("actRow2OverAllAvgRate             :" + actRow2OverAllAvgRate);
		System.out.println("expRow2OverAllAvgRate             :" + expRow2OverAllAvgRate);

		// 3rd Row

		ClickUsingJs(select3rdRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterWarehousettxt2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		ClickUsingJs(select3rdRow_9thColumn);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		// excelReader.setCellData(xlfile, xlSheetName, 196, 7,
		// actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		tab(bin1Txt);

		// bin2Txt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		String actBinpopupIsDisplaying1 = Boolean.toString(binSearchTxt.isDisplayed());
		String expBinpopupIsDisplaying1 = "true";
		// excelReader.setCellData(xlfile, xlSheetName, 197, 7,
		// actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		// String docno=documentNumberTxt.getAttribute("value");
		click(voucherSaveBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 93";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actRow1AvgRate.equalsIgnoreCase(expRow1AvgRate)
				&& actRMAPopupIsDisplaying1 == expRMAPopupIsDisplaying1
				&& actRow1OverAllAvgRate.equalsIgnoreCase(expRow1OverAllAvgRate)
				&& actRow1AvgRate1.equalsIgnoreCase(expRow1AvgRate1)
				&& actRow1OverAllAvgRate1.equalsIgnoreCase(expRow1OverAllAvgRate1)
				&& actRow1BatchText.equalsIgnoreCase(expRow1BatchText)
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actRow2AvgRate.equalsIgnoreCase(expRow2AvgRate)
				&& actRow2OverAllAvgRate.equalsIgnoreCase(expRow2OverAllAvgRate)
				&& actBatchpopupIsDisplaying==expBatchpopupIsDisplaying
		        && actBinpopupIsDisplaying==expBinpopupIsDisplaying
		        && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 183, 8, resPass);
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 183, 8, resFail);
			return false;

		}
	}
	
	public boolean checkSavingStockTransferVocher2ForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		

		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsStockMenuStockTransfersMenu);
		Thread.sleep(1500);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(stockTransferDatetxt);
		stockTransferDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		stockTransferDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(stockTransferDatetxt, "04/01/2024");
		tab(stockTransferDatetxt);
		tab(stockTransferIssuestxt);
		Thread.sleep(1000);
		enterText(stockTransferWarehousetxt, "SEC");
		Thread.sleep(1000);
		tab(stockTransferWarehousetxt);
		Thread.sleep(2000);

		click(select1stRow_1stColumn);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		String actRow1AvgRate = select1stRow_AvgRate.getText();
		String expRow1AvgRate = "0.0000000";
		// excelReader.setCellData(xlfile, xlSheetName, 185, 7, actRow1AvgRate);

		String actRow1OverAllAvgRate = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate = "0.0000000";
		// excelReader.setCellData(xlfile, xlSheetName, 186, 7,
		// actRow1OverAllAvgRate);

		System.out.println("actRow1AvgRate             :" + actRow1AvgRate);
		System.out.println("expRow1AvgRate             :" + expRow1AvgRate);

		System.out.println("actRow1OverAllAvgRate      :" + actRow1OverAllAvgRate);
		System.out.println("expRow1OverAllAvgRate      :" + expRow1OverAllAvgRate);

		click(select1stRow_8thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));

		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		// excelReader.setCellData(xlfile, xlSheetName, 187, 7,
		// actBatchpopupIsDisplaying);

		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1000);
		click(batchOkIcon);

		Thread.sleep(2000);

		String actRow1AvgRate1 = select1stRow_AvgRate.getText();
		String expRow1AvgRate1 = "100.4567000";
		// excelReader.setCellData(xlfile, xlSheetName, 188, 7, actRow1AvgRate);

		String actRow1OverAllAvgRate1 = select1stRow_OverAllAvgRate.getText();
		String expRow1OverAllAvgRate1 = "100.4567000";
		// excelReader.setCellData(xlfile, xlSheetName, 189, 7,
		// actRow1OverAllAvgRate1);

		String actRow1BatchText = select1stRow_BatchText.getText();
		String expRow1BatchText = "01012023S";
		// excelReader.setCellData(xlfile, xlSheetName, 190, 7,
		// actRow1BatchText);

		System.out.println("actRow1AvgRate1             :" + actRow1AvgRate1);
		System.out.println("expRow1AvgRate1             :" + expRow1AvgRate1);

		System.out.println("actRow1OverAllAvgRate1      :" + actRow1OverAllAvgRate1);
		System.out.println("expRow1OverAllAvgRate1      :" + expRow1OverAllAvgRate1);

		System.out.println("actRow1BatchText            :" + actRow1BatchText);
		System.out.println("expRow1BatchText            :" + expRow1BatchText);

		click(select2ndRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select2ndRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		// excelReader.setCellData(xlfile, xlSheetName, 191, 7,
		// actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023SEC5") || data.equalsIgnoreCase("01012023SEC6")
					|| data.equalsIgnoreCase("01012023SEC7")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023SEC5, 01012023SEC6, 01012023SEC7, 01012023SEC8, 01012023SEC9, 04112022EXS1]";
		// excelReader.setCellData(xlfile, xlSheetName, 192, 7,
		// actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023SEC5, 01012023SEC6, 01012023SEC7]";
		// excelReader.setCellData(xlfile, xlSheetName, 193, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(1000);
		tab(enterRmatxt);

		Thread.sleep(3000);

		String actRow2AvgRate = select2ndRow_AvgRate.getText();
		String expRow2AvgRate = "85.3846000";
		// excelReader.setCellData(xlfile, xlSheetName, 194, 7, actRow2AvgRate);

		String actRow2OverAllAvgRate = select2ndRow_OverAllAvgRate.getText();
		String expRow2OverAllAvgRate = "85.3846000";
		// excelReader.setCellData(xlfile, xlSheetName, 195, 7,
		// actRow2OverAllAvgRate);

		System.out.println("actRow2AvgRate             		  :" + actRow2AvgRate);
		System.out.println("expRow2AvgRate             		  :" + expRow2AvgRate);

		System.out.println("actRow2OverAllAvgRate             :" + actRow2OverAllAvgRate);
		System.out.println("expRow2OverAllAvgRate             :" + expRow2OverAllAvgRate);

		// 3rd Row

		click(select3rdRow_1stColumn);

		enterWarehousettxt2.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt2.sendKeys(Keys.BACK_SPACE);
		enterWarehousettxt2.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		enterText(enterWarehousettxt2, "TEST");
		Thread.sleep(2000);
		tab(enterWarehousettxt2);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "33");
		tab(enterRatetxt);
		Thread.sleep(2000);

		click(select3rdRow_9thColumn);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		// excelReader.setCellData(xlfile, xlSheetName, 196, 7,
		// actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		tab(bin1Txt);

		// bin2Txt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		String actBinpopupIsDisplaying1 = Boolean.toString(binSearchTxt.isDisplayed());
		String expBinpopupIsDisplaying1 = "true";
		// excelReader.setCellData(xlfile, xlSheetName, 197, 7,
		// actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		Thread.sleep(2000);

		// String docno=documentNumberTxt.getAttribute("value");
		click(voucherSaveBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 94";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actRow1AvgRate.equalsIgnoreCase(expRow1AvgRate)
				&& actRMAPopupIsDisplaying1 == expRMAPopupIsDisplaying1
				&& actRow1OverAllAvgRate.equalsIgnoreCase(expRow1OverAllAvgRate)
				&& actRow1AvgRate1.equalsIgnoreCase(expRow1AvgRate1)
				&& actRow1OverAllAvgRate1.equalsIgnoreCase(expRow1OverAllAvgRate1)
				&& actRow1BatchText.equalsIgnoreCase(expRow1BatchText)
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actRow2AvgRate.equalsIgnoreCase(expRow2AvgRate)
				&& actRow2OverAllAvgRate.equalsIgnoreCase(expRow2OverAllAvgRate)
				&& actBatchpopupIsDisplaying==expBatchpopupIsDisplaying
		        && actBinpopupIsDisplaying==expBinpopupIsDisplaying
		        && actBinpopupIsDisplaying1==expBinpopupIsDisplaying1){
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 183, 8, resPass);
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(2000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 183, 8, resFail);
			return false;

		}
	}
	
	
	public boolean  checkSavingexcessInStocksVoucherWithALLItemsInInvUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		
		reLogin3("inv", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "inv";	
		//excelReader.setCellData(xlfile, xlSheetName, 276, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 25);
		String expGetLoginCompanyName            = "Maintain quantity overall and value overall";   
		//excelReader.setCellData(xlfile, xlSheetName, 277, 7, actGetLoginCompanyName);
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		Thread.sleep(2000);
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsExcessesStocks);
		click(newBtn);
		
		checkValidationMessage("Screen opened");
		
		click(excessesStockDatetxt);
		excessesStockDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		excessesStockDatetxt.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		enterText(excessesStockDatetxt, "05/01/2024");
		Thread.sleep(1500);
		tab(excessesStockDatetxt);
		
		enterText(partyAccounttxt, "Cost of goods sold - Computers");
		Thread.sleep(1500);
		tab(partyAccounttxt);
		
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1500);
		tab(salesDepartmenttxt);
		
		
		
		
		click(select1stRow_1stColumn);
		
		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1000);
		tab(enterWarehousettxt);
				
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select1stRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		click(select1stRow_14thColumn);
		
		enterText(enterBatchtxt, "05012023EXH");
		tab(enterBatchtxt);
		
		// 2nd Row
		
		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);		
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(1000);
		tab(enterWarehousettxt);				
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);	
		
		click(select2ndRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		
		click(select2ndRow_14thColumn);
		
		enterText(enterBatchtxt, "05012023EXS");
		tab(enterBatchtxt);
		
		//3rd Row
		
		ClickUsingJs(select3rdRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		click(select3rdRow_4thColumn);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		
		click(select3rdRow_15thColumn);		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 278, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);

		// 4th Row

		ClickUsingJs(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select4thRow_4thColumn);
		
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		
		click(select4thRow_15thColumn);		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 279, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		// 5th Row

		ClickUsingJs(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select5thRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.1234");
		tab(enterRatetxt);
		
		click(select5thRow_16thColumn);
		
		Thread.sleep(2000);
		
		String actual5throwAvgRate 			= select5thRow_AvgRateExcess.getText();
		String exp5throwAvgRate			    = "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 280, 7, actual5throwAvgRate);
		
		String actual5throwOverallAvgRate   = select5thRow_ExcessStockOverAllAvgRate1.getText();
		String exp5throwoverallAvgRate      = "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 281, 7, actual5throwOverallAvgRate);
		
		System.out.println("actual5throwAvgRate       	 :" + actual5throwAvgRate);
		System.out.println("exp5throwAvgRate             :" + exp5throwAvgRate);

		System.out.println("actual5throwOverallAvgRate   :" + actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate      :" + exp5throwoverallAvgRate);
		
		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 282, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);
		
		enterText(rmaSerialNumberTxtField, "05012023EXH1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);

		// 6th Row
		Thread.sleep(1000);
		click(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);		
		tab(enterItemttxt);
		
		click(select6thRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "101.4567");
		tab(enterRatetxt);
		
		click(select6thRow_16thColumn);
		
		Thread.sleep(2000);
		
		String actual6throwAvgRate 				= select6thRow_AvgRate.getText();
		String exp6throwAvgRate 				= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 283, 7, actual6throwAvgRate);
		
		String actual6throwOverallAvgRate		= select6thRow_ExcessStockOverAllAvgRate1.getText();
		String exp6throwoverallAvgRate			= "85.3846000";
		//excelReader.setCellData(xlfile, xlSheetName, 284, 7, actual6throwOverallAvgRate);
		
		System.out.println("actual6throwAvgRate      	 :" + actual6throwAvgRate);
		System.out.println("exp6throwAvgRate          	 :" + exp6throwAvgRate);

		System.out.println("actual6throwOverallAvgRate   :" + actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate      :" + exp6throwoverallAvgRate);
		
		Thread.sleep(1000);
		//enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 285, 7, actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		enterText(rmaSerialNumberTxtField, "05012023EXS1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(2000);		
		tab(enterRmatxt);
		
		
		Thread.sleep(2000);
		click(voucherSaveBtn);
		Thread.sleep(2000);
		
		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 46";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate)
				&& actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {
			
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return true;
			
		} else {
			click(new_CloseBtn);			
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			
			return false;

		}

	}
	
	
	public boolean  checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		reLogin3("su", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "su";	
		//excelReader.setCellData(xlfile, xlSheetName, 308, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 25);
		String expGetLoginCompanyName            = "Maintain quantity overall and value overall";   
		//excelReader.setCellData(xlfile, xlSheetName, 309, 7, actGetLoginCompanyName);
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		Thread.sleep(2000);

		
		
		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStockMenu);
		click(inventoryTransactionsShortagesInStocks);
		click(newBtn);	
		
		checkValidationMessage("Screen opened");
		
		
		click(shortagesInStockDatetxt);
		shortagesInStockDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		shortagesInStockDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(shortagesInStockDatetxt, "06/01/2024");
		Thread.sleep(1000);
		tab(shortagesInStockDatetxt);	
		
		
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		
		
		click(select1stRow_1stColumn);		
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(1000);
		tab(enterWarehousettxt);	
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select1stRow_9thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNo		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNo		="01012023H";
		//excelReader.setCellData(xlfile, xlSheetName, 310, 7, actRow1BatchNo);
		
		String actRow2BatchNo		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNo		="05012023EXH";
		//excelReader.setCellData(xlfile, xlSheetName, 311, 7, actRow2BatchNo);
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="3.00";
		//excelReader.setCellData(xlfile, xlSheetName, 312, 7, actRow1Baseqty);
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="100.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 313, 7, actRow1Rate);
		
		String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 314, 7, actRow2Baseqty);
		
		String actRow2Rate			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate			="101.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 315, 7, actRow2Rate);
		
	
		System.out.println("actRow1BatchNo             :"+actRow1BatchNo);
		System.out.println("expRow1BatchNo             :"+expRow1BatchNo);
		
		System.out.println("actRow2BatchNo             :"+actRow2BatchNo);
		System.out.println("expRow2BatchNo             :"+expRow2BatchNo);		
		
		
		System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate                :"+actRow1Rate);
		System.out.println("expRow1Rate                :"+expRow1Rate);
		
		System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
		System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
		
		System.out.println("actRow2Rate                :"+actRow2Rate);
		System.out.println("expRow2Rate                :"+expRow2Rate);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 316, 7, actBatchpopupIsDisplaying);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		Thread.sleep(1500);
		click(batchOkIcon);
		Thread.sleep(1500);

		// 2nd Row

		click(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select2ndRow_9thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNoSecLocation		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNoSecLocation		="01012023S";
		//excelReader.setCellData(xlfile, xlSheetName, 317, 7, actRow1BatchNoSecLocation);
		
		String actRow2BatchNoSecLocation		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNoSecLocation		="05012023EXS";
		//excelReader.setCellData(xlfile, xlSheetName, 318, 7, actRow2BatchNoSecLocation);
		
		String actRow1BaseqtySecLocation		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1BaseqtySecLocation		="3.00";
		//excelReader.setCellData(xlfile, xlSheetName, 319, 7, actRow1BaseqtySecLocation);
		
		String actRow1RateSecLocation			=batchPopUPRow1RateTxt.getText();
		String expRow1RateSecLocation			="100.4567";
		//excelReader.setCellData(xlfile, xlSheetName, 320, 7, actRow1RateSecLocation);
		
		String actRow2BaseqtySecLocation		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2BaseqtySecLocation		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 321, 7, actRow2BaseqtySecLocation);
		
		String actRow2RateSecLocation			=batchPopUPRow2RateTxt.getText();
		String expRow2RateSecLocation			="101.4567";
		//excelReader.setCellData(xlfile, xlSheetName, 322, 7, actRow2RateSecLocation);
		
	
		System.out.println("actRow1BatchNoSecLocation             :"+actRow1BatchNoSecLocation);
		System.out.println("expRow1BatchNoSecLocation             :"+expRow1BatchNoSecLocation);
		
		System.out.println("actRow2BatchNoSecLocation             :"+actRow2BatchNoSecLocation);
		System.out.println("expRow2BatchNoSecLocation             :"+expRow2BatchNoSecLocation);
		
		
		
		System.out.println("actRow1BaseqtySecLocation             :"+actRow1BaseqtySecLocation);
		System.out.println("expRow1BaseqtySecLocation             :"+expRow1BaseqtySecLocation);
		
		System.out.println("actRow1RateSecLocation                :"+actRow1RateSecLocation);
		System.out.println("expRow1RateSecLocation                :"+expRow1RateSecLocation);
		
		System.out.println("actRow2BaseqtySecLocation             :"+actRow2BaseqtySecLocation);
		System.out.println("expRow2BaseqtySecLocation             :"+expRow2BaseqtySecLocation);
		
		System.out.println("actRow2RateSecLocation                :"+actRow2RateSecLocation);
		System.out.println("expRow2RateSecLocation                :"+expRow2RateSecLocation);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 323, 7, actBatchpopupIsDisplaying1);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying1 + "  Value Expected  "
				+ expBatchpopupIsDisplaying1);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);
		
		if(actRow1BatchNo.equalsIgnoreCase(expRow1BatchNo) && actRow2BatchNo.equalsIgnoreCase(expRow2BatchNo) 
				&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate) 
				&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)
				&& actRow1BatchNoSecLocation.equalsIgnoreCase(expRow1BatchNoSecLocation) && actRow2BatchNoSecLocation.equalsIgnoreCase(expRow2BatchNoSecLocation)
				&& actRow1BaseqtySecLocation.equalsIgnoreCase(expRow1BaseqtySecLocation) && actRow1RateSecLocation.equalsIgnoreCase(expRow1RateSecLocation)
				&& actRow2BaseqtySecLocation.equalsIgnoreCase(expRow2BaseqtySecLocation) && actRow2RateSecLocation.equalsIgnoreCase(expRow2RateSecLocation)){
			
			//excelReader.setCellData(xlfile, xlSheetName, 308, 8, resPass);
			return true;
		}
			else{
				
				//excelReader.setCellData(xlfile, xlSheetName, 308, 8, resFail);
				return false;
			}
		
	}
	
	public boolean  checkSavingShortagesinStockVoucherWithBrItemTestWareHosueForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		// 3rd Row
				Thread.sleep(1622);
				click(select3rdRow_1stColumn);
				Thread.sleep(2000);
				enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
				Thread.sleep(2000);
				enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
				enterText(enterWarehousettxt, "TEST");
				Thread.sleep(3000);
				tab(enterWarehousettxt);
				
				enterText(enterItemttxt, "BR-BATCH");
				Thread.sleep(2000);
				tab(enterItemttxt);
				Thread.sleep(2000);	
				
				enterText(enterQuantitytxt, "6");
				tab(enterQuantitytxt);
				
				enterText(enterRatetxt, "200");
				tab(enterRatetxt);	
				
				click(select3rdRow_9thColumn);
				
				Thread.sleep(3000);
				
				String actRow1BatchNoTestLocation		=batchPopUPRow1BatchNoTxt.getText();
				String expRow1BatchNoTestLocation		="01112022PS";
				//excelReader.setCellData(xlfile, xlSheetName, 324, 7, actRow1BatchNoTestLocation);
				
				String actRow2BatchNoTestLocation		=batchPopUPRow2BatchNoTxt.getText();
				String expRow2BatchNoTestLocation		="01012023H";
				//excelReader.setCellData(xlfile, xlSheetName, 325, 7, actRow2BatchNoTestLocation);
				
				String actRow3BatchNoTestLocation		=batchPopUPRow3BatchNoTxt.getText();
				String expRow3BatchNoTestLocation		="01012023S";
				//excelReader.setCellData(xlfile, xlSheetName, 326, 7, actRow3BatchNoTestLocation);
				
				String actRow1BaseqtyTestLocation		=batchPopUPRow1BaseQuantityTxt.getText();
				String expRow1BaseqtyTestLocation		="2.00";
				//excelReader.setCellData(xlfile, xlSheetName, 327, 7, actRow1BaseqtyTestLocation);
				
				String actRow1RateTestLocation			=batchPopUPRow1RateTxt.getText();
				String expRow1RateTestLocation			="11.1111";
				//excelReader.setCellData(xlfile, xlSheetName, 328, 7, actRow1RateTestLocation);
				
				String actRow2BaseqtyTestLocation		=batchPopUPRow2BaseQuantityTxt.getText();
				String expRow2BaseqtyTestLocation		="3.00";
				//excelReader.setCellData(xlfile, xlSheetName, 329, 7, actRow2BaseqtyTestLocation);
				
				String actRow2RateTestLocation			=batchPopUPRow2RateTxt.getText();
				String expRow2RateTestLocation			="100.1234";
				//excelReader.setCellData(xlfile, xlSheetName, 330, 7, actRow2RateTestLocation);
				
				String actRow3BaseqtyTestLocation		=batchPopUPRow3BaseQuantityTxt.getText();
				String expRow3BaseqtyTestLocation		="3.00";
				//excelReader.setCellData(xlfile, xlSheetName, 331, 7, actRow3BaseqtyTestLocation);
				
				String actRow3RateTestLocation			=batchPopUPRow3RateTxt.getText();
				String expRow3RateTestLocation			="100.4567";
				//	excelReader.setCellData(xlfile, xlSheetName, 332, 7, actRow3RateTestLocation);
				
				
			
				System.out.println("actRow1BatchNoTestLocation             :"+actRow1BatchNoTestLocation);
				System.out.println("expRow1BatchNoTestLocation             :"+expRow1BatchNoTestLocation);
				
				System.out.println("actRow2BatchNoTestLocation             :"+actRow2BatchNoTestLocation);
				System.out.println("expRow2BatchNoTestLocation             :"+expRow2BatchNoTestLocation);
				
				System.out.println("actRow3BatchNoTestLocation             :"+actRow3BatchNoTestLocation);
				System.out.println("expRow3BatchNoTestLocation             :"+expRow3BatchNoTestLocation);
				
				System.out.println("actRow3RateTestLocation                :"+actRow3RateTestLocation);
				System.out.println("expRow3RateTestLocation                :"+expRow3RateTestLocation);
				
				System.out.println("actRow3BaseqtyTestLocation             :"+actRow3BaseqtyTestLocation);
				System.out.println("expRow3BaseqtyTestLocation             :"+expRow3BaseqtyTestLocation);
				
				System.out.println("actRow1BaseqtyTestLocation             :"+actRow1BaseqtyTestLocation);
				System.out.println("expRow1BaseqtyTestLocation             :"+expRow1BaseqtyTestLocation);
				
				System.out.println("actRow1RateTestLocation                :"+actRow1RateTestLocation);
				System.out.println("expRow1RateTestLocation                :"+expRow1RateTestLocation);
				
				System.out.println("actRow2BaseqtyTestLocation             :"+actRow2BaseqtyTestLocation);
				System.out.println("expRow2BaseqtyTestLocation             :"+expRow2BaseqtyTestLocation);
				
				System.out.println("actRow2RateTestLocation                :"+actRow2RateTestLocation);
				System.out.println("expRow2RateTestLocation                :"+expRow2RateTestLocation);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
				
				boolean actBatchpopupIsDisplaying2 = batchPickOnFIFOIcon.isDisplayed();
				boolean expBatchpopupIsDisplaying2 = true;
				//excelReader.setCellData(xlfile, xlSheetName, 333, 7, actBatchpopupIsDisplaying2);
				
				System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying2 + "  Value Expected  "
						+ expBatchpopupIsDisplaying2);
				click(batchPickOnFIFOIcon);
				click(batchOkIcon);
				
				Thread.sleep(2000);
				click(select6thRow_1stColumn);

				int row3List=Row3ShortageInStockVoucherBodyList.size();
				System.err.println(row3List);
				ArrayList<String> row3ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row3List ;i++)
			  	{
			  		String data=Row3ShortageInStockVoucherBodyList.get(i).getText();
			  		row3ShortageStockList.add(data);
			  	}
				
				String actrow3ShortageStockList = row3ShortageStockList.toString();
				String exprow3ShortageStockList = "[3, TEST, BR-BATCH, 2.00, 200.0000, 400.0000, 11.1111000, 11.1111000, 22.2222, 01112022PS, , ]";
				//excelReader.setCellData(xlfile, xlSheetName, 334, 7, actrow3ShortageStockList);
				
				System.out.println("actrow3ShortageStockList       :"+actrow3ShortageStockList);		
				System.out.println("exprow3ShortageStockList       :"+exprow3ShortageStockList);
				
				
				int row4List=Row4ShortageInStockVoucherBodyList.size();
				System.err.println(row4List);
				ArrayList<String> row4ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row4List ;i++)
			  	{
			  		String data=Row4ShortageInStockVoucherBodyList.get(i).getText();
			  		row4ShortageStockList.add(data);
			  	}
				
				String actrow4ShortageStockList = row4ShortageStockList.toString();
				String exprow4ShortageStockList = "[4, TEST, BR-BATCH, 3.00, 200.0000, 600.0000, 100.1234000, 100.1234000, 300.3702, 01012023H, , ]";
				//excelReader.setCellData(xlfile, xlSheetName, 335, 7, actrow4ShortageStockList);
				
				System.out.println("actrow4ShortageStockList       :"+actrow4ShortageStockList);		
				System.out.println("exprow4ShortageStockList       :"+exprow4ShortageStockList);
				
				int row5List=Row5ShortageInStockVoucherBodyList.size();
				System.err.println(row5List);
				ArrayList<String> row5ShortageStockList = new ArrayList<String>();
				for(int i=0 ; i < row5List ;i++)
			  	{
			  		String data=Row5ShortageInStockVoucherBodyList.get(i).getText();
			  		row5ShortageStockList.add(data);
			  	}
				
				String actrow5ShortageStockList = row5ShortageStockList.toString();
				String exprow5ShortageStockList = "[5, TEST, BR-BATCH, 1.00, 200.0000, 200.0000, 100.4567000, 100.4567000, 100.4567, 01012023S, , ]";
				//excelReader.setCellData(xlfile, xlSheetName, 336, 7, actrow5ShortageStockList);
				
				System.out.println("actrow5ShortageStockList       :"+actrow5ShortageStockList);		
				System.out.println("exprow5ShortageStockList       :"+exprow5ShortageStockList);
		
				if(actRow1BatchNoTestLocation.equalsIgnoreCase(expRow1BatchNoTestLocation) && actRow2BatchNoTestLocation.equalsIgnoreCase(expRow2BatchNoTestLocation) 
						&& actRow3BatchNoTestLocation.equalsIgnoreCase(expRow3BatchNoTestLocation) && actRow3BaseqtyTestLocation.equalsIgnoreCase(expRow3BaseqtyTestLocation) 
						&& actRow3RateTestLocation.equalsIgnoreCase(expRow3RateTestLocation) && actRow1BaseqtyTestLocation.equalsIgnoreCase(expRow1BaseqtyTestLocation)
						&& actRow1RateTestLocation.equalsIgnoreCase(expRow1RateTestLocation) && actRow2BaseqtyTestLocation.equalsIgnoreCase(expRow2BaseqtyTestLocation) 
						&& actRow2RateTestLocation.equalsIgnoreCase(expRow2RateTestLocation) && actrow3ShortageStockList.equalsIgnoreCase(exprow3ShortageStockList)
						&& actrow4ShortageStockList.equalsIgnoreCase(exprow4ShortageStockList) && actrow5ShortageStockList.equalsIgnoreCase(exprow5ShortageStockList)){
					
					//excelReader.setCellData(xlfile, xlSheetName, 324, 8, resPass);
					return true;
				}
					else{
						
						//excelReader.setCellData(xlfile, xlSheetName, 324, 8, resFail);
						return false;
					}
		
	          }
	
	public boolean  checkSavingShortagesinStockVoucherWithFifoItem3WareHosueForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
	   // excelReader=new ExcelReader(POJOUtility.getExcelPath());
// 3rd Row

		//click(select6thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select6thRow_10thColumn);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 337, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(1800);
		
		//7th Row
		
		click(select7thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);	
		
		click(select7thRow_10thColumn);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 338, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		//tab(bin1Txt);
		
		//8th Row
		
		click(select8thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "TEST");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		enterText(enterQuantitytxt, "6");
		tab(enterQuantitytxt);

		enterText(enterRatetxt, "200");
		tab(enterRatetxt);

		click(select8thRow_10thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying2 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying2 = true;
		// excelReader.setCellData(xlfile, xlSheetName, 339, 7,
		// actBinpopupIsDisplaying2);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying2 + "  Value Expected  "
				+ expBinpopupIsDisplaying2);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);
		// tab(bin1Txt);
		Thread.sleep(2000);

		if (actBinpopupIsDisplaying == expBinpopupIsDisplaying && actBinpopupIsDisplaying1 == expBinpopupIsDisplaying1
				&& actBinpopupIsDisplaying2 == expBinpopupIsDisplaying2) {

			// excelReader.setCellData(xlfile, xlSheetName, 337, 8, resPass);
			return true;

		} else {

			// excelReader.setCellData(xlfile, xlSheetName, 337, 8, resFail);
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemHydWareHosueForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		// excelReader=new ExcelReader(POJOUtility.getExcelPath());
		// 9th Row

		click(select9thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);

		click(select9thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 349, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023HYD8")
					|| data.equalsIgnoreCase("01012023HYD9")
					|| data.equalsIgnoreCase("05012023EXH1")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023HYD8, 01012023HYD9, 05012023EXH1, 18102022EXH1]";
		//excelReader.setCellData(xlfile, xlSheetName, 350, 7, actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023HYD8, 01012023HYD9, 05012023EXH1]";
		//excelReader.setCellData(xlfile, xlSheetName, 351, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row9List = Row9ShortageInStockVoucherBodyList.size();
		System.err.println(row9List);
		ArrayList<String> row9ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row9List; i++) {
			String data = Row9ShortageInStockVoucherBodyList.get(i).getText();
			row9ShortageStockList.add(data);
		}

		String actrow9ShortageStockList = row9ShortageStockList.toString();
		String exprow9ShortageStockList = "[9, HYD, WA-RMA, 3.00, 100.0000, 300.0000, 87.3728000, 87.3728000, 262.1184, , , 01012023HYD8,01012023HYD9,05012023EXH1]";
		//excelReader.setCellData(xlfile, xlSheetName, 352, 7, actrow9ShortageStockList);

		System.out.println("actrow9ShortageStockList       :" + actrow9ShortageStockList);
		System.out.println("exprow9ShortageStockList       :" + exprow9ShortageStockList);

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow9ShortageStockList.equalsIgnoreCase(exprow9ShortageStockList)) {

			//excelReader.setCellData(xlfile, xlSheetName, 349, 8, resPass);
			return true;

		} else {

			//excelReader.setCellData(xlfile, xlSheetName, 349, 8, resFail);
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemSecWareHosueForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		//excelReader = new ExcelReader(POJOUtility.getExcelPath());

		// 10th Row

		click(select10thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "3");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);

		click(select10thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 356, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("01012023SEC8")
					|| data.equalsIgnoreCase("01012023SEC9")
					|| data.equalsIgnoreCase("04112022EXS1")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[01012023SEC8, 01012023SEC9, 04112022EXS1, 05012023EXS1]";
		//excelReader.setCellData(xlfile, xlSheetName, 357, 7, actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[01012023SEC8, 01012023SEC9, 04112022EXS1]";
		//excelReader.setCellData(xlfile, xlSheetName, 358, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row10List = Row10ShortageInStockVoucherBodyList.size();
		System.err.println(row10List);
		ArrayList<String> row10ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row10List; i++) {
			String data = Row10ShortageInStockVoucherBodyList.get(i).getText();
			row10ShortageStockList.add(data);
		}

		String actrow10ShortageStockList = row10ShortageStockList.toString();
		String exprow10ShortageStockList = "[10, SEC, WA-RMA, 3.00, 100.0000, 300.0000, 87.3728000, 87.3728000, 262.1184, , , 01012023SEC8,01012023SEC9,04112022EXS1]";
		//excelReader.setCellData(xlfile, xlSheetName, 359, 7, actrow10ShortageStockList);

		System.out.println("actrow10ShortageStockList       :" + actrow10ShortageStockList);
		System.out.println("exprow10ShortageStockList       :" + exprow10ShortageStockList);

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow10ShortageStockList.equalsIgnoreCase(exprow10ShortageStockList)) {

			//excelReader.setCellData(xlfile, xlSheetName, 356, 8, resPass);
			return true;

		} else {

			//excelReader.setCellData(xlfile, xlSheetName, 356, 8, resFail);
			return false;
		}

	}

	public boolean checkSavingShortagesinStockVoucherWithRmaItemTestWareHosueForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		//excelReader = new ExcelReader(POJOUtility.getExcelPath());

		// 11th Row

		click(select11thRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "TEST");
		Thread.sleep(3000);
		tab(enterWarehousettxt);

		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "6");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "200");
		tab(enterRatetxt);

		click(select11thRow_11thColumn);

		Thread.sleep(1000);
		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 363, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		click(rmaSearchGridField);
		Thread.sleep(1000);

		int count = rmaSerialNos.size();

		ArrayList<String> SearchRMA = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = rmaSerialNos.get(i).getText();
			SearchRMA.add(data);

			if (data.equalsIgnoreCase("20062022PS8")
					|| data.equalsIgnoreCase("20082021PS8")
					|| data.equalsIgnoreCase("01012023HYD5")
					|| data.equalsIgnoreCase("01012023HYD6")
					|| data.equalsIgnoreCase("01012023HYD7")
					|| data.equalsIgnoreCase("01012023SEC5")) {
				rmaSerialNoCheckBoxes.get(i).click();
			}
		}

		String actSearchRMASerialNoList = SearchRMA.toString();
		String expSearchRMASerialNoList = "[20062022PS8, 20082021PS8, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023SEC5, 01012023SEC6, 01012023SEC7]";
		//excelReader.setCellData(xlfile, xlSheetName, 364, 7, actSearchRMASerialNoList);

		System.out.println("actSearchRMASerialNoList       :" + actSearchRMASerialNoList);
		System.out.println("expSearchRMASerialNoList       :" + expSearchRMASerialNoList);

		// click(searchRmaSelectAllGridCheckBox);
		click(searchRmaOkBtn);

		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[20062022PS8, 20082021PS8, 01012023HYD5, 01012023HYD6, 01012023HYD7, 01012023SEC5]";
		//excelReader.setCellData(xlfile, xlSheetName, 365, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row11List = Row11ShortageInStockVoucherBodyList.size();
		System.err.println(row11List);
		ArrayList<String> row11ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row11List; i++) {
			String data = Row11ShortageInStockVoucherBodyList.get(i).getText();
			row11ShortageStockList.add(data);
		}

		String actrow11ShortageStockList = row11ShortageStockList.toString();
		String exprow11ShortageStockList = "[11, TEST, WA-RMA, 6.00, 200.0000, 1,200.0000, 87.3728000, 87.3728000, 524.2368, , , 20062022PS8,20082021PS8,01012023HYD5,01012023HYD6,01012023HYD7,01012023SEC5]";
		//excelReader.setCellData(xlfile, xlSheetName, 366, 7, actrow11ShortageStockList);

		System.out.println("actrow11ShortageStockList       :" + actrow11ShortageStockList);
		System.out.println("exprow11ShortageStockList       :" + exprow11ShortageStockList);

		/*String docno = documentNumberTxt.getAttribute("value");
		Thread.sleep(2000);*/
		click(voucherSaveBtn);
		
		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 46";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);


		/*String expMessage1 = excelReader.getCellData(xlSheetName, 367, 6);
		String expMessage2 = excelReader.getCellData(xlSheetName, 368, 6);

		String actMessage = checkValidationMessage(expMessage1);
		excelReader.setCellData(xlfile, xlSheetName, 367, 7, actMessage);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);*/

		if (actRMAPopupIsDisplaying==expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actMessage.startsWith(expMessage1)
				&& actMessage.endsWith(expMessage2)
				&& actrow11ShortageStockList.equalsIgnoreCase(exprow11ShortageStockList)) {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 363, 8, resPass);
			return true;

		} else {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 363, 8, resFail);
			return false;
		}

	}
	
	
public boolean  checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		/*Thread.sleep(3000);
		click(userNameDisplayLogo);
		Thread.sleep(1000);
		click(logoutOption);		
		Thread.sleep(3000);
		
		String unamelt=excelReader.getCellData(xlSheetName, 373, 5);

		String pawslt=excelReader.getCellData(xlSheetName, 374, 5);
		
		LoginPage.enterUserName(unamelt);	     
        LoginPage.enterPassword(pawslt);
        
		
		 Select company = new Select(companyDropDownList);
		 company.selectByValue(excelReader.getCellData(xlSheetName, 375, 5));
		 Thread.sleep(2000);
		 
  
        LoginPage.clickOnSignInBtn();  */
		
		reLogin3("inv", "su");
        
        Thread.sleep(3000);
        
        System.out.println("Signing");
        
        // Login User Name is Verify
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String actUserInfo                      = userNameDisplay.getText();
		String expUserInfo                      = "inv";	
		//excelReader.setCellData(xlfile, xlSheetName, 373, 7, actUserInfo);

		System.out.println("Login With Valid User and Check User Name Display Value Actual : ." + actUserInfo + ". Value Expected : " + expUserInfo);
		
		
		// Login Company Name is Verify
		Thread.sleep(1000);
		//click(companyLogo);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		String actGetLoginCompanyNameInformation = companyName.getText();
		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 25);
		String expGetLoginCompanyName            = "Maintain quantity overall and value overall"; 
		//excelReader.setCellData(xlfile, xlSheetName, 374, 7, actGetLoginCompanyName);
		//companyLogo.click();
		
		System.out.println("Company Name Display Value Actual                : ." + actGetLoginCompanyName +  ". Value Expected : " + expGetLoginCompanyName);
		
		
		Thread.sleep(1000);
		
		
		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(financialsTransactionsPurchaseMenuPurchasesReturns);
		click(newBtn);	
		
		checkValidationMessage("Screen opened");
		
		click(purchaseReturnsDatetxt);
		purchaseReturnsDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		purchaseReturnsDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(purchaseReturnsDatetxt, "07/01/2024");
		tab(purchaseReturnsDatetxt);
		
		Thread.sleep(2000);
		//enterText(purchasesReturnsAccounttxt, excelReader.getCellData(xlSheetName, 377, 5));
		//tab(purchasesReturnsAccounttxt);
		//Thread.sleep(2000);
		enterText(purchasesReturnsvendorAccounttxt, "Vendor A");
		Thread.sleep(2000);
		//click(purchasesReturnsDepartmenttxt);
		enterText(purchasesReturnsDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(purchasesReturnsDepartmenttxt);			
		Thread.sleep(2000);
		
		click(select1stRow_1stColumn);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		
			
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		
		click(select1stRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);
		Thread.sleep(2000);
		
		click(select1stRow_11thColumn);			
		Thread.sleep(2000);
		
		String actRow1BatchNo		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNo		="05012023EXH";
		//excelReader.setCellData(xlfile, xlSheetName, 375, 7, actRow1BatchNo);
		
		/*String actRow2BatchNo		=batchPopUPRow2BatchNoTxt.getText();
		String expRow2BatchNo		=excelReader.getCellData(xlSheetName, 376, 6);
		excelReader.setCellData(xlfile, xlSheetName, 376, 7, actRow2BatchNo);*/
		
		String actRow1Baseqty		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1Baseqty		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 377, 7, actRow1Baseqty);
		
		String actRow1Rate			=batchPopUPRow1RateTxt.getText();
		String expRow1Rate			="101.1234";
		//excelReader.setCellData(xlfile, xlSheetName, 378, 7, actRow1Rate);
		
		/*String actRow2Baseqty		=batchPopUPRow2BaseQuantityTxt.getText();
		String expRow2Baseqty		=excelReader.getCellData(xlSheetName, 379, 6);
		excelReader.setCellData(xlfile, xlSheetName, 379, 7, actRow2Baseqty);
		
		String actRow2Rate			=batchPopUPRow2RateTxt.getText();
		String expRow2Rate			=excelReader.getCellData(xlSheetName, 380, 6);
		excelReader.setCellData(xlfile, xlSheetName, 380, 7, actRow2Rate);*/
		
	
		System.out.println("actRow1BatchNo             :"+actRow1BatchNo);
		System.out.println("expRow1BatchNo             :"+expRow1BatchNo);
		
		/*System.out.println("actRow2BatchNo             :"+actRow2BatchNo);
		System.out.println("expRow2BatchNo             :"+expRow2BatchNo);*/		
		
		
		System.out.println("actRow1Baseqty             :"+actRow1Baseqty);
		System.out.println("expRow1Baseqty             :"+expRow1Baseqty);
		
		System.out.println("actRow1Rate                :"+actRow1Rate);
		System.out.println("expRow1Rate                :"+expRow1Rate);
		
		/*System.out.println("actRow2Baseqty             :"+actRow2Baseqty);
		System.out.println("expRow2Baseqty             :"+expRow2Baseqty);
		
		System.out.println("actRow2Rate                :"+actRow2Rate);
		System.out.println("expRow2Rate                :"+expRow2Rate);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 381, 7, actBatchpopupIsDisplaying);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying + "  Value Expected  "
				+ expBatchpopupIsDisplaying);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);

		// 2nd Row
		
		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);	
		
		click(select2ndRow_4thColumn);
		
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "100");
		tab(enterRatetxt);
		
		ClickUsingJs(select2ndRow_11thColumn);
		
		Thread.sleep(2000);
		
		String actRow1BatchNoSecLocation		=batchPopUPRow1BatchNoTxt.getText();
		String expRow1BatchNoSecLocation		="05012023EXS";
		//excelReader.setCellData(xlfile, xlSheetName, 382, 7, actRow1BatchNoSecLocation);
	
		
		String actRow1BaseqtySecLocation		=batchPopUPRow1BaseQuantityTxt.getText();
		String expRow1BaseqtySecLocation		="1.00";
		//excelReader.setCellData(xlfile, xlSheetName, 383, 7, actRow1BaseqtySecLocation);
		
		String actRow1RateSecLocation			=batchPopUPRow1RateTxt.getText();
		String expRow1RateSecLocation			="101.4567";
		//excelReader.setCellData(xlfile, xlSheetName, 384, 7, actRow1RateSecLocation);
		
	
	
		System.out.println("actRow1BatchNoSecLocation             :"+actRow1BatchNoSecLocation);
		System.out.println("expRow1BatchNoSecLocation             :"+expRow1BatchNoSecLocation);			
		
		System.out.println("actRow1BaseqtySecLocation             :"+actRow1BaseqtySecLocation);
		System.out.println("expRow1BaseqtySecLocation             :"+expRow1BaseqtySecLocation);
		
		System.out.println("actRow1RateSecLocation                :"+actRow1RateSecLocation);
		System.out.println("expRow1RateSecLocation                :"+expRow1RateSecLocation);
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
		
		boolean actBatchpopupIsDisplaying1 = batchPickOnFIFOIcon.isDisplayed();
		boolean expBatchpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 385, 7, actBatchpopupIsDisplaying1);
		
		System.out.println("Batch Popup isDisplaying  : " + actBatchpopupIsDisplaying1 + "  Value Expected  "
				+ expBatchpopupIsDisplaying1);
		click(batchPickOnFIFOIcon);
		click(batchOkIcon);
		
		if(actRow1BatchNo.equalsIgnoreCase(expRow1BatchNo) /*&& actRow2BatchNo.equalsIgnoreCase(expRow2BatchNo)*/ 
				&& actRow1Baseqty.equalsIgnoreCase(expRow1Baseqty) && actRow1Rate.equalsIgnoreCase(expRow1Rate) 
				/*&& actRow2Baseqty.equalsIgnoreCase(expRow2Baseqty) && actRow2Rate.equalsIgnoreCase(expRow2Rate)*/
				&& actRow1BatchNoSecLocation.equalsIgnoreCase(expRow1BatchNoSecLocation) 
				&& actRow1BaseqtySecLocation.equalsIgnoreCase(expRow1BaseqtySecLocation) 
				&& actRow1RateSecLocation.equalsIgnoreCase(expRow1RateSecLocation)){
			
			//excelReader.setCellData(xlfile, xlSheetName, 373, 8, resPass);
			
			return true;
		}
			else{
				
				//excelReader.setCellData(xlfile, xlSheetName, 373, 8, resFail);
				return false;
			} 
	
	
	}
	
	
	public boolean  checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
	//excelReader=new ExcelReader(POJOUtility.getExcelPath());
	// 3rd Row
		
	Thread.sleep(1500);	
	ClickUsingJs(select3rdRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "HYD");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "FIFO-BIN");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select3rdRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	ClickUsingJs(select3rdRow_12thColumn);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

	boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
	boolean expBinpopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 388, 7, actBinpopupIsDisplaying);


	System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
			+ expBinpopupIsDisplaying);

	click(binSearchBtn);
	Thread.sleep(1000);
	IsVisible(binRow1);
	Thread.sleep(1200);
	click(binAutoAllocateBtn);
	Thread.sleep(2000);
	click(binOkBtn);

	// 4th Row

	ClickUsingJs(select4thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "SEC");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "FIFO-BIN");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select4thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	
	ClickUsingJs(select4thRow_12thColumn);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

	boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
	boolean expBinpopupIsDisplaying1 = true;
	//excelReader.setCellData(xlfile, xlSheetName, 389, 7, actBinpopupIsDisplaying1);


	System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
			+ expBinpopupIsDisplaying1);

	click(binSearchBtn);
	Thread.sleep(1000);
	IsVisible(binRow1);
	Thread.sleep(1200);
	click(binAutoAllocateBtn);
	Thread.sleep(2000);
	click(binOkBtn);

	if (actBinpopupIsDisplaying==expBinpopupIsDisplaying
			&& actBinpopupIsDisplaying1==expBinpopupIsDisplaying1) {
		
		//excelReader.setCellData(xlfile, xlSheetName, 388, 8, resPass);
		return true;

	} else {
		//excelReader.setCellData(xlfile, xlSheetName, 388, 8, resFail);
		return false;
	}

}
	
	public boolean  checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		//excelReader=new ExcelReader(POJOUtility.getExcelPath());	
	// 5th Row
		Thread.sleep(1500);	
		ClickUsingJs(select5thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "HYD");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "WA-RMA");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select5thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	ClickUsingJs(select5thRow_12thColumn);
	
	Thread.sleep(2000);
	
	//enterRmatxt.sendKeys(Keys.SPACE);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
	boolean expRMAPopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 396, 7, actRMAPopupIsDisplaying);


	System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
			+ expRMAPopupIsDisplaying);
	
	
	Thread.sleep(1000);
	click(rmaSearchGridField);
	Thread.sleep(1000);
	
	int count = rmaSerialNos.size();
	
	ArrayList<String> SearchRMA = new ArrayList<String>();
	
	for (int i = 0; i < count; i++) 
	{
		String data = rmaSerialNos.get(i).getText();
		SearchRMA.add(data);
		
		if (data.equalsIgnoreCase("18102022EXH1")) 
		{
			rmaSerialNoCheckBoxes.get(i).click();
		}
	}
	
	String actSearchRMASerialNoList = SearchRMA.toString();
	String expSearchRMASerialNoList = "[18102022EXH1]"; 
	//excelReader.setCellData(xlfile, xlSheetName, 397, 7, actSearchRMASerialNoList);

	
	System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
	System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
	
	
	//click(searchRmaSelectAllGridCheckBox);
	click(searchRmaOkBtn);
	
	int serialcount	=rmaSerialNoList.size();
	ArrayList<String> rmaSerialnos = new ArrayList<String>();
	for (int i = 0; i < serialcount; i++) {
		String data=rmaSerialNoList.get(i).getText();
		rmaSerialnos.add(data);
	}
	
	String actRmaSerialNo 	=rmaSerialnos.toString();
	String expRmaSerialNo	="[18102022EXH1]";
	//excelReader.setCellData(xlfile, xlSheetName, 398, 7, actRmaSerialNo);

	
	System.out.println("actRmaSerialNo       :"+actRmaSerialNo);
	System.out.println("expRmaSerialNo       :"+expRmaSerialNo);
	

	click(RMAPopupOkBtn);	
	Thread.sleep(2000);
	tab(enterRmatxt);
	
	Thread.sleep(2000);
	int row5List=Row5ShortageInStockVoucherBodyList.size();
	System.err.println(row5List);
	ArrayList<String> row5ShortageStockList = new ArrayList<String>();
	for(int i=0 ; i < row5List ;i++)
  	{
  		String data=Row5ShortageInStockVoucherBodyList.get(i).getText();
  		row5ShortageStockList.add(data);
  	}
	
	String actrow5ShortageStockList = row5ShortageStockList.toString();
	String exprow5ShortageStockList = "[5, HYD, WA-RMA, INV-WA, 1.00, 100.0000, 100.0000, 0.00, 87.3728000, 87.3728000, 0.00, , , 18102022EXH1]";
	//excelReader.setCellData(xlfile, xlSheetName, 399, 7, actrow5ShortageStockList);

	
	System.out.println("actrow5ShortageStockList       :"+actrow5ShortageStockList);		
	System.out.println("exprow5ShortageStockList       :"+exprow5ShortageStockList);
	
	
	
	
	
	if(actRMAPopupIsDisplaying==expRMAPopupIsDisplaying && actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList) 
			&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo) && actrow5ShortageStockList.equalsIgnoreCase(exprow5ShortageStockList)){
		
		//excelReader.setCellData(xlfile, xlSheetName, 396, 8, resPass);
		return true;
		
	}else{
		
		//excelReader.setCellData(xlfile, xlSheetName, 396, 8, resFail);
		return false;
	}


			
	}
	
	public boolean  checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUserForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{		
		
		
	//excelReader=new ExcelReader(POJOUtility.getExcelPath());	
	// 6th Row

		ClickUsingJs(select6thRow_1stColumn);
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(2000);
	enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
	enterText(enterWarehousettxt, "SEC");
	Thread.sleep(3000);
	tab(enterWarehousettxt);
	
	enterText(enterItemttxt, "WA-RMA");
	Thread.sleep(2000);
	tab(enterItemttxt);
	Thread.sleep(2000);
	
	click(select6thRow_4thColumn);
	
	enterText(enterQuantitytxt, "1");
	tab(enterQuantitytxt);
	enterText(enterRatetxt, "100");
	tab(enterRatetxt);
	
	ClickUsingJs(select6thRow_11thColumn);
	
	Thread.sleep(2000);

	
	//enterRmatxt.sendKeys(Keys.SPACE);
	Thread.sleep(1000);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

	boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
	boolean expRMAPopupIsDisplaying = true;
	//excelReader.setCellData(xlfile, xlSheetName, 401, 7, actRMAPopupIsDisplaying);

	System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
			+ expRMAPopupIsDisplaying);
	
	click(rmaSearchGridField);
	Thread.sleep(1000);
	
	int count = rmaSerialNos.size();
	
	ArrayList<String> SearchRMA = new ArrayList<String>();
	
	for (int i = 0; i < count; i++) 
	{
		String data = rmaSerialNos.get(i).getText();
		SearchRMA.add(data);
		
		if (data.equalsIgnoreCase("05012023EXS1")) 
		{
			rmaSerialNoCheckBoxes.get(i).click();
		}
	}
	
	String actSearchRMASerialNoList = SearchRMA.toString();
	String expSearchRMASerialNoList = "[05012023EXS1]"; 
	//excelReader.setCellData(xlfile, xlSheetName, 402, 7, actSearchRMASerialNoList);
	
	System.out.println("actSearchRMASerialNoList       :"+actSearchRMASerialNoList);
	System.out.println("expSearchRMASerialNoList       :"+expSearchRMASerialNoList);
	
	
	//click(searchRmaSelectAllGridCheckBox);
	click(searchRmaOkBtn);
	
		int serialcount = rmaSerialNoList.size();
		ArrayList<String> rmaSerialnos = new ArrayList<String>();
		for (int i = 0; i < serialcount; i++) {
			String data = rmaSerialNoList.get(i).getText();
			rmaSerialnos.add(data);
		}

		String actRmaSerialNo = rmaSerialnos.toString();
		String expRmaSerialNo = "[05012023EXS1]";
		// excelReader.setCellData(xlfile, xlSheetName, 403, 7, actRmaSerialNo);

		System.out.println("actRmaSerialNo       :" + actRmaSerialNo);
		System.out.println("expRmaSerialNo       :" + expRmaSerialNo);

		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		Thread.sleep(2000);
		int row6List = Row6ShortageInStockVoucherBodyList.size();
		System.err.println(row6List);
		ArrayList<String> row6ShortageStockList = new ArrayList<String>();
		for (int i = 0; i < row6List; i++) {
			String data = Row6ShortageInStockVoucherBodyList.get(i).getText();
			row6ShortageStockList.add(data);
		}

		String actrow6ShortageStockList = row6ShortageStockList.toString();
		String exprow6ShortageStockList = "[6, SEC, WA-RMA, INV-WA, 1.00, 100.0000, 100.0000, 0.00, 87.3728000, 87.3728000, 0.00, , , 05012023EXS1]";
		// excelReader.setCellData(xlfile, xlSheetName, 404, 7,
		// actrow6ShortageStockList);

		System.out.println("actrow6ShortageStockList       :" + actrow6ShortageStockList);
		System.out.println("exprow6ShortageStockList       :" + exprow6ShortageStockList);

		/*
		 * String docno=documentNumberTxt.getAttribute("value");
		 * Thread.sleep(2000);
		 */
		click(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 48";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		/*
		 * String actMessage = SavingInBackgroundTrial();
		 * 
		 * HashSet<String> expMsg = new HashSet();
		 * 
		 * expMsg.add(excelReader.getCellData(xlSheetName, 405, 6));
		 * expMsg.add(excelReader.getCellData(xlSheetName, 406, 6));
		 * excelReader.setCellData(xlfile, xlSheetName, 405, 7, actMessage);
		 * 
		 * String expMessage = expMsg.toString();
		 * 
		 * System.out.println("Actual Message    : " + actMessage);
		 * System.out.println("Expected Message  : " + expMessage);
		 */

		/*
		 * boolean actSaving=SavingInBackground(docno); boolean expSaving=true;
		 * 
		 * String expMessage1= excelReader.getCellData(xlSheetName, 405, 6);
		 * String expMessage2= excelReader.getCellData(xlSheetName, 406, 6);
		 * 
		 * String actMessage = checkValidationMessage(expMessage1);
		 * excelReader.setCellData(xlfile, xlSheetName, 405, 7, actMessage);
		 * 
		 * 
		 * 
		 * System.out.println("SavingMessage  :  "+actMessage
		 * +" Value Expected : "+expMessage1+" "+expMessage2);
		 */

		if (actRMAPopupIsDisplaying == expRMAPopupIsDisplaying
				&& actSearchRMASerialNoList.equalsIgnoreCase(expSearchRMASerialNoList)
				&& actRmaSerialNo.equalsIgnoreCase(expRmaSerialNo)
				&& actrow6ShortageStockList.equalsIgnoreCase(exprow6ShortageStockList)
				&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 401, 8, resPass);

			return true;

		} else {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			// excelReader.setCellData(xlfile, xlSheetName, 401, 8, resFail);
			return false;
		}

	}
	
	
	public boolean checkSavingSalesReturnsVoucherWithAllItemsINVUserForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		// excelReader=new ExcelReader(POJOUtility.getExcelPath());

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsSalesMenu);
		click(financialsTransactionsSalesMenuSalesReturn);
		click(newBtn);

		checkValidationMessage("Screen opened");

		click(salesDatetxt);
		salesDatetxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		salesDatetxt.sendKeys(Keys.BACK_SPACE);
		enterText(salesDatetxt, "08/03/2024");
		tab(salesDatetxt);
		Thread.sleep(2000);
		enterText(salesAccounttxt, "Sales - Computers");
		tab(salesAccounttxt);
		Thread.sleep(2000);
		enterText(customerAccounttxt, "Customer A");
		Thread.sleep(2000);
		click(customerAccounttxt);
		enterText(salesDepartmenttxt, "DEPT1");
		Thread.sleep(1000);
		tab(salesDepartmenttxt);
		Thread.sleep(3000);

		// 1st Row

		ClickUsingJs(select1stRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		click(select1stRow_10thColumn);

		enterText(enterBatchtxt, "01012023H");
		tab(enterBatchtxt);

		// 2nd Row

		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "BR-BATCH");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		click(select2ndRow_10thColumn);

		enterText(enterBatchtxt, "05012023EXS");
		tab(enterBatchtxt);

		// 3rd Row

		ClickUsingJs(select3rdRow_1stColumn);
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(3000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		Thread.sleep(2000);

		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);

		ClickUsingJs(select3rdRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 407, 7, actBinpopupIsDisplaying);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying + "  Value Expected  "
				+ expBinpopupIsDisplaying);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);

		// 4th Row

		ClickUsingJs(select4thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "FIFO-BIN");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select4thRow_11thColumn);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

		boolean actBinpopupIsDisplaying1 = binSearchTxt.isDisplayed();
		boolean expBinpopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 408, 7, actBinpopupIsDisplaying1);

		System.out.println("Bin Popup isDisplaying  : " + actBinpopupIsDisplaying1 + "  Value Expected  "
				+ expBinpopupIsDisplaying1);

		click(binSearchBtn);
		Thread.sleep(1000);
		IsVisible(binRow1);
		Thread.sleep(1200);
		click(binAutoAllocateBtn);
		Thread.sleep(2000);
		click(binOkBtn);
		Thread.sleep(2000);

		// 5th Row

		ClickUsingJs(select5thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "HYD");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select5thRow_12thColumn);
		Thread.sleep(2000);
		String actual5throwAvgRate = select5thRow_SalesReturnsAvgRate.getText();
		String exp5throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 409, 7, actual5throwAvgRate);

		String actual5throwOverallAvgRate = select5thRow_SalesReturnsOverallAvgRate.getText();
		String exp5throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 410, 7, actual5throwOverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying = true;
		//excelReader.setCellData(xlfile, xlSheetName, 411, 7, actRMAPopupIsDisplaying);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying + "  Value Expected  "
				+ expRMAPopupIsDisplaying);

		enterText(rmaSerialNumberTxtField, "08012023SH1,1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(3000);
		tab(enterRmatxt);
		// tab(enterBatCodetxt);

		// 6th Row
		Thread.sleep(1000);
		ClickUsingJs(select6thRow_1stColumn);
		enterWarehousettxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		enterWarehousettxt.sendKeys(Keys.BACK_SPACE);
		enterText(enterWarehousettxt, "SEC");
		Thread.sleep(2000);
		tab(enterWarehousettxt);
		enterText(enterItemttxt, "WA-RMA");
		Thread.sleep(2000);
		tab(enterItemttxt);
		enterText(enterQuantitytxt, "1");
		tab(enterQuantitytxt);
		enterText(enterRatetxt, "1");
		tab(enterRatetxt);
		click(select6thRow_11thColumn);
		Thread.sleep(2000);

		String actual6throwAvgRate = select6thRow_SalesReturnsAvgRate.getText();
		String exp6throwAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 412, 7, actual6throwAvgRate);

		String actual6throwOverallAvgRate = select6thRow_SalesReturnsOverallAvgRate.getText();
		String exp6throwoverallAvgRate = "87.3728000";
		//excelReader.setCellData(xlfile, xlSheetName, 413, 7, actual6throwOverallAvgRate);

		System.out.println("actual5throwAvgRate       	 :" + actual5throwAvgRate);
		System.out.println("exp5throwAvgRate             :" + exp5throwAvgRate);

		System.out.println("actual5throwOverallAvgRate   :" + actual5throwOverallAvgRate);
		System.out.println("exp5throwoverallAvgRate      	:" + exp5throwoverallAvgRate);

		System.out.println("actual6throwAvgRate      	 :" + actual6throwAvgRate);
		System.out.println("exp6throwAvgRate          	 :" + exp6throwAvgRate);

		System.out.println("actual6throwOverallAvgRate   :" + actual6throwOverallAvgRate);
		System.out.println("exp6throwoverallAvgRate      :" + exp6throwoverallAvgRate);

		// enterRmatxt.sendKeys(Keys.SPACE);
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));

		boolean actRMAPopupIsDisplaying1 = rmaScreenTitle.isDisplayed();
		boolean expRMAPopupIsDisplaying1 = true;
		//excelReader.setCellData(xlfile, xlSheetName, 414, 7, actRMAPopupIsDisplaying1);

		System.out.println("RMA Popup isDisplaying  : " + actRMAPopupIsDisplaying1 + "  Value Expected  "
				+ expRMAPopupIsDisplaying1);
		enterText(rmaSerialNumberTxtField, "08012023SS1");
		click(rmaAddBtn);
		Thread.sleep(2000);
		click(RMAPopupOkBtn);
		Thread.sleep(2000);
		tab(enterRmatxt);

		

		Thread.sleep(3000);
		ClickUsingJs(voucherSaveBtn);

		Thread.sleep(1500);

		click(billRefNewRefTxt);
		Thread.sleep(1500);

		click(billRefPickIcon);
		click(billRefOkBtn);

		Thread.sleep(1500);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 50";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actual5throwAvgRate.equalsIgnoreCase(exp5throwAvgRate)
				&& actual5throwOverallAvgRate.equalsIgnoreCase(exp5throwoverallAvgRate)
				&& actual6throwAvgRate.equalsIgnoreCase(exp6throwAvgRate)
				&& actual6throwOverallAvgRate.equalsIgnoreCase(exp6throwoverallAvgRate)) {

			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resPass);
			return true;

		} else {
			click(new_CloseBtn);
			Thread.sleep(1000);
			click(voucherhomeCloseBtn);
			//excelReader.setCellData(xlfile, xlSheetName, 407, 8, resFail);
			return false;

		}

	}
	
	public boolean validteItemQueryStocksInBatchItemForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		reLogin3("su", "su");
		 //excelReader=new ExcelReader(POJOUtility.getExcelPath());
		
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(itemqueryMenu);
		click(itemTxt);
		Thread.sleep(2000);
		enterText(itemTxt, "BR-BATCH");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);
		
		String actlOpenStockQuantity  = getText(openStockQuantityTxt);
		String expOpenStockQuantity   = "10.00";
		//

		String actlCurrentStock       = getText(currentStockTxt);
		String expCurrentStock        = "4.00";
		

		String actlavgStockRate       = getText(avgStockRateTxt);
		String expavgStockRate        = "100.6234";
		

		String actlstockValueTxt      = getText(stockValueTxt);
		String expstockValueTxt       = "402.4935";
		
		

		System.out.println("=====Stocks In Batch Items======");

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			
			return true;
		} else {
			
			return false;
		}

	}

	public boolean validteItemQueryStocksInFifoItemForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		click(itemTxt);
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.BACK_SPACE);
		enterText(itemTxt, "FIFO-BIN");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);

		String actlOpenStockQuantity = getText(openStockQuantityTxt);
		String expOpenStockQuantity  = "10.00";
		

		String actlCurrentStock      = getText(currentStockTxt);
		String expCurrentStock       = "4.00";
		

		String actlavgStockRate      = getText(avgStockRateTxt);
		String expavgStockRate       = "101.2901";
		

		String actlstockValueTxt     = getText(stockValueTxt);
		String expstockValueTxt      = "405.1602";
		

		System.out.println("=====Stocks In FIFO Items======");

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)) {
			
			return true;
		} else {
			
			return false;
		}

	}

	public boolean validteItemQueryStocksInWAItemForMaintainQuantityAndValueOverall() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		click(itemTxt);
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		itemTxt.sendKeys(Keys.BACK_SPACE);
		enterText(itemTxt, "WA-RMA");
		Thread.sleep(3000);
		click(getStockBtn);
		Thread.sleep(3000);

		String actlOpenStockQuantity = getText(openStockQuantityTxt);
		String expOpenStockQuantity  = "10.00";
		

		String actlCurrentStock      = getText(currentStockTxt);
		String expCurrentStock       = "4.00";
		

		String actlavgStockRate      = getText(avgStockRateTxt);
		String expavgStockRate       = "87.3728";
		

		String actlstockValueTxt     = getText(stockValueTxt);
		String expstockValueTxt      = "349.4911";
		
		
		Thread.sleep(2000);

		//ScrollToElement(balanceByWarehouseBtn);
		ClickUsingJs(balanceByWarehouseBtn);

		Thread.sleep(3000);

		int count = row1BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow1 = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			String data = row1BalanceByWareHouseList.get(i).getText();
			warehouseRow1.add(data);
		}

		String actwarehouseRow1List = warehouseRow1.toString();
		String expWarehouseRow1List = "[1, HYD, 1.00, 0.00, 1.00, 87.3728, 87.3728]";
		

		int count1 = row2BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow2 = new ArrayList<String>();

		for (int i = 0; i < count1; i++) {
			String data = row2BalanceByWareHouseList.get(i).getText();
			warehouseRow2.add(data);
		}

		String actwarehouseRow2List = warehouseRow2.toString();
		String expWarehouseRow2List = "[2, SEC, 1.00, 0.00, 1.00, 87.3728, 87.3728]";
		

		int count2 = row3BalanceByWareHouseList.size();

		ArrayList<String> warehouseRow3 = new ArrayList<String>();

		for (int i = 0; i < count2; i++) {
			String data = row3BalanceByWareHouseList.get(i).getText();
			warehouseRow3.add(data);
		}

		String actwarehouseRow3List = warehouseRow3.toString();
		String expWarehouseRow3List = "[3, TEST, 2.00, 0.00, 2.00, 67.0435, 134.0870]";
		

		System.out.println("=====Stocks In WA Items======");
		
		

		System.out.println("actlOpenStockQuantity      :" + actlOpenStockQuantity);
		System.out.println("expOpenStockQuantity       :" + expOpenStockQuantity);

		System.out.println("actlCurrentStock           :" + actlCurrentStock);
		System.out.println("expCurrentStock            :" + expCurrentStock);

		System.out.println("actlavgStockRate           :" + actlavgStockRate);
		System.out.println("expavgStockRate            :" + expavgStockRate);

		System.out.println("actlstockValueTxt          :" + actlstockValueTxt);
		System.out.println("expstockValueTxt           :" + expstockValueTxt);

	
		
		System.out.println("===========Balance By Warehouse=======");

		System.out.println(actwarehouseRow1List);
		System.out.println(expWarehouseRow1List);

		System.out.println(actwarehouseRow2List);
		System.out.println(expWarehouseRow2List);

		System.out.println(actwarehouseRow3List);
		System.out.println(expWarehouseRow3List);

		if (actlOpenStockQuantity.equalsIgnoreCase(expOpenStockQuantity)
				&& actlCurrentStock.equalsIgnoreCase(expCurrentStock)
				&& actlavgStockRate.equalsIgnoreCase(expavgStockRate)
				&& actlstockValueTxt.equalsIgnoreCase(expstockValueTxt)
				&& actwarehouseRow1List.equalsIgnoreCase(expWarehouseRow1List)
				&& actwarehouseRow2List.equalsIgnoreCase(expWarehouseRow2List)
				&& actwarehouseRow3List.equalsIgnoreCase(expWarehouseRow3List)) 
		{
			
			
			return true;
		} else {
			
			return false;
		}

	}
	
	public boolean checkStockStatementReporFortBrBatchItemForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
	
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryStockStatementMenu);
		Thread.sleep(3000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = ledgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("BR-BATCH")) {
				stockLedgerHometableItemChkboxList.get(i).click();
			}
		}

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

		int reportsByWarehouseRow5ListCount1 = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow5ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow5ListCount1; i++) {
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow5ListArray1.add(data);
		}
		String actRow5List1 = reportsByWarehouseRow5ListArray1.toString();
		String expRow5List1 = "[617, 08/03/2024, 3.0000, 1.0000, , 4.0000, 402.4935, SEC, BR-BATCH]";
		

		
		int reportsByWarehouseRow6ListCount1 = reportsLastRowList.size();
		ArrayList<String> reportsByWarehouseRow6ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow6ListCount1; i++) {
			String data = reportsLastRowList.get(i).getText();
			reportsByWarehouseRow6ListArray1.add(data);
		}
		String actRow6List1 = reportsByWarehouseRow6ListArray1.toString();
		String expRow6List1 = "[618, Total, 7,709.0000, 1,459.0000, 1,465.0000, 4.0000, 402.4935, , ]";
		

		System.out.println(actRow5List1);
		System.out.println(expRow5List1);
		
		System.out.println(actRow6List1);
		System.out.println(expRow6List1);
		
		
		if (actRow5List1.equalsIgnoreCase(expRow5List1) && actRow6List1.equalsIgnoreCase(expRow6List1)) {
			click(report_CloseBtn);
			
			return true;
		} else {
			click(report_CloseBtn);
			
			return false;
		}

	}

	public boolean checkStockStatementReportForFifoItemForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		

		Thread.sleep(3000);

		if (fifoItemCheckBox.isSelected() == false) {
			click(fifoItemCheckBox);
		}

		if (brBatchItemCheckBox.isSelected() == true) {
			click(brBatchItemCheckBox);
		}

		if (rmaItemCheckBox.isSelected() == true) {
			click(rmaItemCheckBox);

		}

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

		int reportsByWarehouseRow5ListCount1 = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow5ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow5ListCount1; i++) {
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow5ListArray1.add(data);
		}
		String actRow5List1 = reportsByWarehouseRow5ListArray1.toString();
		String expRow5List1 = "[617, 08/03/2024, 3.0000, 1.0000, , 4.0000, 405.1602, SEC, FIFO-BIN]";
		

		
		
		int reportsByWarehouseRow6ListCount1 = reportsLastRowList.size();
		ArrayList<String> reportsByWarehouseRow6ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow6ListCount1; i++) {
			String data = reportsLastRowList.get(i).getText();
			reportsByWarehouseRow6ListArray1.add(data);
		}
		String actRow6List1 = reportsByWarehouseRow6ListArray1.toString();
		String expRow6List1 = "[618, Total, 7,709.0000, 1,459.0000, 1,465.0000, 4.0000, 405.1602, , ]";
		
		System.out.println(actRow5List1);
		System.out.println(expRow5List1);		

		System.out.println(actRow6List1);
		System.out.println(expRow6List1);
		



		if (actRow5List1.equalsIgnoreCase(expRow5List1) && actRow6List1.equalsIgnoreCase(expRow6List1)) {
			click(report_CloseBtn);
			
			return true;
		} else {
			click(report_CloseBtn);
			
			return false;
		}

	}

	public boolean checkStockStatementReportForRmaItemForMaintainQuantityAndValueOverall()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		

		Thread.sleep(3000);

		if (fifoItemCheckBox.isSelected() == true) {
			click(fifoItemCheckBox);

		}

		if (brBatchItemCheckBox.isSelected() == true) {
			click(brBatchItemCheckBox);
		}

		if (rmaItemCheckBox.isSelected() == false) {
			click(rmaItemCheckBox);

		}

		dropDown(sl_DateOptionDropdown, "1");
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

		int reportsByWarehouseRow6ListCount1 = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow6ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow6ListCount1; i++) {
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow6ListArray1.add(data);
		}
		String actRow6List1 = reportsByWarehouseRow6ListArray1.toString();
		String expRow6List1 = "[618, 08/03/2024, 3.0000, 1.0000, , 4.0000, 349.4911, SEC, WA-RMA]";
		
		int reportsByWarehouseRow7ListCount1 = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow7ListArray1 = new ArrayList<String>();
		for (int i = 0; i < reportsByWarehouseRow7ListCount1; i++) {
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow7ListArray1.add(data);
		}
		String actRow7List1 = reportsByWarehouseRow7ListArray1.toString();
		String expRow7List1 = "[619, Total, 7,612.0000, 1,459.0000, 1,465.0000, 4.0000, 349.4911, , ]";
		

		System.out.println(actRow6List1);
		System.out.println(expRow6List1);
		
		System.out.println(actRow7List1);
		System.out.println(expRow7List1);
		
		

		if (actRow6List1.equalsIgnoreCase(expRow6List1) && actRow7List1.equalsIgnoreCase(expRow7List1)) {
			click(report_CloseBtn);
			Thread.sleep(2000);
			click(sl_CloseBtn);
			
			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(2000);
			click(sl_CloseBtn);
			
			return false;
		}

	}
	
	
	public boolean checkStockMovementReportByDefault()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
	
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockMovement);
		click(sl_HeaderSelectChkBox);
		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, WA-RMA, 10.0000, 101.0100, 1,459.0000, 20,643.7527, 1,465.0000, 20,395.2716, 4.0000, 349.4911, 87.3728, , , ]";
		
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, FIFO-BIN, 10.0000, 101.0100, 1,459.0000, 20,715.3626, 1,465.0000, 20,411.2124, 4.0000, 405.1602, 101.2901, , , ]";
		
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, BR-BATCH, 10.0000, 101.0100, 1,459.0000, 20,650.3612, 1,465.0000, 20,348.8777, 4.0000, 402.4935, 100.6234, , , ]";
		
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, 30.0000, 303.0300, 4,377.0000, 62,009.4765, 4,395.0000, 61,155.3617, 12.0000, 1,157.1448, 289.2862, , , ]";
		
		
		
		
	
		
		System.out.println("*********************************checkStockMovementReport*****************************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
		
		Thread.sleep(3000);
		
	
		
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
			&& actRow4List.equalsIgnoreCase(expRow4List) /*&& actRow1ListAfterFilter.equalsIgnoreCase(expRow1ListAfterFilter) && actRow2ListAfterFilter.equalsIgnoreCase(expRow2ListAfterFilter)
			&& actRow3ListAfterFilter.equalsIgnoreCase(expRow3ListAfterFilter) && actRow4ListAfterFilter.equalsIgnoreCase(expRow4ListAfterFilter)
			&& actRow1ListSecLoction.equalsIgnoreCase(expRow1ListSecLoction) && actRow2ListSecLoction.equalsIgnoreCase(expRow2ListSecLoction)
			&& actRow3ListSecLoction.equalsIgnoreCase(expRow3ListSecLoction) && actRow4ListSecLoction.equalsIgnoreCase(expRow4ListSecLoction)*/)
		{
			click(report_CloseBtn);
			
			return true;
		}
		else
		{
			click(report_CloseBtn);
			
			return false;
		}
	}
	
	
	public boolean checkStockValuationReportByProduct()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		
		
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryReportsStockValuation);
		//click(sl_HeaderSelectChkBox);
		Thread.sleep(1500);
		click(selectAllItemChkBox);
		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, WA-RMA, WA-RMA, WA-RMA, 4.0000, 349.4911, 87.3728, , ]";
		
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, FIFO-BIN, FIFO-BIN, FIFO-BIN, 4.0000, 405.1602, 101.2901, , ]";
		
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, BR-BATCH, BR-BATCH, BR-BATCH, 4.0000, 402.4935, 100.6234, , ]";
		
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, , , 12.0000, 1,157.1448, 289.2862, , ]";
		
		
		
		
	
		
		System.out.println("*********************************checkStockValuationReport By Product*****************************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
		
	
		
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
			&& actRow4List.equalsIgnoreCase(expRow4List) /*&& actRow1ListAfterFilter.equalsIgnoreCase(expRow1ListAfterFilter) && actRow2ListAfterFilter.equalsIgnoreCase(expRow2ListAfterFilter)
			&& actRow3ListAfterFilter.equalsIgnoreCase(expRow3ListAfterFilter) && actRow4ListAfterFilter.equalsIgnoreCase(expRow4ListAfterFilter)
			&& actRow1ListSecLoction.equalsIgnoreCase(expRow1ListSecLoction) && actRow2ListSecLoction.equalsIgnoreCase(expRow2ListSecLoction)
			&& actRow3ListSecLoction.equalsIgnoreCase(expRow3ListSecLoction) && actRow4ListSecLoction.equalsIgnoreCase(expRow4ListSecLoction)*/ )
		{
			click(report_CloseBtn);
			
			return true;
		}
		else
		{
			click(report_CloseBtn);
			
			return false;
		}
	}
	
	public boolean checkStockLedgerReportForBrBatchItemAfterSavingSalesReturnsVocher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

	
		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryStockLedgerMenu);
		Thread.sleep(3000);

		int rowcount = stockLedgerHometableRowCount.size();

		System.out.println(rowcount);

		for (int i = 0; i < rowcount; i++) {
			String actName = ledgerHometableItemNamesList.get(i).getText();

			System.out.println(actName);

			if (actName.equalsIgnoreCase("BR-BATCH")) {
				stockLedgerHometableItemChkboxList.get(i).click();
			}
		}
		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

		int reportsByWarehouseRow5ListCount = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow5ListCount;i++)
		{
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow5ListArray.add(data);
		}
		String actRow5List = reportsByWarehouseRow5ListArray.toString();
		String expRow5List = "[1042, 08/03/2024, SalRet:50, BR-BATCH, 1.0000, 101.4567, , , 4.0000, 101.4567, , 402.4935, 100.6234, SEC, 05012023EXS, , ]";
		
		
		

		int reportsByWarehouseRow6ListCount = reportsLastRowList.size();
		ArrayList<String> reportsByWarehouseRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow6ListCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			reportsByWarehouseRow6ListArray.add(data);
		}
		String actRow6List = reportsByWarehouseRow6ListArray.toString();
		String expRow6List = "[1043, Total, , , 1,469.0000, 5,315.5492, 1,465.0000, 9,013.5194, 4.0000, 20,650.3612, 20,348.8777, 402.4935, 14,599.0387, , , , ]";
		
		System.out.println("*********************************checkStockLedger Report*****************************************");
		
		System.out.println(actRow5List);
		System.out.println(expRow5List);
		
		System.out.println(actRow6List);
		System.out.println(expRow6List);
		
		
		
		
		Thread.sleep(1000);

		if (actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)) {

			click(report_CloseBtn);
			
			
			return true;
		} else {
			click(report_CloseBtn);
			
			return false;
		}

	}
	
	

	
	
	
	
	public boolean checkStockLedgerReportForFifoItemAfterSavingSalesReturnVocher() // values taken from item query
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		Thread.sleep(3000);

		if (fifoItemCheckBox.isSelected() == false) {
			click(fifoItemCheckBox);
		}

		if (brBatchItemCheckBox.isSelected() == true) {
			click(brBatchItemCheckBox);
		}

		if (rmaItemCheckBox.isSelected() == true) {
			click(rmaItemCheckBox);

		}

		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

		int reportsByWarehouseRow1ListCount = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[800, Total, , , 1,469.0000, 5,330.9252, 1,465.0000, 5,914.8589, 4.0000, 20,715.3626, 20,411.2124, 405.1602, 11,342.9964, , , , ]";
		
		
		//click(stockLedgerPreviousBtn);
		//Thread.sleep(3000);

		int reportsByWarehouseRow17ListCount = reportsLastRowList.size();
		ArrayList<String> reportsByWarehouseRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow17ListCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			reportsByWarehouseRow17ListArray.add(data);
		}
		String actRow17List = reportsByWarehouseRow17ListArray.toString();
		String expRow17List = "[799, 08/03/2024, SalRet:50, FIFO-BIN, 1.0000, 101.4567, , , 4.0000, 101.4567, , 405.1602, 101.2901, SEC, , BIN2-1.00, ]";
		
		System.out.println("*********************************checkStockLedger Report*****************************************");
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		
		
		Thread.sleep(1000);

		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow17List.equalsIgnoreCase(expRow17List)) {

			click(report_CloseBtn);
						
			return true;
		} else {
			
			click(report_CloseBtn);
			
			return false;
		}

	}
	
	

	
	
	public boolean checkStockLedgerReportForRmaItemAfterSavingSalesReturnvoucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		
		
		
		Thread.sleep(3000);

		if (fifoItemCheckBox.isSelected() == true) {
			click(fifoItemCheckBox);

		}

		if (brBatchItemCheckBox.isSelected() == true) {
			click(brBatchItemCheckBox);
		}

		if (rmaItemCheckBox.isSelected() == false) {
			click(rmaItemCheckBox);

		}
		
		dropDown(sl_DateOptionDropdown, "1");		
		Thread.sleep(2000);
		click(sl_OkBtn);
		Thread.sleep(2000);
		click(stockLedgerLastBtn);
		Thread.sleep(1500);		
		IsVisible(lastRowTotal);
		Thread.sleep(1500);

			

		int reportsByWarehouseRow2ListCount = reportsLastRowbutOneList.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsLastRowbutOneList.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[801, 08/03/2024, SalRet:50, WA-RMA, 1.0000, 87.3728, , , 4.0000, 87.3728, , 349.4911, 87.3728, SEC, , , 08012023SS1]";
		
		
		int reportsByWarehouseRow3ListCount = reportsLastRowList.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsLastRowList.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[802, Total, , , 1,469.0000, 5,288.5371, 1,465.0000, 5,870.5507, 4.0000, 20,643.7527, 20,395.2716, 349.4911, 11,074.8279, , , , ]";
		
		System.out.println("*********************************checkStockLedger Report*****************************************");
		
		
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		
		
		Thread.sleep(1000);

		if (actRow3List.equalsIgnoreCase(expRow3List) && actRow2List.equalsIgnoreCase(expRow2List)){

			click(report_CloseBtn);
			Thread.sleep(2000);
			click(sl_CloseBtn);
			

			return true;
		} else {
			click(report_CloseBtn);
			Thread.sleep(2000);
			click(sl_CloseBtn);
			
			return false;
		}

		
		

	}	
	

	
	

	
		
	
	
	}
	


