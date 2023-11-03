import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i + 1]) {
                continue;
            }

            int left = i;
            int right = nums.length;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left--;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right++;
                    }

                    left++;
                    right--;
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        threesum solution = new threesum();
        int[] nums = { 1, 1, 1, 1, 1 };
        List<List<Integer>> result = solution.threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
