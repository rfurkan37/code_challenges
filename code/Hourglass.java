package code;
import java.util.*;

class Hourglass {

    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                tempSum = 0;
                tempSum += arr.get(i).get(j);
                tempSum += arr.get(i).get(j - 1);
                tempSum += arr.get(i).get(j + 1);
                tempSum += arr.get(i + 1).get(j);
                tempSum += arr.get(i + 2).get(j);
                tempSum += arr.get(i + 2).get(j - 1);
                tempSum += arr.get(i + 2).get(j + 1);
                if (max < tempSum)
                    max = tempSum;
            }
        }
        return max;
    }

}