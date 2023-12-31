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


WebUI.callTestCase(findTestCase('5_PickOutboundDelivery'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/span_Create Billing Documents'))

WebUI.setText(findTestObject('Object Repository/Page_Create Billing Documents/input_SD Document_application-BillingDocume_2871f6'), 
    GlobalVariable.deliveryID)

WebUI.click(findTestObject('Object Repository/Page_Create Billing Documents/bdi_Go'))

WebUI.click(findTestObject('Object Repository/Page_Create Billing Documents/div_Net Value_application-BillingDocument-c_cbd03b'))

WebUI.click(findTestObject('Object Repository/Page_Create Billing Documents/bdi_Create Billing Documents'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Manage Billing Documents/span_Invoice (F2)'),5000)


WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Billing Documents/span_Invoice (F2)'), 'Invoice (F2)')

WebUI.click(findTestObject('Object Repository/Page_Manage Billing Documents/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Manage Billing Documents/bdi_Post Billing Document'))

invoiceID=WebUI.getText(findTestObject('Object Repository/Page_Manage Billing Documents/getInvoice'))

GlobalVariable.invoiceID=invoiceID
