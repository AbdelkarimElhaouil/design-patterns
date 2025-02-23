package CreationalPattern.Factory;

public class PersonFactory {
    public static Person getPerson(String person){
        if(person.equalsIgnoreCase("student"))
            return new Student();
        else if (person.equalsIgnoreCase("manager")) {
            return new Manager();
        }
        else if (person.equalsIgnoreCase("employee")) {
            return new Employee();
        }
        throw new IllegalArgumentException("Unknown type: " + person);
    }
}
