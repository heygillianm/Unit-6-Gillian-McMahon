public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        Array2DExplorer exp = new Array2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRows: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRows(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");

        System.out.println("Test minRow: \n Expecting: 0 \n Actual:");
        System.out.println(exp.minRow(array, 1));

        System.out.println("Test colMaxs \n Expecting: {8, 4, 6} \n Actual: {");
        int [] col = exp.colMaxs(array);
        for (int i = 0; i < col.length; i++){
            System.out.println(col[i] + "");
        }
        System.out.println("}");

        System.out.println("Test allRowSums: \n Expecting: {18, 9, 16} \n Actual: {");
        int [] row2 = exp.allRowSums(array);
        for (int i = 0; i < row2.length; i++){
            System.out.println(row2[i] + "");
        }
        System.out.println("}");

        System.out.println("Test averageCol: \n Expecting: {4.5, 2.25, 4} \n Actual: ");
        double[] row3 = exp.averageCol(array);
        for (int i = 0; i < row3.length; i++){
            System.out.println(row3[i] + "");
        }
        System.out.println();

        System.out.println("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

    }










}