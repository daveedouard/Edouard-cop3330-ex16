/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex16;

import java.util.Scanner;

public class exercise16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is you age? ");
        int age = input.nextInt();

        if(age >= 16){

            System.out.print("You are old enough to legally drive.");

        }
        else if(age < 16){

            System.out.print("You are not old enough to legally drive.");
        }
    }
}
