import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating object//

        // the are two values input by the user//
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // calulate the difference between the two numbers//
        int diff = Math.abs(num1 - num2);

        // condition, if number is less than 200, end the program//
        if (diff < 200) {
            System.out.println("The difference between the numbers is less than 200. Exiting...");
            scanner.close();
            return;
        }
        // created three variables//
        int evenDivisibleBy4Sum = 0;
        int evenDivisibleBy8Sum = 0;
        int notEvenNotDivisibleBy5Sum = 0;
        // user input value, loop over values//
        for (int i = num1; i <= num2; i++) {
            // using switch case to check if number is divisible by 2//
            switch (i % 2) {
                // if i value = 0 then case run//
                case 0:
                    // if i is divisble by 4//
                    if (i % 4 == 0) {

                        evenDivisibleBy4Sum += i;
                    }
                    // if i is divisible by 8//
                    if (i % 8 == 0) {
                        evenDivisibleBy8Sum += i;
                    }
                    break; // break stops the case//

                default:
                    // if value is not even, then run//
                    if (i % 5 != 0) {
                        notEvenNotDivisibleBy5Sum += i;
                    }
                    break;
            }
        }
        // printing the value of the user input that is divisible by 4, 8 and not even
        // numbers not divisible by 5//
        System.out.println("Sum of even numbers divisible by 4: " + evenDivisibleBy4Sum);
        System.out.println("Sum of even numbers divisible by 8: " + evenDivisibleBy8Sum);
        System.out.println("Sum of not even numbers not divisible by 5: " + notEvenNotDivisibleBy5Sum);

        scanner.close();
    }
}