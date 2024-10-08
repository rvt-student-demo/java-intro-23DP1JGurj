package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int number) {
       int st = 0;
       while (st < number) {
        System.out.print("*");
        st++;
       }
       System.out.println();
    }
}


 // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");