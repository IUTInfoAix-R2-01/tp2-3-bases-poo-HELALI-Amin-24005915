package exercice_2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name){
        this.name = name;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }
}