package com.focus.repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementRepository 
{
	//   TransactionAuthorizationDefinitionOptionsPage Elements
	
	
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[2]")
	public static List<WebElement> errorMessageList;
	
	@FindBy(xpath="//*[@id='idGlobalError']/div/div[1]/button")
	public static List<WebElement> errorMessageCloseBtnList;

	// Elements

	
	@FindBy(xpath = "//*[@id='errmsgDiv']")
	public static WebElement loginPageErrorMesg;

	
	@FindBy(id ="btnSignin")
	public static WebElement signIn;

	@FindBy(xpath = "//i[@title='Create Company']")
	public static WebElement companyCreateBtn;

	@FindBy(xpath = "//i[@title='Keyboard ']")
	public static WebElement keyboardBtn;

	

	@FindBy(xpath = "//input[@id='chkRememberMe']/following-sibling::span")
	public static WebElement rememberMeChk;

	@FindBy(xpath = "//input[@id='chkRememberPwd']/following-sibling::span")
	public static WebElement rememberPwdChk;

	@FindBy(id = "frgtPwd")
	public static WebElement frgtPwdLnk;

	@FindBy(xpath = "//span[contains(@class,'icon-ok icon-font6')]")
	public static WebElement okButtonInCreateCompany;

	@FindBy(xpath = "//span[contains(@class,'icon-close icon-font6')]")
	public static WebElement cancelButtonInCreateCompany;

	

	@FindBy(linkText = "Create Company")
	public static WebElement createCompanyScreen;

	@FindBy(xpath = "//*[@id='errmsgDiv']")
	public static WebElement mandatoryMsgs;

	
	
	@FindBy(xpath = "//*[@id='companyLogo']/parent::a/following-sibling::ul/li[1]")
	public static WebElement companyName1;

	@FindBy(xpath = "//*[@id='mainHeader_MainLayout']/a/img")
	public static WebElement focusLogo;

	@FindBy(xpath = "//*[@id='id_focus8_wrapper_default']/aside/section")
	public static WebElement menuBar;

	

	@FindBy(xpath = "//*[@id='dashIcons']")
	public static WebElement dashboardIcons;


	
	//*[@id='id_mainlayoutmenu']/ul[2]/li[7]/div  without pronghorn xpath

	@FindBy(xpath = "//div[@id='id_mainlayoutmenu']/ul[2]/li[6]//ul/li[1]")
	public static WebElement changePassword;

	@FindBy(xpath = "//*[@id='exampleFormControlSelect1']")
	public static WebElement languageDropdownInLogout;

	

	/*@FindBy(xpath = "//*[@id='dashName']")
	public static WebElement dashboard;*/
	
	
	@FindBy(xpath = "//ul[@id='ulCompanyDetails_HomePage']")
	public static WebElement companydetails;

	// Dash board Page


	
	@FindBy(xpath = "//div[@id='login_div']/div[1]//ul/li[3]//i")
	public static WebElement loginPageRestoreBtn;

	@FindBy(xpath = "//div[@id='login_div']/div[1]//ul/li[5]//i")
	public static WebElement loginPageSecurityProtectedCompanyBtn;

	

	// Financial Menu
	


	
	
	@FindBy(xpath = "(//div[@class='btn btn-toolbar dropdown theme_button_color'])[1]")
	public static WebElement stockLedgerFilterExpandBtn;
	
	@FindBy(xpath = "//li[text()='Refine']")
	public static WebElement stockLedgerFilterRefineBtn;
	
	@FindBy(xpath = "//*[@id='cmbColumn']")
	public static WebElement filterRefineLookInDropdownBtn;
	
	@FindBy(xpath = "//*[@id='SearchTxt']")
	public static WebElement filterRefineFindWhatTxt;
	
	@FindBy(xpath = "//*[@id='idDisplay']")
	public static WebElement filterRefineLookIn2DropdownBtn;
	
	@FindBy(xpath = "//*[@id='RefineReports']/div/div[3]/div/input[1]")
	public static WebElement filterRefineOkBtn;
	
	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	public static WebElement filterRefinCancelBtn;

	// Inventory Menu and Sub Menus
	
	@FindBy(xpath = "//div[@id='id_left_mainmenu']/ul/li/a")
	public static List<WebElement> menusList;

	@FindBy(xpath = "//*[@id='mainHeader_MainLayout']/nav/div/ul/li")
	public static List<WebElement> navbarList;

	@FindBy(xpath = "//a[@id='dropdown03']")
	public static WebElement aboutQuickAcessMenu;

	@FindBy(xpath = "//input[@id='id_ai_search_input']")
	public static WebElement aiSearchTextBox;

	@FindBy(xpath = "(//div[@id='mainHeader_MainLayout']//div/input)[3]")
	public static WebElement searchTxtBox;

	@FindBy(xpath = "//div[@id='id_mainlayoutmenu']/ul[2]/li[1]/a")
	public static WebElement productTour;

	@FindBy(xpath = "//div[@id='id_mainlayoutmenu']/ul[2]/li[3]/a")
	public static WebElement alertsOptions;

	@FindBy(xpath = "//div[@id='id_mainlayoutmenu']/ul[2]/li[2]/a")
	public static WebElement recentMenus;

	// AccountsPage



	// Masters Menu
	@FindBy(xpath = "//a[@id='1000'][contains(text(),'Masters')]")
	public static WebElement mastersMenu;
	
	@FindBy(xpath = "//a[@id='1000']/span")
	public static WebElement masterMenu;
	
	@FindBy(xpath = "//input[@id='id_header_268435460']")
	public static WebElement purchaseVoucherN_WarehosueTxt;

	// Accounts
	@FindBy(xpath = "//a[@id='1104']//span[contains(text(),'Account')]")
	public static WebElement accounts;

	// Master Main Header Fields
	@FindBy(xpath = "//a[@id='btnNew']/i")
	public static WebElement masterNewBtn;

	@FindBy(xpath = "//a[@id='btnAddGroup']/i")
	public static WebElement masterAddGroupBtn;

	@FindBy(xpath = "//a[@id='btnMasterEdit']/i")
	public static WebElement masterEditBtn;

	@FindBy(xpath = "//a[@id='btnClone']/i")
	public static WebElement masterCloneBtn;

	@FindBy(xpath = "//a[@id='btnProperties']/i")
	public static WebElement masterPropertiesBtn;

	@FindBy(xpath = "//a[@id='btnDelete']/i")
	public static WebElement masterDeleteBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-group']")
	public static WebElement masterGroupBtn;

	@FindBy(xpath = "//*[@id='toggle_ribbon']")
	public static WebElement masterRibbonToExpandOptions;

	@FindBy(xpath = "//i[@class='icon-font6 icon-delete-all']")
	public static WebElement masterDeleteAllBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-closed-account']")
	public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity;

	@FindBy(xpath = "//i[@class='icon-font6 icon-open-close-account']")
	public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState;

	@FindBy(xpath = "//i[@class='icon-font6 icon-import']")
	public static WebElement masterAdvanceMasterImportORExportBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-info']")
	public static WebElement masterAuthorInfoBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-up-arrow']")
	public static WebElement masterMoveUpBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-down-arrow']")
	public static WebElement masterMoveDownBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-sort']")
	public static WebElement masterSortBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-mass-update']")
	public static WebElement masterMassUpdateBtn;

	@FindBy(xpath = "//a[@class='lSNext']")
	public static WebElement masterRibbonControlNextBtn;

	@FindBy(xpath = "//*[@id='btnXMLImport']")
	public static WebElement masterImportFromXmlBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-xmlexport']")
	public static WebElement masterExportFormatToXmlBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
	public static WebElement masterCustamizemasterBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-options']")
	public static WebElement masterCustamizeViewBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-tree']")
	public static WebElement mastercustamizeTreeBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-stock-ledger']")
	public static WebElement masterLedgerBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-financial-1']")
	public static WebElement masterManageCreditBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-department-appropriation']")
	public static WebElement masterDepartmentAppropriationBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-budget']")
	public static WebElement masterBudgetBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-backtrack']")
	public static WebElement masterBackTrackBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-transfer']")
	public static WebElement masterTranferBtn;

	@FindBy(xpath = "//*[@id='btnNewSets']")
	public static WebElement masterNewSetBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-modifier']")
	public static WebElement masterModifierBtn;

	@FindBy(xpath = "//*[@id='btnSetType']")
	public static WebElement masterSetTypeBtn;

	@FindBy(xpath = "//i[@class='icon-convert icon-font6']")
	public static WebElement masterUnitConversionBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-alternate-product-1']")
	public static WebElement masterAlternateItemBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-related-product']")
	public static WebElement masterRelatedItemBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-stock-ledger']")
	public static WebElement masterStockLedgerBtn;

	@FindBy(xpath = "//tbody[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> masterAccountsList;

	// New General Elements
	// Name
	
	// AccountType
	@FindBy(xpath = "//select[@id='iAccountType']")
	public static WebElement accountTypeDropdown;

	// CreditLimit
	@FindBy(xpath = "//input[@id='fCreditLimit']")
	public static WebElement creditLimitTxt;

	// CreditDays
	@FindBy(xpath = "//input[@id='iCreditDays']")
	public static WebElement creditdaysTxt;

	// ChequeDiscountLimit
	@FindBy(xpath = "//input[@id='fChequeDiscountLimit']")
	public static WebElement chequeDiscountLimitTxt;

	// Rate Of Interest
	@FindBy(xpath = "//input[@id='fRateofinterest']")
	public static WebElement rateofinterestTxt;

	// BankAccount
	@FindBy(xpath = "//input[@id='iBankAc']")
	public static WebElement bankAccountTxt;

	@FindBy(xpath = "//*[@id='iBankAc_input_image']/span")
	public static WebElement bankAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='iBankAc_input_settings']/span")
	public static WebElement bankAccount_SettingBtn;

	
	@FindBy(xpath = "//a[@id='btnClose']/i")
	public static WebElement closeBtn;

	

	@FindBy(xpath = "//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement masterCloseBtn;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr[1]/td[11]")
	public static WebElement accountCreation;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
	public static WebElement clickOnVendorGroup;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	public static WebElement getVendorGroupName;

	@FindBy(xpath = "//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
	public static WebElement closeAccountCreationScreen;

	@FindBy(xpath = "//input[@id='chkRetainSelection']")
	public static WebElement accountMasterRetain;

	@FindBy(xpath = "//input[@id='liSelectAllMasters']")
	public static WebElement accountMasterSelect;

	@FindBy(xpath = "(//label[@id='lblnchecked']/input)[1]")
	public static WebElement accountFirstCheckBox;

	@FindBy(xpath = "(//label[@id='lblnchecked']/input)[2]")
	public static WebElement accountSecondCheckBox;

	@FindBy(xpath = "//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
	public static WebElement closeAccMasterCreationScreen;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
	public static WebElement closeMaster;

	@FindBy(xpath = "//div[@id='innerDivDeleteMasterModal']/div[2]/div[1]//label")
	public static WebElement getMsgOnDelete;

	@FindBy(xpath = "//button[@id='btnOkForDelete']")
	public static WebElement clickOnOkInDelete;

	@FindBy(xpath = "//button[@id='btnCancelForDelete']")
	public static WebElement clickOnCancelInDelete;

	

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[8]//input")
	public static List<WebElement> masterGridBodyChkbox;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[11]")
	public static List<WebElement> masterGridBodyName;

	@FindBy(xpath = "//span[@id='spnHeaderText']")
	public static WebElement accountsTitle;

	// Item Page

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> masterItemGridBodyName;

	@FindBy(xpath = "//*[@id='iTreeId']")
	public static WebElement masterTreeIdDropdown;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
	public static WebElement masterTreeIDToggleBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
	public static WebElement masterTreeIDToggle_CreateTreeBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]")
	public static WebElement masterTreeIDToggle_EditBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]")
	public static WebElement masterTreeIDToggle_DeleteBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]")
	public static WebElement masterTreeIDToggle_setDefaultBtn;

	@FindBy(xpath = "//*[@id='221']")
	public static WebElement homeMasterItemMenu;

	@FindBy(xpath = "//*[@id='1105']")
	public static WebElement homeMasterItem_ItemMenu;

	// Units Test

	@FindBy(xpath = "//a[@id='1114']")
	public static WebElement unitsMenu;

	@FindBy(xpath = "//input[@id='iNoOfDecimals']")
	public static WebElement noOfDecimalsTxt;

	@FindBy(xpath = "//tbody[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterItemUnitsList;

	// Currency Test

	@FindBy(xpath = "//a[@id='220'][contains(text(),'Currency')]")
	public static WebElement currencyMenu;

	@FindBy(xpath = "//span[contains(text(),'Currency Master')]")
	public static WebElement currencyMasterMenu;

	@FindBy(xpath = "//a[@id='71']/span[contains(text(),'Exchange Rate')]")
	public static WebElement exchangeRateMenu;

	@FindBy(xpath = "//span[contains(text(),'Exchange Rate History')]")
	public static WebElement exchangeRateHistoryMenu;

	@FindBy(xpath = "//*[@id='btnSave']")
	public static WebElement saveIcon;

	@FindBy(xpath = "//input[@id='CoinsName']")
	public static WebElement coinsNameTxt;

	@FindBy(xpath = "//li[@id='btnClose']")
	public static WebElement currencyMasterCancelBtn;

	@FindBy(xpath = "//*[@id='ISOCurrencyCode']")
	public static WebElement ISOCurrencyCodeTxt;

	// Exchange Rate and Exchange Rate History

	@FindBy(xpath = "//*[@id='navbarSupportedContent2']//li[4]")
	public static WebElement exchangeRateDefinitionSaveIcon;

	@FindBy(xpath = "//*[@id='navbarSupportedContent2']//li[2]")
	public static WebElement exchnageRateDeleteOption;

	@FindBy(xpath = "//input[@id='id_option']")
	public static WebElement baseCurrencyInExchangeRateHistory;

	@FindBy(xpath = "//input[@id='ShowData']")
	public static WebElement loadIcon;

	@FindBy(xpath = "//*[@id='id_option_table_body']/tr/td[2]")
	public static List<WebElement> baseCurrencyListCount;

	@FindBy(xpath = "//input[@id='id_option']")
	public static WebElement baseCurrencyTxt;

	@FindBy(xpath = "//input[@id='EffectiveDate']")
	public static WebElement withEffectiveDateTxt;

	@FindBy(xpath = "//input[@id='ExchangeTable_DefinedAs']")
	public static WebElement gridDefineAsTxt;

	@FindBy(xpath = "//input[@id='ExchangeTable_Rate']")
	public static WebElement gridRateTxt;

	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName']")
	public static WebElement gridcurrencyName1Txt;

	@FindBy(xpath = "//li[@id='closeExchangeRate']")
	public static WebElement exchangeRateDefinitionPageCloseIcon;

	@FindBy(xpath = "//i[@class='icon-font6 icon-close']")
	public static WebElement exchangeRateHistoryCloseIcon;

	@FindBy(xpath = "//tbody[@id='HistoryTableBody']/tr[2]/td[3]")
	public static WebElement valueUSD;

	@FindBy(xpath = "//tbody[@id='HistoryTableBody']/tr[2]/td[4]")
	public static WebElement valueAED;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
	public static WebElement selCurrencyOne;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
	public static WebElement selCurrecnyTwo;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	public static WebElement defCurrecnyOne;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
	public static WebElement defCurrecnyTwo;

	// Departments Test

	@FindBy(xpath = "//a[@id='1106']//span[contains(text(),'Department')]")
	public static WebElement departmentMenu;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterDepartmentGridBodyName;

	// Bins Test

	@FindBy(xpath = "//a[@id='1115']/span")
	public static WebElement binsMenu;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[1]/ul/li[4]/ul/li")
	public static List<WebElement> masterSubMenusList;

	@FindBy(xpath = "//input[@id='iColNo']")
	public static WebElement binColNoTxt;

	@FindBy(xpath = "//tbody[@id='LandingGridBody']/tr/td[8]/div[1]/label/input")
	public static List<WebElement> masterItemUnitsChkboxList;

	// Unit Conversion Test

	@FindBy(xpath = "//a[@id='72']/span")
	public static WebElement homeMasterItem_UnitConversionMenu;

	@FindBy(xpath = "//input[@id='optionBaseUnit']")
	public static WebElement unitConversionBaseUnitTxt;

	@FindBy(xpath = "//input[@id='optionProduct']")
	public static WebElement unitConversionItemTxt;

	@FindBy(xpath = "//td[@id='myTagsTable_col_1-2']")
	public static WebElement unitConversionTableRow1Col1;

	@FindBy(xpath = "//td[@id='myTagsTable_col_1-3']")
	public static WebElement unitConversionTableRow1Col2;

	@FindBy(xpath = "//td[@id='myTagsTable_col_1-4']")
	public static WebElement unitConversionTableRow1Col3;

	@FindBy(xpath = "//td[@id='myTagsTable_col_1-5']")
	public static WebElement unitConversionTableRow1Col4;

	@FindBy(xpath = "//td[@id='myTagsTable_col_1-6']")
	public static WebElement unitConversionTableRow1Col5;

	@FindBy(xpath = "//input[@id='myTagsTable_UnitName']")
	public static WebElement unitConversion_EnterUnitNameTxt;

	@FindBy(xpath = "//input[@id='myTagsTable_XFactor']")
	public static WebElement unitConversion_EnterXFactorTxt;

	@FindBy(xpath = "//*[@id='ucCancel']/span")
	public static WebElement unitConversionCancelBtn;

	@FindBy(xpath = "//*[@id='btnDeleteUnitConversion']/span")
	public static WebElement unitConversionDeleteBtn;

	// Configure Masters Test

	

	@FindBy(xpath = "//*[@id='19']/span[text() = 'Configure Masters']")
	public static WebElement settingsConfigureMasters;

	@FindBy(xpath = "//*[@id='navigation_menu']/li[8]/ul/li")
	public static List<WebElement> settingsSubMenusList;

	@FindBy(xpath = "//div[@id='myNavbar']/ul/li/a")
	public static List<WebElement> configMastersRibbonControl;

	@FindBy(xpath = "//*[@id='MasterTabs']/li[2]/a")
	public static WebElement customizationTab;

	@FindBy(xpath = "//select[@id='ddlModule']")
	public static WebElement moduleDropdown;

	@FindBy(xpath = "//input[@id='txtMasterName']")
	public static WebElement nameComboBox;

	@FindBy(xpath = "//tbody[@id='txtMasterName_table_body']/tr/td[2]")
	public static List<WebElement> nameComboBoxList;

	@FindBy(xpath = "//input[@id='txtMasterCaption']")
	public static WebElement captionTxt;

	@FindBy(xpath = "//input[@id='rdoSearchByName_master']")
	public static WebElement searchByNameRadioBtn;

	@FindBy(xpath = "//input[@id='rdoSearchByCode_master']")
	public static WebElement searchByCodeRadioBtn;

	@FindBy(xpath = "//input[@id='chkAllowRivisions']")
	public static WebElement allowReservationChkBox;

	@FindBy(xpath = "//*[@id='chkIsDefault']")
	public static WebElement defaultChkBox;

	@FindBy(xpath = "//input[@id='chkGroupMandatory']")
	public static WebElement groupMandatoryChkBox;

	@FindBy(xpath = "//input[@id='chkPickCode']")
	public static WebElement pickCodeChkBox;

	@FindBy(xpath = "//*[@id='divDependency_Master']/table/thead/tr/td")
	public static List<WebElement> showDependencyHeader;

	@FindBy(xpath = "//a[contains(text(),'Dependent')]")
	public static WebElement dependentTab;

	@FindBy(xpath = "//a[contains(text(),'Used')]")
	public static WebElement usedTab;

	@FindBy(xpath = "//div[@class='msTreeMenuContainer']//div//span[@class='icon-left-and-right-panel-icon icon-font3 clsMenus pull-right']")
	public static WebElement menuMinimizeBtn;

	@FindBy(xpath = "//span[@id='altMenu_Icon']")
	public static WebElement menuExpansionBtn;

	@FindBy(xpath = "//div[@id='masterTreeMenu']//ul//li//a//span")
	public static List<WebElement> menuList;

	@FindBy(xpath = "//div[@id='masterTreeMenu']/ul//li/a/i")
	public static List<WebElement> menuPlus;

	@FindBy(xpath = "//div[contains(text(),'Save')]")
	public static WebElement cmSaveBtn;

	@FindBy(xpath = "//*[@id='btnClose_ConfigureMasters']/div[1]/span")
	public static WebElement cmCloseBtn;

	@FindBy(xpath = "//a[contains(@class,'menu-selected theme_color-inverse')]//span[@class='Flabel'][contains(text(),'Masters')]")
	public static WebElement cmMastermenu;

	@FindBy(xpath = "//div[@class='col-sm-12 btnMain_header_img']//span[@class='icon-delete icon-font7']")
	public static WebElement cmDeleteBtn;

	@FindBy(xpath = "//label[@id='lblMessage_Modal']")
	public static WebElement cmGetMgsonDelete;

	@FindBy(xpath = "//button[@id='btnDeleteMaster_Ok']")
	public static WebElement cmclickOnOkInDelete;

	@FindBy(xpath = "//*[@id='1182']/span")
	public static WebElement ConfigMasterInMastersList;

	@FindBy(xpath = "//*[@id='sName']")
	public static WebElement NameTxt;

	@FindBy(xpath = "//*[@id='sCode']")
	public static WebElement codeTxt;

	@FindBy(xpath = "//*[@id='MasterMenus_div']/div/div[3]/button[1]")
	public static WebElement addGroupBtnInconfigureMaster;

	@FindBy(xpath = "//*[@id='MasterMenus_div']/div/div[3]/button[2]")
	public static WebElement deleteGroupBtnInconfigureMaster;

	@FindBy(xpath = "//*[@id='txtNewGroupName']")
	public static WebElement groupNameTxt;

	@FindBy(xpath = "//*[@id='btnAddGroup_Ok']")
	public static WebElement okBtnInAddgroupPopup;

	@FindBy(xpath = "//li[@id='mMenu1']/a/i")
	public static WebElement homeMenuExpandBtn;

	@FindBy(xpath = "//li[@id='mMenu1000']/a/i")
	public static WebElement masterMenuExpandBtn;

	@FindBy(xpath = "//li[@id='mMenu1000']/a/span")
	public static WebElement masterMenuBtn;

	@FindBy(xpath = "//span[text()='GroupMaster']")
	public static WebElement GroupMasterMenuBtn;

	@FindBy(xpath = "(//span[text()='GroupMaster'])[2]")
	public static WebElement GroupMasterBtn;

	@FindBy(xpath = "//span[text()='GroupMasterToDelete']")
	public static WebElement GroupMasterToDeleteMenuBtn;

	// Seller Price book Test

	@FindBy(xpath = "//*[@id='80']/span")
	public static WebElement homeMasterItem_buyerPriceBookMenu;

	@FindBy(xpath = "//*[@id='76']/span")
	public static WebElement homeMasterItem_sellerPriceBookMenu;

	@FindBy(xpath = "//*[@id='ctrlOptionProPriceBookH']")
	public static WebElement buyerPriceBook_PriceBook;

	// First Row

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[2]")
	public static WebElement itemFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[4]")
	public static WebElement wareHouseFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[5]")
	public static WebElement startingDateFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[6]")
	public static WebElement endingDateFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[7]")
	public static WebElement vendorFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[8]")
	public static WebElement currencyFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[9]")
	public static WebElement minQtyFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[10]")
	public static WebElement maxQtyFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[11]")
	public static WebElement unitFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[12]")
	public static WebElement rateFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[13]")
	public static WebElement PoFirstCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[1]/td[14]")
	public static WebElement PtFirstCellSelect;

	// Second Row
	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[2]")
	public static WebElement itemSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[4]")
	public static WebElement wareHouseSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[5]")
	public static WebElement satrtingDateSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[6]")
	public static WebElement endingDateSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[7]")
	public static WebElement vendorSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[8]")
	public static WebElement currencySecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[9]")
	public static WebElement minQtySecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[10]")
	public static WebElement maxQtySecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[11]")
	public static WebElement unitSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[12]")
	public static WebElement rateSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[13]")
	public static WebElement PoSecondCellSelect;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_body']/tr[2]/td[14]")
	public static WebElement PtSecondCellSelect;

	// Third Row
	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-1']")
	public static WebElement itemThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-3']")
	public static WebElement wareHouseThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-4']")
	public static WebElement satrtingDateThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-5']")
	public static WebElement endingDateThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-6']")
	public static WebElement vendorThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-7']")
	public static WebElement currencyThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-8']")
	public static WebElement minQtyThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-9']")
	public static WebElement maxQtyThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-10']")
	public static WebElement unitThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-11']")
	public static WebElement rateThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-12']")
	public static WebElement PoThirdCellSelect;

	@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-13']")
	public static WebElement PtThirdCellSelect;

	// To get Value From Cell

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_2']")
	public static WebElement itemValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_4']")
	public static WebElement wareHouseValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_StartingDate']")
	public static WebElement startingDateValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_EndingDate']")
	public static WebElement endingDateValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_1']")
	public static WebElement vendorValue;

	@FindBy(xpath = "//input[@id='Currency_option']")
	public static WebElement currencyOptionValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_minqty']")
	public static WebElement minQtyValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_maxqty']")
	public static WebElement maxQtyValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_11']")
	public static WebElement unitValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_val0']")
	public static WebElement rateValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_val1']")
	public static WebElement PoValue;

	@FindBy(xpath = "//input[@id='PriceBookWebGrid_val2']")
	public static WebElement PtValue;

	@FindBy(xpath = "//*[@id='chkDateRange']")
	public static WebElement buyerPriceBook_CustamizeDateRangeCheckBox;

	@FindBy(xpath = "//*[@id='chkCustomer']")
	public static WebElement buyerPriceBook_CustomizeVendorCheckBox;

	@FindBy(xpath = "//*[@id='chkDepartment']")
	public static WebElement buyerPriceBook_WarehouseCheckBox;

	@FindBy(xpath = "//*[@id='chkQtyRange']")
	public static WebElement buyerPriceBook_QualityRangeCheckBox;

	@FindBy(xpath = "//*[@id='chkCurrency']")
	public static WebElement buyerPriceBook_CurrencyCheckBox;

	@FindBy(xpath = "//*[@id='chkUnit']")
	public static WebElement buyerPriceBook_UnitCheckBox;

	@FindBy(xpath = "//*[@id='txtAbbreviation']")
	public static WebElement buyerPriceBook_AbbreviationBtn;

	@FindBy(xpath = "//*[@id='PriceBookContainer']/div[2]/nav/div/div[1]/a/div/span[2]")
	public static WebElement buyerPriceBookLabel;

	@FindBy(xpath = "//*[@id='btnClear']")
	public static WebElement buyerPriceBookClearBtn;

	@FindBy(xpath = "//*[@id='btnPaste']")
	public static WebElement buyerPriceBookPasteBtn;

	@FindBy(xpath = "//*[@id='btnCopy']")
	public static WebElement buyerPriceBookCopyBtn;

	@FindBy(xpath = "//*[@id='btnSelectAll']")
	public static WebElement buyerPriceBookSelectAllBtn;

	@FindBy(xpath = "//*[@id='btnClose']")
	public static WebElement buyerPriceBookCloseBtn;

	@FindBy(xpath = "//*[@id='btnSave']")
	public static WebElement buyerPriceBookSaveBtn;

	@FindBy(xpath = "//*[@id='ctrlOptionProPriceBookH_table_body']/tr/td[2]")
	public static List<WebElement> pricebookComboBoxList;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_option_2_table_body']/tr/td[2]")
	public static List<WebElement> itemComboBoxList;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_option_4_table_body']/tr/td[2]")
	public static List<WebElement> warehouseComboBoxList;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_option_1_table_body']/tr/td[2]")
	public static List<WebElement> vendorComboBoxList;

	@FindBy(xpath = "//*[@id='Currency_option_table_body']/tr/td[2]")
	public static List<WebElement> currencyComboBoxList;

	@FindBy(xpath = "//*[@id='PriceBookWebGrid_option_11_table_body']/tr/td[2]")
	public static List<WebElement> unitComboBoxList;

	@FindBy(xpath = "//input[@id='btnLoad']")
	public static WebElement priceBookFilterAndLoadBtn;

	@FindBy(xpath = "//form[@id='formLoadDataXML']//button[@id='btnExporttoExcel']")
	public static WebElement priceBookExportToExcel;

	@FindBy(xpath = "//button[@id='btnPBImportFromExcel']")
	public static WebElement buyerPriceBook_ImportFromExcel;

	@FindBy(xpath = "//button[@id='btnImportData']")
	public static WebElement importButton;

	@FindBy(xpath = "//button[@id='btnCloseImport']")
	public static WebElement closeButtonInImport;

	@FindBy(xpath = "//span[@class='btn btn-sm theme_background-color fileUpload theme_color']")
	public static WebElement browseButton;

	@FindBy(xpath = "//input[@id='rdoFilterName']")
	public static WebElement nameRadioButton;

	@FindBy(xpath = "//input[@id='rdoFilterCode']")
	public static WebElement codeRadioButton;

	@FindBy(xpath = "//input[@id='rdoFilterBoth']")
	public static WebElement bothRadioButton;

	@FindBy(xpath = "//input[@id='chkOverride']")
	public static WebElement overrideCheckbox;

	@FindBy(xpath = "//span[contains(text(),'Select Sheet')]")
	public static WebElement sheetTitle;

	@FindBy(xpath = "//li[@class='clsSheetName']")
	public static WebElement sheetName;

	@FindBy(xpath = "//button[@id='btnSheetOk']")
	public static WebElement sheetOkButton;

	@FindBy(xpath = "//button[@id='btnSheetClose']")
	public static WebElement sheetCloseButton;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[1]//td[3]")
	public static WebElement sheetItemHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList0']")
	public static WebElement sheetItem;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[2]//td[3]")
	public static WebElement sheetAccountHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList1']")
	public static WebElement sheetAccount;

	@FindBy(xpath = "(//div[@id='myModalImportFromExcel']//tr[3]//td[3])[2]")
	public static WebElement sheetTagHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList2']")
	public static WebElement sheetTag;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[4]//td[3]")
	public static WebElement sheetCurrencyHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList3']")
	public static WebElement sheetCurrency;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[5]//td[3]")
	public static WebElement sheetStartDateHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList4']")
	public static WebElement sheetStartDate;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[6]//td[3]")
	public static WebElement sheetEndDateHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList5']")
	public static WebElement sheetEndDate;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[7]//td[3]")
	public static WebElement sheetMinQtyHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList6']")
	public static WebElement sheetMinQty;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[8]//td[3]")
	public static WebElement sheetMaxQtyHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList7']")
	public static WebElement sheetMaxQty;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[9]//td[3]")
	public static WebElement sheetUnitHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList8']")
	public static WebElement sheetUnitQty;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[10]//td[3]")
	public static WebElement sheetRateHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList9']")
	public static WebElement sheetRate;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[11]//td[3]")
	public static WebElement sheetPOHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList10']")
	public static WebElement sheetPO;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[12]//td[3]")
	public static WebElement sheetPTHeading;

	@FindBy(xpath = "//div[@id='myModalImportFromExcel']//tr[13]//td[3]")
	public static WebElement sheetHeading;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList11']")
	public static WebElement sheetPT;

	@FindBy(xpath = "//select[@id='ddlImportFromExcelItemList12']")
	public static WebElement sheetP;

	@FindBy(xpath = "//*[@id='toggleDropDown']/i")
	public static WebElement buyerPriceBook_CustamizeSettingBtn;

	@FindBy(xpath = "//ul[@id='ddlMenu']/li/label/input")
	public static List<WebElement> buyerPriceBook_CustomizeCheckBoxList;

	@FindBy(xpath = "//tbody[@id='PriceBookWebGrid_body']/tr[1]/td")
	public static List<WebElement> buyerPriceBook_TableRow1List;

	@FindBy(xpath = "//tbody[@id='PriceBookWebGrid_body']/tr[2]/td")
	public static List<WebElement> buyerPriceBook_TableRow2List;

	@FindBy(xpath = "//select[@id='ImportGrid_ExternalFields']")
	public static WebElement buyerPriceBook_MappingDrpdwn;

	

	@FindBy(xpath = "//a[@id='202']")
	public static WebElement itemqueryMenu;

	// Item Query Elements

	@FindBy(xpath = "//input[@id='productQuery']")
	public static WebElement itemTxt;

	@FindBy(xpath = "//input[@value='Get stock details']")
	public static WebElement getStockBtn;

	@FindBy(xpath = "//*[@id='openingStock']")
	public static WebElement openStockQuantityTxt;

	@FindBy(xpath = "//*[@id='currentStock']")
	public static WebElement currentStockTxt;

	@FindBy(xpath = "//*[@id='avgStockRate']")
	public static WebElement avgStockRateTxt;

	@FindBy(xpath = "//*[@id='value']")
	public static WebElement stockValueTxt;

	@FindBy(xpath = "//*[contains(text(),'Balance by Warehouse')]")
	public static WebElement balanceByWarehouseBtn;

	@FindBy(xpath = "//*[@id='tagWiseData']/tbody/tr[1]/td")
	public static List<WebElement> row1BalanceByWareHouseList;

	@FindBy(xpath = "//*[@id='tagWiseData']/tbody/tr[2]/td")
	public static List<WebElement> row2BalanceByWareHouseList;

	@FindBy(xpath = "//*[@id='tagWiseData']/tbody/tr[3]/td")
	public static List<WebElement> row3BalanceByWareHouseList;

	
	@FindBy(xpath = "//*[@id='selectAllMasters_']/following-sibling::span")
	public	static WebElement selectAllItemsCheckBox;

	// Stock Ledger Elements

	@FindBy(xpath = "//tbody[@id='LandingGridBody']/tr/td[8]/div/label/input")
	public static List<WebElement> stockLedgerHometableItemChkboxList;

	@FindBy(xpath = "//*[@id='LandingGridBody']/tr/td[12]")
	public static List<WebElement> ledgerHometableItemNamesList;

	

	@FindBy(xpath = "//button[contains(text(), 'Last')]")
	public static WebElement stockLedgerLastBtn;

	@FindBy(xpath = "//button[contains(text(), 'Previous')]")
	public static WebElement stockLedgerPreviousBtn;

	@FindBy(xpath = "(//tr[@id='trRender_13'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchAfterSavingpurchaseBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesInvoiceBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesInvoiceBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesInvoiceAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[8]") //(//tr[@id='trRender_10'])[1]/td[8]
	public static WebElement stockLedgerBrBatchAfterSavingSalesInvoiceIssuedrateTxt;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[8]")
	public static WebElement stockLedgerFifoItemAfterSavingSalesInvoiceIssuedrateTxt;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[8]")
	public static WebElement stockLedgerRmaItemAfterSavingSalesInvoiceIssuedrateTxt;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchBalanceQtyAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemBalanceQtyAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemBalancevaluAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_2'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAvgRateAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_13'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchBalanceValueAfterSavingpurchase;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchBalanceValueAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_13'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAvgRateAfterSavingpurchase;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAvgRateAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemBalanceQtyAfterSavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemBalanceValueAfterSavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAvgRateAfterSavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemBalanceQtyAftersavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemBalanceQtyAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemBalanceValueAfterSavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemBalanceValueAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemAvgRateAfterSavingPurchase;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemAvgRateAfterLogintoInvUser;

	
	@FindBy(xpath = "//td[contains(text(), 'FIFO-BIN')]//preceding-sibling::td//label/input")
	public static WebElement fifoItemCheckBox;
	
	@FindBy(xpath = "//td[contains(text(), 'WA-PB')]//preceding-sibling::td//label/input")
	public static WebElement wapbItemCheckBox;
	
	@FindBy(xpath = "//td[contains(text(), 'FIFO-PB')]//preceding-sibling::td//label/input")
	public static WebElement fifoPbItemCheckBox;
	
	@FindBy(xpath = "//td[contains(text(), 'BR-PB')]//preceding-sibling::td//label/input")
	public static WebElement brPBItemCheckBox;

	@FindBy(xpath = "//td[contains(text(), 'WA-RMA')]//preceding-sibling::td//label/input")
	public static WebElement rmaItemCheckBox;

	@FindBy(xpath = "//td[contains(text(), 'BR-BATCH')]//preceding-sibling::td//label/input")
	public static WebElement brBatchItemCheckBox;

	@FindBy(xpath = "(//i[@class='icon-filter hiconright2'])[2]")
	public static WebElement stockLedgerFilterBtn;
	
	@FindBy(xpath = "(//li[text()='Filter'])[2]")
	public static WebElement stockLedgerFilterField;

	@FindBy(xpath = "(//i[@class='icon-filter hiconright2'])[1]")
	public static WebElement stockLedgerHomePageFilterBtn;

	@FindBy(xpath = "//h5[text()='Filter']")
	public static WebElement stockLedgerFilterText;
	
	
	@FindBy(xpath = "//*[@id='reportViewFilterBtn']")
	public static WebElement stockMovementWarehouseField2;
	
	@FindBy(xpath = "//*[@id='reportViewFilterBtn']")
	public static WebElement stockValuationWarehouseField2;
	
	@FindBy(xpath = "//*[@id='reportViewFilterBtn']")
	public static WebElement stockAgeingWarehouseField2;
	
	@FindBy(xpath = "//*[@id='reportViewFilterBtn']")
	public static WebElement stockStatementWarehouseField2;
	
	@FindBy(xpath = "//*[@id='575_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement stockMovementFilterWarehouseField3;
	
	@FindBy(xpath = "//*[@id='advancefilter_master_575_0_']")
	public static WebElement stockMovementFilterWarehouseField4;
	
	@FindBy(xpath = "//*[@id='578_0_AdvanceFilter_']/table/tbody/tr/td[5]")
	public static WebElement stockValuationFilterWarehouseField3;
	
	@FindBy(xpath = "//input[@id='advancefilter_master_578_0_']")
	public static WebElement stockValuationFilterWarehouseField3Text;
	
	@FindBy(xpath = "//input[@id='advancefilter_master_578_0_']")
	public static WebElement stockValuationFilterRow2WarehouseField3;
	
	@FindBy(xpath = "//*[@id='advancefilter_master_578_0_']")
	public static WebElement stockValuationFilterWarehouseField4;
	
	@FindBy(xpath = "//*[@id='582_0_AdvanceFilter_']/table/tbody/tr/td[5]")
	public static WebElement stockAgeingFilterWarehouseField3;
	
	@FindBy(xpath = "//*[@id='advancefilter_master_582_0_']")
	public static WebElement stockAgeingFilterWarehouseField4;
	
	@FindBy(xpath = "//*[@id='557_0_AdvanceFilter_']/table/tbody/tr/td[5]")
	public static WebElement stockStatementFilterWarehouseField3;
	
	@FindBy(xpath = "//*[@id='advancefilter_master_557_0_']")
	public static WebElement stockStatementFilterWarehouseField4;
	
	

	@FindBy(xpath = "//input[@id='FOption_551_0_DefaultFilter_1']")
	public static WebElement stockLedgerFilterWarehouseField;
	
	@FindBy(xpath = "//*[@id='FOption_575_0_DefaultFilter_0']")
	public static WebElement stockMovementFilterWarehouseField;
	
	@FindBy(xpath = "//*[@id='FOption_578_0_DefaultFilter_0']")
	public static WebElement stockValuationFilterWarehouseField;
	
	@FindBy(xpath = "//*[@id='FOption_582_0_DefaultFilter_0']")
	public static WebElement stockAgeingFilterWarehouseField;
	
	@FindBy(xpath = "//*[@id='FOption_557_0_DefaultFilter_0']")
	public static WebElement stockStatementFilterWarehouseField;

	@FindBy(xpath = "//input[@id='filter_Okbtn_']")
	public static WebElement stockLedgerFilterOkBtn;

	@FindBy(xpath = "//input[@id='filterRefresh']")
	public static WebElement stockLedgerFilterRefreshBtn;

	@FindBy(xpath = "//*[@id='reportViewFilterBtn']")
	public static WebElement stockLedgerFilterWarehouseField2;

	@FindBy(xpath = "//*[@id='551_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement stockLedgerFilterWarehouseField3;
	
	@FindBy(xpath = "//*[@id='advancefilter_master_551_0_']")
	public static WebElement stockLedgerFilterWarehouseField4;
	
	

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemHydBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemHydBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemHydAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemSecBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemSecBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemSecAvgRate;

	

	@FindBy(xpath = "//a[@id='2008']/span")
	public static WebElement PurchasesVoucher;
	
	@FindBy(xpath = "//td[text()='54']//..//input")
	public static WebElement PurchasesVoucherNo54;
	
	@FindBy(xpath = "//td[text()='51']//..//input")
	public static WebElement salesInvoiceVoucherNo51;
	
	@FindBy(xpath = "(//td[text()='46']//..//input)[1]")
	public static WebElement ExcessInStockVoucherNo46;
	
	@FindBy(xpath = "//td[text()='48']//..//input")
	public static WebElement purchasesReturnsVoucherNo48;
	
	@FindBy(xpath = "//td[text()='50']//..//input")
	public static WebElement salesReturnsVoucherNo50;
	
	@FindBy(xpath = "(//td[text()='2']//..//input)[1]")
	public static WebElement deliverNotes1VoucherNo2;
	
	@FindBy(xpath = "(//td[text()='2']//..//input)[1]")
	public static WebElement salesInvoice1VoucherNo2;
	
	@FindBy(xpath = "//td[text()='51']//..//input")
	public static WebElement salesReturnsVoucherNo51;
	
	@FindBy(xpath = "//label[text()='Posting details']")
	public static WebElement postingDetailsField;
	
	
	
	@FindBy(xpath="//div[@id='id_transactionentry_postingdetail_debit']//div[not(contains(@class,'row'))]")
	public static List<WebElement>  postingDetailsDebitList; 
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[1]/div/div[1]")
	public static List<WebElement>  postingDetailsDebitSecList_AccList;
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetail_credit']//div[not(contains(@class,'row'))]")
	public static List<WebElement>  postingDetailsCreditList; 
	
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetail_popup']/div/div/div[2]/div/div[2]/div[2]/div/div[1]")
	public static List<WebElement>  postingDetailsCreditSec_AccList; 
	
	@FindBy(xpath="//div[@id='id_transactionentry_postingdetail_debittotal']/b")
	public static WebElement  postingDetailsDebitSum; 
	    	  	
	@FindBy(xpath="//div[@id='id_transactionentry_postingdetail_credittotal']/b")
	public static WebElement  postingDetailsCreditSum; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[1]//div[1]")
	public static WebElement postingDetailsBatchName;
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[1]//div[2]")
	public static WebElement postingDetailsBatchAmount;
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[2]//div[1]")
	public static WebElement postingDetailsFifoName;
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[2]//div[2]")
	public static WebElement postingDetailsFifoAmount;
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[3]//div[1]")
	public static WebElement postingDetailsWaName;
	
	@FindBy(xpath = "//div[@id='id_transactionentry_postingdetail_debit']//div[3]//div[2]")
	public static WebElement postingDetailsWaAmount;
	
	
	@FindBy(xpath = "//span[@title='Close']")
	public static WebElement postingDetailsCloseBtn;

	@FindBy(xpath = "//a[@id='2015']")
	public static WebElement salesInvoiceVoucher;

	
	
	@FindBy(xpath="//a[@id='530']/span")
	public static WebElement  financialFinalAccountsMenu;
	
	@FindBy(xpath="//a[@id='558']/span")
	public static WebElement  financialReceivableAndPayableMenu;
	
	@FindBy(xpath="//a[@id='607']/span")
	public static WebElement  customerSummeryMenu;
	
	@FindBy(xpath="//a[@id='608']/span")
	public static WebElement  vendorSummeryMenu;
	
	@FindBy(xpath="//a[@id='544']/span")
	public static WebElement  vendorAgeingSummery;
	
	@FindBy(xpath="//a[@id='562']/span")
	public static WebElement  customerAgeingSummery;
	
	@FindBy(xpath="//a[@id='531']/span")
	public static WebElement  trialBalance;
	
	@FindBy(xpath="//a[@id='81']/span")
	public static WebElement  financialReports;
	
	@FindBy(xpath="//a[@id='506']/span")
	public static WebElement  financialPurchaseReportMenu;
	
	@FindBy(xpath="//a[@id='507']/span")
	public static WebElement  financialPurchaseRegister;
	
	@FindBy(xpath = "//*[@id='MasterGroup__101']")
	public static WebElement accountDropdown;
	
	@FindBy(xpath="//a[@id='500']/span")
	public static WebElement  financialReportsLedger;

	@FindBy(xpath = "//a[@id='id_transaction_homescreen_new']")
	public static WebElement newBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement purchasesAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement salesAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement vendorAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement customerAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement purchaseDatetxt;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement salesDatetxt;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement purchasesDepartmenttxt;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement salesDepartmenttxt;

	@FindBy(xpath = "//input[@id='id_body_38']")
	public static WebElement enterRmatxt;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']")
	public static WebElement voucherSaveBtn;
	
	
	
	@FindBy(xpath="//*[@id='id_search_menu']/input")
	public static WebElement  homepageManuSearchField;
	
	@FindBy(xpath="//span[@id='2057']")
	public static WebElement  stockIn;
	

	@FindBy(xpath = "//i[@class='icon-close hiconright2']")
	public static WebElement voucherhomeCloseBtn;

	
	
	
	@FindBy(xpath="//*[@id='txtNewReference']")
	public static WebElement  billRefNewRefTxt;
	
	

	@FindBy(xpath = "(//button[@id='div_PICKFIFO'])[1]")
	public static WebElement batchPickOnFIFOIcon;

	@FindBy(xpath = "//button[@id='div_Ok1']")
	public static WebElement batchOkIcon;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[1]/td[3]")
	public static WebElement batchPopUPRow1BaseQuantityTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[1]/td[8]")
	public static WebElement batchPopUPRow1RateTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[2]/td[3]")
	public static WebElement batchPopUPRow2BaseQuantityTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[2]/td[8]")
	public static WebElement batchPopUPRow2RateTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[3]/td[3]")
	public static WebElement batchPopUPRow3BaseQuantityTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[3]/td[8]")
	public static WebElement batchPopUPRow3RateTxt;

	

	@FindBy(xpath = "//*[@id='id_body_84']")
	public static WebElement bin2Txt;
	
	@FindBy(xpath = "//*[@id='id_body_85']")
	public static WebElement bin1Txt;
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[12]")
	public static WebElement select7thRow_11thColumn;
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[14]")
	public static WebElement select7thRow_13thColumn;

	


	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[13]")
	public static WebElement select8thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[13]")
	public static WebElement select9thRow_12thColumn;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[14]")
	public static WebElement select8thRow_13thColumn;
	
	

	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	public static WebElement select3rdRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	public static WebElement select3rdRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	public static WebElement select4thRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	public static WebElement select4thRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	public static WebElement select5thRow_AvgRate;
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	public static WebElement select5thRow_AvgRateExcess;
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	public static WebElement select5thRow_AvgRate1;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	public static WebElement select6thRow_AvgRate1;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	public static WebElement select5thRow_OverAllAvgRate1;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	public static WebElement select6thRow_OverAllAvgRate1;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	public static WebElement select5thRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	public static WebElement select6thRow_AvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	public static WebElement select6thRow_AvgRateExcess;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	public static WebElement select8thRow_AvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	public static WebElement select7thRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	public static WebElement select9thRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	public static WebElement select6thRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	public static WebElement select8thRow_OverAllAvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	public static WebElement select7thRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	public static WebElement select8thRow_AvailaleStock;
	
	

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	public static WebElement select1thRow_AvailaleStock;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	public static WebElement select4thRow_AvailaleStock;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	public static WebElement select6thRow_AvailaleStock;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	public static WebElement select7thRow_AvailaleStock;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	public static WebElement select9thRow_AvailaleStock;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	public static WebElement select9thRow_OverAllAvgRate;

	// RMA POpup Window
	


	@FindBy(xpath = "//i[@id='sp_search']")
	public static WebElement rmaSearchGridField;

	@FindBy(xpath = "//*[@id='RMASearchTable']/tbody/tr/td[2]")
	public static List<WebElement> rmaSerialNos;

	@FindBy(xpath = "//*[@id='RMASearchTable']/tbody/tr/td/input")
	public static List<WebElement> rmaSerialNoCheckBoxes;

	@FindBy(xpath = "//*[@id='RMA_Table_body']/tr/td[2]")
	public static List<WebElement> rmaSerialNoList;

	@FindBy(xpath = "//input[@id='chkSelectALL']")
	public static WebElement searchRmaSelectAllGridCheckBox;

	@FindBy(xpath = "(//button[@id='div_OK'])[2]")
	public static WebElement searchRmaOkBtn;

	

	@FindBy(xpath = "//button[@id='div_OK']")
	public static WebElement RMAPopupOkBtn;

	///

	@FindBy(xpath = "//input[@id='id_body_536870916']")
	public static WebElement enterWarehousettxt;

	@FindBy(xpath = "//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
	public static List<WebElement> svwareHouseListCount;

	@FindBy(xpath = "//input[@id='id_body_23']")
	public static WebElement enterItemttxt;
	
	@FindBy(xpath = "//input[@id='id_body_12']")
	public static WebElement purchaseAccountTxt;
	
	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement purchaseAccountTxt1;

	@FindBy(xpath = "//input[@id='id_body_33555468']")
	public static WebElement enterAvailableStocktxt;

	@FindBy(xpath = "//input[@id='id_body_26']")
	public static WebElement enterQuantitytxt;

	@FindBy(xpath = "//input[@id='id_body_27']")
	public static WebElement enterRatetxt;
	
	@FindBy(xpath = "//input[@id='id_body_33555487']")
	public static WebElement priceBookrate;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	public static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath = "//input[@id='id_body_13']")
	public static WebElement enterBatchtxt;

	@FindBy(xpath = "//textarea[@id='id_body_16777279']")
	public static WebElement enterBatCodetxt;

	

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemHydBalanceQtyAfterSavingPurchaseVocher;

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemHydBalanceValueAfterSavingPurchaseVocher;

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemHydAvgRateAfterSavingPurchaseVocher;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemSecBalanceQtyAfterSavingPurchaseVocher;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemSecBalanceValueAfterSavingPurchaseVocher;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemSecAvgRateAfterSavingPurchaseVocher;

	

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemHydBalanceQtyAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemHydBalanceValueAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemHydAvgRateAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemSecBalanceQtyAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemSecBalanceValueAfterLoginToInvUser;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemSecAvgRateAfterLoginToInvUser;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
	public static List<WebElement> Row1SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td")
	public static List<WebElement> Row2SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td")
	public static List<WebElement> Row3SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td")
	public static List<WebElement> Row4SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td")
	public static List<WebElement> Row8SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td")
	public static List<WebElement> Row9SalesInvoicevocherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td")
	public static List<WebElement> Row5SalesInvoicevocherBodyList;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement stockTransferDatetxt;

	@FindBy(xpath = "//select[@id='id_header_31']")
	public static WebElement stockTransferIssuestxt;

	@FindBy(xpath = "//input[@id='id_header_86']")
	public static WebElement stockTransferWarehousetxt;

	@FindBy(xpath = "//input[@id='id_body_87']")
	public static WebElement enterWarehousettxt2;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	public static WebElement select1stRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	public static WebElement select2ndRow_AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	public static WebElement select1stRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	public static WebElement select2ndRow_OverAllAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	public static WebElement select1stRow_BatchText;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	public static WebElement select2ndRow_11thColumn;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[6]")    //(//tr[@id='trRender_12'])[1]/td[6]
	public static WebElement stockLedgerBrBatchReceivedRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[8]")   //(//tr[@id='trRender_11'])[1]/td[8]
	public static WebElement stockLedgerBrBatchIssuedRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAvgRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[9]")   //(//tr[@id='trRender_12'])[1]/td[9]
	public static WebElement stockLedgerBrBatchBalanceQtyAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchBalanceValueAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAvgRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemBalanceQtyAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemBalanceValueAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[6]")
	public static WebElement stockLedgerRmaItemReceivedRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_3'])[1]/td[8]")
	public static WebElement stockLedgerRmaItemIssuedRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemBalanceQtyAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemBalanceValueAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_4'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemAvgRateAfterSavingStockTransfer;

	@FindBy(xpath = "(//tr[@id='trRender_7'])[1]/td[6]")
	public static WebElement stockLedgerBrBatchReceivedRateAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_6'])[1]/td[8]")
	public static WebElement stockLedgerBrBatchIssuedRateAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_7'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAvgRateAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_7'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchBalanceQtyAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_7'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchBalanceValueAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAvgRateAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemBalanceQtyAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemBalanceValueAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_6'])[1]/td[6]")
	public static WebElement stockLedgerRmaItemReceivedRateAfterSavingStockTransfer2;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[14]")
	public static WebElement select2ndRow_13thColumn;

	@FindBy(xpath = "(//tr[@id='trRender_5'])[1]/td[8]")
	public static WebElement stockLedgerRmaItemIssuedRateAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_6'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemBalanceQtyAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_6'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemBalanceValueAfterSavingStockTransfer2;

	@FindBy(xpath = "(//tr[@id='trRender_6'])[1]/td[13]")
	public static WebElement stockLedgerrmaItemAvgRateAfterSavingStockTransfer2;

	@FindBy(xpath = "//a[@id='2035']")
	public static WebElement inventoryTransactionsExcessesStocks;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement excessesStockDatetxt;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	public static WebElement select4thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	public static WebElement select5thRow_10thColumn;
	
	
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	public static WebElement select6thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	public static WebElement select6thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	public static WebElement select6thRow_ExcessStockOverAllAvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	public static WebElement select6thRow_ExcessStockOverAllAvgRate1;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	public static WebElement select5thRow_ExcessStockOverAllAvgRate;
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	public static WebElement select5thRow_ExcessStockOverAllAvgRate1;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	public static WebElement select2ndRow_8thColumn;

	@FindBy(xpath = "//a[@id='2034']")
	public static WebElement inventoryTransactionsShortagesInStocks;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement shortagesInStockDatetxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[1]/td[2]")
	public static WebElement batchPopUPRow1BatchNoTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[2]/td[2]")
	public static WebElement batchPopUPRow2BatchNoTxt;

	@FindBy(xpath = "//*[@id='Id_MRPBatch_Grid_body']/tr[3]/td[2]")
	public static WebElement batchPopUPRow3BatchNoTxt;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td")
	public static List<WebElement> Row3ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td")
	public static List<WebElement> Row4ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td")
	public static List<WebElement> Row5ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td")
	public static List<WebElement> Row6ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	public static WebElement select6thRow_9thColumn;

	
	
	
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[11]")
	public static WebElement select7thRow_10thColumn;
	

	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[11]")
	public static WebElement select8thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[11]")
	public static WebElement select9thRow_10thColumn;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[12]")
	public static WebElement select9thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[11]")
	public static WebElement select10thRow_10thColumn;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[12]")
	public static WebElement select10thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[11]")
	public static WebElement select11thRow_10thColumn;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[12]")
	public static WebElement select11thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td")
	public static List<WebElement> Row9ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td")
	public static List<WebElement> Row10ShortageInStockVoucherBodyList;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td")
	public static List<WebElement> Row11ShortageInStockVoucherBodyList;

	

	@FindBy(xpath = "//*[@id='2009']")
	public static WebElement financialsTransactionsPurchaseMenuPurchasesReturns;

	@FindBy(xpath = "//input[@id='id_header_2']")
	public static WebElement purchaseReturnsDatetxt;

	@FindBy(xpath = "//input[@id='id_header_3']")
	public static WebElement purchasesReturnsAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_4']")
	public static WebElement purchasesReturnsvendorAccounttxt;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	public static WebElement purchasesReturnsDepartmenttxt;

	@FindBy(xpath = "//*[@id='2016']")
	public static WebElement financialsTransactionsSalesMenuSalesReturn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	public static WebElement select5thRow_SalesReturnsAvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	public static WebElement select3rdRow_DeliveryNote1OverAllAvgRate;
	
	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	public static WebElement select3rdRow_DeliveryNote1AvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	public static WebElement select5thRow_SalesReturnsOverallAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	public static WebElement select6thRow_SalesReturnsAvgRate;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	public static WebElement select6thRow_SalesReturnsOverallAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[9]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesReturnsBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[12]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesReturnsBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[13]")
	public static WebElement stockLedgerBrBatchAfterSavingSalesReturnsAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_1'])[1]/td[9]")
	public static WebElement stockLedgerBRItemHydBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_1'])[1]/td[12]")
	public static WebElement stockLedgerBRItemHydBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_1'])[1]/td[13]")
	public static WebElement stockLedgerBRItemHydAvgRateAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[9]")
	public static WebElement stockLedgerBRItemSecBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[12]")
	public static WebElement stockLedgerBRItemSecBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td[13]")
	public static WebElement stockLedgerBRItemSecAvgRateAfterAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_17'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemAfterSavingSalesReturnsBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_17'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemAfterSavingSalesReturnsBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_17'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemAfterSavingSalesReturnsAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemHydBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemHydBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemHydAvgRateAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[9]")
	public static WebElement stockLedgerFifoItemSecBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[12]")
	public static WebElement stockLedgerFifoItemSecBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td[13]")
	public static WebElement stockLedgerFifoItemSecAvgRateAfterAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemAfterSavingSalesReturnsBalanceQty;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemAfterSavingSalesReturnsBalanceValue;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td[13]")
	public static WebElement stockLedgerRmaItemAfterSavingSalesReturnsAvgRate;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemHydBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemHydBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_0'])[1]/td[13]")
	public static WebElement stockLedgerRmaItemHydAvgRateAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[9]")
	public static WebElement stockLedgerRmaItemSecBalanceQtyAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[12]")
	public static WebElement stockLedgerRmaItemSecBalanceValueAfterSavingSalesReturns;

	@FindBy(xpath = "(//tr[@id='trRender_16'])[1]/td[13]")
	public static WebElement stockLedgerRmaItemSecAvgRateAfterAfterSavingSalesReturns;

	@FindBy(xpath = "//a[@id='575']")
	public static WebElement InventoryReportsStockMovement;

	
	
	@FindBy(xpath = "//*[@id='selectAllMasters_']//..//span")
	public static WebElement selectAllItemChkBox;
	
	

	// Reports Table Col List
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
	
	
	

	// Reports Table Row List
	

	@FindBy(xpath = "(//tr[@id='trRender_8'])[1]/td")
	public static List<WebElement> reportsRow9List;

	@FindBy(xpath = "(//tr[@id='trRender_9'])[1]/td")
	public static List<WebElement> reportsRow10List;

	@FindBy(xpath = "(//tr[@id='trRender_10'])[1]/td")
	public static List<WebElement> reportsRow11List;

	@FindBy(xpath = "(//tr[@id='trRender_11'])[1]/td")
	public static List<WebElement> reportsRow12List;

	@FindBy(xpath = "(//tr[@id='trRender_12'])[1]/td")
	public static List<WebElement> reportsRow13List;
	
	
	
	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[13]")
	public static WebElement voucherGridRow1AuthorizationStatus;

	@FindBy(xpath = "(//tr[@id='trRender_13'])[1]/td")
	public static List<WebElement> reportsRow14List;

	@FindBy(xpath = "(//tr[@id='trRender_14'])[1]/td")
	public static List<WebElement> reportsRow15List;

	@FindBy(xpath = "(//tr[@id='trRender_15'])[1]/td")
	public static List<WebElement> reportsRow16List;
	
	@FindBy(xpath="(//tr[@id='trRender_16'])[1]/td")
	public static List<WebElement> reportsRow17List;
	
	@FindBy(xpath="(//tr[@id='trRender_17'])[1]/td")
	public static List<WebElement> reportsRow18List;	
	
	@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[last()]//td")
	public static List<WebElement> reportsLastRowList;
	
	@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[last()-1]//td")
	public static List<WebElement> reportsLastRowbutOneList;
	
	@FindBy(xpath="//table[@class='CommonReportTable']//tbody//tr[last()-2]//td")
	public static List<WebElement> reportsLastRowbutOneList1;

	@FindBy(xpath = "//select[@id='RITCombobox__1']")
	public static WebElement stockMovementDropdown;

	@FindBy(xpath = "//a[@id='578']")
	public static WebElement InventoryReportsStockValuation;

	@FindBy(xpath = "//select[@id='RITCombobox__1']")
	public static WebElement stockValuationDropdown;

	@FindBy(xpath = "//a[@id='621']")
	public static WebElement InventoryReportsStockAgeingAnalysisMenu;

	@FindBy(xpath = "//a[@id='582']/span")
	public static WebElement InventoryReportsAgeingAnalysis;

	@FindBy(xpath = "(//select[@id='RITCombobox__1'])[1]")
	public static WebElement stockAgeingDropdown;

	@FindBy(xpath = "//input[@id='MasterGroup__101']")
	public static WebElement stockAgeingAnalysisWarehouseField;

	@FindBy(xpath = "//a[@id='645']")
	public static WebElement InventoryReportsStockBalanceByWarehouseMenu;

	@FindBy(xpath = "//a[@id='557']/span")
	public static WebElement InventoryStockStatementMenu;
	
	
	
	@FindBy(xpath = "//a[@id='2033']")
	public static WebElement inventoryTransactionsStockMenu;
	
	@FindBy(xpath = "//a[@id='2056']/span")
	public static WebElement inventoryTransactionsStockOut;
	
	@FindBy(xpath = "//*[@id='trRender_1']/td[2]/input")
	public static WebElement stockoutHomepageRpw1Checkbx;
	
	@FindBy(xpath = "//a[@id='id_transaction_homescreen_authorize']")
	public static WebElement stockOutHomeAuthBtn;

	@FindBy(xpath = "//*[@id='id_transaction_viewcontainer']/li[3]/a")
	public static WebElement stockOutPendingAuthLink;
	
	
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
	public static List<WebElement> grid_VoucherNoList;
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	public static List<WebElement> grid_CheckBoxList;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	public static WebElement  stockAccounttxt;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	public static WebElement  partyAccounttxt;
	
	@FindBy(xpath="//input[@id='id_header_86']")
	public static WebElement  Warehouse1txt;
	
	@FindBy(xpath="//input[@id='id_header_87']")
	public static WebElement  Warehouse2txt;
	
	@FindBy(xpath="//input[@id='id_header_268435459']")
	public static WebElement  stockOutDepartmenttxt;
	
	@FindBy(xpath = "//a[@id='2036']")
	public static WebElement inventoryTransactionsStockMenuStockTransfersMenu;

	
	@FindBy(xpath = "//*[@id='tagWiseData']/tbody/tr[4]/td")
	public static List<WebElement> row4BalanceByWareHouseList;
	
	
	
	
	
	// DESIGN WORKFLOW OPTIONS ELEMENTS
	
	@FindBy(xpath = "//button[contains(text(),'AR/AP')]")
	public static WebElement PurchaseOrderMiscellaneous_ARAPExpandBtn;
	
	@FindBy(xpath = "//select[@id='misc_arapDueDate']")
	public static WebElement PurchaseOrderMiscellaneous_DueDateDropdown;	
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[12]/td[2]")
	public static WebElement baseFieldRow12;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[15]/td[2]")
	public static WebElement baseFieldRow15;
	
	@FindBy(xpath="//*[@id='mapWorkflow_GrdId_body']/tr[16]/td[2]")
	public static WebElement baseFieldRow16;
	
	@FindBy(xpath="//input[@id='id_header_6']")
	public static WebElement PurchaseOrder_DueDateTxt;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	public static WebElement  purchasesVoucherN_VendorAccTxt;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
	public static List<WebElement> purchasevoucherN_Row1BodyList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td")
	public static List<WebElement> purchasevoucherN_Row2BodyList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td")
	public static List<WebElement> purchasevoucherN_Row3BodyList;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td")
	public static List<WebElement> purchasevoucherN_Row4BodyList;
	
	@FindBy(xpath="//select[@id='ddlTolearenceType']")
	public static WebElement designWorkflowSettingTab_ToleranceDropdown;
	
	@FindBy(xpath="(//td[text()='PurOrd:3'])[2]//..//input")
	public static WebElement purchasevoucherN_WorkflowCheckboxBasedOnVoucher;
	
	@FindBy(xpath="//td[text()='PurOrd:3']//following::td[text()='STOCK ITEM']//..//INPUT")
	public static WebElement purchasevoucherN_WorkflowCheckboxBasedOnVoucher1;
	
	
	@FindBy(xpath="//td[text()='STD RATE COGS ITEM']//..//input")
	public static WebElement purchasevoucherN_WorkflowCheckboxBasedOnItemType;
	
	@FindBy(xpath="//select[@id='cmbToleranceType']")
	public static WebElement itemMaster_TolerenceDropdown;
	
	@FindBy(xpath="//td[contains(text(),'STOCK ITEM')]//..//input")
	public static WebElement itemMaster_CheckBoxBasedOnItemName;
	
	@FindBy(xpath="//a[@id='btnClose']")
	public static WebElement itemMaster_CloseBtn;
	
	@FindBy(xpath="//td[text()='PurOrd:4']//following::td[text()='STOCK ITEM']//..//INPUT")
	public static WebElement purchasevouchervAT_WorkflowCheckboxBasedOnVoucher;
	
	@FindBy(xpath="//td[text()='STD RATE COGS ITEM']//..//input")
	public static WebElement purchasevouchervAT_WorkflowCheckboxBasedOnVoucher1;
	
	@FindBy(xpath="(//td[text()='2'])[2]//..//input")
	public static WebElement purchasevouchervAT_HomepageCheckboxBasedOnVoucherNumber;
	
	
	@FindBy(xpath="(//td[text()='1'])[2]//..//input")
	public static WebElement purchasevouchervAT_HomepageCheckboxBasedOnVoucherNumber1;
	
	@FindBy(xpath="(//td[text()='2'])[2]//..//input")
	public static WebElement purchaseOrder_HomepageCheckboxBasedOnVoucherNumber;
	
	@FindBy(xpath="(//td[text()='5'])[2]//..//input")
	public static WebElement purchasevouchervAT_HomepageCheckboxBasedOnVoucherNumber5;
	
	@FindBy(xpath="(//td[text()='PurOrd:5'])[2]//..//input")
	public static WebElement purchasevouchervat_WorkflowCheckboxBasedOnVoucher5;
	
	@FindBy(xpath="//div[@id='id_search_menu']")
	public static WebElement purchasevouchervat_MenuSearchTxt;
	
	
	@FindBy(xpath="(//td[text()='PurOrd:5'])[2]")
	public static WebElement purchasevouchervat_WorkflowVoucherNumber;
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(xpath="//*[@id='id_Authorization_container']/div/div/nav/div[1]/a/div/span[2]")
	public static WebElement transAuthorLabel; 
	
	@FindBy(xpath="//*[@id='txtDoc']")
	public static WebElement documentNameDropdown; 
	
	    @FindBy(xpath="//*[@id='id_menu_tree_Receipts']/a/span")
	    public static WebElement receipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Payments']/a/span")
	    public static WebElement payments; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Petty Cash']/a/span")
	    public static WebElement pettyCash; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Post-Dated Receipts']/a/span")
	    public static WebElement postDatedReceipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Post-Dated Payments']/a/span")
	    public static WebElement postDatedPayments; 
		
	    @FindBy(xpath="//span[@class='treemenu_item_content_group_text col-xs-9'][contains(text(),'Purchases Vouchers')]")
	    public static WebElement purchasesVouchers; 
	    
		    @FindBy(xpath="//*[@id='id_menu_tree_Stock adjustment']/a/span")
		    public static WebElement stockAdjustment; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Returns']/a/span")
	    public static WebElement purchasesReturns; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Orders']/a/span")
	    public static WebElement purchasesOrders; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Job orders']/a/span")
		    public static WebElement jobOrders; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Material Receipt Notes']/a/span")
	    public static WebElement materialReceiptNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Invoices']/a/span")
	    public static WebElement salesInvoices; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Cash Sales']/a/span")
		    public static WebElement cashSales; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Hire-Purchase Sales']/a/span")
		    public static WebElement hirePurchaseSales; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_POS Sales']/a/span")
		    public static WebElement posSales; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Returns']/a/span")
	    public static WebElement salesReturns; 
		
	    @FindBy(xpath="//a[@id='2017']//span[contains(text(),'Sales Orders')]")
	    public static WebElement salesOrders; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Production Order']/a/span")
		    public static WebElement productionOrder; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Delivery Notes']/a/span")
	    public static WebElement deliveryNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Non-Standard Journal Entries']/a/span")
	    public static WebElement nonStandardJournalEntries; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Inter-Departmental JV']/a/span")
		    public static WebElement interDepartmentalJV; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Debit Notes (Linewise)']/a/span")
		    public static WebElement debitNotes_LineWise; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Credit Notes (Linewise)/Payroll']/a/span")
		    public static WebElement creditNotes_Linewise_Payroll ; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Fixed Asset Depreciation Voucher']/a/span")
		    public static WebElement fixedAssetDepreciationVoucher; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Journal Entries']/a/span")
	    public static WebElement journalEntries; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Debit Notes']/a/span")
	    public static WebElement debitNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Credit Notes']/a/span")
	    public static WebElement creditNotes; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Payroll Postings']/a/span")
		    public static WebElement payrollPostings; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Opening Balances']/a/span")
	    public static WebElement openingBalances; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Shortages in Stock']/a/span")
	    public static WebElement shortagesInStock; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Excesses in Stocks']/a/span")
	    public static WebElement excessesInStocks; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Stock Transfers']/a/span")
	    public static WebElement stockTransfers; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Opening Stocks']/a/span")
	    public static WebElement openingStocks; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Issues to Production']/a/span")
	    public static WebElement issuesToProduction; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Receipts from production']/a/span")
	    public static WebElement receiptsFromProduction; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Returns from Shop Floor']/a/span")
		    public static WebElement returnsFromShopFloor; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Work Issues']/a/span")
	    public static WebElement jobWorkIssues; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Work Receipts']/a/span")
	    public static WebElement jobWorkReceipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Quotations']/a/span")
	    public static WebElement purchasesQuotations; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Quotations']/a/span")
	    public static WebElement salesQuotations; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Order']/a/span")
	    public static WebElement jobOrder; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Production Process']/a/span")
	    public static WebElement productionProcess; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Material Requisition']/a/span")
	    public static WebElement materialRequisition; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Request For Quote']/a/span")
	    public static WebElement requestForQuote; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Forex JV']/a/span")
	    public static WebElement forexJV; 

	    
	    @FindBy(xpath="//a[contains(text(),'Miscellaneous')]")
	    public static WebElement  miscellaneousTab;
	    
	    @FindBy(xpath="//button[contains(text(),'Posting Details')]")
	    public static WebElement  postingDetailsBtn;
	    
	    
	    		
	    @FindBy(xpath="//*[@id='id_misc_updatestock_section']//following-sibling::span")
	    public static WebElement updateStockChkBox;
	    
	    @FindBy(xpath="//*[@id='id_misc_updatestock_section']/input")
	    public static WebElement updateStockChkBoxisSelected;

	   /* @FindBy(xpath="//span[@id='updateButton']")
    	public static WebElement  updateBtn;

    	@FindBy(xpath="//i[@class='icon-close icon-font6']")
    	public static WebElement  closeBtn;*/

	    
	    
	    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr/td")
		 public static List<WebElement> voucherGridBodyList;
	    
	    
	    
	    @FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
		public static List<WebElement> stockLedgerHometableRowCount;
	    
	    @FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeId']")
		public static WebElement sl_Dropdown1;
		
		@FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeViewId']")
		public static WebElement sl_Dropdown2;
		
		@FindBy(xpath="//label[@id='oncheckaccorderan']")
		public static WebElement sl_oncheckBtn;
		
		@FindBy(xpath="//input[@id='txtsrch-term']")
		public static WebElement sl_SearhItemTxt;
		
		@FindBy(xpath="//i[contains(@class,'icon-search theme_color-inverse')]")
		public static WebElement sl_SearchBtn;
		
		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		public static WebElement sl_MasterTypeTxt;
		
		@FindBy(xpath="//span[contains(@class,'icon-font6 icon-external-module theme_icon-color')]")
		public static WebElement sl_AutoAdjustColumnsBtn;
		
		@FindBy(xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]")
		public static WebElement sl_ItemGroupsBtn;
		
		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement sl_HeaderSelectChkBox;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-schedule')]")
		public static WebElement sl_ScheduleBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-custamize')]")
		public static WebElement sl_CustomizeBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-filter')]")
		public static WebElement sl_FilterBtn;
		
		@FindBy(xpath="//i[@class='icon-ok hiconright2']")
		public static WebElement sl_OkBtn;
		
		@FindBy(xpath="(//i[@class='icon-close hiconright2'])[1]")
		public static WebElement sl_CloseBtn;
		
		@FindBy(xpath="//select[@id='DateOptions_']")
		public static WebElement sl_DateOptionDropdown;
		
		@FindBy(xpath="//input[@id='id_starting_date_']")
		public static WebElement sl_StartDateTxt;
		
		@FindBy(xpath="//td[@id='id_starting_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
		public static WebElement sl_StartDateCalanderBtn;
		
		@FindBy(xpath="//input[@id='id_ending_date_']")
		public static WebElement sl_EndDateTxt;
		
		@FindBy(xpath="//td[@id='id_ending_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
		public static WebElement sl_EndDateCalanderBtn;
		
		@FindBy(xpath="//input[@id='RITCheckbox__3']")
		public static WebElement sl_IncludeServiceTypeItemChkBox;
		
		@FindBy(xpath="//select[@id='RITLayout_']")
		public static WebElement sl_LayoutDropdown;
		
		@FindBy(xpath="//select[@id='RITOutput_']")
		public static WebElement sl_OutputDropdown;
		
		@FindBy(xpath="//td[text()='Grand Total']")
		public static WebElement  grandTotalTxt;
		
		@FindBy(xpath="//input[@id='selectAllMasters_']")
		public static WebElement sl_SelectAllItemsChkBox;
		
		@FindBy(xpath="//div[contains(@class,'first')]//input[contains(@class,'btn btn-xs Fbutton')]")
		public static WebElement sl_FirstBtn;
		
		@FindBy(xpath="//div[contains(@class,'prev')]//input[contains(@class,'btn btn-xs Fbutton')]")
		public static WebElement sl_PreviousBtn;
		
		@FindBy(xpath="//input[@id='btn1']")
		public static WebElement sl_PageBtn;
		
		@FindBy(xpath="//div[contains(@class,'next')]//input[contains(@class,'btn btn-xs Fbutton')]")
		public static WebElement sl_NextBtn;
		
		@FindBy(xpath="//div[contains(@class,'End')]//input[contains(@class,'btn btn-xs Fbutton')]")
		public static WebElement sl_EndBtn;
		
		@FindBy(xpath="//tr[1]//td[8]//div[1]//label[1]")
		public static WebElement sl_1stRowChkBox;
		
		@FindBy(xpath="//tr[2]//td[8]//div[1]//label[1]")
		public static WebElement sl_2ndRowChkBox;
		
		@FindBy(xpath="//div[@id='dvReportDetails']//table/tbody")
		public static WebElement report_Body;
		
		@FindBy(xpath="//input[@id='RITTable__1']")
		public static WebElement listingOfDocWorkFlowTxt;
		

		
		
		
		
		
		// Inventory Reports
		
		@FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
		public static WebElement  inventoryReportsMenu; 
		
			@FindBy(xpath="//span[contains(text(),'Item Query')]")
			public static WebElement itemQuery;
			
			@FindBy(xpath="//span[contains(text(),'Stock Ledger')]")
			public static WebElement  stockLedger;
			
			@FindBy(xpath="//span[contains(text(),'Opening Stocks Register')]")
			public static WebElement  openingStocksRegister;
			
			@FindBy(xpath="//span[contains(text(),'Stock Statement')]")
			public static WebElement  stockStatement;
					
			@FindBy(xpath="//*[@id='575']/span")
			public static WebElement  stockMovement;
			
			@FindBy(xpath="//*[@id='576']/span")
			public static WebElement  multiLevelStockMovement;
			
			@FindBy(xpath="//span[contains(text(),'Virtual Stock Analysis')]")
			public static WebElement  virtualStockAnalysis;
			
			@FindBy(xpath="//a[@id='578']")
			public static WebElement  stockValuation;
			
			@FindBy(xpath="//a[@id='656']")
			public static WebElement  stockReportByTag;
			
			@FindBy(xpath="//a[@id='579']//span[contains(text(),'ABC Analysis')]")
			public static WebElement  abcAnalysis;
			
			@FindBy(xpath="//span[contains(text(),'Stock Analysis by Batch')]")
			public static WebElement  stockAnalysisByBatch;
			
			@FindBy(xpath="//span[contains(text(),'Stock Analysis by RMA')]")
			public static WebElement  stockAnalysisByRMA;
			
			@FindBy(xpath="//a[@id='540']//span[contains(text(),'Bins Report')]")
			public static WebElement  binsReportMenu;
			
				@FindBy(xpath="//*[@id='587']/span")
				public static WebElement  stockDetailsByBins;
			
				@FindBy(xpath="//*[@id='588']/span")
				public static WebElement  stockBalancesByBins;
				
				@FindBy(xpath="//*[@id='589']/span")
				public static WebElement  stockBalancesByItemByBins;
				
				@FindBy(xpath="//span[contains(text(),'Expired Stock by Bins')]")
				public static WebElement  expiredStockByBins;		
			
			@FindBy(xpath="//span[contains(text(),'Stock balance by warehouse')]")
			public static WebElement  stockBalanceByWarehouse;
			
			@FindBy(xpath="//span[contains(text(),'Stock ageing analysis')]")
			public static WebElement  stockAgeingAnalysisMenu;
				
				@FindBy(xpath="//*[@id='582']/span")
				public static WebElement  ageingAnalysis;
				
				@FindBy(xpath="//*[@id='622']/span")
				public static WebElement  ageingAnalysisByBatch;
				
				@FindBy(xpath="//*[@id='623']/span")
				public static WebElement  ageingAnalysisByRMA;		
				
				@FindBy(xpath="//*[@id='591']/span")
				public static WebElement  ageingStockByBins;
						
				@FindBy(xpath="//*[@id='646']/span")
				public static WebElement  ageingByItemByBins;		

			@FindBy(xpath="//span[contains(text(),'Reorder Report')]")
			public static WebElement reorderReport;
			
			@FindBy(xpath="//a[@id='584']//span[contains(text(),'Fast Moving Item')]")
			public static WebElement  fastMovingItem;
					
			@FindBy(xpath="//a[@id='585']//span[contains(text(),'Slow Moving Item')]")
			public static WebElement  slowMovingItem;
			
			@FindBy(xpath="//span[contains(text(),'Peak/Low Balances')]")
			public static WebElement  peakORLowBalances;
			
			@FindBy(xpath="//span[contains(text(),'Best Selling Item')]")
			public static WebElement  bestSellingItem;
		
			@FindBy(xpath="//span[contains(text(),'Raise Indent Item with Low Stock')]")
			public static WebElement  raiseIndentItemWithLowStock;
			
			@FindBy(xpath="//span[contains(text(),'Stock transfer report')]")
			public static WebElement  stockTransferReport;
			
			@FindBy(xpath="//span[contains(text(),'Raise request for quote')]")
			public static WebElement  raiseRequestForQuote;
			
			@FindBy(xpath="//span[contains(text(),'Stock reservation report')]")
			public static WebElement  stockReservationReport;
			
			@FindBy(xpath="//span[contains(text(),'Transaction type-wise stock report')]")
			public static WebElement  transactionTypeWiseStockReport;
			
			@FindBy(xpath="//span[contains(text(),'Actual consumption report')]")
			public static WebElement  actualConsumptionReport;
		
		@FindBy(xpath="//span[contains(text(),'Order Management')]")
		public static WebElement  orderManagementMenu; 

			@FindBy(xpath="//*[@id='600']/span")
			public static WebElement  analysisOfLinkedORUnlinkedDocumentsMenu;
					
				@FindBy(xpath="//*[@id='601']/span")
				public static WebElement  listingOfDocuments;
				
				@FindBy(xpath="//*[@id='602']/span")
				public static WebElement listingOfDocumentsByDueDate;
						
				@FindBy(xpath="//*[@id='603']/span")
				public static WebElement  ageingOfPendingDocuments;
				
				@FindBy(xpath="//*[@id='604']/span")
				public static WebElement  ageingofPendingDocumentsByDueDate;
				
				@FindBy(xpath="//*[@id='624']/span")
				public static WebElement  linkChainAnalysis;
				
				@FindBy(xpath="//*[@id='657']/span")
				public static WebElement  pendingVoucherReport;
			
			@FindBy(xpath="//*[@id='201']/span")
			public static WebElement  quotationAnalysis;
			
			@FindBy(xpath="//*[@id='555']/span")
			public static WebElement  purchasesQuotation;
			
			@FindBy(xpath="//*[@id='556']/span")
			public static WebElement  salesQuotation;
			
			@FindBy(xpath="//*[@id='574']/span")
			public static WebElement  lowestQuotation;
			
			
		
		
		
		////////

		@FindBy(xpath="//i[contains(@class,'theme_button_color dropdown-toggle')]")
		public static WebElement report_sortingBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-refresh')]")
		public static WebElement report_RefreshBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-print')]")
		public static WebElement report_PrintBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-export')]")
		public static WebElement report_ExportBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-graph ImagesinArabic')]")
		public static WebElement report_GraphBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-backtrack')]")
		public static WebElement report_BackTrackBtn;
				
		@FindBy(xpath="//span[@id='reportCustomize_']//i[contains(@class,'icon-font6 icon-custamize')]")
		public static WebElement report_ReportCustomizeBtn;
				
		@FindBy(xpath="//span[@id='filterIcon_']//i[contains(@class,'icon-font6 icon-filter')]")
		public static WebElement report_FilterBtn;
		
		@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
		public static WebElement  report_FilterCustomizeBtn;
		
		@FindBy(xpath="//span[@id='a']")
		public static WebElement  report_Filter_FilterBtn;
		
		@FindBy(xpath="//*[@id='551_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
		public static WebElement  reportsAdvanced_WhereDropDown;
		
		@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
		public static WebElement  reportsAdvanced_SelectFielddropdown;
		
		@FindBy(xpath="//table/tbody/tr/td[3]/select")
		public static WebElement  reportsAdvanced_SelectOperatorDropDown;
		
		@FindBy(xpath="//table/tbody/tr/td[4]/select")
		public static WebElement  reportsAdvanced_ComparewithDropDown;
		
		@FindBy(xpath="//table/tbody/tr/td[5]/input")
		public static WebElement  reportsAdvanced_ValueTxt;
		
		@FindBy(xpath="//input[@id='advancefilter_master_551_0']")
		public static WebElement  reportsAdvanced_EnterValue;
		
		@FindBy(xpath="//table/tbody/tr/td[7]/span")
		public static WebElement  reportsAdvanced_AddIconBtn;
		
		@FindBy(xpath="//table/tbody/tr/td[6]/span")
		public static WebElement  reportsAdvanced_DeleteIcon1Btn;
		
		@FindBy(xpath="//table/tbody/tr[2]/td[6]/span")
		public static WebElement  reportsAdvanced__DeleteIcon2Btn;
		
		@FindBy(xpath="//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='536870916']")
		public static WebElement  reports_AdvancedFilter_SelectField_WH_ExpandBtn;
		
		@FindBy(xpath="//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='5058']")
		public static WebElement  reports_AdvancedFilter_SelectField_WH_NameBtn;
		
		@FindBy(xpath="//input[@id='chkSaveFilter']")
		public static WebElement  report_FilterSaveFilterPermanentlyChkBox;
		
		@FindBy(xpath="//span[@id='filterRefresh']")
		public static WebElement  report_Filter_RefreshBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon icon-ok')]")
		public static WebElement  report_FilterOkBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon icon-close')]")
		public static WebElement  report_FilterCancelBtn;
				
		@FindBy(xpath="//div[@id='dvfilter_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
		public static WebElement report_FilterDownBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-analyze')]")
		public static WebElement report_AnalyzeBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-cross-reference')]")
		public static WebElement report_CrossReferenceBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-options')]")
		public static WebElement report_OptionsBtn;
				
		@FindBy(xpath="//div[@id='dvoptions_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
		public static WebElement report_OptionsDownBtn;
				
		/*@FindBy(xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]")
		public static WebElement report_CloseBtn;
				
		@FindBy(xpath="//button[@id='frstPage_']")
		public static WebElement report_FirstBtn;
				
		@FindBy(xpath="//button[@id='prvPage_']")
		public static WebElement report_PreviousBtn;
				
		@FindBy(xpath="//button[@id='pgnumber_']")
		public static WebElement report_PageNoBtn;
				
		@FindBy(xpath="//button[@id='nxtPage_']")
		public static WebElement report_NextBtn;
				
		@FindBy(xpath="//button[@id='lstPage_']")
		public static WebElement report_LastBtn;*/
		
		@FindBy(xpath="(//i[@class='icon-close hiconright2'])[2]")
		public static WebElement report_CloseBtn;
				
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[1]")
		public static WebElement report_FirstBtn;
				
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[2]")
		public static WebElement report_PreviousBtn;
				
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[3]")
		public static WebElement report_PageNoBtn;
				
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[4]")
		public static WebElement report_NextBtn;
				
		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[5]")
		public static WebElement report_LastBtn;
		
		@FindBy(xpath="//input[@id='txtSearchReport']")
		public static WebElement report_SearchTxt;
		
		

		@FindBy(xpath="//*[@id='trRender_0']/td[2]")
		public static WebElement sl_1stRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_0']/td[3]")
		public static WebElement sl_1stRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[4]")
		public static WebElement sl_1stRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[5]")
		public static WebElement sl_1stRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[6]")
		public static WebElement sl_1stRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[7]")
		public static WebElement sl_1stRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[8]")
		public static WebElement sl_1stRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[9]")
		public static WebElement sl_1stRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[10]")
		public static WebElement sl_1stRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[11]")
		public static WebElement sl_1stRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[12]")
		public static WebElement sl_1stRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[13]")
		public static WebElement sl_1stRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[14]")
		public static WebElement sl_1stRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[15]")
		public static WebElement sl_1stRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[16]")
		public static WebElement sl_1stRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[17]")
		public static WebElement sl_1stRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[18]")
		public static WebElement sl_1stRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[19]")
		public static WebElement sl_1stRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[20]")
		public static WebElement sl_1stRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[21]")
		public static WebElement sl_1stRow20thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[22]")
		public static WebElement sl_1stRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[23]")
		public static WebElement sl_1stRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[24]")
		public static WebElement sl_1stRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[25]")
		public static WebElement sl_1stRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[26]")
		public static WebElement sl_1stRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[27]")
		public static WebElement sl_1stRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[28]")
		public static WebElement sl_1stRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[29]")
		public static WebElement sl_1stRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[30]")
		public static WebElement sl_1stRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[31]")
		public static WebElement sl_1stRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[32]")
		public static WebElement sl_1stRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[33]")
		public static WebElement sl_1stRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[34]")
		public static WebElement sl_1stRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[35]")
		public static WebElement sl_1stRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[36]")
		public static WebElement sl_1stRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[37]")
		public static WebElement sl_1stRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[38]")
		public static WebElement sl_1stRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[39]")
		public static WebElement sl_1stRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[40]")
		public static WebElement sl_1stRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[41]")
		public static WebElement sl_1stRow40thCol;
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_1']/td[2]")
		public static WebElement sl_2ndRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_1']/td[3]")
		public static WebElement sl_2ndRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[4]")
		public static WebElement sl_2ndRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[5]")
		public static WebElement sl_2ndRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[6]")
		public static WebElement sl_2ndRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[7]")
		public static WebElement sl_2ndRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[8]")
		public static WebElement sl_2ndRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[9]")
		public static WebElement sl_2ndRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[10]")
		public static WebElement sl_2ndRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[11]")
		public static WebElement sl_2ndRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[12]")
		public static WebElement sl_2ndRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[13]")
		public static WebElement sl_2ndRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[14]")
		public static WebElement sl_2ndRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[15]")
		public static WebElement sl_2ndRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[16]")
		public static WebElement sl_2ndRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[17]")
		public static WebElement sl_2ndRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[18]")
		public static WebElement sl_2ndRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[19]")
		public static WebElement sl_2ndRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[20]")
		public static WebElement sl_2ndRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[21]")
		public static WebElement sl_2ndRow20thCol;
		
		
		
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_2']/td[2]")
		public static WebElement sl_3rdRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_2']/td[3]")
		public static WebElement sl_3rdRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[4]")
		public static WebElement sl_3rdRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[5]")
		public static WebElement sl_3rdRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[6]")
		public static WebElement sl_3rdRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[7]")
		public static WebElement sl_3rdRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[8]")
		public static WebElement sl_3rdRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[9]")
		public static WebElement sl_3rdRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[10]")
		public static WebElement sl_3rdRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[11]")
		public static WebElement sl_3rdRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[12]")
		public static WebElement sl_3rdRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[13]")
		public static WebElement sl_3rdRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[14]")
		public static WebElement sl_3rdRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[15]")
		public static WebElement sl_3rdRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[16]")
		public static WebElement sl_3rdRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[17]")
		public static WebElement sl_3rdRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[18]")
		public static WebElement sl_3rdRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[19]")
		public static WebElement sl_3rdRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[20]")
		public static WebElement sl_3rdRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[21]")
		public static WebElement sl_3rdRow20thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[22]")
		public static WebElement sl_3rdRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[23]")
		public static WebElement sl_3rdRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[24]")
		public static WebElement sl_3rdRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[25]")
		public static WebElement sl_3rdRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[26]")
		public static WebElement sl_3rdRow25thCol;
		
	
		
		
		
	    
	
	//////Name Text Field   
		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH']")
	public static WebElement nameTxt; 
	
	@FindBy(xpath="//*[@id='ctrlAuthorizationH_input_settings']/span")
	public static WebElement nameSettingBtn; 

	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_heading']")
	    public static WebElement nameSettingPop_CustomizeDisplayColoumnLabel;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_container']")
	    public static WebElement nameSettingPop_sAuthorizationTxt;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[1]")
	    public static WebElement nameSettingPop_StandardFieldsBtn;
	
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_list']")
		    public static WebElement nameSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_header']")
		    public static WebElement nameSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_alignment']")
		    public static WebElement nameSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_width']")
		    public static WebElement nameSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
			public static WebElement nameSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
			public static WebElement nameSettingPop_StandardFields_CancelBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[2]")
	    public static WebElement nameSettingPop_DeleteColoumnBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
	    public static WebElement nameSettingPop_OkBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
	    public static WebElement nameSettingPop_CancelBtn;
		
	@FindBy(xpath="//*[@id='chkActive']")
	public static WebElement activeChkBox;  
	
	@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
	public static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 
		
	
	//Transaction Authorization Clear,Delete,Save,Cancel
	
	/*@FindBy(xpath="//*[@id='ulAuthBtns']/li[1]/span/i")
	public static WebElement clearbtn; 
	
	@FindBy(xpath="//span[@id='spndeleteProfile']")
	public static WebElement deleteBtn; 
	*/
	
	
	
	
	
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	public static WebElement tranAuthCancelBtn; 
		
	@FindBy(xpath="//*[@id='btnSaveAuthorization']")
	public static WebElement tranAuthSaveBtn; 
	
	//Action On Initial Rejection
	    
	@FindBy(xpath="//*[@id='chkFinancialAccountingMain']")
	public static WebElement financialAccountingChkBox; 
	
	@FindBy(xpath="//*[@id='chkBaseLinkMain']")
	public static WebElement linksBaseChkBox; 
	
	@FindBy(xpath="//*[@id='chkLinksMain']")
	public static WebElement linksChkBox; 
	
	@FindBy(xpath="//*[@id='spnAddLevel']/i")
	public static WebElement addLevelBtn; 
	
	@FindBy(xpath="//*[@id='spnAddParallel'']/i")
	public static WebElement addParallel;    
	
	@FindBy(xpath="//i[@id='id_StartNode']")
	public static WebElement startPointBtn; 
		
	
	//After Clicking On AddLevel/Add Parallel Button The Authorization Definition POp Rises--Related Fields 
	
	@FindBy(xpath="//*[@id='id_report_popup_heading']")
	public static WebElement authDefLabel; 
		
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[1]/a/span")
	public static WebElement conditionTab; 
		
	//Description Fields
	
	@FindBy(xpath="//*[@id='txtDescription']")
	public static WebElement descriptionTxt; 
		
	@FindBy(xpath="//*[@id='chkConditionNotRequired']")
	public static WebElement conditionNotRequiredChkBox; 

	
	@FindBy(xpath="//*[@id='chkCreditLimitExceeded']")
	public static WebElement creditLimitExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkBudgetExceeded']")
	public static WebElement budgetExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeCashCheck']")
	public static WebElement negativeCashCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkLineWiseAuthorization']")
	public static WebElement lineWiseAuthorizationChkBox; 
		
	@FindBy(xpath="//*[@id='chkCreditDaysExceeded']")
	public static WebElement creditDaysExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeStockCheck']")
	public static WebElement negativeStockCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkDateRange']")
	public static WebElement dateRangeChkBox; 
		
	@FindBy(xpath="//*[@id='dpFromDate']")
	public static WebElement fromDateTxt; 
		
	@FindBy(xpath="//*[@id='dpToDate']")
	public static WebElement toDateTxt; 
	
	@FindBy(xpath="//*[@id='chkTimeRange']")
	public static WebElement timeRangeChkBox;
		
	@FindBy(xpath="//*[@id='chkTimeRange']")
	public static WebElement fromTimeTxt; 
		
	@FindBy(xpath="//*[@id='tpToTime']")
	public static WebElement totimeTxt; 
		
	//Condition------Condition Fields
				   
	
	
	
	
	    //Selection Field  Inner Fields
	
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='1']")
		public static WebElement  DocNo;
		
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='2']")
		public static WebElement  Date;
		
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='80']")
		public static WebElement  Time;
					
		//Cash Bank AC
					
		@FindBy(xpath="//*[@id='4']")
		public static WebElement  CashBankACExpandBtn;
		
			@FindBy(xpath="//*[@id='5002']")
			public static WebElement  CashBankAC_Name;
			
			@FindBy(xpath="//*[@id='5003']")
			public static WebElement  CashBankAC_Code;
			
			@FindBy(xpath="//*[@id='127']")
			public static WebElement  CashBankAC_Alias;
			
			@FindBy(xpath="//*[@id='5004']")
			public static WebElement  CashBankAC_AccountType;
			
			@FindBy(xpath="//*[@id='300023']")
			public static WebElement  CashBankAC_Address;
			
			@FindBy(xpath="//*[@id='303786']")
			public static WebElement  CashBankAC_AllowCustomerPortal;
			
			@FindBy(xpath="//*[@id='302968']")
			public static WebElement  CashBankAC_BankAC;
			
			@FindBy(xpath="//*[@id='303935']")
			public static WebElement  CashBankAC_BankAccountName;
			
			@FindBy(xpath="//*[@id='303936']")
			public static WebElement  CashBankAC_BankAccountNumber;
			
			@FindBy(xpath="//*[@id='302774']")
			public static WebElement  CashBankAC_ChequeDiscountlimit;
			
			@FindBy(xpath="//*[@id='300083']")
			public static WebElement  CashBankAC_City1;
			
			@FindBy(xpath="//*[@id='300084']")
			public static WebElement  CashBankAC_City2;
			
			@FindBy(xpath="//*[@id='300018']")
			public static WebElement  CashBankAC_ConsolidationMethod;
			
			@FindBy(xpath="//*[@id='5006']")
			public static WebElement  CashBankAC_CreditDays;
			
			@FindBy(xpath="//*[@id='5005']")
			public static WebElement  CashBankAC_CreditLimit;
			
			@FindBy(xpath="//*[@id='300012']")
			public static WebElement  CashBankAC_DebitCreditproposal;
			
			@FindBy(xpath="//*[@id='300013']")
			public static WebElement  CashBankAC_DebitCreditRequired;
			
			@FindBy(xpath="//*[@id='300024']")
			public static WebElement  CashBankAC_DeliveryAddress;
			
			@FindBy(xpath="//*[@id='300249']")
			public static WebElement  CashBankAC_Email;
			
			@FindBy(xpath="//*[@id='300014']")
			public static WebElement  CashBankAC_ExchangeAdjustmentGainAC;
			
			@FindBy(xpath="//*[@id='300015']")
			public static WebElement  CashBankAC_ExchangeAdjustmentLossAC;
			
			@FindBy(xpath="//*[@id='303574']")
			public static WebElement  CashBankAC_Faxno;
			
			@FindBy(xpath="//*[@id='304269']")
			public static WebElement  CashBankAC_FinanceEmail;
			
			@FindBy(xpath="//*[@id='303937']")
			public static WebElement  CashBankAC_IFSCcode;
			
			@FindBy(xpath="//*[@id='303785']")
			public static WebElement  CashBankAC_Password;
			
			@FindBy(xpath="//*[@id='304047']")
			public static WebElement  CashBankAC_PaymentType;
			
			@FindBy(xpath="//*[@id='304157']")
			public static WebElement  CashBankAC_PDCdiscountedAmount;
			
			@FindBy(xpath="//*[@id='300027']")
			public static WebElement  CashBankAC_Pin1;
			
			@FindBy(xpath="//*[@id='300028']")
			public static WebElement  CashBankAC_Pin2;
			
			@FindBy(xpath="//*[@id='304379']")
			public static WebElement  CashBankAC_Portalemail;
			
			@FindBy(xpath="//*[@id='300016']")
			public static WebElement  CashBankAC_PrimaryAccount;
			
			@FindBy(xpath="//*[@id='302870']")
			public static WebElement  CashBankAC_RateOFInterest;
			
			@FindBy(xpath="//*[@id='300250']")
			public static WebElement  CashBankAC_SendEmailtoCustomer;
			
			@FindBy(xpath="//*[@id='303573']")
			public static WebElement  CashBankAC_TelNo;
			
			@FindBy(xpath="//*[@id='8388609']")
			public static WebElement  CashBankAC_GroupLevel;
									
			@FindBy(xpath="//*[@id='8388864']")
			public static WebElement  CashBankAC_GroupLevelCode;
			
			@FindBy(xpath="//*[@id='8388610']")
			public static WebElement  CashBankAC_GroupLeve2;
			
			@FindBy(xpath="//*[@id='8388865']")
			public static WebElement  CashBankAC_GroupLeve2Code;
			
			@FindBy(xpath="//*[@id='8388611']")
			public static WebElement  CashBankAC_GroupLeve3;
			
			@FindBy(xpath="//*[@id='8388866']")
			public static WebElement  CashBankAC_GroupLeve3Code;
			
			/////
			@FindBy(xpath="//*[@id='8388612']")
			public static WebElement  CashBankAC_GroupLeve4;
			
			@FindBy(xpath="//*[@id='8388867']")
			public static WebElement  CashBankAC_GroupLeve4Code;
						
			@FindBy(xpath="//*[@id='8388613']")
			public static WebElement  CashBankAC_GroupLeve5;
			
			@FindBy(xpath="//*[@id='8388868']")
			public static WebElement  CashBankAC_GroupLeve5Code;
						
			@FindBy(xpath="//*[@id='8388614']")
			public static WebElement  CashBankAC_GroupLeve6;
			
			@FindBy(xpath="//*[@id='8388869']")
			public static WebElement  CashBankAC_GroupLeve6Code;
						
			@FindBy(xpath="//*[@id='8388615']")
			public static WebElement  CashBankAC_GroupLeve7;
			
			@FindBy(xpath="//*[@id='8388870']")
			public static WebElement  CashBankAC_GroupLeve7Code;
						
			@FindBy(xpath="//*[@id='5154']")
			public static WebElement  CashBankAC_Name2;			
				
			@FindBy(xpath="//*[@id='5155']")
			public static WebElement  CashBankAC_Code2;			
				
			@FindBy(xpath="//*[@id='300568']")
			public static WebElement  CashBankAC_State;			
				
			@FindBy(xpath="//*[@id='8388609']")
			public static WebElement  CashBankAC_GroupLevel1;			
				
			@FindBy(xpath="//*[@id='8388864']")
			public static WebElement  CashBankAC_GroupLevel1Code;			
					
					
			//Department
			
			@FindBy(xpath="//*[@id='268435459']")
			public static WebElement  DepartmentExpansion;
			
				@FindBy(xpath="//*[@id='5042']")
				public static WebElement  Dept_Name;
				
				@FindBy(xpath="//*[@id='5043']")
				public static WebElement  Dept_Code;
				
				@FindBy(xpath="//*[@id='8388609']")
				public static WebElement  Dept_GroupLevel1;
				
				@FindBy(xpath="//*[@id='8388864']")
				public static WebElement  Dept_GroupLevel1Code;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='67108883']")
			public static WebElement  SNarration;	
			
			@FindBy(xpath="//*[@id='67108869']")
			public static WebElement  sChequeNo;
			
			@FindBy(xpath="//*[@id='12']")
			public static WebElement  AccountExansiion;
				
				@FindBy(xpath="//*[@id='5002']")
				public static WebElement  Account_Name;
				
				@FindBy(xpath="//*[@id='5003']")
				public static WebElement  Account_Code;
				
				@FindBy(xpath="//*[@id='127']")
				public static WebElement  Account_Alias;
				
				@FindBy(xpath="//*[@id='5004']")
				public static WebElement  Account_AccountType;
				
				@FindBy(xpath="//*[@id='300023']")
				public static WebElement  Account_Address;
				
				@FindBy(xpath="//*[@id='303786']")
				public static WebElement  Account_AllowCustomerPortal;
				
				@FindBy(xpath="//*[@id='302968']")
				public static WebElement  Account_BankAC;
				
				@FindBy(xpath="//*[@id='303935']")
				public static WebElement  Account_BankAccountName;
				
				@FindBy(xpath="//*[@id='303936']")
				public static WebElement  Account_BankAccountNumber;
				
				@FindBy(xpath="//*[@id='302774']")
				public static WebElement  Account_ChequeDiscountlimit;
				
				@FindBy(xpath="//*[@id='300083']")
				public static WebElement  Account_City1;
				
				@FindBy(xpath="//*[@id='300084']")
				public static WebElement  Account_City2;
				
				@FindBy(xpath="//*[@id='300018']")
				public static WebElement  Account_ConsolidationMethod;
				
				@FindBy(xpath="//*[@id='5006']")
				public static WebElement  Account_CreditDays;
				
				@FindBy(xpath="//*[@id='5005']")
				public static WebElement  Account_CreditLimit;
				
				@FindBy(xpath="//*[@id='300012']")
				public static WebElement  Account_DebitCreditproposal;
				
				@FindBy(xpath="//*[@id='300013']")
				public static WebElement  Account_DebitCreditRequired;
				
				@FindBy(xpath="//*[@id='300024']")
				public static WebElement  Account_DeliveryAddress;
				
				@FindBy(xpath="//*[@id='300249']")
				public static WebElement  Account_Email;
				
				@FindBy(xpath="//*[@id='300014']")
				public static WebElement  Account_ExchangeAdjustmentGainAC;
				
				@FindBy(xpath="//*[@id='300015']")
				public static WebElement  Account_ExchangeAdjustmentLossAC;
				
				@FindBy(xpath="//*[@id='303574']")
				public static WebElement  Account_Faxno;
				
				@FindBy(xpath="//*[@id='304269']")
				public static WebElement  Account_FinanceEmail;
				
				@FindBy(xpath="//*[@id='303937']")
				public static WebElement  Account_IFSCcode;
				
				@FindBy(xpath="//*[@id='303785']")
				public static WebElement  Account_Password;
				
				@FindBy(xpath="//*[@id='304047']")
				public static WebElement  Account_PaymentType;
				
				@FindBy(xpath="//*[@id='304157']")
				public static WebElement  Account_PDCdiscountedAmount;
				
				@FindBy(xpath="//*[@id='300027']")
				public static WebElement  Account_Pin1;
				
				@FindBy(xpath="//*[@id='300028']")
				public static WebElement  Account_Pin2;
				
				@FindBy(xpath="//*[@id='304379']")
				public static WebElement  Account_Portalemail;
				
				@FindBy(xpath="//*[@id='300016']")
				public static WebElement  Account_PrimaryAccount;
				
				@FindBy(xpath="//*[@id='302870']")
				public static WebElement  Account_RateOFInterest;
				
				@FindBy(xpath="//*[@id='300250']")
				public static WebElement  Account_SendEmailtoCustomer;
				
				@FindBy(xpath="//*[@id='303573']")
				public static WebElement  Account_TelNo;
				
				@FindBy(xpath="//*[@id='8388609']")
				public static WebElement  Account_GroupLevel;
										
				@FindBy(xpath="//*[@id='8388864']")
				public static WebElement  Account_GroupLevelCode;
				
				@FindBy(xpath="//*[@id='8388610']")
				public static WebElement  Account_GroupLeve2;
				
				@FindBy(xpath="//*[@id='8388865']")
				public static WebElement  Account_GroupLeve2Code;
				
				@FindBy(xpath="//*[@id='8388611']")
				public static WebElement  Account_GroupLeve3;
				
				@FindBy(xpath="//*[@id='8388866']")
				public static WebElement  Account_GroupLeve3Code;
	
				@FindBy(xpath="//*[@id='8388612']")
				public static WebElement  Account_GroupLeve4;
				
				@FindBy(xpath="//*[@id='8388867']")
				public static WebElement  Account_GroupLeve4Code;
							
				@FindBy(xpath="//*[@id='8388613']")
				public static WebElement  Account_GroupLeve5;
				
				@FindBy(xpath="//*[@id='8388868']")
				public static WebElement  Account_GroupLeve5Code;
							
				@FindBy(xpath="//*[@id='8388614']")
				public static WebElement  Account_GroupLeve6;
				
				@FindBy(xpath="//*[@id='8388869']")
				public static WebElement  Account_GroupLeve6Code;
							
				@FindBy(xpath="//*[@id='8388615']")
				public static WebElement  Account_GroupLeve7;
				
				@FindBy(xpath="//*[@id='8388870']")
				public static WebElement  Account_GroupLeve7Code;
							
				@FindBy(xpath="//*[@id='5154']")
				public static WebElement  Account_Name2;			
					
				@FindBy(xpath="//*[@id='5155']")
				public static WebElement  Account_Code2;			
					
				@FindBy(xpath="//*[@id='300568']")
				public static WebElement  Account_State;			
					
				@FindBy(xpath="//*[@id='8388609']")
				public static WebElement  Account_GroupLevel1;			
					
				@FindBy(xpath="//*[@id='8388864']")
				public static WebElement  Account_GroupLevel1Code;	
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='4']")
			public static WebElement  vendorAC;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='536870916']")
			public static WebElement  warehouse;
			
			@FindBy(xpath="//input[@id='id_body_536870916']")
			public static WebElement  warehouseTxt;
			
			
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='23']")
			public static WebElement  item;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='24']")
			public static WebElement  unit;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='33554437']")
			public static WebElement  RD;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='1107296261']")
			public static WebElement  voucherRD;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='35']")
			public static WebElement  LpurchaseVoucherN;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='26']")
			public static WebElement  Quantity;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='27']")
			public static WebElement  Rate;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='28']")
			public static WebElement  Gross;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='1073741852']")
			public static WebElement  VoucherGross;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='13']")
			public static WebElement  Batch;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='85']")
			public static WebElement  Bins;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='37']")
			public static WebElement  ExpDate;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='38']")
			public static WebElement  RMA;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='134217734']")
			public static WebElement  FD;
			
			@FindBy(xpath="//*[@id='16']")
			public static WebElement  Amount;
			
			@FindBy(xpath="//*[@id='83']")
			public static WebElement  Reference;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='75']")
			public static WebElement  Net;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='78']")
			public static WebElement  User;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='147']")
			public static WebElement  Role;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='148']")
			public static WebElement  UserVal1;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='149']")
			public static WebElement  UserVal2;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='150']")
			public static WebElement  UserVal3;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='151']")
			public static WebElement  UserVal4;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='152']")
			public static WebElement  UserVal5;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='67108920']")
			public static WebElement  sRemarks;
	
			
		
	//Completion Inner Fields			
      
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[1]/select")
	public static WebElement Row1ConjunctionDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[2]/input")
	public static WebElement Row1SelectFieldTxt; 
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[3]/select")
	public static WebElement Row1SelectOperatorDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[4]/select")
	public static WebElement Row1CompareWithDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[5]/input")
	public static WebElement Row1ValueTxt; 
	
	
	@FindBy(xpath="//input[@id='advancefilter_master_68_0_']")   //*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[5]/input
	public static WebElement InputValueTxt; 
	
	@FindBy(xpath="//*[@id='advancefilter_master_68_0__table_body']/tr/td[2]")
	public static List<WebElement> Row1ValueList; 
	
	
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[1]/select")
	public static WebElement Row2ConjunctionDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[2]/input")
	public static WebElement Row2SelectFieldTxt; 
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[3]/select")
	public static WebElement Row2SelectOperatorDropdown; 
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[4]/select")
	public static WebElement Row2CompareWithDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[5]/input")
	public static WebElement Row2ValueTxt;
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[6]/span")
	public static WebElement Row1TransAuthConditionDeleteBtn; 
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[1]/td[7]/span")
	public static WebElement Row1TransAuthConditionAddBtn;
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[6]/span")
	public static WebElement Row2TransAuthConditionDeleteBtn; 
			
	
	
	
	///status Update----------
	
	@FindBy(xpath="//*[@id='id_txtStatusUpdate']")
	public static WebElement statusUpdateDropdown; 
		
	@FindBy(xpath="//*[@id='txtAuthDefReason']")
	public static WebElement reasonTxt; 
		
	@FindBy(xpath="//*[@id='chkFinancialAccounting']")
	public static WebElement keepUnpostedfinancialAccountingChkBox; 
		
	@FindBy(xpath="//*[@id='chkLinkBase']")
	public static WebElement keepUnpostedlinkBaseChkBox; 
		
	@FindBy(xpath="//*[@id='chkReferences']")
	public static WebElement keepUnpostedReferencesChkBox; 
		
	@FindBy(xpath="//*[@id='chkLinks']")
	public static WebElement keepUnpostedLinksChkBox;
	
	@FindBy(xpath="//*[@id='chkReservation']")
	public static WebElement keepUnpostedReservationChkBox;
	
	@FindBy(xpath="//input[@id='chkInventory']")
	public static WebElement keepUnpostedInventoryChkBox;
	
	
	//Authorization MOde
	
	@FindBy(xpath="//*[@id='chkFullAuthorization']")
	public static WebElement fullAuthorizationChkBox;
	
	@FindBy(xpath="//*[@id='chkAskRemarksonapproval']")
	public static WebElement askRemarksOnapprovalChkBox;
	
	@FindBy(xpath="//*[@id='chkmakeAskRemarksonapproval']")
	public static WebElement makeApprovalRemarksmandatoryChkBox;
	
	@FindBy(xpath="//*[@id='chkAskremarksonRejection']")
	public static WebElement askRemarksOnRejectionChkBox;
	
	@FindBy(xpath="//*[@id='chkmakeAskRemarksonRejection']")
	public static WebElement makeRejectionRemarksMandatoryChkBox;
	
	
	//Undo Authorization On Editing
	
	@FindBy(xpath="//*[@id='chkAnyValueChange']")
	public static WebElement anyValueChangeChkBox;
	
	@FindBy(xpath="//*[@id='chkAmountsOrQuantityOrNumeric']")
	public static WebElement amountsOrQuantityOrNumericChkBox;
	
	@FindBy(xpath="//*[@id='chkBillAdjustments']")
	public static WebElement billAdjustmentsChkBox;
	
	@FindBy(xpath="//*[@id='chkUndoReservation']")
	public static WebElement undoReservationChkBox;
	
	@FindBy(xpath="//*[@id='chkUndoLinks']")
	public static WebElement undoLinksChkBox;
	
	@FindBy(xpath="//*[@id='chkBatchRMABins']")
	public static WebElement batchRMABinChkBox;
	
	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	public static WebElement undoAuthorizationEditingDropdown;
	
	//Last Dropdown In Condition Screen
	
	
	
	//TransactionAuthorization------UserSelection Tab
	
	
	@FindBy(xpath="//a[contains(text(),'User selection')]")
	public static WebElement userSelectionTab;
	
	@FindBy(xpath="//*[@id='ddlUserSelection']")
	public static WebElement userselectionDropdown;
	
	@FindBy(xpath="//*[@id='ddlCriteria']")
	public static WebElement criteriaDropdown;
	
	
	//User Selection----Grid Fields
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	public static WebElement userDropdown;
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-1']")
	public static WebElement userrow1;
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_2-1']")
	public static WebElement userrow2;
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_1-2']")
	public static WebElement limitDefinitionrow1;
	
		@FindBy(xpath="//*[@id='divCondtionModal']/div/div/div[1]/div[1]/h4]")
		public static WebElement GridLimitDef_ConditionLabel;
		
		@FindBy(xpath="//*[@id='ddlLimiton']")
		public static WebElement GridLimitDef_LimitOnDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[1]/select")
		public static WebElement GridLimitDef_ConjunctionDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[2]/input")
		public static WebElement GridLimitDef_SelectFieldTxt;
		
			@FindBy(xpath="//*[@id='4']")
			public static WebElement GridLimitDef_SelectField_CashAndBankAc;
			
			@FindBy(xpath="//*[@id='268435459']")
			public static WebElement GridLimitDef_SelectField_Department;
			
			@FindBy(xpath="//*[@id='12']")
			public static WebElement GridLimitDef_SelectField_Account;
			
			@FindBy(xpath="//*[@id='268435462']")
			public static WebElement GridLimitDef_SelectFieldLocation;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[3]/select")
		public static WebElement GridLimitDef_SelectOperatorDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[4]/select")
		public static WebElement GridLimitDef_CompareWithDropDown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[5]/input")
		public static WebElement GridLimitDef_ValueTxt;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[6]/span")
		public static WebElement GridLimitDef_CloseRow1Btn;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[7]/span")
		public static WebElement GridLimitDef_AddRow1Btn;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
		public static WebElement GridLimitDef_CloseRow2Btn;
		
		@FindBy(xpath="//*[@id='divCondtionModal']/div/div/div[2]/div[1]/div[4]/span/i")
		public static WebElement GridLimitDef_OkBtn;
		
		@FindBy(xpath="//*[@id='btnCancel']/i")
		public static WebElement GridLimitDef_CancelIcon;
	
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-3']")
	public static WebElement limitValue1;	
		
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-4']")
	public static WebElement resetFrequency1;	
			
	@FindBy(xpath="//*[@id='id_tblUserSelection_LimitValue']")
	public static WebElement limitValueTxt;	
		
	@FindBy(xpath="//*[@id='id_tblUserSelection_ResetFrequency']")
	public static WebElement resetFrequencyDropdown;	
	
	
	
	
	//Alert Tab Fields
		
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[3]/a/span")
	public static WebElement alertsTab;	
		
	//Grid
	
	@FindBy(xpath="//*[@id='chkReceived']")
	public static WebElement receivedChkBox;	
		
	@FindBy(xpath="//*[@id='chkApproved']")
	public static WebElement approvedChkBox;	
		
	@FindBy(xpath="//*[@id='chkRejected']")
	public static WebElement rejectedChkBox;	
		
	@FindBy(xpath="//*[@id='chkStopped']")
	public static WebElement stoppedChkBox;	
		
	//EmailHeaderTemplate
	
	@FindBy(xpath="//*[@id='id_tblAlerts_col_1-2']")
	public static WebElement emailHeadretTemplateRow1;	
	
	@FindBy(xpath="//*[@id='id_tblAlerts_col_1-4']")
	public static WebElement smsTemplateRow1;	
	
	@FindBy(xpath="//*[@id='id_tblAlerts_col_1-5']")
	public static WebElement AlertsTemplateRow1;	
	
	@FindBy(xpath="//*[@id='id_tblAlerts_EmailHeaderTemplate']")
	public static WebElement emailHeadretTemplateDropdown;
	
	@FindBy(xpath="//*[@id='id_tblAlerts_SMSTemplate']")
	public static WebElement smsTemplateDropdown;
	
	@FindBy(xpath="//*[@id='id_tblAlerts_Alerts']")
	public static WebElement AlertsTemplateDropdown;
	
	@FindBy(xpath="//*[@id='id_tblAlerts_control_heading_2']/div/u")
	public static WebElement emailHeaderTemplateBtn;	
	
	@FindBy(xpath="//*[@id='fieldtab']/li[1]/span/i")
	public static WebElement customizeTemplateCompanyExpandBtn;
	
		@FindBy(xpath="//*[@id='id_SMSTemplate']/div/nav/div/div[1]/a/div/span[2]")
		public static WebElement emailHeaderTemplate_CustomizeTemplateLabel;	
		
		//Header Fields Of Customize Template Pop
		
		@FindBy(xpath="//*[@id='btnNewSmsTemplate']")
		public static WebElement customizeTemplateNewBtn;	
		
		@FindBy(xpath="//*[@id='btnSaveSmsTemplate']")
		public static WebElement customizeTemplateSaveBtn;	
			
		@FindBy(xpath="//*[@id='btnCloseSMSModal']")
		public static WebElement customizeTemplateCloseBtn;	
			
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl']")
		public static WebElement customizeTemplateTemplatestxt;	
			
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_input_settings']/span")
		public static WebElement customizeTemplate_TemplatesSettingBtn;	
			
			
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_heading']")
			public static WebElement templateSettingPop_CustomizeDisplayColoumnLabel;
			         
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_container']")
			public static WebElement templateSettingPop_sTemplateNameTxt;
	
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[1]")
			public static WebElement templateSettingPop_StandardFieldsBtn;
		
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_list']")
			    public static WebElement templateSettingPop_StandardFields_FiledDropdown;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_header']")
			    public static WebElement templateSettingPop_StandardFields_HeaderTxt;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_alignment']")
			    public static WebElement templateSettingPop_StandardFields_AlignmentDropdown;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_width']")
			    public static WebElement templateSettingPop_StandardFields_WidthTxt;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
				public static WebElement templateSettingPop_StandardFields_OkBtn;
				
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
				public static WebElement templateSettingPop_StandardFields_CancelBtn;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[2]")
			public static WebElement templateSettingPop_DeleteColoumnBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
			public static WebElement templateSettingPop_OkBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
			public static WebElement templateSettingPop_CancelBtn;
		
	
	//Email Template Tab			
					
	//Header Fields
			
			@FindBy(xpath="//i[@class='icon-open hiconright2']")
			public static WebElement emailTemplateOpenBtn;
			
			@FindBy(xpath="(//a[@title='Open']/i)[2]")
			public static WebElement emailTemplateOpenBtn1;
			
			@FindBy(xpath="//li[text()='emailLayoutOne']")
			public static WebElement emailTemplateOpenTxt;	
			
			@FindBy(xpath="//li[text()='emailTemplate1']")
			public static WebElement emailTemplateOpenLayoutTxt;	
			
			@FindBy(xpath="//*[@id='btn_PopUpOk']")
			public static WebElement emailTemplateLoadBtn;	
			
			@FindBy(xpath="//i[@class='icon-print hiconright2']")
			public static WebElement emailTemplatePrintDropdown;	
			
			@FindBy(xpath="//*[@id='menu-print']")
			public static WebElement emailTemplatePrintBtn;
			
	@FindBy(xpath="//u[contains(text(),'Email Template')]")
	public static WebElement emailTemplateBtn;	
					
	@FindBy(xpath="//*[@id='forHf']/span[1]/span/i[1]")
	public static WebElement emailTemplateNewBtn;	
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement  Newdropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[1]")
		public static WebElement  New_LayoutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[2]")
		public static WebElement  New_PageBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-open']")
	public static WebElement  Opendropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[1]")
		public static WebElement  OpenBtn;
	
	   //Pop
	    @FindBy(xpath="//*[@id='1']")
	    public static WebElement  Open_Selct1Option;
	
	    @FindBy(xpath="//button[@id='btn_PopUpOk']")
		public static WebElement  OpenBtn_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		public static WebElement  OpenBtn_CancelBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[2]")
	public static WebElement FromXMLBtn;
	
	@FindBy(xpath="(//a[@title='Save']//i)[1]")
	public static WebElement  Savedropdown;

		@FindBy(xpath="(//a[@title='Save']//i)[2]")
		public static WebElement  PrintSaveBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
		public static WebElement  SaveAsBtn; 
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		public static WebElement  SaveTxtField;
		
		@FindBy(xpath="//*[@id='id_tblAlerts_col_1-3']")
		public static WebElement  emailTemplateRow1;
		
		@FindBy(xpath="//*[@id='id_tblAlerts_EmailTemplate']")
		public static WebElement  emailTemplateDropdown;
		
		@FindBy(xpath="//*[@id='btn_PopUpOk']")
		public static WebElement  Save_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		public static WebElement  Save_CancekBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
		public static WebElement  SaveAsImageBtn; //No Response
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
		public static WebElement  SaveAsXMLBtn; // Downloads xml file
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[5]")
		public static WebElement  SaveAsHTMLBtn; 
	
	@FindBy(xpath="//*[@id='forHf']/span[4]")
	public static WebElement  Removedropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[1]")
		public static WebElement  RemoveBtn;  
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[2]")
		public static WebElement  RemoveCurrentPageBtn; 
                          
		//popup Error MEssage 
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[1]")
		public static WebElement  ErrorMessage;//This Is only Page.You Not Delete this Page --Message while using RemovecurrentPAgeBtn 
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[3]")
		public static WebElement  RemoveControlBtn;				
	
	@FindBy(xpath="//*[@id='forHf']/span[5]")
	public static WebElement  PageNo;
	
	@FindBy(xpath="//*[@id='forHf']/span[6]")
	public static WebElement  Controldrpdown;
			
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[1]")
		public static WebElement  StaticTextBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[2]")
		public static WebElement  BitmapBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[3]")
		public static WebElement  BodyGridBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[4]")
		public static WebElement  RectangleBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[5]")
		public static WebElement  EcllipseBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[6]")
		public static WebElement  LineBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[7]")
		public static WebElement  AreaBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[8]")
		public static WebElement  TableBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[9]")
		public static WebElement  ApprovalHistoryBtn;

	@FindBy(xpath="//*[@id='forHf']/span[7]/span/i[1]")
	public static WebElement  Alignmentdropdown;
			
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[1]")
		public static WebElement  LeftAlignmentBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[2]")
		public static WebElement  RightAlignmentBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[3]")
		public static WebElement  TopAlignmentBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[4]")
		public static WebElement  BottomAlignmentBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[8]")
	public static WebElement  Sizedropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[1]")
		public static WebElement  SameSizeBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[2]")
		public static WebElement  SameWidthBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[3]")
		public static WebElement  SameHeightBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[9]")
	public static WebElement  Printdropdown;
	
	@FindBy(xpath="//*[@id='menu-print']")
	public static WebElement  Print_PrintBtn;
						
		@FindBy(xpath="//*[@id='menu-preview']	")
		public static WebElement  Print_PreviewBtn;
		
		@FindBy(xpath="//*[@id='fit-button']")
		public static WebElement  Preview_FitToWidthBtn;
		
		@FindBy(xpath="//*[@id='zoom-in-button']")
		public static WebElement  PreviewZ_ZoomInBtn;
		
		@FindBy(xpath="//*[@id='zoom-out-button']")
		public static WebElement  Preview_ZoomOutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[3]")
		public static WebElement  PageSetUpBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetUpPreview']")
		public static WebElement  PageSetupPagePreviewField;
		
		@FindBy(xpath="//*[@id='id_PageType']")
		public static WebElement  PageSetupPaperSizedropdown;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='0']")
		public static WebElement  PageSetupPotraitRadio;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='1']")
		public static WebElement  PageSetupLandScapeRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='0']")
		public static WebElement  PageSetupCentimetersRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='1']")
		public static WebElement  PageSetupInchesRadio;
		
		@FindBy(xpath="//*[@id='id_PageSizeLeftMarginDisplay']")
		public static WebElement  PageSetupLeftTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeRightMarginDisplay']")
		public static WebElement  PageSetupRightTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		public static WebElement  PageSetupTopTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		public static WebElement  PageSetupBottomTxt;
		
		@FindBy(xpath="//*[@id='id_PageSetupOkBtn']")
		public static WebElement  PageSetupOkBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetupCancelBtn']")
		public static WebElement  PageSetUpCancelBtn;
                  
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']/i")
	public static WebElement  ExitBtn;	
	
	//Header Elements
	
	@FindBy(xpath="//*[@id='li_InvoicePageSetup']/a")
	public static WebElement  headerPageSetUpTab;
	
	@FindBy(xpath="//*[@id='li_InvoiceDesigner']/a")
	public static WebElement headerDesignerTab;
	
	@FindBy(xpath="//*[@id='li_InvoicePreview']/a")
	public static WebElement  headerPreviewTab;
	
	//Fields  
	
	@FindBy(xpath="//*[@id='LiDesignField']/a")
	public static WebElement  headerFieldsTab;
	
	@FindBy(xpath="//*[@id='LiProp']/a")
	public static WebElement  headerPropertiesTab;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
	public static WebElement  fields_CompanyExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]")
		public static WebElement  fields_Company_CompanyName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]")
		public static WebElement  fields_Company_CompanyCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]")
		public static WebElement  fields_Company_AccountingDate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]")
		public static WebElement  fields_Company_Address1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]")
		public static WebElement  fields_Company_Address2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]")
		public static WebElement  fields_Company_City;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]")
		public static WebElement  fields_Company_Zipcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]")
		public static WebElement  fields_Company_Country;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]")
		public static WebElement  fields_Company_PhoneNumber1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]")
		public static WebElement  fields_Company_PhoneNumber2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]")
		public static WebElement  fields_Company_Fax;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]")
		public static WebElement  fields_Company_TaxRegestrationNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]")
		public static WebElement  fields_Company_ExciseRegistrationNumber;

	@FindBy(xpath="//span[contains(text(),'Header')]")
	public static WebElement   fields_HeaderExpandBtn;
	             
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
		public static WebElement  fields_Header_DocNo;
	
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Date')]//i[@class='icon-expand icon-font8']")
	public static WebElement  fields_Header_DateExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[1]/a")
		public static WebElement  header_Date;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[2]/a")
		public static WebElement  header_Date_Year;
		
		@FindBy(xpath="///*[@id='InvoiceDesignheader']/ul/li[1]/ul/li[2]/ul/li[3]/a")
		public static WebElement  header_Date_Month;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[4]/a")
		public static WebElement  header_Date_DayOfYear;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[5]/a")
		public static WebElement  header_Date_Day;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[6]/a")
		public static WebElement  header_Date_Week;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[7]/a")
		public static WebElement  header_Date_WeekDay;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
		public static WebElement  fields_Header_TimeExpandBtn;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[1]/a")
		public static WebElement  headers_Time_Time;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[2]/a")
		public static WebElement  headers_Time_Hour;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[3]/a")
		public static WebElement  headers_Time_Minute;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[4]/a")
		public static WebElement headers_Time_Second;
	
	@FindBy(xpath="//span[contains(text(),'CashBankAC')]")
	public static WebElement fields_Header_CashBankACExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
		public static WebElement  cashAndBankAC_Name;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
		public static WebElement  cashAndBankAC_Code;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
		public static WebElement  cashAndBankAC_Alias;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
		public static WebElement  cashAndBankAC_Accounttype;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
		public static WebElement  cashAndBankAC_Address;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
		public static WebElement  cashAndBankAC_AllowCustomerPortal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
		public static WebElement  cashAndBankAC_BanckAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
		public static WebElement  cashAndBankAC_BankACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
		public static WebElement  cashAndBankAC_BankAccountName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
		public static WebElement  cashAndBankAC_BankAccountNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
		public static WebElement  cashAndBankAC_ChequeDiscountLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
		public static WebElement  cashAndBankAC_City1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
		public static WebElement  cashAndBankAC_CityCode1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
		public static WebElement  cashAndBankAC_City2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
		public static WebElement  cashAndBankAC_CityCode2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
		public static WebElement  cashAndBankAC_ConsolidationMethod;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
		public static WebElement  cashAndBankAC_CreditDays;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
		public static WebElement  cashAndBankAC_CreditLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
		public static WebElement  cashAndBankAC_DebitCreditProposal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
		public static WebElement  cashAndBankAC_DebitCreditRequired;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
		public static WebElement  cashAndBankAC_DefaultCurrency;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
		public static WebElement  cashAndBankAC_DeliveryAddress;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
		public static WebElement  cashAndBankAC_Email;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
		public static WebElement  cashAndBankAC_ExchangeAdjustGainAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
		public static WebElement  cashAndBankAC_ExchangeAdjustGainACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
		public static WebElement  cashAndBankAC_ExchangeAdjustLossAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
		public static WebElement  cashAndBankAC_ExchangeAdjustLossACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
		public static WebElement  cashAndBankAC_FaxNo;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
		public static WebElement  cashAndBankAC_FinanceChargeTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
		public static WebElement  cashAndBankAC_FinanaceEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
		public static WebElement  cashAndBankAC_IFSCcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
		public static WebElement  cashAndBankAC_Password;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
		public static WebElement  cashAndBankAC_PaymentTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
		public static WebElement  cashAndBankAC_PaymentType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
		public static WebElement  cashAndBankAC_PDCdiscountedAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
		public static WebElement  cashAndBankAC_PDCdiscountedACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
		public static WebElement  cashAndBankAC_Pin1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
		public static WebElement  cashAndBankAC_Pin2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
		public static WebElement  cashAndBankAC_PortalEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
		public static WebElement  cashAndBankAC_PrimaryAccount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
		public static WebElement  cashAndBankAC_PrimanryAccountCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
		public static WebElement  cashAndBankAC_RateOFInterest;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
		public static WebElement  cashAndBankAC_ReminderTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
		public static WebElement  cashAndBankAC_SendEmaialToCustomer;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
		public static WebElement  cashAndBankAC_TelNo;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
		public static WebElement  cashAndBankAC_GropupLevel1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
		public static WebElement  cashAndBankAC_GroupLevel1Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
		public static WebElement  cashAndBankAC_GroupLevel2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
		public static WebElement  cashAndBankAC_GroupLevel2Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
		public static WebElement  cashAndBankAC_GroupLevel3;
		               
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
		public static WebElement  cashAndBankAC_GroupLevel3Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[52]/a")
		public static WebElement  cashAndBankAC_GroupLevel4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[53]/a")
		public static WebElement  cashAndBankAC_GroupLevel4Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[54]/a")
		public static WebElement  cashAndBankAC_GroupLevel5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[55]/a")
		public static WebElement  cashAndBankAC_GroupLevel5Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[56]/a")
		public static WebElement  cashAndBankAC_GroupLevel6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[57]/a")
		public static WebElement  cashAndBankAC_GroupLevel6Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[58]/a")
		public static WebElement  cashAndBankAC_GroupLevel7;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[59]/a")
		public static WebElement  cashAndBankAC_GroupLevel7Code;
		
			
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Department')]")
	public static WebElement  fields_Header_DepartmentExpandBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Location')]")
	public static WebElement  fields_Header_LocationExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'sNarration')]")
	public static WebElement  header_sNarration;
	
	@FindBy(xpath="//span[contains(text(),'sChequeNo')]")
	public static WebElement  header_sChequeNo;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a/span")
	public static WebElement  header_User;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Role')]")
	public static WebElement  header_Role;
	
	@FindBy(xpath="//span[contains(text(),'UserVal1')]")
	public static WebElement  header_UserValue1;
	
	@FindBy(xpath="//span[contains(text(),'UserVal2')]")
	public static WebElement  header_UserValue2;
	
	@FindBy(xpath="//span[contains(text(),'UserVal3')]")
	public static WebElement  header_UserValue3;
	
	@FindBy(xpath="//span[contains(text(),'UserVal4')]")
	public static WebElement  header_UserValue4;
	
	@FindBy(xpath="//span[contains(text(),'UserVal5')]")
	public static WebElement  header_UserValue5;
	
	@FindBy(xpath="//span[contains(text(),'VoucherName')]")
	public static WebElement  header_VoucherName;
	
	
	//Body Expansion Fields
	
	@FindBy(xpath="//span[contains(text(),'Body')]")
	public static WebElement  fields_BodyExpansionBtn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/a")
	public static WebElement  fields_Body_AccountExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[1]/a")
		public static WebElement body_Name;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[2]/a")
		public static WebElement body_Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[3]/a")
		public static WebElement body_Alias;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[4]/a")
		public static WebElement body_AccountType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[5]/a")
		public static WebElement body_Address;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[6]/a")
		public static WebElement body_AlloowCoustmerPortal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[7]/a")
		public static WebElement body_BankAc;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[8]/a")
		public static WebElement body_BAnkAcCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[9]/a")
		public static WebElement body_BanbkAccountName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[10]/a")
		public static WebElement body_BankAccountNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[11]/a")
		public static WebElement body_BAnkDiscountLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[12]/a")
		public static WebElement body_City1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[13]/a")
		public static WebElement body_CityCode1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[14]/a")
		public static WebElement body_City2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[15]/a")
		public static WebElement body_CityCode2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[16]/a")
		public static WebElement body_ConsoildationMethod;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[17]/a")
		public static WebElement body_CreditDays;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[18]/a")
		public static WebElement body_CreditLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[19]/a")
		public static WebElement body_DebitOrCreditProposal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[20]/a")
		public static WebElement body__DebitOrCreditRequired;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[21]/a")
		public static WebElement body_DefaultCurrency;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[22]/a")
		public static WebElement body_DeliveryAddress;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[23]/a")
		public static WebElement body_Email;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[24]/a")
		public static WebElement body_ExchangeAdjustmentGainAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[25]/a")
		public static WebElement body_ExchangeAdjustmentGainAcCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[26]/a")
		public static WebElement body_fields_Header_ExchangeAdjustmentLossAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[27]/a")
		public static WebElement body_fields_Header_ExchangeAdjustmentLossACCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[28]/a")
		public static WebElement body_FaxNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[29]/a")
		public static WebElement body_FininaceChargeTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[30]/a")
		public static WebElement body_FinanceEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[31]/a")
		public static WebElement body_IFSCCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[32]/a")
		public static WebElement body_Password;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[33]/a")
		public static WebElement body_PaymentTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[34]/a")
		public static WebElement body_PaymentType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[35]/a")
		public static WebElement body_PDCDiscountedAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[36]/a")
		public static WebElement body_PDCDiscountedACCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[37]/a")
		public static WebElement body_Pin1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[38]/a")
		public static WebElement body_Pin2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[39]/a")
		public static WebElement body_POrtalEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[40]/a")
		public static WebElement body_PrimaryAccount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[41]/a")
		public static WebElement body_PrimaryAccountCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[42]/a")
		public static WebElement body_RateOfInterest;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[43]/a")
		public static WebElement body_RemainderTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[44]/a")
		public static WebElement body_SendEmailTOCustomer;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[45]/a")
		public static WebElement body_TelNumber2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[46]/a")
		public static WebElement body_GroupLevel1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[47]/a")
		public static WebElement body_GroupLevel1Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[48]/a")
		public static WebElement body_GroupLevel2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[49]/a")
		public static WebElement body_GroupLevel2Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[50]/a")
		public static WebElement body_GroupLevel3;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[51]/a")
		public static WebElement body_GroupLevel3Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[52]/a")
		public static WebElement body_GroupLevel4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[53]/a")
		public static WebElement body_GroupLevel4Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[54]/a")
		public static WebElement body_GroupLevel5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[55]/a")
		public static WebElement body_GroupLevel5Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[56]/a")
		public static WebElement body_GroupLevel6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[57]/a")
		public static WebElement body_GroupLevel6Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[58]/a")
		public static WebElement body_GroupLevel7;
		              
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[59]/a")
		public static WebElement body_GroupLevel7Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[2]/a")
		public static WebElement body_Amount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[3]/a")
		public static WebElement body_VouchurAmount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[4]/a")
		public static WebElement body_Referrence;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[5]/a")
		public static WebElement body_Net;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[6]/a")
		public static WebElement body_VoucherNet;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[7]/a")
		public static WebElement body_SRemarks;

		
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
		public static List<WebElement> voucherGridDocNo;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
		public static List<WebElement> voucherGridIndexChkBox;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[12]")
		public static List<WebElement> voucherGridSuspendStatus;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[13]")
		public static List<WebElement> voucherGridAuthorizationStatus;
		
		
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[2]/td[13]")
		public static WebElement voucherGridRow2AuthorizationStatus;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[3]/td[13]")
		public static WebElement voucherGridRow3AuthorizationStatus;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[4]/td[13]")
		public static WebElement voucherGridRow4AuthorizationStatus;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[5]/td[13]")
		public static WebElement voucherGridRow5AuthorizationStatus;
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
		public static List<WebElement> voucherGridCheckBoxList;
		
		
		
		
		
		
	//UserDetails
	@FindBy(xpath="//span[contains(text(),'User details')]")
	public static WebElement  fields_UserDetailsExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[1]/a")
		public static WebElement userDetails_UserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[2]/a")
		public static WebElement userDetails_MobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[3]/a")
		public static WebElement userDetails_PhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[4]/a")
		public static WebElement userDetails_EmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[5]/a")
		public static WebElement userDetails_Singature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[6]/a")
		public static WebElement userDetails_Employee;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[7]/a")
		public static WebElement userDetails_AuthoriseUserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[8]/a")
		public static WebElement userDetails_AuthoriseUserMobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[9]/a")
		public static WebElement userDetails_AuthoriseUserPhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[10]/a")
		public static WebElement userDetails_AuthoriseUserEmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[11]/a")
		public static WebElement userDetails_AuthoriseUserSignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[12]/a")
		public static WebElement userDetails_AuthoriseBy;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[13]/a")
		public static WebElement userDetails_NextAuthoriseUserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[14]/a")
		public static WebElement userDetails_NextUserMobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[15]/a")
		public static WebElement userDetails_NextUserPhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[16]/a")
		public static WebElement userDetails_NextUserEmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[17]/a")
		public static WebElement userDetails_NextUserSignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[18]/a")
		public static WebElement userDetails_CreatedBySignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[19]/a")
		public static WebElement userDetails_ModifiedBySignature;

	
	//Miscellaneous 
	
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Miscellaneous')]")
	public static WebElement  fields_MiscellaneousExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[1]/a")
		public static WebElement miscellaneous_Longdate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[2]/a")
		public static WebElement miscellaneous_PageNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/a")
		public static WebElement miscellaneous_Printdate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[4]/a")
		public static WebElement miscellaneous_PrintTime;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[5]/a")
		public static WebElement miscellaneous_TotalPage;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[6]/a")
		public static WebElement miscellaneous_Sno;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[7]/a")
		public static WebElement miscellaneous_PageType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[8]/a")
		public static WebElement miscellaneous_AgingDetails;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[9]/a")
		public static WebElement miscellaneous_AgingAmounts;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[10]/a")
		public static WebElement miscellaneous_AgingHeadings;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[11]/a")
		public static WebElement miscellaneous_Agingbalance;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[12]/a")
		public static WebElement miscellaneous_AgingSlab1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[13]/a")
		public static WebElement miscellaneous_AgingSlab2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[14]/a")
		public static WebElement miscellaneous_AgingSlab3;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[15]/a")
		public static WebElement miscellaneous_AgingSlab4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[16]/a")
		public static WebElement miscellaneous_AgingSlab5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[17]/a")
		public static WebElement miscellaneous_AgingSlab6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[18]/a")
		public static WebElement miscellaneous_AgingMonthWise;
		
	//'SMS template 
	
	@FindBy(xpath="//u[contains(text(),'SMS template')]")
	public static WebElement headerSMSTemplate;					
	
	//Pop As Same Above Email Header Template
	//Alerts
	@FindBy(xpath="//u[contains(text(),'Alerts')]")
	public static WebElement headerAlert;
	
	//Pop As Same Above Email Header Template
	
	//Recipient
	@FindBy(xpath="//div[contains(text(),'Recipient')]")
	public static WebElement headerRecipient;					
	
	
	/// Ok And Cancel for Authorization Definition
	
	@FindBy(xpath="//*[@id='id_report_popup_ok']")
	public static WebElement definitionOkBtn;					
			
	@FindBy(xpath="//*[@id='id_report_popup_cancel']/i	")
	public static WebElement definitionCloseBtn;					
	
	@FindBy(xpath="//*[@id='16']")
	public static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	public static WebElement  configureTransactionBtn;
	
	@FindBy(xpath="//*[@id='68']/span")
	public static WebElement  transactionAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='235']/span")
	public static WebElement  pricebookAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='19']/span")
	public static WebElement  configureMastersBtn;
	
	@FindBy(xpath="//*[@id='67']/span")
	public static WebElement  masterAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='69']/span")
	public static WebElement  creditLimitAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='74']/span")
	public static WebElement  designWorkflowBtn;
	
	@FindBy(xpath="//*[@id='105']/span")
	public static WebElement  settingsWizardBtn;
	
	@FindBy(xpath="//*[@id='232']/span")
	public static WebElement  batchCodeGenerationBtn;
	
	@FindBy(xpath="//*[@id='34']/span")
	public static WebElement  mapCreditLimitBtn;
	
	@FindBy(xpath="//*[@id='257']/span")
	public static WebElement  vatTaxCodeBtn;
	
	@FindBy(xpath="//*[@id='258']/span")
	public static WebElement  customerPortalAdminBtn;
	
	@FindBy(xpath="//*[@id='3308']/span")
	public static WebElement  budgetAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='3320']/span")
	public static WebElement  paymentGatewayIntegrationBtn;
	
	@FindBy(xpath="//*[@id='dashName']")
	public static WebElement dashboardName;
	
	@FindBy(xpath="//div[@id='divLevel1']//div[@class='row clsDivAuthorizationName']")
	public static WebElement level1;
	
	@FindBy(xpath="(//i[@class='icon-edit'])[2]")
	public static WebElement Level1editBtn;
	
	@FindBy(xpath="//a[contains(text(),'Alerts')]")
	public static WebElement alertTab;
	
	
	@FindBy(xpath="//i[@class='NodeIcon icon-report-1']")
	public static WebElement cnrBtn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-new icon-font7']")
	public static WebElement AddLevel1Btn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-add-parallel icon-font7']")
	public static WebElement AddParallel1Btn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-delete icon-font7']")
	public static WebElement DeleteLevel1Btn;
	
	@FindBy(xpath="(//input[@id='chkLevelCheck0'])[2]")    //span[@id='chkLevelCheck1']//input[@id='chkLevelCheck0']
	public static WebElement LevelCheck1ChkBox;
	
	
	
	@FindBy(xpath="//div[@id='divLevel2']//div[@class='row clsDivAuthorizationName']")
	public static WebElement level2;
	
	@FindBy(xpath="(//*[@id='divLevel'])[3]")
	public static WebElement Level2editBtn;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-new icon-font7']")
	public static WebElement AddLevel2Btn;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-add-parallel icon-font7']")
	public static WebElement AddParallel2Btn;
	
	@FindBy(xpath="(//*[@id='divLevel']/div[1]/i)[3]")
	public static WebElement utaBtn;
	
	@FindBy(xpath="(//i[@class='icon-delete'])[3]")
	public static WebElement Level2DeleteBtn;
	
	@FindBy(xpath="//span[@id='chkLevelCheck2']//input[@id='chkLevelCheck0']")
	public static WebElement LevelCheck2ChkBox;
	
	
	//Vouchers Home Page Ribbon Control
		
		@FindBy(xpath="//a[@id='id_transaction_homescreen_edit']")
		public static WebElement  editBtn;
		
		@FindBy(xpath="//input[@id='id_header_67108931']")
		public static WebElement  testField;
		
		@FindBy(xpath="//i[@class='icon-alerts-1 hiconright recentdropdown']")
		public static WebElement  alertsbtn;
		
		@FindBy(xpath="(//a[@id='1'])[1]")
		public static WebElement  alertsTransactions;
		
		@FindBy(xpath="//a[@id='769']")
		public static WebElement  alertsTransactions1;
		
		@FindBy(xpath="//span[text()='Alerts TemplateTransaction Authorization']")
		public static WebElement  alertstempTransactionAuthField;

		@FindBy(xpath="//span[@class='icon-print icon-font6']")
		public static WebElement  printBtn;
		
		@FindBy(xpath="//a[@id='id_transaction_homescreen_Delete']")
		public static WebElement  deleteBtn;
		
		@FindBy(xpath="//*[@id='id_transaction_homescreen_authorize']")
		public static WebElement  authorizeBtn;
		
		@FindBy(xpath="//span[@class='icon-suspend icon-font6']")
		public static WebElement  suspendBtn;
		
		@FindBy(xpath="//a[@id='id_transaction_homescreen_reject']")
		public static WebElement  rejectBtn;
		
		@FindBy(xpath="//span[@class='icon-cheque icon-font6']")
		public static WebElement  chequeReturnBtn;
		
		@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
		public static WebElement  printBarCodeBtn;
		
		@FindBy(xpath="//span[@class='icon-convert icon-font6']")
		public static WebElement  convertBtn;
		
		@FindBy(xpath="//a[@id='id_transactionentry_convert']")
		public static WebElement  transactionEntryConvert;
		
		@FindBy(xpath="//span[@class='icon-export icon-font6']")
		public static WebElement  exportToXMLBtn;  
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/button")
		public static WebElement homePannelOpenBtn;
		
		@FindBy(xpath="(//td[text()='1'])[2]/..//input")
		public static WebElement  voucherNo1Checkbox1;
		
		@FindBy(xpath="(//td[text()='2'])[1]/..//input")
		public static WebElement  voucherNo2Checkbox1;
		
		
		
		@FindBy(xpath="//a[text()='Pending Purchases Voucher VAT']")
		public static WebElement  pendingPurchasesVoucherVatLink;
		
		@FindBy(xpath="//a[text()='Pending Material Receipt Notes']")
		public static WebElement  pendingMaterialReceiptNotesLink;
			
		@FindBy(xpath="(//i[@class='icon-settings hiconright2'])[1]")
		public static WebElement  settingsBtn;
		
		@FindBy(xpath="//a[contains(text(),'Views')]")
		public static WebElement  viewsTabInVoucherSetting;
		
		@FindBy(xpath="//i[@class='icon-save vouchericon']")
		public static WebElement  voucherSettingsSaveBtn;
		
		
		
		@FindBy(xpath="//button[contains(text(),'Login')]")
		public static WebElement  logInTabexpandBtn;
		
		@FindBy(xpath="//label[contains(text(),'SU')]//..//input")
		public static WebElement  superUserCheckBoxIsSelected;
		
		@FindBy(xpath="//label[contains(text(),'SU')]//..//span")
		public static WebElement  superUserCheckBox;
		
		@FindBy(xpath="//i[@class='icon-close hiconright2']")  
		public static WebElement  homeCloseBtn;
				
		//Vouchers Home Page Options
		@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
		public static WebElement  allVouchersOption;
		
		@FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
		public static WebElement  pendingBillsOption;
		
		@FindBy(xpath="//input[@id='SelectDefaultView']")
		public static WebElement  selectDefaultViewChkBox;
			
		@FindBy(xpath="//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
		public static WebElement  sortingBtn;
		
	    @FindBy(xpath="//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
	    public static WebElement  createViewBtn;

	    @FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
	    public static WebElement  customizeBtn;
	   
	    @FindBy(xpath="//span[@class='icon-filter icon-font6']")
	    public static WebElement  filterBtn;
	   
	    @FindBy(xpath="//*[@id='transhomeRefresh']")
	    public static WebElement  refreshBtn;
	   
	    @FindBy(xpath="//*[@id='transhomeRefresh']")
	    public static WebElement  refreshBtnInPVVAT;
	    
	    @FindBy(xpath="//i[@class='icon-font6 icon-export']")
	    public static WebElement  exportBtn;
	   
		// Options Button  (Display Option)	
	    @FindBy(xpath="//span[@id='transOptions']")
	    public static WebElement  optionsBtn;
	   
	    @FindBy(xpath="//a[contains(text(),'Auto Adjust Width')]")
	    public static WebElement  autoAdjustWidthBtn;
	   
	    @FindBy(xpath="//a[contains(text(),'Fit To Screen')]")
	    public static WebElement  fitToScreenBtn;
	   
	    @FindBy(xpath="//a[contains(text(),'Normal')]")
	    public static WebElement  normalBtn;
	   
					
		//Voucher Home Page Grid Header Columns
		@FindBy(xpath="//input[@id='HeaderChkBox']")
		public static WebElement  grid_HeaderChkBox;	
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[3]")
		public static WebElement  grid_Header_Date;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[4]")
		public static WebElement  grid_Header_VoucherNumber;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[5]")
		public static WebElement  grid_Header_CreatedBy;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[6]")
		public static WebElement  grid_Header_ModifiedBy;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[7]")
		public static WebElement  grid_Header_CreatedDate;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[8]")
		public static WebElement  grid_Header_ModifiedDate;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[9]")
		public static WebElement  grid_Header_CreatedTime;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[10]")
		public static WebElement  grid_Header_ModifiedTime;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[11]")
		public static WebElement  grid_Header_Suspended;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[12]")
		public static WebElement  grid_Header_Cancelled;
		
		@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[13]")
		public static WebElement  grid_Header_AuthorizationStatus;
		
		
		//Grid Voucher DetailsBtn
		@FindBy(xpath="//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
		public static WebElement  grid_VoucherDetailsBtn1;
		
		@FindBy(xpath="//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
		public static WebElement  grid_VoucherDetailsBtn2;
		
		
		//Grid CheckBox 1 And 2
		
		@FindBy(xpath="//tr[@id='trRender_1']//td//input")
		public static WebElement  grid_ChkBox1;
		
		@FindBy(xpath="//tr[@id='trRender_2']//td//input")
		public static WebElement  grid_ChkBox2;
		
		@FindBy(xpath="//tr[@id='trRender_3']//td//input")
		public static WebElement  grid_ChkBox3;
		
		@FindBy(xpath="//tr[@id='trRender_4']//td//input")
		public static WebElement  grid_ChkBox4;
		
		@FindBy(xpath="(//td[text()='2'])[1]//..//input")
		public static WebElement  voucher2Checkbox;
		
		@FindBy(xpath="(//td[text()='3'])[1]//..//input")
		public static WebElement  voucher3Checkbox;
		
		
		// Vouchers Home Page Footer
		@FindBy(xpath="//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
		public static WebElement  searchField;
								
		@FindBy(xpath="//button[@id='frstPage']")
		public static WebElement  firstPageBtn;

		@FindBy(xpath="//button[@id='id_previousPage']")
		public static WebElement  previousPageBtn;

		@FindBy(xpath="//button[@id='id_pagenumber']")
		public static WebElement  currentPageNo;

		@FindBy(xpath="//button[@id='id_nextPage']")
		public static WebElement  nextPageBtn;

		@FindBy(xpath="//button[@id='lstPage']")
		public static WebElement  lastPageBtn;
		
		
		
		//Vouchers Entry Page Ribbon Control Options
		@FindBy(xpath="//span[@class='icon-scroll icon-font6']")
		public static WebElement  freeFlowBtn;
		
		@FindBy(xpath="//span[@class='icon-header icon-font6']")
		public static WebElement  jumpToHeaderSectionBtn;
		
		@FindBy(xpath="//span[@class='icon-panel icon-font6']")
		public static WebElement  jumpToBodySectionBtn;
		
		@FindBy(xpath="//span[@class='icon-footer icon-font6']")
		public static WebElement  jumpToFooterBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_new']")
		public static WebElement  new_newBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_save']") 
		public static WebElement  saveBtn;
		
		@FindBy(xpath="//*[@id='btnSave']/i") 
		public static WebElement  designWorkFlowSaveBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_previous']")
		public static WebElement  previousBtn;
		
		@FindBy(xpath="//*[@id='id_transentry_infopanel_dashletbtn_0']")
		public static WebElement  docInfoExpandbtn;
		
		@FindBy(xpath="//*[@id='id_transentry_infopanel_dashlet_6']/table/tbody/tr[7]/td[3]")
		public static WebElement  nextToAuth;
		
		@FindBy(xpath="//*[@id='id_transactionentry_next']")
		public static WebElement  nextBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_print']")
		public static WebElement  new_PrintBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_suspend']")
		public static WebElement  new_SuspendBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_close']")
		public static WebElement  new_CloseBtn;
		
		@FindBy(xpath="//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
		public static WebElement  new_DeleteBtn;
		
		@FindBy(xpath="//li[@id='id_transactionentry_authorize']")
		public static WebElement  new_AuthorizeBtn;
		
		@FindBy(xpath="//*[@id='id_transentry_infopanel_dashlet_6']/table/tbody/tr[1]/td[3]")
		public static WebElement  new_DocumentInfoStatusTxt;
		
		@FindBy(xpath="//i[@class='icon icon-new Accpluseicon text-collapsed']")
		public static WebElement  documentInfoExpandBtn;
		
		
		@FindBy(xpath="//i[@class='icon-alerts-1 hiconright recentdropdown']")   
		public static WebElement  voucherHomePageAlertBtn;
		
		@FindBy(xpath="//*[contains(text(),'Transactions (1)')]")
		public static WebElement  voucherHomePageAlertTransactions;
		
		@FindBy(xpath="//*[@id='769']/span")
		public static WebElement  voucherHomePageAlertPurchaseVoucherN;
		
		
		
		@FindBy(xpath="//*[text()='Alerts TemplateTransaction Authorization']")
		public static WebElement  voucherHomePageAlertsTemplateTransactionAuthorization;
		
		
		
		@FindBy(xpath="//*[@id='id_transactionentry_authorization_remark_popup_ok']")
		public static WebElement  authorizePopupOkBtnEntryPage;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
		 public static List<WebElement> voucherGridRow1BodyList;
		
		@FindBy(xpath="(//input[@value='Yes'])[1]")
		public static WebElement  contentChangeAlertMsg;
		
		@FindBy(xpath="//span[contains(text(),'Purchases Voucher VAT')]")
		public static WebElement  purchaseVouchersVat;
		
		@FindBy(xpath="//span[contains(text(),'New PV')]")
		public static WebElement  newPV;
	    
	    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td")
		 public static List<WebElement> voucherGridRow2BodyList;
		
		@FindBy(xpath="//select[@id='id_list_popup_list']")
		public static WebElement  convertOptionDropDown;
		
		@FindBy(xpath="(//input[@value='Ok'])[3]")
		public static WebElement  workFlowOkBtn1;
		
		@FindBy(xpath="//span[@class='icon-menudots hiconright2']")
		public static WebElement  toggleBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_copydocument']")
		public static WebElement  copyDocumentOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
		public static WebElement  copyToClipBoardOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
		public static WebElement  pasteFromClipBoardOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']")
		public static WebElement  raiseCheckReturnOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_addtostock']")
		public static WebElement  addToStockOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_markconvert']")
		public static WebElement  markConvertedOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_bominput']")
		public static WebElement  bOMinputOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_autoallocate']")
		public static WebElement  autoAllocateOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_reverseentry']")
		public static WebElement  reverseEntryOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
		public static WebElement  printBarCodeOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_postingdetails']")
		public static WebElement  postingDetailsOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_exporttoxml']")
		public static WebElement  exportToXMLOption;
		
		@FindBy(xpath="//*[@id='id_transactionentry_settings']")
		public static WebElement  settingsOption;
		
		
		
		// Line Wise Authorization 
		@FindBy(xpath="//span[@class='icon-clear icon-font6']")
		public static WebElement  lineWiseAuthorizationClearBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_linewiseauthorization_popup_footer']/div/input[1]")
		public static WebElement  lineWiseAuthorizationOkBtn;
		
		@FindBy(xpath="//div[@class='btn toolbar_button default_padding_toolbar_button']//span[@class='icon-close icon-font6']")
		public static WebElement  lineWiseAuthorizationCancelBtn;
		
		
		@FindBy(xpath="//input[@id='id_transaction_authorization_grid_control_heading_ctrl_2']")
		public static WebElement  lineWiseAuthHeaderChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_1-2']/input")
		public static WebElement  lineWiseAuthRow1ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_2-2']/input")
		public static WebElement  lineWiseAuthRow2ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_3-2']/input")
		public static WebElement  lineWiseAuthRow3ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_4-2']/input")
		public static WebElement  lineWiseAuthRow4ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_5-2']/input")
		public static WebElement  lineWiseAuthRow5ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_6-2']/input")
		public static WebElement  lineWiseAuthRow6ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_7-2']/input")
		public static WebElement  lineWiseAuthRow7ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_8-2']/input")
		public static WebElement  lineWiseAuthRow8ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_9-2']/input")
		public static WebElement  lineWiseAuthRow9ChkBox;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_10-2']/input")
		public static WebElement  lineWiseAuthRow10ChkBox;
		
		
		
		@FindBy(xpath="//span[@id='id_headrightsymbol']")
		public static WebElement  lineWiseAuthHeaderAuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_1-1']/span[1]")
		public static WebElement  lineWiseAuthRow1AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_2-1']/span[1]")
		public static WebElement  lineWiseAuthRow2AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_3-1']/span[1]")
		public static WebElement  lineWiseAuthRow3AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_4-1']/span[1]")
		public static WebElement  lineWiseAuthRow4AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_5-1']/span[1]")
		public static WebElement  lineWiseAuthRow5AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_6-1']/span[1]")
		public static WebElement  lineWiseAuthRow6AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_7-1']/span[1]")
		public static WebElement  lineWiseAuthRow7AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_8-1']/span[1]")
		public static WebElement  lineWiseAuthRow8AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_9-1']/span[1]")
		public static WebElement  lineWiseAuthRow9AuthorizeBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_10-1']/span[1]")
		public static WebElement  lineWiseAuthRow10AuthorizeBtn;
		
		
		
		@FindBy(xpath="//span[@id='id_headremovesymbol']")
		public static WebElement  lineWiseAuthHeaderRejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_1-1']/span[2]")
		public static WebElement  lineWiseAuthRow1RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_2-1']/span[2]")
		public static WebElement  lineWiseAuthRow2RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_3-1']/span[2]")
		public static WebElement  lineWiseAuthRow3RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_4-1']/span[2]")
		public static WebElement  lineWiseAuthRow4RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_5-1']/span[2]")
		public static WebElement  lineWiseAuthRow5RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_6-1']/span[2]")
		public static WebElement  lineWiseAuthRow6RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_7-1']/span[2]")
		public static WebElement  lineWiseAuthRow7RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_8-1']/span[2]")
		public static WebElement  lineWiseAuthRow8RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_9-1']/span[2]")
		public static WebElement  lineWiseAuthRow9RejectBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_10-1']/span[2]")
		public static WebElement  lineWiseAuthRow10RejectBtn;
		
		
		
		@FindBy(xpath="//span[@id='id_headbansymbol']")
		public static WebElement  lineWiseAuthHeaderBanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_1-1']/span[3]")
		public static WebElement  lineWiseAuthRow1BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_2-1']/span[3]")
		public static WebElement  lineWiseAuthRow2BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_3-1']/span[3]")
		public static WebElement  lineWiseAuthRow3BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_4-1']/span[3]")
		public static WebElement  lineWiseAuthRow4BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_5-1']/span[3]")
		public static WebElement  lineWiseAuthRow5BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_6-1']/span[3]")
		public static WebElement  lineWiseAuthRow6BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_7-1']/span[3]")
		public static WebElement  lineWiseAuthRow7BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_8-1']/span[3]")
		public static WebElement  lineWiseAuthRow8BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_9-1']/span[3]")
		public static WebElement  lineWiseAuthRow9BanBtn;
		
		@FindBy(xpath="//td[@id='id_transaction_authorization_grid_col_10-1']/span[3]")
		public static WebElement  lineWiseAuthRow10BanBtn;
		
		
		
		
		
		//Voucher Entry Page Header Fields
		@FindBy(xpath="//input[@id='id_header_1']")
		public static WebElement  documentNumberTxt;
		
		@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
		public static WebElement  documentNumberdropdown_ExpansionBtn;
		
		@FindBy(xpath="//input[@id='id_header_2']")
		public static WebElement  dateTxt;
		
		@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
		public static WebElement  dateTxt_CalenderBtn;
		
		@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
		public static WebElement  calender_TodayBtn;
		
		@FindBy(xpath="//input[@id='id_header_4']")
		public static WebElement  caskBankAccountTxt;
		
		@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
		public static WebElement  caskBankAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
		public static WebElement  cashBankAccount_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
			public static WebElement  cashBankAccount_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
			public static WebElement  cashBankAccount_Settings_StandardFieldsBtn;
									
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;
														
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;
															
						@FindBy(xpath="//div[@class='panel']//input[3]")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_OkBtn;
															
						@FindBy(xpath="//div[@class='panel']//input[4]")
						public static WebElement  cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
			public static WebElement  cashBankAccount_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  cashBankAccount_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  cashBankAccount_Settings_CancelBtn;
				
		@FindBy(xpath="//input[@id='id_header_268435459']")
		public static WebElement  departmentTxt;
		
		@FindBy(xpath="//input[@id='id_header_268435470']")
		public static WebElement  placeOfSupplyTxt;
		
		@FindBy(xpath="//*[@id='id_header_268435459_input_image']/span")
		public static WebElement  department_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_268435459_input_settings']/span")
		public static WebElement  department_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_container']")
			public static WebElement  department_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
			public static WebElement  department_Settings_StandardFieldsBtn;
							
				@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_list']")
				public static WebElement  department_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_header']")
				public static WebElement  department_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
				public static WebElement  department_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_width']")
				public static WebElement  department_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[@class='panel']//input[3]")
				public static WebElement  department_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[@class='panel']//input[4]")
				public static WebElement  department_Settings_StandardFieldsBtn_CancelBtn;
							
									
			@FindBy(xpath="//div[@id='id_header_268435459_search_container']//input[2]")
			public static WebElement  department_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  department_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  department_Settings_CancelBtn;

		@FindBy(xpath="//*[@id='id_header_6']")
		public static WebElement  maturityDateTxt;
		
		@FindBy(xpath="//*[@id='id_header_6_input_image']/span']")
		public static WebElement  maturityDateTxt_CalenderBtn;
		
		
		@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
		public static WebElement  purchaseAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
		public static WebElement  purchaseAccount_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
			public static WebElement  purchaseAccount_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
			public static WebElement  purchaseAccount_Settings_StandardFieldsBtn;
							
				@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[@class='panel']//input[3]")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[@class='panel']//input[4]")
				public static WebElement  purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
			public static WebElement  purchaseAccount_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  purchaseAccount_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  purchaseAccount_Settings_CancelBtn;


	@FindBy(xpath="//input[@id='id_header_4']")
	public static WebElement  vendorAccountTxt;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	public static WebElement  vendorAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	public static WebElement  vendorAccount_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
			public static WebElement  vendorAccount_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
			public static WebElement  vendorAccount_Settings_StandardFieldsBtn;
									
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;
														
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_WidthTxt;
															
						@FindBy(xpath="//div[@class='panel']//input[3]")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_OkBtn;
															
						@FindBy(xpath="//div[@class='panel']//input[4]")
						public static WebElement  vendorAccount_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
			public static WebElement  vendorAccount_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  vendorAccount_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  vendorAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_3']")
	public static WebElement  salesAccountTxt;

	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	public static WebElement  salesAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	public static WebElement  salesAccount_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
			public static WebElement  salesAccount_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
			public static WebElement  salesAccount_Settings_StandardFieldsBtn;
									
						@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_Fielddropdown;
															
						@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_HeaderTxt;
														
						@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
															
						@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_WidthTxt;
															
						@FindBy(xpath="//div[@class='panel']//input[3]")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_OkBtn;
															
						@FindBy(xpath="//div[@class='panel']//input[4]")
						public static WebElement  salesAccount_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
			public static WebElement  salesAccount_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  salesAccount_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  salesAccount_Settings_CancelBtn;

		@FindBy(xpath="//input[@id='id_header_4']")
		public static WebElement  customerAccountTxt;
		
		@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
		public static WebElement  customerAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
		public static WebElement  customerAccount_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
			public static WebElement  customerAccount_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
			public static WebElement  customerAccount_Settings_StandardFieldsBtn;
									
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_Fielddropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_HeaderTxt;
														
						@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
															
						@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_WidthTxt;
															
						@FindBy(xpath="//div[@class='panel']//input[3]")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_OkBtn;
															
						@FindBy(xpath="//div[@class='panel']//input[4]")
						public static WebElement  customerAccount_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
			public static WebElement  customerAccount_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  customerAccount_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  customerAccount_Settings_CancelBtn;
		
		@FindBy(xpath="//input[@id='id_header_12']")
		public static WebElement  accountTxt;
		
		@FindBy(xpath="//*[@id='id_header_12_input_image']/span")
		public static WebElement  account_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
		public static WebElement  account_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
			public static WebElement  account_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
			public static WebElement  account_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
				public static WebElement  account_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
				public static WebElement  account_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
				public static WebElement  account_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
				public static WebElement  account_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[@class='panel']//input[3]")
				public static WebElement  account_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[@class='panel']//input[4]")
				public static WebElement  account_Settings_StandardFieldsBtn_CancelBtn;
									
									
			@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
			public static WebElement  account_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  account_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  account_Settings_CancelBtn;
		
		@FindBy(xpath="//input[@id='id_header_31']")
		public static WebElement  issuesReceiptsTxt;
		
		@FindBy(xpath="//input[@id='id_header_268435460']")
		public static WebElement  wareHouseTxt;
		
		@FindBy(xpath="//*[@id='id_header_268435460_input_image']/span")
		public static WebElement  wareHouse_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_header_268435460_input_settings']/span")
		public static WebElement  wareHouse_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_container']")
			public static WebElement  wareHouse_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
			public static WebElement  wareHouse_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_list']")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_header']")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_width']")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[@class='panel']//input[3]")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[@class='panel']//input[4]")
				public static WebElement  wareHouse_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_header_268435460_search_container']//input[2]")
			public static WebElement  wareHouse_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  wareHouse_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  wareHouse_Settings_CancelBtn;
		
		@FindBy(xpath="//span[contains(text(),'sName')]")
		public static WebElement  customize_sName;
		
		@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Code')]")
		public static WebElement  customize_sCode;
		
		@FindBy(xpath="//span[contains(text(),'Alias')]")
		public static WebElement  customize_Alias;
		
		@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Group')]")
		public static WebElement  customize_bGroup;
		
		@FindBy(xpath="//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
		public static WebElement  customize_Balance;
		
		@FindBy(xpath="//input[@id='id_header_67108920']")
		public static WebElement  appropriateBasedOndropdown;
		
		@FindBy(xpath="//input[@id='id_header_67108921']")
		public static WebElement  additionalValueTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108924']")
		public static WebElement  narrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_21']")
		public static WebElement  raiseReceiptsChkBox;
		
		@FindBy(xpath="//input[@id='id_header_67108865']")
		public static WebElement  receipts_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108868']")
		public static WebElement  payments_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108871']")
		public static WebElement  pettyCash_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108874']")
		public static WebElement  postDatedReceipts_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108865']")
		public static WebElement  postDatedPayments_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108880']")
		public static WebElement  purchaseVouchers_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108881']")
		public static WebElement  purchaseReturns_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108884']")
		public static WebElement  salesInvoice_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108886']")
		public static WebElement  salesOrder_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108928']")
		public static WebElement  salesInvoiceNewNarrationTxt;
		
		
		@FindBy(xpath="//input[@id='id_header_67108885']")
		public static WebElement  salesReturns_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108913']")
		public static WebElement  cashSales_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108914']")
		public static WebElement  hirePurchaseSales_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108890']")
		public static WebElement  journalEntries_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108916']")
		public static WebElement  forexJV_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108910']")
		public static WebElement  interDepartmentalJV_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108888']")
		public static WebElement  nonStandardJournalEntries_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108892']")
		public static WebElement  debitNotes_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108911']")
		public static WebElement  debitNotesLineWise_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108893']")
		public static WebElement  creditNotes_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108912']")
		public static WebElement  creditNotesLineWisePayroll_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108894']")
		public static WebElement  openingBalance_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108891']")
		public static WebElement  fixedAssetDepreciationVoucher_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108909']")
		public static WebElement  requestForQuote_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108903']")
		public static WebElement  purchasesQuotations_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108882']")
		public static WebElement  purchasesOrders_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108882']")
		public static WebElement  materialReceiptsNotes_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108904']")
		public static WebElement  salesQuotationss_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108887']")
		public static WebElement  deliveryNotes_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108917']")
		public static WebElement  posSales_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108918']")
		public static WebElement  productionOrder_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108886']")
		public static WebElement  salesOrders_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108895']")
		public static WebElement  shortagesinStock_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108896']")
		public static WebElement  excessesinStocks_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108897']")
		public static WebElement  stockTransfers_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108898']")
		public static WebElement  openingStocks_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108925']")
		public static WebElement  openingStocksNEW_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108908']")
		public static WebElement  materialRequisition_NarrationTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108866']")
		public static WebElement  receipts_ChequeNoTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108869']")
		public static WebElement  payments_ChequeNoTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108872']")
		public static WebElement  pettyCash_ChequeNoTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108875']")
		public static WebElement  postDatedReceipts_ChequeNoTxt;
		
		@FindBy(xpath="//input[@id='id_header_67108878']")
		public static WebElement  postDatedPayments_ChequeNoTxt;



		//Voucher Entry Page Body Fields
		
		@FindBy(xpath="//input[@id='id_body_536870916']")
		public static WebElement  pvWareHouseTxt;
		
		@FindBy(xpath="//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
		public static WebElement  pvWareHouse_ExpansionBtn;
		
		@FindBy(xpath="//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement  pvWareHouse_SettingsBtn;

			@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_container']")
			public static WebElement  pvWareHouse_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
			public static WebElement  pvWareHouse_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_list']")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_header']")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_width']")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[@class='panel']//input[3]")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[@class='panel']//input[4]")
				public static WebElement  pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_body_536870916_search_container']//input[2]")
			public static WebElement  pvWareHouse_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[@class='panel']//input[3]")
			public static WebElement  pvWareHouse_Settings_OkBtn;
							
			@FindBy(xpath="//div[@class='panel']//input[4]")
			public static WebElement  pvWareHouse_Settings_CancelBtn;
		
		// Grid Elements
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement  grid_Header_Account;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement  grid_Header_Item;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement  grid_Header_DebitAC;
		
		@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_2']")
		public static WebElement  grid_Header_CreditAC;



		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
		public static WebElement  firstRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
		public static WebElement  secondRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
		public static WebElement  thirdRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
		public static WebElement  fourthRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
		public static WebElement  fifthRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
		public static WebElement  sixthRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
		public static WebElement  seventhRowIndex;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
		public static WebElement  eigthRowIndex;
		
		@FindBy(xpath="//label[text()='Delete Row']")
		public static WebElement  deleteRowBtn;
		
		@FindBy(xpath="//span[@class='icon-insertrow icon-font8']")
		public static WebElement  insertRowBtn;
		
		@FindBy(xpath="//span[@class='icon-selectall icon-font8']")
		public static WebElement  selectRowBtn;
		
		@FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']")
		public static WebElement  unSelectRowBtn;
		
		@FindBy(xpath="//span[@class='icon-clone icon-font8']")
		public static WebElement  duplicateRowBtn;

		
		
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
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
		public static WebElement  select1stRow_8thColumn;
		
		
		@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_heading']")
		public static WebElement  workflowPopupLabelName;
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
		public static WebElement  select1stRow_9thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
		public static WebElement  select1stRow_10thColumn;

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
		public static WebElement  select1stRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
		public static WebElement  select1stRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
		public static WebElement  select1stRow_13thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
		public static WebElement  select1stRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
		public static WebElement  select1stRow_15thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
		public static WebElement  select1stRow_16thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
		public static WebElement  select1stRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
		public static WebElement  select1stRow_18thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
		public static WebElement  select2ndRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
		public static WebElement  select2ndRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
		public static WebElement  select2ndRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
		public static WebElement  select2ndRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
		public static WebElement  select2ndRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
		public static WebElement  select2ndRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
		public static WebElement  select2ndRow_7thColumn;
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
		public static WebElement  select2ndRow_9thColumn;

		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
		public static WebElement  select2ndRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
		public static WebElement  select2ndRow_10thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
		public static WebElement  select2ndRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
		public static WebElement  select2ndRow_15thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
		public static WebElement  select2ndRow_16thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
		public static WebElement  select2ndRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
		public static WebElement  select2ndRow_18thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
		public static WebElement  select2ndRow_19thColumn;

		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
		public static WebElement  select3rdRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
		public static WebElement  select3rdRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
		public static WebElement  select3rdRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
		public static WebElement  select3rdRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
		public static WebElement  select3rdRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
		public static WebElement  select3rdRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
		public static WebElement  select3rdRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
		public static WebElement  select3rdRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
		public static WebElement  select3rdRow_9thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
		public static WebElement  select3rdRow_10thColumn;

	    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
		public static WebElement  select3rdRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
		public static WebElement  select3rdRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
		public static WebElement  select3rdRow_13thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
		public static WebElement  select3rdRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
		public static WebElement  select3rdRow_15thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
		public static WebElement  select3rdRow_16thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
		public static WebElement  select3rdRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
		public static WebElement  select3rdRow_18thColumn;




		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
		public static WebElement  select4thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
		public static WebElement  select4thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
		public static WebElement  select4thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
		public static WebElement  select4thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
		public static WebElement  select4thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
		public static WebElement  select4thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
		public static WebElement  select4thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
		public static WebElement  select4thRow_8thColumn;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
		public static WebElement  select4thRow_10thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
		public static WebElement  select4thRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
		public static WebElement  select4thRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
		public static WebElement  select4thRow_13thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
		public static WebElement  select4thRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
		public static WebElement  select4thRow_15thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
		public static WebElement  select4thRow_16thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[18]")
		public static WebElement  select4thRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[19]")
		public static WebElement  select4thRow_18thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[20]")
		public static WebElement  select4thRow_19thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[21]")
		public static WebElement  select4thRow_20thColumn;



		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
		public static WebElement  select5thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
		public static WebElement  select5thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
		public static WebElement  select5thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
		public static WebElement  select5thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
		public static WebElement  select5thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
		public static WebElement  select5thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
		public static WebElement  select5thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
		public static WebElement  select5thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
		public static WebElement  select5thRow_9thColumn;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
		public static WebElement  select5thRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
		public static WebElement  select5thRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
		public static WebElement  select5thRow_13thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
		public static WebElement  select5thRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
		public static WebElement  select5thRow_15thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
		public static WebElement  select5thRow_16thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[18]")
		public static WebElement  select5thRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[19]")
		public static WebElement  select5thRow_18thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[20]")
		public static WebElement  select5thRow_19thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[21]")
		public static WebElement  select5thRow_20thColumn;




		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
		public static WebElement  select6thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
		public static WebElement  select6thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
		public static WebElement  select6thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
		public static WebElement  select6thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
		public static WebElement  select6thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
		public static WebElement  select6thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
		public static WebElement  select6thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
		public static WebElement  select6thRow_8thColumn;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
		public static WebElement  select6thRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
		public static WebElement  select6thRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
		public static WebElement  select6thRow_13thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
		public static WebElement  select6thRow_14thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
		public static WebElement  select6thRow_15thColumn;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[18]")
		public static WebElement  select6thRow_17thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[19]")
		public static WebElement  select6thRow_18thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[20]")
		public static WebElement  select6thRow_19thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[21]")
		public static WebElement  select6thRow_20thColumn;


		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
		public static WebElement  select7thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
		public static WebElement  select7thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
		public static WebElement  select7thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
		public static WebElement  select7thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
		public static WebElement  select7thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
		public static WebElement  select7thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
		public static WebElement  select7thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
		public static WebElement  select7thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
		public static WebElement  select7thRow_9thColumn;



		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
		public static WebElement  select8thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
		public static WebElement  select8thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
		public static WebElement  select8thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
		public static WebElement  select8thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
		public static WebElement  select8thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
		public static WebElement  select8thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
		public static WebElement  select8thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
		public static WebElement  select8thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
		public static WebElement  select8thRow_9thColumn;


		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
		public static WebElement  select9thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
		public static WebElement  select9thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
		public static WebElement  select9thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
		public static WebElement  select9thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
		public static WebElement  select9thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
		public static WebElement  select9thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
		public static WebElement  select9thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
		public static WebElement  select9thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
		public static WebElement  select9thRow_9thColumn;



		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
		public static WebElement  select10thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
		public static WebElement  select10thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
		public static WebElement  select10thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
		public static WebElement  select10thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
		public static WebElement  select10thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
		public static WebElement  select10thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
		public static WebElement  select10thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
		public static WebElement  select10thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
		public static WebElement  select10thRow_9thColumn;


		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
		public static WebElement  select11thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
		public static WebElement  select11thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
		public static WebElement  select11thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
		public static WebElement  select11thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
		public static WebElement  select11thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
		public static WebElement  select11thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
		public static WebElement  select11thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
		public static WebElement  select11thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
		public static WebElement  select11thRow_9thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
		public static WebElement  select12thRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
		public static WebElement  select12thRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
		public static WebElement  select12thRow_3rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
		public static WebElement  select12thRow_4thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
		public static WebElement  select12thRow_5thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
		public static WebElement  select12thRow_6thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
		public static WebElement  select12thRow_7thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
		public static WebElement  select12thRow_8thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
		public static WebElement  select12thRow_9thColumn;

		@FindBy(xpath="//input[@id='id_body_12']")
		public static WebElement  enter_AccountTxt;
		
		@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
		public static WebElement  enter_Account_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
		public static WebElement  enter_Account_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
			public static WebElement  enter_Account_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
			public static WebElement  enter_Account_Settings_StandardFieldsBtn;
									
						@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_Fielddropdown;
															
						@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_HeaderTxt;
														
						@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;
															
						@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_WidthTxt;
															
						@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_OkBtn;
															
						@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
						public static WebElement  enter_Account_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
			public static WebElement  enter_Account_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  enter_Account_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  enter_Account_Settings_CancelBtn;

		@FindBy(xpath="//input[@id='id_body_16']")
		public static WebElement  enter_Amount;
		
		@FindBy(xpath="//textarea[@id='id_body_16777219']")
		public static WebElement  enter_Receipts_Remarks;
		
		@FindBy(xpath="//textarea[@id='id_body_16777222']")
		public static WebElement  enter_Payments_Remarks;
		
		@FindBy(xpath="//textarea[@id='id_body_16777225']")
		public static WebElement  enter_PettyCash_Remarks;
		
		@FindBy(xpath="//textarea[@id='id_body_16777228']")
		public static WebElement  enter_PostDatedReceipts_Remarks;
		
		@FindBy(xpath="//textarea[@id='id_body_16777231']")
		public static WebElement  enter_PostDatedPaymentss_Remarks;
		
		@FindBy(xpath="//input[@id='id_body_23']")
		public static WebElement  enter_ItemTxt;
		
		@FindBy(xpath="//*[@id='id_body_23_input_image']/span")
		public static WebElement  item_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_23_input_settings']/span")
		public static WebElement  item_SettingsBtn;

			@FindBy(xpath="//div[@id='id_body_23_customize_popup_container']")
			public static WebElement  item_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_body_23_customize_popup_footer']//input[1]")
			public static WebElement  item_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_list']")
				public static WebElement  item_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_header']")
				public static WebElement  item_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_alignment']")
				public static WebElement  item_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_width']")
				public static WebElement  item_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				public static WebElement  item_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				public static WebElement  item_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_body_23_search_container']//input[2]")
			public static WebElement  item_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  item_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  item_Settings_CancelBtn;

		@FindBy(xpath="//input[@id='id_body_24']")
		public static WebElement  enter_UnitTxt;
		
		@FindBy(xpath="//*[@id='id_body_24_input_image']/span")
		public static WebElement  unit_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_24_input_settings']/span")
		public static WebElement  unit_SettingsBtn;

			@FindBy(xpath="//div[@id='id_body_24_customize_popup_container']")
			public static WebElement  unit_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_body_24_customize_popup_footer']//input[1]")
			public static WebElement  unit_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_list']")
				public static WebElement  unit_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_header']")
				public static WebElement  unit_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_alignment']")
				public static WebElement  unit_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_width']")
				public static WebElement  unit_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				public static WebElement  unit_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				public static WebElement  unit_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_body_24_search_container']//input[2]")
			public static WebElement  unit_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  unit_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  unit_Settings_CancelBtn;

			
			
			
			
		@FindBy(xpath="//input[@id='id_body_33554460']")
		public static WebElement  enter_AQ;
		
		@FindBy(xpath="//input[@id='id_body_33554461']")
		public static WebElement  enter_FQ;
		
		
		@FindBy(xpath="//input[@id='id_body_33554511']")
		public static WebElement  AQ;
		
		@FindBy(xpath="//input[@id='id_body_33554512']")
		public static WebElement  FQ;
			
		@FindBy(xpath="//input[@id='id_body_26']")
		public static WebElement  enter_Quantity;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td[2]/input")
		public static WebElement  purchasesOrderspopUpRow1CheckBox;
		
		@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup']/div[2]/div/div[3]/div/input[@value='Ok']")
		public static WebElement  purchasesOrderspopUpOkBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_heading']")
		public static WebElement  purchasesOrderspopUpTextElement;
		
		@FindBy(xpath="//input[@id='id_body_35_5']")
		public static WebElement  enter_PurchasesOrders;
		
			@FindBy (xpath="//input[@id='id_transaction_entry_detail_workflow_popup_control_heading_ctrl_1']")
			public static WebElement purchaseOrderLinkHeaderChkBox;
			
			@FindBy (xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr")
			public static List<WebElement> purchaseOrderLinkPopupVouchersList;
			
			@FindBy (xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[7]")
			public static List<WebElement> purchaseOrderLinkPopupVouchersNoList;
			
			@FindBy (xpath="//tbody[@id='id_transaction_entry_detail_workflow_popup_body']/tr/td[2]/input")
			public static List<WebElement> purchaseOrderLinkPopupChkBoxList;
			
			@FindBy (xpath="//*[@id='id_transactionentry_workflow_popup']/div[2]/div/div[3]/div/input[@value='Ok']")
			public static WebElement purchaseOrderLinkPopupOkBtn;
			
		@FindBy(xpath="//input[@id='id_body_27']")
		public static WebElement  enter_Rate;
		
		@FindBy(xpath="//*[@id='id_body_28']")
		public static WebElement  enter_Gross;
		
		@FindBy(xpath="//input[@id='id_body_22']")
		public static WebElement  enter_Reserve;
		
		@FindBy(xpath="//input[@id='id_body_13']")
		public static WebElement  enter_Batch;
		
		@FindBy(xpath="//input[@id='id_body_38']")
		public static WebElement  enter_RMA;
		
		@FindBy(xpath="//input[@id='id_body_85']")
		public static WebElement  enter_Bin;
		
		@FindBy(xpath="//input[@id='id_body_12']")
		public static WebElement  enter_DebitACTxt;
		
		@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
		public static WebElement  enter_DebitAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
		public static WebElement  enter_DebitAC_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
			public static WebElement  enter_DebitAC_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
			public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				public static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
			public static WebElement  enter_DebitAC_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  enter_DebitAC_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  enter_DebitAC_Settings_CancelBtn;

		@FindBy(xpath="//input[@id='id_body_39']")
		public static WebElement  enter_CreditACTxt;
		
		@FindBy(xpath="//*[@id='id_body_39_input_image']/span")
		public static WebElement  enter_CreditAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_39_input_settings']/span")
		public static WebElement  enter_CreditAC_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_39_customize_popup_container']")
			public static WebElement  enter_CreditAC_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_39_customize_popup_footer']//input[1]")
			public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_list']")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_header']")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_alignment']")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_width']")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				public static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_header_39_search_container']//input[2]")
			public static WebElement  enter_CreditAC_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  enter_CreditAC_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  enter_CreditAC_Settings_CancelBtn;

		@FindBy(xpath="//input[@id='id_body_18']")
		public static WebElement  enter_DebitTxt;
		
		@FindBy(xpath="//input[@id='id_body_19']")
		public static WebElement  enter_CreditTxt;
		
		@FindBy(xpath="//textarea[@id='id_body_16777241']")
		public static WebElement  enter_NonStandardJournalEntries_RemarksTxt;
		
		@FindBy(xpath="//input[@id='id_body_87']")
		public static WebElement  enter_Warehouse2Txt;
		
		@FindBy(xpath="//*[@id='id_body_87_input_image']/span")
		public static WebElement  enter_Warehouse2_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='id_body_87_input_settings']/span")
		public static WebElement  enter_Warehouse2_SettingsBtn;

			@FindBy(xpath="//div[@id='id_header_87_customize_popup_container']")
			public static WebElement  enter_WareHouse2_Settings_Container;
									
			@FindBy(xpath="//div[@id='id_header_87_customize_popup_footer']//input[1]")
			public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn;
									
				@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_list']")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;
													
				@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_header']")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;
												
				@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_alignment']")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;
													
				@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_width']")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;
													
				@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
				public static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;
									
			@FindBy(xpath="//div[@id='id_header_87_search_container']//input[2]")
			public static WebElement  enter_WareHouse2_Settings_DeleteColumnBtn;
									
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			public static WebElement  enter_WareHouse2_Settings_OkBtn;
							
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			public static WebElement  enter_WareHouse2_Settings_CancelBtn;


		// Right Panel InfoSide Bar	
		@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
		public static WebElement  infoSideBarCustomizeBtn;

		@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
		public static WebElement  infoSideBarMinimizeExpandBtn;
			
			@FindBy(xpath="//li[@id='Trans_Dash_Save']//span[text()='Save']")
			public static WebElement  customizeSaveBtn;
			
			@FindBy(xpath="//span[@class='noWrap clsBlueColor'][contains(text(),'Cancel')]")
			public static WebElement  customizeCancelBtn;
			
			@FindBy(xpath="//input[@id='searchBoxTrans']")
			public static WebElement  customizeSearchTxt;
						
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
			public static WebElement  customizeSearchBtn;
						
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
			public static WebElement  graphBtn;
						
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
				public static WebElement  newGraphOption;
					
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
			public static WebElement  reportBtn;
				
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
				public static WebElement  newReportOption;
						
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
			public static WebElement  infoPanelBtn;
						
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
				public static WebElement  newInfoPanelOption;
				
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
			public static WebElement  workFlowBtn;
							
					@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
					public static WebElement  newWorkFlowOption;
							
			@FindBy(xpath="//a[@id='DocumentInfoOption']")
			public static WebElement  otherDashlets;
							
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//label[contains(@class,'theme_icon-color')][contains(text(),'Document Info')]")
				public static WebElement  documentInfo;

		/*@FindBy(xpath="//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
		public static WebElement  infoSideBarMinimizeExpandBtn;	*/	
				
		@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
		public static WebElement  infoSideBarExpandBtn;


		// Footer Section
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
		public static WebElement  netLabel;
		
		@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
		public static WebElement  netAmount;


		
		//Navigation of Voucher Menus
		
		// Financial Menu and Sub Menus
		@FindBy(xpath="//span[@class='icon-financial icon-font1']")
		public static WebElement  finacinalsMenu;
		
			@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
			public static WebElement  transactionsExpandBtn;
				
				@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
				public static WebElement  purchasesExpandBtn;
				
				@FindBy(xpath="//span[contains(text(),'Purchases Vouchers')]")
				public static WebElement  purchaseVouchersBtn;
				
	    //Inventory Menu and Sub Menus		
		@FindBy(xpath="//a[@id='135']")
		public static WebElement  inventoryMenu; 
		
		@FindBy(xpath="//label[text()='Copy to Clipboard']")
		public static WebElement  copyToclipBoard;
		
		@FindBy(xpath="//label[text()='Paste from Clipboard']")
		public static WebElement  pasteFromClipBoard;
		
		@FindBy(xpath = "//a[@id='200']")
		public static WebElement InventoryReportsMenu;
		
		@FindBy(xpath = "//a[@id='551']")
		public static WebElement InventoryStockLedgerMenu;
		
			@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
			public static WebElement  inventoryTransactionsMenu; 
				
				@FindBy(xpath="//*[@id='139']/span")
				public static WebElement  inventoryTransactionsPurchasesMenu; 
			
					@FindBy(xpath="//*[@id='2010']/span")
					public static WebElement  requestForQuoteVoucher;
					
					@FindBy(xpath="//*[@id='2011']/span")
					public static WebElement  purchasesQuotationsVoucher;
						
					@FindBy(xpath="//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
					public static WebElement  purchasesOrdersVoucher;
					
					@FindBy(xpath="//a[@id='2075']//span[contains(text(),'New MRN')]")
					public static WebElement  newMrn;						
				
					@FindBy(xpath="//*[@id='2013']/span")
					public static WebElement  materialReceiptNotesVoucher;
						
				@FindBy(xpath="//*[@id='140']/span")
				public static WebElement  inventoyTransactionsSalesMenu; 
					
					@FindBy(xpath="//*[@id='2018']/span")
					public static WebElement  salesQuotationsVoucher;
					
					@FindBy(xpath="//*[@id='2019']/span")
					public static WebElement  deliveryNotesVoucher;
					
					@FindBy(xpath="//*[@id='2022']/span")
					public static WebElement  posSalesVoucher;
					
					@FindBy(xpath="//*[@id='2045']/span")
					public static WebElement  productionOrdersVoucher;
					
					@FindBy(xpath="//*[@id='2017']/span")
					public static WebElement  salesOrdersVoucher;
								
				@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
				public static WebElement  inventoryTransactionsStocksMenu; 
					
					@FindBy(xpath="//*[@id='2034']/span")
					public static WebElement  shortagesInStockVoucher;
					
					@FindBy(xpath="//*[@id='2035']/span")
					public static WebElement  excessesInStocksVoucher;
						
					@FindBy(xpath="//*[@id='2036']/span")
					public static WebElement  stockTransfersVoucher;
					
					@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
					public static WebElement  openingStocksVoucher;
					
					@FindBy(xpath="//span[contains(text(),'Opening Stocks New')]")
					public static WebElement  openingStocksNewVoucher;
					
					@FindBy(xpath="//*[@id='2038']/span")
					public static WebElement  materialRequisitionVoucher;
							
					@FindBy(xpath="//*[@id='2049']/span")
					public static WebElement  stockAdjustmentVoucher;
						
				@FindBy(xpath="//*[@id='164']/span")
				public static WebElement  holdAndUnholdStockVoucher;
				
				@FindBy(xpath="//*[@id='93']/span")
				public static WebElement  stockReconciliation;
				
				@FindBy(xpath="//*[@id='99']/span")
				public static WebElement  stockAllocation;
			
				
	    //Validation and Confirmation messages
		/*@FindBy(xpath="//div[@class='theme_color font-6']")
		public static WebElement errorMessage;
		 
		@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
		public static WebElement errorMessageCloseBtn;*/
				
				@FindBy(xpath = "//*[@id='idGlobalError']/div/div[2]")
				public static WebElement errorMessage;

				@FindBy(xpath = "//*[@id='idGlobalError']/div/div[1]/button")
				public static WebElement errorMessageCloseBtn;
		
		//Dash board Page
		@FindBy(xpath="//*[@id='dashName']")
	    public static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		public static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    public static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
	    public static WebElement dashboardCustomizationSettings;
				
			   
			    
	    //Vouchers Settings Options
		@FindBy(xpath="(//i[@class='icon-update hiconright2'])[1]")
		public static WebElement  settings_updateBtn;
		
		@FindBy(xpath="(//i[@class='icon-close hiconright2'])[1]")
		public static WebElement  settings_closeBtn;
						
			//Documents Tab
			@FindBy(xpath="//div[@class='font-5 theme_background-color-inverse theme_color-inverse']")
			public static WebElement  documentsTab;
			
			@FindBy(xpath="//li[@id='navigationtab1']")
			public static WebElement  documentsTabForMaterialReceiptNotes;
			
			@FindBy(xpath="//span[@id='DocumentLoadMasterPopupBtn']")
			public static WebElement  loadMastersBtn;
				
				@FindBy(xpath="//select[@id='doc_voucherDropDown']")
				public static WebElement  loadmasterDropDown;
				
				@FindBy(xpath="//button[@id='btnSelectDependMaster']")
				public static WebElement  selectAllBtn;
				
				@FindBy(xpath="//button[contains(text(),'Reset')]")
				public static WebElement  resetBtn;
				
				@FindBy(xpath="//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
				public static WebElement  okBtn;
				
				@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/span[1]")
				public static WebElement  deleteTagBtn;
				
				@FindBy(xpath="//span[@id='DocumentAddGroupPopupBtn']")
				public static WebElement  addGroupBtn;
				
					@FindBy(xpath="//input[@id='doc_GroupName']")
					public static WebElement  groupNameTXt;
					
					@FindBy(xpath="//button[contains(text(),'Add')]")
					public static WebElement  addBtn;
					
					@FindBy(xpath="//div[@class='col-xs-12 form-group']//button[@id='btnCancel']")
					public static WebElement  cancelBtn;

				@FindBy(xpath="//div[@id='voucherTabContent']//span[2]")
				public static WebElement  deletegroupBtn;
				
				@FindBy(xpath="//input[@id='doc_title']")
				public static WebElement  titleTxt;
				
				@FindBy(xpath="//input[@id='doc_baseDocument']")
				public static WebElement  baseDocumentTxt;
				
				@FindBy(xpath="//input[@id='txtbox_doc_Accountdepandency']")
				public static WebElement  accountDependencyTxt;
				
					@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
					public static WebElement  iExchangeAdjustmentGainACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
					public static WebElement  iExchangeAdjustmentLossACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
					public static WebElement  iPrimaryAccountChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCity')]")
					public static WebElement  iCityChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
					public static WebElement  iDeliverycityChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iBankAc')]")
					public static WebElement  iBankACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
					public static WebElement  iPDCDiscountedACChkBox;
							
				@FindBy(xpath="//input[@id='txtbox_doc_Productdepandency']")
				public static WebElement  itemDependencyTxt;
				
					@FindBy(xpath="//span[contains(text(),'Outlet__')]")
					public static WebElement  outletChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCostofShortageStockAC')]")
					public static WebElement  iCostofShortageStockACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCostofExcessStockAC')]")
					public static WebElement  iCostofExcessStockACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCostofSaleReturnAC')]")
					public static WebElement  iCostofSaleReturnACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iPurchaseVarianceAC')]")
					public static WebElement  iPurchaseVarianceACChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iDefaultBaseUnit')]")
					public static WebElement  iDefaultBaseUnitChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iDefaultSalesUnit')]")
					public static WebElement  iDefaultSalesUnitChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iDefaultPurchaseUnit')]")
					public static WebElement  iDefaultPurchaseUnitChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCostOfIssueAccount')]")
					public static WebElement  iCostOfIssueAccountChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iStocksAccount')]")
					public static WebElement  iStocksAccountChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iSalesAccount')]")
					public static WebElement  iSalesAccountChkBox;
					
					@FindBy(xpath="//li[12]//div[1]//label[1]//span[1]")
					public static WebElement  otherdetails1Box;
					
					@FindBy(xpath="//li[13]//div[1]//label[1]//span[1]")
					public static WebElement  replenishment1ChkBox;
					
					@FindBy(xpath="//span[contains(text(),'Reorder__')]")
					public static WebElement  reorderChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iCategory')]")
					public static WebElement  iCategoryChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iWIPAccount')]")
					public static WebElement  iWIPAccountChkBox;
					
					@FindBy(xpath="//span[contains(text(),'Classification__')]")
					public static WebElement  classificationChkBox;
					
					@FindBy(xpath="//li[18]//div[1]//label[1]//span[1]")
					public static WebElement  repelenishment2ChkBox;
					
					@FindBy(xpath="//li[19]//div[1]//label[1]//span[1]")
					public static WebElement  otherDetails2ChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iBin')]")
					public static WebElement  iBinChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iAlternateCategory')]")
					public static WebElement  iAlternateCategoryChkBox;
					
					@FindBy(xpath="//span[contains(text(),'iTaxCode')]")
					public static WebElement  iTaxCodeChkBox;
				
				@FindBy(xpath="//select[@id='doc_Accountdepandency_Filter']")
				public static WebElement  accountfilterDropdown;
				
				@FindBy(xpath="//select[@id='doc_Itemdepandency_Filter']")
				public static WebElement  itemfilterDropdown;
				
				
				// Documents Tab Grid Elements
				
			    // first row 
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-0']")
				public static WebElement  firstrow;
				
				@FindBy(xpath="//div[contains(text(),'Delete Row')]")
				public static WebElement  doc_deleterowBtn;
				
				@FindBy(xpath="//div[contains(text(),'Insert Row')]")
				public static WebElement  doc_insertRowBtn;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
				public static WebElement  masters1;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
				public static WebElement  position1;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']")
				public static WebElement  showDependency1;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']")
				public static WebElement  group1;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']")
				public static WebElement  filter1;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']")
				public static WebElement  mandatory1;
				
				
				// Second Row // Delete and Insert row are same
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-0']")
				public static WebElement  secondRow;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
				public static WebElement  masters2;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
				public static WebElement  position2;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']")
				public static WebElement  showDependency2;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']")
				public static WebElement  group2;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']")
				public static WebElement  filter2;
				
				@FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']")
				public static WebElement  mandatory2;
				
				// After clicking // Properties Changes which are same for all rows
				
				@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
				public static WebElement  masterDropDown;
				
				@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
				public static WebElement  positionDropdown;
				
				@FindBy(xpath="//input[@id='txtbox_doc_TagsDepedencyDropDown']")
				public static WebElement  showDependencyDropdown;
				
				@FindBy(xpath="//input[@id='doc_TagsGroupTxtbox']")
				public static WebElement  groupTxt;
				
				@FindBy(xpath="//select[@id='docFilter']")
				public static WebElement  filterDropdown;
				
				@FindBy(xpath="//select[@id='doc_MandatoryDropDown']")
				public static WebElement  mandatoryDropDown;
				
				
				
				
				//Financials Menu // Opening Balance Voucher Page
				
				@FindBy(xpath="//*[@id='60']")
				public static WebElement  financialsMenu;
				
				@FindBy(xpath="//*[@id='id_transactionentry_workflow_popup_heading']")
				public static WebElement  linkPopupHeading;
				
					@FindBy(xpath="//*[@id='61']/span")
					public static WebElement  financialsTransactionMenu; 		

						@FindBy(xpath="//*[@id='2001']/span")
						public static WebElement  cashAndBankMenu; 
						
				     		@FindBy(xpath="//*[@id='2002']/span")
							public static WebElement  receiptsVoucher;
							
							@FindBy(xpath="//*[@id='2003']/span")
							public static WebElement  paymentsVoucher;
							
							@FindBy(xpath="//*[@id='2004']/span")
							public static WebElement  pettyVoucher;
							
							@FindBy(xpath="//*[@id='2005']/span")
							public static WebElement  postDatedReceiptsVoucher;
										
							@FindBy(xpath="//*[@id='2006']/span")
							public static WebElement  postDatedPaymentsVoucher;
							
							@FindBy(xpath="//*[@id='108']/span")
							public static WebElement  defineChequeSeries;
							
							@FindBy(xpath="//*[@id='109']/span")
							public static WebElement  cancelCheque;				
			
						@FindBy(xpath="//*[@id='2007']/span")
						public static WebElement  financialsTransactionsPurchaseMenu; 
						
							@FindBy(xpath="//*[@id='2008']/span")
							public static WebElement  purchaseVoucher;
							
							@FindBy(xpath="//*[@id='2009']/span")
							public static WebElement  purchaseReturnsVoucher;
													
						@FindBy(xpath="//*[@id='2014']/span")
						public static WebElement  financialsTransactionsSalesMenu;
							
							@FindBy(xpath="//*[@id='2015']/span")
							public static WebElement  salesInvoicesVoucher;
							
							@FindBy(xpath="//*[@id='2016']/span")
							public static WebElement  salesReturnsVoucher;
							
							@FindBy(xpath="//a[@id='2060']/span")
							public static WebElement  salesInvoiceVATVoucher;
							
							
							
							
							/*@FindBy(xpath="//*[@id='2020']/span")
							public static WebElement  cashSales;
									
							@FindBy(xpath="//*[@id='2021']/span")
							public static WebElement  hirePurchaseSales;*/
						
						@FindBy(xpath="//*[@id='2023']/span")
						public static WebElement  financialsTransactionsJournalsMenu;
						
						    @FindBy(xpath="//*[@id='2032']/span")
							public static WebElement  journalsEntriesVoucher;
							
							@FindBy(xpath="//*[@id='2025']/span")
							public static WebElement  forexJVVoucher;
							
							@FindBy(xpath="//*[@id='2029']/span")
							public static WebElement  interdepartmentaljvVoucher;
							
							@FindBy(xpath="//*[@id='2024']/span")
							public static WebElement  oldJouranlEntriesVoucher;
							
							@FindBy(xpath="//*[@id='2026']/span")
							public static WebElement  debitNotesVoucher;
							
							@FindBy(xpath="//*[@id='2030']/span")
							public static WebElement  debitNotesLinewiseVoucher;
							
							@FindBy(xpath="//*[@id='2027']/span")
							public static WebElement  creditNotesVoucher;
							
							@FindBy(xpath="//*[@id='2031']/span")
							public static WebElement  creditNotesLinewiseVoucher;
							
							@FindBy(xpath="//*[@id='2028']/span")
							public static WebElement  openingBalancesVoucher;
							
							@FindBy(xpath="//*[@id='2046']/span")
							public static WebElement  fixedAssetsDepreciationVoucher;
						
						@FindBy(xpath="//*[@id='219']/span")
						public static WebElement  financialsTransactionsAutoPostingsMenu;
						
							@FindBy(xpath="//*[@id='77']/span")
							public static WebElement  recurringJournalVoucher;
							
							@FindBy(xpath="//*[@id='79']/span")
							public static WebElement  postRecurringJournal;
							
							@FindBy(xpath="//*[@id='92']/span")
							public static WebElement  recurringJournalTemplate;
							
							@FindBy(xpath="//*[@id='91']/span")
							public static WebElement  postInterest;
							
							@FindBy(xpath="//*[@id='90']/span")
							public static WebElement  convertMaturedPDCs;
							
							@FindBy(xpath="//*[@id='161']/span")
							public static WebElement assignPDCLimit;
							
							@FindBy(xpath="//*[@id='166']/span")
							public static WebElement  stockReplenishment;

					@FindBy(xpath="//*[@id='62']/span")
					public static WebElement  financialsCreditManagementMenu; 
					
						@FindBy(xpath="//*[@id='63']/span")
						public static WebElement  paymentTerms;
						
						@FindBy(xpath="//*[@id='64']/span")
						public static WebElement  financeTerms;
						
						@FindBy(xpath="//*[@id='65']/span")
						public static WebElement  reminderTerms;		
						
						@FindBy(xpath="//*[@id='89']/span")
						public static WebElement  sendReminder;
						
						@FindBy(xpath="//*[@id='217']/span")
						public static WebElement  delinquency;
						
							@FindBy(xpath="//*[@id='73']/span")
							public static WebElement  questionnarie;
							
							@FindBy(xpath="//*[@id='218']/span")
							public static WebElement  delinquencyMgmt;
							
						@FindBy(xpath="//*[@id='35']/span")
						public static WebElement  creidtApproval;
						
				    @FindBy(xpath="//*[@id='81']/span")
				    public static WebElement  financialsReportsMenu; 
				    
				    @FindBy(xpath="//*[@id='671']/span")
				    public static WebElement  transactionAuthorizationReportmenu;
				    
				    @FindBy(xpath="//input[@id='RITTable__0']")
				    public static WebElement transactionauthorizationReportVoucher;
				    
				    @FindBy(xpath="//*[@id='671']/span")
				    public static WebElement  financialsTransactionAuthorizationReportMenu;
				    
				    @FindBy(xpath="//*[@id='DateOptions_']")
				    public static WebElement  dateOptionDropdown;
				    
				    @FindBy(xpath="//*[@class='icon-ok hiconright2']")
				    public static WebElement  reportOkBtn;
				    
					    @FindBy(xpath="//*[@id='500']/span")
						public static WebElement  ledger;
			
						@FindBy(xpath="//*[@id='658']/span")
						public static WebElement  ledgerDetail;
			
						@FindBy(xpath="//*[@id='501']/span")
						public static WebElement  subLedger;
						
						@FindBy(xpath="//*[@id='82']/span")
						public static WebElement  cashAndBankBooksMenu;
						
							@FindBy(xpath="//*[@id='510']/span")
							public static WebElement  cashBookReport;
							
							@FindBy(xpath="//*[@id='511']/span")
							public static WebElement  bankBookReport;
							
							@FindBy(xpath="//*[@id='512']/span")
							public static WebElement  pettyCashBokReport;
							
							@FindBy(xpath="//*[@id='513']/span")
							public static WebElement  dayBookReport;
							
							@FindBy(xpath="//*[@id='83']/span")
							public static WebElement  bankReconciliationReport;
							
							@FindBy(xpath="//*[@id='84']/span")
							public static WebElement  bankReconciliationImport;
							
							@FindBy(xpath="//*[@id='85']/span")
							public static WebElement  customerVendorReconciliation;
						
							@FindBy(xpath="//*[@id='537']/span")
							public static WebElement  bankReconciliationStatement;
								
							@FindBy(xpath="//*[@id='162']/span")
							public static WebElement chequeDiscountingMenu;
						
						@FindBy(xpath="//*[@id='502']/span")
						public static WebElement  salesReportsMenu;
						
							@FindBy(xpath="//*[@id='503']/span")
							public static WebElement  salesRegisterReport;
			
							@FindBy(xpath="//*[@id='504']/span")
							public static WebElement  salesReturnRegisterReport;
							
							@FindBy(xpath="//*[@id='505']/span")
							public static WebElement summarySalesBookReport;
							
							@FindBy(xpath="//*[@id='628']/span")
							public static WebElement monthlySalesBookReport;
							
							@FindBy(xpath="//*[@id='629']/span")
							public static WebElement  topCustomersListReport;
						
						@FindBy(xpath="//*[@id='506']/span")
						public static WebElement  purchaseReportsMenu;
						
							@FindBy(xpath="//*[@id='507']/span")
							public static WebElement  purchaseRegisterReport;
							
							@FindBy(xpath="//*[@id='508']/span")
							public static WebElement  purchaseReturnRegisteReport;
							
							@FindBy(xpath="//*[@id='509']/span")
							public static WebElement  summaryPurchaseBookReport;
									
						@FindBy(xpath="//*[@id='514']/span")
						public static WebElement  registersReportMenu;
						
							@FindBy(xpath="//*[@id='516']/span")
							public static WebElement  openingBalanceRegisterReport;
							
							@FindBy(xpath="//*[@id='515']/span")
							public static WebElement journalEntriesRegisterReport;
							
							@FindBy(xpath="//span[contains(text(),'Credit Note Register')]")
							public static WebElement creditNoteRegisterReport;
							
							@FindBy(xpath="//*[@id='610']/span")
							public static WebElement  debitNoteRegisterReport;
							
							@FindBy(xpath="//*[@id='598']/span")
							public static WebElement  receiptsRegisterReport;
							
							@FindBy(xpath="//*[@id='599']/span")
							public static WebElement  paymentRegisterReport;
							
							@FindBy(xpath="//*[@id='518']/span")
							public static WebElement  pdcReceiptsRegisterReport;
							
							@FindBy(xpath="//*[@id='519']/span")
							public static WebElement pdcPaymentsRegisterReport;
							
							@FindBy(xpath="//*[@id='517']/span")
							public static WebElement  entryJournalRegisterMenu;
									
						@FindBy(xpath="//*[@id='523']/span")
						public static WebElement  salesAndPurchasesReportMenu;
						
							@FindBy(xpath="//*[@id='524']/span")
							public static WebElement  salesGroupedByCustomerReport;
							
							@FindBy(xpath="//*[@id='525']/span")
							public static WebElement  salesGroupedByProductReport;
							
							@FindBy(xpath="//*[@id='526']/span")
							public static WebElement  salesGroupedByDepartmentReport;
							
							@FindBy(xpath="//*[@id='527']/span")
							public static WebElement  purchasesGroupedByVendorReport;
							
							@FindBy(xpath="//*[@id='528']/span")
							public static WebElement  purchasesGroupedByProductReport;
							
							@FindBy(xpath="//*[@id='529']/span")
							public static WebElement  purchasesGroupedByDepartmentReport;		
						
						@FindBy(xpath="//*[@id='568']/span")
						public static WebElement  MiscellaneousAnalysisReportMenu;
						
							@FindBy(xpath="//*[@id='569']/span")
							public static WebElement  peakAndLowBalancesReport;
							
							@FindBy(xpath="//*[@id='570']/span")
							public static WebElement  comprativeAnalysisReport;
							
							@FindBy(xpath="//*[@id='571']/span")
							public static WebElement  transactionsTypeAnalysisReport;
							
							@FindBy(xpath="//*[@id='572']/span")
							public static WebElement  abcAnalysisReport;
							
							@FindBy(xpath="//*[@id='597']/span")
							public static WebElement  interestCalculationReport;
			
						@FindBy(xpath="//*[@id='536']/span")
						public static WebElement  mastersInformationMenu;
						
					     	@FindBy(xpath="//*[@id='538']/span")
							public static WebElement  masterInfoMenu;
							
							@FindBy(xpath="//*[@id='144']/span")
							public static WebElement  productLabelMenu;
							
							@FindBy(xpath="//*[@id='573']/span")
							public static WebElement  unitConversionMenu;
								
							@FindBy(xpath="//*[@id='147']/span")
							public static WebElement  skidDefinitionMenu;
											
						@FindBy(xpath="//*[@id='520']/span")
						public static WebElement  auditTrailMenu;
						
							@FindBy(xpath="//*[@id='521']/span")
							public static WebElement  auditTrailtransactionsReport;
							
							@FindBy(xpath="//*[@id='522']/span")
							public static WebElement  aAuditTrailloginsReport;
						
						@FindBy(xpath="//*[@id='204']/span")
						public static WebElement  accountQuery;
						
				    @FindBy(xpath="//*[@id='530']/span")
				    public static WebElement  financialsFinalAccountsMenu; 
				    
					    @FindBy(xpath="//*[@id='531']/span")
						public static WebElement trialBalanceReport;
								
						@FindBy(xpath="//*[@id='532']/span")
						public static WebElement profitandLossReport;
						
						@FindBy(xpath="//*[@id='533']/span")
						public static WebElement  tradingAccountReport;
						
						@FindBy(xpath="//*[@id='534']/span")
						public static WebElement  tradingandProfitAndLossReport;
						
						@FindBy(xpath="//*[@id='535']/span")
						public static WebElement  balanceSheetReport;				
						
						@FindBy(xpath="//*[@id='592']/span")
						public static WebElement  finalAccountSchedulesReport;
						
						@FindBy(xpath="//*[@id='593']/span")
						public static WebElement  fundFlowReport;
						
						@FindBy(xpath="//*[@id='594']/span")
						public static WebElement  cashFlowReport;
						
						@FindBy(xpath="//*[@id='252']/span")
						public static WebElement  cashFlowCalendarReport;
						
						@FindBy(xpath="//*[@id='595']/span")
						public static WebElement  cashFlowAnalysisReport;
						
						@FindBy(xpath="//*[@id='632']/span")
						public static WebElement  advanceCashFlowReport;
						
						@FindBy(xpath="//*[@id='630']/span")
						public static WebElement  incomeExpenseTrendsReport;
						
						@FindBy(xpath="//*[@id='655']/span")
						public static WebElement  receivablePayableReport;
					
					@FindBy(xpath="//*[@id='558']/span")
					public static WebElement  financialsReceivableAndPayableAnalysisMenu; 
					
						@FindBy(xpath="//*[@id='605']/span")
						public static WebElement customerDetailMenu;
						
							@FindBy(xpath="//*[@id='559']/span")
							public static WebElement  customerListingOfOutstandingBillsReport;
							
							@FindBy(xpath="//*[@id='560']/span")
							public static WebElement  customerStatementsReport;
							
							@FindBy(xpath="//*[@id='560']/span")
							public static WebElement  customerDueDateAnalysisReport;
							
							@FindBy(xpath="//*[@id='563']/span")
							public static WebElement  customerAgeingDetailsReport;
							
							@FindBy(xpath="//*[@id='564']/span")
							public static WebElement  customerDetailAgeingbyDueDateReport;
							
							@FindBy(xpath="//*[@id='566']/span")
							public static WebElement  customerOverdueAnalysisReport;
						
						@FindBy(xpath="//*[@id='607']/span")
						public static WebElement  customerSummaryMenu;
								
							@FindBy(xpath="//*[@id='562']/span")
							public static WebElement  customerAgeingSummaryMenu;
							
							@FindBy(xpath="//*[@id='565']/span")
							public static WebElement  customerSummaryAgeingByDueDateMenu;
							
							@FindBy(xpath="//*[@id='567']/span")
							public static WebElement  customerOverdueSummaryMenu;
							
							@FindBy(xpath="//*[@id='539']/span")
							public static WebElement  customerbillwiseSummaryMenu;	
						
						@FindBy(xpath="//*[@id='606']/span")
						public static WebElement  vendorDetailMenu;
						
							@FindBy(xpath="//*[@id='541']/span")
							public static WebElement  vendorListingoFOutstandingBillsReport;
								
							@FindBy(xpath="//*[@id='542']/span")
							public static WebElement  vendorStatementsReport;
							
							@FindBy(xpath="//*[@id='543']/span")
							public static WebElement  vendorDueDateAnalysisReport;
							
							@FindBy(xpath="//*[@id='545']/span")
							public static WebElement  vendorAgeingDetailsReport;
								
							@FindBy(xpath="//*[@id='546']/span")
							public static WebElement  vendorDetailVendorDetailAgeingByDueDateMenu;
						
							@FindBy(xpath="//*[@id='548']/span")
							public static WebElement  vendorOverdueAnalysisMenu;
							
						@FindBy(xpath="//*[@id='608']/span")
						public static WebElement  vendorSummaryMenu;
						
							@FindBy(xpath="//*[@id='544']/span")
							public static WebElement  vendorAgeingSummaryReport;
							
							@FindBy(xpath="//*[@id='547']/span")
							public static WebElement  vendorSummaryAgeingByDueDateReport;
							
							@FindBy(xpath="//*[@id='549']/span")
							public static WebElement  vendorOverdueSummaryReport;
							
							@FindBy(xpath="//*[@id='634']/span")
							public static WebElement  vendorbillWiseSummaryReport;
						
						@FindBy(xpath="//*[@id='75']/span")
						public static WebElement  letterofCredit;
						
						@FindBy(xpath="//*[@id='165']/span")
						public static WebElement  releaseLetterofCredit;
				
					@FindBy(xpath="//*[@id='3301']/span")
					public static WebElement  financialsBudgetMenu; 
					
						@FindBy(xpath="//*[@id='3302']/span")
						public static WebElement  defineBudgetReport;
						
						@FindBy(xpath="//*[@id='3303']/span")
						public static WebElement  confirmBudgetReport;
						
						@FindBy(xpath="//*[@id='3304']/span")
						public static WebElement  reviseBudgetMenu;
						
							@FindBy(xpath="//*[@id='3305']/span")
							public static WebElement  appendBudget;
							
							@FindBy(xpath="//*[@id='3306']/span")
							public static WebElement  addORReduceBudget;
							
							@FindBy(xpath="//*[@id='3307']/span")
							public static WebElement  transferBudget;
						
						@FindBy(xpath="//*[@id='3309']/span")
						public static WebElement  approveBudgetReport;
						
						@FindBy(xpath="//*[@id='3310']/span")
						public static WebElement  rejectedBudgetReport;
						
						@FindBy(xpath="//*[@id='3321']/span")
						public static WebElement  budgetReportsMenu;
						
							@FindBy(xpath="//*[@id='666']/span")
							public static WebElement  advancedBudgetReportMenu;
							
							@FindBy(xpath="//*[@id='669']/span")
							public static WebElement  revisedBudgetReportMenu;
					
							
					@FindBy(xpath="//*[@id='3311']/span")
					public static WebElement  financialsOnlinePaymentsMenu;   
					
						@FindBy(xpath="//*[@id='3312']/span")
						public static WebElement  onlineBankRegistrationMenu;
						
						@FindBy(xpath="/html/body/section/div[2]/aside/section/ul/li[2]/ul/li[7]/ul/li[2]/a/span")
						public static WebElement  issuePaymentToBankMenu;
						
						@FindBy(xpath="/html/body/section/div[2]/aside/section/ul/li[2]/ul/li[7]/ul/li[3]/a/span")
						public static WebElement  reconcilePaymentsMenu;
						
						@FindBy(xpath="//*[@id='3315']/span")
						public static WebElement  onlineBankReconcilationMenu;
						
						@FindBy(xpath="//*[@id='3317']/span")
						public static WebElement  bankStatementMenu;	
					    
						@FindBy(xpath="//a[text()='  Dashboard']")
						public static WebElement dashboard;

						 //Starting Of PurchaseVoucher 
					    
						@FindBy(xpath="//span[contains(text(),'Purchase Vouchers N')]")
						public static WebElement  purchaseVoucherNew;
						
						@FindBy(xpath="(//td[text()='2'])[1]//..//td[13]")
						public static WebElement voucher2AuthorizationStatus;
						
						@FindBy(xpath="(//td[text()='2'])[1]//..//td[2]/input")
						public static WebElement voucher2checkBox;

						
						@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
						public static WebElement  homePageAllVouchersView;
						
						@FindBy(xpath="//a[contains(text(),'*Pending Authorization Purchase')]")
						public static WebElement  homePagePendingAuthorizationView;
						
						@FindBy(xpath="//a[contains(text(),'Pending Purchases Orders')]")
						public static WebElement  homePagePendingOrdersLinks;
						
						@FindBy(xpath = "//ul[@id='navigation_menu']/li[2]/ul/li/a/span")
						public static List<WebElement> financialsMenusList;
						
						@FindBy(xpath = "//a[@id='id_transaction_homescreen_convert']")
						public static WebElement  homeScreenconvert;
						
						@FindBy(xpath="//input[@id='id_body_12']")
						public static WebElement  enter_PurchaseAccTxt;
						
						@FindBy(xpath="//input[@id='id_body_16777323']")
						public static WebElement  tax_Code;
						
						@FindBy(xpath="//input[@id='id_body_536873913']")
						public static WebElement  enter_brandTxt;
						
						@FindBy(xpath="//input[@id='id_body_536870918']")
						public static WebElement  enter_LoactionTxt;
						
						@FindBy(xpath="//input[@id='id_body_536870916']")
						public static WebElement  enter_WarehouseTxt;
						
						
						
						
						
						
						@FindBy(xpath="//span[@class='icon-pick']")
						public static WebElement  billRefPickIcon;		
						
						@FindBy(xpath="//span[@class='icon-ok']")
						public static WebElement  billRefOkBtn;		
						
						@FindBy(xpath="//li[@id='id_Cancel']")
						public static WebElement  billRefcancel;	
				
			    
		
				
		 //Views Tab
		@FindBy(xpath="//span[@class='icon-views'")
		public static WebElement  viewsTab;
			
		//Export Fields 
		@FindBy(xpath="//span[contains(text(),'Export Fields')]")
		public static WebElement exportFieldsTab;
			
		//Triggers
		@FindBy(xpath="//span[@class='icon-trigger icon-font7']")
		public static WebElement  triggersTab;	
			
		//Document Numbering
		@FindBy(xpath="//span[contains(text(),'Document Numbering')]")
		public static WebElement  documentNumberingTab;
			
		//Hire Purchase	
		@FindBy(xpath="//span[contains(text(),'Hire Purchase')]")
		public static WebElement hirePurchasetab;
			
		//Reports Tab	
		@FindBy(xpath="//span[@class='icon-text70 icon-font7']")
		public static WebElement  reportsTab;	
		
		//Schemes
		@FindBy(xpath="//span[contains(text(),'Schemes')]")
		public static WebElement schemestab;	
		
		
		// Bin Inward Elements
		
			@FindBy (xpath="//input[@id='id_bins_totalquantity']")
			public static WebElement binTotalQty;
			
			@FindBy (xpath="//div[@class='modal-body']//div[4]")
			public static WebElement binBaseUOM;
			
			@FindBy (xpath="//input[@id='srch_bin']")
			public static WebElement binSearchTxt;
			
			
			
			@FindBy (xpath="//i[@class='icon-search form-control-feedback searchicon searchicon-extra']")
			public static WebElement binSearchBtn; 
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
			public static WebElement  binselect1stRow_1stColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
			public static WebElement  binselect1stRow_2ndColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
			public static WebElement  binselect1stRow_3rdColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
			public static WebElement  binselect1stRow_4thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
			public static WebElement  binselect1stRow_5thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
			public static WebElement  binselect1stRow_6thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
			public static WebElement  binselect1stRow_7thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
			public static WebElement  binselect1stRow_8thColumn;
			
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']")
			public static WebElement  binselect2ndRow_1stColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']")
			public static WebElement  binselect2ndRow_2ndColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']")
			public static WebElement  binselect2ndRow_3rdColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']")
			public static WebElement  binselect2ndRow_4thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']")
			public static WebElement  binselect2ndRow_5thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']")
			public static WebElement  binselect2ndRow_6thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']")
			public static WebElement  binselect2ndRow_7thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']")
			public static WebElement  binselect2ndRow_8thColumn;
			
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']")
			public static WebElement  binselect3rdRow_1stColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']")
			public static WebElement  binselect3rdRow_2ndColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']")
			public static WebElement  binselect3rdRow_3rdColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']")
			public static WebElement  binselect3rdRow_4thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']")
			public static WebElement  binselect3rdRow_5thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']")
			public static WebElement  binselect3rdRow_6thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']")
			public static WebElement  binselect3rdRow_7thColumn;
			
			@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']")
			public static WebElement  binselect3rdRow_8thColumn;
			
			
			@FindBy(xpath="//span[@class='icon-sum']")
			public static WebElement  binRowSum;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[2]")
			public static WebElement  binRowSum_2ndColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[4]")
			public static WebElement  binSelect4htRow_3rdColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[6]")
			public static WebElement  binRowSum_4thColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[7]")
			public static WebElement  binRowSum_5thColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[8]")
			public static WebElement  binRowSum_6thColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[9]")
			public static WebElement  binRowSum_7thColumn;
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[12]")
			public static WebElement  binRowSum_8thColumn;
			
			
			@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
			public static WebElement  binSumInward;
			
			
			
			@FindBy (xpath="//input[@id='id_bins_balance']")
			public static WebElement binBalanceTxt;
			
			@FindBy (xpath="//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
			public static WebElement binAlternateCategoryCheckBtn;
			
			@FindBy (xpath="//input[@id='id_btnautoallocate']")
			public static WebElement binAutoAllocateBtn;
			
			@FindBy (xpath="//span[@class='icon-pick icon-font4']")
			public static WebElement binPickBtn; 
			
			@FindBy (xpath="//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
			public static WebElement binAutoAllocateWithinGroupBtn;
			
			@FindBy (xpath="//input[@id='id_bins_ok']")
			public static WebElement binOkBtn;
			
			@FindBy (xpath="//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']")
			public static WebElement binCancelBtn;

			
			// RMA POpup Window
			@FindBy (xpath="//div[@id='Modal_Header']/h5")
			public static WebElement rmaScreenTitle;
			
			@FindBy (xpath="//input[@id='txtSerialNo']")
			public static WebElement rmaSerialNumberTxtField;

			@FindBy (xpath="//input[@id='txtQuantity']")
			public static WebElement rmaQuantityTxtField;
			
			@FindBy (xpath="//i[@class='icon icon-add']")
			public static WebElement rmaAddBtn;
				
			@FindBy (xpath="//div[@id='Modal_Search_Body']/div[3]/label")
			public static WebElement rmaNumberofItemsLabel;
			
			@FindBy (xpath="//th[@id='RMA_Table_control_heading_1']/div")
			public static WebElement rmaTableHeadingRMA;
			
			@FindBy (xpath="//th[@id='RMA_Table_control_heading_2']/div")
			public static WebElement rmaTableHeadingDocumentNo;
			
			@FindBy (xpath="//th[@id='RMA_Table_control_heading_3']/div")
			public static WebElement rmaTableHeadingDocumentDate;
			
			@FindBy (xpath="//button[contains(text(),'Clear')]")
			public static WebElement rmaClearBtn;
			
			@FindBy (xpath="//button[@id='div_OK']")
			public static WebElement rmaOkBtn;
			
			@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[3]/label")
			public static WebElement rmaCancelBtn;
			
			@FindBy (xpath="//div[@id='Modal_Header']/div[2]/span/i")
			public static WebElement rmaCloseBtn;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_1-1']")
			public static WebElement rmaTableRow1Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_2-1']")
			public static WebElement rmaTableRow2Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_3-1']")
			public static WebElement rmaTableRow3Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_4-1']")
			public static WebElement rmaTableRow4Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_5-1']")
			public static WebElement rmaTableRow5Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_6-1']")
			public static WebElement rmaTableRow6Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_7-1']")
			public static WebElement rmaTableRow7Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_8-1']")
			public static WebElement rmaTableRow8Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_9-1']")
			public static WebElement rmaTableRow9Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_10-1']")
			public static WebElement rmaTableRow10Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_11-1']")
			public static WebElement rmaTableRow11Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_12-1']")
			public static WebElement rmaTableRow12Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_13-1']")
			public static WebElement rmaTableRow13Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_14-1']")
			public static WebElement rmaTableRow14Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_15-1']")
			public static WebElement rmaTableRow15Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_16-1']")
			public static WebElement rmaTableRow16Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_17-1']")
			public static WebElement rmaTableRow17Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_18-1']")
			public static WebElement rmaTableRow18Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_19-1']")
			public static WebElement rmaTableRow19Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_20-1']")
			public static WebElement rmaTableRow20Column1;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_1-2']")
			public static WebElement rmaTableRow1Column2;
			
			@FindBy (xpath="//td[@id='RMA_Table_col_1-3']")
			public static WebElement rmaTableRow1Column3;
			
			@FindBy (xpath="//td[@id='id_body_38_input_image']/img")
			public static WebElement rmaExpansionBtn;
			
		//  Reports Elements
			
			@FindBy(xpath="(//tr[@id='trRender_0'])[1]/td")
			public static List<WebElement> reportsRow1List;
		  	
		  	@FindBy(xpath="(//tr[@id='trRender_1'])[1]/td")
		  	public static List<WebElement> reportsRow2List;
			
			@FindBy(xpath="(//tr[@id='trRender_2'])[1]/td")
			public static List<WebElement> reportsRow3List;
			
			@FindBy(xpath="(//tr[@id='trRender_3'])[1]/td")
			public static List<WebElement> reportsRow4List;
			
			@FindBy(xpath="(//tr[@id='trRender_4'])[1]/td")
			public static List<WebElement> reportsRow5List;
			
			@FindBy(xpath="(//tr[@id='trRender_5'])[1]/td")
			public static List<WebElement> reportsRow6List;
			
			@FindBy(xpath="(//tr[@id='trRender_6'])[1]/td")
			public static List<WebElement> reportsRow7List;
			
			@FindBy(xpath="(//tr[@id='trRender_7'])[1]/td")
			public static List<WebElement> reportsRow8List;
			
			
			//----------------------------------------------------------------------------------------------------------    
		    // Edit Screen Tab     
					    
		    @FindBy(xpath="//span[contains(text(),'Edit Screen')]")
		   	public static WebElement  editScreenTab; 
			
			@FindBy(xpath="//i[@class='icon-add icon-font7']")
			public static WebElement editScreenaddBtn;

			@FindBy(xpath="//a[contains(text(),'Field Details')]")
			public static WebElement editScreenFieldDetailsTab;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Caption']")
			public static WebElement  editScreenCaptionTxt;

			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_DataType']")
			public static WebElement  editScreenCaptionDataTypeDropdown;
			
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_DefaultValue']")
			public static WebElement editScreenDefaultValueTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_noofDecimals']")
			public static WebElement editScreenNoOfDecimalsDropdown;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_toolTip']")
			public static WebElement editScreenToolTipTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_bannerText']")
			public static WebElement editScreenBannerTextTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MinValue']")
			public static WebElement editScreenMinimunValueTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MaxValue']")
			public static WebElement editScreenMaximunValueTxt;
		   
			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_behaviour']")
			public static WebElement editScreenAddFieldsBehaviourDropdown;
			
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_textbox']")
			public static WebElement  editScreenAddBehaviourformulaTxt;
			
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_Ok']")
			public static WebElement  editScreenAddBehaviourFormulaokBtn;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
			public static WebElement editScreenPreloadTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
			public static WebElement editScreenRestrictformulaTxt;
		   
			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_RoundOff']")
			public static WebElement editScreenRoundOffsDropdown;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RoundOffTo']")
			public static WebElement editScreenRoundOffToTxt;
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RestrictMsg']")
			public static WebElement editScreenRestrictMessageTxt;
		   
			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToNet']")
			public static WebElement editScreenAddToNetDropdown;
		   
			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToStock']")
			public static WebElement editScreenAddToStockDropDown;

			@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_Position']")
			public static WebElement editScreenpositionDropdown;  
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Columnwidth']")
			public static WebElement editScreenColumnWidthTxt;  
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
			public static WebElement editScreenValueInBaseCurrencyChkBox;  
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
			public static WebElement editScreenHideFromSummaryChkBox;  
		   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkPostToAcc']")
			public static WebElement editScreenPostToAccountChkBox;  
		 
			@FindBy(xpath="//input[@id='acc1-1']")
			public static WebElement editScreenAccount1Radio;  
					   
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1']")
			public static WebElement editScreenAccount1Txt;  
		   
			@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_image']/span")
			public static WebElement editScreenAccount1ExpandBtn;  
		   
			@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_settings']/span")
			public static WebElement editScreenAccount1SettingsBtn;  
					   
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_container']")
				public static WebElement editScreenAccount1Container;  
			    
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_footer']//input[1]")
				public static WebElement editScreenAccount1StandardFiledsBtn;  
								    
				    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_list']")
					public static WebElement editScreenAccount1StandardFiledsDropdown;  
				    
				    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_header']")
					public static WebElement editScreenAccount1StandardFiledsHeaderTxt;  
				    
				    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_alignment']")
					public static WebElement editScreenAccount1StandardFiledsAllignmentDropdown; 
				    
				    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_width']")
					public static WebElement editScreenAccount1StandardFiledsWidthTxt;  
				    
				    @FindBy(xpath="//section[@id='page_Content']//input[3]")
					public static WebElement editScreenAccount1StandardFiledsokBtn;  
				    
				    @FindBy(xpath="//section[@id='page_Content']//input[4]")
					public static WebElement editScreenAccount1StandardFiledscancelBtn;  
								    
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_search_container']//input[2]")
				public static WebElement editScreenAccount1deleteColumnBtn;
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[3]")
			   	public static WebElement editScreenAccount1okBtn;  
			       
			    @FindBy(xpath="//section[@id='page_Content']//input[4]")
			   	public static WebElement editScreenAccount1cancelBtn;
					
			@FindBy(xpath="//input[@id='acc2-2']")
			public static WebElement editScreenAccount2Radio;  
			    
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2']")
			public static WebElement editScreenAccount2Txt;  
			    
			@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_image']/span")
			public static WebElement editScreenAccount2ExpandBtn;
		  
		    @FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_settings']/span")
		  	public static WebElement editScreenAccount2SettingsBtn;  
					      
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_container']")
				public static WebElement editScreenAccount2Container;  
			    
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_footer']//input[1]")
				public static WebElement editScreenAccount2StandardFiledsBtn;  
					  			    
				    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_list']")
					public static WebElement editScreenAccount2StandardFiledsDropdown;  
				    
				    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_header']")
					public static WebElement editScreenAccount2StandardFiledsHeaderTxt;  
				    
				    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_alignment']")
					public static WebElement editScreenAccount2StandardFiledsAllignmentDropdown; 
				    
				    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_width']")
					public static WebElement editScreenAccount2StandardFiledsWidthTxt;  
				    
				    @FindBy(xpath="//section[@id='page_Content']//input[3]")
					public static WebElement editScreenAccount2StandardFiledsokBtn;  
				    
				    @FindBy(xpath="//section[@id='page_Content']//input[4]")
					public static WebElement editScreenAccount2StandardFiledscancelBtn;  
					  			    
			    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_search_container']//input[2]")
				public static WebElement editScreenAccount2deleteColumnBtn;
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[3]")
			   	public static WebElement editScreenAccount2okBtn;  
			       
			       @FindBy(xpath="//section[@id='page_Content']//input[4]")
			   	public static WebElement editScreenAccount2cancelBtn;
		   
		   @FindBy(xpath="//input[@id='acc1-3']")
		   public static WebElement editScreenAccount1VariableRadio; 
		  
		   @FindBy(xpath="//input[@id='Account_1Var']")
		   public static WebElement editScreenAccount1VariableTxt;
		   
		   @FindBy(xpath="//input[@id='acc2-4']")
		   public static WebElement editScreenAccount2VariableRadio; 
		  
		   @FindBy(xpath="//input[@id='Account_2Var']")
		   public static WebElement editScreenAccount2VariableTxt;
		   
		   @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RegularExpr']")
		   public static WebElement editScreenRegularExpTxt; 
		   
		   @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_ErrorMsg']")
		   public static WebElement editScreenerrorMessageTxt; 

		 // properties  
		   
		  @FindBy(xpath="//a[contains(text(),'Properties')]")
		  public static WebElement editScreenPropertiesTab;  
		     
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkAuditTrail']")
		  public static WebElement editScreenauditTrailChkBox;  
		     
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantExprt']")
		  public static WebElement editScreencantExportChkBox;  
		  
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantImprt']")
		  public static WebElement editScreencantImportChkbox; 
		     
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkHidden']")
		  public static WebElement editScreenhiddenChkbox;  
		  
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkMandatory']")
		  public static WebElement editScreenmandatorychkBox; 
		     
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkNotAvailForReports']")
		  public static WebElement editScreennotAvailableForReportsChkBox;  
		     
		  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkReadOnly']")
		  public static WebElement editScreenreadOnlyChkBox;  
		 
		     
		  @FindBy(xpath="//span[contains(text(),'Apply')]")
		  public static WebElement editScreenApplyBtn;  
		     
		  @FindBy(xpath="//span[@id='editScreen_FieldsCustomization_Close']")
		  public static WebElement editScreencloseBtn;  
		  

		 
		  @FindBy(xpath="//a[@href='#editScreen_FieldsCustomization_ExternalModules']")
		  public static WebElement editScreenExternalModulesTab; 
					
			// External Module Tab is named As EFES And ELV For Each Screen (ReceiptsEFES,ReceiptsELV )
		    // External Functions(External Fields) Changes From Screen to Screen
		
			// Formatting Tab
					  
		    @FindBy(xpath="//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
		    public static WebElement editScreenformattingTab;

			@FindBy(xpath="//*[@id='fontFamily_editScreen_FieldsCustomization_FontCtrl']")
		    public static WebElement editScreenFontFamilyDropdown;
			
		    @FindBy(xpath="//*[@id='fontStyle_editScreen_FieldsCustomization_FontCtrl']")
		    public static WebElement editScreenFontStyleDropdown;

		    @FindBy(xpath="//*[@id='fontWeight_editScreen_FieldsCustomization_FontCtrl']")
		    public static WebElement editScreenFontWeightDropdown;

			@FindBy(xpath="//*[@id='fontSizes_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenFontSizeDropdown;
			
			@FindBy(xpath="//*[@id='fontForeColor_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenForeColourDropdown;
			
			@FindBy(xpath="//*[@id='fontBackColor_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenBackColourDropdown;
			
			@FindBy(xpath="//*[@id='chkBaseline_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenBaseLineCheckbox;
			
			@FindBy(xpath="//*[@id='chkOverLine_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenOverLineCheckbox;
			
			@FindBy(xpath="//*[@id='chkStrikeThrough_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement EditScreenStrikeThroughCheckbox;
			
			@FindBy(xpath="//*[@id='chkUnderline_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenUnderlineCheckbox;
			
			@FindBy(xpath="//*[@id='previewfont_editScreen_FieldsCustomization_FontCtrl']")
			public static WebElement editScreenFontPreviewTxt;
			
			@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_Formatting_chkenableFont']")
			public static WebElement editScreenenableFontChkbox;
					
			  @FindBy(xpath="//i[@class='icon-copyfields icon-font7']")
			  public static WebElement editScreenLoadFieldsBtn;  
			     
			  @FindBy(xpath="//select[@id='editScreen_voucherDropDown']")
			  public static WebElement editScreenLoadFieldsDropdown;  
			     
			  @FindBy(xpath="//*[@id='editScreen_copyFieldsDiv']/div[3]/button[1]")
			  public static WebElement editScreenselectAllBtn;  
			  
			  @FindBy(xpath="//div[@id='editScreen_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
			  public static WebElement editScreenokBtn;  
			     
			  @FindBy(xpath="//input[@id='searchlayout2']")
			  public static WebElement editScreenSearchTxt;  
			     
			  @FindBy(xpath="//button[@id='btnEditScreenPrev']")
			  public static WebElement editScreenPreviousBtn;  
			     
			  @FindBy(xpath="//button[@id='btnEditScreenNext']")
			  public static WebElement editScreenNextBtn;  
			  
			  @FindBy(xpath="//*[@id='editScreen_tabContent']/label")
				public static WebElement editScreenRatePreloadLabel;
			  
			  @FindBy(xpath="//select[@id='cmbBehaviour']")
			  public static WebElement editScreenBehaviourDropdown;
			  
			  @FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
			  public static WebElement editScreenQuantityPreloadedTxt;
			  	  
			  @FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
			  public static WebElement  formulaTxt;
				
			  @FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_expandedFormula']")
			  public static WebElement  expandeFormula;
						
		     // Grid Elements 
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_1-2']//span[@class='icon-collepse icon-font8']")
			public static WebElement  editScreenTransactionExpandBtn;
					
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-2']")
				public static WebElement  editScreenQuantity;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-3']")
				public static WebElement  editScreenqty;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-2']")
				public static WebElement  editScreenRate;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-3']")
				public static WebElement  editScreenrt;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-2']")
				public static WebElement  editScreenAlternateQty;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-3']")
				public static WebElement  editScreenqtya;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-2']")
				public static WebElement  editScreengrossAmount;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-3']")
				public static WebElement  editScreengr;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-2']")
				public static WebElement  editScreenStockValue;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-3']")
				public static WebElement  editScreenstkv;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-2']")
				public static WebElement  editScreenAccount;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-3']")
				public static WebElement  EditScreenacc;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-2']")
				public static WebElement  editScreenAccount2;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-3']")
				public static WebElement  editScreenacc2;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-2']")
				public static WebElement  editScreenExchangeRate;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-3']")
				public static WebElement  editScreenexrt;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-2']")
				public static WebElement  editScreenqtyinBaseUnit;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-3']")
				public static WebElement  editScreenqtyb;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-2']")
				public static WebElement  editScreenCurrency;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-3']")
				public static WebElement  editScreencrn;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-2']")
				public static WebElement  editScreenValueOfThetagMasterIDofTheTag;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-3']")
				public static WebElement  editScreentgval;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-2']")
				public static WebElement  editScreenNetAmount;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-3']")
				public static WebElement  EditScreennet;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-2']")
				public static WebElement  editScreenNetAmountInOriginalCurrency;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-3']")
				public static WebElement  editScreenneto;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-2']")
				public static WebElement  editScreenTotalQuantity;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-3']")
				public static WebElement  editScreentqty;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-2']")
				public static WebElement  editScreenTotalGross;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-3']")
				public static WebElement  editScreentgr;
								
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_17-2']//span[@class='icon-expand icon-font8']")
			public static WebElement  screenFiledExpandBtn;
					
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-2']")
				public static WebElement  mrnQtyInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-3']")
				public static WebElement  sb1;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-2']")
				public static WebElement  mrnQtyCalculatedValue;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-3']")
				public static WebElement  sbo1;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-2']")
				public static WebElement  qtyBalancedInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-3']")
				public static WebElement  sb2;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-2']")
				public static WebElement  qtyCalculatedValue;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-3']")
				public static WebElement  sbO2;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-2']")
				public static WebElement  averagerateInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-3']")
				public static WebElement  sb3;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-2']")
				public static WebElement  avreageRateCalculatedValue;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-3']")
				public static WebElement  sbO3;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-2']")
				public static WebElement  addValueInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-3']")
				public static WebElement  sb4;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-2']")
				public static WebElement  addValueInputCalculatedValue;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-3']")
				public static WebElement  sbO4;
					
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_26-2']//span[@class='icon-collepse icon-font8']")
			public static WebElement  layoutFieldExpandBtn;
			
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-2']")
				public static WebElement  appropriateBasedOnInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-3']")
				public static WebElement  lh0;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-2']")
				public static WebElement  additionalValueInput;
				
				@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-3']")
				public static WebElement  lh1;
								
		    //Grid Completed
			
			@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
			public static WebElement  editScreenqtyFormulaSearchTxt;
			
			@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_PlusOpt']")
			public static WebElement  editScreenqtyPlusBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'-')]")
			public static WebElement  editScreenqtyMinusBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[3]")
			public static WebElement  editScreenqtyDivideBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'*')]")
			public static WebElement  editScreenqtyMultiplyBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[5]")
			public static WebElement  editScreenqtyBrackets1Btn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[6]")
			public static WebElement  editScreenqtyBrackets2Btn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'~')]")
			public static WebElement  editScreenqtyTildeBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'&')]")
			public static WebElement  editScreenqtyAndBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'%')]")
			public static WebElement  editScreenqtyPercentBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//div[@id='operationButtons']//button[@class='btn btn-link'][contains(text(),']')]")
			public static WebElement  editScreenqtySquarebracketBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'|')]")
			public static WebElement  editScreenqtyVerticalBarBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'\')]")
			public static WebElement  editScreenqtyBackSlashBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'<')]")
			public static WebElement  editScreenqtyLessThanbtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'>')]")
			public static WebElement  editScreenqtyGreaterThanBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
			public static WebElement  editScreenqtyExclamationBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
			public static WebElement  editScreenqtyEqualBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'?:')]")
			public static WebElement  editScreenqtyQuestionBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'^')]")
			public static WebElement  editScreenqtyCaretBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'DateDiff()')]")
			public static WebElement  editScreenqtyDateDiffBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Cond()')]")
			public static WebElement  editScreenqtyCondBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Min()')]")
			public static WebElement  editScreenqtyMinBtn;
			
			@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Max()')]")
			public static WebElement  editScreenqtyMaxBtn;
			
			@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
			public static WebElement  editScreenqtyConditionokBtn;
			
			@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
			public static WebElement  editScreenqtyConditioncancelBtn;
					
					
			@FindBy(xpath="//*[@id='editScreen_qtyFormula_textbox']")
			public static WebElement  editScreenformulaTxt;
			
			
			// CustomizeGrid
			
			@FindBy(xpath="//i[@class='icon-custamize icon-font7']")
			public static WebElement editScreencustomizeGridBtn;  
			  
			@FindBy(xpath="//span[contains(text(),'Apportion')")
			public static WebElement editScreenApportionBtn;
			     
			@FindBy(xpath="//span[contains(text(),'Audit Trial')]")
			public static WebElement editScreenAuditTrialBtn;  
			    
			@FindBy(xpath="//span[contains(text(),'Back color')]")
			public static WebElement editScreenbackColorBtn;  
			     
			@FindBy(xpath="//span[contains(text(),'Banner text')]")
			public static WebElement editScreenbannerTextBtn;  
			 
			  @FindBy(xpath="//span[contains(text(),'Cannot be exported')]")
			  public static WebElement editScreencannotBeExportedBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Cannot be imported')]")
			  public static WebElement editScreencannotBeImportedBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Column Span')]")
			  public static WebElement editScreencolumnSpanBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Copy from Parent')]")
			  public static WebElement editScreencopyFromParentBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'DataType')]")
			  public static WebElement editScreendataTypeBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Default Value')]")
			  public static WebElement editScreenDefaultValueBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Error message')]")
			  public static WebElement editScreenerrorMessageBtn;  
			 
			  @FindBy(xpath="//span[contains(text(),'External module attached')]")
			  public static WebElement editScreenExternalModuleAttachedBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Field Order')]")
			  public static WebElement editScreenFilterOrderBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Font')]")
			  public static WebElement editScreenFontBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Group Name')]")
			  public static WebElement editScreengroupNameBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Hide left panel')]")
			  public static WebElement editScreenHideLeftPanelBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Information Field')]")
			  public static WebElement editScreenInformationFieldBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Mandatory')]")
			  public static WebElement editScreenMandatoryBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Mass Update')]")
			  public static WebElement editScreenMassupdateBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Maximum Value')]")
			  public static WebElement editScreenMaximumValueBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Merge Field')]")
			  public static WebElement editScreenMergerFieldBtn;  
			  
			  @FindBy(xpath="//span[contains(text(),'Minimum Value')]")
			  public static WebElement editScreenMinimumValueBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'No Of Decimals')]")
			  public static WebElement editScreenNoOfDecimalsBtn;  
			  
			  @FindBy(xpath="//span[contains(text(),'Not available for reports')]")
			  public static WebElement editScreenNotAvailableForReportsBtn; 
			     
			  @FindBy(xpath="//span[contains(text(),'Read Only')]")
			  public static WebElement editScreenReadOnlyBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Regular expression')]")
			  public static WebElement editScreenRegularExpressionBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Restrict formula')]")
			  public static WebElement editScreenRestrictFormulaBtn;  
			  
			  @FindBy(xpath="//span[contains(text(),'Restrict Message')]")
			  public static WebElement editScreenRestrictMessageBtn;  
			  
			  @FindBy(xpath="//span[contains(text(),'Round Offs')]")
			  public static WebElement editScreenRoundsOffsBtn;  
			
			  @FindBy(xpath="//span[contains(text(),'Row Span')]")
			  public static WebElement editScreenRowSpanBtn; 
			     
			  @FindBy(xpath="//span[contains(text(),'Rule Attached')]")
			  public static WebElement editScreenRuleAttachedBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Tooltip')]")
			  public static WebElement editScreenToolTipBtn;  
			     
			  @FindBy(xpath="//span[contains(text(),'Variable name')]")
			  public static WebElement editScreenVariableNameBtn;  
			 
			  
			  
			  
			
			 // Body Tab 
			  
			  @FindBy(xpath="//a[contains(text(),'Body')]")
			  public static WebElement  editScreenBodyTab; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody1stRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody1stRowDeleteBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody2ndRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody2ndRowDeleteBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody3rdRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody3rdRowDeleteBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody4thRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody4thRowDeleteBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody5thRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody5thRowDeleteBtn;
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenBody6thRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenBody6thRowDeleteBtn;
			  
			  @FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-up-arrow Fbutton']")
			  public static WebElement  editScreenBodyUpArrowBtn; 
			
			  @FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-down-arrow Fbutton']")
			  public static WebElement  editScreenBodyDownArrowBtn;
							
			  // Footer Tab
			  
			  @FindBy(xpath="//a[contains(text(),'Footer')]")
			  public static WebElement  editScreenFooterTab;  
			  
			  @FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenFooter1stRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenFooter1stRowDeleteBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='editIcon']")
			  public static WebElement  editScreenFooter2ndRowEditBtn; 
			  
			  @FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='deleteIcon']")
			  public static WebElement  editScreenFooter2ndRowDeleteBtn; 
			  
			  @FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-up-arrow Fbutton']")
			  public static WebElement  editScreenFooterUpArrowBtn; 
			
			  @FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-down-arrow Fbutton']")
			  public static WebElement  editScreenFooterDownArrowBtn; 
			  
			  	@FindBy(xpath="//label[contains(text(),'Quantity preloaded')]")
				public static WebElement qtyPreloadedLabel;
				
				@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
				public static WebElement qtyPreloadedTxt;
				
				@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
				public static WebElement qtyPreloadedformulaTxt;
				
				@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
				public static WebElement qtyPreloadedFormulaSearchTxt;
				
				@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
				public static WebElement qtyPreloadedFormulaokBtn;
				
				@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
				public static WebElement qtyPreloadedFormulacancelBtn;


				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[1]/label/span")
				public static WebElement editScreenLoadFields1stChkBox;
				
				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[2]/label/span")
				public static WebElement editScreenLoadFields2ndChkBox;
				
				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[3]/label/span")
				public static WebElement editScreenLoadFields3rdChkBox;
				
				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[4]/label/span")
				public static WebElement editScreenLoadFields4thChkBox;
				
				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[5]/label/span")
				public static WebElement editScreenLoadFields5hChkBox;
				
				@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[6]/label/span")
				public static WebElement editScreenLoadFields6thChkBox;
				
				@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_formulaText']")
				public static WebElement  preloadformulaTxt;
				
				@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_availableVariables']")
				public static WebElement  preloadFormulaSearchTxt;
				
				@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Ok']")
				public static WebElement  preloadFormulaokBtn;
					
				@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Cancel']")
				public static WebElement  preloadFormulacancelBtn;
				
				
				@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
				public static WebElement  editScreenFooter1stRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
				public static WebElement  editScreenFooter2ndRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _3']")
				public static WebElement  editScreenbody1stRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _3']")
				public static WebElement  editScreenbody2ndRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _3']")
				public static WebElement  editScreenbody3rdRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _3']")
				public static WebElement  editScreenbody4thRowCaption;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _3']")
				public static WebElement  editScreenbody5thRowCaption;
				
				
				
				// Add To Stock Status
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _14']")
				public static WebElement  editScreenbody1stRowAddtoStock;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _14']")
				public static WebElement  editScreenbody2ndRowAddtoStock;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _14']")
				public static WebElement  editScreenbody3rdRowAddtoStock;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _14']")
				public static WebElement  editScreenbody4thRowAddtoStock;
				
				@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _14']")
				public static WebElement  editScreenbody5thRowAddtoStock;			
				
			// Suspend Status Of Entry Page
			@FindBy(xpath="//tr[1]//td[11]")
			public static WebElement suspendStatusRow1;
		
		//User Name Display
		/*@FindBy(xpath="/html/body/section/div[2]/header/nav/div/ul/li[6]/a/span")
		public static WebElement userNameDisplay;

		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		public static WebElement companyName;

		@FindBy(xpath="//*[@id='companyLogo']")
		public static WebElement companyLogo;*/

	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		public static WebElement noIn;
	    
	    /*@FindBy(xpath="//input[@id='donotshow']")
		public static WebElement doNotShowCheckbox;
	    
	    @FindBy(xpath="//span[@class='pull-right']")
		public static WebElement closeBtnInDemoPopupScreen;*/
	    
	    
	    // Inentory Menu 
	    
	    @FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	    public static WebElement  invTransactionsMenu; 
	    
	    @FindBy(xpath="//a[@id='139']//span[contains(text(),'Purchases')]")
	    public static WebElement  invTransPurchasesMenu; 
	    
	    @FindBy(xpath="//a[@id='140']//span[contains(text(),'Sales')]")
	    public static WebElement  invTransSalesMenu; 
	    
	    @FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	    public static WebElement  invTransStocksMenu; 
	    
	   
		
		// Home Menu
		@FindBy(xpath = "//*[@id='1']")
		public static WebElement homeMenu;

		//Financial Menu
		@FindBy (xpath="//span[@class='icon-financial icon-font1']")
		public static WebElement financialMenu;
		
		//Fixed Assets Menu
		@FindBy (xpath="//span[@class='icon-assets icon-font1']")
		public static WebElement fixedAssetsMenu;
		
		//Production Menu
		@FindBy (xpath="//span[@class='icon-production icon-font1']")
		public static WebElement productionMenu;
		
		//Point Of Sale Menu
		@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
		public static WebElement pointOfSaleMenu;
		
		//Quality Of Control Menu
		@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
		public static WebElement qualityControlMenu;
		
		//Settings Menu
		@FindBy (xpath="//span[@class='icon-settings icon-font1']")
		public static WebElement SettingsMenu;
		
		
		@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[3]/a")
		public static WebElement  pendingAuthorizationPurchases;
		
		
		
		@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/button")
		public static WebElement  homePageVoucherArrowBtn;
		
		@FindBy(xpath="//tr[@id='trRender_1']//td//input")
		public static WebElement  voucherHomeRow1ChkBox;
		
		@FindBy(xpath="//i[@class='icon-convert hiconright2']")
		public static WebElement  voucherConvert;
		
		@FindBy(xpath="//tr[@id='trRender_2']//td//input")
		public static WebElement  voucherHomeRow2ChkBox;
		
		
		
			
		@FindBy(xpath="//textarea[@id='id_transaction_authorization_remark']")
		public static WebElement  authorizePopupTextArea;
		
		@FindBy(xpath="//input[@id='id_transaction_authorization_remark_popup_ok']")
		public static WebElement  authorizePopupOkBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_authorization_remark_popup_ok']")
		public static WebElement  authorizePopupOkBtnFromEntryPage;
		
		@FindBy(xpath="//div[@id='id_transaction_homeview_authorization_remarkpopup_container']//input[2]")
		public static WebElement  authorizePopupCancelBtn;
		
		
		// Login Page
		@FindBy(xpath = "//*[@id='txtUsername']")
		public static WebElement username;
		
		
		
		//Consume the links through CTRL + L in linked voucher
		@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
		public static WebElement workFlowExpandBtn;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_dropdown']")
		public static WebElement  workFlowDropdown;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchon']")
		public static WebElement  searchOnDropdownCL;

		@FindBy(xpath="//select[@id='id_transactionentry_workflow_searchtype']")
		public static WebElement  containingDropdownCL;
				
		@FindBy(xpath="//input[@id='id_transactionentry_workflow_search_input']")
		public static WebElement  workFlowSearchTxtCL;

		@FindBy(xpath="//div[@id='id_transaction_entry_workflow_control_area2']//td[4]")
		public static WebElement  workFlowCustomizeBtnCL;

		@FindBy(xpath="(//input[@class='FButton-Primary FPopupChildren mx-1'])[3]")
		public static WebElement  workFlowOkBtnCL;

		@FindBy(xpath="//span[@id='id_transaction_entry_workflow_togglebutton']")
		public static WebElement  workFlowMinimizeBtnCL;

		@FindBy(xpath="//input[@id='id_transaction_entry_detail_workflow_control_heading_ctrl_1']")
		public static WebElement  workFlowHeaderChkBoxCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_6']//div[contains(text(),'Voucher No')]")
		public static WebElement  workFlowHeaderVoucherNoCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_7']//div[contains(text(),'Date')]")
		public static WebElement  workFlowHeaderDateCL;

		@FindBy(xpath="//div[contains(text(),'Name')]")
		public static WebElement  workFlowHeaderNameCL;

		@FindBy(xpath="//th[@id='id_transaction_entry_detail_workflow_control_heading_9']//div[contains(text(),'Quantity')]")
		public static WebElement  workFlowHeaderQtyCL;

		@FindBy(xpath="//div[contains(text(),'Suspended')]")
		public static WebElement  workFlowHeaderSuspendCL;

		//1 Row CRTL + L

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr[1]/td[2]/input")
		public static WebElement workFlowRow1ChkBoxCL;

		/*@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-6']")
		public static WebElement  workFlowRow1Column1CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-7']")
		public static WebElement  workFlowRow1Column2CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-8']")
		public static WebElement  workFlowRow1Column3CL;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-9']")
		public static WebElement  workFlowRow1Column4CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_1-10']")
		public static WebElement  workFlowRow1Column5CL;*/


		//2 Row CRTL + L

		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_body']/tr[2]/td[2]/input")
		public static WebElement workFlowRow2ChkBoxCL;

		/*@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_2-6']")
		public static WebElement  workFlowRow2Column1CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_2-7']")
		public static WebElement  workFlowRow2Column2CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_2-8']")
		public static WebElement  workFlowRow2Column3CL;
				
		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_2-9']")
		public static WebElement  workFlowRow2Column4CL;

		@FindBy(xpath="//td[@id='id_transaction_entry_detail_workflow_col_2-10']")
		public static WebElement  workFlowRow2Column5CL;*/
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']")
		public static WebElement  workflowTableBody;
	
		
		@FindBy(xpath="//input[@id='id_header_4']")
		public static WebElement  newCashBankAccountTxt;
		
		
		
		
		@FindBy(xpath="//*[@id='lblAccount']")
		public static WebElement  billRefPartyName;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
		public static List<WebElement> billRefAdjustBillsGrid;
		
		@FindBy(xpath="//tbody[@id='id_Adjustment_Grid_body']")
		public static WebElement  billRefAdjustBillsTable;
		

		 //Bill Reference Screen 	
		
		@FindBy(xpath="//input[@id='txtNewReference']")
		public static WebElement newReferenceTxt;

		@FindBy(xpath="//input[@id='txtNewReference']")
		public static WebElement  billRefNewReferenceTxt;
		
		@FindBy(xpath="//input[@id='txtOnAccount']")
		public static WebElement  billRefTxtOnAccount;		
			
		@FindBy(xpath="//input[@id='Searchtxt']")
		public static WebElement  billRefSearchTxt;		
		
		@FindBy(xpath="//select[@id='cbmShowBillForAdjustment']")
		public static WebElement  billRefNewReferenceDropdown;		
		
		@FindBy(xpath="//select[@id='cbmShowBills']")
		public static WebElement  billRefShowBillsDropdown;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_11']//div[contains(text(),'Due Date')]")
		public static WebElement  billRefGridHeaderDueDate;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_16']//div[contains(text(),'Currency')]")
		public static WebElement  billRefGridHeaderCurrency;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_21']//div[contains(text(),'Original Amt')]")
		public static WebElement  billRefGridHeaderOrginalAmt;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_23']//div[contains(text(),'Balance Amount')]")
		public static WebElement  billRefGridHeaderBalanceAmt;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_33']//div[contains(text(),'Adjustment Amount')]")
		public static WebElement  billRefGridHeaderAdjustmentAmt;		
		
		@FindBy(xpath="//div[contains(text(),'Native Currency')]")
		public static WebElement  billRefGridHeaderNativeCurrency;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_41']//div[contains(text(),'Narration')]")
		public static WebElement  billRefGridHeaderNarration;		
		
		@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_50']//div[contains(text(),'Previous Adjustment Amount')]")
		public static WebElement  billRefGridHeaderPreviosAdjustmentAmt;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-0']")
		public static WebElement  billRefGridFirstRow;	
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-1']//input")
		public static WebElement  billRefGridFirstRowChkbox;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-1']//input")
		public static WebElement  billRefGridSecondRowChkbox;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-1']//input")
		public static WebElement  billRefGridThirdRowChkbox;		
		
		/*@FindBy(xpath="//tbody[@id='id_Adjustment_Grid_body']//td[13]")
		public static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
		*/             
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[13]")
		public static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[13]")
		public static WebElement  billRefGridSecondRowAdjustmentAmtTxt;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-33']")
		public static WebElement  billRefGridThirdRowAdjustmentAmtTxt;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-41']")
		public static WebElement  billRefGridFirstNarrationTxt;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-41']")
		public static WebElement  billRefGridSecondNarrationTxt;		
		
		@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-41']")
		public static WebElement  billRefGridThirdNarrationTxt;		
		
		@FindBy(xpath="//input[@id='id_Narration']")
		public static WebElement  narrationToWrite;		
		
		@FindBy(xpath="//input[@id='id_limit']")
		public static WebElement  adjustAmtToWrite;		
		
		@FindBy(xpath="//div[@class='col-xs-6 navbar-header']//div[@class='navText']")
		public static WebElement  billRefPaymentsBillReferenceLabel;		
		
		@FindBy(xpath="//div[@class='col-sm-12 col-md-3']//input[@class='Fbutton']")
		public static WebElement  billRefAdjustOnFIFOBtn;		
		
		/*@FindBy(xpath="//span[@id='btnPick']")
		public static WebElement  billRefPickIcon;		
		
		@FindBy(xpath="//span[@id='btnOk']")
		public static WebElement  billRefOkBtn;		
		
		@FindBy(xpath="//span[@id='btnCancel']")
		public static WebElement  billRefcancel;	*/	
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
		public static WebElement  billRefSummatyValueNet;		
		
		@FindBy(xpath="//td[@id='AccountAmount_col_1-1']")
		public static WebElement  billRefGridVendorRow1;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_1-2']")
		public static WebElement  billRefGridVendorAmtRow1;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_2-1']")
		public static WebElement  billRefGridVendorRow2;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_2-2']")
		public static WebElement  billRefGridVendorAmtRow2;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_3-1']")
		public static WebElement  billRefGridVendorRow3;
		
		@FindBy(xpath="//label[@id='tbNewRefAmountAdjValue']")
		public static WebElement amtAdjustedAgainstNewREfinOtherVouchers;
				
		@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
		public static WebElement transactionCurency;
		
		@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
		public static WebElement baseCurrency;
		
		@FindBy(xpath="//label[@id='tbAmountToAdjustInLocalCurrencyValue']")
		public static WebElement localCurrencyDhs;
		
		@FindBy(xpath="//label[@id='tbNewRefBalAmountValue']")
		public static WebElement balanceNewReferenceAmt;
		
		@FindBy(xpath="//li[@id='id_li_Adjustment_Tab_BreakUpByTag']//span[@class='font-5'][contains(text(),'Break Up by Tag')]")
		public static WebElement breakUpByTagTab;
		
		@FindBy(xpath="//span[@class='font-5'][contains(text(),'Adjustment')]")
		public static WebElement adjustmentTab;
		
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-9']")
		public static WebElement breakUpByTagDueDate;
		
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-10']")
		public static WebElement breakUpByTagDepartment;
		
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-18']")
		public static WebElement breakUpByTagBaseCurrency;
		
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-17']")
		public static WebElement breakUpByTagBillCurrency;
		
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-20']")
		public static WebElement breakUpByTagBaseConversionRate;
			
		@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-21']")
		public static WebElement breakUpByTagBaseLocalCurrency;
		
		@FindBy(xpath="//label[@id='txtblkAmountadjusted']")
		public static WebElement  billRefAdjustAmountInTransCurency;
		
		@FindBy(xpath="//label[@id='txtblkAmounttobeadjust']")
		public static WebElement  billRefBalanceAmountAdjustInTrnasCurrency;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
		public static WebElement  billRefInfoBarLocalCurrencyRate;
		
		
		@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
		public static WebElement billRefTransactionCurency;
		
		@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
		public static WebElement billRefBaseCurrency;
		

		@FindBy(xpath="//label[@id='id_BillWise_IP_AccountName']")
		public static WebElement breakUpDetailsAccount;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_ProductName']")
		public static WebElement breakUpDetailsItem;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_TagName']")
		public static WebElement breakUpDetailsDepartment;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_BaseCurrencyValue']")
		public static WebElement conversationRateBaseCurrencyRate;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
		public static WebElement conversationRateLocalCurrencyRate;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAEDTranAmountValue']")
		public static WebElement asOnEntryDateTransAmt;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseConversionValue']")
		public static WebElement asOnEntryDateBaseConcersationRate;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseAmountValue']")
		public static WebElement asOnEntryDateBaseAmount;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalConversionValue']")
		public static WebElement asOnEntryDateLocConversationRate;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalAmountValue']")
		public static WebElement asOnEntryDateAmt;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAADTranAmountValue']")
		public static WebElement balOnAdjstDateTransAmt;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseConversionValue']")
		public static WebElement  balOnAdjstDateBasrConversionRate;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseAmountValue']")
		public static WebElement  balOnAdjstDateBaseAmount;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalConversionValue']")
		public static WebElement  balOnAdjstDateLocalConversionRate;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalAmountValue']")
		public static WebElement  balOnAdjstDateAmt;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAdjTranAmountValue']")
		public static WebElement adjustmentsAmount1;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAdjBaseAmountValue']")
		public static WebElement adjustmentsAmount2;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblAdjLocalAmountValue']")
		public static WebElement adjustmentsAmount3;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblNativeCurrencyValue']")
		public static WebElement adjustmentsAmount4;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffTranAmountValue']")
		public static WebElement exchangeGainLossForBaseCurrency;
		
		@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffLocalAmountValue']")
		public static WebElement exchangeGainLossForLocalCurrency;
		
		
		
		@FindBy(xpath="//input[@id='id_limit']")
		public static WebElement gridEnterAdjustAmtRow1;
		
		//Billreference Body Grid Elements
		
	    
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[8]")
		public static WebElement gridOrginalAmtRow1;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[8]")
		public static WebElement gridOrginalAmtRow2;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[8]")
		public static WebElement gridOrginalAmtRow3;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[8]")
		public static WebElement gridOrginalAmtRow4;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[8]")
		public static WebElement gridOrginalAmtRow5;
		
		
		
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[10]")
		public static WebElement gridBalanceAmtRow1;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[10]")
		public static WebElement gridBalanceAmtRow2;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[10]")
		public static WebElement gridBalanceAmtRow3;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[10]")
		public static WebElement gridBalanceAmtRow4;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[10]")
		public static WebElement gridBalanceAmtRow5;
		
		
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
		public static WebElement gridAdjustmentAmtRow1;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[13]")
		public static WebElement gridAdjustmentAmtRow2;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[13]")
		public static WebElement gridAdjustmentAmtRow3;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[13]")
		public static WebElement gridAdjustmentAmtRow4;

		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[13]")
		public static WebElement gridAdjustmentAmtRow5;
		
		@FindBy(xpath="//*[@id='id_body_12_table_body']/tr")
		public static List<WebElement> bodyAccountListInGrid;
		
		               
		@FindBy(xpath="//*[@id='id_body_39_table_body']/tr")
		public static List<WebElement> bodyCreditAccountListInGrid;
		
		
		
		@FindBy(xpath="//div[@id='id_transaction_authorization_remark_popup']/div/div")
		public static WebElement authorizationRemarkPopup;
		
		
		
		@FindBy(xpath="//label[@class='modal-title modal-title-customization']")
		public static WebElement stockReservationLabel;
		
		@FindBy(xpath="//*[@id='Id_StockReservation_FGrid_col_1-0']")
		public static WebElement stockRes_QtyToReserveRow1; 
		
		@FindBy(xpath="//li[@id='btnPickQuantity']")
		public static WebElement res_PickBtn;
		
		@FindBy(xpath="//div[contains(text(),'Discard')]")
		public static WebElement res_DiscardBtn;
		
		@FindBy(xpath="//div[text()='Ok']")
		public static WebElement res_OkBtn;
		
		@FindBy(xpath="//div[@class='col-sm-12 footer_button_image']//span[@class='icon-close icon-font6']")
		public static WebElement res_CloseBtn;
		
		
		@FindBy(xpath="//tbody[@id='ctrlAuthorizationH_table_body']/tr/td[2]")
		public static List<WebElement> tranAuthNameList;
		
		@FindBy(xpath="//button[contains(text(),'Ok')]")
    	public static WebElement loginRefreshOkBtn;
		
		@FindBy(xpath="//select[@id='ddlCompany']")
    	public static WebElement companyDropDownList;
    	
    	@FindBy(xpath="(//li[@class='nav-item pt-md-2']/a)[2]")   //a[text()='SU']  //*[@id='id_mainlayoutmenu']/ul[2]/li[5]
    	public static WebElement userNameDisplay;
    	
    	@FindBy(xpath="//div[@class='adminprofile']")
		public static WebElement userNameDisplayLogo;
    	
    	/*@FindBy(xpath="//span[text()='SU']")
        public static WebElement userNameDisplay;*/
    	
    	@FindBy(xpath="//*[@id='companyLogo']")
    	public static WebElement companyLogo;
    	
    	/*@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
    	public static WebElement companyName;*/
    	
    	@FindBy(xpath="//strong[@class='ms-2']")
		public static WebElement companyName;
    	
    	@FindBy(xpath="//a[contains(text(),'Logout')]")
    	public static WebElement logoutOption;
    		
    	@FindBy(xpath="//input[@id='donotshow']")
    	public static WebElement doNotShowCheckbox;
    	 		    
    	@FindBy(xpath="//span[@class='pull-right']")
    	public static WebElement closeBtnInDemoPopupScreen;
    	
    	//DataManagement menu
    	@FindBy (xpath="//*[@id='25']/span")
        public static WebElement dataMangementMenu;
    	
    		@FindBy (xpath="//*[@id='26']/span")
    		public static WebElement backup;
    			
    		@FindBy (xpath="//*[@id='27']/span")
    		public static WebElement restore;
    		
    		@FindBy (xpath="//*[@id='111']/span")
    		public static WebElement reindex;
    		
    		@FindBy (xpath="//*[@id='115']/span")
    		public static WebElement eraseAll;
    		
    		@FindBy (xpath="//*[@id='216']/span")
    		public static WebElement lockAndUnlock;
    		
    		
    		@FindBy (xpath="//input[@id='idEraseTransaction']")
    		public static WebElement eraseTranscationsRadio;
    		
    		@FindBy (xpath="//i[@class='icon-ok hiconright2']")
    		public static WebElement eraseAllOkBtn;
    		
    		@FindBy (xpath="//ul[@class='nav navbar-nav navbar-right']//i[@class='icon-font6 icon-close']")
    		public static WebElement eraseAllCancelBtn;
    		
    		
    	@FindBy (xpath="//button[@class='btn Fbutton']")
    	public static WebElement folderpathExpandBtn;
    	
    	@FindBy (xpath="//div[@id='RestoreControls']//div[1]//div[1]")
    	public static WebElement restoreCompanyBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Yes')]")
    	public static WebElement overRideYesBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'No')]")
    	public static WebElement overRideNoBtn;
    	
    	@FindBy (xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
    	public static WebElement overRideCancelBtn;
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='4']")
    	public static WebElement selectFieldVendorAC;
    	
    	@FindBy(xpath="//*[@id='filterTree_68_0_AdvanceFilter_']/ul/li[5]/ul/li[1]/a")
    	public static WebElement selectFieldVendorACName;
    	
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='23']")
    	public static WebElement selectFieldItem;
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='5021']")
    	public static WebElement selectFieldItemName;
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[text()='Quantity']")
    	public static WebElement selectFieldQuantity;
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='268435460']")
    	public static WebElement selectFieldWarehouse;
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='268435460']/following-sibling::ul/li/a[text()='Name']")
    	public static WebElement selectFieldWarehouseName;
    	
    	
    	
    	
    	
    	
    	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='1073741850']")
    	public static WebElement voucherQty;
    	
    	@FindBy(xpath="//li[@id='id_menu_tree_Purchases Vouchers']//i[@class='icon-expand col-xs-1']")
    	public static WebElement purchasevoucherExpandbutton;
    	
    	@FindBy(xpath="//span[@class='col-xs-10'][contains(text(),'Purchase Vouchers N')]")
    	public static WebElement purchasevoucherTypeCreatedVoucher;
    	
    	@FindBy(xpath="//li[@id='id_menu_tree_Sales Orders']/a/span")
    	public static WebElement documentNameSalesOrders;
    	
    	@FindBy(xpath="//li[@id='id_menu_tree_Sales Orders (1)']/a/span")
    	public static WebElement documentNameSalesOrders1;
    	
    	
    	
    	
    	// 
    	
    	@FindBy(xpath="//select[@id='ddlLimiton']")
    	public static WebElement limitDefination_LimitOnDrpdwn;
    	
    	@FindBy(xpath="//div[@id='divCondtionModal']/div/div/div[2]/div[1]/div[4]/span")
    	public static WebElement limitDefination_ConditionPopupOkBtn;
    	
    	@FindBy(xpath="(//div[@id='68_1_AdvanceFilter_']/table/tbody//select)[1]")
    	public static WebElement limitDefination_ConjunctionDrpdwn;
    	
    	@FindBy(xpath="(//div[@id='68_1_AdvanceFilter_']/table/tbody//input)[1]")
    	public static WebElement limitDefination_SelectFieldTxt;
    	
    	@FindBy(xpath="//div[@id='68_1_AdvanceFilter_']/table/tbody//a[text()='CustomerAC']")
    	public static WebElement limitDefination_SelectFieldCustomerAC;
    	
    	@FindBy(xpath="//div[@id='68_1_AdvanceFilter_']/table/tbody//a[text()='Warehouse']")
    	public static WebElement limitDefination_SelectFieldWarehouse;
    	
    	@FindBy(xpath="//div[@id='68_1_AdvanceFilter_']/table/tbody//a[text()='Item']")
    	public static WebElement limitDefination_SelectFieldItem;
    	
    	@FindBy(xpath="//div[@id='68_1_AdvanceFilter_']/table/tbody//a[text()='Unit']")
    	public static WebElement limitDefination_SelectFieldUnit;
    	
    	@FindBy(xpath="(//div[@id='68_1_AdvanceFilter_']/table/tbody//select)[2]")
    	public static WebElement limitDefination_SelectOperatorDrpdwn;
    	
    	@FindBy(xpath="(//div[@id='68_1_AdvanceFilter_']/table/tbody//select)[3]")
    	public static WebElement limitDefination_CompareWithDrpdwn;
    	
    	@FindBy(xpath="(//div[@id='68_1_AdvanceFilter_']/table/tbody//input)[2]")
    	public static WebElement limitDefination_ValueTxt;
    	
    	@FindBy(xpath="//span[@id='btnCancel']")
    	public static WebElement limitDefination_CancelBtn;
    	
    	
    	
    	// Escalation Tab
    	
    	@FindBy(xpath="//span[@class='font-5'][contains(text(),'Escalation')]")
    	public static WebElement escalationTab;					

    	@FindBy(xpath="//*[@id='spnAddEscalation']/i")
    	public static WebElement escalationLevelAddBtn;					
    	
    	
    	//First Escalation
    	
    	@FindBy(xpath="//*[@id='txtTimeLimit1']")
    	public static WebElement TimelimitTxt1;					
    			
    	@FindBy(xpath="//*[@id='ddlTimeLimit1']")
    	public static WebElement timelimitDropdown1;					
    			
    	@FindBy(xpath="//*[@id='ddlEscalationType1']")
    	public static WebElement EscalationType1;	
    	
    	@FindBy(xpath="//select[@id='ddlUserType1']")
    	public static WebElement escalation_UserTypeDrpdwn;
    	
    	@FindBy(xpath="//div[@id='divEscalationBody1']/div[4]/div[2]/div[2]/div/div[1]//label/input")
    	public static List<WebElement> escalation_UsersCheckboxList;
    	
    	@FindBy(xpath="//div[@id='divEscalationBody1']/div[4]/div[2]/div[2]/div/div[1]//label")
    	public static List<WebElement> escalation_UsersList;
    	
    	
    	
    	
    	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[1]")
    	public static WebElement Minimize1;					
    	
    	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[2]")
    	public static WebElement Close1;					
    			
    	
    	//Second Escalation
    	
    	@FindBy(xpath="//*[@id='txtTimeLimit2']")
    	public static WebElement TimelimitTxt2;					
    			
    	@FindBy(xpath="//*[@id='ddlTimeLimit2']")
    	public static WebElement Dropdown2;					
    			
    	@FindBy(xpath="//*[@id='ddlEscalationType2']")
    	public static WebElement EscalationType2;	
    	
    	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[1]")
    	public static WebElement Minimize2;					
    	
    	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[2]")
    	public static WebElement Close2;
    	
    	@FindBy (xpath="//input[@id='chkDateRange']")
    	public static WebElement transactionAuthorizationConditionTabDateRangeChkBox;
    	
    	@FindBy (xpath="//input[@id='dpFromDate']")
    	public static WebElement transactionAuthorizationConditionTabFromDateTxt;
    	
    	@FindBy (xpath="//td[@id='dpFromDate_input_image']/span")
    	public static WebElement transactionAuthorizationConditionTabFromDateCalendarIcon;
    	
    	@FindBy (xpath="//input[@id='dpToDate']")
    	public static WebElement transactionAuthorizationConditionTabToDateTxt;
    	
    	@FindBy (xpath="//td[@id='dpToDate_input_image']/span")
    	public static WebElement transactionAuthorizationConditionTabToDateCalendarIcon;
    	
    	
    	@FindBy (xpath="//input[@id='chkTimeRange']")
    	public static WebElement transactionAuthorizationConditionTabTimeRangeChkBox;
    	
    	@FindBy (xpath="//input[@id='tpFromTime']")
    	public static WebElement transactionAuthorizationConditionTabFromTimeTxt;
    	
    	@FindBy (xpath="//input[@id='tpToTime']")
    	public static WebElement transactionAuthorizationConditionTabToTimeTxt;

    	@FindBy(xpath="//*[@id='trRender_0']/td[2]")
		public static WebElement listOfDoc_1stRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_0']/td[3]")
		public static WebElement listOfDoc_1stRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[4]")
		public static WebElement listOfDoc_1stRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[5]")
		public static WebElement listOfDoc_1stRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[6]")
		public static WebElement listOfDoc_1stRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_0']/td[7]")
		public static WebElement listOfDoc_1stRow6thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_1']/td[2]")
		public static WebElement listOfDoc_2ndRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_1']/td[3]")
		public static WebElement listOfDoc_2ndRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[4]")
		public static WebElement listOfDoc_2ndRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[5]")
		public static WebElement listOfDoc_2ndRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[6]")
		public static WebElement listOfDoc_2ndRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[7]")
		public static WebElement listOfDoc_2ndRow6thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_2']/td[2]")
		public static WebElement listOfDoc_3rdRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_2']/td[3]")
		public static WebElement listOfDoc_3rdRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[4]")
		public static WebElement listOfDoc_3rdRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[5]")
		public static WebElement listOfDoc_3rdRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[6]")
		public static WebElement listOfDoc_3rdRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[7]")
		public static WebElement listOfDoc_3rdRow6thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_3']/td[2]")
		public static WebElement listOfDoc_4thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_3']/td[3]")
		public static WebElement listOfDoc_4thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[4]")
		public static WebElement listOfDoc_4thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[5]")
		public static WebElement listOfDoc_4thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[6]")
		public static WebElement listOfDoc_4thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[7]")
		public static WebElement listOfDoc_4thRow6thCol;
		
		@FindBy(xpath="//input[@id='id_body_37']")
		public static WebElement enter_Expirydate;
		
		@FindBy(id="txtPassword")
		public static WebElement password;
		
		@FindBy(xpath="//td[@id='id_tblAlerts_col_1-5']")
		public static WebElement alertTabRow1AlertTxt;
		
		@FindBy(xpath="//th[@id='id_tblAlerts_control_heading_5']/div/u")
		public static WebElement alertTabAlertHeadingLink;
		
		@FindBy(xpath="//select[@id='id_tblAlerts_Alerts']")
		public static WebElement alertTabRow1AlertDrpdwn;
		
		@FindBy(xpath="//label[text()=' Escalation Level 1']")
		public static WebElement EscalationLevelText;



			



}
