package lv.rvt;

import java.util.*;

public class App

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();


        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
            break;
            }
            numbers.add(input);
        }


        System.out.println("From where? ");
        int startIndex = scanner.nextInt();
        System.out.println("To where? ");
        int endIndex = scanner.nextInt();


        System.out.println("Numbers in the range:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
            }

        scanner.close();
    }
}
