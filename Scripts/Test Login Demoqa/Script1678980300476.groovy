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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Locator Login/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Locator Login/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('Object Repository/Locator Login/Page_My Account  ToolsQA Demo Site/input__username'), 'Ardiandwi')

WebUI.setEncryptedText(findTestObject('Object Repository/Locator Login/Page_My Account  ToolsQA Demo Site/input__password'), 
    'smCXsz0wgfm07i1Ti4n3bg==')

WebUI.click(findTestObject('Locator Add to Cart/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/Locator Login/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.scrollToPosition(0, 500)

WebUI.getText(findTestObject('Locator Login/Page_My Account  ToolsQA Demo Site/strong_Ardiandwi'))

WebUI.verifyElementText(findTestObject('Object Repository/Locator Login/Page_My Account  ToolsQA Demo Site/strong_Ardiandwi'), 
    'Ardiandwi')

WebUI.scrollToPosition(500, 0)

