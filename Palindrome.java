import java.util.Scanner;

public class Palindrome {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any spaces and convert the string to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Initialize two pointers, one at the start and one at the end of the string
        int left = 0;
        int right = str.length() - 1;
        
        // Check characters from both ends of the string
        while (left < right) {
            // If characters at the left and right pointers don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move towards the middle
            left++;
            right--;
        }
        
        // If all characters match, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Check if the string is a palindrome and display the result
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
