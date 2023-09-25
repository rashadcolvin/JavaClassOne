import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int diff = Math.abs(num1 - num2);

        if (diff < 200) {
            System.out.println("The difference between the numbers is less than 200. Exiting...");
            scanner.close();
            return;
        }

        int evenDivisibleBy4Sum = 0;
        int evenDivisibleBy8Sum = 0;
        int notEvenNotDivisibleBy5Sum = 0;

        for (int i = num1; i <= num2; i++) {
            switch (i % 2) {
                case 0:
                    if (i % 4 == 0) {
                        evenDivisibleBy4Sum += i;
                    }
                    if (i % 8 == 0) {
                        evenDivisibleBy8Sum += i;
                    }
                    break;
                default:
                    if (i % 5 != 0) {
                        notEvenNotDivisibleBy5Sum += i;
                    }
                    break;
            }
        }

        System.out.println("Sum of even numbers divisible by 4: " + evenDivisibleBy4Sum);
        System.out.println("Sum of even numbers divisible by 8: " + evenDivisibleBy8Sum);
        System.out.println("Sum of not even numbers not divisible by 5: " + notEvenNotDivisibleBy5Sum);

        scanner.close();
    }
}