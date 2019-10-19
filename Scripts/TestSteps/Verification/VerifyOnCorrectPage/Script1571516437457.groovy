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

'Get Current Url'
String CurrentUrl = WebUI.getUrl()

UrlResult = WebUI.verifyMatch(CurrentUrl, ExpectedUrl, false)

'Get the Text of Specified Element'
String PageText = WebUI.getText(findTestObject(ElementToCheck))

PageTextResult = WebUI.verifyMatch(PageText, ExpectedPageText, false)

/*------------------------------------------------------------*/

def checkCorrectPageUrlAndText(UrlResult,PageTextResult)
{
	'If both items match expected return true, if not return false'
	if(UrlResult && PageTextResult == true){
		return true
	} else return false
}

checkCorrectPageUrlAndText(UrlResult,PageTextResult)


