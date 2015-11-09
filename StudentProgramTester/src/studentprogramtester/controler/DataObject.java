/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester.controler;

import java.util.ArrayList;

import studentprogramtester.Utility;


/**
 *
 * @author mark
 */
public class DataObject {
    
  // this is where you set this to run on your local Machine. 
    // You just put the file path to where the 'java" file (Mudgett code) is.
     // it should work anywhere java folder is, i've only tested these two
    // default is set to installing java on the C: drive
    //String pathToFile = "C:\\";
    
  //This is a working example with the java folder in my Documents folder
 
  public String pathToFile = Utility.getConfigItem("MainFile", "C:\\target\\");
    
    
    
// the are the variables required for Compiler.java (taken from compiler.java constructor)   
int numbr;
public int classArrayNumber = 0;
public int totalNumberOfStudents = 7; 
String nme;
String hndl;
String pth; 
String clsPath;
String srcPath;
String stdPath;
String outFileName;  

ConfigurationItems CI;

int success;
int numberOfTests = 3;
public ArrayList <String> testFileNames;
public ArrayList <Integer> testFileResults;// = new String[3];
Boolean[] passTest;

  




public ConfigurationItems getCI()
{
	return this.CI;
}





  public DataObject(){ 
      
      initializeDataObject();
      
      
      
  } // end constructor 
  
  ////////////////////////////////////////////////////////////////////
  // this is in case you want to create a pre-existing data object (say from persistent storage)
    public DataObject(int numbr, String nme, String hndl, String pth, String clsPath, String srcPath, String stdPath, String outFileName){ 
  } // end constructor with variables
    
 private void initializeDataObject()
 {
 
     CI = new ConfigurationItems("Config.txt", "C:\\work\\", "args.txt", "input.txt", "C:\\work\\", "input.txt", "C;\\work\\java\\bin\\");
     // these can be pulled from a database later
            numbr = 0;
            nme = "";
            hndl = "";
            pth = "";
            clsPath = CI.getcompilePath();
            srcPath = "";
            stdPath = "";
            outFileName = "";  
            
            //compilePath =  "C:\\java\\src\\program-test-242-1\\src\\src-output\\mudgettdr";
            //success; // Douglas Adams test number, 42 then shows the default value. I've only seen 1 or 2, 
            
            
            testFileNames = new ArrayList<String>();  // this [array size] needs to be changed to the # of files in the student folder to be tested
            // initialize strings
            
            testFileResults = new ArrayList<Integer>();  // this [array size] needs to be changed to the # of files in the student folder to be tested
            // initialize strings
            
            
           // enterTestData();
           
            
           
            
            
 }  // end initializeDataObject()
   

 
 
// accessors and mutators:
 
 public int getNumbr(){
   return numbr;  
 }
 public void setNumbr(int n){
   numbr = n;  
 } 
 
 
 public String getNme(){
     return nme;
 }
 public void setNme(String n){
    nme = n; 
 } 
 
 
 public String getHndl(){
      return hndl;    
 }
 public void setHndl(String h){
     hndl = h;
 } 
 
 
 public String getPth(){
       return pth;   
 }
 public void setPth(String p){
     pth = p;
 } 
 
 
 public String getClsPath(){
      return clsPath;    
 }
 public void setClsPath(String c){
    clsPath = c; 
 } 
 
 
 public String getSrcPath(){
        return srcPath;  
 }
 public void setSrcPath(String s){
   srcPath = s;  
 } 
 
 
 public String getStdPath(){
          return stdPath;
 }
 public void setStdPath(String s){
    stdPath = s; 
 } 
 
 
 public String getOutFileName(){
     return outFileName;     
 }
 public void setOutFileName(String o){
     outFileName = o;
 } 
  
  public String getTestDataPath(){
     return Utility.getConfigItem("TestDataPath", "c:\\work\\");     
 }
 public void setTestDataPath(String o){
    // do nothing
} 

 public int getSuccess(){
     return success;     
 }
 public void setSuccess(int s){
     success = s;
 }   

  
 
 public String showDataObject(){
   
     String showData = "\nSHOW DATA OBJECT\nnumber:   " + numbr + " \nname:  " + nme + " \nhandle:   " +hndl
             + " \npath:   " +pth + " \nclasspath:   " +clsPath + " \nsource path:   " + srcPath 
             + " \nStudent Path:   " + stdPath + " \nout file name:   " + outFileName 
             + " \ntest data path:   " + CI.gettestDataPath() + " \nargs File name:   " + CI.getargsFileName()
             + " \ntest input file name:  " + CI.gettestInputFileName() + " \ninput file stub:   " + CI.getinputFileStub() + 
             " \ninput file name:   " + CI.getinputFileName() + " \ntest array:   " 
             + showTestArray() + "\ncompile Path: " +CI.getcompilePath()+"\nEND DATA OBJECT\n"; 
     
     
     
     return showData;
     
 } // end show data object
 
 
 public void setObjectVariables(){
    
    //  initialize student and class configuration data
    //setNumbr(0);
    //setNme("blank");
    //setHndl("000000");
    

    
    //setPth(pathToFile + "jdk1.7.0_71\\bin");
//  set fixed paths and file names:
    //setSrcPath(pathToFile + "src-output");
    //setTestDataPath(pathToFile);
    //setArgsFileName(getTestDataPath() +  "args.txt");
   
    //setTestInputFileName( pathToFile + "testinput.txt");

    
    
}// end set object variables
 
 
 public String showTestArray(){
     
     String arrayString = "";//testFileNames.get(0) +", "+ testFileNames.get(1)+", "+ testFileNames.get(2);
     
     for(int i = 0; i < testFileResults.size(); i++){
         arrayString = arrayString + testFileResults.get(i) +", ";
     }
     
     
     
     return arrayString;
 }  // end show test array
 
 
 public Boolean allTestsPass(){
     
     Boolean answer = true;
     int total = 0;
     
     for(int i = 0; i < testFileResults.size(); i++){
         total = total + testFileResults.get(i);
     }
     if(total > 0){
        answer = false; 
     }
     return answer;
 }  // end all tests pass
 
 
 

 
 public void emptyTestArrayLists(){
     
    testFileNames.clear();
    testFileResults.clear();
     
     
 }
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
}  // end
