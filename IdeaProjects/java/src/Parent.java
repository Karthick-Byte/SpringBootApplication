import java.util.LinkedHashMap;

public class Parent implements Payment {

    void eat(){
        System.out.println("Eat method is called");

    }

    void working(){
        System.out.println("The working Parent");
    }

    @Override
    public void pay(){
        System.out.println("The payment is implemented in parent class");
    }


}
