import java.util.ArrayList;

public class aPerson {
    public static void main (String [] args){
        ArrayList<Person> list = new ArrayList<Person>();
        Person sam = new Person(17, "Sam");
        Person abigail = new Person(16, "Abigail");
        Person sebastian = new Person (18, "Sebastian");
        list.add(sam);
        list.add(abigail);
        list.add(sebastian);

        System.out.println(sam.findMin(list));
    }
}
