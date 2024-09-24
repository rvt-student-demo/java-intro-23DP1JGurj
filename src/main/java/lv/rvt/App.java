package lv.rvt;

import java.util.Scanner;

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi gift tax: ");
        int giftTax = Integer.valueOf(scanner.nextLine());

        if (giftTax < 5000) {
         System.out.println("No tax!");
        } else if (giftTax < 25000) {
         System.out.println("Tax: " + (100 + (giftTax-5000)* 0.08));
        } else if (giftTax < 55000) {
         System.out.println("Tax: " + (1700 + (giftTax-25000)* 0.10));
        } else if (giftTax < 200000) {
         System.out.println("Tax: " + (4700 + (giftTax-55000)* 0.12));
        } else if ( giftTax < 1000000) {
         System.out.println("Tax: " + (22100 + (giftTax-200000)* 0.15));
        } else {
         System.out.println("Tax: " + (142100 + (giftTax-1000000)* 0.17));
}
}
}


