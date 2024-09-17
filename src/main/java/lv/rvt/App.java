package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
        {
            Scanner scanner = new Scanner(System.in);

            int speed = Integer.valueOf(scanner.nextLine());
            if (speed > 120) {
                System.out.println("Speeding ticket!");
            }
        }
}