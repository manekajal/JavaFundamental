package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {

    private static int n;


   static void primeFactorMethod( int n) {

       while (PrimeFactors.n % 2 == 0) {
           System.out.println( 2 +" ");
           PrimeFactors.n /= 2;

       }
       for (int i = 3; i <= Math.sqrt(PrimeFactors.n); i += 2) {
           System.out.println(i + " ");

           PrimeFactors.n /= i;

       }
       if (PrimeFactors.n > 2) {
           System.out.println(PrimeFactors.n);
       }
   }
        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            System.out.println(" Enter the number :");
            n= scanner.nextInt();
            primeFactorMethod(n);

       }
}
