package CreationalPattern.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("apple"))
            return new AppleFactory();
        else if(factory.equalsIgnoreCase("samsung"))
            return new SamsungFactory();
        throw new IllegalArgumentException("Invalid factory name");
    }
}
