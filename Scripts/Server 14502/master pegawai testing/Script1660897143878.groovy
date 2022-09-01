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

WebUI.navigateToUrl('http://101.255.121.243:1180/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_Email or username_login'), '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_Password_password'), 'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.sendKeys(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/a_User'))

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/span_Master Pegawai'))

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_nik'), '3275092938123445')

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_name'), 'Agung')

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_pob'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_dob'))

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/td_18'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_dob'), '18/08/2000')

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/div_Data Pribadi adalah data yang sangat rahasia'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_email'), 'testing@gmail.com')

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_hp'), '081388776789')

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/span_Pencarian'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_user_hp'), '081388776789')

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_nip'), '83823')

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/span_Penata Tingkat 1'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_emp_position'), 'Jabatan')

WebUI.click(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/span_Pilih Satker'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Badiklat Kejaksaan RI/input_()_emp_position'), 'Jabatan')

