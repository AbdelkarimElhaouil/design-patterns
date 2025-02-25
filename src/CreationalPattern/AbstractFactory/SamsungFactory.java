package CreationalPattern.AbstractFactory;

public class SamsungFactory extends AbstractFactory{
    @Override
    public Device getDevice(String device) {
        if(device.equalsIgnoreCase("Tv"))
            return new Tv();
        else if(device.equalsIgnoreCase("smartphone"))
            return new Macbook();
        throw  new IllegalArgumentException("Device is not available in our factory");
    }
}
