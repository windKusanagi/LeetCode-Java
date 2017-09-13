public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int cur = 1, count = 1, pre = 0;
        while (cur<nums.length){
            if ( nums[cur] != nums[pre]){
                nums[count] = nums[cur];
                count++;
                pre++;
            }else{
                cur++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int input [] = new int[]{1,1,2,2,3};
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        System.out.print(solution.removeDuplicates(input));

    }
}
