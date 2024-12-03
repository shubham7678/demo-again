import java.util.*;

public class WhileLoopPrintNumberFrom1ton {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int range = Sc.nextInt();
        int counter = 0;

        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();

    }
}
