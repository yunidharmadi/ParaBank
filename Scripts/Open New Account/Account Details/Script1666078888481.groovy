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

WebUI.click(findTestObject('Object Repository/Open New Account/a_account number'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Open New Account")

String activityPeriod = ExcelKeywords.getCellValueByAddress(sheet, "C2")
String type = ExcelKeywords.getCellValueByAddress(sheet, "D2")

WebUI.selectOptionByIndex(findTestObject('Object Repository/Open New Account/select Activity Period'), activityPeriod)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Open New Account/select Type'), type)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Open New Account/button Go'))