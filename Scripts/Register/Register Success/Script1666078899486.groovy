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

WebUI.click(findTestObject('Object Repository/Register/a_Register'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Register")

String firstName = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String lastName = ExcelKeywords.getCellValueByAddress(sheet, "B2")
String address = ExcelKeywords.getCellValueByAddress(sheet, "C2")
String city = ExcelKeywords.getCellValueByAddress(sheet, "D2")
String state = ExcelKeywords.getCellValueByAddress(sheet, "E2")
String zipCode = ExcelKeywords.getCellValueByAddress(sheet, "F2")
String phone = ExcelKeywords.getCellValueByAddress(sheet, "G2")
String SSN = ExcelKeywords.getCellValueByAddress(sheet, "H2")
String username = ExcelKeywords.getCellValueByAddress(sheet, "I2")
String password = ExcelKeywords.getCellValueByAddress(sheet, "J2")
String confirmPassword = ExcelKeywords.getCellValueByAddress(sheet, "K2")

WebUI.setText(findTestObject('Object Repository/Register/inputFirst Name'), firstName)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input Last Name'), lastName)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input Address'), address)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input City'), city)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input State'), state)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input Zip Code'), zipCode)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input Phone'), phone)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input SSN'), SSN)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Register/input Username'), username)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input Password'), password)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input Confirm Password'), confirmPassword)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Register/button Register'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/p_Register Success'))
