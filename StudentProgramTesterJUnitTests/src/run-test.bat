rem C:\Working\412-lab2-1-burnsmt\ist412\studentprogramtester
rem javac -d  C:\Working\412-lab2-1-burnsmt\ist412\studentprogramtester\bin\studentprogramtester *.java
rem  -cp ".;StudentProgramTester.jar"
rem javac  -d C:\Working\test-review1-team5 DataObjectJUnitTest.java
rem java org.junit.runner.JUnitCore DataObjectJUnitTest
rem now test utility class
rem java org.junit.runner.JUnitCore UtilityJUnitTest

javac -d \\up.ist.local\Users\mtb137\Documents\NetBeansProjects\spt\StudentProgramTester\StudentProgramTesterJUnitTests\src *.java
javac -d \\up.ist.local\Users\mtb137\Documents\NetBeansProjects\spt\StudentProgramTester\StudentProgramTesterJUnitTests\src UtilityJUnitTest.java
echo on
echo ***********************************
Echo starting test
echo ***********************************

echo testing Configuration items
java org.junit.runner.JUnitCore ConfigurationItemsTest

echo testing DataObject
java org.junit.runner.JUnitCore DataObjectJUnitTest

Echo testing utility class
java org.junit.runner.JUnitCore UtilityJUnitTest

Echo Testing Smart Button
java org.junit.runner.JUnitCore SmartButtonTest