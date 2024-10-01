package lv.rvt;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        divisibleByThreeRange(2, 10);
    }
    public static void divisibleByThreeRange(int begin, int end) {
        while (begin <= end) {
            if (begin % 3 == 0) {
                System.out.println(begin);
            }
            begin++;

        }
    }

}
