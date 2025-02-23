package CreationalPattern.Factory;

public class Employee implements Person{

    @Override
    public void introduce() {
        System.out.println("I am an Employee");
    }
}
