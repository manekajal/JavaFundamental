package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args){

        int x,y,z;

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Enter the X , Y and Z value: ");
        x=scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();

        if(x>y && x>z){
            System.out.println(" Largest Number :" +x);
        }else if(y>z){
            System.out.println(" Largest Number :" +y);
        }else{
            System.out.println(" Largest Number :" +z);
        }
    }
}
