public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int len = height.length;
        int area = 0, left = 0, right = len-1;
        int curArea = 0;
        while (left < right){
            if (height[left] > height[right]) {
                curArea = height[right]*(right-left);
                right--;
            }else{
                curArea = height[left]*(right-left);
                left++;
            }
            area = Math.max(curArea, area);
        }
        return area;

    }

    public static void main(String args[]){
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int height[] = new int[]{1,1,1};
        System.out.print(solution.maxArea(height));
    }
}
