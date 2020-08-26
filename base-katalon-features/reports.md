---
description: >-
  Katalon has a fairly decent reporting option. Not only locally, but they
  provide a online option called Katalon Analytics, to store results and keep a
  results history as well, and pretty graphics, etc
---

# Reports



As of right now katalon Analytics is free. I think you can pay if you want history stored for longer periods, or something like that. I haven't investigated it fully, but for basic needs its free.

In the Reports folder, If you select a report for one of the test suites you have run in that report, there is a summary at the bottom, and there are also two other tabs, Execution Settings \( details of the setup for test case to run\) and Execution Environment \( more specific data on test setup\).

To the top right is a Show Test Information, if you click on that, you get a Test Case's log, every step is outlined here, and there is an Information tab and Integration tab. On each test case step here, if you click the down error on that step you get line by line what happened for that particular step. Basically all the information you might need to see about how a test case ran is here.

There is another option there, Katalon Analytics. If you click that, you have an option to Access the analytics to your test run \( requires you have an account setup for this already, its free\), this will bring you to the Katalon Analytics for this project and you can see all the details on a website with graphics, and tons of data in regard to your runs, and it stores your history for long term as well. I have my project to setup to automatically upload all test runs to Katalon Analytics , but if you didn't or maybe you want it to goto your own personal account or something, you will also see on the drop option to Upload Analytics, and do it yourself manually.

\_\_ℹ _Notes:_

* _I have noticed if you enable Katalon Analytics to upload all after every run, it adds a little more time to testrun to do this. So if its not an official run \( maybe you are doing some small ones for your own test regression\) and may not want it to end up in Katalon Analytics, best only upload them when want that data to be recorded and stored for later review or information included in test run history reports._ 
* _Reports are local to your test runs, unless you were to upload those results to a shared Kalaton Analytics. This means you will not have any reports on your local copy, til you run some Test Suites/Collections._

