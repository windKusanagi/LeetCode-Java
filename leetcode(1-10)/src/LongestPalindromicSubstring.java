public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s.length() <= 1)
            return s;

        int len = s.length();
        boolean P[][] = new boolean [len][len];
        int maxLen = 1;
        int start = 0;

        for (int j=0; j<len; j++){

            for (int i=0 ; i<j; i++) {
                if (s.charAt(j) == s.charAt(i) && (j == i + 1 || P[i + 1][j - 1])) {
                    P[i][j] = true;
                }

                if (P[i][j] && (j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    start = i;

                }
            }

            P[j][j] = true;
        }

        return s.substring(start, start + maxLen);

    }

    public static void main(String  args[]){
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        System.out.print(solution.longestPalindrome("abccda"));
    }
}
