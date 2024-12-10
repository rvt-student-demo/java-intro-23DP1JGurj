package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {

    // Method to get the list of persons from the CSV file
    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> persons = new ArrayList<>();
        
        // Open the CSV file for reading
        BufferedReader reader = Helper.getReader("persons.csv");
        reader.readLine(); // Skip the header row
        
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line by ", " (comma followed by a space)
            String[] parts = line.split(", ");
            
            // Check if the line has enough data (name, age, weight, height)
            if (parts.length >= 4) {
                try {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]); // Parse age
                    int weight = Integer.parseInt(parts[2]); // Parse weight
                    int height = Integer.parseInt(parts[3]); // Parse height
                    
                    // Create a new Person object and add it to the list
                    Person person = new Person(name, age, weight, height);
                    persons.add(person);
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line + " - skipping this person.");
                }
            }
        }
        reader.close();
        return persons;
    }

    // Method to add a person to the CSV file
    public static void addPerson(Person person) throws IOException {
        // Open the CSV file for appending
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        
        // Write the person's data to the file
        writer.write(person.toCsvRow());
        writer.newLine(); // Add a new line after each entry
        
        writer.close(); // Close the writer
    }
}
