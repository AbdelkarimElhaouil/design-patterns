package CreationalPattern.Builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private User(){}

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.firstName = lastName;
            return this;
        }

        public Builder setSalary(int salary){
            this.salary = salary;
            return this;
        }

        public User build(){
            User user = new User();
            user.age =  this.age;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.salary = this.salary;
            return user;
        }
    }
}
