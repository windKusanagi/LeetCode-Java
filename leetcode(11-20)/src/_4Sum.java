import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class _4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null && nums.length < 4)
            return res;
        while( i<len-3) {
            int j = i+1;
            while( j < len-2 ){
                int k = j+1;
                int l = len-1;
                while(k<l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target){
                        ArrayList<Integer>temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        res.add(temp);
                        k++;
                        while (k<l && nums[k] == nums[k-1])
                            k++;
                        l--;
                        while (k<l && nums[l] == nums[l+1])
                            l--;
                    }else if (sum > target){
                        l--;
                    }else{
                        k++;
                    }
                }
                j++;
                while(j<len-2 && nums[j]==nums[j-1])
                    j++;
            }
            i++;
            while(i<len-3 && nums[i]==nums[i-1])
                i++;
        }
        return res;
    }

    public static void main(String args[]){
        _4Sum solution = new _4Sum();
        int input[] = new int [] {-3, -2, -1, 0, 0, 1, 2, 3};
        solution.fourSum(input, 0);
    }
}
