import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        int i = 0;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while( i < len-2 ){
            int j = i+1;
            int k = len-1;
            while ( j < k ){
                if (nums[j] + nums[k] == -nums[i]){
                    tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    res.add(tmp);
                    j++;
                    while (j<k && nums[j]==nums[j-1])
                        j++;
                    k--;
                    while (k>j && nums[k]==nums[k+1])
                        k--;
                }else if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }else{
                    j++;
                }
            }
            i++;
            while (i<len-2 && nums[i]==nums[i-1])
                i++;
        }
        return res;
    }

    public static void main(String args[]){
        _3sum solution = new _3sum();
        int input[] = new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = solution.threeSum(input);
        for (int i=0; i<res.size() ; i++) {
            for (int j=0; j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

}
