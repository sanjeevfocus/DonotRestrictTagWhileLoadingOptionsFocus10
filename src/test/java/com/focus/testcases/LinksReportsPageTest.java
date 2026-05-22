package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;



import com.focus.Pages.LinksReportsPage;
import com.focus.base.BaseEngine;

public class LinksReportsPageTest extends BaseEngine 

{
	LinksReportsPage Lp;
	
	@Test(priority = 100)
	public void checkLogin1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException {
		Lp = new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLogin1(), true);
	}
	
	@Test(priority=101)
	public void checkListingOfDocumentsReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsReport(),true);
	}
	
	@Test(priority=102)
	public void GenerateTheListingOfDocumentReportsWithOnlyPendingOrUnlinkedReports() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithOnlyPendingOrUnlinkedReports(),true);
	}
	
	@Test(priority=103)
	public void GenerateTheListingOfDocumentReportsWithOnlyLinkedReports() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithOnlyLinkedReports(),true);
	}
	
	@Test(priority=104)
	public void GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsClosed() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsClosed(),true);
	}
	
	@Test(priority=105)
	public void GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsManuallyClosed() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsManuallyClosed(),true);
	}
	
	@Test(priority=106)
	public void GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPending() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPending(),true);
	}
	
	@Test(priority=107)
	public void GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPertialConsumed() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPertialConsumed(),true);
	}
	
	@Test(priority=108)
	public void GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsEntryPage(),true);
	}
	
	@Test(priority=109)
	public void GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsHomePage(),true);
	}
	
	@Test(priority=110)
	public void checkListingOfDocumentsByDueDateReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReport(),true);
	}
	
	@Test(priority=111)
	public void checkListingOfDocumentsByDueDateReportWithOnlyPendingOrUnlinkedReports() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithOnlyPendingOrUnlinkedReports(),true);
	}
	
	@Test(priority=112)
	public void checkListingOfDocumentsByDueDateReportWithOnlyLinkedReports() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithOnlyLinkedReports(),true);
	}
	
	@Test(priority=113)
	public void checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsAutoClosed() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsAutoClosed(),true);
	}
	
	@Test(priority=114)
	public void checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsManuallyClosed() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsManuallyClosed(),true);
	}
	
	@Test(priority=115)
	public void checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsPending() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsPending(),true);
	}
	
	@Test(priority=116)
	public void checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsEntryPage(),true);
	}
	
	@Test(priority=117)
	public void checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsHomePage(),true);
	}
	
	@Test(priority=118)
	public void checkListingOfDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkListingOfDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending(),true);
	}
	
	
	@Test(priority=119)
	public void checkAgeingOfPendingDocumentsReport1stPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsReport1stPage(),true);
	}
	
	@Test(priority=120)
	public void checkAgeingOfPendingDocumentsReport2ndPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsReport2ndPage(),true);
	}
	
	@Test(priority=121)
	public void checkAgeingOfPendingDocumentsReport3rdPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsReport3rdPage(),true);
	}
	
	@Test(priority=122)
	public void checkAgeingOfPendingDocumentsByDueDateReport1stPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport1stPage(),true);
	}
	
	@Test(priority=123)
	public void checkAgeingOfPendingDocumentsByDueDateReport2ndPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport2ndPage(),true);
	}
	
	@Test(priority=124)
	public void checkAgeingOfPendingDocumentsByDueDateReport3rdPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport3rdPage(),true);
	}
	
	@Test(priority=125)
	public void checkAgeingOfPendingDocumentsByDueDateReport4thPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport4thPage(),true);
	}
	
	@Test(priority=126)
	public void checkAgeingOfPendingDocumentsByDueDateReport5thPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport5thPage(),true);
	}
	
	@Test(priority=127)
	public void checkAgeingOfPendingDocumentsByDueDateReport6thPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReport6thPage(),true);
	}
	
	//@Test(priority=128)
	public void checkAgeingOfPendingDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkAgeingOfPendingDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending(),true);
	}
	
	@Test(priority=130)
	public void checkLinkChainAnalysisReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLinkChainAnalysisReport(),true);
	}
	
	@Test(priority=130)
	public void checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromHomePage(),true);
	}
	
	@Test(priority=131)
	public void checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromReportsEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromReportsEntryPage(),true);
	}
	
	@Test(priority=132)
	public void checkLinkChainAnalysisReportWithBasedOnStartingWorkflow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLinkChainAnalysisReportWithBasedOnStartingWorkflow(),true);
	}
	
	//@Test(priority=133)
	public void checkPendingVoucherReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkPendingVoucherReport(),true);
	}
	
	@Test(priority=134)
	public void checkPendingLinkStatusReportWithFilterBasedOnDocNo() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkPendingLinkStatusReportWithFilterBasedOnDocNo(),true);
	}
	
	@Test(priority=135)
	public void checkLogout() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		Lp=new LinksReportsPage(getDriver());
		Assert.assertEquals(Lp.checkLogout(),true);
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
