package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printSquare(4);
    }

    public static void printSquare(int size) {
     for (int st = 0; size > st; st++) {
        for(int a = 0; size > a; a++) {
            System.out.print("*");
       }
       System.out.println();
    }
}
}


 // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");