import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> lookup = new HashMap<Character, String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
            put('0', "");
        }};
        ArrayList<String> res = new ArrayList<>();
        if(digits == null || digits.length()==0){
            return res;
        }
        ArrayList<Character> temp = new ArrayList<>();
        getString(digits, temp, res, lookup);
        return res;

    }

    public void getString( String digits, ArrayList<Character>temp, ArrayList<String>res, HashMap<Character, String>lookup) {
        if( digits.length()==0 ){
            char arr[] = new char [temp.size()];
            for( int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }
            res.add(String.valueOf(arr));

            return;
        }

        char curr = digits.substring(0,1).charAt(0);
        String set = lookup.get(curr);
        for (int i=0; i<set.length(); i++){
            temp.add(set.charAt(i));
            getString(digits.substring(1), temp, res, lookup);
            temp.remove(temp.size()-1);
        }
    }


    public static void main(String args[]) {
        LetterCombinationsPhoneNumber solution = new LetterCombinationsPhoneNumber();
        List<String>  res = solution.letterCombinations("23");
        solution.printList(res);
    }
    public void printList(List<String> list){
        for(String elem : list){
            System.out.println(elem+"  ");
        }
    }
}
