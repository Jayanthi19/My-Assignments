package week1.day3;

public class RemoveDuplicatewords {
    public static void main(String[] args) {
        // Initialize the input string
        String text = "We learn Java basics as part of java sessions in java week1";

        // Split the text into an array of words
        String[] words = text.split(" ");

        // Initialize a result string for unique words
        String result = "";

        // Iterate through the words array
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            // Compare the current word with all previous words
            for (int j = 0; j < i; j++) {
                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the word is not a duplicate, add it to the result string
            if (!isDuplicate) {
                if (!result.isEmpty()) {
                    result += " "; // Add space between words
                }
                result += words[i];
            }
        }

        // Print the result
        System.out.println(result);
    }
}
