import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Reverse the string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome ");
        }

        sc.close();
    }
}
