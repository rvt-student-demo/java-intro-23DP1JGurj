
package lv.rvt;

public class Teacher extends Person {
    
    public Teacher(String name, String address){
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.getName();
    }
}
