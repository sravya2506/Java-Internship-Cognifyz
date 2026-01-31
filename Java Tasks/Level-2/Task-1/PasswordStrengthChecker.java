import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        int length = password.length();
        int count = 0;

        if (hasUpper) count++;
        if (hasLower) count++;
        if (hasDigit) count++;
        if (hasSpecial) count++;

        // Determine strength
        if (length >= 8 && count == 4) {
            System.out.println("Password Strength: STRONG ✅");
        } else if (length >= 6 && count >= 2) {
            System.out.println("Password Strength: MEDIUM ⚠️");
        } else {
            System.out.println("Password Strength: WEAK ❌");
        }

        sc.close();
    }
}
