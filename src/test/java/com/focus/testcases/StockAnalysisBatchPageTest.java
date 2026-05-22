package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DonotRestrictTagOptionPage;
import com.focus.Pages.StockAnalysisBatchPage;
import com.focus.Pages.UnitConversionPage;
import com.focus.base.BaseEngine;

public class StockAnalysisBatchPageTest extends BaseEngine
{
	StockAnalysisBatchPage sap;
	
	@Test(priority= 100)
	public void checkLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkLogin(),true);
	}
	
	@Test(priority= 101)
	public void checkExcessesInStocksVoucherForUnitConvertionScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkExcessesInStocksVoucherForUnitConvertionScenario(),true);
	}
	
	@Test(priority= 102)
	public void checkStockAnalysisByBatchReportAfterInward() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkStockAnalysisByBatchReportAfterInward(),true);
	}
	
	@Test(priority= 103)
	public void checkSavingShortageInStockVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkSavingShortageInStockVoucher1(),true);
	}
	
	@Test(priority= 104)
	public void checkStockAnalysisByBatchReportAfterOutWardDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkStockAnalysisByBatchReportAfterOutWardDocument(),true);
	}
	
	@Test(priority= 105)
	public void checkSuspendShortageInStockVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkSuspendShortageInStockVoucher1(),true);
	}
	
	@Test(priority= 106)
	public void checkStockAnalysisByBatchReportAfterSuspendOutwardVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkStockAnalysisByBatchReportAfterSuspendOutwardVoucher(),true);
	}
	
	@Test(priority=110) 
	public void SaveBaseDocumentPOVoucherUsingSaveButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucherUsingSaveButton(),true);
	}
	
	@Test(priority=111) 
	public void EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditNarrationAndQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditNarrationAndQty(),true);
	}
	
	@Test(priority=112) 
	public void convertLinkDocumentPurchaseVoucherNFromBaseDoumentEntryPageAndValidateLinkdocumentQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.convertLinkDocumentPurchaseVoucherNFromBaseDoumentEntryPageAndValidateLinkdocumentQty(),true);
	}
	
	@Test(priority=113) 
	public void saveLinkDocumenturchaseVoucherNFromPendingViewtabAndValidatetheQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.saveLinkDocumenturchaseVoucherNFromPendingViewtabAndValidatetheQty(),true);
	}
	
	@Test(priority=114) 
	public void SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopup() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopup(),true);
	}
	
	@Test(priority=115) 
	public void SaveBaseDocumentPOVoucherUsingSavePrintBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucherUsingSavePrintBtn(),true);
	}
	
	@Test(priority=116) 
	public void EditBaseDocumentPOVoucher2UsingSaveVersionOptionAndEditNarrationAndRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.EditBaseDocumentPOVoucher2UsingSaveVersionOptionAndEditNarrationAndRate(),true);
	}
	
	@Test(priority=117) 
	public void convertLinkDocumentPurchaseVoucherNFromBaseDoument2EntryPageAndValidateLinkdocumentQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.convertLinkDocumentPurchaseVoucherNFromBaseDoument2EntryPageAndValidateLinkdocumentQty(),true);
	}
	
	@Test(priority=118) 
	public void saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher2AndValidatetheQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher2AndValidatetheQty(),true);
	}
	
	@Test(priority=119) 
	public void SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher2(),true);
	}
	
	@Test(priority=120) 
	public void SaveBaseDocumentPOVoucher3UsingControlSOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucher3UsingControlSOption(),true);
	}
	
	@Test(priority=121) 
	public void EditBaseDocumentPOVoucher3UsingSaveVersionOptionAndEditNarrationAndChangeItemName() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.EditBaseDocumentPOVoucher3UsingSaveVersionOptionAndEditNarrationAndChangeItemName(),true);
	}
	
	@Test(priority=122) 
	public void convertLinkDocumentPurchaseVoucherNFromBaseDoument3EntryPageAndValidateLinkdocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.convertLinkDocumentPurchaseVoucherNFromBaseDoument3EntryPageAndValidateLinkdocument(),true);
	}
	
	@Test(priority=123) 
	public void saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher3AndValidateLinkdocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.saveLinkDocumenturchaseVoucherNFromPendingViewtabVoucher3AndValidateLinkdocument(),true);
	}
	
	@Test(priority=124) 
	public void SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher3() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentUsingControlLAndValidateQtyInLinkPopupVoucher3(),true);
	}
	
	@Test(priority = 130)
	public void checkEraseAllTransactions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkEraseAllTransactions(), true);
	}
	
	@Test(priority=131) 
	public void SaveBaseDocumentPOVoucherUsingSaveVersionOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucherUsingSaveVersionOption(),true);
	}
	
	@Test(priority=132) 
	public void SaveLinkDocumentPurchasesVoucherVatForSaveVersionOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentPurchasesVoucherVatForSaveVersionOption(),true);
	}
	
	@Test(priority=133) 
	public void EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.EditBaseDocumentPOVoucherUsingSaveVersionOptionAndEditRate(),true);
	}
	
	@Test(priority=134) 
	public void checkValidatingLinkdocumentPurchasevoucherNHasPendingLinks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkValidatingLinkdocumentPurchasevoucherNHasPendingLinks(),true);
	}
	
	@Test(priority=134) 
	public void checkValidatingLinkdocumentPurchasevoucherVatHasPendingLinks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkValidatingLinkdocumentPurchasevoucherVatHasPendingLinks(),true);
	}
	
	@Test(priority=135) 
	public void saveNewMrnVoucherForSaveVersionOprtion() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.saveNewMrnVoucherForSaveVersionOprtion(),true);
	}
	
	@Test(priority=136) 
	public void SaveLinkDocumentNewPvVouchertForSaveVersionOptionAndGiveRateAs20() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentNewPvVouchertForSaveVersionOptionAndGiveRateAs20(),true);
	}
	
	@Test(priority=137) 
	public void CheckMrnDocumentRateShouldDisply20AsPerPVRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.CheckMrnDocumentRateShouldDisply20AsPerPVRate(),true);
	}
	
	@Test(priority=138) 
	public void editNewPVVoucherGiveRateas50AndSaveUsingSaveVersionOprtion() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.editNewPVVoucherGiveRateas50AndSaveUsingSaveVersionOprtion(),true);
	}
	
	@Test(priority=139) 
	public void CheckMrnDocumentRateShouldDisply50AsPerPVRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.CheckMrnDocumentRateShouldDisply50AsPerPVRate(),true);
		
	}
	
	@Test(priority=150) 
	public void checkSavingOpeningStockVoucher1ForTransactionGrossScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkSavingOpeningStockVoucher1ForTransactionGrossScenario(),true);
	}
	
	@Test(priority=151) 
	public void checkSavingAutoSalesOrderVoucher1ForTransactionGrossScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkSavingAutoSalesOrderVoucher1ForTransactionGrossScenario(),true);
	}
	
	@Test(priority=152) 
	public void checkAutoSavingSalesInvoiceVoucher1ForTransactionGrossScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkAutoSavingSalesInvoiceVoucher1ForTransactionGrossScenario(),true);
	}
	
	@Test(priority=153) 
	public void checkValidatingLinkdocumentAutoSalesInvoiceRateAndGrossValues() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkValidatingLinkdocumentAutoSalesInvoiceRateAndGrossValues(),true);
	}
	
	@Test(priority=154) 
	public void CheckInActiveCustomerAccountInAccountMasters() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.CheckInActiveCustomerAccountInAccountMasters(),true);
	}
	
	@Test(priority=155) 
	public void checkValidatingLinkdocumentAutoSalesInvoiceAfterInActiveAccount() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkValidatingLinkdocumentAutoSalesInvoiceAfterInActiveAccount(),true);
	}
	
	@Test(priority=156) 
	public void CheckActiveCustomerAccountInAccountMasters() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.CheckActiveCustomerAccountInAccountMasters(),true);
	}
	
	@Test(priority = 157)
	public void checkEraseAllTransactions1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkEraseAllTransactions(), true);
	}
	
	//Scenario:1  In Link popup screen Zero quantities showing
	
	@Test(priority=160) 
	public void SaveBaseDocumentPOVoucherWith2Rows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucherWith2Rows(),true);
	}
	
	@Test(priority=161) 
	public void SaveLinkdocumentUsingCopyClipBoardOptionAndWithoutLinks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkdocumentUsingCopyClipBoardOptionAndWithoutLinks(),true);
	}
	
	@Test(priority=162) 
	public void editLinkdocumentInFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.editLinkdocumentInFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows(),true);
	}
	
	
	//Scenario:2 In Link popup screen negative quantities showing
	
	@Test(priority=163) 
	public void editBaseDocumentPOVoucher1WithDifferentQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.editBaseDocumentPOVoucher1WithDifferentQty(),true);
	}
	
	@Test(priority=164) 
	public void SaveLinkdocument2UsingCopyClipBoardOptionAndWithoutLinksAndqtyAs10In2Rows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkdocument2UsingCopyClipBoardOptionAndWithoutLinksAndqtyAs10In2Rows(),true);
	}
	
	@Test(priority=165) 
	public void editLinkdocument2InFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.editLinkdocument2InFirstRowGiveSpaceOnLPurchasesOrderScreenAndClickOnOkAndObserveTheLinkQtyIn2Rows(),true);
	}
	
	
	//3. In the Link popup screen, an extra line with zero quantity appears when the space bar is pressed in the first row of the L–Sales Order column. 
	
	@Test(priority=166) 
	public void SaveBaseDocumentPOVoucher2WithUnitconversions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentPOVoucher2WithUnitconversions(),true);
	}
	
	
	@Test(priority=167) 
	public void verifyLinkPopupValuesInLinkdoumentPurchaseVoucherN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.verifyLinkPopupValuesInLinkdoumentPurchaseVoucherN(),true);
	}
	
	//4. In linked voucher on editing link popup Quantity showing wrong values 
	
	@Test(priority=170)  
	public void SaveBaseDocumentNewMrnVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentNewMrnVoucher(),true);
	}
	
	@Test(priority=171)    
	public void SaveLinkDocumentNewPVVoucherWith70Qty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentNewPVVoucherWith70Qty(),true);
	}
	
	 //5. line wise Load link manually select item(without selecting Quantity value) and give space to L-Sales Invoice
	 // 6. Through loading links, Even though data exists for a mandatory field, it still shows the “mandatory field” message.
	
	@Test(priority=172)  
	public void SaveBaseDocumentNewMrnVoucher2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveBaseDocumentNewMrnVoucher2(),true);
	}
	
	@Test(priority=173)    
	public void SaveLinkDocumentNewPVVoucher2UsingLoadLinkManually() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.SaveLinkDocumentNewPVVoucher2UsingLoadLinkManually(),true);
	}
	
	//7. Validate Link Value: Amount scenario for Payments flow
	@Test(priority=174) 
	public void savePaymentsVoucherwithCurrencyAsAED() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.savePaymentsVoucherwithCurrencyAsAED(), true);
	}
	
	@Test(priority=175) 
	public void savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmount(), true);
	}
	
	@Test(priority=176) 
	public void validateLinkPopupAmountWithOnEditing() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.validateLinkPopupAmountWithOnEditing(), true);
	}
	
	@Test(priority = 177)
	public void checkEraseAllTransactions2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkEraseAllTransactions(), true);
	}
	
	//8.Validate Link Value: Transaction Amount scenario for Receipts
	
	@Test(priority=180) 
	public void selectTransactionAmountInPaymentFlowInLinkDefination() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.selectTransactionAmountInPaymentFlowInLinkDefination(), true);
	}
	
	@Test(priority=181) 
	public void savePaymentsVoucherwithCurrencyAsAEDWhenLinkValueAsTransactionAmount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.savePaymentsVoucherwithCurrencyAsAEDWhenLinkValueAsTransactionAmount(), true);
	}
	
	@Test(priority=182) 
	public void savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmountWhenLinkValueAsTransactionAmount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.savePaymentsLinkVoucherWith50QtyUsingControlLAndValidateLinkPopupAmountWhenLinkValueAsTransactionAmount(), true);
	}
	
	@Test(priority=183) 
	public void validateLinkPopupAmountWithOnEditingWhenLinkValueAsTransactionAmount() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.validateLinkPopupAmountWithOnEditingWhenLinkValueAsTransactionAmount(), true);
	}
	
	@Test(priority = 184)
	public void checkEraseAllTransactions3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkEraseAllTransactions(), true);
	}
	
	@Test(priority=185) 
	public void selectAmountInPaymentFlowInLinkDefination() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.selectAmountInPaymentFlowInLinkDefination(), true);
	}
	
	@Test(priority=190)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		sap=new StockAnalysisBatchPage(getDriver());
		Assert.assertEquals(sap.checkLogout(),true);
	} 
	
	


	
}
