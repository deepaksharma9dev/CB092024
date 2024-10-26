package Lecture08;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,3,4,1,2};
        // NGER(arr);
        // NGEL(arr);
        NSER(arr);
    }

    static int[] NGER(int[] arr) {
        int [] temp = new int[arr.length];
        int max = 0;
        for ( int i = arr.length -1; i>=0; i--){
            temp[i]  = max;
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(temp[i] + " ");
        }
        return temp;
    }
    static int [] NGEL (int [] arr) {
        int [] temp = new int[ arr.length ];
        int max = 0;
        for ( int i = 0; i<arr.length; i++){
            temp[i]  = max;
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(temp[i] + " ");
        }
        return temp;
    }
    static int [] NSER ( int [] arr) {
        int [] temp = new int [arr.length];
        int min = Integer.MIN_VALUE;

        for ( int i = arr.length - 1; i >= 0;){
            temp[i]  = min;
            min = Math.min(min, arr[i]);
            i--;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(temp[i] + " ");
        }
        return temp;
    }

    static int trap( int [] height){
        int units = 0;
        
        return units;
    }
}
