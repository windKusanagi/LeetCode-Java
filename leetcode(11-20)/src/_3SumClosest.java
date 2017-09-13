import java.util.Arrays;

public class _3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int dif=Integer.MAX_VALUE;
        int res = 0;
        int len = nums.length;

        int i = 0;
        while (i<len-2) {
            int j = i+1;
            int k = len-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    return target;
                }
                if ( Math.abs(sum-target) < dif){
                    res = sum;
                    dif = Math.abs(sum-target);
                }else if( sum > target ){
                    k--;
                }else {
                    j++;
                }

            }
            i++;
        }

        return res;
    }

    public static void main(String args[]){
        int input[] = new int [] {-3, -2, -5, 3, -4};
        int input2[] = new int [] {-1, 2, 1, -4};
        _3SumClosest solution = new _3SumClosest();
        System.out.println(solution.threeSumClosest(input, -1));
        System.out.println(solution.threeSumClosest(input2, 1));

    }
}
