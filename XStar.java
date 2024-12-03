import java.util.Scanner;

public class XStar {
    public static void main(String[] args) {
        int i, j, k, my_input;
        System.out.println("Required packages have been imported");
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("A reader object has been defined ");
        System.out.print("Enter the number : ");
        my_input = my_scanner.nextInt();
        System.out.print("The X star pattern : ");
        k = my_input * 2 - 1;
        for (i = 1; i <= k; i++) {
            for (j = 1; j <= k; j++) {
                if (j == i || j == k - i + 1)
                    System.out.print("X");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
