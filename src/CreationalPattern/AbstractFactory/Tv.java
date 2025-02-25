package CreationalPattern.AbstractFactory;

public class Tv implements Device{
    @Override
    public void bootUp() {
        System.out.println("Booting up Smart Tv...");
    }
}
