import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapArr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int x = target - curr;
            if (mapArr.containsKey(x)) {
                return new int[]{mapArr.get(x), i};
            }
            mapArr.put(curr, i);
        }
        return null;
    }
}

