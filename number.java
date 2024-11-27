
//check for armstrong numer
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        // Scanner object Create
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println(number + "is an Armstrong number");
        } else {
            System.out.println(number + "is not an Armstrong number");
        }

        scanner.close();
    }
    // check a number is an Armstrong number

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;

        }
        return sum == originalNumber;
    }

}
