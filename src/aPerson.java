import java.util.ArrayList;
import java.util.Iterator;

public class aPerson {

    public static String findMin(ArrayList<Person> list){
        Person peep = list.get(0);
        for (Person p : list){
            int age = p.getAge(); //age of current person
            int minAge = peep.getAge(); //current min
            if (age < minAge){
                peep = p;
            }
        }
        return peep.getName();
    }


    public static void main (String [] args){
        ArrayList<Person> list = new ArrayList<Person>();
        Person sam = new Person(17, "Sam");
        Person abigail = new Person(16, "Abigail");
        Person sebastian = new Person (18, "Sebastian");
        list.add(sam);
        list.add(abigail);
        list.add(sebastian);

        System.out.println("The person with the youngest age is: " + findMin(list));
    }
}
