public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String res = strs[0];
        int i=0;
        for( ;i<res.length(); i++){
            for(int j=0; j<strs.length; j++){
                if( i>strs[j].length()-1 || strs[j].charAt(i) != res.charAt(i) )
                    return res.substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String args[]){
        String input[] = new String[] {"hello", "heabc", "hewww"};
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.print(solution.longestCommonPrefix(input));

    }
}
