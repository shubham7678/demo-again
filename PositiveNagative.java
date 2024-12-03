import java.util.*;

public class PositiveNagative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("number is positive");
        } else if (x < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
    }
}