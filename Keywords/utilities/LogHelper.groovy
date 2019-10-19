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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

import internal.GlobalVariable

public class LogHelper {
	
	@Keyword
	def writeToLogDebug(text){
		KeywordLogger log = new KeywordLogger()
		log.logDebug(text)
	}

	@Keyword
	def writeToLogError(text){
		KeywordLogger log = new KeywordLogger()
		log.logError(text)
	}

	@Keyword
	def writeToLogFailed(text){
		KeywordLogger log = new KeywordLogger()
		log.logFailed(text)
	}

	@Keyword
	def writeToLogNotRun(text){
		KeywordLogger log = new KeywordLogger()
		log.logNotRun(text)
	}

	@Keyword
	def writeToLogPassed(text){
		KeywordLogger log = new KeywordLogger()
		log.logPassed(text)
	}

	@Keyword
	def writeToLogWarning(text){
		KeywordLogger log = new KeywordLogger()
		log.logWarning(text)
	}


	@Keyword
	def writeToLogInfo(text){
		KeywordLogger log = new KeywordLogger()
		log.logInfo(text)
	}
}
