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

WebUI.click(findTestObject('Object Repository/Open New Account/a_Open New Account'))

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Open New Account")

String typeAccount = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String existingAccount = ExcelKeywords.getCellValueByAddress(sheet, "B2")

WebUI.selectOptionByIndex(findTestObject('Object Repository/Open New Account/select Type Account'), typeAccount)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Open New Account/select Existing Account'), existingAccount)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Open New Account/button Open New Account'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Object Repository/Open New Account/h1_Account Opened'))