import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

   public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int curr = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (curr == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
 HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
        if (seen.containsKey(num) && seen.get(num) >= 1)
            return true;
        seen.put(num, seen.getOrDefault(num, 0) + 1);
    }
        return false;
}
}
