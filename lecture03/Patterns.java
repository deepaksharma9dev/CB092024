package lecture03;
public class Patterns {
    static void printSquare(int N){
        for ( int i = 0; i< N; i++ ) {
            for ( int j = 0; j< N; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printRFT(int n){

    }

    static void printLFT(int n){
        for ( int i = 1;i<=n; i++ ) {
            for (int j = 1; j<=n; j++){
                if( j <= n-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void printInvertedRFT(int n){
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printInvertedLFT(int n){
        for ( int i = n;i<=1; i-- ) {
            for (int j = 1; j<=n; j++){
                if( j <= n-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void printStrangePattern (int n){
        for (int i = 1; i<=n; i++){

        }

    }

    static void printSpacedSquare(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1;j<=n ; j++){
               if ( i == 1){
                System.out.println("*");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // int N = 4;
        
        // System.out.println("-------------------");

        // int n = 4;
        // for ( int i = 0; i<=n; i++ ) {
        //     for ( int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // printLFT(4);
        // printInvertedRFT(4);
        // printInvertedLFT(4);
        printSpacedSquare(5);

    }
}
