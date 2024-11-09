import java.util.HashSet;
import java.util.Set;

public class task5 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        int answer1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                answer1++;
            }
        }
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        int answer2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                answer2++;
            }
        }
        return new int[]{answer1, answer2};
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 3, 3, 4};
        task5 solution = new task5();
        int[] result = solution.findIntersectionValues(nums1, nums2);
        System.out.println("answer1: " + result[0] + ", answer2: " + result[1]);
    }
}