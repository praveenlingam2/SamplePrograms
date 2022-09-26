package oopsConcepts;

class a{
    void parent(){
        System.out.println("Parent");
    }
}
class b extends a{
    void child(){
        System.out.println("Child");
    }
}
public class Inheritance {
    public static void main(String[] args){
        b obj = new b();
        a obj1= new a();
        obj.parent();
        obj.child();
        obj1.parent();
        //  obj1.child();
    }
}
