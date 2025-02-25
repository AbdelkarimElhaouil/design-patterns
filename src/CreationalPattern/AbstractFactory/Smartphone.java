package CreationalPattern.AbstractFactory;

public class Smartphone implements Device{
    @Override
    public void bootUp() {
        System.out.println("Booting up the samsung smartphone...");
    }
}
