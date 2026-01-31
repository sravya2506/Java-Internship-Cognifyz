import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptionDecryption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose option (encrypt/decrypt): ");
        String choice = sc.nextLine();

        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        int shift = 3;
        if (choice.equalsIgnoreCase("decrypt")) {
            shift = -3;
        }

        try {
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                char newChar = (char) (ch + shift);
                fw.write(newChar);
            }

            fr.close();
            fw.close();

            System.out.println("File processed successfully ");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
