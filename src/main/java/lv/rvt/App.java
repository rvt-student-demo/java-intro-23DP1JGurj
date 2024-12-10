package lv.rvt; 

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

public class App { 
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sveiki, lūdzu izvēlies komandu: ");
        System.out.println("show - parādīt visas personas");
        System.out.println("add - pievienot personu");
        System.out.println("exit - iziet no programmas");
        String userCommand = scanner.nextLine();
        
        while(userCommand.equals("exit") == false) {
            if (userCommand.equals("show")) {
                System.out.println("Show all persons: ");
                ArrayList<Person> persons = PersonManager.getPersonList();
            
                for (Person person: persons) {
                    System.out.println(person);
                }
            } else if (userCommand.equals("add")) {
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter you weight: ");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter your height: ");
                int height = Integer.valueOf(scanner.nextLine());
    
                Person person = new Person(name, age, weight, height);
    
                PersonManager.addPerson(person);
                System.out.println("Person added");
            }
            userCommand = scanner.nextLine();
        }
        System.out.println("Bye!");
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    } 
}