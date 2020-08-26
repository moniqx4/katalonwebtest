---
description: >-
  Mobile testing in Katalon is easy, but can be a slow process if using Gigafox.
  Faster using local real devices, or emulator, but thats where the setup can be
  a bit of a task.
---

# Mobile Setup

## To test using Gigafox

### What you need are your GigaFox credentials.

In Katalon, under the Project menu option, then open the Desired Capabilities dropdown and then select Remote option there. Here you'll set the following: 

Remote server URL: [http://il-mobilelabs-01.paylocity.com/Appium](http://il-mobilelabs-01.paylocity.com/Appium)

Remote server Type: Select Appium

Appium Driver:  select the one for the Device you will be testing with Andriod or IOS

Click Add button, and add the following items, and their corresponding values. Name, Type = String, then the actual Value: 

* gigafox:username - the value for this is your email
* \*\*gigafox:apiKey
* gigafox:androidAppId - guid for the device app version, if you were on iOS, this would be iosAppId
* gigafox:deviceName - for example Arcee
* platformName - for example Android
* platformVersion - for example, 9
* gigafox:device  - looks like a guid, particular to the device you will be using 
* gigafox:application - guid for the application

{% hint style="info" %}
If unsure of these values for you, login to Gigafox, and in the details for the device you want to use for testing, it has all this information. Your Login Profile, to get your \*\*API info.
{% endhint %}

Click Apply when this is set.









## To test using a mobile device locally/Emulator

Running on your real device is the fastest way to run testing. However its a bit of work to get your system setup properly with the correct SDKs, and also need Appium Server working. Since this is not really part of Katalon, not going to go in detail to that portion. Instead, I refer you to the documentation in Confluence for setting up Mobile. Once you have that, then you can do the steps below: 

For Paylocity you will need to have your phone setup to work through the VPN.

### Configuration

Once that's all done and working, your Mobile test can be run using the Android option \( or iOS if you happen to be on a Mac\) from the Run Test dropdown \(the one you normally use for selecting your Browser type\).  

You'll also need to get the Paylocity build you want to test installed on your local phone as well before you start.

Then its just a matter of running your mobile test, you'll see a emulator window appear in Katalon and everything happening on your phone will appear here as well as on your local phone as well. If just using emulator then only will see it on the emulator.







