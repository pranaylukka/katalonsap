import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my305028.s4hana.ondemand.com/')

WebUI.setText(findTestObject('Object Repository/Page_SAP Trial Sign In/input_j_username'), 'vivek1123.skillquotient@outlook.com')

WebUI.click(findTestObject('Object Repository/Page_SAP Trial Sign In/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_I accept all cookies'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 'qRDcH7iq2Vu9Bt71lzjg0Q==')

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my305028.s4hana.ondemand.com/ui')

WebUI.setText(findTestObject('Object Repository/Page_SAP Trial Sign In/input_j_username'), 'vivek1123.skillquotient@outlook.com')

WebUI.click(findTestObject('Object Repository/Page_SAP Trial Sign In/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_I accept all cookies'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 'qRDcH7iq2Vu9Bt71lzjg0Q==')

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Guided Tours'))

WebUI.click(findTestObject('Object Repository/Page_Trial Center/span_Order to Cash'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home/h2_Start Guided Tour'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home/button_Start'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Manage Stock'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/h2_Manage Stock'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Stock/inputapplication-Material-manageStock-compo_7d933c'), 
    'Plant 1 US')

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Plant 1 US'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Stock/inputapplication-Material-manageStock-compo_1a22d7'), 
    'MZ-FG-EB01')

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_MZ-FG-EB0'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/spanapplication-Material-manageStock-compon_cca482'))

WebUI.setText(findTestObject('Object Repository/Page_Manage Stock/inputidInputQuantity-input-inner'), '10')

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Initial Entry'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/li_Initial Entry'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/bdi_Post'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Stock/a_Material document 49002556522023 created'), 
    'Material document 4900255652/2023 created')

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/bdi_OK'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/imgshell-header-icon'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Manage Sales Orders'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/h2_Create Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/span_Create'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/h2_Create Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/div_Create Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/spanAPD_SalesOrderType-inner-vhi'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_Standard Order (OR)'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/h2_Create Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/inputAPD_SalesOrganization-inner-inner'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/inputcus.sd.salesorderv2.manageSalesOrderMa_331caf'), 'USCU_S14')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_USCU_S14'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Items'))

