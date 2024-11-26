package lv.rvt;

public class Products {

    private String name;
    private String location;
    private int weight;

    public Products (String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;

    }

    public Products (String name){
        this(name, "shelf", 1);
    }

    public Products (String name, String location){   
        this(name, location, 1);
    }

    public Products (String name, int weight){
        this(name, "shelf" , 1);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight  + " kg) can be found from the " + this.location;

    }
}
