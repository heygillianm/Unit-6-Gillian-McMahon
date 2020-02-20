import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayLists {
    public static void main(String [] args){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int a = 2;
        int b = 3;
        int c = 0;
        int d = 9;
        int e = 0;
        intList.add(a);
        intList.add(b);
        intList.add(c);
        intList.add(d);
        intList.add(e);

        betterRemoveZeros(intList);
        System.out.println(intList);

        ArrayList list = parseIntoArray("Test string");
        System.out.println(countLetters(list));
        System.out.println(findPosition(2, intList));
        System.out.println(parseIntoArray("Hello"));
    }

    public static void removeZeros(ArrayList list) {
        //list.size() changes every time you remove an object
        // so the condition of the while loop changes with the i--; this works out and stops the while loop at the end.
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).equals(0)) {
                list.remove(i);
                i--;
            }
            i++;
        }
    }

    public static void betterRemoveZeros(ArrayList list) {
        //An iterator is an object that goes through a list element by element; list.iterator() creates the iterator.
        //itr.hasNext() returns true if the next value is not null, else false. This is what propels the while loop to
        // iterate over each element.
        //itr.next() makes the iterator "point" to the next value in the list; this is the actual iterating act.
        // Now, the iterator can get that element and perform the functions like itr.remove() on it.
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals(0)) {
                itr.remove();
            }
        }
    }

    public static int countLetters(ArrayList list){
        int i = 0;
        while (i < list.size()){
            if (list.get(i).equals(" ")){
                list.remove(i);
                i--;
            }
            i++;
        }
        return i;
    }

    public static int findPosition(int keyValue, ArrayList list){
        int i = 0;
        while (i < list.size()){
            if (list.get(i).equals(keyValue)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static ArrayList parseIntoArray (String input) {
        ArrayList<String> parse = new ArrayList<String>();
        for (int a = 0; a < input.length(); a++) {
            parse.add(input.substring(a, a+1));
        }
        return parse;
    }
}