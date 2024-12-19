class Solution {
    public String countAndSay(int n) {
        if(n==1 )
        return "1";
        String rl=countAndSay(n-1);
        return rle(rl);
        
    }
    String rle(String s){
        StringBuilder sb= new StringBuilder();
        int i=0;
        int t=0;
        while(i<s.length()){
            char c=s.charAt(i);
            t=1;
            
            while(i<s.length()-1 && c==s.charAt(i+1) ){
               t++;
               i++;
            }
            sb.append(t);
            sb.append(c);
            i++;

        }
        return sb.toString();

    }
}
