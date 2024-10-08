package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        System.out.println("Printing stars");
        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();

        System.out.println("Printing a triangle");
        printTriangle(4);
        System.out.println();

        System.out.println("Printing a rectangle");
        printRectangle(17, 3);
        System.out.println();

        System.out.println("Printing a square");
        printSquare(4);
        System.out.println();

        System.out.println("Printing stars and spaces");
        printSpaces(1);
        printStars(4);
        System.out.println();

        System.out.println("Printing a right-leaning triangle");
        System.out.println();
        printTriangle1(4);

        System.out.println("Printing a Christmas tree");
        System.out.println();
        christmasTree(4);
        System.out.println();
        christmasTree(10);
    }

    // 1
        public static void printStars(int number) {
           int st = 0;
           while (st < number) {
            System.out.print("*");
            st++;
           }
        }

    // 2
        public static void printSquare(int size) {
        System.out.println();
         for (int st = 0; size > st; st++) {
            for(int a = 0; size > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }
    
    // 3
        public static void printRectangle(int width, int height) {
        System.out.println();
         for (int st = 0; height > st; st++) {
            for(int a = 0; width > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }

    
    // 4
        public static void printTriangle(int size) {
        System.out.println();
         for (int st = 0; size > st; st++) {
            for(int a = 0; st+1 > a; a++) {
                System.out.print("*");
           }
           System.out.println();
        }
    }

    // Part 2
    // 1

    public static void printSpaces(int number) {
        for(int a = 0; a < number; a++){
            System.out.print(" ");
        }
    }

    // 2
    public static void printTriangle1(int size) {
        for (int c = 0; c < size; c++) {
            printSpaces(size-(c+1));
            printStars(c+1);
            System.out.println();
        }

    }

    // 3
    public static void christmasTree (int height) {
        System.out.println();
        int d = 1;
        for (int e = 0; e < height; e++) {
            printSpaces(height-(e+1));
            printStars(d);
            d += 2;
            System.out.println();
        }
        printSpaces(height-2);
        printStars(3); 
        System.out.println();
        printSpaces(height-2);
        printStars(3);
    }
}