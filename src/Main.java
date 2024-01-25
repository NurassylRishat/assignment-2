//i imported some libraries which, array for saving and adding people in arraylist
import java.util.ArrayList;
// and imported this libraries to get sort function easily and save it
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " " + person.getPaymentAmount() + " tg");
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Almat" , "Sardar" , "Waiter" , 70000);
        Employee employee2 = new Employee("Abylay" , "Moldakhmetov" , "Programmer" , 150000);
        Student student1 = new Student("Nurbolat" , "BAhitzhan" , 3.2);
        Student student2 = new Student("Rishat" , "Nurassyl" , 2.5);


       //list of people
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(employee1);
        arr.add(employee2);
        arr.add(student1);
        arr.add(student2);

       // sotring by their salaries
        Collections.sort(arr);
        printData(arr);


    }



}