package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }
    
    public void growOlder() {
        if (this.age < 30) {
            this.age ++;
        }                                                                                                                                   
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age <= 18;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
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
    
}