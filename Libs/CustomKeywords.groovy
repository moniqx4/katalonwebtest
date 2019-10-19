
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.Object


def static "utilities.ScriptExecutors.getAppVersion"() {
    (new utilities.ScriptExecutors()).getAppVersion()
}

def static "utilities.BrowserHelpers.openNewTab"() {
    (new utilities.BrowserHelpers()).openNewTab()
}

def static "utilities.BrowserHelpers.getPageSource"() {
    (new utilities.BrowserHelpers()).getPageSource()
}

def static "utilities.BrowserHelpers.getBrowserAndVersion"() {
    (new utilities.BrowserHelpers()).getBrowserAndVersion()
}

def static "utilities.BrowserHelpers.getScreenResolution"() {
    (new utilities.BrowserHelpers()).getScreenResolution()
}

def static "utilities.BrowserHelpers.getCookie"() {
    (new utilities.BrowserHelpers()).getCookie()
}

def static "teststep.modules.CommonTestSteps.login"(
    	Object email	
     , 	Object password	
     , 	Object usernameTextObj	
     , 	Object passwordTextObj	
     , 	Object submitButtonObj	) {
    (new teststep.modules.CommonTestSteps()).login(
        	email
         , 	password
         , 	usernameTextObj
         , 	passwordTextObj
         , 	submitButtonObj)
}

def static "teststep.modules.CommonTestSteps.register"() {
    (new teststep.modules.CommonTestSteps()).register()
}

def static "randomdata.TestDataGenerator.getRandomParagraphs"(
    	int a	
     , 	int b	) {
    (new randomdata.TestDataGenerator()).getRandomParagraphs(
        	a
         , 	b)
}

def static "randomdata.TestDataGenerator.getRandomName"(
    	int a	
     , 	int b	) {
    (new randomdata.TestDataGenerator()).getRandomName(
        	a
         , 	b)
}

def static "randomdata.TestDataGenerator.getRandomFemaleName"() {
    (new randomdata.TestDataGenerator()).getRandomFemaleName()
}

def static "randomdata.TestDataGenerator.getRandomMaleName"() {
    (new randomdata.TestDataGenerator()).getRandomMaleName()
}

def static "randomdata.TestDataGenerator.getRandomFirstName"() {
    (new randomdata.TestDataGenerator()).getRandomFirstName()
}

def static "randomdata.TestDataGenerator.getRandomLastName"() {
    (new randomdata.TestDataGenerator()).getRandomLastName()
}

def static "randomdata.TestDataGenerator.getRandomCity"() {
    (new randomdata.TestDataGenerator()).getRandomCity()
}

def static "randomdata.TestDataGenerator.getRandomHeading"(
    	int numberofWords	) {
    (new randomdata.TestDataGenerator()).getRandomHeading(
        	numberofWords)
}

def static "randomdata.TestDataGenerator.getRandomHeading_two"(
    	int Wordsfrom	
     , 	int wordstwo	) {
    (new randomdata.TestDataGenerator()).getRandomHeading_two(
        	Wordsfrom
         , 	wordstwo)
}

def static "randomdata.TestDataGenerator.getRandomEmail"() {
    (new randomdata.TestDataGenerator()).getRandomEmail()
}

def static "randomdata.TestDataGenerator.set_RandomNumber"(
    	long len	) {
    (new randomdata.TestDataGenerator()).set_RandomNumber(
        	len)
}

def static "randomdata.TestDataGenerator.set_RandomNumberWithText"(
    	int length	) {
    (new randomdata.TestDataGenerator()).set_RandomNumberWithText(
        	length)
}

def static "utilities.LogHelper.writeToLogDebug"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogDebug(
        	text)
}

def static "utilities.LogHelper.writeToLogError"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogError(
        	text)
}

def static "utilities.LogHelper.writeToLogFailed"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogFailed(
        	text)
}

def static "utilities.LogHelper.writeToLogNotRun"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogNotRun(
        	text)
}

def static "utilities.LogHelper.writeToLogPassed"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogPassed(
        	text)
}

def static "utilities.LogHelper.writeToLogWarning"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogWarning(
        	text)
}

def static "utilities.LogHelper.writeToLogInfo"(
    	Object text	) {
    (new utilities.LogHelper()).writeToLogInfo(
        	text)
}

def static "com.devstored.browserstackConnect.IOS"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).IOS(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}

def static "com.devstored.browserstackConnect.ANDROID"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).ANDROID(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}
