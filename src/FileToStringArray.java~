import java.util.Scanner;
import java.io.*;

/**
 * Creates blueprint for an object that can turn a text file into an array of strings.
 */
public class FileToStringArray {

    /**
     * Turns an inputted file into an array of strings. 
     *
     * @param file the text file to be turned into an array of strings
     * @return the array of strings that file turned into, unless it is an invalid file, 
     * in which it returns null.
     */
    public String[] fileToStringArray(File file) {
	String[] strArray = new String[getNumStringsInFile(file)];

	try {	    
	    Scanner scanner = new Scanner(file);
	    for (int i = 0; i < strArray.length; i++) {
		strArray[i] = scanner.next();
	    } // for
	} catch (FileNotFoundException fnfe) {
	    System.out.println("ERROR: File Not Found!");
	    System.exit(1);
	} // try/catch
	
	return strArray;
    } // fileToStringArray

    /**
     * Checks how many strings are in an input file (Strings are sperated solely by spaces and new line chars).
     * Method is private because it is only to be called by the fileToStringArray(File file) method. 
     *
     * @param file the file to count the number of strings from
     * @return the num of strings in the file
     */
    private int getNumStringsInFile(File file) {
	int numStringsInFile = 0;

	try {
	    Scanner scanner = new Scanner(file);
	    while (scanner.hasNext()) {
		numStringsInFile++;
		scanner.next();
	    } // while
	} catch (FileNotFoundException fnfe) {
	    System.out.println("ERROR: File Not Found!");
	    System.exit(1);
	} // catch

	return numStringsInFile;
    } // getNumStringsInFile
    
} // FileToStringArray
