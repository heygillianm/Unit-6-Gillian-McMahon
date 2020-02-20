import java.util.ArrayList;

public class Person {
    private int myAge;
    private String myName;

    public Person(int age, String name){
        myAge = age;
        myName = name;
    }

    public int getAge(){
        return myAge;
    }

    public String getName(){
        return myName;
    }

    public Person findMin(ArrayList list){
        int i = 0;
        int min = 10000;
        while (i < list.size()){
            if (list.get(i).getAge() < min){
                min = list.getAge();
            }
        }
        return min;
    }
}
