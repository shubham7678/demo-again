public class Rohmbus {
    public class Pattern5 {
        public static void main(String[] args) {
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < i * 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < 4; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
