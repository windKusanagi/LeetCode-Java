public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        int cutter = 1;
        while ( x / cutter >= 10 ){
            cutter *= 10;
        }

        while( cutter>1 ) {
            int left = x / cutter;
            int right = x % 10;

            if (left != right)
                return false;
            x = (x % cutter)/ 10;
            cutter /= 100;
        }

        return true;
    }
    public static void main( String args[]){
        PalindromeNumber solution = new PalindromeNumber();
        System.out.print(solution.isPalindrome(1596116951));
    }
}
