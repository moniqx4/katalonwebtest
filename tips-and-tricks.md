# Tips and Tricks

* Psuedo Code in the script view of TestCase to write out the needed steps, then drag the teststeps in for each one. If a teststep does not apply then create those steps. 
* Best to write all variables as Local in the test case, but then in the Variables tab, create these local variables and from their link to any that are Global Variables, or their data source. This makes it much easier if you need to change a data source of a variable later for testing purposes or just in general because you won't need to go through the actual test script to change it. 
* Variables can be more easily moved around or even added in groups using the Variables \(Script Mode\). Its basically an XML file, and each variable is wrapped between each variable node. Just be sure you don't screw up the formatting there, you will get errors it can't save, and if you try and run anything you'll see errors. 
* Variables can be more easily moved around or even added in groups using the Variables \(Script Mode\). Its basically an XML file, and each variable is wrapped between each variable node. Just be sure you don't screw up the formatting there, you will get errors it can't save, and if you try and run anything you'll see errors. 
* Using the Show References. If you need are potentially writing a script to replace another, the Show References is your friend to make sure you don't delete something another testcase needs, or to be sure the new script gets replaced anywhere its being used. Right clicking on the testcase/testobject etc, will pretty quickly display all the places an item is being used in the project.









