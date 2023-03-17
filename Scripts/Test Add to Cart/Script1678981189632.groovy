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

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_My Account  ToolsQA Demo Site/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_Cart  ToolsQA Demo Site/a_Return to shop'))

WebUI.scrollToPosition(0, 510)

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_Products  ToolsQA Demo Site/img_Add to Wishlist_product-one-thumb'))

WebUI.scrollToPosition(0, 610)

WebUI.selectOptionByValue(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/select_Choose an optionBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/select_Choose an optionLargeMediumSmall'), 
    'small', true)

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/i_QTY_icon_plus'))

WebUI.doubleClick(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/i_QTY_icon_plus'))

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/i_QTY_icon_minus-06'))

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/i_QTY_icon_minus-06'))

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_black strappy polka dot ruched midi dr_1e07f5/a_View cart'))

WebUI.scrollToPosition(0, 500)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Locator Add to Cart/Page_Cart  ToolsQA Demo Site/a_black strappy polka dot ruched midi dress_d2c70c'), 
    'BLACK STRAPPY POLKA DOT RUCHED MIDI DRESS - BLACK')

WebUI.click(findTestObject('Object Repository/Locator Add to Cart/Page_Cart  ToolsQA Demo Site/a_clear shopping cart'))

WebUI.closeBrowser()

