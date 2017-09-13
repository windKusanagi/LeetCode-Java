import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer >lookup = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(lookup.containsKey(target-nums[i])){
                return new int [] {lookup.get(target-nums[i]), i};
            }
            lookup.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = new int[] {2, 7, 11, 15};
        TwoSum test = new TwoSum();
        int res[] = test.twoSum(nums, 9);
        for (int i=0; i<res.length; i++){
            System.out.print(res[i]+ "  " );
        }
    }
}
