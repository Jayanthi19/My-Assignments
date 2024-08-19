package week1.day3;

public class ChangeOddIndexToUpercase {

	public static void main(String[] args) {
		// Declare the input string
		String test = "changeme";
		 // Convert the string to a character array
		char[] charArray = test.toCharArray();
		// Iterate through the character array from end to start
	 for (int  i = charArray.length-1; i>=0; i--) {
		 // Check if the index is odd
			 if (i%2!=0) {
			
				// Convert the character at odd index to uppercase
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }

	        // Convert the character array back to a string
	        String result = new String(charArray);

	        // Print the result
	        System.out.println(result);
	    }
	}