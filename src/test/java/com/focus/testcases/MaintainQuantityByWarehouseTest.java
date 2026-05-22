package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.MaintainQuantityByWarehouse;
import com.focus.base.BaseEngine;
	

public class MaintainQuantityByWarehouseTest extends BaseEngine{
	
	MaintainQuantityByWarehouse ip;
	
	
	// Maintain Quantity by Warehouse and Value Overall--COGS Posting.  Starting
	
	@Test(priority= 11)
	public void checkLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkLogin(),true);
	}
	
	@Test(priority= 12) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReport(),true);
	}
	
	@Test(priority= 13) //Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReport(),true);
	}
	
	@Test(priority= 14) 
	public void checkSavePurchasesVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavePurchasesVoucher(),true);
	}
	
	@Test(priority= 15) 
	public void checkPostingDetailsInPurchasesVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInPurchasesVoucher(),true);
	}
	
	@Test(priority= 16) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReportAfterSavingPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterSavingPurchaseVoucher(),true);
	}
	
	@Test(priority= 17) //Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportAfterSavingPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportAfterSavingPurchaseVoucher(),true);
	}
	
	@Test(priority = 18)
	public void checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouse()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouse(), true);
	}
	
	@Test(priority = 19)
	public void checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouse()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouse(), true);
	}
	
	@Test(priority = 20)
	public void checkSavingSalesInvoiceVoucherFifoItemWith2Warehouse()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherFifoItemWith2Warehouse(), true);
	}
	
	@Test(priority = 21)  
	public void checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouse()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouse(), true);
	}
	
	@Test(priority = 22)  
	public void checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouse()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouse(), true);
	}
	
	@Test(priority= 23) 
	public void checkPostingDetailsInSalesInvoiceVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInSalesInvoiceVoucher(),true);
	}
	
	@Test(priority= 24) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReportAfterSavingSalesinvoiceVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterSavingSalesinvoiceVoucher(),true);
	}

	@Test(priority = 25) // Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportAfterSavingSalesinvoiceVoucher() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportAfterSavingSalesinvoiceVoucher(), true);
	}
	
	@Test(priority = 26) 
	public void checkLoginToSUUserAndSavingStockTransferVocher1()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkLoginToSUUserAndSavingStockTransferVocher1(), true);
	}
	
	@Test(priority = 27) 
	public void checkSavingStockTransferVocher2()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingStockTransferVocher2(), true);
	}
	
	@Test(priority= 28) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReportAfterStockTransferVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterStockTransferVoucher1(),true);
	}

	@Test(priority = 29) // Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportStockTransferVoucher2() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportStockTransferVoucher2(), true);
	}
	
	@Test(priority = 30) 
	public void checkSavingexcessInStocksVoucherWithALLItemsInInvUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingexcessInStocksVoucherWithALLItemsInInvUser(), true);
	}
	
	@Test(priority= 31) 
	public void checkPostingDetailsInexcessInStocksVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInexcessInStocksVoucher(),true);
	}
	
	@Test(priority= 32) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReportAfterExcessStockVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterExcessStockVoucher(),true);
	}

	@Test(priority= 33) // Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportAfterExcessStock() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportAfterExcessStock(), true);
	}
	
	@Test(priority = 34)
	public void checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUser(), true);
	}
	
	@Test(priority = 35)
	public void checkSavingShortagesinStockVoucherWithBrItemTestWareHosue()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithBrItemTestWareHosue(), true);
	}
	
	@Test(priority = 36)
	public void checkSavingShortagesinStockVoucherWithFifoItem3WareHosue()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithFifoItem3WareHosue(), true);
	}
	

	@Test(priority = 37) 
	public void checkSavingShortagesinStockVoucherWithRmaItemHydWareHosue()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemHydWareHosue(), true);
	}
	
	@Test(priority = 38) 
	public void checkSavingShortagesinStockVoucherWithRmaItemSecWareHosue()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemSecWareHosue(), true);
	}
	
	@Test(priority = 39) 
	public void checkSavingShortagesinStockVoucherWithRmaItemTestWareHosue()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemTestWareHosue(), true);
	}
	
	@Test(priority= 40) 
	public void checkPostingDetailsInShortagesInStockVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInShortagesInStockVoucher(),true);
	}
	
	@Test(priority = 41) 
	public void checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUser(), true);
	}
	
	@Test(priority = 42) 
	public void checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUser(), true);
	}
	
	@Test(priority = 43)  
	public void checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUser(), true);
	}
	
	@Test(priority = 44)  
	public void checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUser(), true);
	}
	
	@Test(priority= 45) 
	public void checkPostingDetailsInPurchaseReturnsVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInPurchaseReturnsVoucher(),true);
	}
	
	@Test(priority = 46)  
	public void checkSavingSalesReturnsVoucherWithAllItemsINVUser()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesReturnsVoucherWithAllItemsINVUser(), true);
	}
	
	@Test(priority= 47) // doubt
	public void checkPostingDetailsInSalesReturnsVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInSalesReturnsVoucher(),true);
	}
	
	@Test(priority = 48)  
	public void checkSavingSalesReturnsVoucherWithAllItemsINVUser1()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesReturnsVoucherWithAllItemsINVUser1(), true);
	}
	
	@Test(priority= 49) 
	public void checkPostingDetailsInSalesReturnsVoucher2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInSalesReturnsVoucher2(),true);
	}
	
	@Test(priority= 50) // Validate unit price value for WA-RMA Item.
	public void checkStockValuationReportAfterSalesReturnsVoucher2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterSalesReturnsVoucher2(),true);
	}
	
	@Test(priority= 51) // Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportAfterSalesReturnsVoucher2() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportAfterSalesReturnsVoucher2(), true);
	}
	
	@Test(priority= 52) 
	public void checkSavingDeliveryNotes1VoucherUsingLinks() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingDeliveryNotes1VoucherUsingLinks(), true);
	}
	
	@Test(priority= 53) 
	public void checkPostingDetailsInDeliveryNotes1Voucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingDetailsInDeliveryNotes1Voucher(),true);
	}
	
	@Test(priority= 54) 
	public void checkSavingSalesInvoice1Voucher() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoice1Voucher(), true);
	}
	
	@Test(priority= 55) 
	public void checkPostingSalesInvoice1Voucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkPostingSalesInvoice1Voucher(),true);
	}
	
	@Test(priority = 56)
	public void validteItemQueryStocksInWAPBtem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInWAPBtem(), true);
	}
	
	@Test(priority= 57) 
	public void checkStockValuationReportAfterSalesInvoice1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportAfterSalesInvoice1(),true);
	}

	@Test(priority= 58) // Base DR YTD column in Balance Sheet Report
	public void checkBaseDRYTDColumnInBalanceSheetReportAfterSalesInvoice1() throws NullPointerException,
			IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkBaseDRYTDColumnInBalanceSheetReportAfterSalesInvoice1(), true);
	}
	
	
	@Test(priority = 59)
	public void validteItemQueryStocksInBatchItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInBatchItem(), true);
	}
	
	@Test(priority = 60)
	public void validteItemQueryStocksInFifoItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInFifoItem(), true);
	}
	
	@Test(priority = 61)
	public void validteItemQueryStocksInWAItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInWAItem(), true);
	}
	
	@Test(priority = 62)
	public void validteItemQueryStocksInBRPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInBRPBItem(), true);
	}
	
	@Test(priority = 63)
	public void validteItemQueryStocksInFIFOPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInFIFOPBItem(), true);
	}
	
	@Test(priority = 64)
	public void validteItemQueryStocksInWAPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInWAPBItem(), true);
	}
	
	@Test(priority = 65)  
	public void checkStockStatementReporFortBrBatchItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReporFortBrBatchItem(), true);
	}
	
	@Test(priority = 66)  
	public void checkStockStatementReportForFifoItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForFifoItem(), true);
	}
	
	@Test(priority = 67)  
	public void checkStockStatementReportForRmaItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForRmaItem(), true);
	}
	
	@Test(priority = 68)  
	public void checkStockStatementReportForBRPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForBRPBItem(), true);
	}
	
	@Test(priority = 69)  
	public void checkStockStatementReportForFIFOPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForFIFOPBItem(), true);
	}
	
	@Test(priority = 70)  
	public void checkStockStatementReportForWAPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForWAPBItem(), true);
	}
	
	@Test(priority = 71)  
	public void checkStockMovementReportByDefaultForCogsPosting()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockMovementReportByDefaultForCogsPosting(), true);
	}
	
	@Test(priority = 72)  
	public void checkStockValuationReportByProductForCogsPosting()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportByProductForCogsPosting(), true);
	}
	
	@Test(priority = 73)  
	public void checkStockLedgerReportForBrBatchItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForBrBatchItem(), true);
	}
	
	@Test(priority = 74)  // values taken from item query 
	public void checkStockLedgerReportForFifoItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForFifoItem(), true);
	}
	
	@Test(priority = 75)  
	public void checkStockLedgerReportForRmaItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForRmaItem(), true);
	}
	
	
	@Test(priority = 76)  
	public void checkStockLedgerReportForBRPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForBRPBItem(), true);
	}
	
	@Test(priority = 77)  
	public void checkStockLedgerReportForFIFOPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForFIFOPBItem(), true);
	}
	
	@Test(priority = 78)  
	public void checkStockLedgerReportForWAPBItem()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForWAPBItem(), true);
	}
	
	@Test(priority=79)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkLogout(),true);
	} 
	
	
	// Maintain Quantity by Warehouse and Value Overall--COGS Posting.  Ending
	
	
	
	// Maintain quantity overall and value overall  Starting  Starting	
	
	@Test(priority=100)
	public void checkLoginToMaintainQuantityAndValueOverallCompany() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkLoginToMaintainQuantityAndValueOverallCompany(),true);
	}	
	
	//@Test(priority=101)
	public  void checkRestoringCompanyForMaintainQuantityAndValueOverall() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip=new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkRestoringCompanyForMaintainQuantityAndValueOverall(),true);
	}
	
	@Test(priority= 102) 
	public void checkSavePurchasesVoucherForMaintainQuantityAndValueOverall() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavePurchasesVoucherForMaintainQuantityAndValueOverall(),true);
	}
	
	@Test(priority = 103)
	public void checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherBrBatchItemWithHydWarehouseForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 104)
	public void checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherBrBatchItemWithSECWarehouseForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 105)
	public void checkSavingSalesInvoiceVoucherFifoItemWith2WarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherFifoItemWith2WarehouseForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 106)  
	public void checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherRmaItemWithHYDWarehouseForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 107)  
	public void checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouseForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesInvoiceVoucherRmaItemWithSECWarehouseForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 108) 
	public void checkLoginToSUUserAndSavingStockTransferVocher1ForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkLoginToSUUserAndSavingStockTransferVocher1ForMaintainQuantityAndValueOverall(), true);
	}

	@Test(priority = 109) 
	public void checkSavingStockTransferVocher2ForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingStockTransferVocher2ForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 110) 
	public void checkSavingexcessInStocksVoucherWithALLItemsInInvUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingexcessInStocksVoucherWithALLItemsInInvUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 111)
	public void checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithBrItemHydSecWareHosueInSUUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 112)
	public void checkSavingShortagesinStockVoucherWithBrItemTestWareHosueForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithBrItemTestWareHosueForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 113)
	public void checkSavingShortagesinStockVoucherWithFifoItem3WareHosueForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithFifoItem3WareHosueForMaintainQuantityAndValueOverall(), true);
	}
	

	@Test(priority = 114) 
	public void checkSavingShortagesinStockVoucherWithRmaItemHydWareHosueForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemHydWareHosueForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 115) 
	public void checkSavingShortagesinStockVoucherWithRmaItemSecWareHosueForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemSecWareHosueForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 116)
	public void checkSavingShortagesinStockVoucherWithRmaItemTestWareHosueForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingShortagesinStockVoucherWithRmaItemTestWareHosueForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 117) 
	public void checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithBrItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 118) 
	public void checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithFifoItemHydSecWareHosueInINVUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 119) 
	public void checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithRmaItemHydWareHosueInINVUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 120)  
	public void checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingPurchaseReturnsVoucherWithRmaItemSECWareHosueInINVUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 121)  
	public void checkSavingSalesReturnsVoucherWithAllItemsINVUserForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkSavingSalesReturnsVoucherWithAllItemsINVUserForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 122)
	public void validteItemQueryStocksInBatchItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInBatchItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 123)
	public void validteItemQueryStocksInFifoItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInFifoItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 124)
	public void validteItemQueryStocksInWAItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.validteItemQueryStocksInWAItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 125)  
	public void checkStockStatementReporFortBrBatchItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReporFortBrBatchItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 126)  
	public void checkStockStatementReportForFifoItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForFifoItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 127)  
	public void checkStockStatementReportForRmaItemForMaintainQuantityAndValueOverall()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockStatementReportForRmaItemForMaintainQuantityAndValueOverall(), true);
	}
	
	@Test(priority = 128)  
	public void checkStockMovementReportByDefault()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockMovementReportByDefault(), true);
	}
	
	@Test(priority = 129)  
	public void checkStockValuationReportByProduct()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockValuationReportByProduct(), true);
	}
	
	@Test(priority = 130)  
	public void checkStockLedgerReportForBrBatchItemAfterSavingSalesReturnsVocher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForBrBatchItemAfterSavingSalesReturnsVocher(), true);
	}
	
	@Test(priority = 131)  
	public void checkStockLedgerReportForFifoItemAfterSavingSalesReturnVocher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForFifoItemAfterSavingSalesReturnVocher(), true);
	}
	
	@Test(priority = 132)  
	public void checkStockLedgerReportForRmaItemAfterSavingSalesReturnvoucher()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		ip = new MaintainQuantityByWarehouse(getDriver());
		Assert.assertEquals(ip.checkStockLedgerReportForRmaItemAfterSavingSalesReturnvoucher(), true);
	}
	
 
		
}
