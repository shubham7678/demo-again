package Shapes3;

import java.util.Scanner;

public class Star8Pattern2 {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Please Enter 8 Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing 8 Pattern of Stars");
        int i = 1;
        while (i <= rows * 2 - 1) {
            if (i == 1 || i == rows || i == rows * 2 - 1) {
                int j = 1;
                while (j <= rows) {
                    if (j == 1 || j == rows) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                    j++;
                }
            } else {
                int k = 1;
                while (k <= rows) {
                    if (k == 1 || k == rows) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
