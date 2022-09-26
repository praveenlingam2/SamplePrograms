package oopsConcepts;

class animals{
    public void species(){
        System.out.println("species");
    }
}
class bird extends animals{
    public void species(){
        System.out.println("oopsConcepts.bird");
    }
}
class cat extends animals{
    public void species(){
        System.out.println("oopsConcepts.cat");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        animals animal=new animals();
        animals bird=new bird();
        animals cat=new cat();
        animal.species();
        bird.species();
        cat.species();
    }
}
