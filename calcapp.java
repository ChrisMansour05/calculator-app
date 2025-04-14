import java.util.Scanner;

public class calcapp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ans = "yes";

        do {
            int input = -1;
            // Step 1: Operation selection
            while (true) {
                System.out.println("Hello, welcome to my calculator application.\n");
                System.out.println("Please select an operation you want to use:");
                System.out.println("Input 1 for addition (+)");
                System.out.println("Input 2 for subtraction (-)");
                System.out.println("Input 3 for multiplication (*)");
                System.out.println("Input 4 for division (/)");

                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (input >= 1 && input <= 4) {
                       break; // valid input, exit operation selection
                    } else {
                        System.out.println("\nError: Enter a valid input (1-4).\n");
                    }
                } else {
                    System.out.println("\nError: You need to enter an integer.\n");
                    scanner.next(); // clear invalid input
                }
            }
            
            scanner.nextLine();
            //Step 2: Input two integers
          System.out.print("Enter first integer: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("\nError: Please enter a valid integer.\n");
                scanner.nextLine();
                continue; // go back to main menu
            }
            Double num1 = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter second integer: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("\nError: Please enter a valid integer.\n");
                scanner.nextLine();
                continue; // go back to main menu
            }
            Double num2 = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            // Step 3: Perform calculation
            if (input == 1) {
                System.out.println("Answer: " + (num1 + num2));
            } else if (input == 2) {
                System.out.println("Answer: " + (num1 - num2));
            } else if (input == 3) {
                System.out.println("Answer: " + (num1 * num2));
            } else if (input == 4) {
                if (num2 == 0) {
                    System.out.println("\nError: Cannot divide by zero.\n");
                } else {
                    System.out.println("Answer: " + (num1 / num2));
                }
            }

            // Step 4: Ask to continue
            System.out.print("\nWould you like to perform another operation? (yes/no): ");
            ans = scanner.nextLine();

            // Step 4.5: Check if input is invalid for continue prompt
            while (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")) {
                System.out.println("Error: Please enter 'yes' or 'no'.");
                System.out.print("Would you like to perform another operation? (yes/no):\n ");
                ans = scanner.nextLine();
            }

        } while (ans.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the calculator. Goodbye!");
    }
}
