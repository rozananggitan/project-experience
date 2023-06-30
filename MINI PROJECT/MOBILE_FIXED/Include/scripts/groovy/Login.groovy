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
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open application for login")
	def Open_app_for_login() {
		Mobile.startApplication('D:\\app-release.apk', true)
	}

	@When("I open login page")
	def Open_login_page() {
		Mobile.tap(findTestObject('Object Repository/Login - Invalid/android.widget.Button'), 0)
	}
	
	@When("I fill email in field email for login (.*)")
	def Fill_email_for_login(String email1) {
		Mobile.tap(findTestObject('Object Repository/Login - Invalid/android.widget.EditText - Email'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Login - Invalid/android.widget.EditText - Email (1)'), 'anggitan666@gmail.com',
			0)
		
		Mobile.hideKeyboard()
	}
	@When("I fill password in field password for login (.*)")
	def Fill_password_for_login(String password1) {
		Mobile.tap(findTestObject('Object Repository/Login - Invalid/android.widget.EditText - Password'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Login - Invalid/android.widget.EditText - Password (1)'), 'anggitan666',
			0)
		
		Mobile.hideKeyboard()
	}
	@When("I click login button")
	def click_login_button() {
		Mobile.tap(findTestObject(''), 0)
	}
	@Then("I verify successfully login and navigated to home page")
	def Successfully_login() {
		Mobile.closeApplication()
	}
}