---
description: >-
  I have setup User specific Profiles, one for each environment. To Allow
  pre-created tests by others to be run with a user's specific test data for
  example, Test Company, Test Users, etc.
---

# Profiles

ℹ Note:  The default profile is looked at when a specified Global Variable is not available in the currently set Profile. For example, if I have used a Global Variable in a testcase called SuperUserUsername, and I have my profile set as Monica\_TIN, which does not have this username in it, it will use the value specified in the Default profile. This is done intentionally for variables that don't change values between environments.

| Profile Name | Description |
| :--- | :--- |
| default | This where values you set for items that do not change between environments |
| {Username}\_TIN | This is for values that are only available in the TIN environment |
| {Username}\_BRONZE | This is for values that are only available in the BRONZE environment |
| {Username}\_DRPROD | This is for values that are only available in the DR\_PROD environment |
| TIN | Template for new user profiles for TIN |
| BRONZE | Template for new user profiles for BRONZE |
| DRPROD | Template for new user profiles for DRPROD |



{% hint style="info" %}
Notes: the profiles that are simply TIN, or BRONZE, are the base master templates for creating new User Profiles. These are copied and then renamed in the format of {Username}\_{Environment}
{% endhint %}

