# Known Issues

### These are known issues with Katalon itself:

* If you running a lot of testcases individually, for example creating new ones, and needing to test it out, After a few hours of doing this, you may encounter a situation in which Katalon just freezes. This can happen because of memory resources are low. Every time a testcase is run, it creates a new instance of the browser driver, like chromedriver \(if that's your default browser\), and it does not automatically close them out. There is an option under Project &gt; Execution &gt; Post-Execution Options called "Terminate drivers after each Test Case" check that option to enable it. This will take care of problem, but the downside is, if you are needing the browser to stay open after run, it will also cause it to close out the browser. Can also manually kill the drivers it opens in the Task Manager periodically, if you don't want to enable it. I typically, do this at the start of a working session with Katalon. 
* Video playback of failed videos, can give you error on trying to play those videos. Installing K-Lite Codec fixes the problem. Its free, only need the basic edition, [https://www.codecguide.com/download\_kl.htm](https://www.codecguide.com/download_kl.htm)

**Issues with running tests in this particular project:**

Find any other weird issues, let me know, or add to this list.

