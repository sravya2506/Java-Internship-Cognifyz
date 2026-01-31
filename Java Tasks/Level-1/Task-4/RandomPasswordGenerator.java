import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include numbers? (yes/no): ");
        String numbers = sc.next();

        System.out.print("Include lowercase letters? (yes/no): ");
        String lowercase = sc.next();

        System.out.print("Include uppercase letters? (yes/no): ");
        String uppercase = sc.next();

        System.out.print("Include special characters? (yes/no): ");
        String special = sc.next();

        String characters = "";

        if (numbers.equalsIgnoreCase("yes")) {
            characters += "0123456789";
        }
        if (lowercase.equalsIgnoreCase("yes")) {
            characters += "abcdefghijklmnopqrstuvwxyz";
        }
        if (uppercase.equalsIgnoreCase("yes")) {
            characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (special.equalsIgnoreCase("yes")) {
            characters += "!@#$%^&*()_+";
        }

        // Validation
        if (characters.isEmpty()) {
            System.out.println("Please select at least one character type!");
        } else {
            String password = "";

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                password += characters.charAt(index);
            }

            System.out.println("Generated Password: " + password);
        }

        sc.close();
    }
}
