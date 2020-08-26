# FAQ

**Can I rename or move anything around that might be associated with another test?"**

Yes. Items can be moved around, Katalon is smart enough to update any references to it so it can find it, with the exception of Keywords because they are custom code. If you do move a Keyword, or change its signature, need to be sure you change anything its referencing it as well manually. Right clicking the Keyword and selecting Show References will let you know where you would need to make change.

**How do I see a report, or any error screenshots or video after I ran a test suite?**

_Note: This is only for Test Suites/Test Suite Collections. Just running single test cases do not provide this type of report._

In the folder Reports, anything a TestSuite, or TestSuite Collection is run, all the results are recorded here in a sub-folder that will be created and given the name of the TestSuite/Collection that is run. They are named with date reference first then a generated id number on the end, for example YYYYMMDD\_id. If you open the report, you will see the results of each test case in there. If there is a video associated with it, for those that failed, it will have a red video icon on the right side. It only does video for the failures, but you can change the Settings in Katalon to record for all testcases, or only do screenshots, etc.

_Note: doing it for all of them can take up a fair amount of space, so suggest leaving on default for errors only._

See more details information on reports at [Reports](base-katalon-features/reports.md)

**What is the Include folder for?**

This is for support Cucumber/Gherkin written test cases. I have not really used it. Looks interesting, and maybe at a later date I may work through it and see how it works and write up something at that time.

