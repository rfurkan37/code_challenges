import java.util.*;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        for (int i = 0; i < d; i++) {
            arr.add(arr.remove(0));
        }
        return arr;
    }

}
