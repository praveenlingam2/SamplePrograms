package oopsConcepts;

abstract class animal{
    public abstract void species();
    public void animals(){
        System.out.println("animals");
    }
}
class Dog extends animal{
    @Override
    public void species() {
        System.out.println("dog");
    }
}
public class Abstract {
    public static void main(String[] args) {
        animal dog=new Dog();
        dog.animals();
        dog.species();
    }

}
