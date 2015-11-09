/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogramtester.controler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//  Dumb change to check how github works
import java.awt.Color;
//import java.io.*;
//import java.util.*;
//import javax.swing.JButton;

import studentprogramtester.App;

public class BatchTester {
	// int studentArrayNumber;
	// DataObject dataObject;
	public BatchTester() {

		String className = "242-1\\";
		// String configFileName = studentprogramtester.App.data.pathToFile +
		// "students.txt";
		// dataObject = new DataObject();
		// dataObject = studentprogramtester.App.roster[0];
		// setObjectVariables(dataObject);

		//try {
			// config file has list of ordinal student number,
			// student name, and random handle
			// File configFile = new File(configFileName);
			// Scanner in = new Scanner(configFile);
			// int runNumber = 0;

			// while(in.hasNextLine())
			// {

			// dataObject = studentprogramtester.App.roster[runNumber];
			// dataObject.setObjectVariables(); // should this method be in data
			// object?

			// String line = in.nextLine();

			// Scanner inLine = new Scanner(line);
			// debug code - print out scanned config info
			// System.out.print("scanned config info: ");
			// while(inLine.hasNext())
			// {
			// dataObject.numbr = inLine.nextInt();
			// dataObject.nme = inLine.next();
			// dataObject.hndl = inLine.next();
			// }

			int runNumber = 0;
			for (DataObject r : App.roster) {
				// set paths and file names:
				System.out.println(
						" we are setting the classpath at BatchTester.java line 62. this should probably be moved");
				r.setClsPath(r.pathToFile + "bin\\" + className + r.nme);
				r.setStdPath(r.srcPath + "\\" + r.nme);
                                
				//r.setInputFileStub(r.stdPath + "\\input");
				r.setOutFileName(r.stdPath + "\\output-" + r.nme + ".txt");
				/*
				 * make sure set correctly System.out.println("classPath: " +
				 * classPath); System.out.println("studentPath: " +
				 * studentPath); System.out.println("inputFileStub: " +
				 * inputFileStub); System.out.println("outputFileName: " +
				 * outputFileName);
				 */

				System.out.println("UPDATED BATCH TESTER\nrun #: " + runNumber + " ;\n studentNumber: " + r.numbr
						+ ";\nName: " + r.nme + "; \nHandle: " + r.hndl);
				System.out.println(
						"UBT Output goes to: " + r.outFileName + r.showDataObject() + "\nEND UPDATED BATCH TESTER\n\n");

				// run javac compiler - returns 0 on success
				// Compiler Constructor:
				// public Compiler(int numbr, String nme, String hndl, String
				// pth, String clsPath,
				// String srcPath, String stdPath, String outFileName)

				Compiler c = new Compiler(r);
				int success = c.compileJava(r);

				//studentArrayNumber = runNumber - 1;
				//if (studentArrayNumber < 0) {
				//	studentArrayNumber = 0;
				//}
				// Print whether or not compile successful

				// if(success == 0) wrong way to test, only shows state of last
				// test in array, i left it in here for teaching purposes

				if (r.allTestsPass())

				{
					System.out.println("Compiled Successfully");
					studentprogramtester.App.runCon.studentButtonArray[runNumber].setBackground(Color.green); // need
																														// to
																														// fix
																														// for
																														// student
					studentprogramtester.App.runCon.studentButtonArray[runNumber].repaint();
					// studentprogramtester.App.runCon.updateLabels(studentprogramtester.App.data,
					// RunConfig.this);
				} else {
					System.out.println(
							"BatchTester.java (line 106) test for compile FAIL  Compile Exception, \nsuccess = "
									+ success);
					studentprogramtester.App.runCon.studentButtonArray[runNumber].setBackground(Color.red);
					studentprogramtester.App.runCon.studentButtonArray[runNumber].repaint();
					// studentprogramtester.App.runCon.updateLabels(studentprogramtester.App.data);
				}

				// Run the test cases
				// TestRunner consructor:
				// public TestRunner(int numbr, String nme, String hndl, String
				// pth, String clsPath,
				// String srcPath, String stdPath, String tstDataPath, String
				// argFileName,
				// String tstInputFileName, String inputFileStub, String
				// outFileName)
				TestRunner rnr = new TestRunner(r);
				rnr.runJava();
				// runNumber++;
				System.out.println("batchtester.java line 136 runNumber: " + runNumber);
				runNumber++;
			}
		//} catch (IOException ioe) {
		//	System.out.println("main IOException");
		//}

		// studentprogramtester.App.roster[studentArrayNumber] = dataObject;

	} // end constructor

}// end
