package CreationalPattern.AbstractFactory;

public class AppleFactory extends AbstractFactory{
    @Override
    public Device getDevice(String device) {
        if(device.equalsIgnoreCase("iphone")){
            return new Iphone();
        }
        else if(device.equalsIgnoreCase("macbook"))
            return new Macbook();
        throw  new IllegalArgumentException("Device is not available in our factory");
    }
}
