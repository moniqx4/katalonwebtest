import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Get the Current URL'
String CurrentUrl = WebUI.getUrl()

def checkUrl(CurrentUrl,ExpectedUrl)
{
	if (CurrentUrl == ExpectedUrl) {
		KeywordUtil.markPassed('Redirected to the correct URL')
	
		result = true
		
	
	} else {
		KeywordUtil.markFailed(((CurrentUrl + ' and ') + ExpectedUrl) + ' Do Not Match')
	
		result = false
		
	}
}

/* ExpectedUrl is local variable to the testcase, can set in the variables tab
 * Return a boolean result of true/passed, or false/failed
 */
return checkUrl(CurrentUrl,ExpectedUrl)
