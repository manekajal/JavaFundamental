package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConstant {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Enter the Alphabet :");

        char alphabet = scanner.next().charAt(0);

        switch (alphabet){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println(alphabet + " is vowel");
                break;
            default:
                System.out.println(alphabet + " is Consonant");





        }
    }
}
