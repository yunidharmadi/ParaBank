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

WebUI.click(findTestObject('Object Repository/Update Contact Info/a_Update Contact Info'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Update Contact Info")

String firstName = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String lastName = ExcelKeywords.getCellValueByAddress(sheet, "B2")
String address = ExcelKeywords.getCellValueByAddress(sheet, "C2")
String city = ExcelKeywords.getCellValueByAddress(sheet, "D2")
String state = ExcelKeywords.getCellValueByAddress(sheet, "E2")
String zipCode = ExcelKeywords.getCellValueByAddress(sheet, "F2")
String phone = ExcelKeywords.getCellValueByAddress(sheet, "G2")

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input First Name'), firstName)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input Last Name'), lastName)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input Address'), address)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input City'), city)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input State'), state)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input Zip Code'), zipCode)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Update Contact Info/input Phone'), phone)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Update Contact Info/button Update Profile'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Update Contact Info/h1_Profile Updated'), 0)