class Solution {
    public void rotate(int[] nums, int k) {
        int[] t= new int[k];
         k = (k % nums.length);
        for(int i=0;i<k;i++){
           t[k-1-i]=nums[nums.length-i-1];
        }
        
        for(int j=nums.length-1;j>=k;j--){
            nums[j]=nums[j-k];
            
        }
        
        for(int i=0;i<k;i++){
            nums[i]=t[i];
        }
        
    }
}