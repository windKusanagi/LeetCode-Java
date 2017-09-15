public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int res = nums.length;
        for (int i=0; i<nums.length ;i++){
            if( i== 0 && nums[i] > target)
                return 0;
            if(nums[i] == target)
                return i;
            if( i>0 && nums[i]>target && nums[i-1]<target)
                return i;
        }
        return res;
    }

    public static void main(String args[]){
        SearchInsertPosition solution = new SearchInsertPosition();
        int input [] = new int [] {1,3,5,6};
        System.out.print(solution.searchInsert(input, 6));

    }
}
