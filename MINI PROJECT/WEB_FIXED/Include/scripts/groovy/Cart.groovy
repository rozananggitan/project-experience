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



class Cart {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I choose and click button buy product and edit quantity product")
	def I_buy_product_and_edit_quantity() {
		WebUI.click(findTestObject('Object Repository/Cart/button_Beli'))
	}
	@And("I click icon cart for edit quantity")
	def I_navigated_cart_page_for_add_product() {
		WebUI.click(findTestObject('Object Repository/Cart/button_1'))
	}

	@And("I click button + for add quantity product")
	def I_click_add_button() {
		WebUI.click(findTestObject('Object Repository/Cart/span_'))

		WebUI.click(findTestObject('Object Repository/Cart/span_'))
		
		WebUI.click(findTestObject('Object Repository/Cart/span_'))
	}

	@Then("I verify successfully quantity product was added")
	def I_verify_successfully_added() {
		WebUI.click(findTestObject('Object Repository/Cart/div_Total Qty4'))

		WebUI.click(findTestObject('Object Repository/Cart/div_Sony PS5Rp 299-4Total Qty4Total Bayar11_72e290'))
	}
	@And("I click button - for reduced quantity product")
	def I_click_reduced_button() {
		WebUI.click(findTestObject('Object Repository/Cart/span_-'))
		
		WebUI.click(findTestObject('Object Repository/Cart/span_-'))
	}
	@Then("I verify successfully quantity product was reduced")
	def I_verify_successfullu_reduced() {
		WebUI.click(findTestObject('Object Repository/Cart/div_Total Qty2'))
		
		WebUI.click(findTestObject('Object Repository/Cart/div_Sony PS5Rp 299-2Total Qty2Total Bayar598 Bayar'))
	}
}