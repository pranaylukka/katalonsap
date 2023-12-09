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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
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

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Home/span_'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Home/input_search'), 'manage sales orders')

WebUI.click(findTestObject('Object Repository/Page_Home/span_Manage Sales Orders - Version 2'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/bdi_Create'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/spanAPD_SalesOrderType-inner-vhi'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/span_Standard Order (OR)'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/bdi_Create_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/span_New Sales Order'), 'New: Sales Order')

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/inputcus.sd.salesorderv2.manageSalesOrderMa_331caf'), 'Maddison Technologies Corp. (17100004)')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_Maddison Technologies Corp'))
WebUI.scrollToElement(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/advanceddata'),5000)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/parters'),5000)
WebUI.click(findTestObject('Object Repository/Page_Sales Order/circle_sapMRbBInn'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Items'))


WebUI.setText(findTestObject('Object Repository/Page_Sales Order/input__field7-__clone449-__clone528-inner-inner'), 'IFRS SFS Test Material 1 (IF11)')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_IFRS SFS Test Material 1'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/input__field9-__clone451-__clone529-inner-inner'), '5')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Prices'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Billing Plan'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Sales Order/bdi_Create'),5000)
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/inputAPD_BillingPlanBillingDate-inner-inner'), '12/13/2023')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/spanAPD_BillingPlanDateCategory-inner-vhi'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_Milestone Billing (01)'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Create_1'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Texts'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Status and Blocks'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Output Items'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Incompleteness Info'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/a_Enter the Customer Reference'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/inputcus.sd.salesorderv2.manageSalesOrderMa_51b548'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Incompleteness Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/span_The incompletion check has run. All ne_06be0b'), 
    'The incompletion check has run. All necessary data has been provided.')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span__button395-img'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Create_1_2'))


WebUI.click(findTestObject('Object Repository/Page_Sales Order/div_Click here to navigate to the external _8f3e74'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/span_Completed'), 'Completed')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/span_Complete'), 'Complete')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/a_Maddison Technologies Corp'), 'Maddison Technologies Corp.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales Order/a_Maddison Technologies Corp_1'), 'Maddison Technologies Corp.')

orderid=WebUI.getText(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/extractid'))

println("Order ID:"+orderid)

WebUI.closeBrowser()

