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



class Registration {
	
	//Register1//
	@Given("I open application for register")
	def Open_application() {
		Mobile.startApplication('D:\\app-release.apk', true)
	}
	@When("I open register form for register")
	def Open_register_form() {
		Mobile.tap(findTestObject('Object Repository/Registrasi/android.widget.Button'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Registrasi/android.widget.Button (1)'), 0)
	}
	@When("I fill username in field username (.*)")
	def fill_username(String username) {
		Mobile.tap(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - Alex Under, Fullname'), 0)

		Mobile.clearText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - Alex Under, Fullname (1)'), 0)

		Mobile.setText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - Fullname'), 'anggitan666', 0)

		Mobile.hideKeyboard()
	}
	@When("I fill email in field email (.*)")
	def fill_email(String email) {
		Mobile.tap(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - alexemail.com, Email'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - alexemail.com, Email (1)'), 
		    0)
		
		Mobile.setText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - Email'), 'anggitan666@gmail.com', 
		    0)
		
		Mobile.hideKeyboard()
	}	
	@When("I fill password in field password(.*)")
	def fill_password(String password) {
		Mobile.tap(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - 123123123, Password'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - 123123123, Password (1)'), 
		    0)
		
		Mobile.setText(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.EditText - Password'), 'anggitan666', 
		    0)
		
		Mobile.hideKeyboard()
	}
	@When("I click register button")
	def click_register_button() {
		Mobile.tap(findTestObject('Object Repository/Registrasi/Registrasi.2/android.widget.Button'), 0)
	}
	@Then("I verify successfully register and navigated to home page")
	def successfully_register_account() {
		Mobile.closeApplication()
	}
}