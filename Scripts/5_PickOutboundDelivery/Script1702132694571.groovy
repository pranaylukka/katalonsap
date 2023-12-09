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

WebUI.callTestCase(findTestCase('4_CreateOutboudDeliveries'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/div_Pick Outbound Delivery'))

WebUI.setText(findTestObject('Object Repository/Page_Pick Outbound Delivery/input_Delivery___xmlview109--S1ReferenceDoc_97d248'), 
    GlobalVariable.deliveryID)

WebUI.sendKeys(findTestObject('Object Repository/Page_Pick Outbound Delivery/input_Delivery___xmlview109--S1ReferenceDoc_97d248'), 
    Keys.chord(Keys.ENTER))
WebUI.scrollToElement(findTestObject('Object Repository/Page_Pick Outbound Delivery/pickupicon'), 0)
WebUI.clearText(findTestObject('Object Repository/Page_Pick Outbound Delivery/input_Confirmation Status___xmlview109--S1P_099f61'))
WebUI.setText(findTestObject('Object Repository/Page_Pick Outbound Delivery/input_Confirmation Status___xmlview109--S1P_099f61'), 
    '10')

WebUI.sendKeys(findTestObject('Object Repository/Page_Pick Outbound Delivery/input_Confirmation Status___xmlview109--S1P_099f61'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Pick Outbound Delivery/bdi_Save'))

WebUI.click(findTestObject('Object Repository/Page_Pick Outbound Delivery/bdi_Post GI'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Pick Outbound Delivery/div_GI posted'), 'GI posted')

WebUI.click(findTestObject('Object Repository/Page_Pick Outbound Delivery/img__shell-header-icon'))

