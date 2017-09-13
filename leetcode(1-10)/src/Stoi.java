public class Stoi {
    public int myAtoi(String str) {
        if (str == null || str.length()==0 ){
            return 0;
        }

        str = str.trim();
        boolean flag = true;
        int i = 0;
        double res = 0;
        if(str.charAt(0)=='-'){
            flag = false;
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }

        while( i < str.length() && str.charAt(i)>='0' && str.charAt(i) <= '9'){
            res = res*10 + (str.charAt(i) - '0') ;
            i++;
        }
        if (!flag)
            res = - res;
        if ( res > Integer.MAX_VALUE ){
            return Integer.MAX_VALUE;
        }
        if ( res < Integer.MIN_VALUE ){
            return Integer.MIN_VALUE;
        }

        return (int) res;

    }

    public static void main(String args[]){
        Stoi solution = new Stoi();
        System.out.print(solution.myAtoi("9223372036854775809"));
    }

}
