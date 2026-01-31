import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking temperature input
        System.out.print("Enter the temperature value: ");
        double temp = sc.nextDouble();

        // Taking unit input
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().charAt(0);

        // Conversion logic
        if (unit == 'C' || unit == 'c') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else if (unit == 'F' || unit == 'f') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);

        } else {
            System.out.println("Invalid unit! Please enter C or F only.");
        }

        sc.close();
    }
}
