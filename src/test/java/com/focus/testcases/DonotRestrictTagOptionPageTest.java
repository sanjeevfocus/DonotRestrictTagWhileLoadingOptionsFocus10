package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DonotRestrictTagOptionPage;
import com.focus.base.BaseEngine;

public class DonotRestrictTagOptionPageTest extends BaseEngine{
	
	static DonotRestrictTagOptionPage dp;
	
	
	
	@Test(priority = 2000)
	public void checkLogin1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogin1(), true);
	}
	
	// User Department LEAF NODE Restriction Start
	/*
	@Test(priority = 2001)
	public void SaveBaseDoumentPOWithMutipleRows()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.SaveBaseDoumentPOWithMutipleRows(), true);
	}
	
	@Test(priority = 2002)
	public void SaveLinkDocumentVoucherUsingCtrlL()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.SaveLinkDocumentVoucherUsingCtrlL(), true);
	}
	
	@Test(priority = 2003)
	public void SaveLinkDocumentVoucherUsingCtrlL2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.SaveLinkDocumentVoucherUsingCtrlL2(), true);
	}
	
	@Test(priority = 2004)
	public void changeItemNameInBaseDoumentPOWithMutipleRows()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.changeItemNameInBaseDoumentPOWithMutipleRows(), true);
	}
	
	@Test(priority = 2005)
	public void verifyLinkDocumentVoucherEditedItemDisplayInWorkFlowPopup()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.verifyLinkDocumentVoucherEditedItemDisplayInWorkFlowPopup(), true);
	}
	
	
	@Test(priority = 2006)
	public void checkEraseAllTransactionsForAboveScenarios()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactions(), true);
	}
	
	*/
	
	@Test(priority = 3001)
	public void checkCreateUserWithDepartmentLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithDepartmentLEAFNODERestriction(), true);
	}
	
	@Test(priority = 3002)
	public void CheckSavePVVATVoucherWithDeptAsIndia()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherWithDeptAsIndia(), true);
	}
	
	@Test(priority = 3003)
	public void checkLogoutAndLoginWithUser1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3004)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepartmentNames()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepartmentNames(), true);
	}
	
	@Test(priority = 3005)
	public void checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Department LEAF NODE Restriction End
	
	
	//  User Department GROUP Restriction Start
	@Test(priority = 3006)
	public void checkCreateUserWithDepartmentgroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithDepartmentgroupRestriction(), true);
	}
	
	@Test(priority = 3007)
	public void CheckSavePVVATVoucherWithDeptAsAmerica()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherWithDeptAsAmerica(), true);
	}
	
	@Test(priority = 3008)
	public void checkLogoutAndLoginWithUser1ForDepartmentgroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3009)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepartmentNamesForGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepartmentNamesForGroupRestriction(), true);
	}
	
	@Test(priority = 3010)
	public void checkLogoutAndLoginWithSUForDepartmentGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	//  User Department GROUP Restriction End
	
	
	// Warehouse LEAF NODE Restriction Start
	@Test(priority = 3011)
	public void checkCreateUserWithWarehouseLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithWarehouseLEAFNODERestriction(), true);
	}
	
	@Test(priority = 3012)
	public void CheckSavePVVATVoucherForWarehouseLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForWarehouseLEAFNODERestriction(), true);
	}
	
	@Test(priority = 3013)
	public void checkLogoutAndLoginWithUser1ForWarehouseLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3014)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankWarehouseNamesForWarehouseLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankWarehouseNamesForWarehouseLEAFNODERestriction(), true);
	}
	
	@Test(priority = 3015)
	public void checkLogoutAndLoginWithSUForWarehouseLEAFNODERestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	// Warehouse LEAF NODE Restriction  End
	
	
	// Warehouse GROUP Restriction start
	@Test(priority = 3016)
	public void checkCreateUserWithWarehouseGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithWarehouseGroupRestriction(), true);
	}
	
	@Test(priority = 3017)
	public void CheckSavePVVATVoucherForWarehouseGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForWarehouseGroupRestriction(), true);
	}
	
	@Test(priority = 3018)
	public void checkLogoutAndLoginWithUser1ForWarehouseGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3019)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankWarehouseNamesForWarehouseGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankWarehouseNamesForWarehouseGroupRestriction(), true);
	}
	
	@Test(priority = 3020)
	public void checkLogoutAndLoginWithSUForWarehouseGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// Warehouse GROUP Restriction End
	
	@Test(priority = 3021)
	public void checkEraseAllTransactions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactions(), true);
	}
	
	// Extra Master  RURAL( LEAF NODE) Restriction Start
	@Test(priority = 3022)
	public void checkCreateUserWithExtraMasterRuralLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterRuralLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3023)
	public void CheckSavePVVATVoucherForExtraMasterRuralLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterRuralLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3024)
	public void checkLogoutAndLoginWithUser1ForExtraMasterRuralLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3025)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankRuralNamesForExtraMasterRuralLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankRuralNamesForExtraMasterRuralLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3026)
	public void checkLogoutAndLoginWithSUForExtraMasterRuralLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// Extra Master  RURAL( LEAF NODE) Restriction  End
	
	
	// User Extra Master  RURAL( GROUP) Restriction Start
	
	@Test(priority = 3027)
	public void checkCreateUserWithExtraMasterRuralGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterRuralGroupRestriction(), true);
	}
	
	@Test(priority = 3028)
	public void CheckSavePVVATVoucherForExtraMasterRuralGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterRuralGroupRestriction(), true);
	}
	
	@Test(priority = 3029)
	public void checkLogoutAndLoginWithUser1ForExtraMasterRuralGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3030)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankRuralNamesForExtraMasterRuralGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankRuralNamesForExtraMasterRuralGroupRestriction(), true);
	}
	
	@Test(priority = 3031)
	public void checkLogoutAndLoginWithSUForExtraMasterRuralGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Extra Master  RURAL( GROUP) Restriction  End
	
	// Extra Master  DEPOT( LEAF NODE) Restriction  Strat
	@Test(priority = 3032)
	public void checkCreateUserWithExtraMasterDepotLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterDepotLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3033)
	public void CheckSavePVVATVoucherForExtraMasterDepotLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterDepotLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3034)
	public void checkLogoutAndLoginWithUser1ForExtraMasterDepotLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3035)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotNamesForExtraMasterDepotLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotNamesForExtraMasterDepotLeafNodeRestriction(), true);
	}
	
	@Test(priority = 3036)
	
	public void checkLogoutAndLoginWithSUForExtraMasterDepotLeafNodeRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// Extra Master  DEPOT( LEAF NODE) Restriction  End
	
	
	// User Extra Master  DEPOT( GROUP) Restriction  Start
	
	@Test(priority = 3037)
	public void checkCreateUserWithExtraMasterDepotGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterDepotGroupRestriction(), true);
	}
	
	@Test(priority = 3038)
	public void CheckSavePVVATVoucherForExtraMasterDepotGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterDepotGroupRestriction(), true); 
	}
	
	@Test(priority = 3039)
	public void checkLogoutAndLoginWithUser1ForExtraMasterDepotGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3040)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotNamesForExtraMasterDepotGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotNamesForExtraMasterDepotGroupRestriction(), true);
	}
	
	@Test(priority = 3041)
	public void checkLogoutAndLoginWithSUForExtraMasterDepotGroupRestriction()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Extra Master  DEPOT( GROUP) Restriction  End
	
	@Test(priority = 3042)
	public void checkEraseAllTransactions1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactions(), true);
	}
	
	// User Department and Warehouse LEAF NODE Restriction and in screens both Tags in *HEADER*  Start
	
	@Test(priority = 3043)
	public void checkCreateUserWithDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader(), true);
	}
	
	@Test(priority = 3044)
	public void CheckEnableWarehouseTagInHeaderInPVVATVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableWarehouseTagInHeaderInPVVATVoucher(), true);
	}
	
	@Test(priority = 3045)
	public void CheckEnableWarehouseTagInHeaderInPurchasesReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableWarehouseTagInHeaderInPurchasesReturnsVoucher(), true);
	}
	
	@Test(priority = 3046)
	public void MapWarehouseFieldInWorkflow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.MapWarehouseFieldInWorkflow(), true);
	}	
	
	
	@Test(priority = 3047)
	public void CheckSavePVVATVoucherForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader(), true);
	}
	
	@Test(priority = 3048)
	public void checkLogoutAndLoginWithUser1ForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3049)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndWarehosueNamesForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndWarehosueNamesForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader(), true);
	}
	
	@Test(priority = 3050)
	public void checkLogoutAndLoginWithSUForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}	
	
	 // User Department and Warehouse LEAF NODE Restriction and in screens both Tags in *HEADER*  End
	
	
	// User Department and Warehouse LEAF NODE Restriction and in screens both Tags in *BODY*  Start
	
	@Test(priority = 3051)
	public void CheckEnableWarehouseAndDepartmentTagInBodyInPVVATVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableWarehouseAndDepartmentTagInBodyInPVVATVoucher(), true);
	}
	
	@Test(priority = 3052)
	public void CheckEnableWarehouseAndDepartmentTagInBodyInPurchasesReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableWarehouseAndDepartmentTagInBodyInPurchasesReturnsVoucher(), true);
	}
	
	@Test(priority = 3053)
	public void MapWarehouseAndDepartmentFieldsInWorkflow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.MapWarehouseAndDepartmentFieldsInWorkflow(), true);
	}
	
	@Test(priority = 3054)
	public void CheckSavePVVATVoucherForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody(), true);
	}
	
	@Test(priority = 3055)
	public void checkLogoutAndLoginWithUser1ForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3056)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndWarehosueNamesForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndWarehosueNamesForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody(), true);
	}
	
	@Test(priority = 3057)
	public void checkLogoutAndLoginWithSUForDepartmentAndWarehouseLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Department and Warehouse LEAF NODE Restriction and in screens both Tags in *BODY* End
	
	// User Extra Master  DEPOT and  RURAL ( LEAF NODE) Restriction in screens both Masters in *BODY*  Start
	
	@Test(priority = 3058)
	public void checkCreateUserWithExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody()	
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody(), true);
	}
	
	@Test(priority = 3059)
	public void CheckEnableExtraMastersRuralAndDepotTagsInBodyInPVVATVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInBodyInPVVATVoucher(), true);
	}
	
	@Test(priority = 3060)
	public void CheckEnableExtraMastersRuralAndDepotTagsInBodyInPurchasesReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInBodyInPurchasesReturnsVoucher(), true);
	}
	
	@Test(priority = 3061)
	public void MapDepotFieldInWorkflow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.MapDepotFieldInWorkflow(), true);
	}
	
	@Test(priority = 3062)
	public void CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody(), true);
	}
	
	@Test(priority = 3063)
	public void checkLogoutAndLoginWithUser1ForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3064)
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody(), true);
	}
	
	@Test(priority = 3065)
	public void checkLogoutAndLoginWithSUForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInBody()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Extra Master  DEPOT and  RURAL ( LEAF NODE) Restriction in screens both Masters in *BODY*  End
	
	 
	@Test(priority = 3066)
	public void checkEraseAllTransactions2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactions(), true);
	}
	
	//User Extra Master  DEPOT and  RURAL ( LEAF NODE) Restriction in screens both Masters in *HEADER*  Start
	
	@Test(priority = 3067)
	public void CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPVVATVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPVVATVoucher(), true);
	}
	
	@Test(priority = 3068)
	public void CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPurchasesReturnsVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPurchasesReturnsVoucher(), true);
	}
	
	@Test(priority = 3069)
	public void MapDepotAndRuralFieldsInWorkflow()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.MapDepotAndRuralFieldsInWorkflow(), true);
	}
	
	@Test(priority = 3070) 
	public void CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader(), true);
	}
	
	@Test(priority = 3071)
	public void checkLogoutAndLoginWithUser1ForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3072) 
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader(), true);
	}
	
	@Test(priority = 3073)
	public void checkLogoutAndLoginWithSUForExtraMasterDepotAndRuralLEAFNODERestrictionBothTagsInHeader()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// User Extra Master  DEPOT and  RURAL ( LEAF NODE) Restriction in screens both Masters in *HEADER*  End
	
	
	//In User Extra Master  DEPOT and  RURAL ( LEAF NODE) Restriction in screens both Masters in *HEADER*   *EXCLUDE Scenario* Start
	
	
	@Test(priority = 3074)
	public void checkCreateUserWithExtraMasterDepotAndRuralLEAFNODERestrictionExcludeScenario()	
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkCreateUserWithExtraMasterDepotAndRuralLEAFNODERestrictionExcludeScenario(), true);
	}	
	
	//@Test(priority = 3075)
	public void CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPVVATVoucherForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPVVATVoucherForExcludeScenario(), true);
	}
	
	//@Test(priority = 3076)
	public void CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPurchasesReturnsVoucherForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckEnableExtraMastersRuralAndDepotTagsInHeaderInPurchasesReturnsVoucherForExcludeScenario(), true);
	}
	
	//@Test(priority = 3077)
	public void MapDepotAndRuralFieldsInWorkflowForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.MapDepotAndRuralFieldsInWorkflowForExcludeScenario(), true);
	}
	
	@Test(priority = 3078) 
	public void CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario(), true);
	}
	
	@Test(priority = 3079)
	public void checkLogoutAndLoginWithUser1ForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithUser1(), true);
	}
	
	@Test(priority = 3080) 
	public void checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLinkDocumentLinkDataShouldDisplayWithBlankDepotAndRuralNamesForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario(), true);
	}
	
	@Test(priority = 3081)
	public void checkLogoutAndLoginWithSUForExtraMasterDepotAndRuralLEAFNODERestrictionForExcludeScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogoutAndLoginWithSUForDepartmentLEAFNODERestriction(), true);
	}
	
	// In User Extra Master DEPOT and RURAL ( LEAF NODE) Restriction in screens
	// both Masters in *HEADER* *EXCLUDE Scenario* End
	
	// AUTHORIZATION SCENARIO'S
	
	@Test(priority = 3082)
	public void checkEditAndChangingConditonAsKeepUnpostedSelectingLinksBaseAndAuthorizationModeApproval()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.checkEditAndChangingConditonAsKeepUnpostedSelectingLinksBaseAndAuthorizationModeApproval(), true);
	}

	@Test(priority = 3083)
	public void checkEditAndChangingConditonAsKeepUnpostedSelectingLinksBaseAndAuthorizationModeApproval2ndlevel()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.checkEditAndChangingConditonAsKeepUnpostedSelectingLinksBaseAndAuthorizationModeApproval2ndlevel(),
				true);
	}
	
	@Test(priority = 3084)
	public void checkSavingBaseVoucherPurchasesOrdersWith10Qty()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkSavingBaseVoucherPurchasesOrdersWith10Qty(), true);
	}
	
	@Test(priority = 3085)
	public void checkSavingLinkdocumentWithPartialQty5AndVerifyAuthorizationStatus()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkSavingLinkdocumentWithPartialQty5AndVerifyAuthorizationStatus(), true);
	}

	@Test(priority = 3086)
	public void checkeditLinkdocumentDeleteRowAndUsingContolLLoadTheDocumentAndSaveAndVerifyAuthorizationStatus()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.checkeditLinkdocumentDeleteRowAndUsingContolLLoadTheDocumentAndSaveAndVerifyAuthorizationStatus(),
				true);
	}
	
	@Test(priority = 4000)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException,
			EncryptedDocumentException, InvalidFormatException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogout(), true);
	}
	
	
	
	// GROSS WITH EXCHANGE RATE SCENARIOS
	/*
	@Test(priority = 4001)
	public void checkLoginWithLilnksGrossWithExchangeRatebackup()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLoginWithLilnksGrossWithExchangeRatebackup(), true);
	}
	
	@Test(priority = 4002)
	public void CheckSavePVVATVoucherWithRMAItemBackDatedEntry() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucherWithRMAItemBackDatedEntry(), true);
		
	}
	
	@Test(priority = 4003)
	public void CheckSaveSalesInvoiceVatVoucherWithRMAItemWithTodaysDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSaveSalesInvoiceVatVoucherWithRMAItemWithTodaysDate(), true);
		
	}
	
	@Test(priority = 4004)
	public void CheckSaveSalesInvoiceVatVoucherWithRMAItemWithBackDatedentry() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSaveSalesInvoiceVatVoucherWithRMAItemWithBackDatedentry(), true);
		
	}
	
	@Test(priority = 4005)
	public void checkStockLedgerReportAfterSavingSalesInvoiceVatVochers()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkStockLedgerReportAfterSavingSalesInvoiceVatVochers(), true);
	}
	
	@Test(priority = 4006)
	public void CheckInwardDocumentRMAPOPUPAfterFullConsumptionofRmaNosINOutwardDcoument()
			throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckInwardDocumentRMAPOPUPAfterFullConsumptionofRmaNosINOutwardDcoument(), true);
	}
	
	@Test(priority = 4007)
	public void CheckSavePVVATVoucher2WithRMAItemWithTodaysDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckSavePVVATVoucher2WithRMAItem(), true);
		
	}
	
	@Test(priority = 4008)
	public void CheckResSavePVVATVoucher2WithFutureDate() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.CheckResSavePVVATVoucher2WithFutureDate(), true);
		
	}
	
	@Test(priority = 4009)
	public void checkEraseAllTransactions5()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactions(), true);
	}
	
	@Test(priority = 4010)
	public void checkRateValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsAED()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkRateValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsAED(), true);
	}
	
	@Test(priority = 4011)
	public void OnEditingChangeExchangeRateInBaseDocumentAndcheckRateValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsAED()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.OnEditingChangeExchangeRateInBaseDocumentAndcheckRateValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsAED(),
				true);
	}
	
	@Test(priority = 4012)
	public void SaveLinkDocumentWithPartialGrossAmountAndValidatingRateAndGrossValues()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.SaveLinkDocumentWithPartialGrossAmountAndValidatingRateAndGrossValues(), true);
	}
	
	@Test(priority = 4013)
	public void afterFullConsumeOfLinkdocumentTrtToEditGrossInBasedocumentScenario()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.afterFullConsumeOfLinkdocumentTrtToEditGrossInBasedocumentScenario(), true);
	}
	
	@Test(priority = 4014)
	public void OnEditingChangeCurrencyInBaseDocumentAndcheckGrossValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsUSD()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.OnEditingChangeCurrencyInBaseDocumentAndcheckGrossValueInlinkPopupWhenWeTakeLinkValueAsGrossAndCurrencyAsUSD(),
				true);
	}
	
	@Test(priority = 4015)
	public void checkgrossValueInlinkPopupWhenWeTakeLinkValueAsTransactionGrossAndCurrencyAsAED()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkgrossValueInlinkPopupWhenWeTakeLinkValueAsTransactionGrossAndCurrencyAsAED(), true);
	}
	
	@Test(priority = 4016)
	public void SaveLinkDocumentWithPartialGrossAmountAndValidatingRateAndGrossValuesWhenWeTakeLinkValueAsTransactionGross()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(
				dp.SaveLinkDocumentWithPartialGrossAmountAndValidatingRateAndGrossValuesWhenWeTakeLinkValueAsTransactionGross(),
				true);
	}

	@Test(priority = 4020)
	public void checkLogout2() throws NullPointerException, IOException, InterruptedException,
			EncryptedDocumentException, InvalidFormatException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogout(), true);
	}
	
	@Test(priority = 5000)
	public void checkLoginWithLilnksGrossbackup()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLoginWithLilnksGrossbackup(), true);
	}
	
	@Test(priority = 5001)
	public static void checkGrossScenarioUnderLinkValueDropdownForFlow1() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException,
			InvalidFormatException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkGrossScenarioUnderLinkValueDropdownForFlow1(),	true);
	}
	
	@Test(priority = 5002)
	public static void checkGrossScenarioUnderLinkValueDropdownForFlow2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException,
			InvalidFormatException, AWTException {
		dp = new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkGrossScenarioUnderLinkValueDropdownForFlow2(),	true);
	}
	
	@Test(priority=5005)
	public void checkLogout3() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DonotRestrictTagOptionPage(getDriver());
		Assert.assertEquals(dp.checkLogout(),true);
	}  
	
	*/
	

}
