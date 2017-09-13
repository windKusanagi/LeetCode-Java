public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if( nums.length == 0 )
            return 0;
        int cur = 0, count = 0;
        while(cur < nums.length){
            if ( nums[cur] == val){
                cur++;
            }else {
                nums[count] = nums[cur];
                count++;
                cur++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        int input[] = new int [] {3,2,2,3};
        RemoveElement solution = new RemoveElement();
        solution.removeElement(input,3);
        for ( int item:input ){
            System.out.print(item + " ");
        }
    }
}
