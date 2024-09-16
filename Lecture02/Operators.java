package Lecture02;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        
        // WAP to print first N natural numbers
        // int N = 10;
        // for (int i =2; i<=N*2; i+=2){
        //     System.out.println(i);
        // }

        // WAP to calculate sum of first N natural numbers
        // int Sum=0;
        // for (int i=1; i<=N; i++){
        //     Sum+=i;
        // }

        // System.out.println("Sum of first " + N + " natural numbers is: " + Sum);


        // for (int i= N; i>0; i--){
        //     System.out.println(i);
        // }

        // int i = 1;
        // while (i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        // do-while loop
        // int j = 1;
        // do {
        //     System.out.println(j);
        //     j++;
        // } while (j<=10);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 2; i<num; i++){
            boolean isPrime = true;
            for (int j =2; j<i; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i + " is prime number");
            }else{
                System.out.println(i + " is not a prime number");
            }
        }
        
    }
}
