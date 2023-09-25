import java.util.Scanner;

public class CreativeLab {
    public static void main(String[] args) {
        // initalization of an object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anything I can write\n");
        System.out.print("Please write a number and I can double it: ");
        if (scanner.hasNext()) {

            String userInput = scanner.next();
            try {
                double inputValue = Double.parseDouble(userInput);
                System.out.println("You entered: " + inputValue);
                double result = inputValue * 2;
                System.out.println("\nResult after doubling: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }

        } else {
            System.out.println("No input provided.");
        }
        scanner.close();
    }
}