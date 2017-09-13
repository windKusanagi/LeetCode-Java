import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> lookup = new HashMap<Character, Integer>();
        int start = -1;
        int maxLength = 0;
        for (int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if (lookup.containsKey(cur) && lookup.get(cur) > start){
                start = lookup.get(cur);
            }
            lookup.put(cur, i);
            maxLength = (i - start > maxLength)?  i - start: maxLength;
        }

        return maxLength;

    }

    public  static void  main (String args[]) {
        // String input = "dvdf";
        // String input = "bbbbbbb";
        // String input = "abcabcbb";
        String input = "abba";
        LongestSubstringWithoutRepeat solution = new LongestSubstringWithoutRepeat();
        int res = solution.lengthOfLongestSubstring(input);
        System.out.print(res);
    }

}
