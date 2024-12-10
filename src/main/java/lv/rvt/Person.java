package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // All args constructor
    public Person(String name, int age, int weight, int height) {
        this.name = name != null ? name : "Unknown";
        this.age = age >= 0 ? age : 0; // Ensure non-negative age
        this.weight = weight >= 0 ? weight : 0;
        this.height = height >= 0 ? height : 0;
    }

    // Constructor with only a name
    public Person(String name) {
        this(name, 0, 0, 0); // Default other fields to 0
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    // Modify the toString() method to print only the CSV-style format
    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public void growOlder() {
        this.age++;
    }

    public void growOlder(int years) {
        if (years > 0) {
            this.age += years;
        }
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
}
