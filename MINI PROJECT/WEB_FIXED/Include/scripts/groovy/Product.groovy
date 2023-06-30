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



class Product {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open website https://alta-shop.vercel.app/")
	def I_open_website_altashop (){
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I open login page for login my account")
	def I_open_login_page()	{
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}
	@And("I click login button for login my account")
	def I_click_login_button() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_Login'))
	}
	@And("I navigated to home page")
	def I_navigated_home_page() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_AltaShop0'))
	}
	@And("I choose product and click details product")
	def I_choose_and_click_product() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5  play has no limits  Rp 299DetailBeli'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_Detail'))
	}
	@And("Navigated to detail page")
	def I_navigated_detail_page() {

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299 (0)'))

		WebUI.closeBrowser()
	}

	@When("I navigated to home page for view product")
	def I_navigated_to_home_page() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_AltaShop0'))
	}
	@And("I choose and click details product for view details product without login account")
	def I_choose_and_click_product_without_login_account() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5  play has no limits  Rp 299DetailBeli'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_Detail'))
	}
	@Then("Navigated to detail page product without login account")
	def I_navigated_detail_page_without_login_account() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299 (0)'))

		WebUI.closeBrowser()
	}
	@And("I choose and click button buy product")
	def I_choose_and_click_button_buy_product() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5  play has no limits  Rp 299DetailBeli'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_DetailBeli'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_Beli'))
	}
	@Then("Successfully add product then navigated to transaction page")
	def I_navigated_to_transaction_page() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_1'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299-1Total Qty1Total Bayar299 Bayar'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299-1Total Qty1Total Bayar299 Bayar'))

		WebUI.closeBrowser()
	}
	@And("I choose and click button buy product for view transaction page without login account")
	def I_choose_and_click_button_buy_product_without_login_account() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5  play has no limits  Rp 299DetailBeli'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_Beli'))
	}
	@Then("Successfully add product then navigated to transaction page without login account")
	def I_navigated_to_transaction_page_without_login_account() {
		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/button_1'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299-1Total Qty1Total Bayar299 Bayar'))

		WebUI.click(findTestObject('Object Repository/Product/Page_frontend-web/div_Sony PS5Rp 299-1Total Qty1Total Bayar299 Bayar'))

		WebUI.closeBrowser()
	}
}