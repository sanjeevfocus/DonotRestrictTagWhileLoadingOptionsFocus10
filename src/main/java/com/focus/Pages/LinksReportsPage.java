package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.focus.base.BaseEngine;

public class LinksReportsPage extends BaseEngine

{
	
	public LinksReportsPage(WebDriver driver) 
	
	{

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[contains(@class,'icon-settings icon-font1')]")
	private static WebElement settingsMenu; 
	
	@FindBy(xpath="//a[@id='74']//span[contains(text(),'Design Workflow')]")
	private static WebElement designWorkflowbtn; 
	
	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Design Workflow')]")
	private static WebElement designWorkflowLabel; 
	
	@FindBy(xpath="//span[@id='btnClear']//i[@class='icon-save icon-font6']")
	private static WebElement saveBtn; 
	
	@FindBy(xpath="//i[@class='icon icon-clear icon-font6']")
	private static WebElement clearBtn; 
	
	@FindBy(xpath="//i[@class='icon-delete icon-font6']")
	private static WebElement deleteBtn; 
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement closeBtn;
	
	@FindBy(xpath="//input[@id='optWorkflow']")
	private static WebElement workflowNameTxt; 
	
	@FindBy(xpath="//*[@id='optWorkflow_input_settings']/span")
	private static WebElement workFlowNameSettingsBtn; 
					    
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_heading']")
					private static WebElement workflowNameCustomizeDisplayColoumnLabel;
					         
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_container']")
					private static WebElement workflowNameContainerTxt;
					
					@FindBy(xpath="///*[@id='optWorkflow_customize_popup_footer']/div/div/input[1]")
					private static WebElement workFlowNameStandardFieldsBtn;
					
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_list']")
							    private static WebElement workFlowNameFiledDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_header']")
							    private static WebElement workFlowNameHeaderTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_alignment']")
							    private static WebElement workFlowNameAlignmentDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_width']")
							    private static WebElement workFlowNameWidthTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
								private static WebElement workFlowNameStandardFieldsOkBtn;
								
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
								private static WebElement workFlowNameStandardFieldsCancelBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[2]")
					private static WebElement workFlowNameDeleteColoumnBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
					private static WebElement workFlowNameOkBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
					private static WebElement workFlowNameCancelBtn;
	

	//LeftSide Fields
	
	@FindBy(xpath="//div[@id='DocumentIcon']//span[@class='iconbar']")
	private static WebElement workFlowHOpenMenuBtn; 					
						
						
	@FindBy(xpath="//div[@id='idDocumentDiv']//span[@class='iconbar']")
	private static WebElement workFlowHideMenuBtn; 
	
	@FindBy(xpath="//div[@id='idDocumentDiv']//div[1]//ul[1]//li[1]//span[1]")
	private static WebElement receiptsDragAndDrop; 
	
	@FindBy(xpath="//div[@class='row rowMargin']//div[2]//ul[1]//li[1]//span[1]")
	private static WebElement paymentsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Petty Cash')]")
	private static WebElement pettyCashDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Receipts')]")
	private static WebElement postDatedReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Payments')]")
	private static WebElement postDatedPaymentsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Vouchers')]")
	private static WebElement purchasesVouchersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock adjustment')]")
	private static WebElement stockAdjustmentDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Returns')]")
	private static WebElement purchasesReturnsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Orders')]")
	private static WebElement purchasesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Job orders')]")
	private static WebElement jobordersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Receipt Notes')]")
	private static WebElement materialReceiptNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoices')]")
	private static WebElement salesInvoicesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Cash Sales')]")
	private static WebElement cashSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Hire-Purchase Sales')]")
	private static WebElement hirePurchaseSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'POS Sales')]")
	private static WebElement posSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Returns')]")
	private static WebElement salesReturnsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Orders')]")
	private static WebElement salesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Order')]")
	private static WebElement productionOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Delivery Notes')]")
	private static WebElement deliveryNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Non-Standard Journal Entries')]")
	private static WebElement nonStandardJournalEntriesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Inter-Departmental JV')]")
	private static WebElement interDepartmentalJVDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Debit Notes (Linewise)')]")
	private static WebElement debitNotesLineWiseDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Credit Notes (Linewise)/Payroll')]")
	private static WebElement creditNotesLineWiseDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Fixed Asset Depreciation Voucher')]")
	private static WebElement fixedAssetDepreciationVoucherDragAndDrop; 
	
	@FindBy(xpath="//div[16]//ul[1]//li[1]//span[1]")
	private static WebElement journalEntriesDragAndDrop; 
	
	@FindBy(xpath="//div[17]//ul[1]//li[1]//span[1]")
	private static WebElement debitNotesDragAndDrop; 
	
	@FindBy(xpath="//*[@id='DocumentDiv']/div[18]/ul/li/span")
	private static WebElement creditNotesDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Payroll Postings')]")
	private static WebElement payrollPostingsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Balances')]")
	private static WebElement openingBalancesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Shortages in Stock')]")
	private static WebElement shortagesInStockDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Excesses in Stocks')]")
	private static WebElement excessesInStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer')]")
	private static WebElement stockTransferDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks')]")
	private static WebElement openingStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Issues to Production')]")
	private static WebElement issuesToProductionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Receipts from production')]")
	private static WebElement receiptsFromproductionDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Returns from Shop Floor')]")
	private static WebElement returnsFromShopFloorDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Issues')]")
	private static WebElement jobWorkIssuesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Receipts')]")
	private static WebElement jobWorkReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Quotations')]")
	private static WebElement purchasesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Quotations')]")
	private static WebElement salesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Order')]")
	private static WebElement jobOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Process')]")
	private static WebElement productionProcessDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Requisition')]")
	private static WebElement materialRequisitionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Request For Quote')]")
	private static WebElement requestForQuoteDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Forex JV')]")
	private static WebElement forexJVDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Order')]")
	private static WebElement autoSalesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Invoice')]")
	private static WebElement autoSalesInvoiceDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoice N')]")
	private static WebElement salesInvoiceNDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Vouchers N')]")
	private static WebElement purchaseVoucherNDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Voucher New Two')]")
	private static WebElement purchaseVoucherNewTwoDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer New')]")
	private static WebElement stockTransferNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks New')]")
	private static WebElement openingStocksNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='idDocumentDiv']//input[@placeholder='Search']")
	private static WebElement searchTxt; 
	
	//Expands Buttons
	
	
	@FindBy(xpath="//*[@id='icon_5']")
	private static WebElement purchaseVouchersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_7']")
	private static WebElement purchaseOrdersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_9']")
	private static WebElement salesInvoicesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_11']")
	private static WebElement salesOrdersExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_14']")
	private static WebElement nonStandardJournalEntriesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_17']")
	private static WebElement creditNotesExpandBtn;
	
	@FindBy(xpath="//*[@id='icon_24']")
	private static WebElement receiptsFromProductionExpandBtn;


	
	//Body Fields After Drag Then On Flow Chart Link  Layer

	//For the First element which Drags From List TO Screen The Id Property Changes And Remaining Will Be same
	
	@FindBy(xpath="//div[@class='flowchart-operator-title ui-draggable-handle']")  //As it Is First One Selected Drag On FlowChart Is Same Id Property For Every Element
	private static WebElement FirstDraggedElement; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts')]")
	private static WebElement draggedReceipts; 
	
	@FindBy(xpath="//*[@id='id_prog_spanPlus']")
	private static WebElement programmableExpandBtn; 
	
	@FindBy(xpath="//span[contains(text(),' Programmable Field')]")
	private static WebElement programmableFiledBtn; 
	
	@FindBy(xpath="//p[contains(text(),'Programmable Field')]")
	private static WebElement programmableTab; 
	
	@FindBy(xpath="//p[contains(text(),'Name')]")
	private static WebElement nameTab; 
	
	@FindBy(xpath="//*[@id='formulaControl_textbox']")
	private static WebElement formulaControlTxt; 
	
	@FindBy(xpath="//*[@id='formulaControl_Ok']")
	private static WebElement formulaControlOkBtn; 
	
	@FindBy(xpath="//*[@id='id_customize_rearrange_Okbtn']")
	private static WebElement reArrangeFormulaOkBtn; 
	
	
	
	@FindBy(xpath="//div[contains(text(),'Payments')]")
	private static WebElement draggedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'Petty Cash')]")
	private static WebElement draggedPettyCash; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Receipts')]")
	private static WebElement draggedPostDatedReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Payments')]")
	private static WebElement draggedPostDatedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Vouchers')]")
	private static WebElement draggedPurchasesVouchers; 
	
	@FindBy(xpath="//div[contains(text(),'Stock adjustment')]")
	private static WebElement draggedStockAdjustment; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Returns')]")
	private static WebElement draggedPurchasesReturns; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Orders')]")
	private static WebElement draggedPurchasesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Job orders')]")
	private static WebElement draggedJoborders; 
	
	@FindBy(xpath="//div[contains(text(),'Material Receipt Notes')]")
	private static WebElement draggedMaterialReceiptNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Invoices')]")
	private static WebElement draggedSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Cash Sales')]")
	private static WebElement draggedCashSales; 
	
	@FindBy(xpath="//div[contains(text(),'Hire-Purchase Sales')]")
	private static WebElement draggedHirePurchaseSales; 
	
	@FindBy(xpath="//div[contains(text(),'POS Sales')]")
	private static WebElement draggedPOSSales; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Returns')]")
	private static WebElement draggedSalesReturns; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Orders')]")
	private static WebElement draggedSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Production Order')]")
	private static WebElement draggedProductionOrder; 
	
	@FindBy(xpath="//div[contains(text(),'Delivery Notes')]")
	private static WebElement draggedDeliveryNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Non-Standard Journal Entries')]")
	private static WebElement draggedNonStandardJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Inter-Departmental JV')]")
	private static WebElement draggedInterDepartmentalJV; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes (Linewise)')]")
	private static WebElement draggedDebitNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes (Linewise)/Payroll')]")
	private static WebElement draggedCreditNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Fixed Asset Depreciation Voucher')]")
	private static WebElement draggedFixedAssetDepreciationVoucher; 
	
	@FindBy(xpath="///div[contains(text(),'Journal Entries')]")
	private static WebElement draggedJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes')]")
	private static WebElement draggedDebitNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes')]")
	private static WebElement draggedCreditNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Payroll Postings')]")
	private static WebElement draggedPayrollPostings; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Balances')]")
	private static WebElement draggedOpeningBalances; 
	
	@FindBy(xpath="//div[contains(text(),'Shortages in Stock')]")
	private static WebElement draggedShortagesInStock; 
	
	@FindBy(xpath="//div[contains(text(),'Excesses in Stocks')]")
	private static WebElement draggedExcessesInStocks; 
	
	@FindBy(xpath="//div[contains(text(),'Stock Transfer')]")
	private static WebElement draggedStockTransfer; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks')]")
	private static WebElement draggedOpeningStocks; 
	
	@FindBy(xpath="//div[contains(text(),'Issues to Production')]")
	private static WebElement draggedIssuesToProduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	private static WebElement draggedReceiptsFromproduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	private static WebElement draggedReturnsFromShopFloor; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Issues')]")
	private static WebElement draggedJobWorkIssues; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Receipts')]")
	private static WebElement draggedJobWorkReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Quotations')]")
	private static WebElement draggedPurchasesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Quotations')]")
	private static WebElement draggedSalesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Job Order')]")
	private static WebElement draggedJobOrder; 
	
	@FindBy(xpath="//div[contains(text(),'Production Process')]")
	private static WebElement draggedProductionProcess; 
	
	@FindBy(xpath="//div[contains(text(),'Material Requisition')]")
	private static WebElement draggedMaterialRequisition ; 
	
	@FindBy(xpath="//div[contains(text(),'Request For Quote')]")
	private static WebElement draggedRequestForQuote; 
	
	@FindBy(xpath="//div[contains(text(),'Forex JV')]")
	private static WebElement draggedForexJV; 
	
	/*@FindBy(xpath="//div[contains(text(),'Purchase Voucher New')]")
	private static WebElement draggedPurchseVoucherNew; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Voucher New Two')]")
	private static WebElement draggedPurchseVoucherNewTwo; */
	
	@FindBy(xpath="//div[contains(text(),'Stock Transfer New')]")
	private static WebElement draggedStockTransferNew; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks New')]")
	private static WebElement draggedOpeningStocksNew; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoice')]")
	private static WebElement draggedAutoSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoices Two')]")
	private static WebElement draggedAutoSalesInvoicesTwo; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Order')]")
	private static WebElement draggedAutoSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Vouchers N')]")
	private static WebElement draggedPurchasesVouchersN;
	
	@FindBy(xpath="//div[contains(text(),'Sales Invoice N')]")
	private static WebElement draggedSalesInvoicesN;
	
	
	@FindBy(xpath="//div[contains(text(),'Purchases Voucher VAT')]")
	private static WebElement draggedPurchasesVoucherVat;
	
	
	
	
	
	

	// Link and Delete of Dragged Options
	
	//body[@class='custom_scrollbar']/ul[1]/li[1]
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]")
	private static WebElement draggedlinkBtn; 
	
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[2]")
	private static WebElement draggeddeleteBtn; 
	
	//li[@class='context-menu-item context-menu-visible']//span[contains(text(),'Delete')]
	
	
	//Connection Between Nodes
	
	//While Deleting or adding Link  to Nodes,the link id is also Updated to the NextLine Number.
	
	@FindBy(xpath="//*[@id='line0']")
	private static WebElement link0TO1; 
	
	@FindBy(xpath="//*[@id='line1']")
	private static WebElement link1TO2; 
	
	@FindBy(xpath="//*[@id='line2']")
	private static WebElement link2TO3; 
	
	@FindBy(xpath="//*[@id='line3']")
	private static WebElement link3TO4; 
	
	@FindBy(xpath="//*[@id='line4']")
	private static WebElement link4TO5; 
	
	@FindBy(xpath="//*[@id='line5']")
	private static WebElement link5TO6; 
	
	@FindBy(xpath="//*[@id='line6']")
	private static WebElement link6TO7; 
	
	@FindBy(xpath="//*[@id='line7']")
	private static WebElement link7TO8; 
	
	@FindBy(xpath="//*[@id='line8']")
	private static WebElement link8TO9; 
	
	
	
	//Connections  Node to Node Points Fields
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode0Left; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode1Left; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode2Left;
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode3Left; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode4Left; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode5Left;
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode6Left; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode7Left; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[1]/div/div/div[2]")
	private static WebElement linkNode8Left;
	
	
	
	
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode0Right; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode1Right; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode2Right; 
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode3Right; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode4Right; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode5Right; 
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode6Right; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode7Right; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[2]/div/div/div[2]")
	private static WebElement linkNode8Right; 
	
	
	
	
	//RightSide Fields
	
	//LinkSetting---Definition Tab   {Work Flow Setting-------------->Link Setting}
	
	@FindBy(xpath="//div[@id='settingIcon']//span[@class='iconbar']")
	private static WebElement rightSideExpandBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Definition')]")
	private static WebElement DefinitionTab; 
	
	@FindBy(xpath="//select[@id='DDLLinkValue']")
	private static WebElement DefinitionLinkValueDropdown; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[1]//li[1]//input[1]")
	private static WebElement dateChkBox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[2]//li[1]//input[1]")
	private static WebElement customerAccountChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement autosalesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement narrationChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicenarrationChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement itemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	private static WebElement materialRequiitionAndPquotationsitemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement salesOrderandInvoiceitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement purchaseOrderandPvoucheritemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement purchaseOrderandPvoucherUnitchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement purchaseVoucherAndPReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement purchaseVoucherNAndMRNitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	private static WebElement mrnAndPurchaseReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement salesInvoicenAndDeliveryNotesitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement salesInvoiceAndSalesRetutrnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement stockTransferAndSalesInvoiceNitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	private static WebElement unitsChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement salesOrderandInvoiceunitsChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	private static WebElement quantityChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicequantityChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	private static WebElement voucherQtyhkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicevoucherQtyhkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	private static WebElement reserveChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicereserveChkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	private static WebElement rateChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicerateChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	private static WebElement grossChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	private static WebElement salesOrderandInvoicegrossChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[1]//li[1]//input[1]")
	private static WebElement voucherGrossChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[2]//li[1]//input[1]")
	private static WebElement netChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[3]//li[1]//input[1]")
	private static WebElement voucherNetChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[4]//li[1]//input[1]")
	private static WebElement userChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[5]//li[1]//input[1]")
	private static WebElement roleChkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[6]//li[1]//input[1]")
	private static WebElement user1Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[7]//li[1]//input[1]")
	private static WebElement user2Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[8]//li[1]//input[1]")
	private static WebElement user3Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[9]//li[1]//input[1]")
	private static WebElement user4Chkbox; 
	
	@FindBy(xpath="//div[@id='rightsideCheckbox']//ul[10]//li[1]//input[1]")
	private static WebElement user5Chkbox; 
	


	//Link Setting -----Setting Tab

	@FindBy(xpath="//a[text()='Setting']")
	private static WebElement settingTab; 
	
	@FindBy(xpath="(//button[text()='Ok'])[3]")
	private static WebElement mapOkBtn;
	
	@FindBy(xpath="//input[@id='chkRaiseLinkDoc']")
	private static WebElement raiseLinkDocumentWhenbaseIsSavedChkbox; 
	
	@FindBy(xpath="//input[@id='idNegative']")
	private static WebElement tolerance1Txt; 
	
	@FindBy(xpath="//input[@id='idPossitive']")
	private static WebElement tolerance2Txt; 
	
	@FindBy(xpath="//select[@id='ddlTolearenceType']")
	private static WebElement tolearenceTypeDropdown; 
	
	@FindBy(xpath="//select[@id='ddlReleaseto']")
	private static WebElement relatesToDropdown; 
	
	@FindBy(xpath="//input[@id='AutoCloseTxt']")
	private static WebElement autoCloseTxt; 
	
	@FindBy(xpath="//select[@id='ddlActions']")
	private static WebElement settinglinkValueDropdown; 
	
	@FindBy(xpath="//select[@id='ddlLoadpendingDoc']")
	private static WebElement loadpendingDocumentsDropdown; 
	
	@FindBy(xpath="//select[@id='ddlBasedOnfiled']")
	private static WebElement loadFieldsDropdown; 
	
	
	
	
	
	//Link Settings-----Properties
	
	@FindBy(xpath="//a[contains(text(),'Properties')]")
	private static WebElement propertiesTab; 
	
	@FindBy(xpath="//input[@id='chkUseItemWisetolerance']")
	private static WebElement useItemWiseToleranceWhenAvailableChkBox;
	
	@FindBy(xpath="//input[@id='chkConsolidateondocument']")
	private static WebElement checkConsolidateDocWhenDisplayingInSelectionChkBox;
	
	@FindBy(xpath="//input[@id='ChkStockLink']")
	private static WebElement checkstockWhileLinkingChkbox; 
	
	@FindBy(xpath="//input[@id='chkCannotExceedBase']")
	private static WebElement cannotExceedTheBaseValueChkbox; 
	
	@FindBy(xpath="//input[@id='chkBaseDocCannotEdited']")
	private static WebElement baseDocumentCannotBeEditedAfterItIsLinkedChkbox; 
	
	@FindBy(xpath="//input[@id='chkUseLinkForLoading']")
	private static WebElement useThisLinkOnlyForLoadingChkbox; 
	
	@FindBy(xpath="//input[@id='chkLoadBaseDocDtlsAtLinking']")
	private static WebElement loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox; 
	
	@FindBy(xpath="//input[@id='chkCloseLinkAfterDueDt']")
	private static WebElement closeLinkAfterTheDueDateElapsesChkbox; 
	
	@FindBy(xpath="//input[@id='chkLinkIsMandatory']")
	private static WebElement linkIsMandatoryChkbox; 
	
	@FindBy(xpath="//input[@id='chkLinkIsOptional']")
	private static WebElement linkIsOptionalIfTheDocumentIsLinkedToAnotherbasedocumentChkbox; 
	
	@FindBy(xpath="//input[@id='chkDoNotClubCommonBase']")
	private static WebElement doNotClubWithCommonBaseChkbox; 
	
	@FindBy(xpath="//*[@id='chkBaseDocCannotEdited']")
	private static WebElement baseDocCannotEditedBaseChkbox; 
	
	@FindBy(xpath="//input[@id='chkDoNotAllowSelection']")
	private static WebElement doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox; 
	
	@FindBy(xpath="//input[@id='chkRecheckBeforeTheSavingIflink']")
	private static WebElement recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox; 
	
	@FindBy(xpath="//input[@id='chkAllowbackdatedlinking']")
	private static WebElement allowBackdatedLinkingChkbox;
	
	@FindBy(xpath="//input[@id='chkDonotupdatelinkunlessQCisdone']")
	private static WebElement doNotUpdateLinkUnlessQCIsDoneChkbox;
	
	
	
	
	//Footer Fields oF Link Settings
	
	@FindBy(xpath="//button[contains(text(),'Map')]")
	private static WebElement MapBtn; 
	
	           //Map POp  Grid items to be write.
				
				@FindBy(xpath="//h5[contains(text(),'Link Mapping')]")
				private static WebElement linkMappingLabel; 
				
				@FindBy(xpath="//div[@class='modal-footer']//button[@class='Fbutton'][contains(text(),'Ok')]")
				private static WebElement linkMappingOkBtn; 
				
				@FindBy(xpath="//button[contains(text(),'Close')]")
				private static WebElement linkMappingCloseBtn; 
	
	@FindBy(xpath="//div[@class='col-lg-12']//button[@class='Fbutton'][contains(text(),'Ok')]")
	private static WebElement OkBtn; 
	
	
	
	@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
	private static WebElement CancelBtn; 
	
	
	
	
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	 
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	
	
	@FindBy(xpath="//select[@id='ddlCompany']")
	private static WebElement companyDropDownList;
	
	@FindBy(xpath="(//li[@class='nav-item pt-md-2']/a)[2]")
	private static WebElement userNameDisplay;
	
	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	/*@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;*/
	
	@FindBy(xpath="//a[text()='  Dashboard']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private static WebElement logoutOption;
		
	@FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
	 		    
	@FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
	
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
	//DataManagement menu
	@FindBy (xpath="//*[@id='25']/span")
    private static WebElement dataMangementMenu;
	
		@FindBy (xpath="//*[@id='26']/span")
		private static WebElement backup;
			
		@FindBy (xpath="//*[@id='27']/span")
		private static WebElement restore;
		
		@FindBy (xpath="//*[@id='111']/span")
		private static WebElement reindex;
		
		@FindBy (xpath="//*[@id='115']/span")
		private static WebElement eraseAll;
		
		@FindBy (xpath="//*[@id='216']/span")
		private static WebElement lockAndUnlock;
		
	
	@FindBy (xpath="//input[@id='idEraseTransaction']")
	private static WebElement eraseTranscationsRadio;
	
	@FindBy (xpath="//span[contains(text(),'Ok')]")
	private static WebElement eraseAllOkBtn;
	
	@FindBy (xpath="//ul[@class='nav navbar-nav navbar-right']//i[@class='icon-font6 icon-close']")
	private static WebElement eraseAllCancelBtn;
		
		
	@FindBy (xpath="//button[@class='btn Fbutton']")
	private static WebElement folderpathExpandBtn;
	
	@FindBy (xpath="//div[@id='RestoreControls']//div[1]//div[1]")
	private static WebElement restoreCompanyBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Yes')]")
	private static WebElement overRideYesBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'No')]")
	private static WebElement overRideNoBtn;
	
	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
	private static WebElement overRideCancelBtn;
		
	
	@FindBy(xpath="//label[@id='lblitem']")
	private static WebElement batchItemName;
	
	@FindBy(xpath="//label[@id='lblTotalQty']")
	private static WebElement batchTotalQtyAmt;
	
	@FindBy(xpath="//label[@id='lblAdjustQty']")
	private static WebElement batchAdjustQtyAmt;
	
	
	@FindBy(xpath="//label[@id='lblBalnceQty']")
	private static WebElement batchBalanceAmt;
	
	@FindBy(xpath="//div[contains(@class,'col-xs-12 col-sm-12 col-md-12 col-lg-12 P_ingBottom')]//div[2]//input[1]")
	private static WebElement batchExipiringInRadioBtn;
	             
	@FindBy(xpath="//section[@id='page_Content']//div[@class='row']//div//div[3]//input[1]")
	private static WebElement batchExipiringAfetrRadioBtn;
	
	@FindBy(xpath="//input[@id='txtWithin']")
	private static WebElement batchWithInTxt;
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_control_heading_6']")
	private static WebElement batchTableHeaderRateColumn;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-1']")
	private static WebElement batchTable1stRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-2']")
	private static WebElement batchTable1stRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-5']")
	private static WebElement batchTable1stRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-6']")
	private static WebElement batchTable1stRow4thCol;
	               
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-8']")
	private static WebElement batchTable1stRow5thCol;
	
	@FindBy(xpath="//input[@id='MRPBatch_AdjBatchQty']")
	private static WebElement enter_BatchTableQtyAdjusted;
	
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_1-13']")
	private static WebElement batchTable1stRow6thCol;
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_2-1']")
	private static WebElement batchTable2ndRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-2']")
	private static WebElement batchTable2ndRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-5']")
	private static WebElement batchTable2ndRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-6']")
	private static WebElement batchTable2ndRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-7']")
	private static WebElement batchTable2ndRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_2-13']")
	private static WebElement batchTable2ndRow6thCol;
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_3-1']")
	private static WebElement batchTable3rdRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-2']")
	private static WebElement batchTable3rdRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-5']")
	private static WebElement batchTable3rdRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-6']")
	private static WebElement batchTable3rdRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-7']")
	private static WebElement batchTable3rdRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_3-13']")
	private static WebElement batchTable3rdRow6thCol;
	
	
	
	@FindBy(xpath="//*[@id='Id_MRPBatch_Grid_col_4-1']")
	private static WebElement batchTable4thRow1stCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-2']")
	private static WebElement batchTable4thRow2ndCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-5']")
	private static WebElement batchTable4thRow3rdCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-6']")
	private static WebElement batchTable4thRow4thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-7']")
	private static WebElement batchTable4thRow5thCol;
	
	@FindBy(xpath="//td[@id='Id_MRPBatch_Grid_col_4-13']")
	private static WebElement batchTable4thRow6thCol;
	
	@FindBy(xpath="//*[@id='MRPBatch_AdjBatchQty']")
	private static WebElement batchTableEnterQtyAdjusted;
	
	
	/*@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']/tr")
	private static List<WebElement> batchPopupTable;*/
	
	@FindBy(xpath="//tbody[@id='Id_MRPBatch_Grid_body']")
	private static WebElement batchPopupTable;
	
	@FindBy(xpath="//i[@class='icon-refresh icon-font7']")
	private static WebElement batchRefreshBtn;
	
	@FindBy(xpath="//input[@id='Batch_Search']")
	private static WebElement batchSearchTxt;
	
	@FindBy(xpath="//input[@class='Fcheckbox']")
	private static WebElement batchShowAllAvalibleBatches;
	
	@FindBy(xpath="//label[contains(text(),'Customization')]")
	private static WebElement batchCustomizationIcon;
	
	/*@FindBy(xpath="//label[contains(text(),'Pick On FIFO')]")
	private static WebElement batchPickOnFIFOIcon;*/
	
	@FindBy(xpath="//div[@class='btnhighlight theme_button_color P_LeftRight10'][2]")
	private static WebElement batchPickOnFIFOIcon;
	
	@FindBy(xpath="//label[@id='div_Ok']")
	private static WebElement batchOkIcon;

	@FindBy(xpath="//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']//div[6]//label[1]")
	private static WebElement batchTotalAdjustedQty;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[3]/div/div[3]/div[4]/label")
	private static WebElement batchCancelIcon;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[1]/div[2]/span/i")
	private static WebElement batchCloseIcon;
	
	@FindBy(xpath="//*[@id='MBatch_Content']/div[2]/div/div[5]/div/div[3]")
	private static WebElement batchTotalQuantity;
	
	
		
	@FindBy (xpath="//div[@id='BackUpControls']/ul/li/div[1]")
	private static WebElement backupBtn;
	
	
	@FindBy(xpath="//span[@class='col-xs-10'][contains(text(),'Purchases Voucher VAT')]")
	private static WebElement purchasesVoucherVAT;
	
	
	@FindBy(xpath="//span[text()='Purchases Orders (1)']")
	private static WebElement purchasesOrder;
	
	@FindBy(xpath="//*[@id='chkLinks']")
	private static WebElement keepUnpostedLinksChkBox;
	
	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	private static WebElement undoAuthorizationEditingDropdown;	
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-1']")
	private static WebElement userrow1;
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_2-1']")
	private static WebElement userrow2;
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	private static WebElement userDropdown;
	
	@FindBy(xpath="//select[@id='ddlUserSelection']")
	private static WebElement userSelectionDropdown;
	
	@FindBy(xpath="//i[@class='icon-alerts-1 icon-font5']")
	private static WebElement  alertsbtn;
	
	@FindBy(xpath="(//a[@id='1'])[1]")
	private static WebElement  alertsTransactions;
	
	@FindBy(xpath="//a[@id='770']")
	private static WebElement  alertsTransactions1;
	
	@FindBy(xpath="//*[@id='masterChild_770']")
	private static WebElement  alertstempTransactionAuthField;
	
	@FindBy(xpath="//div[@id='id_transactionentry_authorize']")
	private static WebElement  new_AuthorizeBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_authorization_remark_popup_ok']")
	private static WebElement  authorizePopupOkBtnEntryPage;
	
	
	
	@FindBy(xpath = "//a[@id='200']/span")
	private static WebElement InventoryReportsMenu;
	
	@FindBy(xpath = "//a[@id='551']/span")
	private static WebElement InventoryStockLedgerMenu;
	
	@FindBy(xpath = "//*[@id='selectAllMasters_']")
	private static WebElement selectAllItemsCheckBox;
	
	@FindBy(xpath="(//tr[@id='trRender_0'])[1]/td")
	private static List<WebElement> reportsRow1List;
  	
  	@FindBy(xpath="(//tr[@id='trRender_1'])[1]/td")
	private static List<WebElement> reportsRow2List;
	
	@FindBy(xpath="(//tr[@id='trRender_2'])[1]/td")
	private static List<WebElement> reportsRow3List;
	
	@FindBy(xpath="(//tr[@id='trRender_3'])[1]/td")
	private static List<WebElement> reportsRow4List;
	
	@FindBy(xpath="(//tr[@id='trRender_4'])[1]/td")
	private static List<WebElement> reportsRow5List;
	
	@FindBy(xpath="(//tr[@id='trRender_5'])[1]/td")
	private static List<WebElement> reportsRow6List;
	
	@FindBy(xpath="(//tr[@id='trRender_6'])[1]/td")
	private static List<WebElement> reportsRow7List;
	
	@FindBy(xpath="(//tr[@id='trRender_7'])[1]/td")
	private static List<WebElement> reportsRow8List;
	
	@FindBy(xpath="(//tr[@id='trRender_8'])[1]/td")
	private static List<WebElement> reportsRow9List;
	
	@FindBy(xpath="(//tr[@id='trRender_9'])[1]/td")
	private static List<WebElement> reportsRow10List;
	
	@FindBy(xpath="(//tr[@id='trRender_10'])[1]/td")
	private static List<WebElement> reportsRow11List;
	
	@FindBy(xpath="(//tr[@id='trRender_11'])[1]/td")
	private static List<WebElement> reportsRow12List;	
	
	@FindBy(xpath="(//tr[@id='trRender_12'])[1]/td")
	private static List<WebElement> reportsRow13List;
	
	@FindBy(xpath="(//tr[@id='trRender_13'])[1]/td")
	private static List<WebElement> reportsRow14List;
	
	@FindBy(xpath="(//tr[@id='trRender_14'])[1]/td")
	private static List<WebElement> reportsRow15List;
	
	@FindBy(xpath="(//tr[@id='trRender_15'])[1]/td")
	private static List<WebElement> reportsRow16List;
	
	@FindBy(xpath="(//tr[@id='trRender_16'])[1]/td")
	private static List<WebElement> reportsRow17List;
	
	@FindBy(xpath="(//tr[@id='trRender_17'])[1]/td")
	private static List<WebElement> reportsRow18List;	
	
	
	@FindBy(xpath="//select[@id='id_transactionentry_workflow_popup_searchon']")
	private static WebElement  searchOnDropdown;
	
	@FindBy(xpath="//select[@id='id_transactionentry_workflow_popup_searchtype']")
	private static WebElement  containingDropdown;
		
	@FindBy(xpath="//input[@id='id_transactionentry_workflow_popup_search']")
	private static WebElement  workFlowSearchTxt;
	
	@FindBy(xpath="//i[@id='id_transactionentry_workflow_popup_close']")
	private static WebElement  workFlowCloseBtn;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']//div[@class='toolbar_button_text font-7'][contains(text(),'Customize')]")
	private static WebElement  workFlowCustomizeBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_ok']")
	private static WebElement  workFlowOkBtn;
	
	//span[@class='icon-ok icon-font7']
	
	//*[@id='id_transactionentry_workflow_popup_ok']
	
	@FindBy(xpath="//*[@id='id_transactionentry_workflow_ok']")
	private static WebElement  workFlowOkBtn1;
	
	@FindBy(xpath="//div[@class='toolbar_button_text font-7'][contains(text(),'Ok')]")
	private static WebElement  workFlowOkBtnInSalesVoucher;
	
	
	@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
	private static WebElement  workFlowMinimizeBtn;
	
	
	
	//WorkFlow Screen with Line wise
	
	               
	
	@FindBy(xpath="//input[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
	private static WebElement  workFlowHeaderChkBox;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_6']//div[contains(text(),'Voucher No')]")
	private static WebElement  workFlowHeaderVoucherNo;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_7']//div[contains(text(),'Date')]")
	private static WebElement  workFlowHeaderDate;
	
	@FindBy(xpath="//div[contains(text(),'Name')]")
	private static WebElement  workFlowHeaderName;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_popup_control_heading_9']//div[contains(text(),'Quantity')]")
	private static WebElement  workFlowHeaderQty;
	
	@FindBy(xpath="//div[contains(text(),'Suspended')]")
	private static WebElement  workFlowHeaderSuspend;
	
	
	//WorkFlow with Line wise
	// 1 Row
	
	@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[2]/input")
	private static WebElement workFlowRadioBtnRowOne;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-6']")
	private static WebElement  workFlowRow1Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-7']")
	private static WebElement  workFlowRow1Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-8']")
	private static WebElement  workFlowRow1Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-9']")
	private static WebElement  workFlowRow1Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_1-10']")
	private static WebElement  workFlowRow1Column5;
	
	// 2 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-1']//input")
	private static WebElement workFlowRadioBtnRowTwo;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-6']")
	private static WebElement  workFlowRow2Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-7']")
	private static WebElement  workFlowRow2Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-8']")
	private static WebElement  workFlowRow2Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-9']")
	private static WebElement  workFlowRow2Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_2-10']")
	private static WebElement  workFlowRow2Column5;
	
	
	
	
	// 3 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-1']//input")
	private static WebElement workFlowRadioBtnRowThree;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-6']")
	private static WebElement  workFlowRow3Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-7']")
	private static WebElement  workFlowRow3Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-8']")
	private static WebElement  workFlowRow3Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-9']")
	private static WebElement  workFlowRow3Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_3-10']")
	private static WebElement  workFlowRow3Column5;
	
	
	// 4 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_4-1']//input")
	private static WebElement workFlowRadioBtnRowFour;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-6']")
	private static WebElement  workFlowRow4Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-7']")
	private static WebElement  workFlowRow4Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-8']")
	private static WebElement  workFlowRow4Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-9']")
	private static WebElement  workFlowRow4Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_4-10']")
	private static WebElement  workFlowRow4Column5;	
	
	
	
     // 5 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_5-1']//input")
	private static WebElement workFlowRadioBtnRowFive;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-6']")
	private static WebElement  workFlowRow5Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-7']")
	private static WebElement  workFlowRow5Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-8']")
	private static WebElement  workFlowRow5Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-9']")
	private static WebElement  workFlowRow5Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_5-10']")
	private static WebElement  workFlowRow5Column5;	
	
	
	
    // 6 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_6-1']//input")
	private static WebElement workFlowRadioBtnRowSix;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-6']")
	private static WebElement  workFlowRow6Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-7']")
	private static WebElement  workFlowRow6Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-8']")
	private static WebElement  workFlowRow6Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-9']")
	private static WebElement  workFlowRow6Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_6-10']")
	private static WebElement  workFlowRow6Column5;	
	

    // 7 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_7-1']//input")
	private static WebElement workFlowRadioBtnRowSeven;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-6']")
	private static WebElement  workFlowRow7Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-7']")
	private static WebElement  workFlowRow7Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-8']")
	private static WebElement  workFlowRow7Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-9']")
	private static WebElement  workFlowRow7Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_7-10']")
	private static WebElement  workFlowRow7Column5;	
	
	

    // 8 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_8-1']//input")
	private static WebElement workFlowRadioBtnRowEight;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-6']")
	private static WebElement  workFlowRow8Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-7']")
	private static WebElement  workFlowRow8Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-8']")
	private static WebElement  workFlowRow8Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-9']")
	private static WebElement  workFlowRow8Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_8-10']")
	private static WebElement  workFlowRow8Column5;	
	
	

    // 9 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_9-1']//input")
	private static WebElement workFlowRadioBtnRowNine;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-6']")
	private static WebElement  workFlowRow9Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-7']")
	private static WebElement  workFlowRow9Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-8']")
	private static WebElement  workFlowRow9Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-9']")
	private static WebElement  workFlowRow9Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_9-10']")
	private static WebElement  workFlowRow9Column5;	
	
	

    // 10 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_10-1']//input")
	private static WebElement workFlowRadioBtnRowTen;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-6']")
	private static WebElement  workFlowRow10Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-7']")
	private static WebElement  workFlowRow10Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-8']")
	private static WebElement  workFlowRow10Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-9']")
	private static WebElement  workFlowRow10Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_10-10']")
	private static WebElement  workFlowRow10Column5;	
	
	

    // 11 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_11-1']//input")
	private static WebElement workFlowRadioBtnRowElevan;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-6']")
	private static WebElement  workFlowRow11Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-7']")
	private static WebElement  workFlowRow11Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-8']")
	private static WebElement  workFlowRow11Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-9']")
	private static WebElement  workFlowRow11Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_11-10']")
	private static WebElement  workFlowRow11Column5;	
	
	

    // 12 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_12-1']//input")
	private static WebElement workFlowRadioBtnRowTwevle;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-6']")
	private static WebElement  workFlowRow12Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-7']")
	private static WebElement  workFlowRow12Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-8']")
	private static WebElement  workFlowRow12Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-9']")
	private static WebElement  workFlowRow12Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-10']")
	private static WebElement  workFlowRow12Column5;	
	

    // 13 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_13-1']//input")
	private static WebElement workFlowRadioBtnRowThirteen;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-6']")
	private static WebElement  workFlowRow13Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-7']")
	private static WebElement  workFlowRow13Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-8']")
	private static WebElement  workFlowRow13Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_13-9']")
	private static WebElement  workFlowRow13Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_12-10']")
	private static WebElement  workFlowRow13Column5;	
	
	

    // 14 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_14-1']//input")
	private static WebElement workFlowRadioBtnRowFourteen;

	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-6']")
	private static WebElement  workFlowRow14Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-7']")
	private static WebElement  workFlowRow14Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-8']")
	private static WebElement  workFlowRow14Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-9']")
	private static WebElement  workFlowRow14Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_14-10']")
	private static WebElement  workFlowRow14Column5;	
	
	

    // 15 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_15-1']//input")
	private static WebElement workFlowRadioBtnRowFifteen;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-6']")
	private static WebElement  workFlowRow15Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-7']")
	private static WebElement  workFlowRow15Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-8']")
	private static WebElement  workFlowRow15Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-9']")
	private static WebElement  workFlowRow15Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_15-10']")
	private static WebElement  workFlowRow15Column5;	
	
	

	

    // 16 Row
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_16-1']//input")
	private static WebElement workFlowRadioBtnRowSixteen;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-6']")
	private static WebElement  workFlowRow16Column1;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-7']")
	private static WebElement  workFlowRow16Column2;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-8']")
	private static WebElement  workFlowRow16Column3;
			
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-9']")
	private static WebElement  workFlowRow16Column4;
	
	@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_popup_col_16-10']")
	private static WebElement  workFlowRow16Column5;	
	
	
	@FindBy(xpath="//input[@id='id_header_67108924']")
	private static WebElement  purchaseVoucherNewNarration;

	@FindBy(xpath="//input[@id='id_header_67108931']")
	private static WebElement  purchaseVoucherNewTest;
	
	@FindBy(xpath="//input[@id='id_header_10']")
	private static WebElement  voucherHeaderCurrency;

	@FindBy(xpath="//input[@id='id_header_145']")
	private static WebElement  voucherHeaderLocalExchangeRate;	
	
	@FindBy(xpath="//input[@id='id_header_11']")
	private static WebElement  voucherHeaderExchangeRate;
	
	
	/*@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  grid_ChkBox1;*/
	
	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  grid_ChkBox2;
	
	@FindBy(xpath="//span[@class='icon-convert icon-font6']")
	private static WebElement  convertBtn;
	
	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;
	
	@FindBy(xpath="//input[@id='id_header_268435459']")
	private static WebElement  departmentTxt;
	
	@FindBy(xpath="//input[@id='id_body_16777323']")
	private static WebElement  tax_Code;
	
	
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxt;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr/td")
	private static List<WebElement> voucherGridBodyList;
	

    @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_26']")
	private static WebElement  QtyAmount;
	
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_28']")
	private static WebElement  GrossAmount;
	
	@FindBy(xpath="//span[@class='col-xs-6 icon-expand icon-font6 no_padding_left_right theme_color-inverse']")
	private static WebElement  new_footerExpandBtn;
	
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  netLabel;
	
	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement  netAmount;
	
	@FindBy(xpath="//div[@id='id_transactionentry_summary']//div[2]//div[2]")
	private static WebElement PVNFooterAvgRateO;
	
	@FindBy(xpath="//tbody[@id='mapWorkflow_GrdId_body']/tr/td[2]")
	private static List<WebElement> baseFieldList;
	
	@FindBy(xpath="//select[@id='mapWorkflow_GrdId_control_heading_ctrl_1']")
	private static WebElement baseFieldDropDown;
	
	@FindBy(xpath="//select[@id='mapWorkflow_GrdId_control_heading_ctrl_2']")
	private static WebElement linkFieldDropDown;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[1]/td[2]")
	private static WebElement baseFieldRow1;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[2]/td[2]")
	private static WebElement baseFieldRow2;

	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	private static WebElement  select5thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	private static WebElement  select5thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	private static WebElement  select1stRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	private static WebElement  select1stRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
	private static WebElement  select1stRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
	private static WebElement  select1stRow_20thColumn;
	
	
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement  select2ndRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement  select2ndRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement  select2ndRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement  select2ndRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement  select2ndRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement  select2ndRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement  select2ndRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement  select2ndRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	private static WebElement  select4thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement  select2ndRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement  select2ndRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement  select2ndRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement  select2ndRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
	private static WebElement  select2ndRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
	private static WebElement  select2ndRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
	private static WebElement  select2ndRow_19thColumn;

	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement  select4thRow_1stColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement  select3rdRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement  select3rdRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement  select3rdRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement  select3rdRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement  select3rdRow_5thColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement  select4thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement  select3rdRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement  select3rdRow_7thColumn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement  select4thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement  select3rdRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement  select3rdRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement  select3rdRow_10thColumn;

    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement  select3rdRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement  select3rdRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement  select3rdRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement  select3rdRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement  select3rdRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement  select3rdRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
	private static WebElement  select3rdRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
	private static WebElement  select3rdRow_18thColumn;

	
	
	/*@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; */
	
	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	private static WebElement  inventoryTransactionsMenu; 
	
	@FindBy(xpath="//*[@id='139']/span")
	private static WebElement  inventoryTransactionsPurchasesMenu; 

	@FindBy(xpath="//*[@id='2010']/span")
	private static WebElement  requestForQuoteVoucher;
	
	@FindBy(xpath="//*[@id='2011']/span")
	private static WebElement  purchasesQuotationsVoucher;
		
	@FindBy(xpath="//*[@id='2012']/span")
	private static WebElement  purchasesOrdersVoucher;

	@FindBy(xpath="//*[@id='2013']/span")
	private static WebElement  materialReceiptNotesVoucher;
	
	@FindBy(xpath="//*[@id='140']/span")
	private static WebElement  inventoyTransactionsSalesMenu; 
		
		@FindBy(xpath="//*[@id='2018']/span")
		private static WebElement  salesQuotationsVoucher;
		
		@FindBy(xpath="//*[@id='2019']/span")
		private static WebElement  deliveryNotesVoucher;
		
		@FindBy(xpath="//*[@id='2022']/span")
		private static WebElement  posSalesVoucher;
		
		@FindBy(xpath="//*[@id='2045']/span")
		private static WebElement  productionOrdersVoucher;
		
		@FindBy(xpath="//*[@id='2017']/span")
		private static WebElement  salesOrdersVoucher;
					
	
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  vendorAccountTxt;
	
	@FindBy(xpath="//*[@id='id_transaction_homescreen_new']")
	private static WebElement  voucherNewBtn;
	
	@FindBy(xpath="//*[@id='Deleteayout']")
	private static WebElement  workflowDeleteLayout;
	
	
	
	@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement> vendorAccountListCount; 
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWareHouseTxt;
	
	@FindBy(xpath="//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	private static List<WebElement> pvwareHouseListCount;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
    private static List<WebElement> itemListCount;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']")
	private static WebElement  vouchersaveBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_delete']")
	private static WebElement  voucherNewDeleteBtn;
	
	@FindBy(xpath="//input[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;
	
	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;
	
	@FindBy(xpath="//input[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_33554437']")
	private static WebElement  enter_Discount;
	
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	@FindBy(xpath="//span[@class='icon-rightarrow-1 icon-font6']")
	private static WebElement  rearrangeFormula;
	
	@FindBy(xpath="//*[@id='id_customize_rearrangeformula_grid_body']//td[4]")
	private static WebElement  newFormula;
	
	@FindBy(xpath="//*[@id='id_customize_rearrangeformula_grid_control_heading_ctrl_3']")
	private static WebElement  newFormula1;
	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[1]/td")
	private static List<WebElement> workFlowRow1List;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr")
	private static List<WebElement> workFlowRowCountList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td")
	private static List<WebElement> workFlowRow2List;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[3]/td")
	private static List<WebElement> workFlowRow3List;
	
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div")
	private static WebElement  reindexingPopup;
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div/div[3]/button")
	private static WebElement  reindexingPopupCancelBtn;
	
	@FindBy(xpath="//div[@id='ReIndexingError_Modal']/div/div/div[3]/input")
	private static WebElement  reindexingPopupSaveLogBtn;
	
	// Order ManageMent Reports.
	
	
		@FindBy(xpath="//span[contains(text(),'Order Management')]")
		private static WebElement  orderManagementMenu; 

		@FindBy(xpath="//*[@id='600']/span")
		private static WebElement  analysisOfLinkedORUnlinkedDocumentsMenu;
					
		@FindBy(xpath="//*[@id='601']/span")
		private static WebElement  listingOfDocuments;
		
		@FindBy(xpath="//span[contains(text(),'Listing of Documents by Due Date')]")
		private static WebElement  listingOfDocumentsByDueDate;
		
		@FindBy(xpath="//a[@id='603']//span[contains(text(),'Ageing of Pending Documents')]")
		private static WebElement  ageingOfPendingDocuments;
		
		@FindBy(xpath="//span[contains(text(),'Ageing of Pending Documents by Due Date')]")
		private static WebElement  ageingOfPendingDocumentsByDueDate;
		
		@FindBy(xpath="//span[contains(text(),'Link chain analysis')]")
		private static WebElement  linkChainAnalysis;
		
		@FindBy(xpath="//span[contains(text(),'Pending voucher report')]")
		private static WebElement  pendingVoucherReports;
		
		@FindBy(xpath="//span[contains(text(),'Pending Link Status')]")
		private static WebElement  pendingLinkStatus;	

		@FindBy(xpath="//input[@id='RITTable__1']")
		private static WebElement listingOfDocWorkFlowTxt;
		
		/*@FindBy(xpath="//select[@id='DateOptions_']")
		private static WebElement sl_DateOptionDropdown;*/
		
		/*@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
		private static WebElement sl_OkBtn;*/
		
		
		@FindBy(xpath="//tr[@id='trRender_0']/td")
		private static List<WebElement> reportRow1;
		
		@FindBy(xpath="//tr[@id='trRender_1']/td")
		private static List<WebElement> reportRow2;
		
		@FindBy(xpath="//tr[@id='trRender_2']/td")
		private static List<WebElement> reportRow3;
		
		@FindBy(xpath="//tr[@id='trRender_3']/td")
		private static List<WebElement> reportRow4;
		
		@FindBy(xpath="//tr[@id='trRender_4']/td")
		private static List<WebElement> reportRow5;
		
		@FindBy(xpath="//tr[@id='trRender_5']/td")
		private static List<WebElement> reportRow6;
		
		@FindBy(xpath="//tr[@id='trRender_6']/td")
		private static List<WebElement> reportRow7;
		
		@FindBy(xpath="//tr[@id='trRender_7']/td")
		private static List<WebElement> reportRow8;
		
		@FindBy(xpath="//tr[@id='trRender_8']/td")
		private static List<WebElement> reportRow9;
		
		@FindBy(xpath="//tr[@id='trRender_9']/td")
		private static List<WebElement> reportRow10;
		
		@FindBy(xpath="//tr[@id='trRender_10']/td")
		private static List<WebElement> reportRow11;
		
		@FindBy(xpath="//tr[@id='trRender_11']/td")
		private static List<WebElement> reportRow12;
		
		@FindBy(xpath="//tr[@id='trRender_12']/td")
		private static List<WebElement> reportRow13;
		
		@FindBy(xpath="//*[@id='id_starting_date_']")
		private static WebElement  reportsStartsDate;
		
		@FindBy(xpath="//*[@id='id_ending_date_']")
		private static WebElement  reportsendDate;
		
		@FindBy(xpath="//input[@id='RITCheckbox__5']/following-sibling::span")
	private static WebElement  listOfDocReportLinkedCheckBox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__5']")
	private static WebElement  listOfDocReportLinkedCheckBoxisSelected;
	
	@FindBy(xpath="//*[@id='RITCheckbox__2']/following-sibling::span")
	private static WebElement  listOfDocReporPendingCheckBox;
	
	@FindBy(xpath="//*[@id='RITCheckbox__2']")
	private static WebElement  listOfDocReporPendingCheckBoxisSelected;
	
	
	
	@FindBy(xpath="//select[@id='RITCombobox__4']")
	private static WebElement  linkStatusDropdown;
	
	@FindBy(xpath="(//li[text()='Filter'])[2]")
	private static WebElement  entryPageFiterOption;
	
	@FindBy(xpath="(//li[text()='Filter'])[1]")
	private static WebElement  homePageFiterOption;
	
	
	
	@FindBy(xpath="(//i[@class='icon-filter hiconright2'])[1]")
	private static WebElement  HomePageFiterBtn;
	
	@FindBy(xpath="(//i[@class='icon-filter hiconright2'])[2]")
	private static WebElement  enteryPageFiterBtn;
	
	@FindBy(xpath="//*[@id='601_0_DefaultFilter_0']")
	private static WebElement  filterPopUpDocTxt;
	
	@FindBy(xpath="//*[@id='filter_Okbtn_']")
	private static WebElement  filterPopUpOkBtn;
	
	@FindBy(xpath="//*[@id='624_0_DefaultFilter_1']")
	private static WebElement  filterPopUpDocTxt2;
	
	@FindBy(xpath="//*[@id='idFilterCustomizeIcon']")
	private static WebElement  filterPopUuCustomaizeBtn;
	
	@FindBy(xpath="(//label[contains(text(),' DocNo')])[1]//..//input")
	private static WebElement  filterPopUpDocNoCheckBox;
	
	@FindBy(xpath="(//button[text()='Ok'])[2]")
	private static WebElement  customizationPoupOkBtn;
	
	@FindBy(xpath="//*[@id='602_0_DefaultFilter_0']")
	private static WebElement  filterPopUpDocTxt1;
	
	@FindBy(xpath = "//i[@class='icon-sort-1 hiconright2']")
	private static WebElement sortingOptionBtn;
	
	@FindBy(xpath = "//li[text()='Descending']")
	private static WebElement sortingOptionDescending;
	
	@FindBy(xpath = "//*[@id='tblHeaderReportRender']/th[3]")
	private static WebElement dueDateColumn;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private static WebElement  reportsNextBtn; 
	
	@FindBy(xpath="//*[@id='RITCombobox__2']")
	private static WebElement  startingWorkflowDropdown;
	
	
	@FindBy(xpath="//*[@id='ocLink']")
	private static WebElement  linkdropdown; 
	
	@FindBy(xpath="//*[@id='btnFilter']")
	private static WebElement  pendingLinkstatusFilterBtn; 
	
	@FindBy(xpath="//*[@id='215_1_DefaultFilter_0_Start']")
	private static WebElement  pendingLinkstatusFilterPopUpFromDocNotxt; 
	
	@FindBy(xpath="//*[@id='btnSetFilterVal']")
	private static WebElement  pendingLinkstatusFilterPopUpOkBtn;
	
	
	@FindBy(xpath="//*[@id='tPendingbody']/tr[1]/td")
	private static List<WebElement> pendingLinkStatusReportRow1;
	
	@FindBy(xpath="//*[@id='tPendingbody']/tr[2]/td")
	private static List<WebElement> pendingLinkStatusReportRow2;
	
	@FindBy(xpath="(//i[@class='icon-close hiconright2'])[1]")
	private static WebElement pendingLinkStatusCancelBtn;
	
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;
	
		
		
	
	
	
	
	
	
	public static void checkUserFriendlyMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
	                String actErrorMessage=errorMessage.getText();
	                
	                try
	                {
	                
		                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		                errorMessageCloseBtn.click();
		                
		                System.out.println("ValidationMessage  :  "+actErrorMessage);
		                
	                }
	                catch(Exception ee)
	                {
	                	
	                	System.out.println("ValidationMessage  :  "+actErrorMessage);
	                	
	                }
	               
	                
	               
	        }
	        catch(Exception e)
	        {
	                System.err.println("Error Message NOT Found or NOT Clickable");
	                System.err.println(e.getMessage());
	                
	                String Exception=e.getMessage();
	            
	        }
	}
	
	public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage="Voucher saved successfully";
			String expErrorMessage1=": "+docno;
			
			System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);
			
			if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
			{
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
					
					return  true;
				}
				catch(Exception ee)
				{
					return true;
				}
				
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}
	
	 public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
			
	 
	 
	 
	 

		public boolean checkRestoreOfCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
			restore.click();
			
			Thread.sleep(2500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
			folderpathExpandBtn.click();
			
			Thread.sleep(3000);
		     
		     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
		     
		     Thread.sleep(4000);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
		     restoreCompanyBtn.click();
		     
		     try
		     {
		    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
		 		 overRideYesBtn.click();
		 		 
		 		 Thread.sleep(140000);
		 		
		     }
		     catch(Exception e)
		     {
		    	 System.err.println("NO OLDER COMPANY EXISTS");
		     }
		     //System.out.println("restore Loading Backup");
		     //Thread.sleep(3000);
		     
		     	System.out.println("alert not open");
				getWaitForAlert();
				getAlert().accept();
				
				System.out.println("alert Handled");
		     
		     /*if(getIsAlertPresent())
		     {
		    	 getWaitForAlert();
		    	 System.out.println("restore Loading dsdsadadads");
		    	 getAlert().accept();
		     }*/
			
		     Thread.sleep(6000);
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     
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
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static boolean checkRestoreOfCompany1()
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

			Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\optionsCompanyRestore1.exe");

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

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(3000);

			lp.enterUserName(unamelt);

			lp.enterPassword(pawslt);

			Thread.sleep(2000);
			
					
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
			String expLoginCompanyName1 = "Transaction Authorization";

			System.out.println("UserInfo1             : " + actUserInfo1 + " Value Expected : " + expUserInfo1);
			System.out.println(
					"LoginCompanyName1     : " + getLoginCompanyName1 + " Value Expected : " + expLoginCompanyName1);

			if (actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1)) {
				return true;
			} else {
				return false;
			}
		}
		
		
		
		public static boolean checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		    // prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
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
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static boolean checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		    // prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
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
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkLogoutAndLoginWithSU3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		    // prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
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
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static boolean checkLogoutAndLoginWithoutPronghorn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    //checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		 try
		 {
			 if(getAlert().getText().isEmpty()==false)	
		     {
				 System.err.println("errorMessage is Displyed");
		    	 getAlert().accept();
		     }
           } 
		catch (Exception e) {
			
			System.err.println("errorMessage is Not Displyed");
			
		}
		    
		     
		     Thread.sleep(5000);
		     
		     //prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(2000);
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		public boolean checkEraseAllTransactionsLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
		{
			LoginPage lp=new LoginPage(getDriver()); 
			
		    String unamelt="su";
		  
		    String pawslt="su";
			
		    checkEraseAllTransactions();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		     userNameDisplay.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		     logoutOption.click();
		     
		     Thread.sleep(3000);
		     
		     //prongHornOn();
		     
		     //Thread.sleep(2500);
		     
		     lp.enterUserName(unamelt);
		     
		     lp.enterPassword(pawslt);
		     
		     Thread.sleep(1500);
		     
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
		     
		     lp.clickOnSignInBtn();
		     
		     Thread.sleep(7000);
		     
		     
		     String actUserInfo1=userNameDisplay.getText();
				
			System.out.println("User Info  : "+actUserInfo1);
			
			System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
			
			//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			//companyLogo.click();
			
			String getCompanyTxt1=companyName.getText();
			String getLoginCompanyName1=getCompanyTxt1.substring(0, 25);
			System.out.println("company name  :  "+ getLoginCompanyName1);
			//companyLogo.click();
			
			String expUserInfo1           ="SU";
			String expLoginCompanyName1   ="Transaction Authorization";
		     
			System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
			System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
			
			if(actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
	
		
		public boolean checkEraseAllTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
			
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
	

	public boolean checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		LoginPage lp=new LoginPage(getDriver()); 
		
	    String unamelt="su";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	  
		Thread.sleep(5000);
		
		String actUserInfo=userNameDisplay.getText();
		
		System.out.println("User Info  : "+actUserInfo);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name  :  "+ getLoginCompanyName);
		//companyLogo.click();
		
		
		
		String expUserInfo           ="SU";
		String expLoginCompanyName   ="Automation";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
		restore.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(folderpathExpandBtn));
		folderpathExpandBtn.click();
		
		Thread.sleep(3000);
	     
	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\optionsCompanyRestore.exe");
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtn));
	     restoreCompanyBtn.click();
	     
	     try
	     {
	    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(overRideYesBtn));
	 		 overRideYesBtn.click();
	 		 Thread.sleep(25000);
	     }
	     catch(Exception e)
	     {
	    	 System.err.println("NO OLDER COMPANY EXISTS");
	     }
	     
	     if(getIsAlertPresent())
	     {
	    	 getWaitForAlert();
	    	 
	    	 getAlert().accept();
	     }
		
	
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	     userNameDisplay.click();
		
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	     logoutOption.click();
	     
	     

	     Thread.sleep(3000);
	     
	     lp.enterUserName(unamelt);
	     
	     lp.enterPassword(pawslt);
	     
	     Thread.sleep(2000);
	     
	     Select s = new Select(companyDropDownList);
	     int size=s.getOptions().size();
	     
	     System.err.println("SIZE : "+size);
	     
	     for(int i=0;i<size;i++)
	     {
	    	 String data;
	    	 
	    	 data=s.getOptions().get(i).getText();
	    	 
	    	 System.err.println("DATA : "+data);
	    	 
	    	 if(data.contains("Automation Options"))
	    	 {
	    		 
	    		 s.selectByVisibleText(data);
	    		 
	    		 break;
	    	 }
	     }
	     
	     
	     
	     lp.clickOnSignInBtn();
	     
	     Thread.sleep(5000);
	     
	     
	     String actUserInfo1=userNameDisplay.getText();
			
		System.out.println("User Info  : "+actUserInfo1);
		
		System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
		
		//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		//companyLogo.click();
		
		String getCompanyTxt1=companyName.getText();
		String getLoginCompanyName1=getCompanyTxt1.substring(0, 19);
		System.out.println("company name  :  "+ getLoginCompanyName1);
		//companyLogo.click();
		
		
		
		String expUserInfo1           ="SU";
		String expLoginCompanyName1   ="Automation Options ";
	     
	     
		System.out.println("UserInfo             : "+actUserInfo            +" Value Expected : "+expUserInfo);
		System.out.println("LoginCompanyName     : "+getLoginCompanyName    +" Value Expected : "+expLoginCompanyName);
		
		System.out.println("UserInfo1             : "+actUserInfo1            +" Value Expected : "+expUserInfo1);
		System.out.println("LoginCompanyName1     : "+getLoginCompanyName1    +" Value Expected : "+expLoginCompanyName1);
		
		if(actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) 
				
				&& actUserInfo1.equalsIgnoreCase(expUserInfo1) && getLoginCompanyName1.contains(expLoginCompanyName1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	/*public static String checkDownloadedFileName(WebDriver driver) throws InterruptedException
	{
		String mainWindow = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
      
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
	     
		driver.get("chrome://downloads");
	      
		JavascriptExecutor js1 = (JavascriptExecutor)driver;

		String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");

		System.err.println("Download deatils");
		System.out.println("File Name :-" + fileName);
	     
		driver.close();

		driver.switchTo().window(mainWindow);
		
		return fileName;
	}*/
	
	
	
	public boolean checkBackup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\Transaction Authorization.fbak");
		
		if(Efile.exists())
		{
			Efile.delete();
		}
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(backup));
		backup.click();
		
		Thread.sleep(3000);
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(backupBtn));
	     backupBtn.click();
	     
	     Thread.sleep(39000);
	     
	     String actBackupName = checkDownloadedFileName(getDriver());
		 String expBackupName = "Transaction Authorization.fbak";
	     
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_J);
	     robot.keyRelease(KeyEvent.VK_J);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     
	     Thread.sleep(4000);
	     
	     ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	     
	     getDriver().switchTo().window(openTabs.get(1)).close();
		 Thread.sleep(1000);
		 getDriver().switchTo().window(openTabs.get(0));
		 
		 Thread.sleep(2000);
		 	
		 System.err.println("Backup Downloaded : "+actBackupName+"  Value Expected  "+expBackupName);
		
		if(actBackupName.equalsIgnoreCase(expBackupName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	public boolean checkLogoutAndLoginWithUser2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();

		Thread.sleep(3000);

		LoginPage lp = new LoginPage(getDriver()); 
		
	    String unamelt="user2";
	  
	    String pawslt="su";
	      
	    lp.enterUserName(unamelt);
	    
	    lp.enterPassword(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	  
		Thread.sleep(6000);

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
		
		
		String expUserInfo           ="User2";
		String expLoginCompanyName   ="Transaction Authorization";
		
		boolean actDashboard = dashboard.isDisplayed();
		boolean expDashboard = true;
		
		System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptionsWithConditionsNotRequiredOption*********************************************");
		
		System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
		System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
		System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

		if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
		{
			System.out.println("Login Successful");
			return true;
		}
		else
		{
			System.out.println("Login Not Successful");
			return false;
		}
	}
	
	
		
		/*@FindBy(xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]")
		private static WebElement report_CloseBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
		private static WebElement sl_CloseBtn;*/
		
		/*@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[12]")
		private static WebElement report_CloseBtn;*/


		/*@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
		private static WebElement sl_CloseBtn;*/
		
		
		

		public boolean checkLogin1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
    	{
    		Thread.sleep(2000);

    	
    		LoginPage lp=new LoginPage(getDriver()); 
    		
    	    String unamelt="su";
    	  
    	    String pawslt="su";
    	      
    	    lp.enterUserName(unamelt);
    	    
    	    lp.enterPassword(pawslt);
    	    
    	    String compname="Links Reports";

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
    		String getLoginCompanyName=getCompanyTxt.substring(0, 13);
    		System.out.println("company name  :  "+ getLoginCompanyName);
    		//companyLogo.click();
    		
    		boolean actDashboard = dashboard.isDisplayed();
    		
    		
    		String expUserInfo           ="SU";
    		String expLoginCompanyName   ="Links Reports";
    		boolean expDashboard = true;
    		
    		Thread.sleep(1500);
    		
    		System.out.println("actUserInfo   :"+actUserInfo);
    		System.out.println("expUserInfo   :"+expUserInfo);
    		
    		System.out.println("getLoginCompanyName   :"+getLoginCompanyName);
    		System.out.println("expLoginCompanyName   :"+expLoginCompanyName);
    		
    		System.out.println("actDashboard   :"+actDashboard);
    		System.out.println("expDashboard   :"+expDashboard);
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
		
		
		
		
		
	public boolean checkListingOfDocumentsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);
		
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(2000);
		
		click(sl_OkBtn);
		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalOrd:44, item2, 15.00, 10.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, SalInv:42, item2, 5.00, , Partial Consumed, 42, Authorized, dep4, wh3]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/01/2024, SalOrd:44, item3, 10.00, 5.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 01/01/2024, SalInv:43, item3, 5.00, , Partial Consumed, 43, Authorized, dep4, wh3]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 01/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending, 44, Authorized, dep4, wh3]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending, 45, Authorized, dep4, wh2]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 20/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 20/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 20/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, 20/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";		
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[12, Grand Total, , , 96.00, 76.00, , , , , ]";
		
		/*
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[13, "+getCurrentDateF2()+", PurRet : 2, Purchase, 25.00, , , 1.75, , , 25.00, , , Indian Rupees]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[14, "+getCurrentDateF2()+", NDT52 : 3, Purchase, , 400.00, 400.00, , 28.00, 28.00, , 400.00, 400.00, Indian Rupees]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[15, "+getCurrentDateF2()+", PurRet : 3, Purchase, 400.00, , , 28.00, , , 400.00, , , Indian Rupees]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[16, Sub Total, , , 525.00, 525.00, , 36.75, 36.75, , 525.00, 525.00, , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[17, Grand Total, , , 1,050.00, 1,050.00, , 73.50, 73.50, , 1,050.00, 1,050.00, , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		/*
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) /*&& actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) && actRow17List.equalsIgnoreCase(expRow17List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	
	public boolean GenerateTheListingOfDocumentReportsWithOnlyPendingOrUnlinkedReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		if(listOfDocReporPendingCheckBoxisSelected.isSelected()==false)
		{
			click(listOfDocReporPendingCheckBox);
			
		}
		
		Thread.sleep(1500);
		
		if(listOfDocReportLinkedCheckBoxisSelected.isSelected()==true)
		{
			
			click(listOfDocReportLinkedCheckBox);
		}
		
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalOrd:44, item2, 15.00, 10.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, SalOrd:44, item3, 10.00, 5.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending, 44, Authorized, dep4, wh3]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending, 45, Authorized, dep4, wh2]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 20/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 20/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 20/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 20/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, Grand Total, , , 86.00, 76.00, , , , , ]";
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean GenerateTheListingOfDocumentReportsWithOnlyLinkedReports() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		if(listOfDocReporPendingCheckBoxisSelected.isSelected()==true)
		{
			click(listOfDocReporPendingCheckBox);
		}
		
		Thread.sleep(1500);
		
		if(listOfDocReportLinkedCheckBoxisSelected.isSelected()==false)
		{
			click(listOfDocReportLinkedCheckBox);
		}
		
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalInv:42, item2, 5.00, , Partial Consumed, 42, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, SalInv:43, item3, 5.00, , Partial Consumed, 43, Authorized, dep4, wh3]";
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, , , 10.00, , , , , , ]";
		
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	public boolean GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsClosed() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/06/2023");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "30/06/2023");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		dropDown("Closed", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 16/06/2023, SalOrd:10, item3, 12.36, , Closed, 10, Authorized, dep2, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 16/06/2023, SalInv:16, item3, 8.00, , Closed, 16, Authorized, dep2, wh3]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 16/06/2023, SalInv:47, item3, 4.36, , Closed, 47, Authorized, dep2, wh3]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 16/06/2023, SalOrd:10, item4, 15.41, , Closed, 10, Authorized, dep2, wh3]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 16/06/2023, SalInv:17, item4, 5.00, , Closed, 17, Authorized, dep2, wh3]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 16/06/2023, SalInv:47, item4, 10.41, , Closed, 47, Authorized, dep2, wh3]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 20/06/2023, SalOrd:13, item1, 10.00, , Closed, 13, Authorized, dep2, wh3]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 20/06/2023, SalInv:12, item1, 10.00, , Closed, 12, Authorized, dep2, wh3]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, Grand Total, , , 75.54, , , , , , ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) )
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	public boolean GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsManuallyClosed() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/08/2023");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/08/2023");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		dropDown("Manually Closed", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 28/08/2023, SalOrd:18, item1, 10.00, , Manually Closed, 18, Authorized, dep3, wh2]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 28/08/2023, SalOrd:18, item2, 5.00, , Manually Closed, 18, Authorized, dep3, wh2]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 28/08/2023, SalOrd:18, item3, 15.00, , Manually Closed, 18, Authorized, dep3, wh2]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 28/08/2023, SalOrd:19, item2, 20.00, , Manually Closed, 19, Authorized, dep2, wh1]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 28/08/2023, SalOrd:19, item4, 8.00, , Manually Closed, 19, Authorized, dep2, wh1]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 28/08/2023, SalOrd:20, item1, 10.00, , Manually Closed, 20, Authorized, dep3, wh2]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 28/08/2023, SalOrd:20, item2, 5.00, , Manually Closed, 20, Authorized, dep3, wh2]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 28/08/2023, SalOrd:20, item3, 15.00, , Manually Closed, 20, Authorized, dep3, wh2]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 28/08/2023, SalOrd:20, item4, 20.00, , Manually Closed, 20, Authorized, dep3, wh2]";
		
		
		int report11thRowListCount = reportsRow11List.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=0;i<report11thRowListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[11, Grand Total, , , 108.00, , , , , , ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) 
				&& actRow9List.equalsIgnoreCase(expRow9List) && actRow10List.equalsIgnoreCase(expRow10List)
				&& actRow11List.equalsIgnoreCase(expRow11List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	public boolean GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPending() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		dropDown("Pending", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending, 45, Authorized, dep4, wh2]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 20/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending, 46, Authorized, dep2, wh2]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 20/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 20/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 20/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, Grand Total, , , 61.00, 61.00, , , , , ]";
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List)
				&& actRow8List.equalsIgnoreCase(expRow8List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}	
	
	
	
	
	public boolean GenerateTheListingOfDocumentReportsWithBasedOnLinkStatusAsPertialConsumed() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		dropDown("Partial Consumed", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);		
		
		
		Thread.sleep(3000);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalOrd:44, item2, 15.00, 10.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, SalInv:42, item2, 5.00, , Partial Consumed, 42, Authorized, dep4, wh3]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/01/2024, SalOrd:44, item3, 10.00, 5.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 01/01/2024, SalInv:43, item3, 5.00, , Partial Consumed, 43, Authorized, dep4, wh3]";
		
		
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			reportsRow6ListArray.add(data);
		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[6, Grand Total, , , 35.00, 15.00, , , , , ]";
		
		
		
		
		
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
		
	
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)
				&& actRow6List.equalsIgnoreCase(expRow6List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}	
	
	
	
	
	
	
	
	public boolean GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		
		click(sl_OkBtn);		
		
		Thread.sleep(1500);
		
		click(enteryPageFiterBtn);
		Thread.sleep(1500);
		
	    click(entryPageFiterOption);
	    
	    Thread.sleep(2500);
	    
	    enterText(filterPopUpDocTxt, "46");
	    Thread.sleep(1500);
	    
	    click(filterPopUpOkBtn);
	    
	    Thread.sleep(3200);	
	
		
		
	    int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 20/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 20/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 20/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending, 46, Authorized, dep2, wh2]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 20/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending, 46, Authorized, dep2, wh2]";
		
		
		int reportsRow6ListCount = reportsRow6List.size();
		ArrayList<String> reportsRow6ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow6ListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			reportsRow6ListArray.add(data);
		}
		String actRow6List = reportsRow6ListArray.toString();
		String expRow6List = "[6, Grand Total, , , 41.00, 41.00, , , , , ]";
		
		
		
		
		
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
		
	
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List)
				&& actRow6List.equalsIgnoreCase(expRow6List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}	
	
	
	public boolean GenerateTheListingOfDocumentReportsWithApplyFilterOnDocNoFromReportsHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		Thread.sleep(1200);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		Thread.sleep(1200);
		click(listingOfDocuments);			
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);		
		Thread.sleep(2000);
		
		click(HomePageFiterBtn);
		Thread.sleep(1500);
		click(homePageFiterOption);
		Thread.sleep(1500);
		
		enterText(filterPopUpDocTxt, "44");
		Thread.sleep(1500);
		tab(filterPopUpDocTxt);
		Thread.sleep(2000);
		click(filterPopUpOkBtn);
		Thread.sleep(1500);	
		
		click(sl_OkBtn);			
		
	    Thread.sleep(3200);	
	
		
		
	    int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, Sales Orders vs Sales Invoices]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, SalOrd:44, item2, 15.00, 10.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, SalOrd:44, item3, 10.00, 5.00, Partial Consumed, 44, Authorized, dep4, wh3]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending, 44, Authorized, dep4, wh3]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, Grand Total, , , 30.00, 20.00, , , , , ]";
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}	
	
	
	public boolean checkListingOfDocumentsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(2000);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 05/01/2024, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, 31/01/2024, SalOrd:44, item3, 10.00, 5.00, Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, 31/01/2024, SalOrd:44, item2, 15.00, 10.00, Pending]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 20/01/2024, 31/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 20/01/2024, 31/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 01/01/2024, 31/01/2024, SalInv:42, item2, 5.00, , Pending]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 20/01/2024, 31/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 01/01/2024, 31/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 20/01/2024, 31/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 01/01/2024, 31/01/2024, SalInv:43, item3, 5.00, , Pending]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, Grand Total, , , , 96.00, 76.00, ]";
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithOnlyPendingOrUnlinkedReports	() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		if(listOfDocReporPendingCheckBoxisSelected.isSelected()==false)
		{
			click(listOfDocReporPendingCheckBox);
		}
		
		Thread.sleep(1500);
		
		if(listOfDocReportLinkedCheckBoxisSelected.isSelected()==true)
		{
			click(listOfDocReportLinkedCheckBox);
		}
		
		
		Thread.sleep(2000);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 05/01/2024, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 20/01/2024, 31/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 20/01/2024, 31/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/01/2024, 31/01/2024, SalOrd:44, item3, 10.00, 5.00, Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 20/01/2024, 31/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 20/01/2024, 31/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 01/01/2024, 31/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 01/01/2024, 31/01/2024, SalOrd:44, item2, 15.00, 10.00, Pending]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, Grand Total, , , , 86.00, 76.00, ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) 
				&& actRow9List.equalsIgnoreCase(expRow9List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithOnlyLinkedReports	() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		if(listOfDocReporPendingCheckBoxisSelected.isSelected()==true)
		{
			click(listOfDocReporPendingCheckBox);
		}
		
		Thread.sleep(1500);
		
		if(listOfDocReportLinkedCheckBoxisSelected.isSelected()==false)
		{
			click(listOfDocReportLinkedCheckBox);
		}
		
		
		Thread.sleep(2000);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 01/01/2024, 31/01/2024, SalInv:42, item2, 5.00, , Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, 31/01/2024, SalInv:43, item3, 5.00, , Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, Grand Total, , , , 10.00, , ]";
		
		
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				&& actRow3List.equalsIgnoreCase(expRow3List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsAutoClosed() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/03/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		Thread.sleep(1500);
		
		new WebDriverWait(getDriver(), 50).until(ExpectedConditions.elementToBeClickable(reportsendDate));
		
		reportsendDate.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1500);

		
		//clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		
		enterText(reportsendDate, "31/03/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		dropDown("Auto Closed", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 19/03/2024, 23/03/2024, SalOrd:56, item2, 10.00, , Auto Closed]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 19/03/2024, 23/03/2024, SalInv:68, item2, 10.00, , Auto Closed]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 19/03/2024, 25/03/2024, SalInv:64, item1, 10.00, , Auto Closed]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 19/03/2024, 25/03/2024, SalInv:64, item2, 30.00, , Auto Closed]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 19/03/2024, 25/03/2024, SalOrd:57, item2, 30.00, , Auto Closed]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 19/03/2024, 25/03/2024, SalOrd:57, item1, 10.00, , Auto Closed]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 26/03/2024, 30/03/2024, SalOrd:58, item2, 20.00, , Auto Closed]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 26/03/2024, 30/03/2024, SalInv:69, item2, 10.00, , Auto Closed]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 26/03/2024, 30/03/2024, SalInv:61, item2, 10.00, , Auto Closed]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 29/03/2024, 31/03/2024, SalOrd:59, item3, 30.00, , Auto Closed]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, 29/03/2024, 31/03/2024, SalInv:65, item2, 20.00, , Auto Closed]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[12, 29/03/2024, 31/03/2024, SalInv:65, item3, 30.00, , Auto Closed]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[13, 29/03/2024, 31/03/2024, SalOrd:59, item1, 10.00, , Auto Closed]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[14, 29/03/2024, 31/03/2024, SalOrd:59, item2, 20.00, , Auto Closed]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[15, 29/03/2024, 31/03/2024, SalInv:65, item1, 10.00, , Auto Closed]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[16, Grand Total, , , , 260.00, , ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsManuallyClosed() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/03/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/03/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		dropDown("Manually Closed", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 29/03/2024, 31/03/2024, SalInv:66, item4, 20.00, , Manually Closed]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 29/03/2024, 31/03/2024, SalOrd:59, item4, 40.00, , Manually Closed]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 29/03/2024, 31/03/2024, SalInv:67, item4, 40.00, , Manually Closed]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, , , , 100.00, , ]";
		
	
		
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithBasedOnLinkStatusAsPending() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		dropDown("Pending", linkStatusDropdown);
		Thread.sleep(1500);
		
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 05/01/2024, 05/01/2024, SalOrd:45, item2, 15.00, 15.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, 31/01/2024, SalOrd:44, item3, 10.00, 5.00, Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, 31/01/2024, SalOrd:44, item2, 15.00, 10.00, Pending]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 20/01/2024, 31/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 20/01/2024, 31/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 01/01/2024, 31/01/2024, SalInv:42, item2, 5.00, , Pending]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 20/01/2024, 31/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 01/01/2024, 31/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 20/01/2024, 31/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 01/01/2024, 31/01/2024, SalInv:43, item3, 5.00, , Pending]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, Grand Total, , , , 96.00, 76.00, ]";
		
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List))
				
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	
	public boolean checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		Thread.sleep(1200);
		click(enteryPageFiterBtn);
		Thread.sleep(1500);
		click(entryPageFiterOption);
		Thread.sleep(1500);
		
		try
		{
			if(filterPopUpDocTxt1.isDisplayed())
			{
				System.out.println("filterPopUpDocTxt1 element is visible");
			}
			
		}	
		catch (Exception e) {
			
			System.err.println("filterPopUpDocTxt1 element is NOT Visible");
			
			click(filterPopUuCustomaizeBtn);
			Thread.sleep(1500);
			ClickUsingJs(filterPopUpDocNoCheckBox);
			Thread.sleep(1500);
			ClickUsingJs(customizationPoupOkBtn);
			Thread.sleep(1200);
				
				
			}
		
	    
	    Thread.sleep(2500);
	    
	    enterText(filterPopUpDocTxt1, "46");
	    Thread.sleep(1500);
	    tab(filterPopUpDocTxt1);
	    Thread.sleep(1500);
	    
	    click(filterPopUpOkBtn);
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 20/01/2024, 31/01/2024, SalOrd:46, item2, 8.00, 8.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 20/01/2024, 31/01/2024, SalOrd:46, item4, 8.00, 8.00, Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 20/01/2024, 31/01/2024, SalOrd:46, item1, 15.00, 15.00, Pending]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 20/01/2024, 31/01/2024, SalOrd:46, item3, 10.00, 10.00, Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, Grand Total, , , , 41.00, 41.00, ]";
		
		
		
		
		
		
		
		
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
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List))
				
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkListingOfDocumentsByDueDateReportWithApplyFilterOnDocNoFromReportsHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		click(HomePageFiterBtn);
		Thread.sleep(1500);	
		
		click(homePageFiterOption);
		Thread.sleep(1500);	
		
		try
		{
			if(filterPopUpDocTxt1.isDisplayed())
			{
				System.out.println("filterPopUpDocTxt1 element is visible");
			}
			
		}	
		catch (Exception e) {
			
			System.err.println("filterPopUpDocTxt1 element is NOT Visible");
			
			click(filterPopUuCustomaizeBtn);
			Thread.sleep(1500);
			ClickUsingJs(filterPopUpDocNoCheckBox);
			Thread.sleep(1500);
			ClickUsingJs(customizationPoupOkBtn);
			Thread.sleep(1200);		
				
			}
		
		Thread.sleep(1500);
	    
	    enterText(filterPopUpDocTxt1, "44");
	    Thread.sleep(1500);   
	    
	    click(filterPopUpOkBtn);
	    Thread.sleep(1200);
		click(sl_OkBtn);
		
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 01/01/2024, 31/01/2024, SalOrd:44, item3, 10.00, 5.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 01/01/2024, 31/01/2024, SalOrd:44, item2, 15.00, 10.00, Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 01/01/2024, 31/01/2024, SalOrd:44, item4, 5.00, 5.00, Pending]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, , , , 30.00, 20.00, ]";
		
	
		
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
	
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List))
				
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
			
	

	public boolean checkListingOfDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending()
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
	
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(listingOfDocumentsByDueDate);	
		
		Thread.sleep(3000);

		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/03/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "20/03/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		Thread.sleep(1500);
		click(dueDateColumn);
		Thread.sleep(1500);
		click(sortingOptionBtn);
		Thread.sleep(2000);
		click(sortingOptionDescending);
		Thread.sleep(3000);		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 14/03/2024, 31/03/2024, SalOrd:54, item1, 10.00, 10.00, Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 19/03/2024, 25/03/2024, SalInv:64, item1, 10.00, , Auto Closed]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 19/03/2024, 25/03/2024, SalInv:64, item2, 30.00, , Auto Closed]";
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 19/03/2024, 25/03/2024, SalOrd:57, item2, 30.00, , Auto Closed]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 19/03/2024, 25/03/2024, SalOrd:57, item1, 10.00, , Auto Closed]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 19/03/2024, 23/03/2024, SalOrd:56, item2, 10.00, , Auto Closed]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 19/03/2024, 23/03/2024, SalOrd:56, item1, 15.00, 15.00, Pending]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 19/03/2024, 23/03/2024, SalInv:68, item2, 10.00, , Auto Closed]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 12/03/2024, 12/03/2024, SalOrd:55, item4, 5.00, 5.00, Pending]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 12/03/2024, 12/03/2024, SalOrd:55, item3, 10.00, 10.00, Pending]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, 12/03/2024, 12/03/2024, SalOrd:55, item2, 15.00, 15.00, Pending]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[12, 05/03/2024, 05/03/2024, SalInv:57, item2, 50.00, , Pending]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[13, 05/03/2024, 05/03/2024, SalOrd:53, item1, 5.00, 5.00, Pending]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[14, 05/03/2024, 05/03/2024, SalOrd:53, item2, 100.00, 50.00, Pending]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[15, Grand Total, , , , 310.00, 110.00, ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
	
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List))
				
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsReport1stPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(ageingOfPendingDocuments);		
		
		Thread.sleep(2000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2023");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 27/04/2023, SalOrd:2, item1, 50.00, 30.00, , , , , , , 30.00, ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 04/05/2023, SalOrd:3, item3, 8.00, 4.00, , , , , , , 4.00, ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 04/05/2023, SalOrd:8, item3, 9.00, 4.00, , , , , , , 4.00, ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 16/06/2023, SalOrd:11, item4, 10.00, 10.00, , , , , , , 10.00, ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 16/06/2023, SalOrd:11, item1, 5.00, 5.00, , , , , , , 5.00, ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 19/06/2023, SalOrd:12, item1, 15.00, 5.00, , , , , , , 5.00, ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 20/06/2023, SalOrd:14, item1, 10.00, 5.00, , , , , , , 5.00, ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 03/07/2023, SalOrd:15, item2, 20.00, 20.00, , , , , , , 20.00, ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 03/07/2023, SalOrd:15, item1, 10.00, 5.00, , , , , , , 5.00, ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 18/07/2023, SalOrd:16, item2, 5.00, 5.00, , , , , , 5.00, , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, 18/07/2023, SalOrd:16, item1, 12.00, 12.00, , , , , , 12.00, , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[12, 07/08/2023, SalOrd:17, item1, 5.00, 5.00, , , , , 5.00, , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[13, 05/09/2023, SalOrd:21, ZARA-TOP, 180.00, 180.00, , , , 180.00, , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[14, 05/09/2023, SalOrd:27, item1, 10.00, 10.00, , , , 10.00, , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[15, 05/09/2023, SalOrd:27, item4, 5.00, 5.00, , , , 5.00, , , , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[16, 14/09/2023, SalOrd:26, item2, 10.00, 10.00, , , , 10.00, , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[17, 14/09/2023, SalOrd:26, item4, 5.00, 5.00, , , , 5.00, , , , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[18, 25/09/2023, SalOrd:22, item2, 20.00, 20.00, , , , 20.00, , , , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	
	
	
	
	public boolean checkAgeingOfPendingDocumentsReport2ndPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);	
	
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[18, 25/09/2023, SalOrd:22, item1, 15.00, 3.00, , , , 3.00, , , , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[19, 25/09/2023, SalOrd:22, item2, 20.00, 20.00, , , , 20.00, , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[20, 02/10/2023, SalOrd:25, item3, 5.00, 5.00, , , , 5.00, , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[21, 02/10/2023, SalOrd:25, item1, 9.00, 9.00, , , , 9.00, , , , ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[22, 04/10/2023, SalOrd:24, item3, 12.00, 12.00, , , 12.00, , , , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[23, 04/10/2023, SalOrd:24, item2, 5.00, 5.00, , , 5.00, , , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[24, 27/10/2023, SalOrd:28, item2, 15.00, 15.00, , , 15.00, , , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[25, 27/10/2023, SalOrd:28, item1, 10.00, 10.00, , , 10.00, , , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[26, 30/10/2023, SalOrd:29, item3, 450.00, 425.00, , , 425.00, , , , , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[27, 30/10/2023, SalOrd:29, item2, 300.00, 300.00, , , 300.00, , , , , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[28, 30/10/2023, SalOrd:29, item1, 200.00, 162.00, , , 162.00, , , , , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[29, 30/10/2023, SalOrd:30, item1, 200.00, 110.00, , , 110.00, , , , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[30, 30/10/2023, SalOrd:30, item3, 450.00, 450.00, , , 450.00, , , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[31, 30/10/2023, SalOrd:30, item2, 300.00, 300.00, , , 300.00, , , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[32, 30/10/2023, SalOrd:36, item1, 5.00, 5.00, , , 5.00, , , , , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[33, 30/10/2023, SalOrd:36, item3, 12.00, 12.00, , , 12.00, , , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[34, 20/11/2023, SalOrd:33, item1, 12.00, 12.00, , 12.00, , , , , , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "";
		
		*/
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) 
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	public boolean checkAgeingOfPendingDocumentsReport3rdPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[35, 20/11/2023, SalOrd:33, item2, 5.00, 5.00, , 5.00, , , , , , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[36, 20/11/2023, SalOrd:37, item2, 5.00, 2.00, , 2.00, , , , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[37, 20/11/2023, SalOrd:37, item1, 10.00, 8.00, , 8.00, , , , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[38, 21/11/2023, SalOrd:34, item2, 10.00, 5.00, , 5.00, , , , , , ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[39, 21/11/2023, SalOrd:34, item1, 8.00, 4.00, , 4.00, , , , , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[40, 05/12/2023, SalOrd:38, item1, 5.00, 5.00, 5.00, , , , , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[41, 05/12/2023, SalOrd:39, item3, 9.00, 9.00, 9.00, , , , , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[42, 18/12/2023, SalOrd:41, item3, 12.00, 6.00, 6.00, , , , , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[43, 18/12/2023, SalOrd:41, item4, 15.00, 12.00, 12.00, , , , , , , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[44, 18/12/2023, SalOrd:41, item2, 9.00, 6.00, 6.00, , , , , , , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[45, 18/12/2023, SalOrd:41, item1, 5.00, 3.00, 3.00, , , , , , , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[46, 27/12/2023, SalOrd:43, item3, 20.00, 15.00, 15.00, , , , , , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[47, 27/12/2023, SalOrd:43, item2, 15.00, 6.00, 6.00, , , , , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[48, 01/01/2024, SalOrd:44, item4, 5.00, 5.00, 5.00, , , , , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[49, 01/01/2024, SalOrd:44, item2, 15.00, 10.00, 10.00, , , , , , , ]";
		
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[50, 01/01/2024, SalOrd:44, item3, 10.00, 5.00, 5.00, , , , , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[51, Grand Total, , , 2547.00, 2281.00, 82.00, 36.00, 1806.00, 247.00, 5.00, 17.00, 88.00, ]";
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) && actRow17List.equalsIgnoreCase(expRow17List))
				
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport1stPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(ageingOfPendingDocumentsByDueDate);	
		
		
		Thread.sleep(2000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2023");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "01/12/2023");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, 24/04/2023, 24/04/2023, SalInv:5, item1, 10.00, 10.00, , , , , , , 10.00, ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, 27/04/2023, 27/04/2023, SalOrd:2, item1, 50.00, 30.00, , , , , , , 30.00, ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, 27/04/2023, 27/04/2023, SalInv:1, item1, 20.00, 20.00, , , , , , , 20.00, ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, 01/05/2023, 01/05/2023, SalInv:7, item3, 6.00, 6.00, , , , , , , 6.00, ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, 01/05/2023, 01/05/2023, SalInv:8, item4, 2.00, 2.00, , , , , , , 2.00, ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, 02/05/2023, 02/05/2023, SalInv:6, item4, 15.00, 15.00, , , , , , , 15.00, ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, 02/05/2023, 02/05/2023, SalInv:6, item3, 7.00, 7.00, , , , , , , 7.00, ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, 02/05/2023, 02/05/2023, SalInv:15, item2, 2.00, 2.00, , , , , , , 2.00, ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, 02/05/2023, 02/05/2023, SalInv:62, item1, 6.00, 6.00, , , , , , , 6.00, ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[10, 02/05/2023, 02/05/2023, SalInv:63, item2, 2.00, 2.00, , , , , , , 2.00, ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[11, 04/05/2023, 04/05/2023, SalOrd:3, item3, 8.00, 4.00, , , , , , , 4.00, ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[12, 04/05/2023, 04/05/2023, SalOrd:4, item1, 5.00, 5.00, , , , , , , 5.00, ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[13, 04/05/2023, 04/05/2023, SalOrd:4, item4, 10.00, 10.00, , , , , , , 10.00, ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[14, 04/05/2023, 04/05/2023, SalOrd:8, item3, 9.00, 4.00, , , , , , , 4.00, ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[15, 04/05/2023, 04/05/2023, SalOrd:8, item1, 2.00, 2.00, , , , , , , 2.00, ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[16, 04/05/2023, 04/05/2023, SalInv:2, item4, 7.00, 7.00, , , , , , , 7.00, ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[17, 04/05/2023, 04/05/2023, SalInv:2, item2, 8.00, 8.00, , , , , , , 8.00, ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[18, 04/05/2023, 04/05/2023, SalInv:3, item2, 2.00, 2.00, , , , , , , 2.00, ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport2ndPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[18, 04/05/2023, 04/05/2023, SalInv:3, item2, 2.00, 2.00, , , , , , , 2.00, ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[19, 04/05/2023, 04/05/2023, SalInv:4, item3, 4.00, 4.00, , , , , , , 4.00, ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[20, 04/05/2023, 04/05/2023, SalInv:9, item3, 5.00, 5.00, , , , , , , 5.00, ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[21, 05/05/2023, 05/05/2023, SalInv:10, item1, 10.00, 10.00, , , , , , , 10.00, ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[22, 16/06/2023, 16/06/2023, SalOrd:11, item1, 5.00, 5.00, , , , , , 5.00, , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[23, 16/06/2023, 16/06/2023, SalOrd:11, item4, 10.00, 10.00, , , , , , 10.00, , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[24, 16/06/2023, 16/06/2023, SalInv:16, item3, 8.00, 8.00, , , , , , 8.00, , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[25, 16/06/2023, 16/06/2023, SalInv:17, item4, 5.00, 5.00, , , , , , 5.00, , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[26, 16/06/2023, 16/06/2023, SalInv:47, item3, 4.36, 4.36, , , , , , 4.36, , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[27, 16/06/2023, 16/06/2023, SalInv:47, item4, 10.41, 10.41, , , , , , 10.41, , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[28, 19/06/2023, 19/06/2023, SalOrd:12, item2, 10.00, 10.00, , , , , , 10.00, , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[29, 19/06/2023, 19/06/2023, SalOrd:12, item1, 15.00, 5.00, , , , , , 5.00, , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[30, 19/06/2023, 19/06/2023, SalInv:14, item1, 10.00, 10.00, , , , , , 10.00, , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[31, 20/06/2023, 20/06/2023, SalInv:12, item4, 6.00, 6.00, , , , , , 6.00, , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[32, 20/06/2023, 20/06/2023, SalInv:12, item1, 10.00, 10.00, , , , , , 10.00, , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[33, 20/06/2023, 20/06/2023, SalOrd:14, item1, 10.00, 5.00, , , , , , 5.00, , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[34, 20/06/2023, 20/06/2023, SalInv:13, item1, 5.00, 5.00, , , , , , 5.00, , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[36, 03/07/2023, 03/07/2023, SalOrd:15, item2, 20.00, 20.00, , , , , , 20.00, , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) 
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport3rdPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[35, 03/07/2023, 03/07/2023, SalOrd:15, item2, 20.00, 20.00, , , , , , 20.00, , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[36, 03/07/2023, 03/07/2023, SalOrd:15, item1, 10.00, 5.00, , , , , , 5.00, , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[37, 03/07/2023, 03/07/2023, SalInv:18, item1, 5.00, 5.00, , , , , , 5.00, , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[38, 18/07/2023, 18/07/2023, SalOrd:16, item2, 5.00, 5.00, , , , , 5.00, , , ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[39, 18/07/2023, 18/07/2023, SalOrd:16, item1, 12.00, 12.00, , , , , 12.00, , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[40, 07/08/2023, 07/08/2023, SalOrd:17, item1, 5.00, 5.00, , , , 5.00, , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[41, 07/08/2023, 07/08/2023, SalInv:19, item2, 10.00, 10.00, , , , 10.00, , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[42, 28/08/2023, 28/08/2023, SalOrd:18, item1, 10.00, 10.00, , , , 10.00, , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[43, 28/08/2023, 28/08/2023, SalOrd:18, item3, 15.00, 15.00, , , , 15.00, , , , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[44, 28/08/2023, 28/08/2023, SalOrd:18, item2, 5.00, 5.00, , , , 5.00, , , , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[45, 28/08/2023, 28/08/2023, SalOrd:19, item2, 20.00, 20.00, , , , 20.00, , , , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[46, 28/08/2023, 28/08/2023, SalOrd:19, item4, 8.00, 8.00, , , , 8.00, , , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[47, 28/08/2023, 28/08/2023, SalOrd:20, item4, 20.00, 20.00, , , , 20.00, , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[48, 28/08/2023, 28/08/2023, SalOrd:20, item1, 10.00, 10.00, , , , 10.00, , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[49, 28/08/2023, 28/08/2023, SalOrd:20, item3, 15.00, 15.00, , , , 15.00, , , , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[50, 28/08/2023, 28/08/2023, SalOrd:20, item2, 5.00, 5.00, , , , 5.00, , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[51, 05/09/2023, 05/09/2023, SalOrd:21, ZARA-TOP, 180.00, 180.00, , , 180.00, , , , , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[54, 14/09/2023, 14/09/2023, SalOrd:26, item2, 10.00, 10.00, , , 10.00, , , , , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) 
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport4thPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[52, 05/09/2023, 05/09/2023, SalOrd:27, item1, 10.00, 10.00, , , 10.00, , , , , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[53, 05/09/2023, 05/09/2023, SalOrd:27, item4, 5.00, 5.00, , , 5.00, , , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[54, 14/09/2023, 14/09/2023, SalOrd:26, item2, 10.00, 10.00, , , 10.00, , , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[55, 14/09/2023, 14/09/2023, SalOrd:26, item4, 5.00, 5.00, , , 5.00, , , , , ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[56, 25/09/2023, 25/09/2023, SalOrd:22, item2, 20.00, 20.00, , , 20.00, , , , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[57, 25/09/2023, 25/09/2023, SalOrd:22, item1, 15.00, 3.00, , , 3.00, , , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[58, 25/09/2023, 25/09/2023, SalInv:20, item1, 5.00, 5.00, , , 5.00, , , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[59, 25/09/2023, 25/09/2023, SalInv:21, item1, 2.00, 2.00, , , 2.00, , , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[60, 25/09/2023, 25/09/2023, SalInv:21, item1, 5.00, 5.00, , , 5.00, , , , , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[61, 02/10/2023, 02/10/2023, SalOrd:25, item1, 9.00, 9.00, , 9.00, , , , , , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[62, 02/10/2023, 02/10/2023, SalOrd:25, item3, 5.00, 5.00, , 5.00, , , , , , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[63, 04/10/2023, 04/10/2023, SalOrd:24, item3, 12.00, 12.00, , 12.00, , , , , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[64, 04/10/2023, 04/10/2023, SalOrd:24, item2, 5.00, 5.00, , 5.00, , , , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[65, 27/10/2023, 27/10/2023, SalOrd:28, item1, 10.00, 10.00, , 10.00, , , , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[66, 27/10/2023, 27/10/2023, SalOrd:28, item2, 15.00, 15.00, , 15.00, , , , , , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[67, 30/10/2023, 30/10/2023, SalOrd:29, item1, 200.00, 162.00, , 162.00, , , , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[68, 30/10/2023, 30/10/2023, SalOrd:29, item3, 450.00, 425.00, , 425.00, , , , , , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[72, 30/10/2023, 30/10/2023, SalOrd:30, item1, 200.00, 110.00, , 110.00, , , , , , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) 
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport5thPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[69, 30/10/2023, 30/10/2023, SalOrd:29, item2, 300.00, 300.00, , 300.00, , , , , , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[70, 30/10/2023, 30/10/2023, SalInv:22, item1, 38.00, 38.00, , 38.00, , , , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[71, 30/10/2023, 30/10/2023, SalInv:22, item3, 25.00, 25.00, , 25.00, , , , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[72, 30/10/2023, 30/10/2023, SalOrd:30, item1, 200.00, 110.00, , 110.00, , , , , , ]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[73, 30/10/2023, 30/10/2023, SalOrd:30, item3, 450.00, 450.00, , 450.00, , , , , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[74, 30/10/2023, 30/10/2023, SalOrd:30, item2, 300.00, 300.00, , 300.00, , , , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[75, 30/10/2023, 30/10/2023, SalOrd:31, item1, 10.00, 5.00, , 5.00, , , , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[76, 30/10/2023, 30/10/2023, SalInv:29, item1, 15.00, 15.00, , 15.00, , , , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[77, 30/10/2023, 30/10/2023, SalInv:30, item1, 50.00, 50.00, , 50.00, , , , , , ]";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[78, 30/10/2023, 30/10/2023, SalInv:31, item1, 20.00, 20.00, , 20.00, , , , , , ]";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "[79, 20/11/2023, 20/11/2023, SalOrd:32, item1, 10.00, 10.00, 10.00, , , , , , , ]";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "[80, 20/11/2023, 20/11/2023, SalOrd:32, item2, 5.00, 5.00, 5.00, , , , , , , ]";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "[81, 20/11/2023, 20/11/2023, SalOrd:33, item2, 5.00, 5.00, 5.00, , , , , , , ]";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "[82, 20/11/2023, 20/11/2023, SalOrd:33, item1, 12.00, 12.00, 12.00, , , , , , , ]";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "[83, 20/11/2023, 20/11/2023, SalOrd:37, item1, 10.00, 8.00, 8.00, , , , , , , ]";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "[84, 20/11/2023, 20/11/2023, SalOrd:37, item2, 5.00, 2.00, 2.00, , , , , , , ]";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "[85, 20/11/2023, 20/11/2023, SalInv:49, item2, 3.00, 3.00, 3.00, , , , , , , ]";
		
		
		/*int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "[90, 21/11/2023, 21/11/2023, SalInv:33, item2, 5.00, 5.00, 5.00, , , , , , , ]";*/
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		/*System.out.println(actRow18List);
		System.out.println(expRow18List);*/
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List) 
				&& actRow17List.equalsIgnoreCase(expRow17List)
				/*&& actRow18List.equalsIgnoreCase(expRow18List)*/)
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			/*click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);*/
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReport6thPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		click(reportsNextBtn);
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[86, 20/11/2023, 20/11/2023, SalInv:49, item1, 2.00, 2.00, 2.00, , , , , , , ]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[87, 21/11/2023, 21/11/2023, SalOrd:34, item1, 8.00, 4.00, 4.00, , , , , , , ]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[88, 21/11/2023, 21/11/2023, SalOrd:34, item2, 10.00, 5.00, 5.00, , , , , , , ]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[89, 21/11/2023, 21/11/2023, SalInv:33, item1, 4.00, 4.00, 4.00, , , , , , , ]";
		
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[90, 21/11/2023, 21/11/2023, SalInv:33, item2, 5.00, 5.00, 5.00, , , , , , , ]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[91, 30/10/2023, 31/12/2023, SalOrd:36, item1, 5.00, 5.00, , 5.00, , , , , , ]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[92, 30/10/2023, 31/12/2023, SalOrd:36, item2, 9.00, 9.00, , 9.00, , , , , , ]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[93, 30/10/2023, 31/12/2023, SalOrd:36, item3, 12.00, 12.00, , 12.00, , , , , , ]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[94, Grand Total, , , , 2949.77, 2706.77, 65.00, 1972.00, 245.00, 123.00, 17.00, 123.77, 161.00, ]";
		
	
		
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List)&& actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkAgeingOfPendingDocumentsByDueDateReportWithApplyFilterOnDueDateSortingDescending() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(ageingOfPendingDocumentsByDueDate);	
		
		
		Thread.sleep(2000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/03/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/03/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "Sales Orders vs Sales Invoices");
	
		Thread.sleep(2000);
		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		Thread.sleep(1500);
		click(dueDateColumn);
		Thread.sleep(1500);
		click(sortingOptionBtn);
		Thread.sleep(1500);
		click(sortingOptionDescending);	
		
		Thread.sleep(4500);
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "";
		
		
		int report10thRowListCount = reportsRow10List.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=0;i<report10thRowListCount;i++)
		{
			String data = reportsRow10List.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "";
		
		
		
		int reportsRow11ListCount = reportsRow11List.size();
		ArrayList<String> reportsRow11ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow11ListCount;i++)
		{
			String data = reportsRow11List.get(i).getText();
			reportsRow11ListArray.add(data);
		}
		String actRow11List = reportsRow11ListArray.toString();
		String expRow11List = "";
		
		
		
		int reportsRow12ListCount = reportsRow12List.size();
		ArrayList<String> reportsRow12ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow12ListCount;i++)
		{
			String data = reportsRow12List.get(i).getText();
			reportsRow12ListArray.add(data);
		}
		String actRow12List = reportsRow12ListArray.toString();
		String expRow12List = "";
		
		
		int reportsRow13ListCount = reportsRow13List.size();
		ArrayList<String> reportsRow13ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow13ListCount;i++)
		{
			String data = reportsRow13List.get(i).getText();
			reportsRow13ListArray.add(data);
		}
		String actRow13List = reportsRow13ListArray.toString();
		String expRow13List = "";
		
		int reportsRow14ListCount = reportsRow14List.size();
		ArrayList<String> reportsRow14ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow14ListCount;i++)
		{
			String data = reportsRow14List.get(i).getText();
			reportsRow14ListArray.add(data);
		}
		String actRow14List = reportsRow14ListArray.toString();
		String expRow14List = "";
		
		int reportsRow15ListCount = reportsRow15List.size();
		ArrayList<String> reportsRow15ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow15ListCount;i++)
		{
			String data = reportsRow15List.get(i).getText();
			reportsRow15ListArray.add(data);
		}
		String actRow15List = reportsRow15ListArray.toString();
		String expRow15List = "";
		
		int reportsRow16ListCount = reportsRow16List.size();
		ArrayList<String> reportsRow16ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow16ListCount;i++)
		{
			String data = reportsRow16List.get(i).getText();
			reportsRow16ListArray.add(data);
		}
		String actRow16List = reportsRow16ListArray.toString();
		String expRow16List = "";
		
		
		int reportsRow17ListCount = reportsRow17List.size();
		ArrayList<String> reportsRow17ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow17ListCount;i++)
		{
			String data = reportsRow17List.get(i).getText();
			reportsRow17ListArray.add(data);
		}
		String actRow17List = reportsRow17ListArray.toString();
		String expRow17List = "";
		
		
		int reportsRow18ListCount = reportsRow18List.size();
		ArrayList<String> reportsRow18ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow18ListCount;i++)
		{
			String data = reportsRow18List.get(i).getText();
			reportsRow18ListArray.add(data);
		}
		String actRow18List = reportsRow18ListArray.toString();
		String expRow18List = "";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		System.out.println(actRow10List);
		System.out.println(expRow10List);
		
		System.out.println(actRow11List);
		System.out.println(expRow11List);
		
		System.out.println(actRow12List);
		System.out.println(expRow12List);
		
		System.out.println(actRow13List);
		System.out.println(expRow13List);
		
		System.out.println(actRow14List);
		System.out.println(expRow14List);
		
		System.out.println(actRow15List);
		System.out.println(expRow15List);
		
		System.out.println(actRow16List);
		System.out.println(expRow16List);
		
		System.out.println(actRow17List);
		System.out.println(expRow17List);
		
		System.out.println(actRow18List);
		System.out.println(expRow18List);
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) 
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List)
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List)
				&& actRow14List.equalsIgnoreCase(expRow14List) && actRow15List.equalsIgnoreCase(expRow15List)
				&& actRow16List.equalsIgnoreCase(expRow16List)
				&& actRow17List.equalsIgnoreCase(expRow17List)
				&& actRow18List.equalsIgnoreCase(expRow18List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkLinkChainAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(linkChainAnalysis);
				
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "sales flow");
	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, SalOrd:44, 01/01/2024, 5.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, SalOrd:44, 01/01/2024, 15.00, SalInv:42, 01/01/2024, 5.00, , 0, , , 0, , , 0, , Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, SalOrd:44, 01/01/2024, 10.00, SalInv:43, 01/01/2024, 5.00, , 0, , , 0, , , 0, , Pending]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, SalOrd:45, 05/01/2024, 15.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, SalOrd:46, 20/01/2024, 15.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, SalOrd:46, 20/01/2024, 8.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		
		int report7thRowListCount = reportsRow7List.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=0;i<report7thRowListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[7, SalOrd:46, 20/01/2024, 10.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		int report8thRowListCount = reportsRow8List.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=0;i<report8thRowListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[8, SalOrd:46, 20/01/2024, 8.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		
		int report9thRowListCount = reportsRow9List.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=0;i<report9thRowListCount;i++)
		{
			String data = reportsRow9List.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[9, Grand Total, , 86.00, , , 10.00, , , , , , , , , , ]";
		
		
		
		
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
		
		System.out.println(actRow8List);
		System.out.println(expRow8List);
		
		System.out.println(actRow9List);
		System.out.println(expRow9List);
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List) 
				&& actRow9List.equalsIgnoreCase(expRow9List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(linkChainAnalysis);
				
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		dropDown("As on date", sl_DateOptionDropdown);
		Thread.sleep(1500);
	
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "sales flow");
	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		click(HomePageFiterBtn);
		Thread.sleep(1500);
		click(homePageFiterOption);
		Thread.sleep(1500);
		enterText(filterPopUpDocTxt2, "51");
		Thread.sleep(1010);
		tab(filterPopUpDocTxt2);
		Thread.sleep(1500);
		click(filterPopUpOkBtn);
		Thread.sleep(1500);
		click(sl_OkBtn);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, SalOrd:51, 26/02/2024, 15.00, SalInv:53, 26/02/2024, 15.00, SalRet:5, 26/02/2024, 15.00, , 0, , , 0, , Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, SalOrd:51, 26/02/2024, 8.00, SalInv:53, 26/02/2024, 8.00, SalRet:5, 26/02/2024, 8.00, , 0, , , 0, , Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, SalOrd:51, 26/02/2024, 10.00, SalInv:53, 26/02/2024, 10.00, SalRet:5, 26/02/2024, 10.00, , 0, , , 0, , Pending]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, SalOrd:51, 26/02/2024, 8.00, SalInv:53, 26/02/2024, 8.00, SalRet:5, 26/02/2024, 8.00, , 0, , , 0, , Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, Grand Total, , 41.00, , , 41.00, , , 41.00, , , , , , , ]";
		
		
		
		
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
		
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkLinkChainAnalysisReportWithApplyFilterOnDocNoFromReportsEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(linkChainAnalysis);
				
		Thread.sleep(3000);
		//dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		dropDown("As on date", sl_DateOptionDropdown);
		Thread.sleep(1500);	
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "sales flow");
	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);	
		
		click(sl_OkBtn);		
		Thread.sleep(1200);
		click(enteryPageFiterBtn);
		Thread.sleep(1500);
		
		click(entryPageFiterOption);
		Thread.sleep(1500);		
	
		enterText(filterPopUpDocTxt2, "49");
		
		
		Thread.sleep(1500);
		click(filterPopUpOkBtn);
		Thread.sleep(1500);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, SalOrd:49, 22/02/2024, 15.00, SalInv:51, 22/02/2024, 15.00, SalRet:4, 22/02/2024, 15.00, DelNts:18, 22/02/2024, 15.00, , 0, , Closed]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, SalOrd:49, 22/02/2024, 10.00, SalInv:51, 22/02/2024, 10.00, SalRet:4, 22/02/2024, 10.00, DelNts:18, 22/02/2024, 10.00, , 0, , Closed]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, SalOrd:49, 22/02/2024, 5.00, SalInv:51, 22/02/2024, 5.00, SalRet:4, 22/02/2024, 5.00, DelNts:18, 22/02/2024, 5.00, , 0, , Closed]";
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, Grand Total, , 30.00, , , 30.00, , , 30.00, , , 30.00, , , , ]";
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		System.out.println(actRow3List);
		System.out.println(expRow3List);
		
		System.out.println(actRow4List);
		System.out.println(expRow4List);
		
		
		
		
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	
	public boolean checkLinkChainAnalysisReportWithBasedOnStartingWorkflow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(linkChainAnalysis);
				
		Thread.sleep(3000);
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "sales flow");
	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		enterText(startingWorkflowDropdown, "Sales Invoices");
		Thread.sleep(1500);
		tab(startingWorkflowDropdown);
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		Thread.sleep(3500);
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, SalInv:42, 01/01/2024, 5.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		

		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, SalInv:43, 01/01/2024, 5.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		
		
		int reportsRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsRow3ListArray.add(data);
		}
		String actRow3List = reportsRow3ListArray.toString();
		String expRow3List = "[3, SalInv:44, 20/01/2024, 4.00, , 0, , , 0, , , 0, , , 0, , Pending]";
		
		
		
		int reportsRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsRow4ListArray.add(data);
		}
		String actRow4List = reportsRow4ListArray.toString();
		String expRow4List = "[4, SalInv:45, 22/01/2024, 10.00, SalRet:3, 22/01/2024, 5.00, , 0, , , 0, , , 0, , Pending]";
		
	
		int reportsRow5ListCount = reportsRow5List.size();
		ArrayList<String> reportsRow5ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow5ListCount;i++)
		{
			String data = reportsRow5List.get(i).getText();
			reportsRow5ListArray.add(data);
		}
		String actRow5List = reportsRow5ListArray.toString();
		String expRow5List = "[5, SalInv:70, 23/01/2024, 10.00, SalRet:10, 21/05/2024, 10.00, DelNts:30, 21/05/2024, 10.00, , 0, , , 0, , Closed]";
		
		
		int report6thRowListCount = reportsRow6List.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=0;i<report6thRowListCount;i++)
		{
			String data = reportsRow6List.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[6, Grand Total, , 34.00, , , 15.00, , , 10.00, , , , , , , ]";
		
		
		
		
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
		
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)
				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) 
				&& actRow6List.equalsIgnoreCase(expRow6List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(report_CloseBtn);
			Thread.sleep(1200);
			click(sl_CloseBtn);
			return false;
		}
	}
	
	public boolean checkPendingVoucherReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		click(inventoryMenu);
		click(orderManagementMenu);
		click(analysisOfLinkedORUnlinkedDocumentsMenu);
		click(pendingVoucherReports);
		Thread.sleep(2000);
		
		
		dropDown("Date Range", sl_DateOptionDropdown);
		Thread.sleep(1500);
		
		clearValueFromTextBox(reportsStartsDate);
		Thread.sleep(1500);
		enterText(reportsStartsDate, "01/01/2024");
		Thread.sleep(1200);
		tab(reportsStartsDate);
		
		clearValueFromTextBox(reportsendDate);
		Thread.sleep(1500);
		enterText(reportsendDate, "31/01/2024");
		Thread.sleep(1200);
		tab(reportsendDate);
		
		
		click(listingOfDocWorkFlowTxt);
		Thread.sleep(1200);
		enterText(listingOfDocWorkFlowTxt, "sales flow");
	
		Thread.sleep(2000);		
		tab(listingOfDocWorkFlowTxt);
		
		Thread.sleep(1500);
		
		enterText(startingWorkflowDropdown, "Sales Invoices");
		Thread.sleep(1500);
		tab(startingWorkflowDropdown);
		Thread.sleep(1500);
		
		
		click(sl_OkBtn);
		Thread.sleep(3500);
		
		
		int reportRow1Count = reportRow1.size();
		
		ArrayList<String> reportRow1Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow1Count;i++)
		{
			String data = reportRow1.get(i).getText();
			
			if(i==5 || i==6 || i==7 || i==8)
			{
				data="Date Or Time";
			}
			
			reportRow1Array.add(data);
		}
		
		
		String actreportRow1 = reportRow1Array.toString();
		String expreportRow1 = "[4, SU, SU, Date Or Time, Date Or Time, Date Or Time, Date Or Time, False, Authorized, 12.00, Pending]";
		
		int reportRow2Count = reportRow2.size();
		
		ArrayList<String> reportRow2Array = new ArrayList<String>();
		
		for(int i=2;i<reportRow2Count;i++)
		{
			String data = reportRow2.get(i).getText();
			
			if(i==5 || i==6 || i==7 || i==8)
			{
				data="Date Or Time";
			}
			
			reportRow2Array.add(data);
		}
		
		
		String actreportRow2 = reportRow2Array.toString();
		String expreportRow2 = "[5, SU, SU, Date Or Time, Date Or Time, Date Or Time, Date Or Time, False, Authorized, 12.00, Pending]";
		
		int reportRow3Count = reportRow3.size();
		
		ArrayList<String> reportRow3Array = new ArrayList<String>();
		
		for(int i=0;i<reportRow3Count;i++)
		{
			String data = reportRow3.get(i).getText();
			
			reportRow3Array.add(data);
		}
		
		
		String actreportRow3 = reportRow3Array.toString();
		String expreportRow3 = "[3, Grand Total, , , , , , , , , , 24.00, ]";
		
		
		
		
		System.out.println("*********************************checkPendingVoucherReport*****************************************");
		
		
		System.out.println("reportRow1 : "+actreportRow1+" Value Expected : "+expreportRow1);
		System.out.println("reportRow2 : "+actreportRow2+" Value Expected : "+expreportRow2);
		System.out.println("reportRow3 : "+actreportRow3+" Value Expected : "+expreportRow3);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		//checkEraseAllTransactionsLogoutAndLogin();
		
		if(actreportRow1.equalsIgnoreCase(expreportRow1) && actreportRow2.equalsIgnoreCase(expreportRow2) && actreportRow3.equalsIgnoreCase(expreportRow3) )
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			return false;
		}
	}
	
	
	
	
	public boolean checkPendingLinkStatusReportWithFilterBasedOnDocNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		click(inventoryMenu);
		click(orderManagementMenu);
		ClickUsingJs(pendingLinkStatus);
		
		Thread.sleep(2000);
		click(linkdropdown);
		Thread.sleep(1500);
		enterText(linkdropdown, "Sales Orders vs Sales Invoices");
		Thread.sleep(2500);
		tab(linkdropdown);
		Thread.sleep(3000);
		
		click(pendingLinkstatusFilterBtn);
		Thread.sleep(1500);
		enterText(pendingLinkstatusFilterPopUpFromDocNotxt, "10");
		Thread.sleep(1500);
		click(pendingLinkstatusFilterPopUpOkBtn);
		Thread.sleep(2000);
		
		int reportsByWarehouseRow1ListCount = pendingLinkStatusReportRow1.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = pendingLinkStatusReportRow1.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[1, SalOrd:10, 16/06/2023, item4, false, Close]";
		
		

		int reportsByWarehouseRow2ListCount = pendingLinkStatusReportRow2.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=0;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = pendingLinkStatusReportRow2.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[2, SalOrd:10, 16/06/2023, item3, false, Close]";	
		
		
		System.out.println(actRow1List);
		System.out.println(expRow1List);
		
		System.out.println(actRow2List);
		System.out.println(expRow2List);
		
		
	
		if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List))
		{
			System.out.println("Test Pass : Reports Are As Expected");
			
			click(pendingLinkStatusCancelBtn);
			
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Reports Are NOT As Expected");
			
			click(pendingLinkStatusCancelBtn);
			
			return false;
		}
	}
	
	
	
	public boolean checkLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
	  userNameDisplayLogo.click();
	  
	  Thread.sleep(1200);
	 
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
      
      System.out.println("UserName is Displaying : "+actUserName+"  Value Expected  "+expUserName);
      System.out.println("Password is Displaying : "+actPassword+"  Value Expected  "+expPassword);
      
	if(actUserName==expUserName && actPassword==expPassword)  
      {
		return true;
	  }
      else
      {
		return false;
	  }
    }
	
	
}
