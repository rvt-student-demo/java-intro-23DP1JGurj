package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private int shelf;
    private SimpleDate birthday;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    // All args class constructor
    public Person(String name, int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public Person(String name, String age, String weight, String height) {
        this.name = name;
        this.age = Integer.valueOf(age);
        this.weight = Integer.valueOf(weight);
        this.height = Integer.valueOf(height);
    }

    // Second constructor with only one parameter
    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age <= 18;
    }

    // Getter un setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return weight;
    } 

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    
    public void growOlder() {
        this.age = this.age + 1;
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
    }
    
    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
}   