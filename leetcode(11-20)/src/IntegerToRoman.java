import java.util.HashMap;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int nums[] = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String chars[] = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res = "";
        for (int i=0; i<nums.length; i++ ){
            while (nums[i] <= num){
                num -= nums[i];
                res += chars[i];
            }
        }
        return res;
    }

    public static void main(String args[]){
        IntegerToRoman solution = new IntegerToRoman();
        System.out.println(solution.intToRoman(99));
        System.out.print(solution.intToRoman(3));
    }

}
