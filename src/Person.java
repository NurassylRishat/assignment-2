public class Person implements IPayable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    //it needs to set id by the each calling the constructor
    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

//getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}