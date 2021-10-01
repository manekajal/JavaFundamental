package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {





    public static void main(String[] args) {

        int head = 0;
        int tail = 0;
       int number;



        Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the number of time to Flip:");
     number = scanner.nextInt();


        for (int i = 0; i < number; i++) {

            if (Math.random() < 0.5) {
                System.out.println("Head");

            } else {
                System.out.println("Tail");
            }


        }






    }
}



