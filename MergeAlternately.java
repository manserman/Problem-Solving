class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder bld= new StringBuilder();
        int maxLength=Math.max(word1.length(),word2.length());
        int i=0;
        while(i<maxLength){
            if(i<word1.length())
            bld.append(word1.charAt(i));
             if(i<word2.length())
            bld.append(word2.charAt(i));
            i++;
        }
        return bld.toString();
        
    }
}
