rem C:\Working\412-lab2-1-burnsmt\ist412\studentprogramtester
rem javac -d  C:\Working\412-lab2-1-burnsmt\ist412\studentprogramtester\bin\studentprogramtester *.java
rem  -cp ".;StudentProgramTester.jar"
rem javac  -d C:\Working\test-review1-team5 DataObjectJUnitTest.java
rem java org.junit.runner.JUnitCore DataObjectJUnitTest
rem now test utility class
rem java org.junit.runner.JUnitCore UtilityJUnitTest

javac -d C:\Working\ist412\StudentProgramTester\StudentProgramTesterJUnitTests\src *.java
javac -d C:\Working\ist412\StudentProgramTester\StudentProgramTesterJUnitTests\src UtilityJUnitTest.java

echo testing Configuration items
java org.junit.runner.JUnitCore ConfigurationItemsTest

echo testing DataObject
java org.junit.runner.JUnitCore DataObjectJUnitTest



Echo testing utility class
java org.junit.runner.JUnitCore UtilityJUnitTest