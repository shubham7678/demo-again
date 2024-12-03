import java.util.Scanner;

public class Power1 {
   public static void main(String[] args) {
      int my_power, my_input, result;
      my_input = 2;
      my_power = 5;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      System.out.print("Enter the power value : ");
      my_power = my_scanner.nextInt();
      result = getPower(my_input, my_power);
      System.out.println("The result of " + my_input + "^" + my_power + " is " + result);
   }

   public static int getPower(int my_input, int my_power) {
      if (my_power != 0) {
         return (my_input * getPower(my_input, my_power - 1));
      }
      else {
         return1;
      }
   }
}
