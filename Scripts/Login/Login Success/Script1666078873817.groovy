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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.keyword.excel.ExcelKeywords

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Login")

String username = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String password = ExcelKeywords.getCellValueByAddress(sheet, "B2")

WebUI.setText(findTestObject('Object Repository/Register/input Username'), username)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input Password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login/button Login'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/p_Login Success'))