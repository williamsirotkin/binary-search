public class BruteForceSearch {
    public String getValidStringFromInput(String[] args, String input) {
	for (int i = 0; i < args.length; i++) {
	    if (args[i].length() < input.length()) {
		continue;
	    } else {
		if (args[i].substring(0, input.length()).equalsIgnoreCase(input)) {
		    return args[i];
		} // if
	    } // if/else
	} // for

	return null;
    } // getValidStringFromInput
} // BruteForceSearch 
