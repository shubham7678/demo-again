public class SquarePattern {
    for(
    int i = 0;i<5;i++)
    { 
        for(int j=0;j<5;j++) 
        {
            System.out.print("*");
        }
        System.out.println()

    }

    }

    public static void main

    butterfly(int n) {
        //1st half 
        for(int i=1; i<=n; i++) {
            //stars - i 
            for(int j=1; j<i; j++) {
                System.out.println("*");
            }
        
            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-1); j++) {
                System.out.println(" ");
            }
        
            //stars - i
            for(int j=; j<=i; j++) {
                System.out.println("*");
            }    
        } 

        //2nd Half 
        for(int i=n; i>=1; i--) {
            //stars - i 
            for(int j=1; j<i; j++) {
                System.out.println("*");
            }
        
            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-1); j++) {
                System.out.println(" ");
            }
        
            //stars - i
            for(int j=; j<=i; j++) {
                System.out.println("*");
            }    
        } 
    }
}
