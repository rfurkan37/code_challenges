import java.util.Arrays;

public class IntersectionOfArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index] = nums1[i];
                    index++;
                    break;
                }
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main (String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = intersect(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }




    } 

    
}