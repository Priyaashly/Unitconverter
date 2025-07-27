import java.util.Scanner;

public class Unitconverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Temperature (Celsius <-> Fahrenheit)");
            System.out.println("2. Length (Meter <-> Kilometer)");
            System.out.println("3. Weight (Kilogram <-> Gram)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    temperatureConverter(sc);
                    break;
                case 2:
                    lengthConverter(sc);
                    break;
                case 3:
                    weightConverter(sc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }

    public static void temperatureConverter(Scanner sc) {
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (1) Fahrenheit or (2) Celsius? ");
        int option = sc.nextInt();
        if (option == 1)
            System.out.println("Result: " + ((temp * 9 / 5) + 32) + " °F");
        else if (option == 2)
            System.out.println("Result: " + ((temp - 32) * 5 / 9) + " °C");
        else
            System.out.println("Invalid option.");
    }

    public static void lengthConverter(Scanner sc) {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Convert to (1) Kilometer or (2) Meter? ");
        int option = sc.nextInt();
        if (option == 1)
            System.out.println("Result: " + (length / 1000) + " km");
        else if (option == 2)
            System.out.println("Result: " + (length * 1000) + " m");
        else
            System.out.println("Invalid option.");
    }

    public static void weightConverter(Scanner sc) {
        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();
        System.out.print("Convert to (1) Gram or (2) Kilogram? ");
        int option = sc.nextInt();
        if (option == 1)
            System.out.println("Result: " + (weight * 1000) + " g");
        else if (option == 2)
            System.out.println("Result: " + (weight / 1000) + " kg");
        else
            System.out.println("Invalid option.");
    }
}
