class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int[] temp = Arrays.copyOf(nums1, m);
       int count1=0;
       int count2=0;
       for(int i=0;i<n+m;i++){
        if(count1<m && count2<n){
            if(nums2[count2]<temp[count1]){
                nums1[i]=nums2[count2];
                count2++;
            }
            else
            {
                nums1[i]=temp[count1];
                count1++;
            }

        }
        else
        {
          if(count1<m){
             nums1[i]=temp[count1];
                count1++;
          }
          else {
            
                nums1[i]=nums2[count2];
                count2++;
            
          }
        }
       }
        
    }
}
