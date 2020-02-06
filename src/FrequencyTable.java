import java.util.Scanner;

public class FrequencyTable {
    //class stuff
    //instance variable
    private int[] list;

    //takes array of ints as a parameter
    public FrequencyTable(int[] arr){
        list = arr;
    }

    //makeChart method

    private String makeChart(){
        String result = "";
        result += "1 - 10 |" + count1() + "\n11 - 20 |" + count10();
        result += "\n21 - 30 |" + count20() + "\n31 - 40 |" + count30();
        result += "\n41 - 50 |" + count40() + "\n51 - 60 |" + count50();
        result += "\n61 - 70 |" + count60() + "\n71 - 80 |" + count70();
        result += "\n81 - 90 |" + count80() + "\n91 - 100|" + count90();
        return result;
    }


   private String count1(){
        String count1 = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i] <= 10){
                count1 += "* ";
            }
        }
        return count1;
    }

    private String count10(){
       String count10 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] <= 20 && list[i] > 10){
               count10 += "* ";
           }
       }
       return count10;
    }

    private String count20(){
       String count20 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 20 && list[i] <= 30){
               count20 += "* ";
           }
       }
       return count20;
    }

    private String count30(){
       String count30 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 30 && list[i] <= 40){
               count30 += "* ";
           }
       }
       return count30;
    }

    private String count40(){
       String count40 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 40 && list[i] <= 50){
               count40 += "* ";
           }
       }
       return count40;
    }

    private String count50(){
       String count50 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 50 && list[i] <= 60){
               count50 += "* ";
           }
       }
       return count50;
    }

    private String count60(){
       String count60 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 60 && list[i] <= 70){
               count60 += "* ";
           }
       }
       return count60;
    }

    private String count70(){
       String count70 = "";
       for (int i = 0; i < list.length; i++){
           if (list[i] > 70 && list[i] <= 80){
               count70 += "* ";
           }
       }
       return count70;
    }

    private String count80(){
        String count80 = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] > 80 && list[i] <= 90){
                count80 += "* ";
            }
        }
        return count80;
    }

    private String count90(){
        String count90 = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] > 90 && list[i] <= 100){
                count90 += "* ";
            }
        }
        return count90;
    }
    //end class stuff
    //main method
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        //assume they'll enter only ints and no negative numbers
        System.out.println("How many values in your data set?");
        int length = scan.nextInt();

        int[] data = new int[length];

        System.out.println("Enter data values one at a time, followed by enter:");
        int val = 0;

        for (int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyTable table = new FrequencyTable(data);

        System.out.println(table.makeChart());
    }
}
