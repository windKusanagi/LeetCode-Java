import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n < 1 )
            return res;

        ArrayList<Character> temp = new ArrayList<>();
        combination(n, 0, 0, temp, res);
        return res;
    }
    public void combination( int n , int left, int right, ArrayList<Character>temp , List<String>res){
        if (left == n && right==n ){
            char arr[] = new char[temp.size()];
            for (int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }
            res.add(String.valueOf(arr));
            return;
        }

        if (left < n ){
            temp.add('(');
            combination(n, left+1, right, temp, res);
            temp.remove(temp.size()-1);
        }

        if (left > right){
            temp.add(')');
            combination(n, left, right+1, temp, res);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String args[]){
        GenerateParentheses solution = new GenerateParentheses();
        List<String> res = solution.generateParenthesis(3);
        for (String item: res){
            System.out.print(item + "  ");
        }
    }
}
