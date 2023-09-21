import java.util.Scanner;

class LoopExample {
    public static void main(String[] args) {
        // Question 1: Display a string 99 times
        for (int i = 0; i < 99; i++) {
            System.out.print("Hello ");
        }
        System.out.println(); // Move to the next line

        // Question 2: Display every odd number from 0 to 99
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Question 3: Display every even number 0 to 99
        for (int i = 0; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Question 4: Display every even number using a different approach
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line

        // Question 5: Sum up the odd numbers 0 to 99
        int oddSum = 0;
        for (int i = 1; i <= 99; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of odd numbers: " + oddSum);

        // Question 6: Sum up the even numbers 0 to 99
        int evenSum = 0;
        for (int i = 0; i <= 99; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers: " + evenSum);

        // Question 7: Sum of two numbers given by the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}