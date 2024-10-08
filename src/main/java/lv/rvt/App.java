package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printTriangle(4);
        printRectangle(17, 3);
        printSquare(4);
    }


        public static void printStars(int number) {
           int st = 0;
           while (st < number) {
            System.out.print("*");
            st++;
           }
           System.out.println();
        }
        public static void printSquare(int size) {
        System.out.println();
         for (int st = 0; size > st; st++) {
            for(int a = 0; size > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }
    
    
        public static void printRectangle(int width, int height) {
        System.out.println();
         for (int st = 0; height > st; st++) {
            for(int a = 0; width > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }

    
    
        public static void printTriangle(int size) {
        System.out.println();
         for (int st = 0; size > st; st++) {
            for(int a = 0; st+1 > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }
    }

