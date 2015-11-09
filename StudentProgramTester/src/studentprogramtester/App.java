/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester;


import studentprogramtester.controler.DataObject;
/**
 *
 * @author marcc_000
 */
public class App {
    
    
    public static DataObject data;  //this is how i get around the config.properties
    public static RunConfiguration runCon;  
    public static DataObject[] roster;
    public static String thisIsWhereYouPutTheMainFile  = Utility.getConfigItem("MainFile", "c:\\working\\target");  // this is where you put the "target" file
   // we need to automate this process, right now the user sets the system by telling it where the home folder lives 
  // it seems like we could just test for windows, and if it is, we just add a  "C:\\"
    /* 
        public String checkForWindows(){
            String extraCharacter = "";
                if (%PATH% returns "windows_NT"){
                extraCharacter = "C:\\";
                }
            return extraCharacter;
        }
    then String thisIsWhereYouPutTheMainFile  = checkForWindows() + "Users\\Mark\\Desktop\\target\\";
    */
    
    
    
    public static void main(String[] args)
    {
        
       buildApp();
       
    } // end main
    
    
    
    
    
    
    private static void buildApp(){
        
        makeClass();  // generate an array of data objects based on the # of students
        StudentProgramTester SPT = new StudentProgramTester();      // instantiate a new student program tester, it takes care of everything from there 
        SPT.setTitle("Program Tester");
    } // end build app

    
    
    public static void makeClass() {
        
           data = new DataObject();  // we will prob have to take this out, i'm using this as my config.properties file
            
           String[] rosterArr = Utility.getContentsOfFile(Utility.getConfigItem("StudentFilePath", "C:\\Working\\Target\\Students.txt")).split("\n");
           int classSize = 0;
           
           roster = new DataObject[rosterArr.length];

           
           for (String s : rosterArr)
           {
        	   String[] strLine = s.split("\t");
        	   if (strLine.length == 3)
        	   {
        		   roster[classSize] = new DataObject();
                           roster[classSize].setObjectVariables();
        		   roster[classSize].setNme(strLine[1]);
        		   roster[classSize].classArrayNumber = classSize;
        		   roster[classSize].setHndl(strLine[0]);
        		   classSize ++;
        	   }

           }
    } // end make class
    
}  // end
