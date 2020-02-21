import java.util.ArrayList;

public class aPerson {

    public static String findMin(ArrayList<Person> list){
        int i = 0;
        int min = 10000;
        while (i < list.size()){
            if (list.get(i).getAge() < min){
                min = list.get(i).getAge();
            }
        }
        return list.get(i).getName();
    }

    public static void main (String [] args){
        ArrayList<Person> list = new ArrayList<Person>();
        Person sam = new Person(17, "Sam");
        Person abigail = new Person(16, "Abigail");
        Person sebastian = new Person (18, "Sebastian");
        list.add(sam);
        list.add(abigail);
        list.add(sebastian);

        System.out.println(findMin(list));
    }
}
