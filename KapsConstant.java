import java.util.Arrays;
import java.util.Scanner;

public class KapsConstant {

    // Method to perform the Kaprekar's process
    public static int kaprekarStep(int number) {
        // Convert number to a zero-padded string (e.g., 32 -> 0032)
        String numStr = String.format("%04d", number);

        // Sort digits in descending order
        char[] digitsDesc = numStr.toCharArray();
        Arrays.sort(digitsDesc);
        String descStr = new StringBuilder(new String(digitsDesc)).reverse().toString();
        int numDesc = Integer.parseInt(descStr);

        // Sort digits in ascending order
        String ascStr = new String(digitsDesc);
        int numAsc = Integer.parseInt(ascStr);

        // Return the difference
        return numDesc - numAsc;
    }

    // Method to calculate Kaprekar's constant
    public static int kaprekarConstant(int number) {
        int count = 0;

        // Continue the process until we reach 6174
        while (number != 6174) {
            number = kaprekarStep(number);
            count++;
            System.out.println("Step " + count + ": " + number);

            // If number becomes 0, it means it doesn't meet the criteria
            if (number == 0) {
                System.out.println("The process is invalid with the current input!");
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number with at least two distinct digits: ");
        int number = scanner.nextInt();
        scanner.close();

        // Validate input
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid four-digit number.");
            return;
        }

        System.out.println("Starting Kaprekar's process:");
        int steps = kaprekarConstant(number);
        if (steps > 0) {
            System.out.println("Reached 6174 in " + steps + " steps.");
        }
    }
}
