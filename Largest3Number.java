import java.util.*;

public class Largest3Number {
    public static void main(String[] args) {
        int A = 7, B = 9, C = 12;

        if ((A >= B) && (A >= C)) {
            System.out.println("largest is A");
        } else if (B >= C) {
            System.out.println("largest is B");
        } else {
            System.out.println("largest is C");
        }

    }

}
