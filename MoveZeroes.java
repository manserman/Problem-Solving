class Solution {
    public void moveZeroes(int[] nums) {
        int position=0;
        int nbZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            { if(nbZero == 0 )
               position=i;
             nbZero++;
             }
            if(nbZero>0 && nums[i]!=0){
                nums[position]=nums[i];
                position++;
            }
        }
        if(nbZero>0)
        for(int i=position;i<nums.length;i++)
        nums[i]=0;
      
        
    }
}
