package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    

    public static void printUntilNumber(int number) {
        int num = 1;
        while (number >= 1) {
            System.out.println(number);
            number--;
        }

    }
}