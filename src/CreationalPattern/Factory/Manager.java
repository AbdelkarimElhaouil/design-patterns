package CreationalPattern.Factory;

public class Manager implements Person{
    @Override
    public void introduce() {
        System.out.println("I am a Manager");
    }
}
