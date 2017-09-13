public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {

        int resl = -1, resr = -1;
        if (nums == null || nums.length == 0)
            return new int []{resl, resr};

        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target && (mid ==0 || nums[mid - 1]!= target)){
                resl = mid;
                break;
            }
            if (nums[mid]>target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        left = 0;
        right = 0;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target && (mid ==nums.length-1 || nums[mid + 1]!= target)){
                resr = mid;
                break;
            }
            if (nums[mid]>target)
                right = mid;
            else
                left = mid + 1;
        }

        return new int []{resl, resr};

    }

    public static void main(String args[]){
        int input [] = new int [] {5, 7, 7, 8, 8, 10};
        SearchForARange solution = new SearchForARange();
        int res[] = solution.searchRange(input, 8);
        for (int item: res){
            System.out.print(item + "  ");
        }
    }
}
