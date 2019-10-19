package utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.openqa.selenium.Capabilities
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.awt.*

import internal.GlobalVariable

public class BrowserHelpers {

	/**
	 * Opens a new Tab
	 */
	@Keyword
	def openNewTab() {
		int currentTab = WebUI.getWindowIndex()

		WebDriver driver = DriverFactory.getWebDriver()

		JavascriptExecutor js = ((driver) as JavascriptExecutor)

		js.executeScript('window.open();')

		WebUI.switchToWindowIndex(currentTab + 1)
	}

	/**
	 * Gets and returns webpage's source data
	 */
	@Keyword
	def getPageSource() {
		WebDriver driver = DriverFactory.getWebDriver()

		return driver.getPageSource()
	}

	/**
	 * Get Browser and Version
	 */
	@Keyword
	def getBrowserAndVersion() {
		WebDriver driver = DriverFactory.getWebDriver()
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities()
		String browserName = caps.getBrowserName()
		String browserVersion = caps.getVersion()
		println browserName + ' ' + browserVersion
	}

	/**
	 * Get Screen Resolution
	 */
	@Keyword
	def getScreenResolution() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize()
		Integer screenHeight = screenSize.height
		Integer screenWidth = screenSize.width
		println screenWidth + 'x' + screenHeight
	}
	
	/**
	 * Get Cookie
	 */
	@Keyword
	def getCookie() {
			WebDriver driver = DriverFactory.getWebDriver()
			
			String Cookie = driver.manage().getCookieNamed(CookieName)
			
			return Cookie
	}

}
