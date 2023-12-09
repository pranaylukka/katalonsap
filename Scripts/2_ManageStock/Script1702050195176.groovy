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

WebUI.callTestCase(findTestCase('1_Login'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_Home/span_Manage Stock'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Manage Stock/span_Manage Stock'), 0)

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Select Options'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Plant 1 US'))


WebUI.setText(findTestObject('Object Repository/Page_Manage Stock/inputapplication-Material-manageStock-compo_1a22d7'), 
    'MZ-FG-EB01')

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_MZ-FG-EB01'))
WebUI.scrollToElement(findTestObject('Object Repository/Page_Manage Stock/span_Object Number_application-Material-man_83b02f'),5000)
WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Object Number_application-Material-man_83b02f'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/span_Initial Entry_idManageStockType-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/li_Initial Entry'))

for(int i=1;i<=10;i++)
{
	
	WebUI.click(findTestObject('Object Repository/Page_Manage Stock/incrementstock'))
	
}

WebUI.click(findTestObject('Object Repository/Page_Manage Stock/bdi_Post'))
getMaterialDocument=WebUI.getText(findTestObject('Object Repository/Page_Manage Stock/materialdocumenttext'))
println(getMaterialDocument)
WebUI.click(findTestObject('Object Repository/Page_Manage Stock/bdi_OK'))
WebUI.click(findTestObject('Object Repository/Page_Manage Stock/imgshell-header-icon'))


