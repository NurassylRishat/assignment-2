public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.00;

    public Student() {

    }

    public Student(String name, String surname, double gpa) {
        super.setName(name);
        super.setSurname(surname);
        this.gpa = gpa;
    }
// we rewrite the former code of the java or the interface
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND : 0.00;
    }
}