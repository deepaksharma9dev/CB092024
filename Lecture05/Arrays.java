package Lecture05;

import java.util.Scanner;

public class Arrays {

    static void reverseArray (){
        int[] arr = {1, 2, 3, 4, 5};
        for( int i = arr.length - 1; i >= 0; i-- ){
            System.out.print(arr[i] + " ");
        }
    }

    static void inputArray (){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        } 
    }

    static void swapArray(int i, int j, int [] arr){
        // System.out.println("Swapping with temp variable");
        // System.out.println("Before swapping:");
        // for(int d :arr){
        //     System.out.print(d + " ");
        // }

        // int temp = arr[i];
        // arr[i] = arr [j];
        // arr[j] = temp;
        
        // System.out.println("\nAfter swapping:");
        // for(int a : arr){
        //     System.out.print(a + " ");
        // }
        System.out.println("Swapping without temp variable");
        System.out.println("Before swapping:");
        for(int d :arr){
            System.out.print(d + " ");
        }

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        
        System.out.println("\nAfter swapping:");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    
    static void reverseTheArray(){
        int [] arr = {1,2,3,4,5,6};
        int N = arr.length/2;
        for (int i = 0; i < N; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;  
        }
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // reverseArray();
        // inputArray();
        int [] arr = {1,2,3};
        // swapArray(0,1,arr);
        reverseTheArray();
    }
}
