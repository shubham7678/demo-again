public class Class {
    static void print12(int j) {
        if (j <= 0) {
            return;
        }
        System.out.print("*");
        print12(j - 1);

    }

    static void print31(int i, int j) {
        if (i <= 0) {
            return;
        }
        print31(i - 1, j - 1);
        System.out.println();
        print12(j);
    }

    public static void main(String[] args) {
            
            print31(5, 5);
            
          }    
}
