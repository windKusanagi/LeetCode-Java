import java.util.ArrayList;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        ArrayList<Character> left = new ArrayList<Character> ();
        left.add('('); left.add('{'); left.add('[');
        ArrayList<Character> right = new ArrayList<Character> ();
        right.add(')'); right.add('}'); right.add(']');
        ArrayList<Character> arr = new ArrayList<>();
        int len = s.length();
        for (int i=0; i<len ;i++){
            if(left.contains(s.charAt(i))){
                arr.add(s.charAt(i));
            }else{
                if(arr.size()==0){
                    return false;
                }else{
                    if(left.indexOf(arr.get(arr.size()-1)) != right.indexOf(s.charAt(i)) ){
                        return false;
                    }else{
                        arr.remove(arr.size()-1);
                    }
                }
            }
        }

        return arr.size()==0? true : false;
    }
    public static void main(String args[]){
        ValidParentheses solution = new ValidParentheses();
        String input1 = "()[]{}";
        String input2 = "([)]";
        String input3 = "([])";
        System.out.println(solution.isValid(input1));
        System.out.println(solution.isValid(input2));
        System.out.println(solution.isValid(input3));
    }
}
