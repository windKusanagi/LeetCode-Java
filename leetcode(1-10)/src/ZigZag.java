public class ZigZag {

    public String convert(String s, int nRows) {
        char str[] = s.toCharArray();
        int len = str.length;
        StringBuffer sb[] = new StringBuffer[nRows];
        for (int i=0; i<nRows; i++){
            sb[i] = new StringBuffer();
        }
        int index = 0;
        while (index<len) {
            for ( int i = 0; i < nRows && index<len ; i++ ){
                sb[i].append(s.charAt(index++));
            }
            for ( int j = nRows-2 ; j>=1 && index<len ; j--){
                sb[j].append(s.charAt(index++));
            }
        }
        StringBuffer res = new StringBuffer();

        for(int i=0; i<nRows; i++){
            res.append(sb[i]);
        }
        return res.toString();
    }

    public static void main(String args[]){
        ZigZag solution = new ZigZag();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
        System.out.println(solution.convert("PAYPALISHIRING", 4));
        System.out.println(solution.convert("PAYPALISHIRING", 5));

    }
}
