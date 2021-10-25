package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {



    static double getHarmonic(int N){

        float harmonic=1;

        for( int i=2;i<=N;i++){
            harmonic += (float) 1/i;

        }
        return harmonic;


    }
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number of Harmonic");

        int N =scanner.nextInt();

        System.out.println(HarmonicNumber.getHarmonic(N));
    }
}
