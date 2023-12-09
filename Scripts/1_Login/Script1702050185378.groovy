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
WebUI.maximizeWindow()	

WebUI.setText(findTestObject('Object Repository/Page_SAP Trial Sign In/input_j_username'), 'vivek1123.skillquotient@outlook.com')

WebUI.click(findTestObject('Object Repository/Page_SAP Trial Sign In/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_I accept all cookies'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_password'), 'qRDcH7iq2Vu9Bt71lzjg0Q==')

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Home/span_Home'),10000)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Home/span_Home'), 'Home')