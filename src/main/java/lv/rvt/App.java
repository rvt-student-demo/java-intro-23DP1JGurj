package lv.rvt;

import java.util.*;

public class App
        {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> intList = new ArrayList<>();

            while (true) {
                int input = Integer.valueOf(scanner.nextLine());
                intList.add(input);
                if (input == 0) {
                    break;
                }
            }

            int sum = 0;
            for (int i = 0; i < intList.size(); i++) {
                sum += intList.get(i);
            }
            System.out.println(sum);

        }
    }