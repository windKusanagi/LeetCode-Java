public class CountAndSay {
    public String countAndSay(int n) {
        if (n<1)
            return "";
        String result = "1";
        for (int i=1; i<n; i++){
            result = this.getNext(result);
        }
        return result;
    }

    private String getNext(String res){
        int i = 0;
        int count = 1;
        StringBuilder temp = new StringBuilder();

        while(i<res.length()){
            int next = i+1;
            if(next>res.length()-1){
                temp.append(count);
                temp.append(res.charAt(i));
                break;
            }else if(res.charAt(next) == res.charAt(i)){
                count++;
                i++;
            }else{
                temp.append(count);
                temp.append(res.charAt(i));
                count = 1;
                i++;
            }
        }
        return temp.toString();
    }

    public String countAndSay(int n) {
        if (n<1)
            return "";
        String result = "1";
        for(int i=1;i<n;i++){
            result = this.getNext(result);
        }
        return result;
    }
    public String getNext(String res){
        int i=0;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while(i<res.length()){
            int next = i+1;
            if(next>res.length()-1){
                sb.append(count);
                sb.append(res.charAt(i));
            }else if(res.charAt(next) == res.charAt(i)){
                count++;
                i++;
            }else{
                sb.append(count);
                sb.append(res.charAt(i));
                count = 1;
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        CountAndSay solution = new CountAndSay();
        for (int i=2; i <10 ;i++) {
            System.out.println(solution.countAndSay(i));
        }
    }
}
