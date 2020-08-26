---
description: Here are some basic guidelines to keep in mind when using Katalon.
---

# Basic Guidelines

* Before running tests be sure and pull the latest master branch. Some tests may have updates or logic changes or leverage new features, or fixes. Best to stay updated. 
* A rule of thumb, if you didn't create it, DO NOT alter or delete it, copy instead. Easier to clean up extra files,then trying to fix things you may have accidentally broken. Or you can also Right click on item and do Show References it will then display all the places using a given item. 
* When making a new test case, always create it under the InProgress folder folder, get it completely working and refactored as possible. Then, once ready to be used by anyone, move to the CompletedTestCases or TestModules or where ever it needs to go. 
* If you find a teststep or a full test case that is not working quite right for your profile, ALWAYS make a copy of that test case and put a Testcase folder marked with your name. If folder doesn't exist just create it under the main folder is should be in with your Username in front of it. For example, Monica\_CompletedTestCase and make your changes there. TestCases and TestSteps in their main folders my be shared with other profiles or testcases that are verified to work there, so altering them, could break it for another profile. Same goes for the Object Repository. This is also another place, the Show References will show you where this teststep/testcase is being used as well. 
  * Note: if no other testcases or teststeps are references, then can move to the NotWorking folder, and I will review it when I get a chance, or can also just fix it as well if know what the issue is. 
* Try and make testcases down to 1 validation point when possible. I know this is not always the best deal depending on what your downing but try and do this, even if it means duplicating say login, or whatever, or consider making it data driven if you have a bunch of iterations to run. Its not only good practice, but helps speeding up test and less chances to break before all validations are done. Less Flaky. 
* Overall, one thing I learned, K.I.S.S really does apply. Keeping it simple and working, is better then difficult and not working. Much easier and less frustrating to troubleshoot and fix smaller module scripts, and ok to be more verbose with your code. Just because there are a bunch of ingenious ways to make thing appear cleaner \( code wise\), doesn't always make it a good idea. Learned this the first time I had to troubleshoot something I wrote, in this manner, and how much easier it was to troubleshoot after I put it back to the longer format. Now, unless I'm really sure the code I'm using is really solid in all aspects \(meaning I'd be able to package it up and give it to someone else to implement without worrying about them needing to know how it works internally\), I go with what's easier to troubleshoot, fix or maintain. No secret sauce necessary for testing automation.



* 



  


