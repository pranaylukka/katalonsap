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

WebUI.callTestCase(findTestCase('2_ManageStock'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/span_Manage Sales Orders'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Manage Sales Orders/span_Manage Sales Orders'), 0)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Manage Sales Orders/span_Create'),0)

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/span_Create'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/div_Create Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/spanAPD_SalesOrderType-inner-vhi'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/span_Standard Order (OR)'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/inputcus.sd.salesorderv2.manageSalesOrderMa_331caf'), 'USCU_S14')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_USCU_S14'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Items'))


WebUI.setText(findTestObject('Object Repository/Page_Sales Order/input__field7-__clone449-__clone528-inner-inner'), 'MZ-FG-EB01')

WebUI.click(findTestObject('Object Repository/Page_Sales Order/span_MZ-FG-EB01'))

WebUI.setText(findTestObject('Object Repository/Page_Sales Order/input__field9-__clone451-__clone529-inner-inner'), '10')




WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Create'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Save'))

WebUI.click(findTestObject('Object Repository/Page_Sales Order/bdi_Close'))

orderid=WebUI.getText(findTestObject('Object Repository/Page_Manage Sales Orders - Version 2/extractid'))

println("Order ID:"+orderid)
GlobalVariable.orderID = orderid
WebUI.click(findTestObject('Object Repository/Page_Sales Order/img__shell-header-icon'))

