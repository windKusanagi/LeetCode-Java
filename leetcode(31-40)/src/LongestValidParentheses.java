import java.util.ArrayList;
import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s == null || s.length()==0)
            return 0;
        Stack stack = new Stack();
        stack.push(-1);
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(')
                stack.push(i);
            else{
                stack.pop();
                if( !stack.empty()){
                    res = Math.max(res, i- (int)stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        LongestValidParentheses solution = new LongestValidParentheses();
        System.out.print(solution.longestValidParentheses(")()()"));

    }
}
