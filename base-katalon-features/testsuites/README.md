---
description: >-
  Test Suites are basically a collection of testcases that you want to run as
  part of a test run, for example a regression test run.
---

# TestSuites

Test Suites can also be used for data driven testing. Creating a single test to be repeated over a specified dataset. This is accomplished through setting up and binding the testcase variables in the Test Suite's data binding setting.

Each TestSuite has their own Setup and Teardowns, Run before or after each testcase and run before or after entire testsuite to set up whatever you need.

\*\*\*\*ℹ **Important Notes on TestSuites:**\*\* In order to get reporting, such as the Katalon Analytics online, or a full featured report, and screenshots and error videos, these are ONLY generated when tests are run out of a Test Suite or Test Suite Collection. You will find the reports for these runs in the Reports folder, and it structured and named by the same name and folders as the Testsuite is as the folder name that the report will reside in. Reports are named with the YYYYMMDD\_TIMESTAMP filename. These reports contain just about everything you want to know or see about your test suite run. All the logging is saved here as well in an easy to read and understand fashion. Video playback or screenshots ,if enabled, will have video player icons on those that failed. Clicking on a single testcase from list, and then click Show Testcase Details will give you line by line steps of each step run and result, as well as any attached files along with its details. You can also upload these results to Katalon Analytics and there a history of run data is stored. By default the uploading of the Analytics is not enabled.

Lots of information in there, need more detail go here: [https://docs.katalon.com/katalon-analytics/docs/overview.html](https://docs.katalon.com/katalon-analytics/docs/overview.html)

One other type of Test Suite I did not mention, because I haven't used it yet, Dynamic Test Suite Collections. Basically, if testcases are tagged properly can have TestSuites auto updated when new testcases are tagged to be added. More details here:

[https://docs.katalon.com/katalon-studio/docs/dynamic-querying-test-suite.html](https://docs.katalon.com/katalon-studio/docs/dynamic-querying-test-suite.html)

