package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printTriangle(int size) {
     for (int st = 0; size > st; st++) {
        for(int a = 0; st+1 > a; a++) {
            System.out.print("*");
       }
       System.out.println();
    }
}
}