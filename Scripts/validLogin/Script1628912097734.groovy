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

'go to url'
WebUI.navigateToUrl(GlobalVariable.baseLoginUrl)

WebUI.scrollToPosition(0, 200)

'input valid username'
WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_UserName_userName'), 'sitiek')

'input valid password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ToolsQA/input_Password_password'), 'kCzFGVEvU7FshGAbBDNHyQ==')

WebUI.verifyElementClickable(findTestObject('Page_ToolsQA/button_Login'))

'click login button'
WebUI.click(findTestObject('Page_ToolsQA/button_Login'))

'verify success login'
WebUI.verifyElementText(findTestObject('Page_ToolsQA/label_sitiek'), 'sitiek')

