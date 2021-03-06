import java.io.*;
import java.lang.System;
import java.util.Scanner;


/**
 * Tests the Binary Search Class using an input file and a given input string
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
	//Ensures there are 2 arguments
	if (args.length != 2) {
	    System.out.println("Error: Args Length = " + args.length);
	    System.exit(1);
	} // if

	//Ensures Arg 1 is a file
	File file;
	file = new File(args[0]);

	//Gets the file text as a string array
     	FileToStringArray ftsa = new FileToStringArray();
	String[] fileText = ftsa.fileToStringArray(file);

	//Another file containing a list of inputs is the second arg
	File file2;
	file2 = new File(args[1]);
	FileToStringArray ftsa2 = new FileToStringArray();
	String[] fileText2 = ftsa2.fileToStringArray(file2);

	//Creates  a binary search object then calls the method to search a string array
	//This will return a valid string
	BinarySearch bsObject = new BinarySearch();
	for (int i = 0; i < fileText2.length; i++) {	    
	    String validString = bsObject.getValidStringFromInput(fileText, fileText2[i]);
	    System.out.println("Valid String: " + validString);
	} // for

	/**
	BruteForceSearch bfs = new BruteForceSearch();
	String validStringBrute = bfs.getValidStringFromInput(fileText, input);

	//Prints the valid string as sys output 
	System.out.println("Brute Valid String: " + validStringBrute);
	*/
    } // main
    
} // Tester
