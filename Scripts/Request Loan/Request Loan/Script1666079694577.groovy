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

WebUI.click(findTestObject('Object Repository/Request Loan/a_Request Loan'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Request Loan")

String loanAmount = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String downPayment = ExcelKeywords.getCellValueByAddress(sheet, "B2")
String fromAccount = ExcelKeywords.getCellValueByAddress(sheet, "C2")

WebUI.setText(findTestObject('Object Repository/Request Loan/input Loan Amount'), loanAmount)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Request Loan/input Down Payment'), downPayment)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Request Loan/select From Account'), fromAccount)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Request Loan/button Apply Now'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Request Loan/h1_Loan Request Processed'), 0)