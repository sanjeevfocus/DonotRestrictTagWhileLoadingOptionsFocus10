package com.focus.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.focus.Pages.TransactionAuthorizationDefinitionOptionsPage;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class TransactionAuthorizationDefinitionOptionsTest extends BaseEngine {
	TransactionAuthorizationDefinitionOptionsPage tadop;

	@Test(priority = 1)
	public void checkLoginTOTA()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLoginTOTA(), true);
	}
	
	/*
	@Test(enabled = false)
	public void checkLoginAndRestoreOptionsCompanyAndLogin()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLoginAndRestoreOptionsCompanyAndLogin(), true);
	}
	
	
	@Test(priority = 1000)
	public void checkConditonNotRequiredIsSelectedInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkConditonNotRequiredIsSelectedInTransactionAuthorizationConditionTab(), true);
	}
    
	@Test(priority = 1001)
	public void checkSavingPurchaseVoucherNWithConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1002)
	public void checkAuthorizationStatusInVoucherHomePageWithConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1003)
	public void checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1004) // need to be change
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndConditionsNotRequiredOption(),
				true);
	}

	@Test(priority = 1005)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsNotRequiredOption(),
				true);
	}

	@Test(priority = 1006)
	public void checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption(), true);
	}

	
	
	
	// With Quantity Condition and multiple Users
	
	@Test(priority = 1010)
	public void checkTransactionAuthorizationAddingLevelAndGivingConditionsWithQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationAddingLevelAndGivingConditionsWithQuantity(), true);
	}
	
	@Test(priority = 1011)
	public void checkSavingPurchaseVoucherN1WithQuantityAs6()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithQuantityAs6(), true);
	}

	@Test(priority = 1012)
	public void checkSavingPurchaseVoucherN2WithQuantityAs12()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2WithQuantityAs12(), true);
	}

	@Test(priority = 1013)
	public void checkSavingPurchaseVoucherN3WithQuantityAs12()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN3WithQuantityAs12(), true);
	}

	@Test(priority = 1014)
	public void checkSavingPurchaseVoucherN4WithQuantityAs24()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN4WithQuantityAs24(), true);
	}

	@Test(priority = 1015)
	public void checkAuthorizationStatusInVoucherHomePageWithConditionsWithQuantity()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithConditionsWithQuantity(), true);
	}

	@Test(priority = 1016)
	public void checkLogoutAndLoginWithUserAllOptionsWithQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1017)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndQuantityCondition(),
				true);
	}

	@Test(priority = 1018)
	public void checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndQuantityConditionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndQuantityConditionOption(),
				true);
	}

	@Test(priority = 1019)
	public void checkLogoutAndLoginWithUserTransactionAuthorizationWithQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserTransactionAuthorization(), true);
	}

	@Test(priority = 1020)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndQuantityCondition(),
				true);
	}

	@Test(priority = 1021)
	public void checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndQuantityConditionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndQuantityConditionOption(),
				true);
	}
	
	@Test(priority = 1022)
	public void checkLogoutAndLoginWithSU()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSU(), true);
	}

	@Test(priority = 1023)
	public void checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationQuantityCondition(),
				true);
	}

	@Test(priority = 1024)
	public void checkEraseAllTransactionsAfterCompletingQuantityConditions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption(), true);
	}
	
	
	
	
	
	
	
	@Test(priority = 1031)
	public void checkTransactionAuthorizationGivingConditionsWithWarehouse()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationGivingConditionsWithWarehouse(), true);
	}
	
	@Test(priority = 1032)
	public void checkSavingPurchaseVoucherN1WithWarehouseAsMumbai()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithWarehouseAsMumbai(), true);
	}

	@Test(priority = 1033)
	public void checkSavingPurchaseVoucherN2WithWarehouseAsHyderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2WithWarehouseAsHyderabad(), true);
	}

	@Test(priority = 1034)
	public void checkSavingPurchaseVoucherN3WithWarehouseAsHyderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN3WithWarehouseAsHyderabad(), true);
	}

	@Test(priority = 1035)
	public void checkSavingPurchaseVoucherN4WithWarehouseAsSecunderabad()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN4WithWarehouseAsSecunderabad(), true);
	}

	@Test(priority = 1036)
	public void checkAuthorizationStatusInVoucherHomePageWithWarehouseConditions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithWarehouseConditions(), true);
	}

	@Test(priority = 1037)
	public void checkLogoutAndLoginWithUserAllOptionsWithWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1038)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWarehouseCondition(),
				true);
	}

	@Test(priority = 1039)
	public void checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndWarehouseConditionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndWarehouseConditionOption(),
				true);
	}
	
	@Test(priority = 1040)
	public void checkLogoutAndLoginWithUserTransactionAuthorizationWithWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserTransactionAuthorization(), true);
	}

	@Test(priority = 1041)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndWarehouseCondition(),
				true);
	}
	
	@Test(priority = 1042)
	public void checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndWarehouseConditionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndWarehouseConditionOption(),
				true);
	}

	@Test(priority = 1043)
	public void checkLogoutAndLoginWithSUAfterAuthorizationWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSU(), true);
	}

	@Test(priority = 1044)
	public void checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationWarehouseCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationWarehouseCondition(),
				true);
	}
	
	@Test(priority = 1045)
	public void checkEraseAllTransactionsAfterCompletingWarehouseConditions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption(), true);
	}
	
	@Test(priority = 1050)
	public void checkTransactionAuthorizationDeletingLevelAndChangingUser()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationDeletingLevelAndChangingUser(), true);
	}

	@Test(priority = 1051)
	public void checkSavingPurchaseVoucherN1ForChangingUserWhileVoucherIsInPendingState()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1ForChangingUserWhileVoucherIsInPendingState(), true);
	}

	@Test(priority = 1052)
	public void checkAuthorizationStatusInVoucherHomePageWithChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageWithChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1053)
	public void checkChangingUserToUserAllOptionsInTransactionAuthorizationWhenPurchaseVoucherNIsInPending()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkChangingUserToUserAllOptionsInTransactionAuthorizationWhenPurchaseVoucherNIsInPending(),
				true);
	}

	@Test(priority = 1054)
	public void checkSavingPurchaseVoucherN2AfterChangingUserWhileVoucherIsInPendingState()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2AfterChangingUserWhileVoucherIsInPendingState(), true);
	}

	@Test(priority = 1055)
	public void checkAuthorizationStatusInVoucherHomePageWithTwoVouchersChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageWithTwoVouchersChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1056)
	public void checkLogoutAndLoginWithUserAllOptionsWithChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 1057)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1058)
	public void checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizaingWithUserAllOptionsAndChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1059)
	public void checkLogoutAndLoginWithUserTransactionAuthorizationWithChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserTransactionAuthorization(), true);
	}

	@Test(priority = 1060)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1061)
	public void checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizaingWithUserTransactionAuthorizationAndChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}
	
	@Test(priority = 1062)
	public void checkLogoutAndLoginWithSUAfterAuthorizationChangingUserWhileVoucherIsInPendingStateCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSU(), true);
	}

	@Test(priority = 1063)
	public void checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationChangingUserWhileVoucherIsInPendingStateCondition  ()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithSUAfterAuthorizationChangingUserWhileVoucherIsInPendingStateCondition(),
				true);
	}

	@Test(priority = 1064)
	public void checkEraseAllTransactionsAfterCompletingChangingUserWhileVoucherIsInPendingStateConditions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption(), true);
	}

	
	
	
	@Test(enabled = false)
	public void checkTransactionAuthorizationAddingEscalationWithTimeLimit1DayAndEscalationTypeApproved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkTransactionAuthorizationAddingEscalationWithTimeLimit1DayAndEscalationTypeApproved(), true);
	}

	@Test(enabled = false)
	public void checkSavingPurchaseVoucherNWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved(),
				true);
	}

	@Test(enabled = false)
	public void checkAuthorizationStatusInVoucherHomePageWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved(),
				true);
	}

	@Test(enabled = false)
	public void checkLogoutAndLoginWithUserAllOptionsWithEscalatingTimeLimit1DayAndTypeApproved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(enabled = false)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndWithCurrentDateForEscalationTimeLimit1DayAndTypeApproved(),
				true);
	}

	@Test(enabled = false)
	public void checkLogoutAndLoginWithSUAndResaveVoucherWithPreviousDateForEscalationTimeLimit1DayAndTypeApprovedValidateAuthorizationStatus()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUAndResaveVoucherWithPreviousDateForEscalationTimeLimit1DayAndTypeApprovedValidateAuthorizationStatus(),
				true);
	}

	@Test(enabled = false)
	public void checkEraseAllTransactionsAfterCompletingEscalationTimeLimit1DayAndApprovedOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterCompletingConditionsNotRequiredOption(), true);
	}
	
	
	
	
	
	
	
	
	@Test(priority = 2009)
	public void checkTransactionAuthorizationConditionTabDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationConditionTabDateRangeOption(), true);

	}

	@Test(priority = 2010)
	public void checkPurchaseVoucherNSavingVoucher1WithDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchaseVoucherNSavingVoucher1WithDateRangeOption(), true);

	}

	@Test(priority = 2011)
	public void checkPurchasesVoucherNSavingVoucher2WithDateRangeOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNSavingVoucher2WithDateRangeOptions(), true);

	}

	@Test(priority = 2012)
	public void checkAuthorizationStatusInHomePageWithDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInHomePageWithDateRangeOption(), true);

	}

	@Test(priority = 2013)
	public void checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);

	}

	@Test(priority = 2014)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithDateRangeOption(),
				true);

	}

	@Test(priority = 2015)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithDateRangeOption(), true);

	}

	@Test(priority = 2016)
	public void checkEraseAllTransactionsAfterDateRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);

	}

	
	@Test(priority = 2017)
	public void checkTransactionAuthorizationConditionTabTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationConditionTabTimeRangeOption(), true);

	}

	@Test(priority = 2018)
	public void checkPurchaseVoucherNSavingVoucher1WithTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchaseVoucherNSavingVoucher1WithTimeRangeOption(), true);

	}

	@Test(priority = 2019)
	public void checkPurchasesVoucherNSavingVoucher2WithTimeRangeOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNSavingVoucher2WithTimeRangeOptions(), true);

	}

	@Test(priority = 2020)
	public void checkAuthorizationStatusInHomePageWithTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInHomePageWithTimeRangeOption(), true);

	}

	@Test(priority = 2021)
	public void checkLogoutAndLoginWithUserAllOptionsWithTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2022)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithTimeRangeOption(),
				true);

	}

	@Test(priority = 2023)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithTimeRangeOption(), true);

	}

	@Test(priority = 2024)
	public void checkEraseAllTransactionsAfterTimeRangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);

	}

	
	
	
	
	
	@Test(priority = 2025)
	public void checkConditonForTransactionAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkConditonForTransactionAuthorization(), true);
	}

	@Test(priority = 2026)
	public void checkFinancialsPurchasesVoucherNSavingVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher1(), true);
	}

	@Test(priority = 2027)
	public void checkFinancialsPurchasesVoucherNSavingVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher2(), true);
	}

	@Test(priority = 2028)
	public void checkFinancialsPurchasesVoucherNSavingVoucher3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher3(), true);
	}

	@Test(priority = 2029)
	public void checkAuthorizationStatusInHomePage()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInHomePage(), true);
	}

	@Test(priority = 2030)
	public void checkFinancialsPurchasesVoucherNSavingVoucher2EditVendorATOVendorB()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher2EditVendorATOVendorB(), true);
	}

	@Test(priority = 2031)
	public void checkAuthorizationStatusInHomePageAfterEditingVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInHomePageAfterEditingVoucher2(), true);
	}

	@Test(priority = 2032)
	public void checkLogoutAndLoginWithUserAllOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2033)
	public void checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptions(), true);
	}

	@Test(priority = 2034)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatus()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatus(), true);
	}

	@Test(priority = 2035)
	public void checkEraseAllTransactionsAfterIntialCheck()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	
	
	
	
	

	@Test(priority = 2036)
	public void checkEditAndChangingConditonForTransactionAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditAndChangingConditonForTransactionAuthorization(), true);
	}

	@Test(priority = 2037)
	public void checkFinancialsPurchasesVoucherNSavingVoucher1WithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher1WithConditionItemAsBRCOGS(), true);
	}

	@Test(priority = 2038)
	public void checkFinancialsPurchasesVoucherNSavingVoucher2WithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher2WithConditionItemAsBRCOGS(), true);
	}

	@Test(priority = 2039)
	public void checkFinancialsPurchasesVoucherNSavingVoucher3WithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher3WithConditionItemAsBRCOGS(), true);
	}

	@Test(priority = 2040)
	public void checkFinancialsPurchasesVoucherNSavingVoucher4WithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher4WithConditionItemAsBRCOGS(), true);
	}

	@Test(priority = 2041)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionItemAsBRCOGS(),
				true);
	}

	@Test(priority = 2042)
	public void checkLogoutAndLoginWithUserAllOptionsWithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2043)
	public void checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionItemAsBRCOGS(),
				true);
	}

	@Test(priority = 2044)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionItemAsBRCOGS(), true);
	}

	@Test(priority = 2045)
	public void checkEraseAllTransactionsAfterVerifyingTransactionsWithItemAsBRCOGS()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	
	
	
	@Test(priority = 2046)
	public void checkEditAndChangingConditonAsLineWiseAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditAndChangingConditonAsLineWiseAuthorization(), true);
	}
	
	@Test(priority = 2047)
	public void checkFinancialsPurchasesVoucherNSavingVoucher1WithLineWiseAuthorizationCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher1WithLineWiseAuthorizationCondition(),
				true);
	}

	@Test(priority = 2048)
	public void checkFinancialsPurchasesVoucherNSavingVoucher2WithLineWiseAuthorizationCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher2WithLineWiseAuthorizationCondition(),
				true);
	}

	@Test(priority = 2049)
	public void checkFinancialsPurchasesVoucherNSavingVoucher3WithLineWiseAuthorizationCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher3WithLineWiseAuthorizationCondition(),
				true);
	}

	@Test(priority = 2050)
	public void checkFinancialsPurchasesVoucherNSavingVoucher4WithLineWiseAuthorizationCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher4WithLineWiseAuthorizationCondition(),
				true);
	}

	@Test(priority = 2051)
	public void checkFinancialsPurchasesVoucherNSavingVoucher5WithLineWiseAuthorizationCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNSavingVoucher5WithLineWiseAuthorizationCondition(),
				true);
	}

	@Test(priority = 2052)
	public void checkFinancialsPurchasesVoucherNAuthorizationStatusWithLineWiseAuthorizationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkFinancialsPurchasesVoucherNAuthorizationStatusWithLineWiseAuthorizationOption(),
				true);
	}

	@Test(priority = 2053)
	public void checkLogoutAndLoginWithUserAllOptionsWithConditionLineWiseAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2054)
	public void checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionLineWiseAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkFinancialsPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithConditionLineWiseAuthorization(),
				true);
	}

	@Test(priority = 2055)
	public void checkAuthorizingLineWiseInVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizingLineWiseInVoucher1(), true);
	}

	@Test(priority = 2056)
	public void checkAuthorizingLineWiseInVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizingLineWiseInVoucher2(), true);
	}

	@Test(priority = 2057)
	public void checkAuthorizingLineWiseInVoucher3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizingLineWiseInVoucher3(), true);
	}

	@Test(priority = 2058)
	public void checkAuthorizingLineWiseInVoucher4()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizingLineWiseInVoucher4(), true);
	}

	@Test(priority = 2059)
	public void checkAuthorizingLineWiseInVoucher5()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizingLineWiseInVoucher5(), true);
	}

	@Test(priority = 2060)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionLineWiseAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionLineWiseAuthorization(), true);
	}

	@Test(priority = 2061)
	public void checkEraseAllTransactionsAfterVerifyingTransactionsWithLineWiseAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	
	@Test(priority = 2062)
	public void checkEditAndChangingConditonAsKeepUnpostedSelectingFinancialAccountingAndInventory()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditAndChangingConditonAsKeepUnpostedSelectingFinancialAccountingAndInventory(),
				true);
	}
	
	@Test(priority = 2063)
	public void checkFinancialsPurchasesVoucherNSavingVoucher1WithKeepUnpostedFinancialAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkFinancialsPurchasesVoucherNSavingVoucher1WithKeepUnpostedFinancialAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2064)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedFinancialAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedFinancialAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2065)
	public void checkFinancialLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkFinancialLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2066)
	public void checkInventoryStockLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkInventoryStockLedgerReportWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2067)
	public void checkLogoutAndLoginWithUserAllOptionsWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2068)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedFinancialAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedFinancialAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2069)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedFinancialAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedFinancialAccountingAndInventoryOptions(),
				true);
	}

	@Test(priority = 2070)
	public void checkFinancialLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkFinancialLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions(),
				true);
	}
	
	@Test(priority = 2071)
	public void checkInventoryStockLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkInventoryStockLedgerReportAfterAuthorizingWithConditionKeepUnpostedFinancialsAccountingAndInventoryOptions(),
				true);
	}
	
	// @Test(priority=2072)
	public void checkEraseAllTransactionsAfterConditionKeepUnpostedFinancialsAccountingAndInventoryOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEraseAllTransactionsAfterConditionKeepUnpostedFinancialsAccountingAndInventoryOptions(),
				true);
	}
	
	@Test(priority = 2073)
	public void checkAddingSalesOrderDocumentAndConditonAsKeepUnpostedSelectingLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAddingSalesOrderDocumentAndConditonAsKeepUnpostedSelectingLinksBaseOptions(),
				true);
	}

	@Test(priority = 2074)
	public void checkSavingSalesOrdersVoucher1WithKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesOrdersVoucher1WithKeepUnpostedLinksBaseOptions(), true);
	}

	@Test(priority = 2075)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedLinksBaseOptions(),
				true);
	}
	
	@Test(priority = 2076)
	public void checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions(), true);
	}
	
	@Test(priority = 2077)
	public void checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}
	
	@Test(priority = 2078)
	public void checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksBaseOptions(), true);
	}

	@Test(priority = 2079)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksBaseOptions(),
				true);
	}

	@Test(priority = 2080)
	public void checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedLinksBaseOptions(), true);
	}
	
	@Test(priority = 2081)
	public void checkTransactionAuthorizationSalesOrderDocumentAndConditonAsKeepUnpostedSelectingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkTransactionAuthorizationSalesOrderDocumentAndConditonAsKeepUnpostedSelectingReservationOption(),
				true);
	}
	
	@Test(priority = 2082)
	public void checkSavingSalesOrdersVoucher1WithKeepUnpostedReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesOrdersVoucher1WithKeepUnpostedReservationOptions(), true);
	}

	@Test(priority = 2083)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithConditionKeepUnpostedReservationOption(),
				true);
	}

	@Test(priority = 2084)
	public void checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLinkInSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption(), true);
	}

	@Test(priority = 2085)
	public void checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}
	
	@Test(priority = 2086)
	public void checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSalesOrderAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReservationOption(), true);
	}
	
	@Test(priority = 2087)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReservationOption(), true);
	}

	@Test(priority = 2088)
	public void checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesInvoiceVATVoucher1WithConditionKeepUnpostedReservationOption(), true);
	}

	@Test(priority = 2089)
	public void checkEraseAllTransactionsAfterConditionKeepUnpostedReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2090)
	public void checkSavingPurchaseOrderVoucher1WithOutKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher1WithOutKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2091)
	public void checkSavingPurchaseOrderVoucher2WithOutKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher2WithOutKeepUnpostedLinksOption(), true);
	}
	
	@Test(priority = 2092)
	public void checkSavingPurchaseVoucherN1WithOutKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2093)
	public void checkSavingPurchaseVoucherN2WithOutKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2WithOutKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2094)
	public void checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithoutConditionKeepUnpostedLinkOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithoutConditionKeepUnpostedLinkOption(),
				true);
	}

	@Test(priority = 2095)
	public void checkEraseAllTransactionsWithoutKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	
	
	@Test(priority = 2096)
	public void checkSelectingConditionAsLinksInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSelectingConditionAsLinksInTransactionAuthorizationConditionTab(), true);
	}

	@Test(priority = 2097)
	public void checkSavingPurchaseOrderVoucher1WithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher1WithKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2098)
	public void checkSavingPurchaseOrderVoucher2WithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher2WithKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2099)
	public void checkSavingPurchaseVoucherN1WithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2100)
	public void checkSavingPurchaseVoucherN2WithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2WithKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2101)
	public void checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithOutConditionKeepUnpostedLinkOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithOutConditionKeepUnpostedLinkOption(),
				true);
	}

	@Test(priority = 2102)
	public void checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2103)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedLinksOption(), true);
	}

	@Test(priority = 2104)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedLinksOption(),
				true);
	}

	@Test(priority = 2105)
	public void checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithConditionKeepUnpostedLinkOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkInventoryOrderManagementAnalysisOfLinkedOrUnLinkedListingOfDocReportWithConditionKeepUnpostedLinkOption(),
				true);
	}

	@Test(priority = 2106)
	public void checkEraseAllTransactionsWithKeepUnpostedLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
  
	@Test(priority = 2107)
	public void checkSavingPurchaseVoucherN1WithOutKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutKeepUnpostedReferencesOption(), true);
	}

	@Test(priority = 2108)
	public void checkPaymentVoucherWithoutKeepUnpostedReferenceOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPaymentVoucherWithoutKeepUnpostedReferenceOption(), true);
	}

	@Test(priority = 2109)
	public void checkEraseAllTransactionsAfterDateRangeOption1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	@Test(priority = 2110)
	public void checkSelectingConditionAsReferencesInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSelectingConditionAsReferencesInTransactionAuthorizationConditionTab(), true);
	}

	@Test(priority = 2111)
	public void checkSavingPurchaseVoucherN1WithKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithKeepUnpostedReferencesOption(), true);
	}

	@Test(priority = 2112)
	public void checkPaymentVoucherWithKeepUnpostedReferenceOptionBeforeAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPaymentVoucherWithKeepUnpostedReferenceOptionBeforeAuthorization(), true);
	}

	@Test(priority = 2113)
	public void checkLogoutAndLoginWithUserAllOptionsWithKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2114)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithKeepUnpostedReferencesOption(),
				true);
	}

	@Test(priority = 2115)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithKeepUnpostedReferencesOption(),
				true);
	}

	@Test(priority = 2116)
	public void checkPaymentVoucherWithKeepUnpostedReferenceOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPaymentVoucherWithKeepUnpostedReferenceOption(), true);
	}

	@Test(priority = 2117)
	public void checkEraseAllTransactionsWithKeepUnpostedReferencesOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	
	@Test(priority = 2118)
	public void checkWithOutConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkWithOutConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab(),
				true);
	}

	@Test(priority = 2119)
	public void checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnApprovalOption(),
				true);
	}

	@Test(priority = 2120)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2121)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnApprovalOption(),
				true);
	}

	@Test(priority = 2122)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnApprovalOption(),
				true);
	}

	@Test(priority = 2123)
	public void checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	
	
	
	@Test(priority = 2124)
	public void checkWithConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkWithConditionAskRemarksOnApprovalInTransactionAuthorizationConditionTab(), true);
	}

	@Test(priority = 2125)
	public void checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnApprovalOption(), true);
	}

	@Test(priority = 2126)
	public void checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2127)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnApprovalOption(),
				true);
	}

	@Test(priority = 2128)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnApprovalOption(),
				true);
	}

	@Test(priority = 2129)
	public void checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnApprovalOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	@Test(priority = 2130)
	public void checkWithConditionMakeApprovalRemarksMandatoryInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithConditionMakeApprovalRemarksMandatoryInTransactionAuthorizationConditionTab(), true);
	}

	@Test(priority = 2131)
	public void checkSavingPurchaseVoucherN1WithAuthorizationModeMakeApprovalRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithAuthorizationModeMakeApprovalRemarksMandatoryOption(),
				true);
	}

	@Test(priority = 2132)
	public void checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2133)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption(),
				true);
	}

	@Test(priority = 2134)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeApprovalRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeApprovalRemarksMandatoryOption(),
				true);
	}

	@Test(priority = 2135)
	public void checkEraseAllTransactionsWithAuthorizationModeMakeApprovalRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	
	
	@Test(priority = 2136)
	public void checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutAuthorizationModeAskRemarksOnRejectionOption(),
				true);
	}

	@Test(priority = 2137)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2138)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutAuthorizationModeAskRemarksOnRejectionOption(),
				true);
	}

	@Test(priority = 2139)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutAuthorizationModeAskRemarksOnRejectionOption(),
				true);
	}

	@Test(priority = 2140)
	public void checkEraseAllTransactionsWithOutAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	@Test(priority = 2141)
	public void checkWithConditionAskRemarksOnRejectionInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkWithConditionAskRemarksOnRejectionInTransactionAuthorizationConditionTab(),
				true);
	}

	@Test(priority = 2142)
	public void checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithAuthorizationModeAskRemarksOnRejectionOption(), true);
	}

	@Test(priority = 2143)
	public void checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2144)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeAskRemarksOnRejectionOption(),
				true);
	}

	@Test(priority = 2145)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeAskRemarksOnRejectionOption(),
				true);
	}

	@Test(priority = 2146)
	public void checkEraseAllTransactionsWithAuthorizationModeAskRemarksOnRejectionOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2147)
	public void checkWithConditionMakeRejectionRemarksMandatoryInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithConditionMakeRejectionRemarksMandatoryInTransactionAuthorizationConditionTab(), true);
	}
	
	@Test(priority = 2148)
	public void checkSavingPurchaseVoucherN1WithAuthorizationModeMakeRejectionRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherN1WithAuthorizationModeMakeRejectionRemarksMandatoryOption(), true);
	}

	@Test(priority = 2149)
	public void checkLogoutAndLoginWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2150)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption(),
				true);
	}

	@Test(priority = 2151)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeRejectionRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAuthorizationModeMakeRejectionRemarksMandatoryOption(),
				true);
	}

	@Test(priority = 2152)
	public void checkEraseAllTransactionsWithAuthorizationModeMakeRejectionRemarksMandatoryOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	
	
	
	
	
	@Test(priority = 2153)
	public void checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2154)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2155)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2156)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2157)
	public void checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2158)
	public void checkAuthorizationStatusAfterEditingWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusAfterEditingWithOutUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2159)
	public void checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	@Test(priority = 2160)
	public void checkWithConditionUndoAuthorizationOnEditingAnyValueChangeInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithConditionUndoAuthorizationOnEditingAnyValueChangeInTransactionAuthorizationConditionTab(),
				true);
	}

	@Test(priority = 2161)
	public void checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2162)
	public void checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2163)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2164)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2165)
	public void checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAnyValueChangeOption(),
				true);
	}

	@Test(priority = 2166)
	public void checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAnyValueChangeOption(), true);
	}

	@Test(priority = 2167)
	public void checkEraseAllTransactionsWithUndoAuthorizationOnEditingAnyValueChangeOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	
	
	
	@Test(priority = 2168)
	public void checkWithConditionUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithConditionUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsInTransactionAuthorizationConditionTab(),
				true);
	}

	@Test(priority = 2169)
	public void checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}
	
	@Test(priority = 2170)
	public void checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}
	
	@Test(priority = 2171)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}
	
	@Test(priority = 2172)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}

	@Test(priority = 2173)
	public void checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}

	@Test(priority = 2174)
	public void checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusAfterEditingWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption(),
				true);
	}

	@Test(priority = 2175)
	public void checkEraseAllTransactionsWithUndoAuthorizationOnEditingAmountOrQuantityOrAnyOtherNumericFieldsOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2176)
	public void checkWithOutConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithOutConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab(),
				true);
	}

	@Test(priority = 2177)
	public void checkSavingPurchaseOrderVoucher1WithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher1WithOutUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2178)
	public void checkSavingPurchaseOrderVoucher2WithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher2WithOutUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2179)
	public void checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithOutUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2180)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2181)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditLinksOption(),
				true);
	}

	@Test(priority = 2182)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOption(),
				true);
	}
	
	@Test(priority = 2183)
	public void checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingPurchaseVoucherNWithOutUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2184)
	public void checkAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusWithOutUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN(),
				true);
	}

	@Test(priority = 2185)
	public void checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2186)
	public void checkWithConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkWithConditionUndoAuthorizationOnEditingLinksInTransactionAuthorizationConditionTab(), true);
	}

	@Test(priority = 2187)
	public void checkSavingPurchaseOrderVoucher1WithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher1WithUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2188)
	public void checkSavingPurchaseOrderVoucher2WithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseOrderVoucher2WithUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2189)
	public void checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN1WithUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2190)
	public void checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2191)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditLinksOption(),
				true);
	}
	
	@Test(priority = 2192)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingLinksOption(),
				true);
	}
	
	@Test(priority = 2193)
	public void checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingPurchaseVoucherNWithUndoAuthorizationOnEditingLinksOption(), true);
	}

	@Test(priority = 2194)
	public void checkAuthorizationStatusWithUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusWithUndoAuthorizationOnEditingLinksOptionAfterEditingPurchaseVoucherN(),
				true);
	}

	@Test(priority = 2195)
	public void checkEraseAllTransactionsWithUndoAuthorizationOnEditingLinksOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2196)
	public void checkTransactionAuthorizationSalesOrderDocumentUncheckKeepUnpostedReservationAndLinksBaseOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkTransactionAuthorizationSalesOrderDocumentUncheckKeepUnpostedReservationAndLinksBaseOptions(),
				true);
	}

	@Test(priority = 2197)
	public void checkSavingPurchaseVoucherNWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2198)
	public void checkAuthorizationStatusInVoucherHomePageWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2199)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2200)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2201)
	public void checkLogoutAndLoginWithSUWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSU(), true);
	}
	
	@Test(priority = 2202)
	public void checkSavingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions(),
				true);
	}

	@Test(priority = 2203)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2204)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOptionAfterSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2205)
	public void checkSalesOrderAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSalesOrderAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2206)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2207)
	public void checkEditingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingSalesOrdersVoucher1WithOutUndoAuthorizationOnEditingReservationOptions(),
				true);
	}

	@Test(priority = 2208)
	public void checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingReservationOption(),
				true);
	}
	
	@Test(priority = 2209)
	public void checkTransactionAuthorizationSalesOrderDocumentWithUndoAuthorizationOnEditingReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkTransactionAuthorizationSalesOrderDocumentWithUndoAuthorizationOnEditingReservationOptions(),
				true);
	}

	@Test(priority = 2210)
	public void checkSavingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions(),
				true);
	}

	@Test(priority = 2211)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2212)
	public void checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOptionAfterSavingSalesOrder()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2213)
	public void checkSalesOrderAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSalesOrderAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2214)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthorizationOnEditingReservationOption(),
				true);
	}

	@Test(priority = 2215)
	public void checkEditingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEditingSalesOrdersVoucher1WithUndoAuthorizationOnEditingReservationOptions(),
				true);
	}

	@Test(priority = 2216)
	public void checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingReservationOption(),
				true);
	}
	

	@Test(priority = 2217)
	public void checkEraseAllTransactionsWithUndoAuthorizationOnEditingReservationOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority = 2218)
	public void checkSavingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2219)
	public void checkSavingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2220)
	public void checkSavingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2221)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2222)
	public void checkLogoutAndLoginWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2223)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2224)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthoizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithOutUndoAuthoizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2225)
	public void checkEditingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithBatchItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2226)
	public void checkEditingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithRMAItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2227)
	public void checkEditingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithBinItemWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2228)
	public void checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterEditingVouchersWithOutUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2229)
	public void checkEraseAllTransactionsWithOutUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}

	@Test(priority = 2230)
	public void checkTransactionAuthorizationUndoAuthorizationOnEditingBatchBinRmaOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationUndoAuthorizationOnEditingBatchBinRmaOption(), true);
	}

	@Test(priority = 2231)
	public void checkSavingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2232)
	public void checkSavingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2233)
	public void checkSavingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkSavingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2234)
	public void checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterSavingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2235)
	public void checkLogoutAndLoginWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithDateRangeOption(), true);
	}

	@Test(priority = 2236)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2237)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthoizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithUndoAuthoizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2238)
	public void checkEditingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithBatchItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2239)
	public void checkEditingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithRMAItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2240)
	public void checkEditingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEditingPurchaseVoucherNWithBinItemWithUndoAuthorizationOnEditingBatchBinRMAOption(), true);
	}

	@Test(priority = 2241)
	public void checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInHomePageAfterEditingVouchersWithUndoAuthorizationOnEditingBatchBinRMAOption(),
				true);
	}

	@Test(priority = 2242)
	public void checkTransactionAuthotizationReport()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthotizationReport(), true);
	}

	@Test(priority = 2243)
	public void checkEraseAllTransactionsWithUndoAuthorizationOnEditingBatchBinRMAOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactionsAfterDateRangeOption(), true);
	}
	
	@Test(priority=2244)
	 public void checkSavingPurchaseVoucherNWithConditionsNotRequiredOption1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkSavingPurchaseVoucherNWithConditionsNotRequiredOption1(), true);
	 }	 
	 
	 
	 @Test(priority=2245)
	 public void checkTransactionAuthorizationChangingUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkTransactionAuthorizationChangingUser(), true);
	 }
	 
	 @Test(priority=2246)
	 public void checkEditPurchaseVoucherNAndVerifynextToAuthUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkEditPurchaseVoucherNAndVerifynextToAuthUser(), true);
	 }	 
	 
	 
	 @Test(priority=2247)
	 public void checkLogoutAndLoginWithUserTransactionAuthorizationWithChangingUserScenario() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkLogoutAndLoginWithUserTransactionAuthorizationWithChangingUserScenario(), true);
	 }
	 
	 @Test(priority=2248)
	 public void checkPurchasesVoucherNAuthorizationStatusWithTransactionAuthorizationWithChangingUserScenarioWithAlerts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithTransactionAuthorizationWithChangingUserScenarioWithAlerts(), true);
	 }
	 
	 @Test(priority=2249)
	 public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithChangingUserScenario() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithChangingUserScenario(), true);
	 }
	 
	 
	 @Test(priority=2250)
	 public void checkSavingPurchaseVoucherNWithConditionsNotRequiredOption2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkSavingPurchaseVoucherNWithConditionsNotRequiredOption2(), true);
	 }	 
	 
	 
	 @Test(priority=2251)
	 public void checkTransactionAuthorizationAddingUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkTransactionAuthorizationAddingUser(), true);
	 
	 }
	 
	 @Test(priority=2252)
	 public void checkEditPurchaseVoucherNAndVerifynextToAuthUserForAuthorize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkEditPurchaseVoucherNAndVerifynextToAuthUserForAuthorize(), true);
	 }	
	 
	 
	 @Test(priority=2253)
	 public void checkTransactionAuthorizationReportBeforeAuthorizingTheVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkTransactionAuthorizationReportBeforeAuthorizingTheVoucher(), true);
	 }	
	 
	 
	 @Test(priority=2254)
	 public void checkLogoutAndLoginWithUserAllOptionsWithAddnigUserScenario() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithAddnigUserScenario(), true);
	 }
	 
	 @Test(priority=2255)
	 public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAddingUserScenarioWithAlerts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsWithAddingUserScenarioWithAlerts(), true);
	 }
	 
	 @Test(priority=2256)
	 public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAddingUserScenario() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAddingUserScenario(), true);
	 }
	 
	 @Test(priority=2257)
	 public void checkTransactionAuthorizationReportAfterAuthorizingTheVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadop=new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		 Assert.assertEquals(tadop.checkTransactionAuthorizationReportAfterAuthorizingTheVoucher(), true);
	 }	
	
	
	@Test(priority = 3000)
	public void checkCreateEmailHeaderTemplate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkCreateEmailHeaderTemplate(), true);
	}

	@Test(priority = 3001)
	public void checkCreateEmailTemplate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkCreateEmailTemplate(), true);
	}

	@Test(priority = 3002)
	public void checkPrintCreatedEmailTemplateAndValidatePdf()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkPrintCreatedEmailTemplateAndValidatePdf(), true);
	}

	@Test(priority = 3003)
	public void checkCreateSmsTemplate()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkCreateSmsTemplate(), true);
	}

	@Test(priority = 3004)
	public void checkCreateAlerts()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkCreateAlerts(), true);
	}

	@Test(priority = 3005)
	public void checkSavingPurchaseVoucherNAlertTemplateTransactionAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNAlertTemplateTransactionAuthorization(), true);
	}

	@Test(priority = 3006)
	public void checkAuthorizationStatusInVoucherHomePageCreateAlertOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageCreateAlertOption(), true);
	}

	@Test(priority = 3007)
	public void checkLogoutAndLoginWithUserAllOptionsWithCreateAlertOption()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithCreateAlertOption(), true);
	}

	@Test(priority = 3008)
	public void checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndAlertTemplateTransactionAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkPurchasesVoucherNAuthorizationStatusWithUserAllOptionsAndAlertTemplateTransactionAuthorization(),
				true);
	}
	
	@Test(priority = 3009)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAlertTemplateTransactionAuthorization()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithAlertTemplateTransactionAuthorization(),
				true);
	}
	*/
	
	//Authorization scenario's Stock Transfer Screen
	/*
	@Test(priority = 3)
	public void checkTransactionAuthorizationForStockTransferScreenWithInventoryTag1AndInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationForStockTransferScreenWithInventoryTag1AndInvTag2(),
				true);
	}

	@Test(priority = 4)
	public void CheckSaveStockTransferVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher(), true);
	}

	@Test(priority = 5)
	public void CheckSaveStockTransferVoucher2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher2(), true);
	}

	@Test(priority = 6)
	public void CheckSaveStockTransferVoucher3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher3(), true);
	}
	
	@Test(priority = 7)
	public void CheckSaveStockTransferVoucher4()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher4(), true);
	}

	@Test(priority = 8)
	public void checkAuthorizationStatusInVoucherHomePageWithConditionsInventoryTag1AndInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithConditionsInventoryTag1AndInvTag2(),
				true);
	}
	
	@Test(priority = 9)
	public void checkLogoutAndLoginWithUserAllOptionsWithQuantityCondition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 10)
	public void checkStockTransferAuthorizationStatusWithUserAllOptionsAndApproveTheVoucher()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkStockTransferAuthorizationStatusWithUserAllOptionsAndApproveTheVoucher(), true);
	}

	@Test(priority = 11)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsInventoryTag1AndInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusWithConditionsInventoryTag1AndInvTag2(), true);
	}

	@Test(priority = 12)
	public void checkEraseAllTransactions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactions2(), true);
	}
	
	@Test(priority = 13)
	public void checkTransactionAuthorizationForStockTransferScreenWithInventoryTag1OrInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkTransactionAuthorizationForStockTransferScreenWithInventoryTag1OrInvTag2(),
				true);
	}

	@Test(priority = 14)
	public void CheckSaveStockTransferVoucherForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucherForInventoryTag1ORInvTag2(), true);
	}

	@Test(priority = 15)
	public void CheckSaveStockTransferVoucher2ForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher2ForInventoryTag1ORInvTag2(), true);
	}

	@Test(priority = 16)
	public void CheckSaveStockTransferVoucher3ForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher3ForInventoryTag1ORInvTag2(), true);
	}

	@Test(priority = 17)
	public void CheckSaveStockTransferVoucher4ForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher4ForInventoryTag1ORInvTag2(), true);
	}

	@Test(priority = 18)
	public void checkAuthorizationStatusInVoucherHomePageWithConditionsInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithConditionsInventoryTag1ORInvTag2(),
				true);
	}
	
	@Test(priority = 19)
	public void checkLogoutAndLoginWithUserAllOptions()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 20)
	public void checkStockTransferAuthorizationStatusWithUserAllOptionsAndApproveTheVoucherForConditionsInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkStockTransferAuthorizationStatusWithUserAllOptionsAndApproveTheVoucherForConditionsInventoryTag1ORInvTag2(),
				true);
	}
	
	@Test(priority = 21)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusForStockTransferScreen()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusForStockTransferScreen(), true);
	}

	// @Test(priority=21)
	public void checkEraseAllTransactions1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkEraseAllTransactions2(), true);
	}

	//@Test(priority = 22)
	public void CheckSaveStockTransferVoucher1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucher1(), true);
	}

	@Test(priority = 23)
	public void CheckSaveStockTransferVoucherUsingCopyDocumentForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucherUsingCopyDocumentForInventoryTag1ORInvTag2(), true);
	}

	@Test(priority = 24)
	public void CheckSaveStockTransferVoucherUsingCopyClipBoardOptionForInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.CheckSaveStockTransferVoucherUsingCopyClipBoardOptionForInventoryTag1ORInvTag2(),
				true);
	}

	@Test(priority = 25)
	public void checkAuthorizationStatusInVoucherHomePageWithInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkAuthorizationStatusInVoucherHomePageWithInventoryTag1ORInvTag2(), true);
	}
	
	@Test(priority = 26)
	public void checkLogoutAndLoginWithUserAllOptionsWithInventoryTag1ORInvTag2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption(), true);
	}

	@Test(priority = 27)
	public void checkApproveTheVoucherWithInventoryTag1ORInvTag2Condition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkApproveTheVoucherWithInventoryTag1ORInvTag2Condition(), true);
	}

	@Test(priority = 28)
	public void checkLogoutAndLoginWithSUToCheckAuthorizationStatusForStockTransferScreenWithInventoryTag1ORInvTag2Condition()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkLogoutAndLoginWithSUToCheckAuthorizationStatusForStockTransferScreenWithInventoryTag1ORInvTag2Condition(),
				true);
	}
	*/
	// ApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Stating
	
	
	@Test(priority = 4001)
	public void checkSavingPurchaseVoucherNForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4002)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4003)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4004)
	public void checkApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}
	
	@Test(priority = 4005)
	public void checkEmailTemplateGettingToTheUserWithApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}
	
	// ApproveTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Ending
	

	// ApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Stating
	
	
	@Test(priority = 4006)
	public void checkSavingPurchaseVoucherN2ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN2ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4007)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings1(),
				true);
	}

	@Test(priority = 4008)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings1()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4009)
	public void checkApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}
	
	@Test(priority = 4010)
	public void checkEmailTemplateGettingToTheUserWithApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}
	
	// ApproveTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario End

	// RejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Stating
	
	// Issue
	@Test(priority = 4011)
	public void checkSavingPurchaseVoucherN3ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4012)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings2(),
				true);
	}

	@Test(priority = 4013)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings2()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4014)
	public void checkRejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkRejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4015)
	public void checkEmailTemplateGettingToTheUserWithRejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithRejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	// RejectTheVoucherFromVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario End
	 

	// RejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Stating
	

	@Test(priority = 4016)
	public void checkSavingPurchaseVoucherN4ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN4ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4017)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings3(),
				true);
	}

	@Test(priority = 4018)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings3()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4019)
	public void checkRejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkRejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}
	
	@Test(priority = 4020)
	public void checkEmailTemplateGettingToTheUserWithRejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithRejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	// RejectTheVoucherFromVoucherEntryPageForSendAsAttachmentOptionInInvoiceEmailSettings Scenario end
	

	// ApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings Scenario Stating
	

	@Test(priority = 4021)
	public void checkSavingPurchaseVoucherN5ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN5ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4022)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings4()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings4(),
				true);
	}

	@Test(priority = 4023)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings4()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4024)
	public void checkApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	@Test(priority = 4025)
	public void checkEmailTemplateGettingToTheUserWithApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	// ApproveTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings Scenario End
	

	// RejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings  Scenario Stating
	
	// Issue
	@Test(priority = 4026)
	public void checkSavingPurchaseVoucherN6ForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherN6ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4027)
	public void checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings5()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkAuthorizationStatusInVoucherHomePageForSendAsAttachmentOptionInInvoiceEmailSettings5(),
				true);
	}

	@Test(priority = 4028)
	public void checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings5()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogoutAndLoginWithUser3ForSendAsAttachmentOptionInInvoiceEmailSettings(), true);
	}

	@Test(priority = 4029)
	public void checkRejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkRejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	@Test(priority = 4030)
	public void checkEmailTemplateGettingToTheUserWithRejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(
				tadop.checkEmailTemplateGettingToTheUserWithRejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings(),
				true);
	}

	// RejectTheDocumentFromPendingAuthorizationTabForSendAsAttachmentOptionInInvoiceEmailSettings  Scenario End
	

	// ApproveTheDocumentThroughEmailForSendAsAttachmentOptionInInvoiceEmailSettings Scenario start
	
	
	@Test(priority = 4035)
	public void checkSavingPurchaseVoucherNForSendAsAttachmentOptionForApproveThrougEmail()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNForSendAsAttachmentOptionForApproveThrougEmail(), true);
	}

	@Test(priority = 4036)
	public void checkApproveTheVoucherThroughEmail()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkApproveTheVoucherThroughEmail(), true);
	}

	// ApproveTheDocumentThroughEmailForSendAsAttachmentOptionInInvoiceEmailSettings  Scenario end
	

	// RejectTheDocumentThroughEmailForSendAsAttachmentOptionInInvoiceEmailSettings Scenario start
	
	// Issue
	@Test(priority = 4038)
	public void checkSavingPurchaseVoucherNForSendAsAttachmentOptionForRejectThroughEmail()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkSavingPurchaseVoucherNForSendAsAttachmentOptionForRejectThroughEmail(), true);
	}

	@Test(priority = 4039)
	public void checkRejectTheVoucherThroughEmail()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkRejectTheVoucherThroughEmail(), true);
	}

	// RejectTheDocumentThroughEmailForSendAsAttachmentOptionInInvoiceEmailSettings Scenario end
	
	
	@Test(priority = 5100)
	public void checkLogout()
			throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		tadop = new TransactionAuthorizationDefinitionOptionsPage(getDriver());
		Assert.assertEquals(tadop.checkLogout(), true);
	} 
		
}
