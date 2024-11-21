class Solution {
    public int searchInsert(int[] nums, int target) {
        int rigth=0;
        int left= nums.length -1;
        while (rigth = left) {
        int milieu = rigth + (left - rigth)  2;
       if(nums[milieu] == target)
       return milieu;
        if (nums[milieu] target) {
            rigth = milieu + 1;  
        } else {
            left = milieu - 1;  
        }
    }

    return rigth;
        
    }
}