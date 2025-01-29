package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

import javax.sound.midi.Soundbank;

import lv.rvt.connecticut.Box; 
 
public class App { 
    public static void main ( String[] args )
    {
        Person person1 = new Person("John", "Riga");
        Student student1 = new Student("Jack", "Salaspils");
        Teacher teacher1 = new Teacher("Kraken", "Italy");

        System.out.println(
            teacher1.toString()
            );
    }
}