package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printRectangle(17, 3);
    }

    public static void printRectangle(int width, int height) {
     for (int st = 0; height > st; st++) {
        for(int a = 0; width > a; a++) {
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