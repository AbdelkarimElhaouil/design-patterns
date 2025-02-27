package CreationalPattern.Prototype;

public class ProductInfos {
    String description;
    String factoryName;

    public ProductInfos(){}

    public ProductInfos(String description, String factoryName) {
        this.factoryName = factoryName;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

}
