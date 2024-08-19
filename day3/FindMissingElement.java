package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	// Declare and initialize the array
      int[] input = {1,4,3,2,8,6,7};
   // Sort the array
      Arrays.sort(input);
      // Iterate through the array to find the missing number
      for (int i = 0; i < input.length; i++) {
    	  // Check if the current element is not equal to the expected value
    	  if (input[i] != i + 1) {
              // Print the missing number and break the loop
              System.out.println("Missing Number: " + (i + 1));
              break;
    	  }
    	  
	}
      
      }

	}



