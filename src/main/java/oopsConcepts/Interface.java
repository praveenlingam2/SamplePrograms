package oopsConcepts;

interface Bank{
    void indianBank();
    void stateBank();
}
class BankValue implements Bank{

    @Override
    public void indianBank() {
        System.out.println("Indian oopsConcepts.Bank");
    }

    @Override
    public void stateBank() {
        System.out.println("State oopsConcepts.Bank");
    }
}
public class Interface {
    public static void main(String[] args) {
        BankValue obj=new BankValue();
        obj.indianBank();
        obj.stateBank();
    }
}
