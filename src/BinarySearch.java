/**
 * Implements a Binary Search on a sorted array.
 *
 */
public class BinarySearch {

    /**
     * Returns a string from a string array of arguments that when truncated to the size of input, 
     * is equivalent to input. 
     *
     * @param args the string array argument to search
     * @param input the input to compare each input argument to
     * @return the string that when truncated, is equivalent to input
     */
    public String getValidStringFromInput(String[] args, String input) {
	int i = args.length / 2;
	int argsLeft = args.length - 1;

	for (int j = 0; j < args.length; j++) {
	    //System.out.println(args[j]);
	} // for
	System.out.println("Input String: " + input);

	while (argsLeft > 0) {
	    argsLeft /= 2;

	    args[i] = ensureStringIsLargeEnough(args[i], input.length()); // now args[i] will be atleast as long as input

	    //Checks if argument contains the input
	    //Contains means that the substring of the argument evaluated from 0 to the (input.length() - 1) index of the argument is equal to input
	    //If the contains the input then this method returns the argument 
	    if (args[i].substring(0, input.length()).equalsIgnoreCase(input)) {
		return args[i];
	    } // if

	    //From this point, the given argument did not contain the input, so we check if the input is greater than or less than our argument
	    //We do this to know which side of the sorted array we should be checking using binary search, essentially trying to cut the problem in half
	    if (args[i].substring(0, input.length()).compareToIgnoreCase(input) > 0) {		
		i -= (argsLeft + 2) / 2;
	    } else {
		i += (argsLeft + 1) / 2;
	    } //if/else
	    
	} // while

	return null;
	
    } //getValidStringFromInput

    /**
     * Concatenates string arg with "A"s until it is the length of input. 
     *
     * @param arg the argument to concatenate
     * @param length the length to concatenate this string to
     */
    private String ensureStringIsLargeEnough(String arg, int length) {
	for (int i = 0; i < length - arg.length(); i = i) {
	    arg = arg.concat("A");
	}

	return arg;
    } // ensureStringIsLargeEnough
   
} // Binary Search

