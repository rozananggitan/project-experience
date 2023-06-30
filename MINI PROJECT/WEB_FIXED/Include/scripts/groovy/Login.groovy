import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {

	//Login1//
	@Given("I open website altashop https://alta-shop.vercel.app/ for login account")
	def I_open_website_for_login_account() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I open login page")
	def I_open_login_page() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}

	@And("I fill valid email (.*)")
	def fill_valid_email(String email1) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-405'), 'anggitan7272@gmail.com')
	}
	@And("I fill valid password (.*)")
	def fill_valid_password(String password1) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-408'), 'anggitan777')
	}
	@And("I click button login for login account")
	def click_login_button() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/button_Login'))
	}
	@Then("I verify successfully login and navigated to home page")
	def verify_successfully_login() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_AltaShop0'))
		WebUI.closeBrowser()
	}

	//Login2//
	@And("I fill invalid email (.*)")
	def fill_invalid_email(String email2) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-405'), 'anggitan7272')
	}
	@Then("I verify unsuccessfully login with invalid email")
	def verify_unsuccessfully_with_invalid_email() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_record not found'))
		WebUI.closeBrowser()
	}

	//Login3//
	@And("I fill invalid password (.*)")
	def fill_invalid_password(String password2) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-408'), 'anggitan7777')
	}
	@Then("I verify unsuccessfully login with invalid password")
	def verify_unsuccessfully_with_invalid_password() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_email or password is invalid'))
		WebUI.closeBrowser()
	}

	//Login4//
	@And("I fill blank email (.*)")
	def fill_blank_email(String email3) {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-405'))
	}
	@Then("I verify unsuccessfully login with blank email")
	def verify_unsuccessfully_with_blank_email() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_email is required'))

		WebUI.closeBrowser()
	}

	//Login5//
	@And("I fill blank password (.*)")
	def fill_blank_password(String password3) {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-408'))
	}
	@Then("I verify unsuccessfully login with blank password")
	def verify_unsuccessfully_with_blank_password() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_password is required'))

		WebUI.closeBrowser()
	}
}