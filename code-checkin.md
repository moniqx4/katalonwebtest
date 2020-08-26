---
description: >-
  Katalon works with any GIT enabled code repository. The GIT implementation is
  pretty basis and can be cumbersome to work with. Highly recommend using
  external program like SourceTree, or GitKraken.
---

# Code Checkin

## Enabling GIT

Step 1: First, enable Git, Window &gt; Katalon Studio Preferences &gt; Git then check box to enable Git

Step 2: Under Window &gt; Katalon Studio Preferences &gt; Team &gt; Git, set to your personal settings and configuration for the repo.

Step 3: Once that is working, then clicking the arrow next to Github red icon, select Manage Branches &gt; New Branches

Step 4: Once your new branch is made your ready to make changes and check them into repo.

Step 5: When ready to add to the repo, if you click in the git window, and right click, be sure and do select all \(CTRL A\) so all the files are picked up, then do Add to Index.

ℹ _Note: When you are staging your un-staged changes in the Git Staging window in Katalon, you must select all the files first. To do this right click on that window, do a CTRL A, to select all the files there first. Then select Add to Index. Not readily clear on how to select them all there, but you don't have to do them one at a time either.\*_

{% hint style="info" %}
 **WEIRDNESS ALERT:**  I have found if say I moved the repository to another machine, and I launch Katalon thinking it would pick up my previous GIT settings and I could adjust as needed, has not worked for me. In this situation I have found the git options unavailable, and even if I goto the Katalon Preferences and attempt to setup there it still doesn't work. To get around this, its best to do a CLONE of the project to the machine being moved to, and that works best with an external source program like SourceTree or GitKraken or command line, or whatever you prefer. Then when you open project in Katalon, you'll be able to use the Git commands.
{% endhint %}



