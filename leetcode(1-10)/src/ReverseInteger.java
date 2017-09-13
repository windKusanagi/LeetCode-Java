public class ReverseInteger {
    public int reverse(int x) {
        long res = 0;
        while (x != 0){
            res = res*10 + Long.valueOf(x%10);
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }

    public static void main(String args[]){
        ReverseInteger solution = new ReverseInteger();
        System.out.print(solution.reverse(-123));
    }
}
