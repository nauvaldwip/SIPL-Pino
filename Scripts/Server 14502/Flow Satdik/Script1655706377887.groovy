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

WebUI.navigateToUrl('http://103.253.107.18:14502/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/input_Email or username_login (1)'), 
    '1102938400019')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/input_Password_password (1)'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/a_Admin (1)'))

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/a_Satdik'))

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/input_()_unit_code'), '0001')

WebUI.setText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/input_()_unit_name'), 'Satdik Testing')

WebUI.setText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/textarea_Alamat_unit_address'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/input_No Telepon_unit_phone'), 
    '086617381235')

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/button_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/Page_LEMDIKLAT POLRI/button_OK (1)'))

WebUI.closeBrowser()

