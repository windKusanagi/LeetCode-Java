public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return -1;

        for (int i=0; i<=haystack.length()-needle.length(); i++){
            String temp = haystack.substring(i, i+needle.length());
            if(temp.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        ImplementStrStr solution = new ImplementStrStr();
        System.out.print(solution.strStr("abcdefg", "cd"));
    }
}
