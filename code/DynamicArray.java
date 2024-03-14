package code;
import java.util.*;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        for (List<Integer> row : queries) {
            int queryType = row.get(0);
            int x = row.get(1);
            int y = row.get(2);
            int idx = (x ^ lastAnswer) % n;

            if (queryType == 1) {
                arr.get(idx).add(y);
            } else if (queryType == 2) {
                int size = arr.get(idx).size();
                lastAnswer = arr.get(idx).get(y % size);
                answers.add(lastAnswer);
            }

        }
        return answers;

    }

    public static void main(String[] args) {

    }

}
