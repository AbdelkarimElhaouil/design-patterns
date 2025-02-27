package CreationalPattern.Prototype;

/*  this is an example of deep cloning,
    this type of cloning provide the independence of immutable fields,
    that means each object has its unique reference of that field,
    and that solve the problem of shallow cloning */

public class Product implements Cloneable{
    private ProductInfos infos;
    private double price;
    private String name;

    @Override
    public Product clone() {
        try {
            Product cloned = (Product) super.clone();
            cloned.infos = new ProductInfos(infos.description, infos.factoryName);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Product() {
    }

    public Product(ProductInfos infos, double price, String name) {
        this.infos = infos;
        this.price = price;
        this.name = name;
    }

    public ProductInfos getInfos() {
        return infos;
    }

    public void setInfos(ProductInfos infos) {
        this.infos = infos;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
