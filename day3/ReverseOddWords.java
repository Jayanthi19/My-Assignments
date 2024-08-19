package week1.day3;

public class ReverseOddWords {



	    public static void main(String[] args) {
	        // Input string
	        String test = "I am a software tester";
	        
	        // Split the string into words
	        String[] words = test.split(" ");
	        
	        // Initialize an empty result string
	        String result = "";
	        
	        // Traverse the array of words
	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 != 0) {
	                // Reverse the word at odd index and append it to result
	                for (int j = words[i].length() - 1; j >= 0; j--) {
	                    result += words[i].charAt(j);
	                }
	            } else {
	                // Append the word at even index to result
	                result += words[i];
	            }
	            // Add a space after each word
	            result += " ";
	        }
	        
	        // Print the result, trim to remove the trailing space
	        System.out.println(result.trim());
	    }
	}

	

