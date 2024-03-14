import java.util.*;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {

        List<Integer> result = new ArrayList<>();

        for (String string : stringList) {
            int count = 0;
            for (String query : queries) {
                if (string.equals(query)) {
                    count++;
                }
            }
            result.add(count);

        }

        return result;

    }
}
