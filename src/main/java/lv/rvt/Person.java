package lv.rvt;

public class Person {
    private String name;
    private int age;
    

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age ++;
        }
    }

    public String getName() {
        return this.name;
    }
    
    public boolean isOfLegalAge() {
        return this.age <= 18;
    }

    // the added method
    public int returnAge() {
        return this.age;
    }
}