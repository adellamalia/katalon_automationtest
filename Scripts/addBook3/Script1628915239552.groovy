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

WebUI.scrollToPosition(0, 1000)

'go to menu bookstore'
WebUI.click(findTestObject('Object Repository/Page_ToolsQA/li_Book Store'))

WebUI.waitForElementPresent(findTestObject('Page_ToolsQA/input_Book Store API_searchBox'), 2000)

'input search'
WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Book Store API_searchBox'), GlobalVariable.book3)

'verify search result'
WebUI.verifyElementText(findTestObject('Page_ToolsQA/a_You Dont Know JS'), GlobalVariable.book3)

'go to book details'
WebUI.click(findTestObject('Page_ToolsQA/a_You Dont Know JS'))

'verify book title\n'
WebUI.verifyElementText(findTestObject('Page_ToolsQA/label_You Dont Know JS'), GlobalVariable.book3)

WebUI.scrollToPosition(0, 1000)

'add to collection\n'
WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Add To Your Collection'))

WebUI.waitForAlert(5000)

alertText = WebUI.getAlertText()

WebUI.verifyEqual(alertText, 'Book added to your collection.')

'go to profile'
WebUI.click(findTestObject('Object Repository/Page_ToolsQA/li_Profile'))

WebUI.verifyElementText(findTestObject('Page_ToolsQA/a_You Dont Know JS'), GlobalVariable.book3)

