//"extends" shows that class is sublclass of Person
public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    //"super" is searching function from parent class
    public Employee(String name, String surname, String position, double salary) {
        super.setName(name);
        super.setSurname(surname);
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }
}