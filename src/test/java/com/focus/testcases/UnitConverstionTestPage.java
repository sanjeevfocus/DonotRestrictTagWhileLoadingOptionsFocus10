package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.UnitConversionPage;
import com.focus.base.BaseEngine;

public class UnitConverstionTestPage extends BaseEngine
{
	
	UnitConversionPage up;
	
	@Test(priority= 100)
	public void checkLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkLogin(),true);
	}
	
	@Test(priority= 101)
	public void checkExcessesInStocksVoucherForUnitConvertionScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkExcessesInStocksVoucherForUnitConvertionScenario(),true);
	}
	
	@Test(priority= 102)
	public void checkBatchPopupRow1InShortageInStocksVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow1InShortageInStocksVoucher1(),true);
	}
	
	@Test(priority= 103)
	public void checkSavingShortageInStockVoucher1ConsumingRow1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher1ConsumingRow1(),true);
	}
	
	@Test(priority= 104)
	public void checkBatchPopupRow2InShortageInStocksVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow2InShortageInStocksVoucher1(),true);
	}
	
	@Test(priority= 105)
	public void checkSavingShortageInStockVoucher1ConsumingRow2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher1ConsumingRow2(),true);
	}
	
	@Test(priority= 106)
	public void checkBatchPopupRow3InShortageInStocksVoucher1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow3InShortageInStocksVoucher1(),true);
	}
	
	@Test(priority= 107)
	public void checkSavingShortageInStockVoucher1ConsumingRow3() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher1ConsumingRow3(),true);
	}
	
	@Test(priority= 108)
	public void checkBatchPopupRow1InShortageInStocksVoucher2Save10Strips() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow1InShortageInStocksVoucher2Save10Strips(),true);
	}
	
	@Test(priority= 109)
	public void checkSavingShortageInStockVoucher2Saving10Strips () throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher2Saving10Strips(),true);
	}
	
	@Test(priority= 110)
	public void checkBatchPopupRow3InShortageInStocksVoucher2Saving75Tablets() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow3InShortageInStocksVoucher2Saving75Tablets(),true);
	}
	
	@Test(priority= 111)
	public void checkSavingShortageInStockVoucher2Saving75TabletsInRow3() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher2Saving75TabletsInRow3(),true);
	}
	
	@Test(priority= 112)
	public void checkBatchPopupRow5InShortageInStocksVoucher2Saving7Strips() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow5InShortageInStocksVoucher2Saving7Strips(),true);
	}
	
	@Test(priority= 113)
	public void checkSavingShortageInStockVoucher2Saving7StripsInRow5() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher2Saving7StripsInRow5(),true);
	}
	
	@Test(priority= 114)
	public void checkBatchPopupRow6InShortageInStocksVoucher2Saving9TabletsInRow6() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkBatchPopupRow6InShortageInStocksVoucher2Saving9TabletsInRow6(),true);
	}
	
	@Test(priority= 115)
	public void checkSavingShortageInStockVoucher2Saving9TabletsInRow6() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingShortageInStockVoucher2Saving9TabletsInRow6(),true);
	}
	
	
	@Test(priority= 120)
	public void checkSavingPOVoucherForDependencyScenarios1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingPOVoucherForDependencyScenarios1(),true);
	}
	
	@Test(priority= 121)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc(),true);
	}
	
	@Test(priority= 122)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolL(),true);
	}
	
	@Test(priority= 123)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSaving() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSaving(),true);
	}
	
	@Test(priority= 124)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenario(),true);
	}
	
	@Test(priority= 125)
	public void checkUncheckSuperUserInVoucherSettings() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkUncheckSuperUserInVoucherSettings(),true);
	}
	
	@Test(priority= 126)
	public void checkSavingPOVoucher2ForViewsScenarios() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingPOVoucher2ForViewsScenarios(),true);
	}
	
	@Test(priority= 127)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocViewsScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocViewsScenario(),true);
	}
	
	@Test(priority= 128)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolLViewsScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingContolLViewsScenario(),true);
	}
	
	@Test(priority= 129)
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSavingViewsScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentUsingPendingViewTabAndSavingViewsScenario(),true);
	}
	
	@Test(priority= 130)  // issue warehouse 
	public void checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenarioViews() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingBrandLocationAndWarehouseFieldsAreLoadingInLinkDocumentOnEditingScenarioViews(),true);
	}
	
	@Test(priority= 131)
	public void checkSavingMRNvoucherForLinkDependencyOnDEPTTag() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingMRNvoucherForLinkDependencyOnDEPTTag(),true);
	}
	
	@Test(priority= 132)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDoc(),true);
	}
	
	@Test(priority= 133)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolL(),true);
	}
	
	@Test(priority= 134)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSaving() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSaving(),true);
	}
	
	@Test(priority= 135)
	public void checkcheckSuperUserInVoucherSettingsInPurchasesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkcheckSuperUserInVoucherSettingsInPurchasesReturns(),true);
	}
	
	@Test(priority= 136)
	public void checkSavingMRNvoucher2ForLinkDependencyOnDEPTTagForViews() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingMRNvoucher2ForLinkDependencyOnDEPTTagForViews(),true);
	}
	
	@Test(priority= 137)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocForViews() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentWhileConvertingDocumentFromBaseDocForViews(),true);
	}
	
	@Test(priority= 138)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolLForViews() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentUsingContolLForViews(),true);
	}
	
	@Test(priority= 139)
	public void checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSavingForViews() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDeptTagAreLoadingInLinkDocumentUsingPendingViewTabAndSavingForViews(),true);
	}
	
	@Test(priority= 140)
	public void checkSavingMRNvoucher3ForUnitsScenario() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingMRNvoucher3ForUnitsScenario(),true);
	}
	
	@Test(priority= 141)
	public void checkValidatingQtyInLinkPopUPUsingContolLAndSaveVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingQtyInLinkPopUPUsingContolLAndSaveVoucher(),true);
	}
	
	@Test(priority= 142)
	public void checkStockLedgerReportAfterLinkDocSaved() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkStockLedgerReportAfterLinkDocSaved(),true);
	}
	
	@Test(priority=201)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkLogout(),true);
	} 
	/*
	@Test(priority= 210)
	public void checkLoginToCyclicScenarios() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkLoginToCyclicScenarios(),true);
	}
	
	@Test(priority= 211)
	public void checkSavingPOVoucherWithPastDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkSavingPOVoucherWithPastDate(),true);
	}
	
	@Test(priority= 212)
	public void checkValidatingDuedateFieldAndTimeFieldInLinkDocumentWhileConvertingDocumentFromBaseDoc() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDuedateFieldAndTimeFieldInLinkDocumentWhileConvertingDocumentFromBaseDoc(),true);
	}
	
	@Test(priority= 213)
	public void checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingContolL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingContolL(),true);
	}
	
	@Test(priority= 214)
	public void checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingPendingViewTab() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkValidatingDuedateFieldAndTimeFieldInLinkDocumentUsingPendingViewTab(),true);
	}
	
	@Test(priority= 214)
	public void checkTrytoSaveCyclicWorkflow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkTrytoSaveCyclicWorkflow(),true);
	}
	
	
	@Test(priority= 215)
	public void checkTrytoSaveNonCyclicWorkflow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkTrytoSaveNonCyclicWorkflow(),true);
	}
	
	@Test(priority= 216)
	public void checkTrytoAddNewNodeToExistingWorkflow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		up=new UnitConversionPage(getDriver());
		Assert.assertEquals(up.checkTrytoAddNewNodeToExistingWorkflow(),true);
	}
	*/
	

}
