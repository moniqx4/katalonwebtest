package teststep.modules

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

import internal.GlobalVariable

public class CommonTestSteps {
	
	/* Login, pass in the email(username), password and the TestObjects for the page elements
	 * 
	 * */
	
	@Keyword
	def login(email,password, usernameTextObj, passwordTextObj,submitButtonObj){

		'Enter in Username (email)'
		WebUI.setText(findTestObject(usernameTextObj), email)

		'Enter in Password'
		WebUI.setText(findTestObject(passwordTextObj), password)

		'Click Login Button'
		WebUI.click(findTestObject(submitButtonObj))
	}	
	
	@Keyword
	def register(){
		
		'Enter in Username (email)'
		WebUI.setText(findTestObject(usernameTextObj), email)

		'Enter in Password'
		WebUI.setText(findTestObject(passwordTextObj), password)
		
		'Enter in Confirm Password'
		WebUI.setText(findTestObject(confirmPasswordTextObj), password)

		'Click Register Button'
		WebUI.click(findTestObject(submitButtonObj))
		
		// ----- Other fields that may be present
		String firstname = CustomKeywords.'randomdata.TestDataGenerator.getRandomFirstName'()
		String lastname = CustomKeywords.'randomdata.TestDataGenerator.getRandomFirstName'()
		
		'Enter in First Name'
		WebUI.setText(findTestObject(firstNameTextObj), firstname)
		
		'Enter in LastName'
		WebUI.setText(findTestObject(lastNameTextObj), lastname)
		
		'Enter in Address'
		WebUI.setText(findTestObject(addressTextObj), address)
		
	}
}
