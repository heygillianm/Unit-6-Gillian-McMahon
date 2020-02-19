public class Array2DExplorer {

    public boolean evenRow( int[][] mat, int row){
        //returns true if all numbers in the row are even
        int count = 0;

        for (int i = 0; i < mat[row].length; i++){
            if (mat[row][i] % 2 == 0){
                count++;
            }
            if (count == mat[row].length){
                return true;
            }
        }
        return false;
    }

    public boolean oddColSum (int [][] nums, int col){
        //returns true if all numbers in the given column are odd
        int count = 0;

        for (int c = 0; c < nums.length; c++){
            for (int i = 0; i < nums[col].length; i++){
                if (nums[col][i] % 2 != 0){
                    count++;
                }
                if (count == nums[col].length){
                    return true;
                }
            }
        }
        return false;
    }

    public int minRow(int [][] nums, int row){
        //looks through each element of the chosen row and returns smallest int
        int min = 100000;
        for (int i = 0; i < nums[row].length; i++){
            if (nums[row][i] < min){
                min = nums[row][i];
            }
        }
        return min;
    }

    public int[] minRows (int[][] nums){
        //looks through each row and returns a 1D array with the smallest int.
        int[] minArr = new int[nums.length + 1];
        int min = 10000;
        for (int r = 0; r < nums.length; r++){
            for (int i = 0; i < nums[r].length; i++){
                if (nums[r][i] < min){
                    min = nums[r][i];
                    minArr = nums[r];
                }
            }
        }
        return minArr;
    }

    public int[] colMaxs(int[][] matrix){
        //searches through each column of an array and returns an array with the largest integer from each column.
        int[] maxArr = new int[matrix.length + 1];
        int max = 0;
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                if (matrix[r][c] > max){
                    max = matrix[r][c];
                    maxArr = matrix[r];
                }
            }
        }
        return maxArr;
    }

    public int[] allRowSums(int[][] data) {
        //calculates the row sum for every row and returns each of the values in an array.
        // Index i of the return array contains the sum of elements in row i.
        int[] sumArr = new int[data.length];
        for (int r = 0; r < data.length; r++){
            int sum = 0;
            for (int c = 0; c < data[r].length; c++){
                sum += data[r][c];
            }
            sumArr[r] = sum;
        }
        return sumArr;
    }

    public double[] averageCol(int[][] nums) {
        //calculates the average of each column in the array nums, and returns those values in an array of doubles.
        int count = 0;
        double[] sumArr = new double[nums.length];
        for (int r = 0; r < nums.length; r++){
            int sum = 0;
            for (int c = 0; c < nums[r].length; c++){
                sum += nums[r][c];
                count++;
            }
            sumArr[r] = sum / count;
        }
        return sumArr;
    }

    public int smallEven(int[][] matrix) {
        // finds and returns the smallest even number in the array matrix.
        // Assume that the array is filled with only positive ints.
        int count = 0;
        int min = 10000;

        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                if (matrix[r][c] % 2 == 0 && matrix[r][c] < min){
                    min = matrix[r][c];
                }
            }
        }
        return min;
    }

    public static int biggestRow(int[][] nums) {
        //returns the row index number that has the greatest sum of its elements.
        int max = 0;
        int row = 0;

        for (int r = 0; r < nums.length; r++){
            int sum = 0;
            for (int c = 0; c < nums[r].length; c++){
                sum += nums[r][c];
            }
            if (sum > max){
                max = sum;
                row = r;
            }
        }
        return row;
    }
}
