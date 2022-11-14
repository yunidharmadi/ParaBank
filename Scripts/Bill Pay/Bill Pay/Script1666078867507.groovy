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

WebUI.click(findTestObject('Object Repository/Bill Pay/a_Bill Pay'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Bill Pay")

String payeeName = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String address = ExcelKeywords.getCellValueByAddress(sheet, "B2")
String city = ExcelKeywords.getCellValueByAddress(sheet, "C2")
String state = ExcelKeywords.getCellValueByAddress(sheet, "D2")
String zipCode = ExcelKeywords.getCellValueByAddress(sheet, "E2")
String phone = ExcelKeywords.getCellValueByAddress(sheet, "F2")
String account = ExcelKeywords.getCellValueByAddress(sheet, "G2")
String verifyAccount = ExcelKeywords.getCellValueByAddress(sheet, "H2")
String amount = ExcelKeywords.getCellValueByAddress(sheet, "I2")
String fromAccount = ExcelKeywords.getCellValueByAddress(sheet, "J2")

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Payee Name'), payeeName)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Address'), address)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input City'), city)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input State'), state)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Zip Code'), zipCode)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Phone'), phone)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Account'), account)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Verify Account'), verifyAccount)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bill Pay/input Amount'), amount)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Bill Pay/select From Account'), fromAccount)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Bill Pay/button Send Payment'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/Bill Pay/h1_Bill Payment Complete'))