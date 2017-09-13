public class DivideTwoIntegers {
//    public int divide(int dividend, int divisor) {
//        int sign = 1;
//        if(divisor==-1 && dividend == Integer.MIN_VALUE)
//            return Integer.MAX_VALUE;
//        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
//            sign = -1;
//        long ldividend = Math.abs((long)dividend);
//        long ldivisor = Math.abs((long)divisor);
//
//
//
//        int res = 0;
//        while(ldividend >= ldivisor){
//            long temp = ldivisor;
//            int i = 1;
//            while (ldividend >= temp){
//                ldividend -= temp;
//                res += i;
//                i <<= 1;
//                temp <<= 1;
//            }
//
//        }
//        if(sign == 1){
//            return  res;
//        }else{
//            return -res;
//        }
//    }
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        if ( (dividend > 0 && divisor<0 ) || (dividend < 0 && divisor > 0) )
            sign = -1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        int res = 0;
        while (ldividend >= ldivisor){
            long temp = ldivisor, i = 1;
            while (ldividend >= temp){
                ldividend -= temp;
                res += i;
                i<<=1;
                temp<<=1;
            }
        }

        if(sign==1){
            return res;
        }else{
            return -res;
        }
    }

    public static void main(String argsp[]){
        DivideTwoIntegers solution = new DivideTwoIntegers();
        System.out.print(solution.divide(-2147483648 ,2));
    }

}
