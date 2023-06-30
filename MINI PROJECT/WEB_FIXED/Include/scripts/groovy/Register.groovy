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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open website altashop https://alta-shop.vercel.app/")
	def I_open_website() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I open register form for create new account")
	def I_open_register_form() {
		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))

		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/a_Register'))
	}

	@And("I fill username in field username (.*)")
	def I_fill_username(String username) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Nama Lengkap_input-3864'), 'anggitan7272')
	}
	@And("I fill email in field email (.*)")
	def I_fill_email(String email) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Email_input-3867'), 'anggitan7272@gmail.com')
	}
	@And("I fill password in field password (.*)")
	def I_fill_password(String password) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Password_input-3870'), 'anggitan777')
	}
	@And("I click register button for register account")
	def click_register_button() {
		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/button_Register'))
	}
	@Then("I successfully register account and navigated to login page")
	def Successfully_register_account() {
		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/div_LoginEmailPasswordLogin Belum memiliki _4d7311'))
		WebUI.closeBrowser()
	}
}