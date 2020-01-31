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
        result += "1 - 10 | " + count1() + "\n11 - 20 | " + count10() + "\n21 - 30 | " + count20()
                + "\n31 - 40 | " + count30() + "\n41 - 50 | " + count40() + "\n51 - 60 | " + count50()
                + "\n61 - 70 | " + count60() + "\n71 - 80 | " + count70() + "\n81 - 90 | " + count80()
                + "\n91 - 100| " + count90();
        return result;
    }

    private String count(){
        String count = "";
        for (int i = 0; i < list.length; i++) {

        }
    }

    //count 1-10
    private String count1(){
        String ones = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 10){
                ones += "* ";
            }
        }
        return ones;
    }

    //count 11-20
    private String count10(){
        String tens = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 20){
                tens += "* ";
            }
        }
        return tens;
    }

    //count 21-30
    private String count20(){
        String twenty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 30){
                twenty += "* ";
            }
        }
        return twenty;
    }

    //count 31-40
    private String count30(){
        String thirty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 40){
                thirty += "* ";
            }
        }
        return thirty;
    }

    //count 41-50
    private String count40(){
        String forty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 50){
                forty += "* ";
            }
        }
        return forty;
    }

    //count 51-60
    private String count50(){
        String fifty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 60){
                fifty += "* ";
            }
        }
        return fifty;
    }

    //count 61-70
    private String count60(){
        String sixty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 70){
                sixty += "* ";
            }
        }
        return sixty;
    }

    //count 71-80
    private String count70(){
        String seventy = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 80){
                seventy += "* ";
            }
        }
        return seventy;
    }

    //count 81-90
    private String count80(){
        String eighty = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 90){
                eighty += "* ";
            }
        }
        return eighty;
    }

    //count 91-100
    private String count90(){
        String ninety = "";
        for (int i = 0; i < list.length; i++){
            if (list[i] <= 100){
                ninety += "* ";
            }
        }
        return ninety;
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
