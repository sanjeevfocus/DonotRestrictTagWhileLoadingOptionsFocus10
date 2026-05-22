package com.focus.Pages;

import java.awt.AWTException;
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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class UnitConversionPage extends BaseEngine

{

	public UnitConversionPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	public static WebElement  inventoryTransactionsStocksMenu;

	@FindBy(xpath="//span[text()='Excesses in Stocks']")
	public static WebElement  excessInStocks;	

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

	@FindBy(xpath="//input[@id='id_body_35_8']")
	public static WebElement  lPurchaseOrdercolulmn;

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

	public boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		Thread.sleep(2000);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		String compname="Unit Conversion";

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
		//String getLoginCompanyName=getCompanyTxt.substring(0, 15);
		//System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();

		boolean actDashboard = dashboard.isDisplayed();


		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Unit Conversion";
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
	
	
	public boolean checkLoginToCyclicScenarios() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		Thread.sleep(2000);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		String compname="Workflow cyclic Scenarios";

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
		//String getLoginCompanyName=getCompanyTxt.substring(0, 15);
		//System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();

		boolean actDashboard = dashboard.isDisplayed();


		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Workflow cyclic Scenarios";
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

	public boolean checkExcessesInStocksVoucherForUnitConvertionScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {

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
		enterText(enter_ItemTxt, "DOLO650");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1000);

		tab(enter_UnitTxt);	
		Thread.sleep(1000);

		click(enter_Quantity);
		enterText(enter_Quantity, "2");		
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


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar R1Exp = Calendar.getInstance();
		R1Exp.add(Calendar.DATE, 5);

		String R1 = df.format(R1Exp.getTime());

		/*Thread.sleep(1500);
		tab(enter_Mfgdate);
		Thread.sleep(1500);*/

		System.out.println("R1    :"+R1);

		clearValueFromTextBox(enter_Expirydate);
		Thread.sleep(1200);

		enterText(enter_Expirydate, R1);		
		Thread.sleep(2000);
		tab(enter_Expirydate);
		Thread.sleep(1000);		

		// 2nd Row

		ClickUsingJs(select2ndRow_1stColumn);
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1000);


		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1500);
		enterText(enter_UnitTxt, "TABLETS");		
		Thread.sleep(2000);
		tab(enter_UnitTxt);	
		Thread.sleep(1000);


		click(enter_Quantity);
		enterText(enter_Quantity, "192");		
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

		enterText(enter_Batch, "B2");		
		Thread.sleep(2000);
		tab(enter_Batch);
		Thread.sleep(1000);

		/*Thread.sleep(1500);
		tab(enter_Mfgdate);
		Thread.sleep(1500);*/



		clearValueFromTextBox(enter_Expirydate);
		Thread.sleep(1200);

		enterText(enter_Expirydate, R1);		
		Thread.sleep(2000);
		tab(enter_Expirydate);
		Thread.sleep(1000);	






		// 3rd Row

		ClickUsingJs(select3rdRow_1stColumn);
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);


		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");		
		Thread.sleep(2000);
		tab(enter_ItemTxt);	
		Thread.sleep(1000);


		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1500);
		enterText(enter_UnitTxt, "STRIPS");		
		Thread.sleep(2000);
		tab(enter_UnitTxt);	
		Thread.sleep(1000);


		click(enter_Quantity);
		enterText(enter_Quantity, "16");		
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

		enterText(enter_Batch, "B3");		
		Thread.sleep(2000);
		tab(enter_Batch);
		Thread.sleep(1000);	

		/*Thread.sleep(1500);
		tab(enter_Mfgdate);
		Thread.sleep(1500);*/



		clearValueFromTextBox(enter_Expirydate);
		Thread.sleep(1200);

		enterText(enter_Expirydate, R1);		
		Thread.sleep(2000);
		tab(enter_Expirydate);

		Thread.sleep(2000);

		click(vouchersaveBtn);	

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = "1";
		String actMessage = checkValidationMessage(expMessage1);

		System.out.println(
				"********* Error Message : " + actMessage + "  value expected  " + expMessage1 + " : " + expMessage2);

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath="//*[@id='2034']/span")
	public static WebElement  shortagesInStockVoucher;

	@FindBy(xpath="//input[@id='id_header_1']")
	public static WebElement  documentNumberTxt;

	@FindBy(xpath="//label[@id='lblitem']")
	public static WebElement batchItemName;

	@FindBy(xpath="//label[@id='lblTotalQty']")
	public static WebElement batchTotalQtyAmt;

	@FindBy(xpath="//label[@id='lblAdjustQty']")
	public static WebElement batchAdjustQtyAmt;


	@FindBy(xpath="//label[@id='lblBalnceQty']")
	public static WebElement batchBalanceAmt;

	@FindBy(xpath="//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 P_ingBottom')]//div[2]//input[1]")
	public static WebElement batchExipiringInRadioBtn;

	@FindBy(xpath="//section[@id='page_Content']//div[@class='row']//div//div[3]//input[1]")
	public static WebElement batchExipiringAfetrRadioBtn;

	@FindBy(xpath="//input[@id='txtWithin']")
	public static WebElement batchWithInTxt;

	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_control_heading_6']")
	public static WebElement batchTableHeaderRateColumn;


	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-1']")
	public static WebElement batchTable1stRow1stCol;

	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-2']")
	public static WebElement batchTable1stRow2ndCol;

	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-6']")
	public static WebElement batchTable1stRow3rdCol;

	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-7']")
	public static WebElement batchTable1stRow4thCol;

	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-8']")
	public static WebElement batchTable1stRow5thCol;

	@FindBy(xpath="//input[@id='MRPBatch_AdjBatchQty']")
	public static WebElement enter_BatchTableQtyAdjusted;

	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-14']")
	public static WebElement batchTable1stRow6thCol;

	@FindBy(xpath="//label[@id='lblSum']")
	public static WebElement batchTotalQuantity;

	@FindBy(xpath="//label[@id='lblAdjSum']")
	public static WebElement batchTotalAdjustedQty;


	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']//tr[1]//td")
	public static List<WebElement> batchPopupRow1Data;

	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']//tr[2]//td")
	public static List<WebElement> batchPopupRow2Data;

	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']//tr[3]//td")
	public static List<WebElement> batchPopupRow3Data;



	public boolean checkBatchPopupRow1InShortageInStocksVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "NEWBOX");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select1stRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "1");
		Thread.sleep(2000);


		click(select1stRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="1.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="1.00";		


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "6.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 2.00, "+expiryDate+", 100.00, 0, "+getCurrentDateF2()+"]";

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
		String expRow2Data="[2, B2, 2.00, "+expiryDate+", 100.00, 0, "+getCurrentDateF2()+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, "+expiryDate+", 100.00, 0, "+getCurrentDateF2()+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);	


		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resPass);
			return true;
		}
		else
		{
			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resFail);
			return false;
		}
	}





	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr/td[2]")
	public static List<WebElement> batchPopupBatchNoList;

	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr/td[1]")
	public static List<WebElement> batchPopupRowNosList;


	public boolean checkSavingShortageInStockVoucher1ConsumingRow1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="1.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="1.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 2.00, "+expiryDate+", 100.00, 1.00, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "6.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "1.00";


		System.out.println("Number of rows Batch Nos: "+actBatchCount             +"  value expected  "+expBatchCount);
		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);




		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);


		if(actBatchCount==expBatchCount && actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) && actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			return true;
		}
		else
		{

			return false;
		}
	}

	@FindBy(xpath = "//button[@id='div_Ok1']")
	public static WebElement batchOkIcon;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	public static WebElement  select2ndRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	public static WebElement  select2ndRow_7thColumn;


	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	public static WebElement  select3rdRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	public static WebElement  select3rdRow_7thColumn;

	public boolean checkBatchPopupRow2InShortageInStocksVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{



		click(select2ndRow_1stColumn);
		click(enter_WarehouseTxt);	
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "STRIPS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select2ndRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "8");
		Thread.sleep(2000);


		click(select2ndRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="8.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="8.00";


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "5.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);




		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resPass);
			return true;
		}
		else
		{
			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resFail);
			return false;
		}
	}

	public boolean checkSavingShortageInStockVoucher1ConsumingRow2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);
		int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B2")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="8.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="8.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 8.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);		


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "5.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "8.00";


		System.out.println("Number of rows Batch Nos: "+actBatchCount             +"  value expected  "+expBatchCount);
		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);


		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);


		Thread.sleep(2000);

		if(actBatchCount==expBatchCount && actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) && actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			return true;
		}
		else
		{

			return false;
		}
	}


	public boolean checkBatchPopupRow3InShortageInStocksVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{



		click(select3rdRow_1stColumn);
		click(enter_WarehouseTxt);	
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "TABLETS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select3rdRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "96");
		Thread.sleep(2000);


		click(select3rdRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="96.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="96.00";



		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "4.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 96, "+expiryDate+", 100.00, 0, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 1.00, 96, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 192, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);



		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{


			return true;
		}
		else
		{

			return false;
		}
	}

	public boolean checkSavingShortageInStockVoucher1ConsumingRow3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B3")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="96.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="96.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 96, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 1.00, 96, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 192, "+expiryDate+", 100.00, 96.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "4.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "96.00";


		System.out.println("Number of rows Batch Nos: "+actBatchCount             +"  value expected  "+expBatchCount);
		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		ClickUsingJs(batchOkIcon);


		Thread.sleep(4000);
		click(vouchersaveBtn);	


		Thread.sleep(1000);	

		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";

		String actMessage = checkValidationMessage(expMessage1);	



		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);



		Thread.sleep(2000);

		if(actBatchCount==expBatchCount && actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(voucherhomeCloseBtn);

			return true;
		}
		else
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(voucherhomeCloseBtn);

			return false;
		}
	}

	@FindBy(xpath = "//i[@class='icon-close hiconright2']")
	public static WebElement voucherhomeCloseBtn;

	public boolean checkBatchPopupRow1InShortageInStocksVoucher2Save10Strips() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		click(inventoryMenu);
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsStocksMenu);
		click(shortagesInStockVoucher);
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
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "STRIPS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select1stRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "10");
		Thread.sleep(2000);


		click(select1stRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="10.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="10.00";		


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "3.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);	


		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{


			return true;
		}
		else
		{

			return false;
		}
	}




	@FindBy(xpath="(//*[@id='div_PICKFIFO'])[1]")
	public static WebElement pickOnFifoBtn;		

	public boolean checkSavingShortageInStockVoucher2Saving10Strips() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		/*int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);*/


		ClickUsingJs(pickOnFifoBtn);

		Thread.sleep(4000);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="10.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="10.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B1, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 8.00, "+presentDate+"]";

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
		String expRow2Data="[2, B2, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 2.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 1.00, 8.0000000000000, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "3.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "10.00";



		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);




		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);


		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) && actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			return true;
		}
		else
		{

			return false;
		}
	}


	public boolean checkBatchPopupRow3InShortageInStocksVoucher2Saving75Tablets() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{



		click(select3rdRow_1stColumn);
		click(enter_WarehouseTxt);	
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "TABLETS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select3rdRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "75");
		Thread.sleep(2000);


		click(select3rdRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="75.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="75.00";


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "1.75";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B2, 0.75, 72, "+expiryDate+", 100.00, 0, "+presentDate+"]";

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
		String expRow2Data="[2, B3, 1.00, 96, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		/*int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);*/




		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				/*&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resPass);
			return true;
		}
		else
		{
			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resFail);
			return false;
		}
	}


	public boolean checkSavingShortageInStockVoucher2Saving75TabletsInRow3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		/*int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);*/


		ClickUsingJs(pickOnFifoBtn);

		Thread.sleep(4000);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="75.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="75.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B2, 0.75, 72, "+expiryDate+", 100.00, 72.00, "+presentDate+"]";

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
		String expRow2Data="[2, B3, 1.00, 96, "+expiryDate+", 100.00, 3.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		/*int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);	*/	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "1.75";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "75.00";



		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);




		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);


		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) && actRow2Data.equalsIgnoreCase(expRow2Data)
				/*&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) && actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			return true;
		}
		else
		{

			return false;
		}
	}

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	public static WebElement select5thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	public static WebElement select5thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	public static WebElement select5thRow_7thColumn;

	public boolean checkBatchPopupRow5InShortageInStocksVoucher2Saving7Strips() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{		


		click(select5thRow_1stColumn);
		click(enter_WarehouseTxt);	
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "STRIPS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select5thRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "7");
		Thread.sleep(2000);


		click(select5thRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="7.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="7.00";


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "0.97";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B3, 0.97, 7.7500000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow1Data   :"+actRow1Data);
		System.out.println("expRow1Data   :"+expRow1Data);


		/*int RowCount2 =batchPopupRow2Data.size();
		ArrayList<String> arrayList2=new ArrayList<String>();
		for(int i=0 ; i<RowCount2; i++)
		{
			String data =batchPopupRow2Data.get(i).getText();
			if(!data.isEmpty())
				arrayList2.add(data);
		}

		String actRow2Data=arrayList2.toString();
		String expRow2Data="[2, B2, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);*/




		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) /*&& actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resPass);
			return true;
		}
		else
		{
			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resFail);
			return false;
		}
	}


	public boolean checkSavingShortageInStockVoucher2Saving7StripsInRow5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		/*int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);*/


		ClickUsingJs(pickOnFifoBtn);

		Thread.sleep(4000);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="7.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="7.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B3, 0.97, 7.7500000000000, "+expiryDate+", 100.00, 7.00, "+presentDate+"]";

		System.out.println("actRow1Data   :"+actRow1Data);
		System.out.println("expRow1Data   :"+expRow1Data);

		/*
		int RowCount2 =batchPopupRow2Data.size();
		ArrayList<String> arrayList2=new ArrayList<String>();
		for(int i=0 ; i<RowCount2; i++)
		{
			String data =batchPopupRow2Data.get(i).getText();
			if(!data.isEmpty())
				arrayList2.add(data);
		}

		String actRow2Data=arrayList2.toString();
		String expRow2Data="[2, B2, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);	*/	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "0.97";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "7.00";



		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);




		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);


		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) /*&& actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) && actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			return true;
		}
		else
		{

			return false;
		}
	}

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	public static WebElement select6thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	public static WebElement select6thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	public static WebElement select6thRow_7thColumn;


	public boolean checkBatchPopupRow6InShortageInStocksVoucher2Saving9TabletsInRow6() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{		


		click(select6thRow_1stColumn);
		click(enter_WarehouseTxt);	
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(2000);

		click(enter_ItemTxt);
		enterText(enter_ItemTxt, "DOLO650");
		Thread.sleep(2000);
		tab(enter_ItemTxt);
		Thread.sleep(2000);

		clearValueFromTextBox(enter_UnitTxt);
		Thread.sleep(1200);
		enterText(enter_UnitTxt, "TABLETS");
		Thread.sleep(2000);
		tab(enter_UnitTxt);
		Thread.sleep(2000);

		click(select6thRow_5thColumn);
		click(enter_Quantity);
		enterText(enter_Quantity, "9");
		Thread.sleep(2000);


		click(select6thRow_7thColumn);
		click(enter_Rate);
		enterText(enter_Rate, "10");
		Thread.sleep(2000);
		tab(enter_Rate);
		Thread.sleep(2000);

		tab(enter_Gross);	

		Thread.sleep(3500);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="9.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="0.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="9.00";


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "0.09";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "0.00";


		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);



		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B3, 0.09, 9, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow1Data   :"+actRow1Data);
		System.out.println("expRow1Data   :"+expRow1Data);


		/*int RowCount2 =batchPopupRow2Data.size();
		ArrayList<String> arrayList2=new ArrayList<String>();
		for(int i=0 ; i<RowCount2; i++)
		{
			String data =batchPopupRow2Data.get(i).getText();
			if(!data.isEmpty())
				arrayList2.add(data);
		}

		String actRow2Data=arrayList2.toString();
		String expRow2Data="[2, B2, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, 16.0000000000000, "+expiryDate+", 100.00, 0, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);*/




		if(actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) /*&& actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{

			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resPass);
			return true;
		}
		else
		{
			//excelReader.setCellData(xlfile, xlSheetName, 666, 8, resFail);
			return false;
		}
	}

	public boolean checkSavingShortageInStockVoucher2Saving9TabletsInRow6() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		Thread.sleep(2500);

		/*int actBatchCount = batchPopupBatchNoList.size();
		int expBatchCount = 3;


		for (int i = 0; i < actBatchCount; i++) 
		{
			String data = batchPopupBatchNoList.get(i).getText();
			System.out.println(i+1+" : "+data);

			if (data.equalsIgnoreCase("B1")) 
			{
				getAction().doubleClick(batchPopupRowNosList.get(i)).build().perform();
				break;
			}
		}

		Thread.sleep(3500);*/


		ClickUsingJs(pickOnFifoBtn);

		Thread.sleep(4000);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar exp=Calendar.getInstance();
		exp.add(Calendar.DATE, 5); 
		String expiryDate = df.format(exp.getTime());

		Calendar pre=Calendar.getInstance();
		String presentDate = df.format(pre.getTime());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchItemName));
		String actItemName = batchItemName.getText();
		String expItemName = "DOLO650";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQtyAmt));
		String actTotalQuantityInHeader=batchTotalQtyAmt.getText();
		String expTotalQuantityInHeader="9.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchAdjustQtyAmt));
		String actAdjustQuantity=batchAdjustQtyAmt.getText();
		String expAdjustQuantity="9.00";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchBalanceAmt));
		String actBalance=batchBalanceAmt.getText();
		String expBalance="0.00";


		int RowCount1 =batchPopupRow1Data.size();
		ArrayList<String> arrayList1=new ArrayList<String>();
		for(int i=0 ; i<RowCount1; i++)
		{
			String data =batchPopupRow1Data.get(i).getText();
			if(!data.isEmpty())
				arrayList1.add(data);
		}

		String actRow1Data=arrayList1.toString();
		String expRow1Data="[1, B3, 0.09, 9, "+expiryDate+", 100.00, 9.00, "+presentDate+"]";

		System.out.println("actRow1Data   :"+actRow1Data);
		System.out.println("expRow1Data   :"+expRow1Data);


		/*int RowCount2 =batchPopupRow2Data.size();
		ArrayList<String> arrayList2=new ArrayList<String>();
		for(int i=0 ; i<RowCount2; i++)
		{
			String data =batchPopupRow2Data.get(i).getText();
			if(!data.isEmpty())
				arrayList2.add(data);
		}

		String actRow2Data=arrayList2.toString();
		String expRow2Data="[2, B2, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow2Data   :"+actRow2Data);
		System.out.println("expRow2Data   :"+expRow2Data);


		int RowCount3 =batchPopupRow3Data.size();
		ArrayList<String> arrayList3=new ArrayList<String>();
		for(int i=0 ; i<RowCount3; i++)
		{
			String data =batchPopupRow3Data.get(i).getText();
			if(!data.isEmpty())
				arrayList3.add(data);
		}

		String actRow3Data=arrayList3.toString();
		String expRow3Data="[3, B3, 2.00, "+expiryDate+", 100.00, 0.00, "+presentDate+"]";

		System.out.println("actRow3Data   :"+actRow3Data);
		System.out.println("expRow3Data   :"+expRow3Data);	*/	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalQuantity));
		String actTotalQuantity = batchTotalQuantity.getText();
		String expTotalQuantity = "0.09";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchTotalAdjustedQty));
		String actTotalQuantityAdjusted = batchTotalAdjustedQty.getText();
		String expTotalQuantityAdjusted = "9.00";



		System.out.println("Item Name               : "+actItemName               +"  value expected  "+expItemName);
		System.out.println("Total Quantity          : "+actTotalQuantityInHeader  +"  value expected  "+expTotalQuantityInHeader);
		System.out.println("Adjust Quantity         : "+actAdjustQuantity         +"  value expected  "+expAdjustQuantity);
		System.out.println("Balance                 : "+actBalance                +"  value expected  "+expBalance);
		System.out.println("Total Quantity          : "+actTotalQuantity          +"  value expected  "+expTotalQuantity);
		System.out.println("Total Quantity Adjusted : "+actTotalQuantityAdjusted  +"  value expected  "+expTotalQuantityAdjusted);




		ClickUsingJs(batchOkIcon);


		Thread.sleep(3500);

		click(vouchersaveBtn);


		Thread.sleep(1000);	

		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 2";

		String actMessage = checkValidationMessage(expMessage1);	



		System.out.println("SavingMessage  :  "+actMessage +" Value Expected : "+expMessage1+" "+expMessage2);



		Thread.sleep(2000);

		if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)
				&& actItemName.equalsIgnoreCase(expItemName) && actTotalQuantityInHeader.equalsIgnoreCase(expTotalQuantityInHeader)
				&& actAdjustQuantity.equalsIgnoreCase(expAdjustQuantity) && actBalance.equalsIgnoreCase(expBalance) 
				&& actRow1Data.equalsIgnoreCase(expRow1Data) /*&& actRow2Data.equalsIgnoreCase(expRow2Data)
				&& actRow3Data.equalsIgnoreCase(expRow3Data)*/
				&& actTotalQuantity.equalsIgnoreCase(expTotalQuantity) 
				&& actTotalQuantityAdjusted.equalsIgnoreCase(expTotalQuantityAdjusted)) 
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(voucherhomeCloseBtn);

			return true;
		}
		else
		{
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(voucherhomeCloseBtn);

			return false;
		}
	}


	public boolean checkSavingPOVoucherForDependencyScenarios1()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);


		Thread.sleep(3000);
		ClickUsingJs(newBtn);

		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);

		ClickUsingJs(select1stRow_1stColumn);				
		enterText(enter_ItemTxt, "Test item1");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		//tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "10");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	


		ClickUsingJs(select2ndRow_1stColumn);				
		enterText(enter_ItemTxt, "Test item2");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		//tab(enter_UnitTxt);		
		enterText(enter_Quantity, "20");
		tab(enter_Quantity);		
		enterText(enter_Rate, "20");
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

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2500);	

		IsVisible(grid_ChkBox1);

		Thread.sleep(1500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);

		ClickUsingJs(editBtn);  

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);
		ClickUsingJs(toggleBtn); 
		Thread.sleep(1500);
		ClickUsingJs(transactionEntryConvert); 
		Thread.sleep(4500);



		dropDown("Purchases Voucher VAT", convertOptionDropDown);
		Thread.sleep(7000);

		click(workFlowOkBtn1);
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");

		Thread.sleep(3000);

		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor A";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Sharjah";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, Test item1, Red Tape, WGL, WH1, 10.0000000000000000, PurOrd:1, 10.00, 100.00, 0.00,  ]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, Test item2, Crocs, KNR, SECUNDERABAD, 20.0000000000000000, PurOrd:1, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt)) {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
	public static WebElement  workFlowHeaderChkBoxCL;

	@FindBy(xpath="//td[contains(text(),'Test item2')]//..//input")
	public static WebElement  purchaseOrder2checkbox;


	@FindBy(xpath="//input[@value='Select Document']")
	public static WebElement  selectDocumentField;

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolL()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);	

		Thread.sleep(1000);

		Thread.sleep(3000);ClickUsingJs(newBtn);		
		Thread.sleep(1000);		

		Thread.sleep(1500);//checkValidationMessage("Screen opened");		
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");
		Thread.sleep(2000);	


		click(workFlowHeaderChkBoxCL);
		Thread.sleep(1500);

		click(workFlowOkBtn1);
		Thread.sleep(6000);


		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor A";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Sharjah";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, Test item1, Red Tape, WGL, WH1, 10.0000000000000000, PurOrd:1, 10.00, 100.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, Test item2, Crocs, KNR, SECUNDERABAD, 20.0000000000000000, PurOrd:1, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);



		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSaving()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);


		ClickUsingJs(homePageVoucherArrowBtn);		
		Thread.sleep(2500);

		ClickUsingJs(homePagePendingOrdersLinks);
		Thread.sleep(1500);

		IsVisible(grid_ChkBox1);

		Thread.sleep(1500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);

		ClickUsingJs(homeScreenconvert); 
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");		
		Thread.sleep(4500);


		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor A";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Sharjah";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, Test item1, Red Tape, WGL, WH1, 10.0000000000000000, PurOrd:1, 10.00, 100.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, Test item2, Crocs, KNR, SECUNDERABAD, 20.0000000000000000, PurOrd:1, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);

		ClickUsingJs(departmentTxt);
		Thread.sleep(1500);

		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1000);

		ClickUsingJs(select1stRow_2ndColumn);
		Thread.sleep(1500);

		ClickUsingJs(select1stRow_3rdColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_brandTxt);
		Thread.sleep(1500);
		enterText(enter_brandTxt, "Crocs");
		Thread.sleep(1500);
		tab(enter_brandTxt);
		Thread.sleep(1000);

		clearValueFromTextBox(enter_LoactionTxt);
		Thread.sleep(1500);
		enterText(enter_LoactionTxt, "JGTL");
		Thread.sleep(1500);
		tab(enter_LoactionTxt);
		Thread.sleep(1000);

		clearValueFromTextBox(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_WarehouseTxt, "MUMBAI");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1000);



		Thread.sleep(1500);

		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);

		Thread.sleep(1520);

		ClickUsingJs(select1stRow_8thColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_Quantity);
		Thread.sleep(1500);
		enterText(enter_Quantity, "5");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(2500);



		ClickUsingJs(select2ndRow_2ndColumn);
		Thread.sleep(1500);

		ClickUsingJs(select2ndRow_6thColumn);
		Thread.sleep(1500);


		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);

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




		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);			
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}


	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenario()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);	

		IsVisible(grid_ChkBox1);

		Thread.sleep(1500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);

		ClickUsingJs(editBtn); 
		Thread.sleep(1500);

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);		


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, Test item1, Standard Rated Purchase - Recoverable, Crocs, JGTL, MUMBAI, Purchase, 5.0000000000000000, PurOrd:1, 10.00, 50.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, Test item2, Standard Rated Purchase - Recoverable, Crocs, KNR, SECUNDERABAD, Purchase, 20.0000000000000000, PurOrd:1, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);


		ClickUsingJs(select1stRow_8thColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_Quantity);
		Thread.sleep(1500);
		enterText(enter_Quantity, "9");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(2500);
		lPurchaseOrdercolulmn.sendKeys(Keys.SPACE);
		Thread.sleep(1500);

		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(2800);

		int OnEditingvoucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> OnEditingvoucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < OnEditingvoucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				OnEditingvoucherGridBodyListArray.add(data);
			}

		}

		String OnEditingactvoucherGridBodyListRow1 = OnEditingvoucherGridBodyListArray.toString();

		String OnEditingexpvoucherGridBodyListRow1 = "[1, Test item1, Red Tape, WGL, WH1, Purchase, 9.0000000000000000, 10.00, 90.00, 0.00]";

		System.out.println(OnEditingactvoucherGridBodyListRow1);
		System.out.println(OnEditingexpvoucherGridBodyListRow1);

		Thread.sleep(2500);

		ClickUsingJs(select1stRow_2ndColumn);
		Thread.sleep(1500);





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

		Thread.sleep(1500);	




		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) 
				&& actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& OnEditingactvoucherGridBodyListRow1.equalsIgnoreCase(OnEditingexpvoucherGridBodyListRow1)
				&& actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkUncheckSuperUserInVoucherSettings()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);	

		IsVisible(settingsBtn);

		Thread.sleep(1500);

		ClickUsingJs(settingsBtn); 
		Thread.sleep(1500);
		IsVisible(viewsTabInVoucherSetting);
		Thread.sleep(1500);		
		ClickUsingJs(viewsTabInVoucherSetting); 
		Thread.sleep(1500);		
		IsVisible(logInTabexpandBtn);
		Thread.sleep(1500);		
		ClickUsingJs(logInTabexpandBtn); 
		Thread.sleep(1500);

		if (superUserCheckBoxIsSelected.isSelected()==true) 
		{
			System.out.println("enter loop1  :"+superUserCheckBoxIsSelected.isSelected());
			ClickUsingJs(superUserCheckBoxIsSelected);
			System.out.println("enter loop");

			System.out.println("enter loop2  :"+superUserCheckBoxIsSelected.isSelected());
		}

		Thread.sleep(1522);	

		ClickUsingJs(voucherSettingsSaveBtn); 
		Thread.sleep(1500);

		String expMessage ="Data saved successfully";
		String actMessage =checkValidationMessage(expMessage);

		Thread.sleep(1500);

		System.out.println("actMessage   :"+actMessage);
		System.out.println("expMessage   :"+expMessage);

		Thread.sleep(1500);	



		if (actMessage.equalsIgnoreCase(expMessage))
		{	
			ClickUsingJs(settings_closeBtn); 
			Thread.sleep(1500);
			return true;
		} else {

			ClickUsingJs(settings_closeBtn); 
			Thread.sleep(1500);
			Thread.sleep(1500);
			return false;
		}
	}


	public boolean checkSavingPOVoucher2ForViewsScenarios()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);


		Thread.sleep(3000);
		ClickUsingJs(newBtn);

		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		enterText(vendorAccountTxt, "Vendor B");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);

		ClickUsingJs(select1stRow_1stColumn);				
		enterText(enter_ItemTxt, "Test item2");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		//tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
		tab(enter_Quantity);		
		enterText(enter_Rate, "10");
		tab(enter_Rate);		
		Thread.sleep(1000);		
		tab(enter_Gross);	


		ClickUsingJs(select2ndRow_1stColumn);				
		enterText(enter_ItemTxt, "Test item3");
		Thread.sleep(1500);
		tab(enter_ItemTxt);		
		//tab(enter_UnitTxt);		
		enterText(enter_Quantity, "20");
		tab(enter_Quantity);		
		enterText(enter_Rate, "20");
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

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocViewsScenario()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);

		Thread.sleep(2500);	

		IsVisible(grid_ChkBox1);

		Thread.sleep(1500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);

		ClickUsingJs(editBtn);  

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);
		ClickUsingJs(toggleBtn); 
		Thread.sleep(1500);
		ClickUsingJs(transactionEntryConvert); 
		Thread.sleep(4500);



		dropDown("Purchases Voucher VAT", convertOptionDropDown);
		Thread.sleep(7000);

		click(workFlowOkBtn1);
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");

		Thread.sleep(3000);

		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor B";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Abu Dhabi";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, SECUNDERABAD, KNR, Crocs, Test item2, 10.0000000000000000, PurOrd:2, 10.00, 100.00, 0.00,  ]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, MUMBAI, JGTL, Bata, Test item3, 20.0000000000000000, PurOrd:2, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt)) {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolLViewsScenario()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);	

		Thread.sleep(1000);

		Thread.sleep(3000);ClickUsingJs(newBtn);		
		Thread.sleep(1000);		

		Thread.sleep(1500);//checkValidationMessage("Screen opened");		
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");
		Thread.sleep(2000);	

		click(purchaseOrder2checkbox);
		Thread.sleep(1500);


		click(selectDocumentField);
		Thread.sleep(1500);

		click(workFlowOkBtn1);
		Thread.sleep(6000);


		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor B";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Abu Dhabi";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, SECUNDERABAD, KNR, Crocs, Test item2, 10.0000000000000000, PurOrd:2, 10.00, 100.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, MUMBAI, JGTL, Bata, Test item3, 20.0000000000000000, PurOrd:2, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);



		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);

			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSavingViewsScenario()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);


		ClickUsingJs(homePageVoucherArrowBtn);		
		Thread.sleep(2500);

		ClickUsingJs(homePagePendingOrdersLinks);
		Thread.sleep(1500);

		IsVisible(voucher2Checkbox);

		Thread.sleep(1500);

		ClickUsingJs(voucher2Checkbox); 
		Thread.sleep(1500);

		ClickUsingJs(homeScreenconvert); 
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");		
		Thread.sleep(4500);


		String actVendorAccountTxt  =vendorAccountTxt.getAttribute("value");

		String expVendorAccountTxt  ="Vendor B";

		Thread.sleep(1500);

		System.out.println("actVendorAccountTxt  :"+actVendorAccountTxt);
		System.out.println("expVendorAccountTxt  :"+expVendorAccountTxt);

		Thread.sleep(1500);

		String actPlaceOfSupplyTxt  =placeOfSupplyTxt.getAttribute("value");;

		String expPlaceOfSupplyTxt  ="Abu Dhabi";

		Thread.sleep(1500);

		System.out.println("actPlaceOfSupplyTxt  :"+actPlaceOfSupplyTxt);
		System.out.println("expPlaceOfSupplyTxt  :"+expPlaceOfSupplyTxt);

		Thread.sleep(1500);




		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, SECUNDERABAD, KNR, Crocs, Test item2, 10.0000000000000000, PurOrd:2, 10.00, 100.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, MUMBAI, JGTL, Bata, Test item3, 20.0000000000000000, PurOrd:2, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);

		ClickUsingJs(departmentTxt);
		Thread.sleep(1500);

		enterText(departmentTxt, "DUBAI");
		Thread.sleep(1500);
		tab(departmentTxt);
		Thread.sleep(1000);

		ClickUsingJs(select1stRow_1stColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_WarehouseTxt, "MUMBAI");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1000);

		clearValueFromTextBox(enter_LoactionTxt);
		Thread.sleep(1500);
		enterText(enter_LoactionTxt, "JGTL");
		Thread.sleep(1500);
		tab(enter_LoactionTxt);
		Thread.sleep(1000);



		//ClickUsingJs(select1stRow_3rdColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_brandTxt);
		Thread.sleep(1500);
		enterText(enter_brandTxt, "Bata");
		Thread.sleep(1500);
		tab(enter_brandTxt);
		Thread.sleep(1000);

		ClickUsingJs(select1stRow_5thColumn);
		Thread.sleep(1500);
		ClickUsingJs(select1stRow_6thColumn);

		Thread.sleep(1500);

		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);

		Thread.sleep(1520);

		ClickUsingJs(select1stRow_8thColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_Quantity);
		Thread.sleep(1500);
		enterText(enter_Quantity, "5");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(2500);



		ClickUsingJs(select2ndRow_5thColumn);
		Thread.sleep(1500);
		ClickUsingJs(select2ndRow_6thColumn);

		Thread.sleep(1500);

		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);

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
		String expMessage2 = ": 2";
		String actMessage1 = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage1 + " Value Expected : " + expMessage1 + " " + expMessage2);

		Thread.sleep(1500);	




		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& actVendorAccountTxt.equalsIgnoreCase(expVendorAccountTxt)
				&& actPlaceOfSupplyTxt.equalsIgnoreCase(expPlaceOfSupplyTxt)
				&& actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenarioViews()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);	

		IsVisible(voucher2Checkbox);

		Thread.sleep(1500);

		ClickUsingJs(voucher2Checkbox); 
		Thread.sleep(1500);

		ClickUsingJs(editBtn); 
		Thread.sleep(1500);

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);		


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, MUMBAI, JGTL, Bata, Test item2, Standard Rated Purchase - Recoverable, Purchase, 5.0000000000000000, PurOrd:2, 10.00, 50.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, MUMBAI, JGTL, Bata, Test item3, Standard Rated Purchase - Recoverable, Purchase, 20.0000000000000000, PurOrd:2, 20.00, 400.00, 0.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(1500);


		ClickUsingJs(select1stRow_8thColumn);
		Thread.sleep(1500);

		clearValueFromTextBox(enter_Quantity);
		Thread.sleep(1500);
		enterText(enter_Quantity, "9");
		Thread.sleep(1500);
		tab(enter_Quantity);
		Thread.sleep(2500);
		lPurchaseOrdercolulmn.sendKeys(Keys.SPACE);
		Thread.sleep(2500);

		ClickUsingJs(workFlowOkBtn1);
		Thread.sleep(3000);

		int OnEditingvoucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> OnEditingvoucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < OnEditingvoucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				OnEditingvoucherGridBodyListArray.add(data);
			}

		}

		String OnEditingactvoucherGridBodyListRow1 = OnEditingvoucherGridBodyListArray.toString();

		String OnEditingexpvoucherGridBodyListRow1 = "[1, SECUNDERABAD, KNR, Crocs, Test item2, Purchase, 9.0000000000000000, 10.00, 90.00, 0.00]";

		System.out.println(OnEditingactvoucherGridBodyListRow1);
		System.out.println(OnEditingexpvoucherGridBodyListRow1);

		Thread.sleep(2500);

		ClickUsingJs(select1stRow_5thColumn);
		Thread.sleep(1500);





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




		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) 
				&& actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2)
				&& OnEditingactvoucherGridBodyListRow1.equalsIgnoreCase(OnEditingexpvoucherGridBodyListRow1)
				&& actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkSavingMRNvoucherForLinkDependencyOnDEPTTag()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		click(materialReceiptNotesVoucher);

		Thread.sleep(1000);
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		Thread.sleep(800);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		
		ClickUsingJs(vendorAccountTxt);
		Thread.sleep(1500);


		enterText(vendorAccountTxt, "Vendor A");
		Thread.sleep(1500);

		click(select1stRow_1stColumn);			
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "Test item1");
		Thread.sleep(1800);
		tab(enter_ItemTxt);	

		click(select1stRow_5thColumn);
		Thread.sleep(1000);
		enterText(enter_Quantity, "10");
		Thread.sleep(800);
		tab(enter_Quantity);	

		enterText(enter_Rate, "10");
		tab(enter_Rate);		


		click(select2ndRow_1stColumn);
		Thread.sleep(1000);
		clearValueFromTextBox(enter_WarehouseTxt);
		Thread.sleep(1000);		
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "Test item2");
		Thread.sleep(1800);
		tab(enter_ItemTxt);	

		click(select2ndRow_5thColumn);
		Thread.sleep(1000);
		enterText(enter_Quantity, "20");
		Thread.sleep(800);
		tab(enter_Quantity);	

		enterText(enter_Rate, "20");
		tab(enter_Rate);

		click(vouchersaveBtn);

		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 1";

		String actMessage1 = checkValidationMessage(expMessage1);   

		System.out.println("SavingMessage  :  "+actMessage1 +" Value Expected : "+expMessage1+" "+expMessage2);			

		Thread.sleep(2000);


		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) {
			System.out.println("Voucher Saved");

			return true;
		} else {
			System.out.println("Voucher Not Saved");

			return false;
		}
	}

	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		click(materialReceiptNotesVoucher);	
		Thread.sleep(1500);
		IsVisible(grid_ChkBox1);		
		Thread.sleep(1500);		
		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);		
		ClickUsingJs(editBtn);  

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);
		ClickUsingJs(toggleBtn); 
		Thread.sleep(1500);
		ClickUsingJs(transactionEntryConvert); 
		Thread.sleep(1200);	
		checkValidationMessage("Link data loaded");	

		Thread.sleep(3000);


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, HYDERABAD, DUBAI, Test item1, 10.0000000000000000,  , MatRpt:1, 10.00, 100.00,  ,  ]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, HYDERABAD, DUBAI, Test item2, 20.0000000000000000, MatRpt:1, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}


	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolL()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(2000);
		ClickUsingJs(newBtn);
		Thread.sleep(800);

		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(2000);


		click(workFlowHeaderChkBoxCL);
		click(workFlowOkBtn1);

		Thread.sleep(2000);			


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, HYDERABAD, DUBAI, Test item1, 10.0000000000000000, MatRpt:1, 10.00, 100.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, HYDERABAD, DUBAI, Test item2, 20.0000000000000000, MatRpt:1, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	@FindBy(xpath="//*[@id='txtNewReference']")
	public static WebElement  billRefNewRefTxt;

	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSaving()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(1000);
		click(homePannelOpenBtn);
		Thread.sleep(1000);

		click(pendingMaterialReceiptNotesLink);

		Thread.sleep(3000);	

		click(voucherNo1Checkbox1);
		Thread.sleep(1200);
		click(homeScreenconvert);		

		checkValidationMessage("Link data loaded");

		Thread.sleep(2000);		


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, HYDERABAD, DUBAI, Test item1, 10.0000000000000000, MatRpt:1, 10.00, 100.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, HYDERABAD, DUBAI, Test item2, 20.0000000000000000, MatRpt:1, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		click(select1stRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);	

		Thread.sleep(1500);

		click(select2ndRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);	

		Thread.sleep(1500);


		click(vouchersaveBtn);

		click(billRefNewRefTxt);
		Thread.sleep(1000);			
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 1";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);
		Thread.sleep(2000);	

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && actMessage.startsWith(expMessage1)
				&& actMessage.endsWith(expMessage2) && actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkcheckSuperUserInVoucherSettingsInPurchasesReturns()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(1000);			
		Thread.sleep(3000);	

		IsVisible(settingsBtn);

		Thread.sleep(1500);

		ClickUsingJs(settingsBtn); 
		Thread.sleep(1500);
		IsVisible(viewsTabInVoucherSetting);
		Thread.sleep(1500);		
		ClickUsingJs(viewsTabInVoucherSetting); 
		Thread.sleep(1500);		
		IsVisible(logInTabexpandBtn);
		Thread.sleep(1500);		
		ClickUsingJs(logInTabexpandBtn); 
		Thread.sleep(1500);

		if (superUserCheckBoxIsSelected.isSelected()==false) 
		{
			System.out.println("enter loop1  :"+superUserCheckBoxIsSelected.isSelected());
			ClickUsingJs(superUserCheckBoxIsSelected);
			System.out.println("enter loop");

			System.out.println("enter loop2  :"+superUserCheckBoxIsSelected.isSelected());
		}

		Thread.sleep(1522);	

		ClickUsingJs(voucherSettingsSaveBtn); 
		Thread.sleep(1500);

		String expMessage ="Data saved successfully";
		String actMessage =checkValidationMessage(expMessage);

		Thread.sleep(1500);

		System.out.println("actMessage   :"+actMessage);
		System.out.println("expMessage   :"+expMessage);

		Thread.sleep(1500);	



		if (actMessage.equalsIgnoreCase(expMessage))
		{	
			ClickUsingJs(settings_closeBtn); 
			Thread.sleep(1500);
			return true;
		} else {

			ClickUsingJs(settings_closeBtn); 
			Thread.sleep(1500);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkSavingMRNvoucher2ForLinkDependencyOnDEPTTagForViews()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		click(materialReceiptNotesVoucher);

		Thread.sleep(1000);
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		Thread.sleep(800);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);


		enterText(vendorAccountTxt, "Vendor A");
		Thread.sleep(1500);

		click(select1stRow_1stColumn);	
		Thread.sleep(1200);
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(2500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "Test item2");
		Thread.sleep(1800);
		tab(enter_ItemTxt);	

		click(select1stRow_5thColumn);
		Thread.sleep(1000);
		enterText(enter_Quantity, "10");
		Thread.sleep(800);
		tab(enter_Quantity);	

		enterText(enter_Rate, "10");
		tab(enter_Rate);		


		click(select2ndRow_1stColumn);
		Thread.sleep(1000);
		clearValueFromTextBox(enter_WarehouseTxt);
		Thread.sleep(1000);		
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "Test item3");
		Thread.sleep(1800);
		tab(enter_ItemTxt);	

		click(select2ndRow_5thColumn);
		Thread.sleep(1000);
		enterText(enter_Quantity, "20");
		Thread.sleep(800);
		tab(enter_Quantity);	

		enterText(enter_Rate, "20");
		tab(enter_Rate);

		click(vouchersaveBtn);

		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 2";

		String actMessage1 = checkValidationMessage(expMessage1);   

		System.out.println("SavingMessage  :  "+actMessage1 +" Value Expected : "+expMessage1+" "+expMessage2);			

		Thread.sleep(2000);


		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) {
			System.out.println("Voucher Saved");

			return true;
		} else {
			System.out.println("Voucher Not Saved");

			return false;
		}
	}

	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocForViews()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		click(materialReceiptNotesVoucher);	
		Thread.sleep(1500);
		IsVisible(grid_ChkBox1);		
		Thread.sleep(1500);		
		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);		
		ClickUsingJs(editBtn);  

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);
		ClickUsingJs(toggleBtn); 
		Thread.sleep(1500);
		ClickUsingJs(transactionEntryConvert); 
		Thread.sleep(1200);	
		checkValidationMessage("Link data loaded");	

		Thread.sleep(3000);


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, DUBAI, Test item2, HYDERABAD, 10.0000000000000000,  , MatRpt:2, 10.00, 100.00,  ,  ]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, DUBAI, Test item3, HYDERABAD, 20.0000000000000000, MatRpt:2, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolLForViews()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(2000);
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(2000);


		click(workFlowHeaderChkBoxCL);
		click(workFlowOkBtn1);

		Thread.sleep(2000);			


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, DUBAI, Test item2, HYDERABAD, 10.0000000000000000, MatRpt:2, 10.00, 100.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, DUBAI, Test item3, HYDERABAD, 20.0000000000000000, MatRpt:2, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);	
		
		ClickUsingJs(vendorAccountTxt);
		Thread.sleep(2500);	
		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1500);
			return false;
		}
	}



	public boolean checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSavingForViews()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(1000);
		click(homePannelOpenBtn);
		Thread.sleep(1000);

		click(pendingMaterialReceiptNotesLink);

		Thread.sleep(3000);	

		click(voucherNo2Checkbox1);
		Thread.sleep(1200);
		click(homeScreenconvert);		

		checkValidationMessage("Link data loaded");

		Thread.sleep(2000);		


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, DUBAI, Test item2, HYDERABAD, 10.0000000000000000, MatRpt:2, 10.00, 100.00]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);

		int voucherGridBodyListCount1 = voucherGridRow2BodyList.size();

		ArrayList<String> voucherGridBodyListArray1 = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount1; i++) {
			String data = voucherGridRow2BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray1.add(data);
			}

		}

		String actvoucherGridBodyListRow2 = voucherGridBodyListArray1.toString();

		String expvoucherGridBodyListRow2 = "[2, DUBAI, Test item3, HYDERABAD, 20.0000000000000000, MatRpt:2, 20.00, 400.00]";

		System.out.println(actvoucherGridBodyListRow2);
		System.out.println(expvoucherGridBodyListRow2);

		Thread.sleep(2500);		

		click(select1stRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);	

		Thread.sleep(1500);

		click(select2ndRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);	

		Thread.sleep(1500);


		click(vouchersaveBtn);

		click(billRefNewRefTxt);
		Thread.sleep(1000);			
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 2";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);
		Thread.sleep(2000);	

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actvoucherGridBodyListRow2.equalsIgnoreCase(expvoucherGridBodyListRow2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return false;
		}
	}

	public boolean checkSavingMRNvoucher3ForUnitsScenario()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);	
		click(materialReceiptNotesVoucher);

		Thread.sleep(1000);
		Thread.sleep(3000);
		ClickUsingJs(newBtn);
		Thread.sleep(800);
		//Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		ClickUsingJs(vendorAccountTxt);
		Thread.sleep(1200);
		


		enterText(vendorAccountTxt, "Vendor A");
		Thread.sleep(2500);

		ClickUsingJs(select1stRow_1stColumn);
		Thread.sleep(1200);
		enterText(enter_WarehouseTxt, "HYDERABAD");
		Thread.sleep(250);
		tab(enter_WarehouseTxt);
		Thread.sleep(1500);
		enterText(enter_ItemTxt, "Test Unit");
		Thread.sleep(1800);
		tab(enter_ItemTxt);	

		click(select1stRow_5thColumn);
		Thread.sleep(1000);
		enterText(enter_Quantity, "20");
		Thread.sleep(800);
		tab(enter_Quantity);	

		enterText(enter_Rate, "10");
		tab(enter_Rate);		



		click(vouchersaveBtn);

		String expMessage1= "Voucher saved successfully";
		String expMessage2= ": 3";

		String actMessage1 = checkValidationMessage(expMessage1);   

		System.out.println("SavingMessage  :  "+actMessage1 +" Value Expected : "+expMessage1+" "+expMessage2);			

		Thread.sleep(2000);


		if (actMessage1.startsWith(expMessage1) && actMessage1.endsWith(expMessage2)) {
			System.out.println("Voucher Saved");

			return true;
		} else {
			System.out.println("Voucher Not Saved");

			return false;
		}
	}

	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']//td[10]")
	public static WebElement  qtyInLinkPoup;


	public boolean checkValidatingQtyInLinkPopUPUsingContolLAndSaveVoucher()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseReturnsVoucher);		
		Thread.sleep(2000);
		ClickUsingJs(newBtn);
		Thread.sleep(700);
		Thread.sleep(1500);//checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");

		Thread.sleep(2000);

		String actQtyInLinkpopUp  =qtyInLinkPoup.getText();
		String expQtyInLinkpopUp  ="120.0000000000000000";

		System.out.println("actQtyInLinkpopUp   :"+actQtyInLinkpopUp);
		System.out.println("expQtyInLinkpopUp   :"+expQtyInLinkpopUp);

		Thread.sleep(1900);


		click(workFlowHeaderChkBoxCL);
		click(workFlowOkBtn1);

		Thread.sleep(2000);			


		int voucherGridBodyListCount = voucherGridRow1BodyList.size();

		ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();

		for (int i = 0; i < voucherGridBodyListCount; i++) {
			String data = voucherGridRow1BodyList.get(i).getText();
			if(data.isEmpty()==false)
			{
				voucherGridBodyListArray.add(data);
			}

		}

		String actvoucherGridBodyListRow1 = voucherGridBodyListArray.toString();

		String expvoucherGridBodyListRow1 = "[1, DUBAI, Test Unit, HYDERABAD, 20.0000000000000000, MatRpt:3, 10.00, 200.00, SET]";

		System.out.println(actvoucherGridBodyListRow1);
		System.out.println(expvoucherGridBodyListRow1);

		Thread.sleep(2500);
		click(select1stRow_4thColumn);
		Thread.sleep(1200);
		enterText(enter_PurchaseAccTxt, "Purchase");
		Thread.sleep(1500);
		tab(enter_PurchaseAccTxt);	

		Thread.sleep(1500);



		click(vouchersaveBtn);

		click(billRefNewRefTxt);
		Thread.sleep(1000);			
		click(billRefPickIcon);
		Thread.sleep(1000);
		click(billRefOkBtn);

		Thread.sleep(2000);

		String expMessage1 = "Voucher saved successfully";
		String expMessage2 = ": 3";

		String actMessage = checkValidationMessage(expMessage1);

		System.out.println("SavingMessage  :  " + actMessage + " Value Expected : " + expMessage1 + " " + expMessage2);
		Thread.sleep(2000);	


		Thread.sleep(2500);		

		if (actvoucherGridBodyListRow1.equalsIgnoreCase(expvoucherGridBodyListRow1) && 
				actQtyInLinkpopUp.equalsIgnoreCase(expQtyInLinkpopUp) 
				&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			//getDriver().navigate().refresh();
			Thread.sleep(1500);
			return false;
		}
	}



	@FindBy(xpath="//td[@title='Test Unit']//..//input")
	public static WebElement  testunitItemCheckBox;

	public boolean checkStockLedgerReportAfterLinkDocSaved()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {

		click(inventoryMenu);
		click(InventoryReportsMenu);
		click(InventoryStockLedgerMenu);
		Thread.sleep(1000);

		IsVisible(testunitItemCheckBox);
		Thread.sleep(1220);

		ClickUsingJs(testunitItemCheckBox);		
		Thread.sleep(1500);

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
		String expRow1List = "[1, Test Unit [Test Unit]]";

		System.out.println(actRow1List);
		System.out.println(expRow1List);



		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, "+getCurrentDateF2()+", MatRpt:3, 120.00, 1.67, , , 120.00, 200.00, , 200.00, 1.67, , , ]";

		System.out.println(actRow2List);
		System.out.println(expRow2List);

		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, "+getCurrentDateF2()+", PurRet:3, , , 120.00, 1.67, , , 200.00, , , , , ]";

		System.out.println(actRow3List);
		System.out.println(expRow3List);

		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Total, , 120.00, 1.67, 120.00, 1.67, , 200.00, 200.00, , 1.67, , , ]";



		System.out.println(actRow4List);
		System.out.println(expRow4List);






		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List))
		{
			click(report_CloseBtn);				
			Thread.sleep(2000);
			click(sl_CloseBtn);				
			return true;
		}
		else
		{
			click(report_CloseBtn);				
			Thread.sleep(2000);
			click(sl_CloseBtn);							
			return false;
		}
	}
	
	static String actTime=null;
	
	public boolean checkSavingPOVoucherWithPastDate()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);	
		click(inventoryTransactionsMenu);
		click(inventoryTransactionsPurchasesMenu);
		click(purchasesOrdersVoucher);


		Thread.sleep(3000);
		ClickUsingJs(newBtn);

		Thread.sleep(1500);//checkValidationMessage("Screen opened");
		Thread.sleep(1500);
		
		clearValueFromTextBox(purchaseDatetxt);
		Thread.sleep(1500);
		
		String date=minusDays(5);
		Thread.sleep(1500);
		
		enterText(purchaseDatetxt, date);
		Thread.sleep(1500);
		

		enterText(vendorAccountTxt, "Vendor A");

		Thread.sleep(1000);		
		tab(vendorAccountTxt);			

		Thread.sleep(2000);
		
		actTime =purchaseOrdertimeFieldTxt.getAttribute("value");
		
		Thread.sleep(1200);
		System.out.println(actTime);
		
			

		ClickUsingJs(select1stRow_1stColumn);				
		enterText(warehouseTxt, "HYDERABAD");
		Thread.sleep(1500);
		tab(warehouseTxt);	
		Thread.sleep(1000);
		
		
		
				
		enterText(enter_ItemTxt, "apple");
		Thread.sleep(1500);
		tab(enter_ItemTxt);	
		Thread.sleep(1200);	
		
		tab(enter_UnitTxt);		
		enterText(enter_Quantity, "10");
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
			Thread.sleep(8500);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(8500);
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='id_header_67109011']")
	public static WebElement  timeFieldTxt;
	
	@FindBy(xpath="//input[@id='id_header_67109010']")
	public static WebElement  purchaseOrdertimeFieldTxt;
	
	
	
	public boolean checkValidatingDuedateFieldAndTimeFieldInLinkDocumentWhileConvertingDocumentFromBaseDoc()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {		

		click(inventoryMenu);
		Thread.sleep(2500);
		click(inventoryTransactionsMenu);
		Thread.sleep(2500);
		click(inventoryTransactionsPurchasesMenu);
		Thread.sleep(2500);
		click(purchasesOrdersVoucher);
		Thread.sleep(2500);

		Thread.sleep(2500);	

		IsVisible(grid_ChkBox1);

		Thread.sleep(2500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(2500);

		ClickUsingJs(editBtn);  

		checkValidationMessage("Voucher loaded successfully");		
		Thread.sleep(4500);
		ClickUsingJs(toggleBtn); 
		Thread.sleep(1500);
		ClickUsingJs(transactionEntryConvert); 
		Thread.sleep(4500);



		dropDown("Purchases Voucher VAT", convertOptionDropDown);
		Thread.sleep(7000);

		click(workFlowOkBtn1);
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");

		Thread.sleep(1500);

		String actVoucherTransactionDate  =purchaseDatetxt.getAttribute("value");

		String expVoucherTransactionDate  =getCurrentDateF2();

		Thread.sleep(1200);

		System.out.println("actVoucherTransactionDate  :"+actVoucherTransactionDate);
		System.out.println("expVoucherTransactionDate  :"+expVoucherTransactionDate);

		Thread.sleep(1500);

		String actTimeFieldValue  =timeFieldTxt.getAttribute("value");;

		String expTimeFieldValue  =actTime;

		Thread.sleep(1003);

		System.out.println("actTimeFieldValue  :"+actTimeFieldValue);
		System.out.println("expTimeFieldValue  :"+expTimeFieldValue);

		Thread.sleep(1000);

	

		if (actVoucherTransactionDate.equalsIgnoreCase(expVoucherTransactionDate) && 
				actTimeFieldValue.equalsIgnoreCase(actTimeFieldValue)) 
		{

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1200);
			return true;
		} else {
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1200);
			return false;
		}
	}
	
	
	public boolean checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingContolL()
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
		vendorAccountTxt.sendKeys(Keys.CONTROL + "l");
		Thread.sleep(2000);	


		click(workFlowHeaderChkBoxCL);
		Thread.sleep(1500);

		click(workFlowOkBtn1);
		Thread.sleep(6000);


		String actVoucherTransactionDate  =purchaseDatetxt.getAttribute("value");

		String expVoucherTransactionDate  =getCurrentDateF2();

		Thread.sleep(1500);

		System.out.println("actVoucherTransactionDate  :"+actVoucherTransactionDate);
		System.out.println("expVoucherTransactionDate  :"+expVoucherTransactionDate);

		Thread.sleep(1500);

		String actTimeFieldValue  =timeFieldTxt.getAttribute("value");;

		String expTimeFieldValue  =actTime;

		Thread.sleep(3500);

		System.out.println("actTimeFieldValue  :"+actTimeFieldValue);
		System.out.println("expTimeFieldValue  :"+expTimeFieldValue);

		Thread.sleep(1500);

	

		if (actVoucherTransactionDate.equalsIgnoreCase(expVoucherTransactionDate) && 
				actTimeFieldValue.equalsIgnoreCase(actTimeFieldValue))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1000);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1000);
			return false;
		}
	}
	
	public boolean checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingPendingViewTab()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		click(financialsMenu);
		click(financialsTransactionMenu);
		click(financialsTransactionsPurchaseMenu);
		click(purchaseVouchersVat);			
		Thread.sleep(3000);


		ClickUsingJs(homePageVoucherArrowBtn);		
		Thread.sleep(2500);

		ClickUsingJs(homePagePendingOrdersLinks);
		Thread.sleep(1500);

		IsVisible(grid_ChkBox1);

		Thread.sleep(1500);

		ClickUsingJs(grid_ChkBox1); 
		Thread.sleep(1500);

		ClickUsingJs(homeScreenconvert); 
		Thread.sleep(1500);

		checkValidationMessage("Link data loaded");		
		Thread.sleep(4500);


		String actVoucherTransactionDate  =purchaseDatetxt.getAttribute("value");

		String expVoucherTransactionDate  =getCurrentDateF2();

		Thread.sleep(1500);

		System.out.println("actVoucherTransactionDate  :"+actVoucherTransactionDate);
		System.out.println("expVoucherTransactionDate  :"+expVoucherTransactionDate);

		Thread.sleep(1500);

		String actTimeFieldValue  =timeFieldTxt.getAttribute("value");;

		String expTimeFieldValue  =actTime;

		Thread.sleep(3500);

		System.out.println("actTimeFieldValue  :"+actTimeFieldValue);
		System.out.println("expTimeFieldValue  :"+expTimeFieldValue);

		Thread.sleep(1500);

	

		if (actVoucherTransactionDate.equalsIgnoreCase(expVoucherTransactionDate) && 
				actTimeFieldValue.equalsIgnoreCase(actTimeFieldValue))
		{	
			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1000);
			return true;
		} else {

			click(new_CloseBtn);
			Thread.sleep(1500);
			click(contentChangeAlertMsg);
			Thread.sleep(1000);
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

	@FindBy(xpath="//*[@id='optWorkflow_input_settings']/span")
	public static WebElement workFlowNameSettingsBtn; 

	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Vouchers')]")
	public static WebElement purchasesVouchersDragAndDrop; 

	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Orders')]")
	public static WebElement purchasesOrdersDragAndDrop; 
	
	@FindBy(xpath="(//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Payments VAT')])[1]")
	public static WebElement paymentsVatDragAndDrop; 
	
	

	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Requisition')]")
	public static WebElement materialRequisitionDragAndDrop; 

	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Vouchers N')]")
	public static WebElement purchaseVoucherNDragAndDrop; 

	//Body Fields After Drag Then On Flow Chart Link  Layer

	//For the First element which Drags From List TO Screen The Id Property Changes And Remaining Will Be same

	@FindBy(xpath="//div[@class='flowchart-operator-title ui-draggable-handle']")  //As it Is First One Selected Drag On FlowChart Is Same Id Property For Every Element
	public static WebElement FirstDraggedElement; 

	@FindBy(xpath="//*[@id='idNode_4']")
	public static WebElement draggedPurchasesOrders; 

	@FindBy(xpath="//*[@id='idNode_5']")
	public static WebElement draggedMaterialRequisition ; 

	@FindBy(xpath="//*[@id='idNode_0']")       //div[contains(text(),'NDT45')]  //*[@id='idNode_0']
	public static WebElement draggedPurchasesVouchersN;
	
	@FindBy(xpath="//*[@id='idNode_3']")
	public static WebElement draggedPurchasesReturns;
	
	
	@FindBy(xpath="//div[contains(text(),'NDT45')]")
	public static WebElement draggedPurchasesVouchersN1;

	// Link and Delete of Dragged Options

	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]")
	public static WebElement draggedlinkBtn; 

	@FindBy(xpath="/html/body/ul[1]/li[2]/span")
	public static WebElement draggeddeleteBtn; 

	@FindBy(xpath="//*[@id='line0']")
	public static WebElement link0TO1; 

	@FindBy(xpath="//*[@id='line1']")
	public static WebElement link1TO2; 

	@FindBy(xpath="//*[@id='line2']")
	public static WebElement link2TO3; 

	@FindBy(xpath="//*[@id='line3']")
	public static WebElement link3TO4; 
	
	@FindBy(css="#line3 > path")
	public static WebElement line3To4;
	
	@FindBy(xpath="//*[@id='line4']")
	public static WebElement link4TO5; 

	@FindBy(xpath="//*[@id='line5']")
	public static WebElement link5TO6;

	@FindBy(xpath="//*[@id='line6']")
	public static WebElement link6TO7; 

	@FindBy(xpath="//*[@id='line7']")
	public static WebElement link7TO8; 

	@FindBy(xpath="//*[@id='line8']")
	public static WebElement link8TO9; 


	//Connections  Node to Node Points Fields

	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode0Left; 

	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode1Left; 

	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode2Left;

	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode3Left; 

	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode4Left; 

	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode5Left;

	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode6Left; 

	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode7Left; 

	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode8Left;


	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode0Right; 

	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode1Right;
	
	@FindBy(xpath="//*[@id='idNode_1']")
	public static WebElement salesinvoiceLink;
	
	@FindBy(xpath="//*[@id='idNode_2']")
	public static WebElement salesquotations;
	
	

	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode2Right; 

	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode3Right; 

	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode4Right; 

	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode5Right; 

	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode6Right; 

	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode7Right; 

	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode8Right; 



	@FindBy(xpath="//div[@id='settingIcon']//span[@class='iconbar']")
	public static WebElement rightSideExpandBtn; 

	@FindBy(xpath="//a[contains(text(),'Definition')]")
	public static WebElement DefinitionTab; 

	@FindBy(xpath="//select[@id='DDLLinkValue']")
	public static WebElement DefinitionLinkValueDropdown; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[1]//li[1]//input[1]")
	public static WebElement dateChkBox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[2]//li[1]//input[1]")
	public static WebElement customerAccountChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicewareHouseChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	public static WebElement autosalesOrderandInvoicewareHouseChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	public static WebElement narrationChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicenarrationChkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement itemchkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	public static WebElement materialRequiitionAndPquotationsitemchkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	public static WebElement salesOrderandInvoiceitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement purchaseOrderandPvoucheritemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	public static WebElement purchaseOrderandPvoucherUnitchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement purchaseVoucherAndPReturnsitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement purchaseVoucherNAndMRNitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement mrnAndPurchaseReturnsitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement salesInvoicenAndDeliveryNotesitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement salesInvoiceAndSalesRetutrnsitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	public static WebElement stockTransferAndSalesInvoiceNitemchkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	public static WebElement unitsChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	public static WebElement salesOrderandInvoiceunitsChkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	public static WebElement quantityChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicequantityChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	public static WebElement voucherQtyhkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicevoucherQtyhkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	public static WebElement reserveChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicereserveChkbox;

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	public static WebElement rateChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicerateChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement grossChkbox; 

	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicegrossChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[1]//li[1]//input[1]")
	public static WebElement voucherGrossChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[2]//li[1]//input[1]")
	public static WebElement netChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[3]//li[1]//input[1]")
	public static WebElement voucherNetChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[4]//li[1]//input[1]")
	public static WebElement userChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[5]//li[1]//input[1]")
	public static WebElement roleChkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[6]//li[1]//input[1]")
	public static WebElement user1Chkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[7]//li[1]//input[1]")
	public static WebElement user2Chkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[8]//li[1]//input[1]")
	public static WebElement user3Chkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[9]//li[1]//input[1]")
	public static WebElement user4Chkbox; 

	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[10]//li[1]//input[1]")
	public static WebElement user5Chkbox; 
	
	public boolean checkTrytoSaveCyclicWorkflow()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		
		ClickUsingJs(settingsMenu);			
		click(designWorkflowbtn);
		click(workflowNameTxt);			
		workflowNameTxt.sendKeys("sales flow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);	

		ClickUsingJs(salesinvoiceLink);
		Thread.sleep(2000);
		

		getAction().contextClick(linkNode1Right).build().perform();

		Thread.sleep(1200);	
	
		moveToElement(draggedlinkBtn);
		

		Thread.sleep(2000);		
		moveToElement(linkNode2Left);	

		Thread.sleep(2000);
		
		
		
		
		String actAlertText =getAlert().getText();	
		Thread.sleep(1200);
		
		//System.out.println("actAlertText   :"+actAlertText);
		//Thread.sleep(1200);
		
		String actAlertText1 =actAlertText.replaceAll("[^a-zA-Z0-9\\s]", "");				
		
		String expAlertText  =" Cyclic link detected This connection is not allowed";
		
		
		Thread.sleep(1500);
		
		System.out.println("actAlertText1   :"+actAlertText1);
		System.out.println("expAlertText    :"+expAlertText);
		
		Thread.sleep(1500);
		
		getAlert().accept();
		Thread.sleep(2900);
		
		
		
		if(actAlertText1.equalsIgnoreCase(expAlertText)) 
		{
			click(closeBtn);
			return true;
		}
		else {
			
			click(closeBtn);
			return false;
			
		}
	}
	
	@FindBy(xpath="//*[@id='WorkflowCheckboxDiv']/div/div/label")
	public static  List<WebElement> definitionTabChkBoxNameList;

	@FindBy(xpath="//*[@id='WorkflowCheckboxDiv']/div/div/label/input")
	public static  List<WebElement> definitionTabChkBoxListIsSelected;
	
	@FindBy(xpath="//*[@id='WorkflowCheckboxDiv']/div/div/label/input/following-sibling::span")
	public static  List<WebElement> definitionTabChkBoxList;
	
	@FindBy(xpath="//*[@id='WorkflowSettingDialog']/div[2]/div/div[3]/div/input[2]")
	public static WebElement OkBtn;
	
	
	public static boolean checkLogoutAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		
		LoginPage lp = new LoginPage(getDriver());

		String unamelt = "su";

		String pawslt = "su";

		
		click(userNameDisplayLogo);
		Thread.sleep(1300);
		ClickUsingJs(logoutOption);
		Thread.sleep(1300);

		Thread.sleep(3000);
	
	     Thread.sleep(2500);

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		Thread.sleep(2000);
		
		String compname="Workflow cyclic Scenarios";

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
		//String getLoginCompanyName=getCompanyTxt.substring(0, 15);
		//System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();

		boolean actDashboard = dashboard.isDisplayed();


		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Workflow cyclic Scenarios";
		boolean expDashboard = true;	

		Thread.sleep(2000);


		System.out.println("actUserInfo   :"+actUserInfo);
		System.out.println("expUserInfo   :"+expUserInfo);

		System.out.println("getCompanyTxt   	  :"+getCompanyTxt);
		System.out.println("expLoginCompanyName   :"+expLoginCompanyName);

		System.out.println("actDashboard   :"+actDashboard);
		System.out.println("expDashboard   :"+expDashboard);

		Thread.sleep(2000);


		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getCompanyTxt.contains(expLoginCompanyName) && actDashboard==expDashboard) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean checkTrytoSaveNonCyclicWorkflow()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		
		ClickUsingJs(settingsMenu);			
		click(designWorkflowbtn);
		click(workflowNameTxt);			
		workflowNameTxt.sendKeys("sales flow");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);	

		ClickUsingJs(salesquotations);
		Thread.sleep(2000);
		

		getAction().contextClick(linkNode2Right).build().perform();

		Thread.sleep(1200);	
	
		moveToElement(draggedlinkBtn);
		

		Thread.sleep(2000);		
		moveToElement(linkNode1Left);	

		Thread.sleep(2000);	
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) getDriver();
		js1.executeScript("document.querySelector('#line2 > path').setAttribute('stroke-width', '21')");

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link2TO3));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link2TO3));
		link2TO3.click();
		
		Thread.sleep(2500);
		
		
		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText("Quantity");
		Thread.sleep(1200);
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();

		for (int i = 1; i < definitionTabChkBoxNameListCount; i++) {
			String data = definitionTabChkBoxNameList.get(i).getText();

			if (data.equalsIgnoreCase("ITEM")) {
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);		
		
		click(OkBtn);	
		Thread.sleep(1200);
		click(designWorkFlowSaveBtn);		
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("actMessage   :"+actMessage);
		System.out.println("expMessage   :"+expMessage);

		Thread.sleep(2000);
		
		click(CloseBtn);

		Thread.sleep(2000);
		
		checkLogoutAndLogin();		
		
		
		if(actMessage.equalsIgnoreCase(expMessage)) 
		{
			
			return true;
		}
		else {
			
			
			return false;
			
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='searchUsertxtBox']")
	public static WebElement designSearchfield; 
	
	public boolean checkTrytoAddNewNodeToExistingWorkflow()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException {

		
		ClickUsingJs(settingsMenu);			
		click(designWorkflowbtn);
		click(workflowNameTxt);			
		workflowNameTxt.sendKeys("Auto Reservation");
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);	
		
		Thread.sleep(2500);
		clearValueFromTextBox(workflowNameTxt);
		Thread.sleep(1200);
		enterText(workflowNameTxt, "P1");
		Thread.sleep(1500);
		tab(workflowNameTxt);
		
		Thread.sleep(2500);
		clearValueFromTextBox(workflowNameTxt);
		Thread.sleep(1200);
		enterText(workflowNameTxt, "PurchasesFlow");
		Thread.sleep(1500);
		tab(workflowNameTxt);
		
		Thread.sleep(2500);
		clearValueFromTextBox(workflowNameTxt);
		Thread.sleep(1200);
		enterText(workflowNameTxt, "Receipts flow");
		Thread.sleep(1500);
		tab(workflowNameTxt);
		
		Thread.sleep(2500);
		clearValueFromTextBox(workflowNameTxt);
		Thread.sleep(1200);
		enterText(workflowNameTxt, "sales flow");
		Thread.sleep(1500);
		tab(workflowNameTxt);
		
		Thread.sleep(2500);
		clearValueFromTextBox(workflowNameTxt); 
		Thread.sleep(1200);
		enterText(workflowNameTxt, "Payments flow");
		Thread.sleep(1500);
		tab(workflowNameTxt);
		Thread.sleep(1500);
		
		click(designSearchfield);
		Thread.sleep(1000);
		enterText(designSearchfield, "payments vat");
		Thread.sleep(1500);
		
		
		

		//ClickUsingJs(draggedPurchasesVouchersN);
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVatDragAndDrop));
		paymentsVatDragAndDrop.click();
		Thread.sleep(4500);

		
		getAction().dragAndDropBy(paymentsVatDragAndDrop, 720, 100).build().perform();

		Thread.sleep(4500);

		getAction().contextClick(linkNode1Right).build().perform();

		Thread.sleep(1200);	
	
		moveToElement(draggedlinkBtn);
		

		Thread.sleep(2000);		
		moveToElement(linkNode2Left);	

		Thread.sleep(2500);		
		
	
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line5 > path').setAttribute('stroke-width', '25')");

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link5TO6));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
		link5TO6.click();
		
		Thread.sleep(2500);
		
		
		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText("Amount");
		Thread.sleep(1200);
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();

		for (int i = 1; i < definitionTabChkBoxNameListCount; i++) {
			String data = definitionTabChkBoxNameList.get(i).getText();

			if (data.equalsIgnoreCase("Account")) {
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);		
		
		click(OkBtn);	
		Thread.sleep(1200);
		click(designWorkFlowSaveBtn);		
		
		String expMessage="WorkFlow Saved Successfully";
	  		
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("actMessage   :"+actMessage);
		System.out.println("expMessage   :"+expMessage);

		Thread.sleep(2000);
		
		click(CloseBtn);

		Thread.sleep(2000);
		
		checkLogoutAndLogin();		
		
		
		if(actMessage.equalsIgnoreCase(expMessage)) 
		{
			
			return true;
		}
		else {
			
			
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

}
