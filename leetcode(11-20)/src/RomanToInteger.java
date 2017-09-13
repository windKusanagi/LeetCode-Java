import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> lookup= new HashMap<Character, Integer>() {{
            put('M' , 1000);
            put('D' , 500);
            put('C' , 100);
            put('L' , 50);
            put('X' , 10);
            put('V' , 5);
            put('I' , 1);
        }};
        res += lookup.get(s.charAt(0));
        for (int i=1; i<s.length(); i++){
            if(lookup.get(s.charAt(i)) > lookup.get(s.charAt(i-1))){
                res += lookup.get(s.charAt(i)) - 2*lookup.get(s.charAt(i-1)) ;
            }else {
                res += lookup.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String args[]){
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romanToInt("XCIX"));
        System.out.println(solution.romanToInt("III"));
    }
}
