package Lecture04;

public class Arrays {

    static boolean ArmstrongNumber(int n) {
        int ArmstrongNumber = 0;
       int N = n;
        while (n != 0){
            int r = n%10;
            ArmstrongNumber += (int) Math.pow(r, 3);
            n /=10;
        }
        return (ArmstrongNumber == N);
    }

    static int Reverse(int n){
        int reverse = 0;
        while ( n!=0){
            int r = n%10;
            reverse = reverse*10+r;
            n/=10;
        }
        System.out.println(reverse);
        return reverse;
    }

    static void DisplayArray (){
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static public void main(String[] args){
    //    System.out.println(ArmstrongNumber(9));
        // Reverse(27);
        // int[] arr = new int[5];
        // int[] nums={1,2,3};
        // arr=nums;
        // arr[-1] = -1;
        // System.out.println(arr[3]);
        DisplayArray();
    }
    
}
