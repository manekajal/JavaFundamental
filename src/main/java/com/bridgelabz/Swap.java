package com.bridgelabz;

import java.util.Scanner;

public class Swap {


    public static void main(String[] args){

        int x,y,t;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter X and  value :");
        x=scanner.nextInt();
        y=scanner.nextInt();


        System.out.println(" Before Swapping : "  +x+ " "+y);


                t=x;
                x=y;
                y=t;
                System.out.println("After Swapping : "  +x+ "  " +y);

    }
}
