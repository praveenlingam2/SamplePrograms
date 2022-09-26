package oopsConcepts;

class person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        person obj =new person();
        obj.setName("praveen");
        System.out.println(obj.getName());
    }

}
