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
	String[] fileText = getFileAsText(file);

	//A String input is the second arg
	String input = args[1];
       

	//Creates  a binary search object then calls the method to search a string array
	//This will return a valid string
	BinarySearch bsObject = new BinarySearch();
	String validString = bsObject.getValidStringFromInput(fileText, input);

	//Prints the valid string as sys output 
	System.out.println("Valid String: " + validString);
    } // main

    /**
     * Returns the text of a file as a string array 
     */
    private static String[] getFileAsText(File file) throws FileNotFoundException {
	int stringCount = getFileStringCount(file);
	String[] returnArray = new String[stringCount];
	Scanner scanner = new Scanner(new FileInputStream(file));

	for (int i = 0; i < returnArray.length; i++) {
	    returnArray[i] = scanner.next();
	} // for
	
	return returnArray;
    } // getFileAsText

    /**
     *
     */
    private static int getFileStringCount(File file) throws FileNotFoundException {
	int count = 0;
	Scanner scanner = new Scanner(new FileInputStream(file));

	while (scanner.hasNext()) {
	    scanner.next();
	    count++;
	} // while

	return count;
    } // getFileStringCount
    
} // Tester
