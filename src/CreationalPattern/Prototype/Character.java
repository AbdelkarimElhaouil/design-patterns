package CreationalPattern.Prototype;

import java.util.List;

/* This is an example of shallow cloning
    where mutable fields like (Lists, maps... or Objects)
    are shared between all cloned objects,
    means all these object has the same reference of those fields*/

public class Character implements Cloneable{
    private String name;
    private double height;
    private List<String> features;

    @Override
    public Character clone() {
        try {
            return (Character) super.clone(); // Shallow copy(the same reference of features is shared between the objects)
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Character() {
    }

    public Character(double height, String name, List<String> features) {
        this.height = height;
        this.name = name;
        this.features = features;
    }

    public void addFeature(String feature){
        features.add(feature);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }
}
