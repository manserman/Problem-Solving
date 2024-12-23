class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int nbZero=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]!=0){
            total*=nums[i];
            }
            else
            nbZero++;
             if(nbZero>1){
                total=0;
                break;
            }
        }
        int[] result= new int[nums.length];
         for(int i=0;i<nums.length;i++){
            int n=total;
           if(nbZero>=1){
            if(nums[i]!=0)
               n=0;
           }
           else
            n=total/nums[i];
            
            result[i]=n;
        }
        return result;
        
    }
}
