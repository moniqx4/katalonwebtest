---
description: >-
  Profiles, the ability to setup different setting for different environments or
  configurations for testing.
---

# Profiles

Profiles are basically a way of switching between environments and allow a user to set specific global variables based on that environment. Allowing for the same test to work on different environments, assuming the only difference between the environments is data. Global Variables, for example could be the url to get to the environment the test is being run on and stored as a BaseUrl. Referencing testcases, if the BaseUrl is referenced when the profile is switched, the test would be executed on that particular profile's BaseUrl environment's location.

_Note: The default profile is required and can not be deleted, nor renamed. However, you can change another profile to be the default profile, by simply viewing the Script View of that profile, and changing the true to true._

