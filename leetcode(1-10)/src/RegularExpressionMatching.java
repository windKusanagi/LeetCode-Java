public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i=1; i<n+1; i++){
            if(p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-2];
            }
        }
        for (int i=1; i<m+1; i++){
            for (int j=1; j<n+1; j++){
                if ( s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1) == '.'){
                    dp[i][j] = dp[i-1][j-1];
                }else if ( p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i][j-2];
                    if ( s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
                        dp[i][j] = dp[i-1][j] == true ? dp[i-1][j] : dp[i][j];
                    }
                }
            }
        }
        return dp[m][n];
    }

//    public boolean isMatch2(String s, String p) {
//        int m = s.length();
//        int n = p.length();
//        boolean dp[][] = new boolean[m+1][n+1];
//        dp[0][0] = true;
//        for ( int i =1; i<n+1; i++){
//            if (p.charAt(i-1) == '*'){
//                dp[0][i] = dp[0][i-2];
//            }
//        }
//        for (int i=1; i<m+1 ;i++){
//            for (int j=1; j<n+1; j++){
//                if(s.charAt(i-1) ==p.charAt(j-1) || p.charAt(j-1) == '.'){
//                    dp[i][j] = dp[i-1][j-1];
//                }else if (p.charAt(j-1) == '*'){
//                    dp[i][j] = dp[i][j - 2];
//                    if (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
//                        dp[i][j] = dp[i-1][j] == true? dp[i-1][j]: dp[i][j];
//                    }
//                }
//            }
//        }
//        return dp[m][n];
//    }

    public static void main(String args[]){
        RegularExpressionMatching solution = new RegularExpressionMatching();
        System.out.print(solution.isMatch("aaa", "a.a"));
    }
}
