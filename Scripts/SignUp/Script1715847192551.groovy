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

WebUI.navigateToUrl('https://ursmartecosystem.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Ur Smart Ecosystem/p_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Signup form/input_Login here_emailsignup'), 'nausha1234@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Signup form/input_Email_phonesignup'), '628574577810')

WebUI.setText(findTestObject('Object Repository/Page_Signup form/input_Nomor telepon diawali 62, 7-13 karakt_13c933'), 'Nausha Adam')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signup form/input_Username_passwordsignup'), '+z/8NVLO6v/8RKyO6TePEw==')

WebUI.click(findTestObject('Object Repository/Page_Signup form/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Signup form/button_OK'))

WebUI.closeBrowser()

